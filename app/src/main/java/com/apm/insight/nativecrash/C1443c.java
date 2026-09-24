package com.apm.insight.nativecrash;

import com.apm.insight.C1373a;
import com.apm.insight.C1386c;
import com.apm.insight.p022l.C1434j;
import com.apm.insight.runtime.C1468j;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.apm.insight.nativecrash.c */
/* JADX INFO: compiled from: Tombstone.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1443c {

    /* JADX INFO: renamed from: i */
    private static final Pattern f775i = Pattern.compile("^pid:\\s(.*),\\stid:\\s(.*),\\sname:\\s(.*)\\s+>>>\\s(.*)\\s<<<$");

    /* JADX INFO: renamed from: j */
    private static final Pattern f776j = Pattern.compile("^signal\\s(.*),\\scode\\s(.*),\\sfault\\saddr\\s(.*)$");

    /* JADX INFO: renamed from: k */
    private static final Pattern f777k = Pattern.compile("^Abort message: (.*)$");

    /* JADX INFO: renamed from: l */
    private static final Pattern f778l = Pattern.compile("^Crash message: (.*)$");

    /* JADX INFO: renamed from: m */
    private static final Pattern f779m = Pattern.compile("^    \\/(\\w*)\\/.*\\/(.*\\.so)\\s\\(BuildId: ([a-f0-9]*)\\)$");

    /* JADX INFO: renamed from: a */
    private String f780a;

    /* JADX INFO: renamed from: b */
    private String f781b;

    /* JADX INFO: renamed from: c */
    private String f782c;

    /* JADX INFO: renamed from: d */
    private String f783d;

    /* JADX INFO: renamed from: e */
    private String f784e;

    /* JADX INFO: renamed from: f */
    private String f785f;

    /* JADX INFO: renamed from: g */
    private String f786g;

    /* JADX INFO: renamed from: h */
    private Map<String, String> f787h = new HashMap();

    public C1443c(File file) {
        m1519c(C1434j.m1374b(file));
    }

    /* JADX INFO: renamed from: c */
    private void m1519c(File file) {
        if (!file.exists() || file.length() == 0) {
            return;
        }
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            int i = 0;
            while (true) {
                try {
                    String line = bufferedReader2.readLine();
                    if (line == null || i >= 64) {
                        break;
                    }
                    if (this.f780a == null && line.startsWith("pid: ")) {
                        Matcher matcher = f775i.matcher(line);
                        if (matcher.find() && matcher.groupCount() == 4) {
                            this.f780a = matcher.group(1);
                            this.f781b = matcher.group(2);
                            this.f783d = matcher.group(3);
                            this.f782c = matcher.group(4);
                        }
                    } else if (this.f784e == null && line.startsWith("signal ")) {
                        Matcher matcher2 = f776j.matcher(line);
                        if (matcher2.find() && matcher2.groupCount() == 3) {
                            String strReplace = matcher2.group(1).replace(" ", "");
                            String strReplace2 = matcher2.group(2).replace(" ", "");
                            int iIndexOf = strReplace2.indexOf("frompid");
                            if (iIndexOf > 0) {
                                strReplace2 = strReplace2.substring(0, iIndexOf) + ")";
                            }
                            this.f784e = "Signal " + strReplace + ", Code " + strReplace2 + "\n";
                        }
                    } else if (this.f785f == null && line.startsWith("Abort ")) {
                        Matcher matcher3 = f777k.matcher(line);
                        if (matcher3.find() && matcher3.groupCount() == 1) {
                            this.f785f = "abort message: " + matcher3.group(1) + "\n";
                        }
                    } else if (this.f785f == null && line.startsWith("Crash ")) {
                        Matcher matcher4 = f778l.matcher(line);
                        if (matcher4.find() && matcher4.groupCount() == 1) {
                            this.f785f = "crash message: " + matcher4.group(1) + "\n";
                        }
                    } else if (this.f786g == null && line.startsWith("backtrace:")) {
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String line2 = bufferedReader2.readLine();
                            if (line2 == null || !line2.startsWith("    #")) {
                                break;
                            }
                            sb.append(line2.substring(4));
                            sb.append('\n');
                        }
                        i++;
                        this.f786g = sb.toString();
                    } else if (this.f787h.isEmpty() && line.startsWith("build id:")) {
                        while (true) {
                            String line3 = bufferedReader2.readLine();
                            if (line3 == null || !line3.contains("BuildId:")) {
                                break;
                            }
                            Matcher matcher5 = f779m.matcher(line3);
                            if (matcher5.find()) {
                                String strGroup = matcher5.group(1);
                                String strGroup2 = matcher5.group(2);
                                String strGroup3 = matcher5.group(3);
                                if (strGroup.equals("data")) {
                                    this.f787h.put(strGroup2, strGroup3);
                                }
                            }
                        }
                    }
                    i++;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    try {
                        C1386c.m990a();
                        C1468j.m1652a(th, "NPTH_CATCH");
                        return;
                    } finally {
                        C1373a.m860a((Closeable) bufferedReader);
                    }
                }
            }
            C1373a.m860a((Closeable) bufferedReader2);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m1520a() {
        return this.f786g;
    }

    /* JADX INFO: renamed from: a */
    public final void m1521a(File file) {
        File fileM1374b = C1434j.m1374b(file);
        if (fileM1374b.exists()) {
            fileM1374b.renameTo(new File(fileM1374b.getAbsoluteFile() + ".old"));
        }
        NativeImpl.m1451a(file);
        m1519c(C1434j.m1374b(file));
    }

    /* JADX INFO: renamed from: b */
    public final Map<String, String> m1522b() {
        return this.f787h;
    }

    /* JADX INFO: renamed from: b */
    public final void m1523b(File file) {
        m1519c(C1434j.m1374b(file));
    }

    /* JADX INFO: renamed from: c */
    public final String m1524c() {
        StringBuilder sb = new StringBuilder();
        String str = this.f784e;
        if (str != null) {
            sb.append(str);
        }
        String str2 = this.f785f;
        if (str2 != null) {
            sb.append(str2);
        }
        String str3 = this.f786g;
        if (str3 != null) {
            sb.append(str3);
        }
        return sb.toString();
    }
}

package com.mbridge.msdk.config.component.common.file;

import android.net.Uri;
import android.text.TextUtils;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mbridge.msdk.config.component.database.C12771a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13188c1;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.vungle.ads.internal.model.AdPayload;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.file.a */
/* JADX INFO: compiled from: ComponentFileUtil.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12752a {
    /* JADX INFO: renamed from: a */
    public static C12753b m35047a(String str, int i, String str2) {
        C12753b c12753b;
        C12753b c12753b2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String strM35055d = m35055d(str);
            String strM35057f = m35057f(str);
            c12753b = new C12753b();
            try {
                c12753b.m35064a(m35048a());
                c12753b.m35069c(strM35055d);
                if (!strM35055d.contains("mp4")) {
                    strM35057f = strM35057f.concat(strM35055d);
                }
                c12753b.m35067b(strM35057f);
                if (strM35055d.contains("zip")) {
                    c12753b.m35071d(m35061j(str));
                    String strM35051b = m35051b(str, i, str2);
                    c12753b.m35065a(m35052b(strM35051b));
                    c12753b.m35072e(strM35051b);
                } else {
                    c12753b.m35065a(m35052b(c12753b.m35063a()));
                }
            } catch (Throwable th) {
                th = th;
                c12753b2 = c12753b;
                C13219q0.m37816b("ComponentFileUtil", th.getMessage());
                c12753b = c12753b2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        if (c12753b != null) {
            m35050a(c12753b.m35063a());
        }
        return c12753b;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x014d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x013b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static boolean m35053b(String str, String str2) throws Throwable {
        Throwable th;
        InputStream inputStream;
        IOException iOException;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        IOException e;
        Throwable th2;
        String canonicalPath;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        FileOutputStream fileOutputStream2 = null;
        InputStream inputStream3 = null;
        FileOutputStream fileOutputStream3 = null;
        try {
            ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            FileOutputStream fileOutputStream4 = null;
            while (enumerationEntries.hasMoreElements()) {
                try {
                    try {
                        ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                        if (zipEntryNextElement == null) {
                            if (inputStream3 != null) {
                                try {
                                    inputStream3.close();
                                } catch (IOException e2) {
                                    C13219q0.m37817b("ComponentFileUtil", "unzip error", e2);
                                }
                            }
                            if (fileOutputStream4 != null) {
                                try {
                                    fileOutputStream4.close();
                                } catch (IOException e3) {
                                    C13219q0.m37817b("ComponentFileUtil", "unzip error", e3);
                                }
                            }
                            return false;
                        }
                        String name = zipEntryNextElement.getName();
                        if (!TextUtils.isEmpty(name) && !name.startsWith("..") && !name.startsWith("../")) {
                            File file2 = new File(str2 + name);
                            try {
                                canonicalPath = file2.getCanonicalPath();
                            } catch (IOException unused) {
                                canonicalPath = "";
                            }
                            if (!TextUtils.isEmpty(canonicalPath) && !canonicalPath.startsWith("..") && !canonicalPath.startsWith("../")) {
                                if (zipEntryNextElement.isDirectory()) {
                                    file2.mkdirs();
                                } else {
                                    if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                                        file2.getParentFile().mkdirs();
                                    }
                                    fileOutputStream = new FileOutputStream(file2);
                                    try {
                                        inputStream3 = zipFile.getInputStream(zipEntryNextElement);
                                        byte[] bArr = new byte[1024];
                                        while (true) {
                                            int i = inputStream3.read(bArr, 0, 1024);
                                            if (i == -1) {
                                                break;
                                            }
                                            fileOutputStream.write(bArr, 0, i);
                                            fileOutputStream.flush();
                                        }
                                        fileOutputStream4 = fileOutputStream;
                                    } catch (IOException e4) {
                                        e = e4;
                                        try {
                                            C13219q0.m37817b("ComponentFileUtil", "unzip error", e);
                                            if (inputStream3 != null) {
                                                try {
                                                    inputStream3.close();
                                                } catch (IOException e5) {
                                                    C13219q0.m37817b("ComponentFileUtil", "unzip error", e5);
                                                }
                                            }
                                            if (fileOutputStream != null) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (IOException e6) {
                                                    C13219q0.m37817b("ComponentFileUtil", "unzip error", e6);
                                                }
                                            }
                                            return false;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            inputStream = inputStream3;
                                            fileOutputStream2 = fileOutputStream;
                                            fileOutputStream = fileOutputStream2;
                                            inputStream3 = inputStream;
                                            th2 = th;
                                            if (inputStream3 != null) {
                                                try {
                                                    inputStream3.close();
                                                } catch (IOException e7) {
                                                    C13219q0.m37817b("ComponentFileUtil", "unzip error", e7);
                                                }
                                            }
                                            if (fileOutputStream == null) {
                                                throw th2;
                                            }
                                            try {
                                                fileOutputStream.close();
                                                throw th2;
                                            } catch (IOException e8) {
                                                C13219q0.m37817b("ComponentFileUtil", "unzip error", e8);
                                                throw th2;
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        th2 = th4;
                                        if (inputStream3 != null) {
                                            inputStream3.close();
                                        }
                                        if (fileOutputStream == null) {
                                            throw th2;
                                        }
                                        fileOutputStream.close();
                                        throw th2;
                                    }
                                }
                            }
                            if (inputStream3 != null) {
                                try {
                                    inputStream3.close();
                                } catch (IOException e9) {
                                    C13219q0.m37817b("ComponentFileUtil", "unzip error", e9);
                                }
                            }
                            if (fileOutputStream4 != null) {
                                try {
                                    fileOutputStream4.close();
                                } catch (IOException e10) {
                                    C13219q0.m37817b("ComponentFileUtil", "unzip error", e10);
                                }
                            }
                            return false;
                        }
                        if (inputStream3 != null) {
                            try {
                                inputStream3.close();
                            } catch (IOException e11) {
                                C13219q0.m37817b("ComponentFileUtil", "unzip error", e11);
                            }
                        }
                        if (fileOutputStream4 != null) {
                            try {
                                fileOutputStream4.close();
                            } catch (IOException e12) {
                                C13219q0.m37817b("ComponentFileUtil", "unzip error", e12);
                            }
                        }
                        return false;
                    } catch (Throwable th5) {
                        th = th5;
                        inputStream = inputStream3;
                        fileOutputStream2 = fileOutputStream4;
                        fileOutputStream = fileOutputStream2;
                        inputStream3 = inputStream;
                        th2 = th;
                        if (inputStream3 != null) {
                            inputStream3.close();
                        }
                        if (fileOutputStream == null) {
                            throw th2;
                        }
                        fileOutputStream.close();
                        throw th2;
                    }
                } catch (IOException e13) {
                    iOException = e13;
                    inputStream2 = inputStream3;
                    fileOutputStream3 = fileOutputStream4;
                    fileOutputStream = fileOutputStream3;
                    inputStream3 = inputStream2;
                    e = iOException;
                    C13219q0.m37817b("ComponentFileUtil", "unzip error", e);
                    if (inputStream3 != null) {
                        inputStream3.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    return false;
                }
            }
            zipFile.close();
            if (inputStream3 != null) {
                try {
                    inputStream3.close();
                } catch (IOException e14) {
                    C13219q0.m37817b("ComponentFileUtil", "unzip error", e14);
                }
            }
            if (fileOutputStream4 == null) {
                return true;
            }
            try {
                fileOutputStream4.close();
                return true;
            } catch (IOException e15) {
                C13219q0.m37817b("ComponentFileUtil", "unzip error", e15);
                return true;
            }
        } catch (IOException e16) {
            iOException = e16;
            inputStream2 = null;
        } catch (Throwable th6) {
            th = th6;
            inputStream = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m35054c(String str) {
        String strHexEncode = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        File file = new File(str);
        if (file.exists() && file.length() > 0) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i == -1) {
                            strHexEncode = SameMD5.hexEncode(messageDigest.digest());
                            messageDigest.reset();
                            fileInputStream.close();
                            return strHexEncode;
                        }
                        messageDigest.update(bArr, 0, i);
                        C13219q0.m37816b("ComponentFileUtil", th.getMessage());
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                C13219q0.m37816b("ComponentFileUtil", th3.getMessage());
            }
        }
        return strHexEncode;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    /* JADX INFO: renamed from: d */
    public static String m35055d(String str) {
        String str2;
        String str3 = "";
        try {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            if (TextUtils.isEmpty(lastPathSegment)) {
                str2 = "";
            } else {
                String[] strArrSplit = lastPathSegment.split("\\.");
                if (strArrSplit.length > 0) {
                    str2 = strArrSplit[strArrSplit.length - 1];
                } else {
                    str2 = "";
                }
            }
            try {
                return TextUtils.isEmpty(str2) ? "" : ".".concat(str2);
            } catch (Throwable th) {
                str3 = str2;
                th = th;
                C13219q0.m37816b("ComponentFileUtil", th.getMessage());
                return str3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: e */
    public static C12753b m35056e(String str) {
        return m35047a(str, 0, null);
    }

    /* JADX INFO: renamed from: g */
    public static String m35058g(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return m35048a() + RemoteSettings.FORWARD_SLASH_STRING + m35057f(str) + RemoteSettings.FORWARD_SLASH_STRING;
    }

    /* JADX INFO: renamed from: h */
    private static String m35059h(String str) {
        List<String> queryParameters;
        if (!TextUtils.isEmpty(str) && (queryParameters = Uri.parse(str).getQueryParameters("filename")) != null && !queryParameters.isEmpty()) {
            String str2 = queryParameters.get(0);
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: j */
    public static String m35061j(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strM35048a = m35048a();
        String strM35057f = m35057f(str);
        String strM35060i = m35060i(str);
        if (!TextUtils.isEmpty(strM35060i)) {
            String str2 = strM35048a + strM35057f + RemoteSettings.FORWARD_SLASH_STRING + strM35060i + RemoteSettings.FORWARD_SLASH_STRING;
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m35062k(String str) {
        C12771a.m35212a().m35216c("UPDATE FileDB SET touchTime=" + System.currentTimeMillis() + " WHERE filePath='" + str + "'");
    }

    /* JADX INFO: renamed from: f */
    public static String m35057f(String str) {
        return !TextUtils.isEmpty(str) ? SameMD5.getMD5(C13188c1.m37646b(str.trim())) : "";
    }

    /* JADX INFO: renamed from: i */
    private static String m35060i(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                Uri uri = Uri.parse(str);
                List<String> queryParameters = uri.getQueryParameters(ResourceManager.KEY_INDEX_HTML);
                if (queryParameters != null && !queryParameters.isEmpty()) {
                    return queryParameters.get(0);
                }
                String path = uri.getPath();
                if (!TextUtils.isEmpty(path)) {
                    String strSubstring = path.substring(path.lastIndexOf(47) + 1);
                    if (!TextUtils.isEmpty(strSubstring)) {
                        return strSubstring.replace(".zip", "");
                    }
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: a */
    public static String m35048a() {
        File file = new File(C13008c.m36588n().m36542d().getFilesDir(), "mbCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath().concat(File.separator);
    }

    /* JADX INFO: renamed from: a */
    private static void m35050a(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (!file.exists() || file.length() <= 0) {
            return;
        }
        C13167a.m37543b().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.common.file.a$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C12752a.m35062k(str);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static String m35049a(String str, String str2) {
        String str3 = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strSubstring = str.substring(str.indexOf("?") + 1);
        if (!TextUtils.isEmpty(strSubstring)) {
            str3 = "?" + strSubstring;
        }
        return AdPayload.FILE_SCHEME + str2 + str3;
    }

    /* JADX INFO: renamed from: b */
    private static String m35051b(String str, int i, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strM35061j = m35061j(str);
        String strM35060i = m35060i(str);
        String strM35059h = m35059h(str);
        if (!TextUtils.isEmpty(strM35060i)) {
            if (i == 0) {
                return strM35061j + strM35060i + RemoteSettings.FORWARD_SLASH_STRING + strM35059h;
            }
            if (i == 1) {
                return strM35061j + strM35060i + ".html";
            }
            if (i == 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(strM35061j);
                if (!TextUtils.isEmpty(strM35059h)) {
                    strM35060i = strM35059h;
                }
                sb.append(strM35060i);
                sb.append("_");
                if (str2.equals("0")) {
                    str2 = "";
                }
                sb.append(str2);
                sb.append(".xml");
                return sb.toString();
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: b */
    private static boolean m35052b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return new File(str).exists();
        } catch (Throwable th) {
            C13219q0.m37817b("ComponentFileUtil", th.getMessage(), th);
        }
    }
}

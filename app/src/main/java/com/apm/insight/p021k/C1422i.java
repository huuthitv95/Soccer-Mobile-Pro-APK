package com.apm.insight.p021k;

import com.apm.insight.MonitorCrash;
import com.apm.insight.p022l.C1430f;
import com.google.common.net.HttpHeaders;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.apm.insight.k.i */
/* JADX INFO: compiled from: MultipartUtility.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1422i {

    /* JADX INFO: renamed from: a */
    private final String f698a;

    /* JADX INFO: renamed from: b */
    private HttpURLConnection f699b;

    /* JADX INFO: renamed from: c */
    private String f700c;

    /* JADX INFO: renamed from: d */
    private boolean f701d;

    /* JADX INFO: renamed from: e */
    private C1419f f702e;

    /* JADX INFO: renamed from: f */
    private C1424k f703f;

    public C1422i(String str, String str2, boolean z) throws IOException {
        this.f700c = str2;
        this.f701d = z;
        String str3 = "AAA" + System.currentTimeMillis() + "AAA";
        this.f698a = str3;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f699b = httpURLConnection;
        httpURLConnection.setUseCaches(false);
        this.f699b.setDoOutput(true);
        this.f699b.setDoInput(true);
        this.f699b.setRequestMethod("POST");
        if (MonitorCrash.mCustomRequestHeader != null) {
            MonitorCrash.mCustomRequestHeader.addRequestHeader(this.f699b);
        }
        this.f699b.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + str3);
        if (!z) {
            this.f702e = new C1419f(this.f699b.getOutputStream());
        } else {
            this.f699b.setRequestProperty(HttpHeaders.CONTENT_ENCODING, "gzip");
            this.f703f = new C1424k(this.f699b.getOutputStream());
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m1269a() throws IOException {
        ArrayList arrayList = new ArrayList();
        byte[] bytes = ("\r\n--" + this.f698a + "--\r\n").getBytes();
        if (this.f701d) {
            this.f703f.write(bytes);
            this.f703f.m1285b();
            this.f703f.m1284a();
        } else {
            this.f702e.write(bytes);
            this.f702e.flush();
            this.f702e.m1253a();
        }
        int responseCode = this.f699b.getResponseCode();
        if (responseCode != 200) {
            throw new IOException("Server returned non-OK status: ".concat(String.valueOf(responseCode)));
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f699b.getInputStream()));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            arrayList.add(line);
        }
        bufferedReader.close();
        this.f699b.disconnect();
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public final void m1270a(String str, File file, Map<String, String> map) throws IOException {
        String name = file.getName();
        StringBuilder sb = new StringBuilder("--");
        sb.append(this.f698a);
        sb.append("\r\nContent-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"; filename=\"");
        sb.append(name);
        sb.append("\"");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append("; ");
            sb.append(entry.getKey());
            sb.append("=\"");
            sb.append(entry.getValue());
            sb.append("\"");
        }
        sb.append("\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.f701d) {
            this.f703f.write(sb.toString().getBytes());
        } else {
            this.f702e.write(sb.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[8192];
        while (true) {
            int i = fileInputStream.read(bArr);
            if (i == -1) {
                break;
            } else if (this.f701d) {
                this.f703f.write(bArr, 0, i);
            } else {
                this.f702e.write(bArr, 0, i);
            }
        }
        fileInputStream.close();
        if (this.f701d) {
            this.f703f.write("\r\n".getBytes());
        } else {
            this.f702e.write("\r\n".getBytes());
            this.f702e.flush();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1271a(String str, String str2) {
        m1273b(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public final void m1272a(String str, File... fileArr) throws IOException {
        StringBuilder sb = new StringBuilder("--");
        sb.append(this.f698a);
        sb.append("\r\nContent-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"; filename=\"");
        sb.append(str);
        sb.append("\"\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.f701d) {
            this.f703f.write(sb.toString().getBytes());
        } else {
            this.f702e.write(sb.toString().getBytes());
        }
        if (this.f701d) {
            C1430f.m1331a(this.f703f, fileArr);
        } else {
            C1430f.m1331a(this.f702e, fileArr);
        }
        if (this.f701d) {
            this.f703f.write("\r\n".getBytes());
        } else {
            this.f702e.write("\r\n".getBytes());
            this.f702e.flush();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1273b(String str, String str2) {
        StringBuilder sb = new StringBuilder("--");
        sb.append(this.f698a);
        sb.append("\r\nContent-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"\r\nContent-Type: text/plain; charset=");
        sb.append(this.f700c);
        sb.append("\r\n\r\n");
        try {
            if (this.f701d) {
                this.f703f.write(sb.toString().getBytes());
            } else {
                this.f702e.write(sb.toString().getBytes());
            }
        } catch (IOException unused) {
        }
        byte[] bytes = str2.getBytes();
        try {
            if (this.f701d) {
                this.f703f.write(bytes);
                this.f703f.write("\r\n".getBytes());
            } else {
                this.f702e.write(bytes);
                this.f702e.write("\r\n".getBytes());
            }
        } catch (IOException unused2) {
        }
    }
}

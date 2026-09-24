package com.bytedance.adsdk.p065lr.p072ka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ka.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2121ri implements InterfaceC2118ka, AutoCloseable {

    /* JADX INFO: renamed from: ri */
    private final HttpURLConnection f5114ri;

    public C2121ri(HttpURLConnection httpURLConnection) {
        this.f5114ri = httpURLConnection;
    }

    /* JADX INFO: renamed from: ri */
    private String m7006ri(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f5114ri.disconnect();
    }

    @Override // com.bytedance.adsdk.p065lr.p072ka.InterfaceC2118ka
    /* JADX INFO: renamed from: ik */
    public String mo6996ik() {
        return this.f5114ri.getContentType();
    }

    @Override // com.bytedance.adsdk.p065lr.p072ka.InterfaceC2118ka
    /* JADX INFO: renamed from: ka */
    public String mo6997ka() {
        try {
            if (mo6999ri()) {
                return null;
            }
            return "Unable to fetch " + this.f5114ri.getURL() + ". Failed with " + this.f5114ri.getResponseCode() + "\n" + m7006ri(this.f5114ri);
        } catch (IOException e) {
            return e.getMessage();
        }
    }

    @Override // com.bytedance.adsdk.p065lr.p072ka.InterfaceC2118ka
    /* JADX INFO: renamed from: lr */
    public InputStream mo6998lr() throws IOException {
        return this.f5114ri.getInputStream();
    }

    @Override // com.bytedance.adsdk.p065lr.p072ka.InterfaceC2118ka
    /* JADX INFO: renamed from: ri */
    public boolean mo6999ri() {
        try {
            return this.f5114ri.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }
}

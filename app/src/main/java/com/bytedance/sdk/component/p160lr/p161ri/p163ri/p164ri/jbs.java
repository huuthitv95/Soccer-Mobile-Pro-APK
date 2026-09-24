package com.bytedance.sdk.component.p160lr.p161ri.p163ri.p164ri;

import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2672vr;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes3.dex */
public class jbs extends AbstractC2672vr {

    /* JADX INFO: renamed from: lr */
    InputStream f7583lr;

    /* JADX INFO: renamed from: ri */
    HttpURLConnection f7584ri;

    jbs(HttpURLConnection httpURLConnection) throws IOException {
        this.f7584ri = httpURLConnection;
        this.f7583lr = new xha(httpURLConnection.getInputStream(), httpURLConnection);
    }

    jbs(HttpURLConnection httpURLConnection, InputStream inputStream) {
        this.f7584ri = httpURLConnection;
        this.f7583lr = new xha(inputStream, httpURLConnection);
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.AbstractC2672vr, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f7583lr.close();
            this.f7584ri.disconnect();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.AbstractC2672vr
    /* JADX INFO: renamed from: fi */
    public com.bytedance.sdk.component.p160lr.p161ri.jbs mo9981fi() {
        if (this.f7584ri.getContentType() != null) {
            return com.bytedance.sdk.component.p160lr.p161ri.jbs.m9914ri(this.f7584ri.getContentType());
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.AbstractC2672vr
    /* JADX INFO: renamed from: ik */
    public InputStream mo9982ik() {
        return this.f7583lr;
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.AbstractC2672vr
    /* JADX INFO: renamed from: ka */
    public byte[] mo9983ka() {
        try {
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i = this.f7583lr.read(bArr);
                if (i == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.AbstractC2672vr
    /* JADX INFO: renamed from: lr */
    public String mo9984lr() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f7583lr));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    String string = stringBuffer.toString();
                    close();
                    return string;
                }
                stringBuffer.append(line + "\n");
            }
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.AbstractC2672vr
    /* JADX INFO: renamed from: ri */
    public long mo9985ri() {
        try {
            return this.f7584ri.getContentLength();
        } catch (Exception unused) {
            return 0L;
        }
    }
}

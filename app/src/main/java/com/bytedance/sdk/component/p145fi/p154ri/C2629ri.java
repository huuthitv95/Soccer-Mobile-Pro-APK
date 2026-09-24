package com.bytedance.sdk.component.p145fi.p154ri;

import android.util.Log;
import com.bytedance.sdk.component.p145fi.InterfaceC2594fi;
import com.bytedance.sdk.component.p145fi.InterfaceC2596ka;
import com.bytedance.sdk.component.utils.C2725qt;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.sdk.component.fi.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2629ri implements InterfaceC2596ka<C2626ik> {
    /* JADX INFO: renamed from: ri */
    private Map<String, String> m9739ri(HttpURLConnection httpURLConnection) {
        HashMap map = new HashMap();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        for (String str : headerFields.keySet()) {
            List<String> list = headerFields.get(str);
            if (list != null && list.size() > 0) {
                map.put(str, list.get(0));
            }
        }
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.io.ByteArrayOutputStream, java.io.Closeable] */
    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2596ka
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public C2626ik<byte[]> mo9572ri(InterfaceC2594fi interfaceC2594fi) throws Throwable {
        InputStream inputStream;
        byte[] byteArray;
        ?? byteArrayOutputStream;
        String message;
        ?? r6;
        InputStream inputStream2 = null;
        Map<String, String> mapM9739ri = null;
        int i = 0;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(interfaceC2594fi.mo9566ri()).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.connect();
                inputStream = httpURLConnection.getInputStream();
                try {
                    byte[] bArr = new byte[1024];
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        while (true) {
                            try {
                                int i2 = inputStream.read(bArr);
                                if (i2 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i2);
                            } catch (MalformedURLException e) {
                                e = e;
                                byteArray = null;
                            } catch (IOException e2) {
                                e = e2;
                                byteArray = null;
                            }
                            Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                            message = e.getMessage();
                            r6 = byteArrayOutputStream;
                            C2725qt.m10269ri(inputStream);
                            C2725qt.m10269ri(r6);
                            return new C2626ik<>(i, byteArray, message, mapM9739ri);
                        }
                        mapM9739ri = interfaceC2594fi.mo9565lr() ? m9739ri(httpURLConnection) : null;
                        C2725qt.m10269ri(inputStream);
                        C2725qt.m10269ri(byteArrayOutputStream);
                        message = "success";
                    } catch (MalformedURLException e3) {
                        e = e3;
                        Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                        message = e.getMessage();
                        r6 = byteArrayOutputStream;
                        C2725qt.m10269ri(inputStream);
                        C2725qt.m10269ri(r6);
                    } catch (IOException e4) {
                        e = e4;
                        Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                        message = e.getMessage();
                        r6 = byteArrayOutputStream;
                        C2725qt.m10269ri(inputStream);
                        C2725qt.m10269ri(r6);
                    }
                    i = 200;
                    byteArray = byteArrayOutputStream.toByteArray();
                } catch (MalformedURLException e5) {
                    e = e5;
                    byteArray = null;
                    byteArrayOutputStream = byteArray;
                } catch (IOException e6) {
                    e = e6;
                    byteArray = null;
                    byteArrayOutputStream = byteArray;
                    Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                    message = e.getMessage();
                    r6 = byteArrayOutputStream;
                    C2725qt.m10269ri(inputStream);
                    C2725qt.m10269ri(r6);
                    return new C2626ik<>(i, byteArray, message, mapM9739ri);
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    C2725qt.m10269ri(inputStream2);
                    C2725qt.m10269ri(0);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (MalformedURLException e7) {
            e = e7;
            inputStream = null;
            byteArray = null;
        } catch (IOException e8) {
            e = e8;
            inputStream = null;
            byteArray = null;
        } catch (Throwable th3) {
            th = th3;
            C2725qt.m10269ri(inputStream2);
            C2725qt.m10269ri(0);
            throw th;
        }
        return new C2626ik<>(i, byteArray, message, mapM9739ri);
    }
}

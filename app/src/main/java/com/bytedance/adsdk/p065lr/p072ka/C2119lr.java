package com.bytedance.adsdk.p065lr.p072ka;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ka.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2119lr implements InterfaceC2115di {
    @Override // com.bytedance.adsdk.p065lr.p072ka.InterfaceC2115di
    /* JADX INFO: renamed from: ri */
    public InterfaceC2118ka mo6994ri(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new C2121ri(httpURLConnection);
    }
}

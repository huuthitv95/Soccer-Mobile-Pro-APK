package com.chartboost.sdk.impl;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.od */
/* JADX INFO: loaded from: classes3.dex */
public class C3962od {
    /* JADX INFO: renamed from: a */
    public HttpsURLConnection m18923a(AbstractC3654b3 request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        URLConnection uRLConnectionOpenConnection = new URL(request.m16895e()).openConnection();
        HttpsURLConnection httpsURLConnection = uRLConnectionOpenConnection instanceof HttpsURLConnection ? (HttpsURLConnection) uRLConnectionOpenConnection : null;
        if (httpsURLConnection != null) {
            return httpsURLConnection;
        }
        throw new IOException("Invalid URL");
    }
}

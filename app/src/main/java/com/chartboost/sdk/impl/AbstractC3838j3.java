package com.chartboost.sdk.impl;

import android.os.Build;
import com.chartboost.sdk.internal.Networking.NetworkHelper;
import java.security.KeyManagementException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.j3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3838j3 {

    /* JADX INFO: renamed from: a */
    public static final a f14864a = new a(null);

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.j3$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final SSLSocketFactory m18183a() throws KeyManagementException {
            SSLContext sSLContext = Build.VERSION.SDK_INT >= 29 ? SSLContext.getInstance("TLSv1.3") : SSLContext.getInstance("TLSv1.2");
            if (NetworkHelper.m20163a()) {
                sSLContext.init(null, new X509TrustManager[]{C3851jg.m18284c()}, null);
            } else {
                sSLContext.init(null, null, null);
            }
            sSLContext.createSSLEngine();
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getSocketFactory(...)");
            return socketFactory;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final SSLSocketFactory m18182a() {
        return f14864a.m18183a();
    }
}

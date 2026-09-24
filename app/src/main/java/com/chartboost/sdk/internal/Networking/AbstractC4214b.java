package com.chartboost.sdk.internal.Networking;

import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.internal.Networking.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4214b {

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.Networking.b$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f17178a;

        static {
            int[] iArr = new int[EndpointRepository.EndPoint.values().length];
            try {
                iArr[EndpointRepository.EndPoint.BANNER_GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f17178a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final String m20170a(EndpointRepository.EndPoint endPoint) {
        Intrinsics.checkNotNullParameter(endPoint, "<this>");
        return a.f17178a[endPoint.ordinal()] == 1 ? EndpointRepository.EnumC4212a.DA.m20162b() : EndpointRepository.EnumC4212a.AD_GET.m20162b();
    }

    /* JADX INFO: renamed from: a */
    public static final String m20171a(URL url) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        return url.getProtocol() + "://" + url.getHost();
    }

    /* JADX INFO: renamed from: b */
    public static final URL m20172b(EndpointRepository.EndPoint endPoint) {
        Intrinsics.checkNotNullParameter(endPoint, "<this>");
        return new URL("https", m20170a(endPoint), endPoint.getDefaultValue());
    }
}

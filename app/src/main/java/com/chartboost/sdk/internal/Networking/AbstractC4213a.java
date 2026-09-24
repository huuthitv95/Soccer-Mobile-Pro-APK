package com.chartboost.sdk.internal.Networking;

import com.chartboost.sdk.impl.C3920mg;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.net.URL;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.internal.Networking.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4213a implements EndpointRepository {

    /* JADX INFO: renamed from: a */
    public final C3920mg f17176a;

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.Networking.a$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f17177a;

        static {
            int[] iArr = new int[EndpointRepository.EndPoint.values().length];
            try {
                iArr[EndpointRepository.EndPoint.INTERSTITIAL_GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EndpointRepository.EndPoint.REWARDED_GET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EndpointRepository.EndPoint.PREFETCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f17177a = iArr;
        }
    }

    public AbstractC4213a(C3920mg sdkConfiguration) {
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        this.f17176a = sdkConfiguration;
    }

    /* JADX INFO: renamed from: a */
    public final URL m20168a(EndpointRepository.EndPoint endPoint) {
        int i = a.f17177a[endPoint.ordinal()];
        if (i == 1) {
            String str = String.format("webview/%s/interstitial/get", Arrays.copyOf(new Object[]{this.f17176a.f15393y}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return m20169a(endPoint, str);
        }
        if (i == 2) {
            String str2 = String.format("webview/%s/reward/get", Arrays.copyOf(new Object[]{this.f17176a.f15393y}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            return m20169a(endPoint, str2);
        }
        if (i != 3) {
            return null;
        }
        String webviewPrefetchEndpoint = this.f17176a.f15394z;
        Intrinsics.checkNotNullExpressionValue(webviewPrefetchEndpoint, "webviewPrefetchEndpoint");
        return m20169a(endPoint, webviewPrefetchEndpoint);
    }

    /* JADX INFO: renamed from: a */
    public final URL m20169a(EndpointRepository.EndPoint endPoint, String str) {
        return new URL("https", AbstractC4214b.m20170a(endPoint), RemoteSettings.FORWARD_SLASH_STRING + str);
    }

    @Override // com.chartboost.sdk.internal.Networking.EndpointRepository
    public URL getEndPointUrl(EndpointRepository.EndPoint endPoint) {
        Intrinsics.checkNotNullParameter(endPoint, "endPoint");
        URL urlM20168a = m20168a(endPoint);
        return urlM20168a == null ? AbstractC4214b.m20172b(endPoint) : urlM20168a;
    }

    @Override // com.chartboost.sdk.internal.Networking.EndpointRepository
    public void restoreDefaults() {
    }

    @Override // com.chartboost.sdk.internal.Networking.EndpointRepository
    public void setEndpoint(EndpointRepository.EndPoint endPoint, String host, String path) {
        Intrinsics.checkNotNullParameter(endPoint, "endPoint");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IllegalStateException("Cannot set endpoint".toString());
    }
}

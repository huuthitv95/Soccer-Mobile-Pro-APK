package com.chartboost.sdk.internal.Networking;

import com.chartboost.sdk.impl.C4048sb;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.C11341A5;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m43474d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0003\u0010\bJ\u0015\u0010\u0003\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m43475d2 = {"Lcom/chartboost/sdk/internal/Networking/NetworkHelper;", "", "", "a", "()Z", "", C11341A5.f23827r, ShareConstants.MEDIA_URI, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "urlString", "(Ljava/lang/String;)Ljava/lang/String;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/net/URL;", "c", "(Ljava/lang/String;)Ljava/net/URL;", "debugEndpoint", "Ljava/lang/String;", "isForceSDKToAcceptAllSSLCertsEnabled", "Z", "<init>", "()V", "ChartboostMonetization-9.11.1_productionRelease"}, m43476k = 1, m43477mv = {1, 9, 0})
public final class NetworkHelper {

    /* JADX INFO: renamed from: a */
    public static final NetworkHelper f17175a = new NetworkHelper();
    private static String debugEndpoint;
    private static boolean isForceSDKToAcceptAllSSLCertsEnabled;

    /* JADX INFO: renamed from: a */
    public static final boolean m20163a() {
        return isForceSDKToAcceptAllSSLCertsEnabled;
    }

    /* JADX INFO: renamed from: a */
    public final String m20164a(String urlString) {
        String str;
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        URL urlM20167c = m20167c(urlString);
        if (urlM20167c == null) {
            return "";
        }
        try {
            str = urlM20167c.getProtocol() + "://" + urlM20167c.getHost();
        } catch (Exception e) {
            C4048sb.m19407a("getEndpointFromUrl: " + urlString + " : " + e, null);
            str = "";
        }
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: a */
    public final String m20165a(String endpoint, String uri) {
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        String str = debugEndpoint;
        if (str != null && str.length() != 0) {
            C4048sb.m19416e("normalizedUrl: " + endpoint + " to: " + debugEndpoint, null);
            endpoint = debugEndpoint;
            Intrinsics.checkNotNull(endpoint);
        }
        if (uri == null || uri.length() == 0) {
            uri = "";
        } else if (!StringsKt.startsWith$default(uri, RemoteSettings.FORWARD_SLASH_STRING, false, 2, (Object) null)) {
            uri = RemoteSettings.FORWARD_SLASH_STRING + uri;
        }
        return endpoint + uri;
    }

    /* JADX INFO: renamed from: b */
    public final String m20166b(String urlString) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        URL urlM20167c = m20167c(urlString);
        String path = null;
        if (urlM20167c != null) {
            try {
                path = urlM20167c.getPath();
            } catch (Exception e) {
                C4048sb.m19407a("getPathFromUrl: " + urlString + " : " + e, null);
                path = "";
            }
        }
        return path == null ? "" : path;
    }

    /* JADX INFO: renamed from: c */
    public final URL m20167c(String urlString) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        if (urlString.length() > 0) {
            try {
                return new URL(urlString);
            } catch (Exception e) {
                C4048sb.m19407a("stringToURL: " + urlString + " : " + e, null);
            }
        }
        return null;
    }
}

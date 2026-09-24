package com.vungle.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.vungle.ads.LinkError;
import com.vungle.ads.internal.p298ui.PresenterAdOpenCallback;
import com.vungle.ads.internal.protos.Sdk;
import java.net.URISyntaxException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ExternalRouter.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J#\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0002\b\nJ\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0002JE\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0002\b\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m43475d2 = {"Lcom/vungle/ads/internal/util/ExternalRouter;", "", "()V", "TAG", "", "getIntentFromUrl", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "url", "getIntentFromUrl$vungle_ads_release", "contextIsNotActivity", "", "launch", "deeplinkUrl", "logEntry", "Lcom/vungle/ads/internal/util/LogEntry;", "adOpenCallback", "Lcom/vungle/ads/internal/ui/PresenterAdOpenCallback;", "launch$vungle_ads_release", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
public final class ExternalRouter {
    public static final ExternalRouter INSTANCE = new ExternalRouter();
    private static final String TAG = "ExternalRouter";

    private ExternalRouter() {
    }

    private final Intent getIntentFromUrl(String url, boolean contextIsNotActivity) {
        Intent uri = null;
        try {
            String str = url;
            if (str != null && str.length() != 0) {
                uri = Intent.parseUri(url, 0);
            }
            if (uri != null && contextIsNotActivity) {
                uri.setFlags(268435456);
            }
            return uri;
        } catch (URISyntaxException e) {
            Logger.INSTANCE.m43468e(TAG, "url format is not correct " + e.getLocalizedMessage());
            return uri;
        }
    }

    static /* synthetic */ Intent getIntentFromUrl$default(ExternalRouter externalRouter, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return externalRouter.getIntentFromUrl(str, z);
    }

    public static /* synthetic */ Intent getIntentFromUrl$vungle_ads_release$default(ExternalRouter externalRouter, Context context, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return externalRouter.getIntentFromUrl$vungle_ads_release(context, str);
    }

    public static /* synthetic */ boolean launch$vungle_ads_release$default(ExternalRouter externalRouter, String str, String str2, Context context, LogEntry logEntry, PresenterAdOpenCallback presenterAdOpenCallback, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            logEntry = null;
        }
        if ((i & 16) != 0) {
            presenterAdOpenCallback = null;
        }
        return externalRouter.launch$vungle_ads_release(str, str2, context, logEntry, presenterAdOpenCallback);
    }

    public final Intent getIntentFromUrl$vungle_ads_release(Context context, String url) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getIntentFromUrl(url, !(context instanceof Activity));
    }

    public final boolean launch$vungle_ads_release(String deeplinkUrl, String url, Context context, LogEntry logEntry, PresenterAdOpenCallback adOpenCallback) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        String str2 = deeplinkUrl;
        if ((str2 != null && str2.length() != 0) || ((str = url) != null && str.length() != 0)) {
            boolean z = !(context instanceof Activity);
            try {
                return ActivityManager.INSTANCE.startWhenForeground(context, getIntentFromUrl(deeplinkUrl, z), getIntentFromUrl(url, z), adOpenCallback);
            } catch (Exception e) {
                if (str2 == null || str2.length() == 0) {
                    new LinkError(Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED, "Fail to open " + url).setLogEntry$vungle_ads_release(logEntry).logErrorNoReturnValue$vungle_ads_release();
                } else {
                    new LinkError(Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED, "Fail to open " + deeplinkUrl).setLogEntry$vungle_ads_release(logEntry).logErrorNoReturnValue$vungle_ads_release();
                }
                Logger.INSTANCE.m43468e(TAG, "Error while opening url" + e.getLocalizedMessage());
                Logger.INSTANCE.m43467d(TAG, "Cannot open url " + url);
            }
        }
        return false;
    }
}

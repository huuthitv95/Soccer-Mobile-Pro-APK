package com.vungle.ads.internal.p298ui;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import com.vungle.ads.AdCantPlayWithoutWebView;
import com.vungle.ads.AdConfig;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.ConcurrentPlaybackUnsupported;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.BidPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.model.UnclosedAd;
import com.vungle.ads.internal.omsdk.OMTracker;
import com.vungle.ads.internal.p298ui.view.MRAIDAdWidget;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.presenter.AdEventListener;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.presenter.OpenActivityDelegate;
import com.vungle.ads.internal.presenter.PresenterDelegate;
import com.vungle.ads.internal.presenter.WebViewManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.util.ActivityManager;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.RingerModeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdActivity.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\u0083\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002*\u0001\u0004\b&\u0018\u0000 ?2\u00020\u0001:\u0001?B\u0005¢\u0006\u0002\u0010\u0002J\r\u0010!\u001a\u00020\"H\u0011¢\u0006\u0002\b#J\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020%H\u0002J\"\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\b\u0010+\u001a\u0004\u0018\u00010,H\u0014J\b\u0010-\u001a\u00020%H\u0016J\u0012\u0010.\u001a\u00020%2\b\u0010/\u001a\u0004\u0018\u00010\u0015H\u0002J\u0010\u00100\u001a\u00020%2\u0006\u00101\u001a\u000202H\u0016J\u0012\u00103\u001a\u00020%2\b\u00104\u001a\u0004\u0018\u000105H\u0014J\b\u00106\u001a\u00020%H\u0014J\u0010\u00107\u001a\u00020%2\u0006\u00108\u001a\u00020,H\u0014J\b\u00109\u001a\u00020%H\u0014J\b\u0010:\u001a\u00020%H\u0014J\u0010\u0010;\u001a\u00020%2\u0006\u0010<\u001a\u00020\"H\u0016J\u0010\u0010=\u001a\u00020%2\u0006\u0010>\u001a\u00020)H\u0016R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005R&\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u00020\u00158\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006@²\u0006\n\u0010A\u001a\u00020BX\u008a\u0084\u0002²\u0006\n\u0010C\u001a\u00020DX\u008a\u0084\u0002²\u0006\n\u0010E\u001a\u00020FX\u008a\u0084\u0002²\u0006\n\u0010G\u001a\u00020HX\u008a\u0084\u0002"}, m43475d2 = {"Lcom/vungle/ads/internal/ui/AdActivity;", "Landroid/app/Activity;", "()V", "lifeCycleCallback", "com/vungle/ads/internal/ui/AdActivity$lifeCycleCallback$1", "Lcom/vungle/ads/internal/ui/AdActivity$lifeCycleCallback$1;", "mraidAdWidget", "Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;", "getMraidAdWidget$vungle_ads_release$annotations", "getMraidAdWidget$vungle_ads_release", "()Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;", "setMraidAdWidget$vungle_ads_release", "(Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;)V", "mraidPresenter", "Lcom/vungle/ads/internal/presenter/MRAIDPresenter;", "getMraidPresenter$vungle_ads_release$annotations", "getMraidPresenter$vungle_ads_release", "()Lcom/vungle/ads/internal/presenter/MRAIDPresenter;", "setMraidPresenter$vungle_ads_release", "(Lcom/vungle/ads/internal/presenter/MRAIDPresenter;)V", "placementRefId", "", "getPlacementRefId$vungle_ads_release$annotations", "getPlacementRefId$vungle_ads_release", "()Ljava/lang/String;", "setPlacementRefId$vungle_ads_release", "(Ljava/lang/String;)V", "ringerModeReceiver", "Lcom/vungle/ads/internal/util/RingerModeReceiver;", "unclosedAd", "Lcom/vungle/ads/internal/model/UnclosedAd;", "willPresentInlineInstall", "Ljava/util/concurrent/atomic/AtomicBoolean;", "canRotate", "", "canRotate$vungle_ads_release", "clearStaticFields", "", "hideSystemUi", "onActivityResult", "requestCode", "", C11744X3.f.f26248f, "data", "Landroid/content/Intent;", "onBackPressed", "onConcurrentPlaybackError", "placement", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onNewIntent", SDKConstants.PARAM_INTENT, "onPause", "onResume", "onWindowFocusChanged", "hasFocus", "setRequestedOrientation", "requestedOrientation", "Companion", "vungle-ads_release", "signalManager", "Lcom/vungle/ads/internal/signals/SignalManager;", "executors", "Lcom/vungle/ads/internal/executor/Executors;", C11540L6.f24917H, "Lcom/vungle/ads/internal/platform/Platform;", "omTrackerFactory", "Lcom/vungle/ads/internal/omsdk/OMTracker$Factory;"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
public abstract class AdActivity extends Activity {
    public static final String AD_INVISIBLE_LOGGED_KEY = "ad_invisible_logged";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String REQUEST_KEY_EVENT_ID_EXTRA = "request_eventId";
    public static final String REQUEST_KEY_EXTRA = "request";
    private static final String TAG = "AdActivity";
    private static AdPayload advertisement;
    private static BidPayload bidPayload;
    private static AdEventListener eventListener;
    private static PresenterDelegate presenterDelegate;
    private MRAIDAdWidget mraidAdWidget;
    private MRAIDPresenter mraidPresenter;
    private UnclosedAd unclosedAd;
    private String placementRefId = "";
    private final RingerModeReceiver ringerModeReceiver = new RingerModeReceiver();
    private final AdActivity$lifeCycleCallback$1 lifeCycleCallback = new ActivityManager.LifeCycleCallback() { // from class: com.vungle.ads.internal.ui.AdActivity$lifeCycleCallback$1
        @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
        public void onBackground() throws Throwable {
            MRAIDPresenter mraidPresenter = this.this$0.getMraidPresenter();
            Long viewStatus = mraidPresenter != null ? mraidPresenter.getViewStatus() : null;
            Logger.INSTANCE.m43467d("AdActivity", "App is in background, status: " + viewStatus);
            if (viewStatus != null) {
                long jLongValue = viewStatus.longValue();
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                Sdk.SDKMetric.SDKMetricType sDKMetricType = Sdk.SDKMetric.SDKMetricType.AD_BACKGROUND_BEFORE_IMPRESSION;
                AdPayload advertisement$vungle_ads_release = AdActivity.INSTANCE.getAdvertisement$vungle_ads_release();
                AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, sDKMetricType, jLongValue, advertisement$vungle_ads_release != null ? advertisement$vungle_ads_release.getLogEntry() : null, null, 8, null);
            }
        }

        @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
        public void onForeground() {
        }
    };
    private final AtomicBoolean willPresentInlineInstall = new AtomicBoolean(false);

    /* JADX INFO: compiled from: AdActivity.kt */
    @Metadata(m43474d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010\u0004J\u0012\u0010(\u001a\u0004\u0018\u00010\u00042\u0006\u0010)\u001a\u00020#H\u0002J\u0012\u0010*\u001a\u0004\u0018\u00010\u00042\u0006\u0010)\u001a\u00020#H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00178AX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006+"}, m43475d2 = {"Lcom/vungle/ads/internal/ui/AdActivity$Companion;", "", "()V", "AD_INVISIBLE_LOGGED_KEY", "", "REQUEST_KEY_EVENT_ID_EXTRA", "getREQUEST_KEY_EVENT_ID_EXTRA$vungle_ads_release$annotations", "REQUEST_KEY_EXTRA", "getREQUEST_KEY_EXTRA$vungle_ads_release$annotations", "TAG", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "getAdvertisement$vungle_ads_release", "()Lcom/vungle/ads/internal/model/AdPayload;", "setAdvertisement$vungle_ads_release", "(Lcom/vungle/ads/internal/model/AdPayload;)V", "bidPayload", "Lcom/vungle/ads/internal/model/BidPayload;", "getBidPayload$vungle_ads_release", "()Lcom/vungle/ads/internal/model/BidPayload;", "setBidPayload$vungle_ads_release", "(Lcom/vungle/ads/internal/model/BidPayload;)V", "eventListener", "Lcom/vungle/ads/internal/presenter/AdEventListener;", "getEventListener$vungle_ads_release", "()Lcom/vungle/ads/internal/presenter/AdEventListener;", "setEventListener$vungle_ads_release", "(Lcom/vungle/ads/internal/presenter/AdEventListener;)V", "presenterDelegate", "Lcom/vungle/ads/internal/presenter/PresenterDelegate;", "getPresenterDelegate$vungle_ads_release", "()Lcom/vungle/ads/internal/presenter/PresenterDelegate;", "setPresenterDelegate$vungle_ads_release", "(Lcom/vungle/ads/internal/presenter/PresenterDelegate;)V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "placement", "eventId", "getEventId", SDKConstants.PARAM_INTENT, "getPlacement", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getEventId(Intent intent) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    return extras.getString(AdActivity.REQUEST_KEY_EVENT_ID_EXTRA);
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getPlacement(Intent intent) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    return extras.getString("request");
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }

        public static /* synthetic */ void getREQUEST_KEY_EVENT_ID_EXTRA$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getREQUEST_KEY_EXTRA$vungle_ads_release$annotations() {
        }

        public final Intent createIntent(Context context, String placement, String eventId) {
            Intrinsics.checkNotNullParameter(placement, "placement");
            Intent intent = new Intent(context, (Class<?>) VungleActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            Bundle bundle = new Bundle();
            bundle.putString("request", placement);
            bundle.putString(AdActivity.REQUEST_KEY_EVENT_ID_EXTRA, eventId);
            intent.putExtras(bundle);
            return intent;
        }

        public final AdPayload getAdvertisement$vungle_ads_release() {
            return AdActivity.advertisement;
        }

        public final BidPayload getBidPayload$vungle_ads_release() {
            return AdActivity.bidPayload;
        }

        public final AdEventListener getEventListener$vungle_ads_release() {
            return AdActivity.eventListener;
        }

        public final PresenterDelegate getPresenterDelegate$vungle_ads_release() {
            return AdActivity.presenterDelegate;
        }

        public final void setAdvertisement$vungle_ads_release(AdPayload adPayload) {
            AdActivity.advertisement = adPayload;
        }

        public final void setBidPayload$vungle_ads_release(BidPayload bidPayload) {
            AdActivity.bidPayload = bidPayload;
        }

        public final void setEventListener$vungle_ads_release(AdEventListener adEventListener) {
            AdActivity.eventListener = adEventListener;
        }

        public final void setPresenterDelegate$vungle_ads_release(PresenterDelegate presenterDelegate) {
            AdActivity.presenterDelegate = presenterDelegate;
        }
    }

    private final void clearStaticFields() {
        eventListener = null;
        presenterDelegate = null;
        advertisement = null;
        bidPayload = null;
    }

    public static /* synthetic */ void getMraidAdWidget$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getMraidPresenter$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getPlacementRefId$vungle_ads_release$annotations() {
    }

    private final void hideSystemUi() {
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView());
        Intrinsics.checkNotNullExpressionValue(insetsController, "getInsetsController(window, window.decorView)");
        insetsController.setSystemBarsBehavior(2);
        insetsController.hide(WindowInsetsCompat.Type.systemBars());
    }

    private final void onConcurrentPlaybackError(String placement) {
        ConcurrentPlaybackUnsupported concurrentPlaybackUnsupported = new ConcurrentPlaybackUnsupported("Trying to show " + placement + " but " + this.placementRefId + " is already showing");
        AdPayload adPayload = advertisement;
        VungleError vungleErrorLogError$vungle_ads_release = concurrentPlaybackUnsupported.setLogEntry$vungle_ads_release(adPayload != null ? adPayload.getLogEntry() : null).logError$vungle_ads_release();
        AdEventListener adEventListener = eventListener;
        if (adEventListener != null) {
            adEventListener.onError(vungleErrorLogError$vungle_ads_release, placement);
        }
        Logger.INSTANCE.m43468e(TAG, "onConcurrentPlaybackError: " + vungleErrorLogError$vungle_ads_release.getLocalizedMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-1, reason: not valid java name */
    public static final SignalManager m44826onCreate$lambda1(Lazy<SignalManager> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: renamed from: onCreate$lambda-5, reason: not valid java name */
    private static final Executors m44827onCreate$lambda5(Lazy<? extends Executors> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: renamed from: onCreate$lambda-6, reason: not valid java name */
    private static final Platform m44828onCreate$lambda6(Lazy<? extends Platform> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: renamed from: onCreate$lambda-7, reason: not valid java name */
    private static final OMTracker.Factory m44829onCreate$lambda7(Lazy<OMTracker.Factory> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-9, reason: not valid java name */
    public static final WindowInsetsCompat m44830onCreate$lambda9(AdActivity this$0, View v, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        if (!this$0.willPresentInlineInstall.get()) {
            Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
            Intrinsics.checkNotNullExpressionValue(insets2, "insets.getInsets(\n      …t()\n                    )");
            v.setPadding(insets2.left, insets2.top, insets2.right, insets2.bottom);
        }
        return insets;
    }

    public boolean canRotate$vungle_ads_release() {
        return false;
    }

    /* JADX INFO: renamed from: getMraidAdWidget$vungle_ads_release, reason: from getter */
    public final MRAIDAdWidget getMraidAdWidget() {
        return this.mraidAdWidget;
    }

    /* JADX INFO: renamed from: getMraidPresenter$vungle_ads_release, reason: from getter */
    public final MRAIDPresenter getMraidPresenter() {
        return this.mraidPresenter;
    }

    /* JADX INFO: renamed from: getPlacementRefId$vungle_ads_release, reason: from getter */
    public final String getPlacementRefId() {
        return this.placementRefId;
    }

    @Override // android.app.Activity
    protected void onActivityResult(final int requestCode, final int resultCode, final Intent data) throws Throwable {
        super.onActivityResult(requestCode, resultCode, data);
        Logger.INSTANCE.m43472w(TAG, new Function0<String>() { // from class: com.vungle.ads.internal.ui.AdActivity.onActivityResult.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "onActivityResult: " + requestCode + ", " + resultCode + ", " + data;
            }
        });
        if (requestCode == 10001) {
            this.willPresentInlineInstall.set(false);
            MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
            if (mRAIDPresenter != null) {
                mRAIDPresenter.logInlineInstallSuccess$vungle_ads_release("onActivityResultCode=" + resultCode);
            }
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.handleExit();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        try {
            super.onConfigurationChanged(newConfig);
            if (newConfig.orientation == 2) {
                Logger.INSTANCE.m43467d(TAG, C11744X3.i.f26320C);
            } else if (newConfig.orientation == 1) {
                Logger.INSTANCE.m43467d(TAG, C11744X3.i.f26322D);
            }
            MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
            if (mRAIDPresenter != null) {
                mRAIDPresenter.onViewConfigurationChanged();
            }
        } catch (Exception e) {
            Logger.INSTANCE.m43468e(TAG, "onConfigurationChanged: " + e.getLocalizedMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker] */
    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws Throwable {
        String watermark$vungle_ads_release;
        View decorView;
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        getWindow().setFlags(16777216, 16777216);
        Companion companion = INSTANCE;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        String placement = companion.getPlacement(intent);
        if (placement == null) {
            placement = "";
        }
        this.placementRefId = placement;
        AdPayload adPayload = advertisement;
        Placement placement2 = ConfigManager.INSTANCE.getPlacement(this.placementRefId);
        LogEntry logEntry = 0;
        frameLayout = null;
        FrameLayout frameLayout = null;
        if (placement2 == null || adPayload == null) {
            AdEventListener adEventListener = eventListener;
            if (adEventListener != null) {
                adEventListener.onError(new AdNotLoadedCantPlay("Can not play fullscreen ad. placement=" + placement2 + " adv=" + adPayload).setLogEntry$vungle_ads_release(adPayload != null ? adPayload.getLogEntry() : 0).logError$vungle_ads_release(), this.placementRefId);
            }
            finish();
            return;
        }
        try {
            MRAIDAdWidget mRAIDAdWidget = new MRAIDAdWidget(this, adPayload.eventId());
            WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
            long j = getIntent().getBooleanExtra(AD_INVISIBLE_LOGGED_KEY, false) ? 3L : 2L;
            AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
            SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
            singleValueMetric.setValue(Long.valueOf(j));
            AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, adPayload.getLogEntry(), (String) null, 4, (Object) null);
            Logger.INSTANCE.m43467d(TAG, "Log metric AD_VISIBILITY: " + j);
            ServiceLocator.Companion companion2 = ServiceLocator.INSTANCE;
            final AdActivity adActivity = this;
            final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<SignalManager>() { // from class: com.vungle.ads.internal.ui.AdActivity$onCreate$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.SignalManager, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final SignalManager invoke() {
                    return ServiceLocator.INSTANCE.getInstance(adActivity).getService(SignalManager.class);
                }
            });
            Intent intent2 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent2, "intent");
            String eventId = companion.getEventId(intent2);
            UnclosedAd unclosedAd = eventId != null ? new UnclosedAd(eventId, (String) logEntry, 2, (DefaultConstructorMarker) logEntry) : null;
            this.unclosedAd = unclosedAd;
            if (unclosedAd != null) {
                m44826onCreate$lambda1(lazy).recordUnclosedAd(unclosedAd);
            }
            mRAIDAdWidget.setCloseDelegate(new MRAIDAdWidget.CloseDelegate() { // from class: com.vungle.ads.internal.ui.AdActivity$onCreate$4$1
                @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.CloseDelegate
                public void close() throws Throwable {
                    MRAIDPresenter mraidPresenter = this.this$0.getMraidPresenter();
                    Long viewStatus = mraidPresenter != null ? mraidPresenter.getViewStatus() : null;
                    if (viewStatus != null) {
                        long jLongValue = viewStatus.longValue();
                        AnalyticsClient analyticsClient2 = AnalyticsClient.INSTANCE;
                        Sdk.SDKMetric.SDKMetricType sDKMetricType = Sdk.SDKMetric.SDKMetricType.AD_CLOSED_BEFORE_IMPRESSION;
                        AdPayload advertisement$vungle_ads_release = AdActivity.INSTANCE.getAdvertisement$vungle_ads_release();
                        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient2, sDKMetricType, jLongValue, advertisement$vungle_ads_release != null ? advertisement$vungle_ads_release.getLogEntry() : null, null, 8, null);
                    }
                    UnclosedAd unclosedAd2 = this.this$0.unclosedAd;
                    if (unclosedAd2 != null) {
                        AdActivity.m44826onCreate$lambda1(lazy).removeUnclosedAd(unclosedAd2);
                    }
                    this.this$0.finish();
                }
            });
            mRAIDAdWidget.setOnViewTouchListener(new MRAIDAdWidget.OnViewTouchListener() { // from class: com.vungle.ads.internal.ui.AdActivity$onCreate$4$2
                @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.OnViewTouchListener
                public boolean onTouch(MotionEvent event) {
                    MRAIDPresenter mraidPresenter = this.this$0.getMraidPresenter();
                    if (mraidPresenter == null) {
                        return false;
                    }
                    mraidPresenter.onViewTouched(event);
                    return false;
                }
            });
            mRAIDAdWidget.setOrientationDelegate(new MRAIDAdWidget.OrientationDelegate() { // from class: com.vungle.ads.internal.ui.AdActivity$onCreate$4$3
                @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.OrientationDelegate
                public void setOrientation(int orientation) {
                    this.this$0.setRequestedOrientation(orientation);
                }
            });
            ServiceLocator.Companion companion3 = ServiceLocator.INSTANCE;
            Lazy lazy2 = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<Executors>() { // from class: com.vungle.ads.internal.ui.AdActivity$onCreate$$inlined$inject$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.Executors, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final Executors invoke() {
                    return ServiceLocator.INSTANCE.getInstance(adActivity).getService(Executors.class);
                }
            });
            ServiceLocator.Companion companion4 = ServiceLocator.INSTANCE;
            Lazy lazy3 = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<Platform>() { // from class: com.vungle.ads.internal.ui.AdActivity$onCreate$$inlined$inject$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.platform.Platform, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final Platform invoke() {
                    return ServiceLocator.INSTANCE.getInstance(adActivity).getService(Platform.class);
                }
            });
            VungleWebClient orCreateWebViewClient = WebViewManager.INSTANCE.getOrCreateWebViewClient(adPayload, placement2, m44827onCreate$lambda5(lazy2).getOFFLOAD_EXECUTOR(), m44828onCreate$lambda6(lazy3));
            ServiceLocator.Companion companion5 = ServiceLocator.INSTANCE;
            OMTracker oMTrackerMake = m44829onCreate$lambda7(LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<OMTracker.Factory>() { // from class: com.vungle.ads.internal.ui.AdActivity$onCreate$$inlined$inject$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.omsdk.OMTracker$Factory, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final OMTracker.Factory invoke() {
                    return ServiceLocator.INSTANCE.getInstance(adActivity).getService(OMTracker.Factory.class);
                }
            })).make(adPayload.omEnabled());
            VungleThreadPoolExecutor job_executor = m44827onCreate$lambda5(lazy2).getJOB_EXECUTOR();
            orCreateWebViewClient.setWebViewObserver(oMTrackerMake);
            this.ringerModeReceiver.setListener(orCreateWebViewClient);
            MRAIDPresenter mRAIDPresenter = new MRAIDPresenter(mRAIDAdWidget, adPayload, placement2, orCreateWebViewClient, job_executor, oMTrackerMake, m44828onCreate$lambda6(lazy3));
            mRAIDPresenter.setEventListener(eventListener);
            mRAIDPresenter.setPresenterDelegate$vungle_ads_release(presenterDelegate);
            mRAIDPresenter.setOpenActivityDelegate$vungle_ads_release(new OpenActivityDelegate() { // from class: com.vungle.ads.internal.ui.AdActivity.onCreate.5
                @Override // com.vungle.ads.internal.presenter.OpenActivityDelegate
                public Pair<Boolean, String> openInlineInstall(Intent intent3) {
                    Object objM44946constructorimpl;
                    Intrinsics.checkNotNullParameter(intent3, "intent");
                    AdActivity adActivity2 = AdActivity.this;
                    try {
                        Result.Companion companion6 = Result.INSTANCE;
                        C149605 c149605 = this;
                        adActivity2.willPresentInlineInstall.set(true);
                        adActivity2.startActivityForResult(intent3, 10001);
                        objM44946constructorimpl = Result.m44946constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion7 = Result.INSTANCE;
                        objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
                    }
                    AdActivity adActivity3 = AdActivity.this;
                    Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
                    if (thM44949exceptionOrNullimpl == null) {
                        return new Pair<>(true, null);
                    }
                    adActivity3.willPresentInlineInstall.set(false);
                    return new Pair<>(false, thM44949exceptionOrNullimpl.getLocalizedMessage());
                }
            });
            mRAIDPresenter.prepare();
            MRAIDAdWidget mRAIDAdWidget2 = mRAIDAdWidget;
            setContentView(mRAIDAdWidget2, mRAIDAdWidget.getLayoutParams());
            try {
                Result.Companion companion6 = Result.INSTANCE;
                AdActivity adActivity2 = this;
                getWindow().getDecorView().setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                Result.m44946constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion7 = Result.INSTANCE;
                Result.m44946constructorimpl(ResultKt.createFailure(th));
            }
            ViewCompat.setOnApplyWindowInsetsListener(mRAIDAdWidget2, new OnApplyWindowInsetsListener() { // from class: com.vungle.ads.internal.ui.AdActivity$$ExternalSyntheticLambda0
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    return AdActivity.m44830onCreate$lambda9(this.f$0, view, windowInsetsCompat);
                }
            });
            hideSystemUi();
            AdConfig adConfig = adPayload.getAdConfig();
            if (adConfig != null && (watermark$vungle_ads_release = adConfig.getWatermark$vungle_ads_release()) != null) {
                Window window = getWindow();
                if (window != null && (decorView = window.getDecorView()) != null) {
                    frameLayout = (FrameLayout) decorView.findViewById(R.id.content);
                }
                if (frameLayout != null) {
                    WatermarkView watermarkView = new WatermarkView(adActivity, watermark$vungle_ads_release);
                    frameLayout.addView(watermarkView);
                    watermarkView.bringToFront();
                }
            }
            this.mraidAdWidget = mRAIDAdWidget;
            this.mraidPresenter = mRAIDPresenter;
            ActivityManager.INSTANCE.addLifecycleListener(this.lifeCycleCallback);
            try {
                Result.Companion companion8 = Result.INSTANCE;
                AdActivity adActivity3 = this;
                Result.m44946constructorimpl(registerReceiver(this.ringerModeReceiver, new IntentFilter("android.media.RINGER_MODE_CHANGED")));
            } catch (Throwable th2) {
                Result.Companion companion9 = Result.INSTANCE;
                Result.m44946constructorimpl(ResultKt.createFailure(th2));
            }
        } catch (InstantiationException e) {
            AdEventListener adEventListener2 = eventListener;
            if (adEventListener2 != null) {
                adEventListener2.onError(new AdCantPlayWithoutWebView(e.getMessage()).setLogEntry$vungle_ads_release(adPayload.getLogEntry()).logError$vungle_ads_release(), this.placementRefId);
            }
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.detach((isChangingConfigurations() ? 1 : 0) | 2);
        }
        MRAIDPresenter mRAIDPresenter2 = this.mraidPresenter;
        if (mRAIDPresenter2 != null) {
            mRAIDPresenter2.setOpenActivityDelegate$vungle_ads_release(null);
        }
        ActivityManager.INSTANCE.removeLifecycleListener(this.lifeCycleCallback);
        try {
            Result.Companion companion = Result.INSTANCE;
            AdActivity adActivity = this;
            unregisterReceiver(this.ringerModeReceiver);
            Result.m44946constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        clearStaticFields();
        this.mraidPresenter = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Companion companion = INSTANCE;
        Intent intent2 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent2, "getIntent()");
        Pair pairM43482to = TuplesKt.m43482to(companion.getPlacement(intent2), companion.getPlacement(intent));
        String str = (String) pairM43482to.component1();
        String str2 = (String) pairM43482to.component2();
        Intent intent3 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent3, "getIntent()");
        Pair pairM43482to2 = TuplesKt.m43482to(companion.getEventId(intent3), companion.getEventId(intent));
        String str3 = (String) pairM43482to2.component1();
        String str4 = (String) pairM43482to2.component2();
        if ((str == null || str2 == null || Intrinsics.areEqual(str, str2)) && (str3 == null || str4 == null || Intrinsics.areEqual(str3, str4))) {
            return;
        }
        Logger.INSTANCE.m43467d(TAG, "Tried to play another placement " + str2 + " while playing " + str);
        onConcurrentPlaybackError(str2);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.stop();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.start();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            hideSystemUi();
        }
    }

    public final void setMraidAdWidget$vungle_ads_release(MRAIDAdWidget mRAIDAdWidget) {
        this.mraidAdWidget = mRAIDAdWidget;
    }

    public final void setMraidPresenter$vungle_ads_release(MRAIDPresenter mRAIDPresenter) {
        this.mraidPresenter = mRAIDPresenter;
    }

    public final void setPlacementRefId$vungle_ads_release(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.placementRefId = str;
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int requestedOrientation) {
        if (canRotate$vungle_ads_release()) {
            super.setRequestedOrientation(requestedOrientation);
        }
    }
}

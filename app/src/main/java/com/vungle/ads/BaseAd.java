package com.vungle.ads;

import android.content.Context;
import com.ironsource.C11495If;
import com.ironsource.C12409od;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.load.AdLoaderCallback;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.signals.SignaledAd;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.ThreadUtil;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BaseAd.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\r\u0010G\u001a\u00020HH\u0016¢\u0006\u0002\u0010IJ\u0015\u0010J\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004H ¢\u0006\u0002\bKJ\r\u0010L\u001a\u0004\u0018\u00010M¢\u0006\u0002\u0010NJ\u000e\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020RJ\u0012\u0010O\u001a\u00020P2\b\u0010S\u001a\u0004\u0018\u00010\u0006H\u0016J\u0015\u0010T\u001a\u00020P2\u0006\u0010U\u001a\u00020VH\u0010¢\u0006\u0002\bWJ\b\u0010X\u001a\u00020PH\u0002J\u001d\u0010Y\u001a\u00020P2\u0006\u0010Z\u001a\u00020\u00002\u0006\u0010[\u001a\u00020\\H\u0010¢\u0006\u0002\b]J\u001f\u0010^\u001a\u00020P2\u0006\u0010Z\u001a\u00020\u00002\b\u0010S\u001a\u0004\u0018\u00010\u0006H\u0010¢\u0006\u0002\b_J\u0006\u0010`\u001a\u00020PJ\u0006\u0010a\u001a\u00020PR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u0004\u0018\u00010\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0014\u0010#\u001a\u00020$X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\"\u0010'\u001a\u0004\u0018\u00010\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0014\u0010)\u001a\u00020*X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020.X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001bR\u0014\u00102\u001a\u00020$X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010&R\u0014\u00104\u001a\u00020$X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010&R\u0014\u00106\u001a\u00020*X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010,R\u0014\u00108\u001a\u00020$X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010&R\u0014\u0010:\u001a\u00020$X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010&R\u001b\u0010<\u001a\u00020=8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b@\u0010\u0011\u001a\u0004\b>\u0010?R\u001c\u0010A\u001a\u0004\u0018\u00010BX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F¨\u0006b"}, m43475d2 = {"Lcom/vungle/ads/BaseAd;", "Lcom/vungle/ads/Ad;", "Lcom/vungle/ads/VungleAdType;", "context", "Landroid/content/Context;", "placementId", "", "adConfig", "Lcom/vungle/ads/AdConfig;", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/AdConfig;)V", "getAdConfig", "()Lcom/vungle/ads/AdConfig;", "adInternal", "Lcom/vungle/ads/internal/AdInternal;", "getAdInternal$vungle_ads_release", "()Lcom/vungle/ads/internal/AdInternal;", "adInternal$delegate", "Lkotlin/Lazy;", "adListener", "Lcom/vungle/ads/BaseAdListener;", "getAdListener", "()Lcom/vungle/ads/BaseAdListener;", "setAdListener", "(Lcom/vungle/ads/BaseAdListener;)V", "value", "adapterAdFormat", "getAdapterAdFormat", "()Ljava/lang/String;", "setAdapterAdFormat", "(Ljava/lang/String;)V", "getContext", "()Landroid/content/Context;", "<set-?>", "creativeId", "getCreativeId", "displayToClickMetric", "Lcom/vungle/ads/OneShotTimeIntervalMetric;", "getDisplayToClickMetric$vungle_ads_release", "()Lcom/vungle/ads/OneShotTimeIntervalMetric;", "eventId", "getEventId", "leaveApplicationMetric", "Lcom/vungle/ads/SingleValueMetric;", "getLeaveApplicationMetric$vungle_ads_release", "()Lcom/vungle/ads/SingleValueMetric;", "logEntry", "Lcom/vungle/ads/internal/util/LogEntry;", "getLogEntry$vungle_ads_release", "()Lcom/vungle/ads/internal/util/LogEntry;", "getPlacementId", "presentToDisplayMetric", "getPresentToDisplayMetric$vungle_ads_release", "responseToShowMetric", "getResponseToShowMetric$vungle_ads_release", "rewardedMetric", "getRewardedMetric$vungle_ads_release", "showToCloseMetric", "getShowToCloseMetric$vungle_ads_release", "showToFailMetric", "getShowToFailMetric$vungle_ads_release", "signalManager", "Lcom/vungle/ads/internal/signals/SignalManager;", "getSignalManager$vungle_ads_release", "()Lcom/vungle/ads/internal/signals/SignalManager;", "signalManager$delegate", "signaledAd", "Lcom/vungle/ads/internal/signals/SignaledAd;", "getSignaledAd$vungle_ads_release", "()Lcom/vungle/ads/internal/signals/SignaledAd;", "setSignaledAd$vungle_ads_release", "(Lcom/vungle/ads/internal/signals/SignaledAd;)V", "canPlayAd", "", "()Ljava/lang/Boolean;", "constructAdInternal", "constructAdInternal$vungle_ads_release", "getWinningPrice", "", "()Ljava/lang/Double;", "load", "", "csbData", "Lcom/vungle/ads/VungleCSBData;", "adMarkup", C11495If.f24691j, "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "onAdLoaded$vungle_ads_release", "onLoadEnd", "onLoadFailure", "baseAd", "vungleError", "Lcom/vungle/ads/VungleError;", "onLoadFailure$vungle_ads_release", C12409od.f31637f, "onLoadSuccess$vungle_ads_release", "sendLossURL", "sendWinURL", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
public abstract class BaseAd implements InterfaceC14894Ad, VungleAdType {
    private final AdConfig adConfig;

    /* JADX INFO: renamed from: adInternal$delegate, reason: from kotlin metadata */
    private final Lazy adInternal;
    private BaseAdListener adListener;
    private String adapterAdFormat;
    private final Context context;
    private String creativeId;
    private final OneShotTimeIntervalMetric displayToClickMetric;
    private String eventId;
    private final SingleValueMetric leaveApplicationMetric;
    private final LogEntry logEntry;
    private final String placementId;
    private final OneShotTimeIntervalMetric presentToDisplayMetric;
    private final OneShotTimeIntervalMetric responseToShowMetric;
    private final SingleValueMetric rewardedMetric;
    private final OneShotTimeIntervalMetric showToCloseMetric;
    private final OneShotTimeIntervalMetric showToFailMetric;

    /* JADX INFO: renamed from: signalManager$delegate, reason: from kotlin metadata */
    private final Lazy signalManager;
    private SignaledAd signaledAd;

    public BaseAd(final Context context, String placementId, AdConfig adConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        this.context = context;
        this.placementId = placementId;
        this.adConfig = adConfig;
        this.adInternal = LazyKt.lazy(new Function0<AdInternal>() { // from class: com.vungle.ads.BaseAd$adInternal$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AdInternal invoke() {
                BaseAd baseAd = this.this$0;
                AdInternal adInternalConstructAdInternal$vungle_ads_release = baseAd.constructAdInternal$vungle_ads_release(baseAd.getContext());
                adInternalConstructAdInternal$vungle_ads_release.setLogEntry$vungle_ads_release(this.this$0.getLogEntry());
                return adInternalConstructAdInternal$vungle_ads_release;
            }
        });
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        this.signalManager = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<SignalManager>() { // from class: com.vungle.ads.BaseAd$special$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.SignalManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final SignalManager invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(SignalManager.class);
            }
        });
        LogEntry logEntry = new LogEntry();
        logEntry.setPlacementRefId$vungle_ads_release(placementId);
        this.logEntry = logEntry;
        this.responseToShowMetric = new OneShotTimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_RESPONSE_TO_SHOW_DURATION_MS);
        this.presentToDisplayMetric = new OneShotTimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_PRESENT_TO_DISPLAY_DURATION_MS);
        this.showToFailMetric = new OneShotTimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_FAIL_DURATION_MS);
        this.displayToClickMetric = new OneShotTimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_DISPLAY_TO_CLICK_DURATION_MS);
        this.leaveApplicationMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_LEAVE_APPLICATION);
        this.rewardedMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_REWARD_USER);
        this.showToCloseMetric = new OneShotTimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_CLOSE_DURATION_MS);
    }

    private final void onLoadEnd() {
        this.responseToShowMetric.markStart();
    }

    @Override // com.vungle.ads.InterfaceC14894Ad
    public Boolean canPlayAd() {
        return Boolean.valueOf(AdInternal.canPlayAd$default(getAdInternal$vungle_ads_release(), false, 1, null) == null);
    }

    public abstract AdInternal constructAdInternal$vungle_ads_release(Context context);

    public final AdConfig getAdConfig() {
        return this.adConfig;
    }

    public final AdInternal getAdInternal$vungle_ads_release() {
        return (AdInternal) this.adInternal.getValue();
    }

    public final BaseAdListener getAdListener() {
        return this.adListener;
    }

    @Override // com.vungle.ads.VungleAdType
    public String getAdapterAdFormat() {
        return this.adapterAdFormat;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getCreativeId() {
        return this.creativeId;
    }

    /* JADX INFO: renamed from: getDisplayToClickMetric$vungle_ads_release, reason: from getter */
    public final OneShotTimeIntervalMetric getDisplayToClickMetric() {
        return this.displayToClickMetric;
    }

    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: getLeaveApplicationMetric$vungle_ads_release, reason: from getter */
    public final SingleValueMetric getLeaveApplicationMetric() {
        return this.leaveApplicationMetric;
    }

    /* JADX INFO: renamed from: getLogEntry$vungle_ads_release, reason: from getter */
    public final LogEntry getLogEntry() {
        return this.logEntry;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    /* JADX INFO: renamed from: getPresentToDisplayMetric$vungle_ads_release, reason: from getter */
    public final OneShotTimeIntervalMetric getPresentToDisplayMetric() {
        return this.presentToDisplayMetric;
    }

    /* JADX INFO: renamed from: getResponseToShowMetric$vungle_ads_release, reason: from getter */
    public final OneShotTimeIntervalMetric getResponseToShowMetric() {
        return this.responseToShowMetric;
    }

    /* JADX INFO: renamed from: getRewardedMetric$vungle_ads_release, reason: from getter */
    public final SingleValueMetric getRewardedMetric() {
        return this.rewardedMetric;
    }

    /* JADX INFO: renamed from: getShowToCloseMetric$vungle_ads_release, reason: from getter */
    public final OneShotTimeIntervalMetric getShowToCloseMetric() {
        return this.showToCloseMetric;
    }

    /* JADX INFO: renamed from: getShowToFailMetric$vungle_ads_release, reason: from getter */
    public final OneShotTimeIntervalMetric getShowToFailMetric() {
        return this.showToFailMetric;
    }

    public final SignalManager getSignalManager$vungle_ads_release() {
        return (SignalManager) this.signalManager.getValue();
    }

    /* JADX INFO: renamed from: getSignaledAd$vungle_ads_release, reason: from getter */
    public final SignaledAd getSignaledAd() {
        return this.signaledAd;
    }

    public final Double getWinningPrice() {
        AdPayload advertisement = getAdInternal$vungle_ads_release().getAdvertisement();
        if (advertisement != null) {
            return advertisement.getWinningPrice();
        }
        return null;
    }

    public final void load(VungleCSBData csbData) throws Throwable {
        Intrinsics.checkNotNullParameter(csbData, "csbData");
        getAdInternal$vungle_ads_release().loadAd(this.placementId, null, csbData, new AdLoaderCallback() { // from class: com.vungle.ads.BaseAd.load.2
            @Override // com.vungle.ads.internal.load.AdLoaderCallback
            public void onFailure(VungleError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                BaseAd baseAd = BaseAd.this;
                baseAd.onLoadFailure$vungle_ads_release(baseAd, error);
            }

            @Override // com.vungle.ads.internal.load.AdLoaderCallback
            public void onSuccess(AdPayload advertisement) {
                Intrinsics.checkNotNullParameter(advertisement, "advertisement");
                BaseAd.this.onAdLoaded$vungle_ads_release(advertisement);
                BaseAd baseAd = BaseAd.this;
                baseAd.onLoadSuccess$vungle_ads_release(baseAd, null);
            }
        });
    }

    @Override // com.vungle.ads.InterfaceC14894Ad
    public void load(final String adMarkup) throws Throwable {
        getAdInternal$vungle_ads_release().loadAd(this.placementId, adMarkup, null, new AdLoaderCallback() { // from class: com.vungle.ads.BaseAd.load.1
            @Override // com.vungle.ads.internal.load.AdLoaderCallback
            public void onFailure(VungleError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                BaseAd baseAd = BaseAd.this;
                baseAd.onLoadFailure$vungle_ads_release(baseAd, error);
            }

            @Override // com.vungle.ads.internal.load.AdLoaderCallback
            public void onSuccess(AdPayload advertisement) {
                Intrinsics.checkNotNullParameter(advertisement, "advertisement");
                BaseAd.this.onAdLoaded$vungle_ads_release(advertisement);
                BaseAd baseAd = BaseAd.this;
                baseAd.onLoadSuccess$vungle_ads_release(baseAd, adMarkup);
            }
        });
    }

    public void onAdLoaded$vungle_ads_release(AdPayload advertisement) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        advertisement.setAdConfig(this.adConfig);
        this.creativeId = advertisement.getCreativeId();
        String strEventId = advertisement.eventId();
        this.eventId = strEventId;
        SignaledAd signaledAd = this.signaledAd;
        if (signaledAd == null) {
            return;
        }
        signaledAd.setEventId(strEventId);
    }

    public void onLoadFailure$vungle_ads_release(BaseAd baseAd, final VungleError vungleError) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        Intrinsics.checkNotNullParameter(vungleError, "vungleError");
        onLoadEnd();
        ThreadUtil.INSTANCE.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.BaseAd$onLoadFailure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                BaseAdListener adListener = this.this$0.getAdListener();
                if (adListener != null) {
                    adListener.onAdFailedToLoad(this.this$0, vungleError);
                }
            }
        });
    }

    public void onLoadSuccess$vungle_ads_release(BaseAd baseAd, String adMarkup) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        onLoadEnd();
        ThreadUtil.INSTANCE.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.BaseAd$onLoadSuccess$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                BaseAdListener adListener = this.this$0.getAdListener();
                if (adListener != null) {
                    adListener.onAdLoaded(this.this$0);
                }
            }
        });
    }

    public final void sendLossURL() {
        getAdInternal$vungle_ads_release().sendLossURL();
    }

    public final void sendWinURL() {
        getAdInternal$vungle_ads_release().sendWinURL();
    }

    public final void setAdListener(BaseAdListener baseAdListener) {
        this.adListener = baseAdListener;
    }

    @Override // com.vungle.ads.VungleAdType
    public void setAdapterAdFormat(String str) {
        this.adapterAdFormat = str;
        this.logEntry.setAdapterAdFormat$vungle_ads_release(str);
    }

    public final void setSignaledAd$vungle_ads_release(SignaledAd signaledAd) {
        this.signaledAd = signaledAd;
    }
}

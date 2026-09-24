package com.vungle.ads.internal;

import android.content.Context;
import android.content.Intent;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.ironsource.C11495If;
import com.ironsource.C11744X3;
import com.tiktok.appevents.ErrorData;
import com.vungle.ads.AdExpiredError;
import com.vungle.ads.AdExpiredOnPlayError;
import com.vungle.ads.AdMarkupInvalidError;
import com.vungle.ads.AdMarkupJsonError;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.EmptyBidPayloadError;
import com.vungle.ads.InvalidAdStateError;
import com.vungle.ads.InvalidBannerSizeError;
import com.vungle.ads.InvalidCSBDataError;
import com.vungle.ads.OneShotTimeIntervalMetric;
import com.vungle.ads.PlacementAdTypeMismatchError;
import com.vungle.ads.PlacementNotFoundError;
import com.vungle.ads.SdkNotInitialized;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.TimeIntervalMetric;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleAds;
import com.vungle.ads.VungleCSBData;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.executor.SDKExecutors;
import com.vungle.ads.internal.load.AdLoaderCallback;
import com.vungle.ads.internal.load.AdRequest;
import com.vungle.ads.internal.load.BaseAdLoader;
import com.vungle.ads.internal.load.CSBAdLoader;
import com.vungle.ads.internal.load.DefaultAdLoader;
import com.vungle.ads.internal.load.RealtimeAdLoader;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.BidPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.TpatRequest;
import com.vungle.ads.internal.network.TpatSender;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.omsdk.OMInjector;
import com.vungle.ads.internal.p298ui.AdActivity;
import com.vungle.ads.internal.presenter.AdEventListener;
import com.vungle.ads.internal.presenter.AdPlayCallback;
import com.vungle.ads.internal.presenter.AdPlayCallbackWrapper;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.task.CleanupJob;
import com.vungle.ads.internal.task.JobRunner;
import com.vungle.ads.internal.util.ActivityManager;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;

/* JADX INFO: compiled from: AdInternal.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b&\u0018\u0000 t2\u00020\u0001:\u0002stB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0015\u0010=\u001a\u00020>2\u0006\u0010\r\u001a\u00020\u000eH\u0010¢\u0006\u0002\b?J\u0012\u0010@\u001a\u0004\u0018\u00010A2\b\b\u0002\u0010B\u001a\u00020CJ\r\u0010D\u001a\u00020>H\u0000¢\u0006\u0002\bEJ\n\u0010F\u001a\u0004\u0018\u00010GH&J\r\u0010H\u001a\u00020CH\u0000¢\u0006\u0002\bIJ\n\u0010J\u001a\u0004\u0018\u00010AH\u0016J\u0015\u0010K\u001a\u00020C2\u0006\u0010L\u001a\u00020MH\u0000¢\u0006\u0002\bNJ\u0012\u0010O\u001a\u00020C2\b\u0010P\u001a\u0004\u0018\u00010GH&J\u0010\u0010Q\u001a\u00020C2\u0006\u0010'\u001a\u00020(H&J,\u0010R\u001a\u00020>2\u0006\u0010S\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010T2\n\b\u0002\u0010V\u001a\u0004\u0018\u00010W2\u0006\u0010\u0005\u001a\u00020\u0001J\u0015\u0010X\u001a\u00020>2\u0006\u0010\r\u001a\u00020\u000eH\u0010¢\u0006\u0002\bYJ\u0010\u0010Z\u001a\u00020>2\u0006\u0010[\u001a\u00020AH\u0016J\u0010\u0010\\\u001a\u00020>2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010]\u001a\u00020>2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010^\u001a\u00020_J\u001f\u0010`\u001a\u00020>2\b\u0010a\u001a\u0004\u0018\u00010_2\u0006\u0010\r\u001a\u00020\u000eH\u0010¢\u0006\u0002\bbJ\u0006\u0010c\u001a\u00020>J\u0006\u0010d\u001a\u00020>J\u0012\u0010e\u001a\u0004\u0018\u00010A2\u0006\u0010f\u001a\u00020gH\u0002J\u0012\u0010h\u001a\u0004\u0018\u00010A2\u0006\u0010V\u001a\u00020WH\u0002J \u0010i\u001a\u0004\u0018\u00010A2\u0014\u0010j\u001a\u0010\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020T\u0018\u00010kH\u0002J\u001e\u0010l\u001a\u0004\u0018\u00010A2\u0012\u0010j\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020T0kH\u0002J\u0012\u0010m\u001a\u0004\u0018\u00010A2\u0006\u0010n\u001a\u00020MH\u0002J\u0012\u0010o\u001a\u0004\u0018\u00010A2\u0006\u0010V\u001a\u00020WH\u0002J\"\u0010p\u001a\u0004\u0018\u00010A2\u0006\u0010\u0006\u001a\u00020T2\u0006\u0010q\u001a\u00020M2\u0006\u0010r\u001a\u00020TH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\u000201X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0014\u00104\u001a\u000201X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00103R\u001b\u00106\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b8\u00109R\u000e\u0010<\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006u²\u0006\n\u0010v\u001a\u00020wX\u008a\u0084\u0002²\u0006\n\u0010x\u001a\u00020yX\u008a\u0084\u0002²\u0006\n\u0010z\u001a\u00020{X\u008a\u0084\u0002²\u0006\n\u0010|\u001a\u00020}X\u008a\u0084\u0002²\u0006\n\u0010~\u001a\u00020\u007fX\u008a\u0084\u0002²\u0006\f\u0010\u0080\u0001\u001a\u00030\u0081\u0001X\u008a\u0084\u0002²\u0006\f\u0010\u0080\u0001\u001a\u00030\u0081\u0001X\u008a\u0084\u0002²\u0006\f\u0010\u0080\u0001\u001a\u00030\u0081\u0001X\u008a\u0084\u0002"}, m43475d2 = {"Lcom/vungle/ads/internal/AdInternal;", "Lcom/vungle/ads/internal/load/AdLoaderCallback;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "adLoaderCallback", "value", "Lcom/vungle/ads/internal/AdInternal$AdState;", "adState", "getAdState", "()Lcom/vungle/ads/internal/AdInternal$AdState;", "setAdState", "(Lcom/vungle/ads/internal/AdInternal$AdState;)V", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "getAdvertisement", "()Lcom/vungle/ads/internal/model/AdPayload;", "setAdvertisement", "(Lcom/vungle/ads/internal/model/AdPayload;)V", "baseAdLoader", "Lcom/vungle/ads/internal/load/BaseAdLoader;", "bidPayload", "Lcom/vungle/ads/internal/model/BidPayload;", "getBidPayload", "()Lcom/vungle/ads/internal/model/BidPayload;", "setBidPayload", "(Lcom/vungle/ads/internal/model/BidPayload;)V", "getContext", "()Landroid/content/Context;", "loadMetric", "Lcom/vungle/ads/TimeIntervalMetric;", "logEntry", "Lcom/vungle/ads/internal/util/LogEntry;", "getLogEntry$vungle_ads_release", "()Lcom/vungle/ads/internal/util/LogEntry;", "setLogEntry$vungle_ads_release", "(Lcom/vungle/ads/internal/util/LogEntry;)V", "lossUrlSent", "Ljava/util/concurrent/atomic/AtomicBoolean;", "placement", "Lcom/vungle/ads/internal/model/Placement;", "getPlacement", "()Lcom/vungle/ads/internal/model/Placement;", "setPlacement", "(Lcom/vungle/ads/internal/model/Placement;)V", "playContext", "Ljava/lang/ref/WeakReference;", "requestMetric", "showToValidationMetric", "Lcom/vungle/ads/OneShotTimeIntervalMetric;", "getShowToValidationMetric$vungle_ads_release", "()Lcom/vungle/ads/OneShotTimeIntervalMetric;", "validationToPresentMetric", "getValidationToPresentMetric$vungle_ads_release", "vungleApiClient", "Lcom/vungle/ads/internal/network/VungleApiClient;", "getVungleApiClient", "()Lcom/vungle/ads/internal/network/VungleApiClient;", "vungleApiClient$delegate", "Lkotlin/Lazy;", "winUrlSent", "adLoadedAndUpdateConfigure", "", "adLoadedAndUpdateConfigure$vungle_ads_release", "canPlayAd", "Lcom/vungle/ads/VungleError;", "onPlay", "", "cancelDownload", "cancelDownload$vungle_ads_release", "getAdSizeForAdRequest", "Lcom/vungle/ads/VungleAdSize;", "isAdPlaying", "isAdPlaying$vungle_ads_release", "isAdStateValidOnCanPlay", "isErrorTerminal", "errorCode", "", "isErrorTerminal$vungle_ads_release", "isValidAdSize", C11744X3.i.f26343O, "isValidAdTypeForPlacement", "loadAd", "placementId", "", "adMarkup", "csbData", "Lcom/vungle/ads/VungleCSBData;", C11495If.f24691j, "onAdLoaded$vungle_ads_release", "onFailure", "error", "onSuccess", "play", "adPlayCallback", "Lcom/vungle/ads/internal/presenter/AdPlayCallback;", "renderAd", "listener", "renderAd$vungle_ads_release", "sendLossURL", "sendWinURL", "validateBidFloor", "bidFloor", "", "validateCSBData", "validateExtras", "extras", "", "validateExtrasEntries", "validatePhase", TypedValues.CycleType.S_WAVE_PHASE, "validateStringFields", "validateStringLength", "maxLength", "fieldName", "AdState", "Companion", "vungle-ads_release", "jobRunner", "Lcom/vungle/ads/internal/task/JobRunner;", "omInjector", "Lcom/vungle/ads/internal/omsdk/OMInjector;", "sdkExecutors", "Lcom/vungle/ads/internal/executor/SDKExecutors;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "downloader", "Lcom/vungle/ads/internal/downloader/Downloader;", "tpatSender", "Lcom/vungle/ads/internal/network/TpatSender;"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
public abstract class AdInternal implements AdLoaderCallback {
    private static final long AD_LOAD_BIDDING = 2;
    public static final long AD_LOAD_POST_BID = 3;
    public static final long AD_LOAD_PRIORITY_ACCESS = 4;
    private static final long AD_LOAD_WATERFALL = 1;
    private static final int CSB_DATA_PHASE_PREBID = 2;
    private static final int MAX_CSB_STRING_LENGTH = 500;
    private static final int MAX_EXTRAS_ENTRIES = 50;
    private static final int MAX_EXTRAS_KEY_LENGTH = 100;
    private static final String TAG = "AdInternal";
    private static final boolean THROW_ON_ILLEGAL_TRANSITION = false;
    private AdLoaderCallback adLoaderCallback;
    private volatile AdState adState;
    private AdPayload advertisement;
    private BaseAdLoader baseAdLoader;
    private BidPayload bidPayload;
    private final Context context;
    private TimeIntervalMetric loadMetric;
    private LogEntry logEntry;
    private final AtomicBoolean lossUrlSent;
    private Placement placement;
    private WeakReference<Context> playContext;
    private TimeIntervalMetric requestMetric;
    private final OneShotTimeIntervalMetric showToValidationMetric;
    private final OneShotTimeIntervalMetric validationToPresentMetric;

    /* JADX INFO: renamed from: vungleApiClient$delegate, reason: from kotlin metadata */
    private final Lazy vungleApiClient;
    private final AtomicBoolean winUrlSent;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Json json = JsonKt.Json$default(null, new Function1<JsonBuilder, Unit>() { // from class: com.vungle.ads.internal.AdInternal$Companion$json$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
            invoke2(jsonBuilder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(JsonBuilder Json) {
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.setIgnoreUnknownKeys(true);
            Json.setEncodeDefaults(true);
            Json.setExplicitNulls(false);
        }
    }, 1, null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: AdInternal.kt */
    @Metadata(m43474d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0000H&J\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m43475d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState;", "", "(Ljava/lang/String;I)V", "canTransitionTo", "", "adState", "isTerminalState", "transitionTo", "NEW", "LOADING", "READY", "PLAYING", "IMPRESSION_LOGGED", "FINISHED", "ERROR", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
    public static final class AdState {
        public static final AdState NEW = new NEW("NEW", 0);
        public static final AdState LOADING = new LOADING("LOADING", 1);
        public static final AdState READY = new READY("READY", 2);
        public static final AdState PLAYING = new PLAYING("PLAYING", 3);
        public static final AdState IMPRESSION_LOGGED = new IMPRESSION_LOGGED("IMPRESSION_LOGGED", 4);
        public static final AdState FINISHED = new FINISHED("FINISHED", 5);
        public static final AdState ERROR = new ERROR("ERROR", 6);
        private static final /* synthetic */ AdState[] $VALUES = $values();

        /* JADX INFO: compiled from: AdInternal.kt */
        @Metadata(m43474d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m43475d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState$ERROR;", "Lcom/vungle/ads/internal/AdInternal$AdState;", "canTransitionTo", "", "adState", "toString", "", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
        static final class ERROR extends AdState {
            ERROR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                Intrinsics.checkNotNullParameter(adState, "adState");
                return adState == AdState.FINISHED;
            }

            @Override // java.lang.Enum
            public String toString() {
                return C11744X3.i.f26392t;
            }
        }

        /* JADX INFO: compiled from: AdInternal.kt */
        @Metadata(m43474d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m43475d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState$FINISHED;", "Lcom/vungle/ads/internal/AdInternal$AdState;", "canTransitionTo", "", "adState", "toString", "", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
        static final class FINISHED extends AdState {
            FINISHED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                Intrinsics.checkNotNullParameter(adState, "adState");
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "completed";
            }
        }

        /* JADX INFO: compiled from: AdInternal.kt */
        /* JADX INFO: loaded from: classes9.dex */
        @Metadata(m43474d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m43475d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState$IMPRESSION_LOGGED;", "Lcom/vungle/ads/internal/AdInternal$AdState;", "canTransitionTo", "", "adState", "toString", "", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
        static final class IMPRESSION_LOGGED extends AdState {
            IMPRESSION_LOGGED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                Intrinsics.checkNotNullParameter(adState, "adState");
                return adState == AdState.FINISHED || adState == AdState.ERROR || adState == AdState.READY;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "impressionLogged";
            }
        }

        /* JADX INFO: compiled from: AdInternal.kt */
        @Metadata(m43474d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m43475d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState$LOADING;", "Lcom/vungle/ads/internal/AdInternal$AdState;", "canTransitionTo", "", "adState", "toString", "", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
        static final class LOADING extends AdState {
            LOADING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                Intrinsics.checkNotNullParameter(adState, "adState");
                return adState == AdState.READY || adState == AdState.ERROR;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "loading";
            }
        }

        /* JADX INFO: compiled from: AdInternal.kt */
        @Metadata(m43474d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m43475d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState$NEW;", "Lcom/vungle/ads/internal/AdInternal$AdState;", "canTransitionTo", "", "adState", "toString", "", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
        static final class NEW extends AdState {
            NEW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                Intrinsics.checkNotNullParameter(adState, "adState");
                return adState == AdState.LOADING || adState == AdState.READY || adState == AdState.ERROR;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "idle";
            }
        }

        /* JADX INFO: compiled from: AdInternal.kt */
        @Metadata(m43474d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m43475d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState$PLAYING;", "Lcom/vungle/ads/internal/AdInternal$AdState;", "canTransitionTo", "", "adState", "toString", "", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
        static final class PLAYING extends AdState {
            PLAYING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                Intrinsics.checkNotNullParameter(adState, "adState");
                return adState == AdState.IMPRESSION_LOGGED || adState == AdState.FINISHED || adState == AdState.ERROR || adState == AdState.READY;
            }

            @Override // java.lang.Enum
            public String toString() {
                return C11744X3.i.f26365f0;
            }
        }

        /* JADX INFO: compiled from: AdInternal.kt */
        @Metadata(m43474d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m43475d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState$READY;", "Lcom/vungle/ads/internal/AdInternal$AdState;", "canTransitionTo", "", "adState", "toString", "", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
        static final class READY extends AdState {
            READY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                Intrinsics.checkNotNullParameter(adState, "adState");
                return adState == AdState.PLAYING || adState == AdState.FINISHED || adState == AdState.ERROR;
            }

            @Override // java.lang.Enum
            public String toString() {
                return C11744X3.i.f26390s;
            }
        }

        private static final /* synthetic */ AdState[] $values() {
            return new AdState[]{NEW, LOADING, READY, PLAYING, IMPRESSION_LOGGED, FINISHED, ERROR};
        }

        private AdState(String str, int i) {
            super(str, i);
        }

        public /* synthetic */ AdState(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static AdState valueOf(String str) {
            return (AdState) Enum.valueOf(AdState.class, str);
        }

        public static AdState[] values() {
            return (AdState[]) $VALUES.clone();
        }

        public abstract boolean canTransitionTo(AdState adState);

        public final boolean isTerminalState() {
            return CollectionsKt.listOf((Object[]) new AdState[]{FINISHED, ERROR}).contains(this);
        }

        public final AdState transitionTo(AdState adState) {
            Intrinsics.checkNotNullParameter(adState, "adState");
            if (this == adState || canTransitionTo(adState)) {
                return adState;
            }
            String str = "Cannot transition from " + name() + " to " + adState.name();
            if (AdInternal.THROW_ON_ILLEGAL_TRANSITION) {
                throw new IllegalStateException(str);
            }
            Logger.INSTANCE.m43469e(AdInternal.TAG, "Illegal state transition", new IllegalStateException(str));
            return adState;
        }
    }

    /* JADX INFO: compiled from: AdInternal.kt */
    @Metadata(m43474d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0013\u0010\u0002¨\u0006\u0014"}, m43475d2 = {"Lcom/vungle/ads/internal/AdInternal$Companion;", "", "()V", "AD_LOAD_BIDDING", "", "AD_LOAD_POST_BID", "AD_LOAD_PRIORITY_ACCESS", "AD_LOAD_WATERFALL", "CSB_DATA_PHASE_PREBID", "", "MAX_CSB_STRING_LENGTH", "MAX_EXTRAS_ENTRIES", "MAX_EXTRAS_KEY_LENGTH", "TAG", "", "THROW_ON_ILLEGAL_TRANSITION", "", "json", "Lkotlinx/serialization/json/Json;", "getJson$annotations", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static /* synthetic */ void getJson$annotations() {
        }
    }

    /* JADX INFO: compiled from: AdInternal.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 7, 1}, m43479xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdState.values().length];
            iArr[AdState.NEW.ordinal()] = 1;
            iArr[AdState.LOADING.ordinal()] = 2;
            iArr[AdState.READY.ordinal()] = 3;
            iArr[AdState.PLAYING.ordinal()] = 4;
            iArr[AdState.IMPRESSION_LOGGED.ordinal()] = 5;
            iArr[AdState.FINISHED.ordinal()] = 6;
            iArr[AdState.ERROR.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AdInternal(final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.adState = AdState.NEW;
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        this.vungleApiClient = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<VungleApiClient>() { // from class: com.vungle.ads.internal.AdInternal$special$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.VungleApiClient, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final VungleApiClient invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(VungleApiClient.class);
            }
        });
        this.showToValidationMetric = new OneShotTimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS);
        this.validationToPresentMetric = new OneShotTimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_VALIDATION_TO_PRESENT_DURATION_MS);
        this.winUrlSent = new AtomicBoolean(false);
        this.lossUrlSent = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: _set_adState_$lambda-1$lambda-0, reason: not valid java name */
    private static final JobRunner m44750_set_adState_$lambda1$lambda0(Lazy<? extends JobRunner> lazy) {
        return lazy.getValue();
    }

    public static /* synthetic */ VungleError canPlayAd$default(AdInternal adInternal, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: canPlayAd");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return adInternal.canPlayAd(z);
    }

    private final VungleApiClient getVungleApiClient() {
        return (VungleApiClient) this.vungleApiClient.getValue();
    }

    public static /* synthetic */ void loadAd$default(AdInternal adInternal, String str, String str2, VungleCSBData vungleCSBData, AdLoaderCallback adLoaderCallback, int i, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadAd");
        }
        if ((i & 4) != 0) {
            vungleCSBData = null;
        }
        adInternal.loadAd(str, str2, vungleCSBData, adLoaderCallback);
    }

    /* JADX INFO: renamed from: loadAd$lambda-2, reason: not valid java name */
    private static final OMInjector m44751loadAd$lambda2(Lazy<OMInjector> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: renamed from: loadAd$lambda-3, reason: not valid java name */
    private static final SDKExecutors m44752loadAd$lambda3(Lazy<SDKExecutors> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: renamed from: loadAd$lambda-4, reason: not valid java name */
    private static final PathProvider m44753loadAd$lambda4(Lazy<PathProvider> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: renamed from: loadAd$lambda-5, reason: not valid java name */
    private static final Downloader m44754loadAd$lambda5(Lazy<? extends Downloader> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: renamed from: onSuccess$lambda-11$lambda-9, reason: not valid java name */
    private static final TpatSender m44755onSuccess$lambda11$lambda9(Lazy<TpatSender> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: renamed from: sendLossURL$lambda-15, reason: not valid java name */
    private static final TpatSender m44756sendLossURL$lambda15(Lazy<TpatSender> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: renamed from: sendWinURL$lambda-13, reason: not valid java name */
    private static final TpatSender m44757sendWinURL$lambda13(Lazy<TpatSender> lazy) {
        return lazy.getValue();
    }

    private final VungleError validateBidFloor(double bidFloor) {
        if (bidFloor >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return null;
        }
        return new InvalidCSBDataError("bidFloor must be >= 0, got: " + bidFloor);
    }

    private final VungleError validateCSBData(VungleCSBData csbData) {
        VungleError vungleErrorValidateBidFloor = validateBidFloor(csbData.getBidFloor());
        return (vungleErrorValidateBidFloor == null && (vungleErrorValidateBidFloor = validatePhase(csbData.getPhase())) == null && (vungleErrorValidateBidFloor = validateStringFields(csbData)) == null) ? validateExtras(csbData.getExtras()) : vungleErrorValidateBidFloor;
    }

    private final VungleError validateExtras(Map<String, String> extras) {
        if (extras == null) {
            return null;
        }
        if (extras.size() <= 50) {
            return validateExtrasEntries(extras);
        }
        return new InvalidCSBDataError("extras map exceeds maximum of 50 entries, got: " + extras.size());
    }

    private final VungleError validateExtrasEntries(Map<String, String> extras) {
        for (Map.Entry<String, String> entry : extras.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key.length() == 0) {
                return new InvalidCSBDataError("extras contains empty key");
            }
            if (key.length() > 100) {
                return new InvalidCSBDataError("extras key exceeds maximum length of 100: " + key);
            }
            if (value.length() > 500) {
                return new InvalidCSBDataError("extras value for key '" + key + "' exceeds maximum length of 500");
            }
        }
        return null;
    }

    private final VungleError validatePhase(int phase) {
        if (1 <= phase && phase < 3) {
            return null;
        }
        return new InvalidCSBDataError("phase must be 1 or 2, got: " + phase);
    }

    private final VungleError validateStringFields(VungleCSBData csbData) {
        VungleError vungleErrorValidateStringLength = validateStringLength(csbData.getAuctionId(), 500, "auctionId");
        return (vungleErrorValidateStringLength == null && (vungleErrorValidateStringLength = validateStringLength(csbData.getCreativeId(), 500, "creativeId")) == null) ? validateStringLength(csbData.getAdUnitId(), 500, "adUnitId") : vungleErrorValidateStringLength;
    }

    private final VungleError validateStringLength(String value, int maxLength, String fieldName) {
        if (value.length() <= maxLength) {
            return null;
        }
        return new InvalidCSBDataError(fieldName + " exceeds maximum length of " + maxLength);
    }

    public void adLoadedAndUpdateConfigure$vungle_ads_release(AdPayload advertisement) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
    }

    public final VungleError canPlayAd(boolean onPlay) {
        AdPayload.AdUnit adUnit;
        AdExpiredError adExpiredErrorIsAdStateValidOnCanPlay = isAdStateValidOnCanPlay();
        AdPayload adPayload = this.advertisement;
        if (adPayload == null) {
            adExpiredErrorIsAdStateValidOnCanPlay = new AdNotLoadedCantPlay("adv is null on onPlay=" + onPlay);
        } else if (adExpiredErrorIsAdStateValidOnCanPlay == null) {
            Integer expiry = null;
            if (adPayload == null || !adPayload.hasExpired()) {
                return null;
            }
            StringBuilder sb = new StringBuilder("Ad expiry: ");
            AdPayload adPayload2 = this.advertisement;
            if (adPayload2 != null && (adUnit = adPayload2.adUnit()) != null) {
                expiry = adUnit.getExpiry();
            }
            sb.append(expiry);
            sb.append(", device: ");
            sb.append(System.currentTimeMillis());
            String string = sb.toString();
            adExpiredErrorIsAdStateValidOnCanPlay = onPlay ? new AdExpiredOnPlayError(string) : new AdExpiredError(string);
        }
        if (onPlay) {
            adExpiredErrorIsAdStateValidOnCanPlay.setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
        }
        return adExpiredErrorIsAdStateValidOnCanPlay;
    }

    public final void cancelDownload$vungle_ads_release() {
        AdPayload adPayload = this.advertisement;
        if (adPayload != null && adPayload.isPartialDownloadEnabled()) {
            Logger.INSTANCE.m43467d(TAG, "Skip cancelling download for ads with partial download enabled.");
            return;
        }
        BaseAdLoader baseAdLoader = this.baseAdLoader;
        if (baseAdLoader != null) {
            baseAdLoader.cancel();
        }
    }

    public abstract VungleAdSize getAdSizeForAdRequest();

    public final AdState getAdState() {
        return this.adState;
    }

    public final AdPayload getAdvertisement() {
        return this.advertisement;
    }

    public final BidPayload getBidPayload() {
        return this.bidPayload;
    }

    public final Context getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: getLogEntry$vungle_ads_release, reason: from getter */
    public final LogEntry getLogEntry() {
        return this.logEntry;
    }

    public final Placement getPlacement() {
        return this.placement;
    }

    /* JADX INFO: renamed from: getShowToValidationMetric$vungle_ads_release, reason: from getter */
    public final OneShotTimeIntervalMetric getShowToValidationMetric() {
        return this.showToValidationMetric;
    }

    /* JADX INFO: renamed from: getValidationToPresentMetric$vungle_ads_release, reason: from getter */
    public final OneShotTimeIntervalMetric getValidationToPresentMetric() {
        return this.validationToPresentMetric;
    }

    public final boolean isAdPlaying$vungle_ads_release() {
        return this.adState == AdState.PLAYING || this.adState == AdState.IMPRESSION_LOGGED;
    }

    public VungleError isAdStateValidOnCanPlay() {
        if (this.adState == AdState.PLAYING) {
            return new InvalidAdStateError(Sdk.SDKError.Reason.AD_IS_PLAYING, "Current ad is playing");
        }
        if (this.adState == AdState.IMPRESSION_LOGGED) {
            return new InvalidAdStateError(Sdk.SDKError.Reason.AD_IS_PLAYING, "Current ad is playing, impression logged");
        }
        if (this.adState == AdState.READY) {
            return null;
        }
        return new InvalidAdStateError(Sdk.SDKError.Reason.AD_NOT_LOADED, this.adState + " is not READY");
    }

    public final boolean isErrorTerminal$vungle_ads_release(int errorCode) {
        return this.adState == AdState.READY && errorCode == 304;
    }

    public abstract boolean isValidAdSize(VungleAdSize adSize);

    public abstract boolean isValidAdTypeForPlacement(Placement placement);

    /* JADX WARN: Multi-variable type inference failed */
    public final void loadAd(String placementId, String adMarkup, VungleCSBData csbData, AdLoaderCallback adLoaderCallback) throws Throwable {
        Sdk.SDKError.Reason reason;
        String str;
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adLoaderCallback, "adLoaderCallback");
        LogEntry logEntry = this.logEntry;
        if (logEntry != null) {
            logEntry.setAdState$vungle_ads_release(this.adState);
        }
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.LOAD_AD_API, 0L, this.logEntry, null, 10, null);
        TimeIntervalMetric timeIntervalMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_LOAD_TO_CALLBACK_ADO_DURATION_MS);
        this.loadMetric = timeIntervalMetric;
        timeIntervalMetric.markStart();
        this.adLoaderCallback = adLoaderCallback;
        if (!VungleAds.INSTANCE.isInitialized()) {
            adLoaderCallback.onFailure(new SdkNotInitialized(ErrorData.TT_DDL_MSG_NOT_INIT).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        Placement placement = ConfigManager.INSTANCE.getPlacement(placementId);
        if (placement != null) {
            this.placement = placement;
            if (!isValidAdTypeForPlacement(placement)) {
                adLoaderCallback.onFailure(new PlacementAdTypeMismatchError(placement.getReferenceId()).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                return;
            } else if (placement.getHeaderBidding() && ((str = adMarkup) == null || str.length() == 0)) {
                adLoaderCallback.onFailure(new EmptyBidPayloadError(placementId).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                return;
            }
        } else if (ConfigManager.INSTANCE.configLastValidatedTimestamp() != -1) {
            adLoaderCallback.onFailure(new PlacementNotFoundError(placementId).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        } else {
            placement = new Placement(placementId, false, (String) null, 6, (DefaultConstructorMarker) null);
            this.placement = placement;
        }
        VungleAdSize adSizeForAdRequest = getAdSizeForAdRequest();
        if (!isValidAdSize(adSizeForAdRequest)) {
            adLoaderCallback.onFailure(new InvalidBannerSizeError(adSizeForAdRequest != null ? adSizeForAdRequest.toString() : null).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        if (this.adState != AdState.NEW) {
            switch (WhenMappings.$EnumSwitchMapping$0[this.adState.ordinal()]) {
                case 1:
                    throw new NotImplementedError(null == true ? 1 : 0, 1, null == true ? 1 : 0);
                case 2:
                    reason = Sdk.SDKError.Reason.AD_IS_LOADING;
                    break;
                case 3:
                    reason = Sdk.SDKError.Reason.AD_ALREADY_LOADED;
                    break;
                case 4:
                    reason = Sdk.SDKError.Reason.AD_IS_PLAYING;
                    break;
                case 5:
                    reason = Sdk.SDKError.Reason.AD_IS_PLAYING;
                    break;
                case 6:
                    reason = Sdk.SDKError.Reason.AD_CONSUMED;
                    break;
                case 7:
                    reason = Sdk.SDKError.Reason.AD_ALREADY_FAILED;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            adLoaderCallback.onFailure(new InvalidAdStateError(reason, this.adState + " state is incorrect for load").setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        TimeIntervalMetric timeIntervalMetric2 = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_REQUEST_TO_CALLBACK_ADO_DURATION_MS);
        this.requestMetric = timeIntervalMetric2;
        timeIntervalMetric2.markStart();
        String str2 = adMarkup;
        if (str2 != null && str2.length() != 0) {
            try {
                Json json2 = json;
                KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(json2.getSerializersModule(), Reflection.typeOf(BidPayload.class));
                Intrinsics.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                this.bidPayload = (BidPayload) json2.decodeFromString(kSerializerSerializer, adMarkup);
            } catch (IllegalArgumentException e) {
                adLoaderCallback.onFailure(new AdMarkupInvalidError("Unable to decode payload into BidPayload object. Error: " + e.getLocalizedMessage()).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                return;
            } catch (Throwable th) {
                adLoaderCallback.onFailure(new AdMarkupJsonError(th.getLocalizedMessage()).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                return;
            }
        }
        setAdState(AdState.LOADING);
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        final Context context = this.context;
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<OMInjector>() { // from class: com.vungle.ads.internal.AdInternal$loadAd$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.omsdk.OMInjector, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final OMInjector invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(OMInjector.class);
            }
        });
        ServiceLocator.Companion companion2 = ServiceLocator.INSTANCE;
        final Context context2 = this.context;
        Lazy lazy2 = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<SDKExecutors>() { // from class: com.vungle.ads.internal.AdInternal$loadAd$$inlined$inject$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.SDKExecutors, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final SDKExecutors invoke() {
                return ServiceLocator.INSTANCE.getInstance(context2).getService(SDKExecutors.class);
            }
        });
        ServiceLocator.Companion companion3 = ServiceLocator.INSTANCE;
        final Context context3 = this.context;
        Lazy lazy3 = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<PathProvider>() { // from class: com.vungle.ads.internal.AdInternal$loadAd$$inlined$inject$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.util.PathProvider, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PathProvider invoke() {
                return ServiceLocator.INSTANCE.getInstance(context3).getService(PathProvider.class);
            }
        });
        ServiceLocator.Companion companion4 = ServiceLocator.INSTANCE;
        final Context context4 = this.context;
        Lazy lazy4 = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<Downloader>() { // from class: com.vungle.ads.internal.AdInternal$loadAd$$inlined$inject$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.downloader.Downloader, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Downloader invoke() {
                return ServiceLocator.INSTANCE.getInstance(context4).getService(Downloader.class);
            }
        });
        if (csbData != null) {
            VungleError vungleErrorValidateCSBData = validateCSBData(csbData);
            if (vungleErrorValidateCSBData != null) {
                adLoaderCallback.onFailure(vungleErrorValidateCSBData.setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                return;
            }
            LogEntry logEntry2 = this.logEntry;
            if (logEntry2 != null) {
                logEntry2.setAdLoadType$vungle_ads_release(csbData.getPhase() == 2 ? 4L : 3L);
            }
            this.baseAdLoader = new CSBAdLoader(this.context, getVungleApiClient(), m44752loadAd$lambda3(lazy2), m44751loadAd$lambda2(lazy), m44754loadAd$lambda5(lazy4), m44753loadAd$lambda4(lazy3), new AdRequest(placement, null, adSizeForAdRequest, csbData));
        } else if (str2 == null || str2.length() == 0) {
            LogEntry logEntry3 = this.logEntry;
            if (logEntry3 != null) {
                logEntry3.setAdLoadType$vungle_ads_release(1L);
            }
            this.baseAdLoader = new DefaultAdLoader(this.context, getVungleApiClient(), m44752loadAd$lambda3(lazy2), m44751loadAd$lambda2(lazy), m44754loadAd$lambda5(lazy4), m44753loadAd$lambda4(lazy3), new AdRequest(placement, null, adSizeForAdRequest, null));
        } else {
            LogEntry logEntry4 = this.logEntry;
            if (logEntry4 != null) {
                logEntry4.setAdLoadType$vungle_ads_release(2L);
            }
            this.baseAdLoader = new RealtimeAdLoader(this.context, getVungleApiClient(), m44752loadAd$lambda3(lazy2), m44751loadAd$lambda2(lazy), m44754loadAd$lambda5(lazy4), m44753loadAd$lambda4(lazy3), new AdRequest(placement, this.bidPayload, adSizeForAdRequest, null));
        }
        BaseAdLoader baseAdLoader = this.baseAdLoader;
        if (baseAdLoader != null) {
            baseAdLoader.setLogEntry$vungle_ads_release(this.logEntry);
        }
        BaseAdLoader baseAdLoader2 = this.baseAdLoader;
        if (baseAdLoader2 != null) {
            baseAdLoader2.loadAd(this);
        }
    }

    public void onAdLoaded$vungle_ads_release(AdPayload advertisement) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
    }

    @Override // com.vungle.ads.internal.load.AdLoaderCallback
    public void onFailure(VungleError error) throws Throwable {
        Intrinsics.checkNotNullParameter(error, "error");
        setAdState(AdState.ERROR);
        TimeIntervalMetric timeIntervalMetric = this.loadMetric;
        if (timeIntervalMetric != null) {
            timeIntervalMetric.setMetricType(Sdk.SDKMetric.SDKMetricType.AD_LOAD_TO_FAIL_CALLBACK_DURATION_MS);
            timeIntervalMetric.markEnd();
            AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(timeIntervalMetric, this.logEntry, error.getCode() + '-' + error.getErrorMessage());
        }
        AdLoaderCallback adLoaderCallback = this.adLoaderCallback;
        if (adLoaderCallback != null) {
            adLoaderCallback.onFailure(error);
        }
    }

    @Override // com.vungle.ads.internal.load.AdLoaderCallback
    public void onSuccess(AdPayload advertisement) throws Throwable {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        this.advertisement = advertisement;
        setAdState(AdState.READY);
        adLoadedAndUpdateConfigure$vungle_ads_release(advertisement);
        onAdLoaded$vungle_ads_release(advertisement);
        AdLoaderCallback adLoaderCallback = this.adLoaderCallback;
        if (adLoaderCallback != null) {
            adLoaderCallback.onSuccess(advertisement);
        }
        TimeIntervalMetric timeIntervalMetric = this.loadMetric;
        if (timeIntervalMetric != null) {
            if (!advertisement.adLoadOptimizationEnabled()) {
                timeIntervalMetric.setMetricType(Sdk.SDKMetric.SDKMetricType.AD_LOAD_TO_CALLBACK_DURATION_MS);
            }
            timeIntervalMetric.markEnd();
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, timeIntervalMetric, this.logEntry, (String) null, 4, (Object) null);
        }
        TimeIntervalMetric timeIntervalMetric2 = this.requestMetric;
        if (timeIntervalMetric2 != null) {
            if (!advertisement.adLoadOptimizationEnabled()) {
                timeIntervalMetric2.setMetricType(Sdk.SDKMetric.SDKMetricType.AD_REQUEST_TO_CALLBACK_DURATION_MS);
            }
            timeIntervalMetric2.markEnd();
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, timeIntervalMetric2, this.logEntry, (String) null, 4, (Object) null);
            ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
            final Context context = this.context;
            Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<TpatSender>() { // from class: com.vungle.ads.internal.AdInternal$onSuccess$lambda-11$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.TpatSender, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final TpatSender invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(TpatSender.class);
                }
            });
            List tpatUrls$default = AdPayload.getTpatUrls$default(advertisement, Constants.AD_LOAD_DURATION, String.valueOf(timeIntervalMetric2.getValue()), null, 4, null);
            if (tpatUrls$default != null) {
                Iterator it = tpatUrls$default.iterator();
                while (it.hasNext()) {
                    TpatSender.sendTpat$default(m44755onSuccess$lambda11$lambda9(lazy), new TpatRequest.Builder((String) it.next()).tpatKey(Constants.AD_LOAD_DURATION).withLogEntry(this.logEntry).build(), false, 2, null);
                }
            }
        }
    }

    public final void play(Context context, final AdPlayCallback adPlayCallback) throws Throwable {
        LogEntry logEntry;
        Long adLoadType$vungle_ads_release;
        WeakReference<Context> weakReference;
        Long adLoadType$vungle_ads_release2;
        Intrinsics.checkNotNullParameter(adPlayCallback, "adPlayCallback");
        LogEntry logEntry2 = this.logEntry;
        if ((logEntry2 != null && (adLoadType$vungle_ads_release2 = logEntry2.getAdLoadType()) != null && adLoadType$vungle_ads_release2.longValue() == 3) || ((logEntry = this.logEntry) != null && (adLoadType$vungle_ads_release = logEntry.getAdLoadType()) != null && adLoadType$vungle_ads_release.longValue() == 4)) {
            sendWinURL();
        }
        this.showToValidationMetric.markStart();
        if (context != null) {
            weakReference = new WeakReference<>(context);
        } else {
            weakReference = null;
        }
        this.playContext = weakReference;
        VungleError vungleErrorCanPlayAd = canPlayAd(true);
        if (vungleErrorCanPlayAd != null) {
            adPlayCallback.onFailure(vungleErrorCanPlayAd);
            if (isErrorTerminal$vungle_ads_release(vungleErrorCanPlayAd.getCode())) {
                setAdState(AdState.ERROR);
                return;
            }
            return;
        }
        AdPayload adPayload = this.advertisement;
        if (adPayload == null) {
            return;
        }
        AdPlayCallbackWrapper adPlayCallbackWrapper = new AdPlayCallbackWrapper(adPlayCallback) { // from class: com.vungle.ads.internal.AdInternal$play$callbackWrapper$1
            @Override // com.vungle.ads.internal.presenter.AdPlayCallbackWrapper, com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdEnd(String id) {
                this.setAdState(AdInternal.AdState.FINISHED);
                super.onAdEnd(id);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallbackWrapper, com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdImpression(String id) {
                this.setAdState(AdInternal.AdState.IMPRESSION_LOGGED);
                super.onAdImpression(id);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallbackWrapper, com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdStart(String id) {
                this.setAdState(AdInternal.AdState.PLAYING);
                this.getValidationToPresentMetric().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.getValidationToPresentMetric(), this.getLogEntry(), (String) null, 4, (Object) null);
                super.onAdStart(id);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallbackWrapper, com.vungle.ads.internal.presenter.AdPlayCallback
            public void onFailure(VungleError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.setAdState(AdInternal.AdState.ERROR);
                super.onFailure(error);
            }
        };
        cancelDownload$vungle_ads_release();
        renderAd$vungle_ads_release(adPlayCallbackWrapper, adPayload);
    }

    public void renderAd$vungle_ads_release(final AdPlayCallback listener, AdPayload advertisement) throws Throwable {
        Context context;
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        AdActivity.Companion companion = AdActivity.INSTANCE;
        final Placement placement = this.placement;
        companion.setEventListener$vungle_ads_release(new AdEventListener(listener, placement) { // from class: com.vungle.ads.internal.AdInternal$renderAd$1
        });
        AdActivity.INSTANCE.setAdvertisement$vungle_ads_release(advertisement);
        AdActivity.INSTANCE.setBidPayload$vungle_ads_release(this.bidPayload);
        WeakReference<Context> weakReference = this.playContext;
        if (weakReference == null || (context = weakReference.get()) == null) {
            context = this.context;
        }
        Intrinsics.checkNotNullExpressionValue(context, "playContext?.get() ?: context");
        Placement placement2 = this.placement;
        if (placement2 == null) {
            return;
        }
        Intent intentCreateIntent = AdActivity.INSTANCE.createIntent(context, placement2.getReferenceId(), advertisement.eventId());
        if (!ActivityManager.INSTANCE.isForeground()) {
            Logger.INSTANCE.m43467d(TAG, "The ad activity is in background on play, log AD_VISIBILITY_INVISIBLE.");
            intentCreateIntent.putExtra(AdActivity.AD_INVISIBLE_LOGGED_KEY, true);
            AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
            SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
            singleValueMetric.setValue(1L);
            AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, this.logEntry, (String) null, 4, (Object) null);
        }
        this.showToValidationMetric.markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.showToValidationMetric, this.logEntry, (String) null, 4, (Object) null);
        this.validationToPresentMetric.markStart();
        ActivityManager.INSTANCE.startWhenForeground(context, null, intentCreateIntent, null);
    }

    public final void sendLossURL() {
        List<String> lossUrls;
        if (!this.lossUrlSent.compareAndSet(false, true)) {
            Logger.INSTANCE.m43467d(TAG, "Loss URL already sent, skipping");
            return;
        }
        AdPayload adPayload = this.advertisement;
        if (adPayload == null || (lossUrls = adPayload.getLossUrls()) == null) {
            return;
        }
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        final Context context = this.context;
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<TpatSender>() { // from class: com.vungle.ads.internal.AdInternal$sendLossURL$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.TpatSender, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final TpatSender invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(TpatSender.class);
            }
        });
        for (String str : lossUrls) {
            if (FileUtility.INSTANCE.isValidUrl(str)) {
                TpatSender.sendTpat$default(m44756sendLossURL$lambda15(lazy), new TpatRequest.Builder(str).priorityRetry(true).build(), false, 2, null);
            } else {
                Logger.INSTANCE.m43471w(TAG, "Invalid loss URL skipped: " + str);
            }
        }
    }

    public final void sendWinURL() {
        List<String> winUrls;
        if (!this.winUrlSent.compareAndSet(false, true)) {
            Logger.INSTANCE.m43467d(TAG, "Win URL already sent, skipping");
            return;
        }
        AdPayload adPayload = this.advertisement;
        if (adPayload == null || (winUrls = adPayload.getWinUrls()) == null) {
            return;
        }
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        final Context context = this.context;
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<TpatSender>() { // from class: com.vungle.ads.internal.AdInternal$sendWinURL$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.TpatSender, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final TpatSender invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(TpatSender.class);
            }
        });
        for (String str : winUrls) {
            if (FileUtility.INSTANCE.isValidUrl(str)) {
                TpatSender.sendTpat$default(m44757sendWinURL$lambda13(lazy), new TpatRequest.Builder(str).priorityRetry(true).build(), false, 2, null);
            } else {
                Logger.INSTANCE.m43471w(TAG, "Invalid win URL skipped: " + str);
            }
        }
    }

    public final void setAdState(AdState value) {
        AdPayload adPayload;
        String strEventId;
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.isTerminalState() && (adPayload = this.advertisement) != null && (strEventId = adPayload.eventId()) != null) {
            ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
            final Context context = this.context;
            m44750_set_adState_$lambda1$lambda0(LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<JobRunner>() { // from class: com.vungle.ads.internal.AdInternal$_set_adState_$lambda-1$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.task.JobRunner, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final JobRunner invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(JobRunner.class);
                }
            })).execute(CleanupJob.INSTANCE.makeJobInfo(strEventId));
        }
        this.adState = this.adState.transitionTo(value);
        LogEntry logEntry = this.logEntry;
        if (logEntry == null) {
            return;
        }
        logEntry.setAdState$vungle_ads_release(this.adState);
    }

    public final void setAdvertisement(AdPayload adPayload) {
        this.advertisement = adPayload;
    }

    public final void setBidPayload(BidPayload bidPayload) {
        this.bidPayload = bidPayload;
    }

    public final void setLogEntry$vungle_ads_release(LogEntry logEntry) {
        this.logEntry = logEntry;
    }

    public final void setPlacement(Placement placement) {
        this.placement = placement;
    }
}

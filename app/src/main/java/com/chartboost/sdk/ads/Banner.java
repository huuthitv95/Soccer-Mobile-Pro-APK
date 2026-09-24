package com.chartboost.sdk.ads;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.callbacks.BannerCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.impl.AbstractC3857k;
import com.chartboost.sdk.impl.C3678c4;
import com.chartboost.sdk.impl.C3699d2;
import com.chartboost.sdk.impl.C3745f2;
import com.chartboost.sdk.impl.C4048sb;
import com.chartboost.sdk.impl.C4058t;
import com.chartboost.sdk.impl.InterfaceC3752f9;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.mediationsdk.C12357j;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m43474d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u00010B3\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b.\u0010/J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0005R\u001a\u0010\u0014\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u00061"}, m43475d2 = {"Lcom/chartboost/sdk/ads/Banner;", "Landroid/widget/FrameLayout;", "Lcom/chartboost/sdk/ads/Ad;", "", "postSessionNotStartedInMainThread", "()V", "cache", "", "bidResponse", "(Ljava/lang/String;)V", "show", "clearCache", "", "isCached", "()Z", "", "getBannerWidth", "()I", "getBannerHeight", "detach", FirebaseAnalytics.Param.LOCATION, "Ljava/lang/String;", "getLocation", "()Ljava/lang/String;", "Lcom/chartboost/sdk/ads/Banner$BannerSize;", "size", "Lcom/chartboost/sdk/ads/Banner$BannerSize;", "Lcom/chartboost/sdk/callbacks/BannerCallback;", "callback", "Lcom/chartboost/sdk/callbacks/BannerCallback;", "Lcom/chartboost/sdk/Mediation;", "mediation", "Lcom/chartboost/sdk/Mediation;", "getMediation", "()Lcom/chartboost/sdk/Mediation;", "Lcom/chartboost/sdk/impl/d2;", "api$delegate", "Lkotlin/Lazy;", "getApi", "()Lcom/chartboost/sdk/impl/d2;", "api", "Lcom/chartboost/sdk/impl/f9;", "adController", "Lcom/chartboost/sdk/impl/f9;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/chartboost/sdk/ads/Banner$BannerSize;Lcom/chartboost/sdk/callbacks/BannerCallback;Lcom/chartboost/sdk/Mediation;)V", "BannerSize", "ChartboostMonetization-9.11.1_productionRelease"}, m43476k = 1, m43477mv = {1, 9, 0})
public final class Banner extends FrameLayout implements InterfaceC3614Ad {
    private final InterfaceC3752f9 adController;

    /* JADX INFO: renamed from: api$delegate, reason: from kotlin metadata */
    private final Lazy api;
    private final BannerCallback callback;
    private final String location;
    private final Mediation mediation;
    private final BannerSize size;

    @Metadata(m43474d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m43475d2 = {"Lcom/chartboost/sdk/ads/Banner$BannerSize;", "", "width", "", "height", "(Ljava/lang/String;III)V", "getHeight", "()I", "getWidth", "STANDARD", "MEDIUM", C12357j.f31266d, "ChartboostMonetization-9.11.1_productionRelease"}, m43476k = 1, m43477mv = {1, 9, 0}, m43479xi = 48)
    public enum BannerSize {
        STANDARD(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50),
        MEDIUM(300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION),
        LEADERBOARD(728, 90);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
        private final int height;
        private final int width;

        BannerSize(int i, int i2) {
            this.width = i;
            this.height = i2;
        }

        public static EnumEntries<BannerSize> getEntries() {
            return $ENTRIES;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.ads.Banner$a */
    public static final class C3615a extends Lambda implements Function0 {
        public C3615a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3699d2 invoke() {
            return AbstractC3857k.m18301a(Banner.this.getMediation());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.ads.Banner$b */
    public static final class C3616b extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f13391b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f13393d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3616b(String str, Continuation continuation) {
            super(2, continuation);
            this.f13393d = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C3616b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Banner.this.new C3616b(this.f13393d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f13391b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C4058t c4058t = new C4058t(Boxing.boxInt(Banner.this.size.getWidth()), Boxing.boxInt(Banner.this.size.getHeight()));
                InterfaceC3752f9 interfaceC3752f9 = Banner.this.adController;
                Context context = Banner.this.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                String str = this.f13393d;
                this.f13391b = 1;
                if (interfaceC3752f9.mo17665a(context, str, c4058t, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ((Result) obj).getValue();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.ads.Banner$c */
    public static final class C3617c extends Lambda implements Function0 {
        public C3617c() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m16759a() {
            Banner.this.callback.onAdLoaded(new CacheEvent(null, Banner.this), new CacheError(CacheError.Code.SESSION_NOT_STARTED, null, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m16759a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.ads.Banner$d */
    public static final class C3618d extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f13395b;

        public C3618d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C3618d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Banner.this.new C3618d(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f13395b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC3752f9 interfaceC3752f9 = Banner.this.adController;
                Context context = Banner.this.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                this.f13395b = 1;
                if (interfaceC3752f9.mo17666a(context, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ((Result) obj).getValue();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Banner(Context context, String location, BannerSize size, BannerCallback callback, Mediation mediation) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.location = location;
        this.size = size;
        this.callback = callback;
        this.mediation = mediation;
        this.api = LazyKt.lazy(new C3615a());
        this.adController = new C3745f2(getApi(), callback, this, C3678c4.f13658b);
    }

    public /* synthetic */ Banner(Context context, String str, BannerSize bannerSize, BannerCallback bannerCallback, Mediation mediation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, bannerSize, bannerCallback, (i & 16) != 0 ? null : mediation);
    }

    private final C3699d2 getApi() {
        return (C3699d2) this.api.getValue();
    }

    private final void postSessionNotStartedInMainThread() {
        try {
            C3678c4.f13658b.mo17024d().mo18319c().mo18805a(new C3617c());
        } catch (Exception e) {
            C4048sb.m19411b("Banner ad cannot post session not started callback " + e, (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.ads.InterfaceC3614Ad
    public void cache() {
        if (Chartboost.isSdkStarted()) {
            getApi().m17245a(this, this.callback);
        } else {
            postSessionNotStartedInMainThread();
        }
    }

    @Override // com.chartboost.sdk.ads.InterfaceC3614Ad
    public void cache(String bidResponse) {
        if (Chartboost.isSdkStarted()) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new C3616b(bidResponse, null), 3, null);
        } else {
            postSessionNotStartedInMainThread();
        }
    }

    @Override // com.chartboost.sdk.ads.InterfaceC3614Ad
    public void clearCache() {
        this.adController.mo17668c();
    }

    public final void detach() {
        if (Chartboost.isSdkStarted()) {
            this.adController.mo17607b();
        }
    }

    public final int getBannerHeight() {
        return this.size.getHeight();
    }

    public final int getBannerWidth() {
        return this.size.getWidth();
    }

    @Override // com.chartboost.sdk.ads.InterfaceC3614Ad
    public String getLocation() {
        return this.location;
    }

    @Override // com.chartboost.sdk.ads.InterfaceC3614Ad
    public Mediation getMediation() {
        return this.mediation;
    }

    @Override // com.chartboost.sdk.ads.InterfaceC3614Ad
    @Deprecated(message = "The isCached() API will be removed in a future SDK release. Additional condition checks have been added to cache() and show() calls making this API redundant.")
    public boolean isCached() {
        return this.adController.mo17667a();
    }

    @Override // com.chartboost.sdk.ads.InterfaceC3614Ad
    public void show() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new C3618d(null), 3, null);
    }
}

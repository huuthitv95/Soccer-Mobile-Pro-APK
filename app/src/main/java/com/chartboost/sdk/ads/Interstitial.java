package com.chartboost.sdk.ads;

import android.content.Context;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.callbacks.InterstitialCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.impl.AbstractC3857k;
import com.chartboost.sdk.impl.C3678c4;
import com.chartboost.sdk.impl.C3777gb;
import com.chartboost.sdk.impl.C3794h5;
import com.chartboost.sdk.impl.C3800hb;
import com.chartboost.sdk.impl.C4048sb;
import com.chartboost.sdk.impl.InterfaceC3752f9;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
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
@Metadata(m43474d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b#\u0010$J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0005\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, m43475d2 = {"Lcom/chartboost/sdk/ads/Interstitial;", "Lcom/chartboost/sdk/ads/Ad;", "", "postSessionNotStartedInMainThread", "()V", "cache", "", "bidResponse", "(Ljava/lang/String;)V", "show", "clearCache", "", "isCached", "()Z", FirebaseAnalytics.Param.LOCATION, "Ljava/lang/String;", "getLocation", "()Ljava/lang/String;", "Lcom/chartboost/sdk/callbacks/InterstitialCallback;", "callback", "Lcom/chartboost/sdk/callbacks/InterstitialCallback;", "Lcom/chartboost/sdk/Mediation;", "mediation", "Lcom/chartboost/sdk/Mediation;", "getMediation", "()Lcom/chartboost/sdk/Mediation;", "Lcom/chartboost/sdk/impl/gb;", "api$delegate", "Lkotlin/Lazy;", "getApi", "()Lcom/chartboost/sdk/impl/gb;", "api", "Lcom/chartboost/sdk/impl/f9;", "adController", "Lcom/chartboost/sdk/impl/f9;", "<init>", "(Ljava/lang/String;Lcom/chartboost/sdk/callbacks/InterstitialCallback;Lcom/chartboost/sdk/Mediation;)V", "ChartboostMonetization-9.11.1_productionRelease"}, m43476k = 1, m43477mv = {1, 9, 0})
public final class Interstitial implements InterfaceC3614Ad {
    private final InterfaceC3752f9 adController;

    /* JADX INFO: renamed from: api$delegate, reason: from kotlin metadata */
    private final Lazy api;
    private final InterstitialCallback callback;
    private final String location;
    private final Mediation mediation;

    /* JADX INFO: renamed from: com.chartboost.sdk.ads.Interstitial$a */
    public static final class C3619a extends Lambda implements Function0 {
        public C3619a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3777gb invoke() {
            return AbstractC3857k.m18302b(Interstitial.this.getMediation());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.ads.Interstitial$b */
    public static final class C3620b extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f13398b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Context f13400d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ String f13401e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3620b(Context context, String str, Continuation continuation) {
            super(2, continuation);
            this.f13400d = context;
            this.f13401e = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C3620b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Interstitial.this.new C3620b(this.f13400d, this.f13401e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f13398b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC3752f9 interfaceC3752f9 = Interstitial.this.adController;
                Context context = this.f13400d;
                String str = this.f13401e;
                this.f13398b = 1;
                if (InterfaceC3752f9.a.m17669a(interfaceC3752f9, context, str, null, this, 4, null) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.chartboost.sdk.ads.Interstitial$c */
    public static final class C3621c extends Lambda implements Function0 {
        public C3621c() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m16763a() {
            Interstitial.this.callback.onAdLoaded(new CacheEvent(null, Interstitial.this), new CacheError(CacheError.Code.SESSION_NOT_STARTED, null, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m16763a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.ads.Interstitial$d */
    public static final class C3622d extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f13403b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Context f13405d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3622d(Context context, Continuation continuation) {
            super(2, continuation);
            this.f13405d = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C3622d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Interstitial.this.new C3622d(this.f13405d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f13403b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC3752f9 interfaceC3752f9 = Interstitial.this.adController;
                Context context = this.f13405d;
                this.f13403b = 1;
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

    public Interstitial(String location, InterstitialCallback callback, Mediation mediation) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.location = location;
        this.callback = callback;
        this.mediation = mediation;
        this.api = LazyKt.lazy(new C3619a());
        this.adController = new C3800hb(getApi(), callback, this, C3678c4.f13658b);
    }

    public /* synthetic */ Interstitial(String str, InterstitialCallback interstitialCallback, Mediation mediation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interstitialCallback, (i & 4) != 0 ? null : mediation);
    }

    private final C3777gb getApi() {
        return (C3777gb) this.api.getValue();
    }

    private final void postSessionNotStartedInMainThread() {
        try {
            C3678c4.f13658b.mo17024d().mo18319c().mo18805a(new C3621c());
        } catch (Exception e) {
            C4048sb.m19411b("Interstitial ad cannot post session not started callback " + e, (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.ads.InterfaceC3614Ad
    public void cache() {
        if (Chartboost.isSdkStarted()) {
            getApi().m17799a(this, this.callback);
        } else {
            postSessionNotStartedInMainThread();
        }
    }

    @Override // com.chartboost.sdk.ads.InterfaceC3614Ad
    public void cache(String bidResponse) {
        Context contextM17855a = C3794h5.f14372a.m17855a();
        if (contextM17855a == null) {
            postSessionNotStartedInMainThread();
        } else {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new C3620b(contextM17855a, bidResponse, null), 3, null);
        }
    }

    @Override // com.chartboost.sdk.ads.InterfaceC3614Ad
    public void clearCache() {
        this.adController.mo17668c();
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
        Context contextM17855a = C3794h5.f14372a.m17855a();
        if (contextM17855a == null) {
            postSessionNotStartedInMainThread();
        } else {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new C3622d(contextM17855a, null), 3, null);
        }
    }
}

package com.chartboost.sdk.impl;

import android.view.View;
import com.iab.omid.library.chartboost.adsession.AdEvents;
import com.iab.omid.library.chartboost.adsession.AdSession;
import com.iab.omid.library.chartboost.adsession.media.Position;
import com.iab.omid.library.chartboost.adsession.media.VastProperties;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.oc */
/* JADX INFO: loaded from: classes3.dex */
public class C3961oc implements InterfaceC4101uk {

    /* JADX INFO: renamed from: i */
    public static final a f15659i = new a(null);

    /* JADX INFO: renamed from: j */
    public static final AtomicInteger f15660j = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC4013qk f15661a;

    /* JADX INFO: renamed from: b */
    public final AdSession f15662b;

    /* JADX INFO: renamed from: c */
    public final AdEvents f15663c;

    /* JADX INFO: renamed from: d */
    public boolean f15664d;

    /* JADX INFO: renamed from: e */
    public boolean f15665e;

    /* JADX INFO: renamed from: f */
    public EnumC4145wk f15666f;

    /* JADX INFO: renamed from: g */
    public int f15667g;

    /* JADX INFO: renamed from: h */
    public final CoroutineScope f15668h;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oc$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oc$b */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f15669a;

        static {
            int[] iArr = new int[EnumC4145wk.values().length];
            try {
                iArr[EnumC4145wk.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4145wk.STARTED_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4145wk.IMPRESSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC4145wk.STOPPED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f15669a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oc$c */
    public static final class c extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f15670b;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3961oc.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f15670b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                C3961oc.this.f15663c.loaded();
            } catch (Exception e) {
                C4048sb.m19410b("Signaling ad loaded for viewability failed.", e);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oc$d */
    public static final class d extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f15672b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ VastProperties f15674d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(VastProperties vastProperties, Continuation continuation) {
            super(2, continuation);
            this.f15674d = vastProperties;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3961oc.this.new d(this.f15674d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f15672b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                C3961oc.this.f15663c.loaded(this.f15674d);
            } catch (Exception e) {
                C4048sb.m19410b("Signaling video loaded for viewability failed.", e);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oc$e */
    public static final class e extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f15675b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Ref.BooleanRef f15677d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Ref.BooleanRef booleanRef, Continuation continuation) {
            super(2, continuation);
            this.f15677d = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3961oc.this.new e(this.f15677d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f15675b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                C3961oc.this.f15663c.impressionOccurred();
                C3961oc.this.f15664d = true;
                this.f15677d.element = true;
            } catch (Exception e) {
                C4048sb.m19410b("Counting the viewability impression failed.", e);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oc$f */
    public static final class f extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f15678b;

        public f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3961oc.this.new f(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f15678b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f15678b = 1;
                if (DelayKt.delay(100L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            try {
                C3961oc.this.f15662b.finish();
            } catch (Exception e) {
                C4048sb.m19410b("Finishing the viewability ad session failed.", e);
            }
            return Unit.INSTANCE;
        }
    }

    public C3961oc(InterfaceC4013qk manager, AdSession adSession, AdEvents adEvents, View adView) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(adSession, "adSession");
        Intrinsics.checkNotNullParameter(adEvents, "adEvents");
        Intrinsics.checkNotNullParameter(adView, "adView");
        this.f15661a = manager;
        this.f15662b = adSession;
        this.f15663c = adEvents;
        this.f15666f = EnumC4145wk.INIT;
        this.f15668h = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().getImmediate());
        this.f15667g = f15660j.incrementAndGet();
        m18912a(adView);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4101uk
    /* JADX INFO: renamed from: a */
    public void mo18910a() {
        m18914a(EnumC4145wk.STOPPED);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4101uk
    /* JADX INFO: renamed from: a */
    public void mo18911a(float f2) {
        InterfaceC4101uk.a.m19607a(this, f2);
    }

    /* JADX INFO: renamed from: a */
    public final void m18912a(View adView) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        try {
            this.f15662b.registerAdView(adView);
        } catch (Exception e2) {
            C4048sb.m19410b("Unable to register ad view.", e2);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4101uk
    /* JADX INFO: renamed from: a */
    public void mo18913a(View view, EnumC4057sk purpose) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        try {
            this.f15662b.addFriendlyObstruction(view, purpose.m19446b(), null);
        } catch (Exception e2) {
            C4048sb.m19410b("Adding a friendly obstruction failed.", e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m18914a(EnumC4145wk newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        if (this.f15661a.isActive()) {
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            int i = b.f15669a[newState.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return;
                        }
                        EnumC4145wk enumC4145wk = this.f15666f;
                        if (enumC4145wk != EnumC4145wk.INIT && enumC4145wk != EnumC4145wk.STOPPED) {
                            BuildersKt__Builders_commonKt.launch$default(this.f15668h, null, null, new f(null), 3, null);
                            this.f15665e = false;
                            booleanRef.element = true;
                        }
                    } else {
                        if (this.f15664d) {
                            return;
                        }
                        EnumC4145wk enumC4145wk2 = this.f15666f;
                        if (enumC4145wk2 == EnumC4145wk.STARTED || enumC4145wk2 == EnumC4145wk.STARTED_VIDEO) {
                            BuildersKt__Builders_commonKt.launch$default(this.f15668h, null, null, new e(booleanRef, null), 3, null);
                        }
                    }
                } else if (this.f15666f == EnumC4145wk.INIT) {
                    try {
                        this.f15662b.start();
                        VastProperties vastPropertiesCreateVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                        Intrinsics.checkNotNullExpressionValue(vastPropertiesCreateVastPropertiesForNonSkippableMedia, "createVastPropertiesForNonSkippableMedia(...)");
                        BuildersKt__Builders_commonKt.launch$default(this.f15668h, null, null, new d(vastPropertiesCreateVastPropertiesForNonSkippableMedia, null), 3, null);
                        this.f15665e = true;
                        booleanRef.element = true;
                    } catch (Exception e2) {
                        C4048sb.m19410b("Ad session start for viewability failed.", e2);
                    }
                }
            } else if (this.f15666f == EnumC4145wk.INIT) {
                try {
                    this.f15662b.start();
                    BuildersKt__Builders_commonKt.launch$default(this.f15668h, null, null, new c(null), 3, null);
                    this.f15665e = true;
                    booleanRef.element = true;
                } catch (Exception e3) {
                    C4048sb.m19410b("Ad session start for viewability failed.", e3);
                }
            }
            if (booleanRef.element) {
                this.f15666f = newState;
            }
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4101uk
    /* JADX INFO: renamed from: b */
    public void mo18915b() {
        m18914a(EnumC4145wk.STARTED);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4101uk
    /* JADX INFO: renamed from: c */
    public void mo18916c() {
        m18914a(EnumC4145wk.IMPRESSED);
    }

    /* JADX INFO: renamed from: d */
    public final CoroutineScope m18917d() {
        return this.f15668h;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m18918e() {
        return this.f15665e;
    }
}

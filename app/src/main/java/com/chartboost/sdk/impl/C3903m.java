package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.internal.interruption.InterruptionController;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C3903m extends FrameLayout implements InterfaceC3754fb, InterfaceC4175y6, InterfaceC4169y0, InterfaceC4074tf {

    /* JADX INFO: renamed from: a */
    public final C3825id f15271a;

    /* JADX INFO: renamed from: b */
    public InterfaceC3880l f15272b;

    /* JADX INFO: renamed from: c */
    public final EnumC4036s f15273c;

    /* JADX INFO: renamed from: d */
    public final Mediation f15274d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC3680c6 f15275e;

    /* JADX INFO: renamed from: f */
    public View f15276f;

    /* JADX INFO: renamed from: g */
    public boolean f15277g;

    /* JADX INFO: renamed from: h */
    public boolean f15278h;

    /* JADX INFO: renamed from: i */
    public GestureDetector f15279i;

    /* JADX INFO: renamed from: j */
    public boolean f15280j;

    /* JADX INFO: renamed from: k */
    public final C4081u0 f15281k;

    /* JADX INFO: renamed from: l */
    public C4162xf f15282l;

    /* JADX INFO: renamed from: m */
    public Job f15283m;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.m$a */
    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m18569a() {
            C3903m.this.f15271a.mo17321a(true);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18569a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.m$b */
    public static final class b extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f15285b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f15286c;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = C3903m.this.new b(continuation);
            bVar.f15286c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f15285b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.f15286c;
                long jM17982r = C3903m.this.f15271a.m17982r() * 1000;
                this.f15286c = coroutineScope2;
                this.f15285b = 1;
                if (DelayKt.delay(jM17982r, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope = coroutineScope2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.f15286c;
                ResultKt.throwOnFailure(obj);
            }
            if (CoroutineScopeKt.isActive(coroutineScope)) {
                C3903m.this.f15281k.m19523a(EnumC4147x0.TIMER, true);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3903m(Context context, C3825id multiRenderable, InterfaceC3880l interfaceC3880l, EnumC4036s adFormat, Mediation mediation, InterfaceC3680c6 densityProvider) {
        Object next;
        List<Object> listM17987w;
        InterfaceC4101uk interfaceC4101ukMo17380b;
        InterfaceC4101uk interfaceC4101ukMo17380b2;
        C3670bj c3670bjM19190o;
        C4008qf c4008qfM18336v;
        C3670bj c3670bjM19190o2;
        C3670bj c3670bjM19190o3;
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(multiRenderable, "multiRenderable");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(densityProvider, "densityProvider");
        this.f15271a = multiRenderable;
        this.f15272b = interfaceC3880l;
        this.f15273c = adFormat;
        this.f15274d = mediation;
        this.f15275e = densityProvider;
        Iterator it = multiRenderable.m17987w().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                c3670bjM19190o3 = ((AbstractC3860k2) next).m18336v().m19190o();
            }
        } while ((c3670bjM19190o3 != null ? c3670bjM19190o3.m16950a() : null) == null);
        AbstractC3860k2 abstractC3860k2 = (AbstractC3860k2) next;
        C4081u0 c4081u0 = new C4081u0(context, (abstractC3860k2 == null || (c4008qfM18336v = abstractC3860k2.m18336v()) == null || (c3670bjM19190o2 = c4008qfM18336v.m19190o()) == null) ? null : c3670bjM19190o2.m16950a(), this.f15273c, this.f15271a.m17981q(), this.f15274d);
        this.f15281k = c4081u0;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (this.f15271a.m17981q().m20001c()) {
            this.f15271a.mo17326j();
        } else {
            AbstractC3986pf.m19064a(this.f15271a, 0.0f, 1, null);
        }
        addView(c4081u0, layoutParams);
        InterruptionController interruptionController = InterruptionController.f17246a;
        interruptionController.m20233a((InterfaceC3754fb) this);
        interruptionController.m20234a((InterfaceC4175y6) this);
        c4081u0.setAdViewOverlayListener(this);
        this.f15271a.m19066a(this);
        View viewMo17327k = this.f15271a.mo17327k();
        if (viewMo17327k != null) {
            m18546a(viewMo17327k);
        }
        m18563o();
        AbstractC3860k2 abstractC3860k2M17984t = this.f15271a.m17984t();
        if (abstractC3860k2M17984t != null && ((c3670bjM19190o = abstractC3860k2M17984t.m18336v().m19190o()) == null || c3670bjM19190o.m16955f())) {
            m18543a(this, this, false, 2, null);
        }
        for (Object obj : this.f15271a.m17987w()) {
            if (obj instanceof C3716dj) {
                C3825id c3825idM17336z = ((C3716dj) obj).m17336z();
                if (c3825idM17336z != null && (listM17987w = c3825idM17336z.m17987w()) != null) {
                    for (Object obj2 : listM17987w) {
                        if ((obj2 instanceof InterfaceC4079tk) && (interfaceC4101ukMo17380b = ((InterfaceC4079tk) obj2).mo17380b()) != null) {
                            this.f15281k.m19522a(interfaceC4101ukMo17380b);
                        }
                    }
                }
            } else if ((obj instanceof InterfaceC4079tk) && (interfaceC4101ukMo17380b2 = ((InterfaceC4079tk) obj).mo17380b()) != null) {
                this.f15281k.m19522a(interfaceC4101ukMo17380b2);
            }
        }
    }

    public /* synthetic */ C3903m(Context context, C3825id c3825id, InterfaceC3880l interfaceC3880l, EnumC4036s enumC4036s, Mediation mediation, InterfaceC3680c6 interfaceC3680c6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, c3825id, interfaceC3880l, (i & 8) != 0 ? EnumC4036s.BANNER : enumC4036s, mediation, (i & 32) != 0 ? new C4130w5(context) : interfaceC3680c6);
    }

    /* JADX INFO: renamed from: a */
    public static final void m18542a(C3903m this$0, View adView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adView, "$adView");
        this$0.m18550b(adView);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18543a(C3903m c3903m, View view, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        c3903m.m18547a(view, z);
    }

    /* JADX INFO: renamed from: b */
    public static final void m18545b(C3903m this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "$view");
        this$0.m18550b(view);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4074tf
    /* JADX INFO: renamed from: a */
    public void mo17315a() {
        if (!m18559k()) {
            InterruptionController.f17246a.m20231a();
        }
        AbstractC3860k2 abstractC3860k2M17984t = this.f15271a.m17984t();
        if (abstractC3860k2M17984t != null) {
            abstractC3860k2M17984t.mo17319a(EnumC3737eh.AD_COMPLETE);
        }
        if (this.f15271a.mo17325h()) {
            View viewMo17327k = this.f15271a.mo17327k();
            if (viewMo17327k != null) {
                this.f15271a.m17979c(false);
                m18546a(viewMo17327k);
                if (!this.f15281k.m19531c()) {
                    this.f15281k.m19534e();
                }
                m18563o();
                m18566r();
            }
            this.f15271a.m17989y();
            AbstractC3860k2 abstractC3860k2M17984t2 = this.f15271a.m17984t();
            if (abstractC3860k2M17984t2 != null) {
                C3670bj c3670bjM19190o = abstractC3860k2M17984t2.m18336v().m19190o();
                m18547a(this, c3670bjM19190o != null ? c3670bjM19190o.m16955f() : true);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m18546a(final View view) {
        removeView(this.f15276f);
        this.f15276f = view;
        super.addView(view, 0, new FrameLayout.LayoutParams(-1, -1));
        if (this.f15271a.m17984t() instanceof C3718dl) {
            post(new Runnable() { // from class: com.chartboost.sdk.impl.m$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    C3903m.m18542a(this.f$0, view);
                }
            });
        }
        m18563o();
    }

    /* JADX INFO: renamed from: a */
    public final void m18547a(View view, boolean z) {
        this.f15279i = z ? new GestureDetector(view.getContext(), new C3926n(0.0f, new a(), 1, null)) : null;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4074tf
    /* JADX INFO: renamed from: a */
    public void mo17320a(EnumC3895le request) {
        Intrinsics.checkNotNullParameter(request, "request");
        InterfaceC3880l interfaceC3880l = this.f15272b;
        if (interfaceC3880l != null) {
            interfaceC3880l.mo18168a(request);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3754fb
    /* JADX INFO: renamed from: a */
    public void mo17688a(Set activeInterruptions) {
        Intrinsics.checkNotNullParameter(activeInterruptions, "activeInterruptions");
        if (activeInterruptions.isEmpty()) {
            m18562n();
        } else {
            m18561m();
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4169y0
    /* JADX INFO: renamed from: a */
    public void mo18548a(boolean z) {
        if (z) {
            this.f15271a.mo17326j();
        } else {
            AbstractC3986pf.m19064a(this.f15271a, 0.0f, 1, null);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4169y0
    /* JADX INFO: renamed from: b */
    public void mo18549b() {
        List listEmptyList;
        List listEmptyList2;
        InterfaceC3880l interfaceC3880l;
        C4188yj c4188yjM17311B;
        AbstractC3860k2 abstractC3860k2M17984t = this.f15271a.m17984t();
        if (abstractC3860k2M17984t == null) {
            C4048sb.m19417e("CTA clicked but currentAd is null.", null, 2, null);
            return;
        }
        C3716dj c3716dj = abstractC3860k2M17984t instanceof C3716dj ? (C3716dj) abstractC3860k2M17984t : null;
        abstractC3860k2M17984t.mo17321a(true);
        C3670bj c3670bjM19190o = abstractC3860k2M17984t.m18336v().m19190o();
        C3976p5 c3976p5M16950a = c3670bjM19190o != null ? c3670bjM19190o.m16950a() : null;
        if (c3976p5M16950a == null || (listEmptyList = c3976p5M16950a.m19025c()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (c3716dj == null || (c4188yjM17311B = c3716dj.m17311B()) == null || (listEmptyList2 = c4188yjM17311B.m20069b()) == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        if (!abstractC3860k2M17984t.m18335r().m17617a((AbstractC3724e4) new AbstractC3724e4.a(CollectionsKt.distinct(CollectionsKt.plus((Collection) listEmptyList, (Iterable) listEmptyList2))), true) || (interfaceC3880l = this.f15272b) == null) {
            return;
        }
        interfaceC3880l.mo18166a();
    }

    /* JADX INFO: renamed from: b */
    public final void m18550b(View view) {
        AbstractC3860k2 abstractC3860k2M17984t = this.f15271a.m17984t();
        if (abstractC3860k2M17984t instanceof C3718dl) {
            C4008qf c4008qfM18336v = ((C3718dl) abstractC3860k2M17984t).m18336v();
            if (c4008qfM18336v.m19183h() == C4008qf.b.FILL) {
                return;
            }
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            if (width <= 0 || height <= 0) {
                return;
            }
            C3933n6 c3933n6M19345b = C4030rf.f16185a.m19345b(c4008qfM18336v, this.f15275e, width, height);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(c3933n6M19345b.m18767b(), c3933n6M19345b.m18766a());
            layoutParams.gravity = 17;
            view.setLayoutParams(layoutParams);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4074tf
    /* JADX INFO: renamed from: b */
    public void mo17322b(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (error instanceof ChartboostError.Render.WebViewMraidUnload) {
            C4048sb.m19408a("MRAID unload() called. Skipping the current renderable.", (Throwable) null, 2, (Object) null);
            Job job = this.f15283m;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            mo18552d();
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4175y6
    /* JADX INFO: renamed from: b */
    public void mo17338b(boolean z) {
        this.f15271a.m17978b(z);
        this.f15281k.m19539g(this.f15271a.m17988x());
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4169y0
    /* JADX INFO: renamed from: c */
    public void mo18551c() {
        this.f15271a.m17979c(true);
        AbstractC3860k2 abstractC3860k2M17984t = this.f15271a.m17984t();
        if (abstractC3860k2M17984t != null) {
            abstractC3860k2M17984t.mo17319a(EnumC3737eh.SKIP);
        }
        if (this.f15271a.mo17325h()) {
            m18565q();
        } else {
            m18556h();
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4169y0
    /* JADX INFO: renamed from: d */
    public void mo18552d() {
        Unit unit;
        InterfaceC3880l interfaceC3880l = this.f15272b;
        if (interfaceC3880l != null) {
            interfaceC3880l.mo18171c();
        }
        if (this.f15273c == EnumC4036s.REWARDED && !this.f15280j) {
            this.f15280j = true;
            InterfaceC3880l interfaceC3880l2 = this.f15272b;
            if (interfaceC3880l2 != null) {
                interfaceC3880l2.mo18172d();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C4048sb.m19417e("AdContainerListener null when onAdRewarded()", null, 2, null);
            }
        }
        this.f15281k.m19523a(EnumC4147x0.TIMER, false);
        if (this.f15271a.mo17325h()) {
            this.f15281k.m19523a(EnumC4147x0.SKIP, true);
        } else if (this.f15273c != EnumC4036s.BANNER) {
            this.f15281k.m19523a(EnumC4147x0.CLOSE, true);
        }
        AbstractC3986pf.m19065a(this.f15271a, EnumC3704d7.COUNTDOWN_COMPLETE, null, 2, null);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4169y0
    /* JADX INFO: renamed from: e */
    public void mo18553e() {
        m18556h();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4074tf
    /* JADX INFO: renamed from: f */
    public void mo17323f() {
        InterfaceC3880l interfaceC3880l = this.f15272b;
        if (interfaceC3880l != null) {
            interfaceC3880l.mo18166a();
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4169y0
    /* JADX INFO: renamed from: g */
    public void mo18554g() {
        InterfaceC3880l interfaceC3880l;
        String strM19779a = this.f15271a.m17981q().m20004f().m19779a();
        if (strM19779a.length() <= 0 || (interfaceC3880l = this.f15272b) == null) {
            return;
        }
        interfaceC3880l.mo18169a(strM19779a);
    }

    /* JADX INFO: renamed from: getAdContainerListener$ChartboostMonetization_9_11_1_productionRelease */
    public final InterfaceC3880l m18555xbb2925d0() {
        return this.f15272b;
    }

    public final C4162xf getRenderingContainerCalculator() {
        return this.f15282l;
    }

    /* JADX INFO: renamed from: h */
    public final void m18556h() {
        Unit unit;
        Unit unit2;
        Integer numM20007i = this.f15271a.m17981q().m20007i();
        int iIntValue = numM20007i != null ? numM20007i.intValue() : -1;
        if (this.f15273c == EnumC4036s.REWARDED && iIntValue < 0) {
            InterfaceC3880l interfaceC3880l = this.f15272b;
            if (interfaceC3880l != null) {
                interfaceC3880l.mo18172d();
                unit2 = Unit.INSTANCE;
            } else {
                unit2 = null;
            }
            if (unit2 == null) {
                C4048sb.m19417e("AdContainerListener null when onAdClosed()", null, 2, null);
            }
        }
        this.f15271a.mo17319a(EnumC3737eh.CLOSE);
        InterfaceC3880l interfaceC3880l2 = this.f15272b;
        if (interfaceC3880l2 != null) {
            interfaceC3880l2.mo18170b();
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19417e("AdContainerListener null when onAdClosed()", null, 2, null);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m18557i() {
        this.f15271a.mo17319a(EnumC3737eh.CLOSE);
        removeAllViews();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m18558j() {
        return this.f15281k.m19529b();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m18559k() {
        return this.f15271a.m17984t() instanceof C3718dl;
    }

    /* JADX INFO: renamed from: l */
    public final void m18560l() {
        this.f15271a.mo17328l();
    }

    /* JADX INFO: renamed from: m */
    public final void m18561m() {
        if (this.f15277g) {
            return;
        }
        this.f15277g = true;
        this.f15271a.mo17329m();
        this.f15281k.m19532d();
    }

    /* JADX INFO: renamed from: n */
    public final void m18562n() {
        if (this.f15277g) {
            this.f15277g = false;
            this.f15271a.mo17330n();
            m18567s();
            this.f15281k.m19539g(this.f15271a.m17988x());
            this.f15281k.m19540h();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m18563o() {
        C4168y c4168yM17981q;
        Number numberValueOf;
        C4008qf c4008qfM18336v;
        AbstractC3860k2 abstractC3860k2M17984t = this.f15271a.m17984t();
        if (abstractC3860k2M17984t != null && (c4008qfM18336v = abstractC3860k2M17984t.m18336v()) != null) {
            c4008qfM18336v.m19182g();
        }
        AbstractC3860k2 abstractC3860k2M17984t2 = this.f15271a.m17984t();
        if (abstractC3860k2M17984t2 == null || (c4168yM17981q = abstractC3860k2M17984t2.m18334q()) == null) {
            c4168yM17981q = this.f15271a.m17981q();
        }
        C4135wa c4135waM20004f = c4168yM17981q.m20004f();
        C3929n2 c3929n2M20008j = c4168yM17981q.m20008j();
        if (c3929n2M20008j == null) {
            c3929n2M20008j = C3929n2.f15419d.m18710a();
        }
        C4081u0 c4081u0 = this.f15281k;
        EnumC4125w0 enumC4125w0 = EnumC4125w0.TOP_LEFT;
        C4103v0 c4103v0 = new C4103v0(c3929n2M20008j.m18707e().m18767b(), c3929n2M20008j.m18707e().m18766a());
        C4103v0 c4103v1 = new C4103v0(c3929n2M20008j.m18708f().m18767b(), c3929n2M20008j.m18708f().m18766a());
        C4103v0 c4103v2 = new C4103v0(c3929n2M20008j.m18709g().m18767b(), c3929n2M20008j.m18709g().m18766a());
        String strM19780b = c4135waM20004f.m19780b();
        if (strM19780b == null) {
            strM19780b = "";
        }
        String str = strM19780b;
        String strM19779a = c4135waM20004f.m19779a();
        if (strM19779a == null) {
            strM19779a = "https://docs.chartboost.com/opt-out";
        }
        c4081u0.m19526a(true, enumC4125w0, c4103v0, c4103v1, c4103v2, str, strM19779a, (128 & 128) != 0 ? false : false);
        C4081u0 c4081u1 = this.f15281k;
        EnumC4147x0 enumC4147x0 = EnumC4147x0.VOLUME;
        c4081u1.m19523a(enumC4147x0, false);
        C4081u0 c4081u2 = this.f15281k;
        EnumC4147x0 enumC4147x1 = EnumC4147x0.TIMER;
        c4081u2.m19523a(enumC4147x1, false);
        C4081u0 c4081u3 = this.f15281k;
        EnumC4147x0 enumC4147x2 = EnumC4147x0.SKIP;
        c4081u3.m19523a(enumC4147x2, false);
        C4081u0 c4081u4 = this.f15281k;
        EnumC4147x0 enumC4147x3 = EnumC4147x0.CLOSE;
        c4081u4.m19523a(enumC4147x3, false);
        if (this.f15273c == EnumC4036s.BANNER) {
            return;
        }
        Integer numM20007i = c4168yM17981q.m20007i();
        int iIntValue = numM20007i != null ? numM20007i.intValue() : -1;
        EnumC4036s enumC4036s = this.f15273c;
        EnumC4036s enumC4036s2 = EnumC4036s.REWARDED;
        boolean z = (enumC4036s != enumC4036s2 || iIntValue >= 0) && (this.f15271a.mo17324g() > 0 || iIntValue > 0 || this.f15271a.m17983s() > 0);
        if (!this.f15281k.m19531c()) {
            if (z && !this.f15281k.m19531c()) {
                if (this.f15280j || iIntValue < 0) {
                    numberValueOf = this.f15271a.m17983s() > 0 ? Long.valueOf(this.f15271a.m17983s()) : Long.valueOf(this.f15271a.mo17324g());
                } else {
                    numberValueOf = Integer.valueOf(iIntValue);
                }
                this.f15281k.setTimer(numberValueOf.longValue() * 1000);
            } else if (this.f15273c == enumC4036s2 && iIntValue < 0) {
                this.f15281k.m19523a(enumC4147x1, false);
                this.f15281k.m19523a(enumC4147x2, false);
                this.f15281k.m19523a(enumC4147x3, true);
            } else if (this.f15271a.mo17325h()) {
                this.f15281k.m19523a(enumC4147x2, true);
                this.f15281k.m19523a(enumC4147x3, false);
            } else {
                this.f15281k.m19523a(enumC4147x2, false);
                this.f15281k.m19523a(enumC4147x3, true);
            }
        }
        this.f15281k.m19523a(enumC4147x0, (this.f15271a.m17984t() instanceof C3832ik) || (this.f15271a.m17984t() instanceof C3716dj));
        C3929n2 c3929n2M20009k = c4168yM17981q.m20009k();
        if (c3929n2M20009k == null) {
            c3929n2M20009k = C3929n2.f15419d.m18710a();
        }
        this.f15281k.m19525a(true, EnumC4125w0.TOP_RIGHT, new C4103v0(c3929n2M20009k.m18707e().m18767b(), c3929n2M20009k.m18707e().m18766a()), new C4103v0(c3929n2M20009k.m18708f().m18767b(), c3929n2M20009k.m18708f().m18766a()), new C4103v0(c3929n2M20009k.m18709g().m18767b(), c3929n2M20009k.m18709g().m18766a()));
        if (this.f15273c != enumC4036s2 || iIntValue < 0) {
            return;
        }
        this.f15281k.setRewardedMode(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterruptionController interruptionController = InterruptionController.f17246a;
        interruptionController.m20237b((InterfaceC3754fb) this);
        if (!m18559k()) {
            interruptionController.m20231a();
        }
        interruptionController.m20238b((InterfaceC4175y6) this);
        this.f15281k.m19521a();
        if (this.f15273c != EnumC4036s.BANNER) {
            this.f15271a.mo17319a(EnumC3737eh.CLOSE);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        GestureDetector gestureDetector = this.f15279i;
        return gestureDetector != null ? gestureDetector.onTouchEvent(event) : super.onTouchEvent(event);
    }

    /* JADX INFO: renamed from: p */
    public final void m18564p() {
        if (this.f15278h) {
            return;
        }
        this.f15278h = true;
        if (!m18559k()) {
            InterruptionController.f17246a.m20242h();
        }
        this.f15271a.m17989y();
        this.f15281k.m19539g(this.f15271a.m17988x());
        m18566r();
    }

    /* JADX INFO: renamed from: q */
    public final void m18565q() {
        View viewMo17327k = this.f15271a.mo17327k();
        if (viewMo17327k != null) {
            m18546a(viewMo17327k);
            m18563o();
            m18566r();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m18566r() {
        if (this.f15273c == EnumC4036s.BANNER) {
            return;
        }
        if (this.f15281k.m19531c() || this.f15271a.m17982r() <= 0) {
            this.f15281k.m19523a(EnumC4147x0.TIMER, true);
        } else {
            Job job = this.f15283m;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.f15283m = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new b(null), 3, null);
        }
        this.f15281k.m19540h();
    }

    /* JADX INFO: renamed from: s */
    public final void m18567s() {
        if (this.f15282l == null || this.f15273c == EnumC4036s.BANNER) {
            return;
        }
        AbstractC3860k2 abstractC3860k2M17984t = this.f15271a.m17984t();
        int iMo17334u = abstractC3860k2M17984t != null ? abstractC3860k2M17984t.mo17334u() : 0;
        C4162xf c4162xf = this.f15282l;
        C4140wf c4140wfM19961b = c4162xf != null ? c4162xf.m19961b() : null;
        Insets insetsM19802c = c4140wfM19961b != null ? c4140wfM19961b.m19802c() : null;
        if (insetsM19802c != null) {
            EnumC4002q9.a aVar = EnumC4002q9.f15890c;
            setPadding(aVar.m19151b(iMo17334u) ? 0 : insetsM19802c.left, aVar.m19153d(iMo17334u) ? 0 : insetsM19802c.top, aVar.m19152c(iMo17334u) ? 0 : insetsM19802c.right, aVar.m19150a(iMo17334u) ? 0 : insetsM19802c.bottom);
            final View view = this.f15276f;
            if (view != null) {
                post(new Runnable() { // from class: com.chartboost.sdk.impl.m$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3903m.m18545b(this.f$0, view);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: setAdContainerListener$ChartboostMonetization_9_11_1_productionRelease */
    public final void m18568x65adad44(InterfaceC3880l interfaceC3880l) {
        this.f15272b = interfaceC3880l;
    }

    public final void setRenderingContainerCalculator(C4162xf c4162xf) {
        this.f15282l = c4162xf;
        m18567s();
    }
}

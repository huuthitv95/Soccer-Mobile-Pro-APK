package com.chartboost.sdk.impl;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.bl */
/* JADX INFO: loaded from: classes9.dex */
public final class C3672bl {

    /* JADX INFO: renamed from: r */
    public static final a f13601r = new a(null);

    /* JADX INFO: renamed from: a */
    public final View f13602a;

    /* JADX INFO: renamed from: b */
    public final View f13603b;

    /* JADX INFO: renamed from: c */
    public final int f13604c;

    /* JADX INFO: renamed from: d */
    public final int f13605d;

    /* JADX INFO: renamed from: e */
    public final long f13606e;

    /* JADX INFO: renamed from: f */
    public final int f13607f;

    /* JADX INFO: renamed from: g */
    public final boolean f13608g;

    /* JADX INFO: renamed from: h */
    public b f13609h;

    /* JADX INFO: renamed from: i */
    public final WeakReference f13610i;

    /* JADX INFO: renamed from: j */
    public Job f13611j;

    /* JADX INFO: renamed from: k */
    public WeakReference f13612k;

    /* JADX INFO: renamed from: l */
    public ViewTreeObserver.OnPreDrawListener f13613l;

    /* JADX INFO: renamed from: m */
    public boolean f13614m;

    /* JADX INFO: renamed from: n */
    public Long f13615n;

    /* JADX INFO: renamed from: o */
    public boolean f13616o;

    /* JADX INFO: renamed from: p */
    public Long f13617p;

    /* JADX INFO: renamed from: q */
    public final Rect f13618q;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.bl$a */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final View m16988a(Context context, View view) {
            View rootView;
            Window window;
            View decorView;
            View viewFindViewById;
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewFindViewById = decorView.findViewById(R.id.content)) != null) {
                return viewFindViewById;
            }
            View viewFindViewById2 = (view == null || (rootView = view.getRootView()) == null) ? null : rootView.findViewById(R.id.content);
            if (viewFindViewById2 != null) {
                return viewFindViewById2;
            }
            if (view != null) {
                return view.getRootView();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.bl$b */
    /* JADX INFO: loaded from: classes3.dex */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo16989a();
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.bl$c */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class c extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public c(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            C4048sb.m19408a("Visibility check ran into a problem: " + th, (Throwable) null, 2, (Object) null);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.bl$d */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class d extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f13619b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f13620c;

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.bl$d$a */
        public static final class a extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: b */
            public int f13622b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C3672bl f13623c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3672bl c3672bl, Continuation continuation) {
                super(2, continuation);
                this.f13623c = c3672bl;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f13623c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f13622b;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j = this.f13623c.f13606e;
                    this.f13622b = 1;
                    if (DelayKt.delay(j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = C3672bl.this.new d(continuation);
            dVar.f13620c = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f13619b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.f13620c;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.f13620c;
                ResultKt.throwOnFailure(obj);
            }
            while (CoroutineScopeKt.isActive(coroutineScope) && (!C3672bl.this.f13614m || (C3672bl.this.f13608g && !C3672bl.this.f13616o))) {
                if (!C3672bl.this.f13614m && C3672bl.this.m16984f()) {
                    C3672bl c3672bl = C3672bl.this;
                    Long lBoxLong = c3672bl.f13615n;
                    if (lBoxLong == null) {
                        lBoxLong = Boxing.boxLong(SystemClock.uptimeMillis());
                    }
                    c3672bl.f13615n = lBoxLong;
                    if (C3672bl.this.m16982d()) {
                        C3672bl.this.f13614m = true;
                        if (!C3672bl.this.f13608g || C3672bl.this.f13616o) {
                            b bVarM16981c = C3672bl.this.m16981c();
                            if (bVarM16981c == null) {
                                break;
                            }
                            bVarM16981c.mo16989a();
                            break;
                        }
                    }
                } else if (!C3672bl.this.f13614m) {
                    C3672bl.this.f13615n = null;
                }
                if (C3672bl.this.f13608g && !C3672bl.this.f13616o) {
                    if (!C3672bl.this.m16983e()) {
                        C3672bl.this.f13617p = null;
                    } else if (C3672bl.this.f13617p != null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        Long l = C3672bl.this.f13617p;
                        Intrinsics.checkNotNull(l);
                        if (jUptimeMillis - l.longValue() >= 2000) {
                            C3672bl.this.f13616o = true;
                            if (C3672bl.this.f13614m) {
                                b bVarM16981c2 = C3672bl.this.m16981c();
                                if (bVarM16981c2 == null) {
                                    break;
                                }
                                bVarM16981c2.mo16989a();
                                break;
                            }
                        }
                    } else {
                        C3672bl.this.f13617p = Boxing.boxLong(SystemClock.uptimeMillis());
                    }
                }
                CoroutineDispatcher io = Dispatchers.getIO();
                a aVar = new a(C3672bl.this, null);
                this.f13620c = coroutineScope;
                this.f13619b = 1;
                if (BuildersKt.withContext(io, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public C3672bl(Context context, View trackedView, View rootView, int i, int i2, long j, int i3, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(trackedView, "trackedView");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        this.f13602a = trackedView;
        this.f13603b = rootView;
        this.f13604c = i;
        this.f13605d = i2;
        this.f13606e = j;
        this.f13607f = i3;
        this.f13608g = z;
        this.f13610i = new WeakReference(context instanceof Activity ? (Activity) context : null);
        this.f13612k = new WeakReference(null);
        this.f13613l = new ViewTreeObserver.OnPreDrawListener() { // from class: com.chartboost.sdk.impl.bl$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return C3672bl.m16976j(this.f$0);
            }
        };
        this.f13618q = new Rect();
    }

    public /* synthetic */ C3672bl(Context context, View view, View view2, int i, int i2, long j, int i3, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, view, view2, i, i2, j, i3, (i4 & 128) != 0 ? false : z);
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m16976j(C3672bl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m16985g();
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final int m16977a(int i, Context context) {
        return MathKt.roundToInt(i * context.getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: renamed from: a */
    public final void m16978a() {
        Job job = this.f13611j;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f13611j = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m16979a(b bVar) {
        this.f13609h = bVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m16980b() {
        m16978a();
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f13612k.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f13613l);
        }
        this.f13612k.clear();
        this.f13609h = null;
    }

    /* JADX INFO: renamed from: c */
    public final b m16981c() {
        return this.f13609h;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m16982d() {
        Long l = this.f13615n;
        if (l != null) {
            return SystemClock.uptimeMillis() - l.longValue() >= ((long) this.f13605d);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m16983e() {
        if (this.f13602a.getVisibility() != 0 || this.f13603b.getParent() == null || this.f13602a.getWidth() <= 0 || this.f13602a.getHeight() <= 0 || !this.f13602a.getGlobalVisibleRect(this.f13618q)) {
            return false;
        }
        return ((float) (this.f13618q.width() * this.f13618q.height())) / ((float) (this.f13602a.getWidth() * this.f13602a.getHeight())) >= 0.5f;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m16984f() {
        if (this.f13602a.getVisibility() == 0 && this.f13603b.getParent() != null && this.f13602a.getWidth() > 0 && this.f13602a.getHeight() > 0) {
            int i = 0;
            for (ViewParent parent = this.f13602a.getParent(); parent != null && i < this.f13607f; parent = parent.getParent()) {
                if ((parent instanceof View) && ((View) parent).getVisibility() != 0) {
                    return false;
                }
                i++;
            }
            if (!this.f13602a.getGlobalVisibleRect(this.f13618q)) {
                return false;
            }
            int iWidth = this.f13618q.width();
            Context context = this.f13602a.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iM16977a = m16977a(iWidth, context);
            int iHeight = this.f13618q.height();
            Context context2 = this.f13602a.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            if (iM16977a * m16977a(iHeight, context2) >= this.f13604c) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m16985g() {
        if (this.f13611j != null) {
            return;
        }
        this.f13611j = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), new c(CoroutineExceptionHandler.INSTANCE), null, new d(null), 2, null);
    }

    /* JADX INFO: renamed from: h */
    public final void m16986h() {
        try {
            ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f13612k.get();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                return;
            }
        } catch (Exception unused) {
            C4048sb.m19408a("Exception when accessing view tree observer.", (Throwable) null, 2, (Object) null);
        }
        View viewM16988a = f13601r.m16988a((Context) this.f13610i.get(), this.f13602a);
        ViewTreeObserver viewTreeObserver2 = viewM16988a != null ? viewM16988a.getViewTreeObserver() : null;
        if (viewTreeObserver2 == null) {
            return;
        }
        if (!viewTreeObserver2.isAlive()) {
            C4048sb.m19411b("Unable to set ViewTreeObserver since it is not alive", (Throwable) null, 2, (Object) null);
        } else {
            this.f13612k = new WeakReference(viewTreeObserver2);
            viewTreeObserver2.addOnPreDrawListener(this.f13613l);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m16987i() {
        m16986h();
    }
}

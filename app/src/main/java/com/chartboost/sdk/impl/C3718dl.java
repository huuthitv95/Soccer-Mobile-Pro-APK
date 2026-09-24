package com.chartboost.sdk.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.events.ChartboostError;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.dl */
/* JADX INFO: loaded from: classes3.dex */
public final class C3718dl extends AbstractC3860k2 implements InterfaceC4159xc, InterfaceC4079tk {

    /* JADX INFO: renamed from: D */
    public static final a f13892D = new a(null);

    /* JADX INFO: renamed from: A */
    public boolean f13893A;

    /* JADX INFO: renamed from: B */
    public Triple f13894B;

    /* JADX INFO: renamed from: C */
    public InterfaceC4101uk f13895C;

    /* JADX INFO: renamed from: o */
    public final String f13896o;

    /* JADX INFO: renamed from: p */
    public final URL f13897p;

    /* JADX INFO: renamed from: q */
    public final EnumC4049sc f13898q;

    /* JADX INFO: renamed from: r */
    public final C4085u4 f13899r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC3764fl f13900s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC3991pk f13901t;

    /* JADX INFO: renamed from: u */
    public final Set f13902u;

    /* JADX INFO: renamed from: v */
    public final Mediation f13903v;

    /* JADX INFO: renamed from: w */
    public final C4058t f13904w;

    /* JADX INFO: renamed from: x */
    public WebView f13905x;

    /* JADX INFO: renamed from: y */
    public volatile FrameLayout f13906y;

    /* JADX INFO: renamed from: z */
    public InterfaceC4137wc f13907z;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.dl$a */
    public static final class a {

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.dl$a$a, reason: collision with other inner class name */
        public static final class C15475a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: b */
            public static final C15475a f13908b = new C15475a();

            public C15475a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(String script) {
                Intrinsics.checkNotNullParameter(script, "script");
                return "<script>" + script + "</script>";
            }
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m17386a(Integer num, Context context) {
            if (num == null) {
                return -1;
            }
            if (num.intValue() == -1 || num.intValue() == -2) {
                return num.intValue();
            }
            if (num.intValue() >= 0) {
                return AbstractC3977p6.m19027a(num.intValue(), context);
            }
            C4048sb.m19417e("Unknown dimension value: " + num + ". Defaulting to MATCH_PARENT", null, 2, null);
            return -1;
        }

        /* JADX INFO: renamed from: a */
        public final String m17387a(Integer num) {
            StringBuilder sb;
            String str;
            if (num == null) {
                return "default (MATCH_PARENT)";
            }
            if (num.intValue() == -1) {
                return "MATCH_PARENT";
            }
            if (num.intValue() == -2) {
                return "WRAP_CONTENT";
            }
            if (num.intValue() >= 0) {
                sb = new StringBuilder();
                sb.append(num);
                str = "dp";
            } else {
                sb = new StringBuilder();
                sb.append(num);
                str = " (unknown, using MATCH_PARENT)";
            }
            sb.append(str);
            return sb.toString();
        }

        /* JADX INFO: renamed from: a */
        public final String m17388a(String html, List list) {
            Intrinsics.checkNotNullParameter(html, "html");
            if (list == null || list.isEmpty()) {
                return html;
            }
            return m17389a(list) + "\n" + html;
        }

        /* JADX INFO: renamed from: a */
        public final String m17389a(List list) {
            return CollectionsKt.joinToString$default(list, "\n", null, null, 0, null, C15475a.f13908b, 30, null);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.dl$b */
    public static final class b extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f13909b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ FrameLayout f13910c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ View f13911d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C3718dl f13912e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FrameLayout frameLayout, View view, C3718dl c3718dl, Continuation continuation) {
            super(2, continuation);
            this.f13910c = frameLayout;
            this.f13911d = view;
            this.f13912e = c3718dl;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f13910c, this.f13911d, this.f13912e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f13909b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C3718dl.m17365b(this.f13912e, this.f13910c, this.f13911d);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.dl$c */
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f13913b;

        /* JADX INFO: renamed from: d */
        public int f13915d;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f13913b = obj;
            this.f13915d |= Integer.MIN_VALUE;
            Object objMo17313a = C3718dl.this.mo17313a((Context) null, this);
            return objMo17313a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo17313a : Result.m44945boximpl(objMo17313a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.dl$d */
    public static final class d extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public Object f13916b;

        /* JADX INFO: renamed from: c */
        public Object f13917c;

        /* JADX INFO: renamed from: d */
        public int f13918d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Context f13919e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C3718dl f13920f;

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.dl$d$a */
        public static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3718dl f13921b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ WebView f13922c;

            /* JADX INFO: renamed from: com.chartboost.sdk.impl.dl$d$a$a, reason: collision with other inner class name */
            public static final class C15476a extends SuspendLambda implements Function2 {

                /* JADX INFO: renamed from: b */
                public int f13923b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ WebView f13924c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ C3718dl f13925d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C15476a(WebView webView, C3718dl c3718dl, Continuation continuation) {
                    super(2, continuation);
                    this.f13924c = webView;
                    this.f13925d = c3718dl;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C15476a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C15476a(this.f13924c, this.f13925d, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f13923b;
                    try {
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            this.f13924c.setVisibility(8);
                            C3718dl c3718dl = this.f13925d;
                            WebView webView = this.f13924c;
                            this.f13923b = 1;
                            if (c3718dl.m17375a(webView, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                    } catch (Exception e) {
                        C4048sb.m19410b("Error destroying WebView during cancellation", e);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3718dl c3718dl, WebView webView) {
                super(1);
                this.f13921b = c3718dl;
                this.f13922c = webView;
            }

            /* JADX INFO: renamed from: a */
            public final void m17393a(Throwable th) {
                C4048sb.m19408a("WebRenderable load cancelled: " + th, (Throwable) null, 2, (Object) null);
                try {
                    this.f13921b.m17376a((View) this.f13922c);
                } catch (Exception e) {
                    C4048sb.m19410b("Error cleaning up temp container during cancellation", e);
                }
                InterfaceC4101uk interfaceC4101ukMo17380b = this.f13921b.mo17380b();
                if (interfaceC4101ukMo17380b != null) {
                    interfaceC4101ukMo17380b.mo18910a();
                }
                InterfaceC4137wc interfaceC4137wc = this.f13921b.f13907z;
                if (interfaceC4137wc != null) {
                    interfaceC4137wc.mo18398a(EnumC3737eh.FAILURE);
                }
                InterfaceC4137wc interfaceC4137wc2 = this.f13921b.f13907z;
                if (interfaceC4137wc2 != null) {
                    interfaceC4137wc2.mo18400a((InterfaceC4159xc) null);
                }
                this.f13921b.f13907z = null;
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new C15476a(this.f13922c, this.f13921b, null), 3, null);
                this.f13921b.f13905x = null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m17393a((Throwable) obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.dl$d$b */
        public static final class b extends AbstractC3779gd {

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ CancellableContinuation f13926c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ C3718dl f13927d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ WebView f13928e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(CancellableContinuation cancellableContinuation, C3718dl c3718dl, WebView webView, String str) {
                super(str);
                this.f13926c = cancellableContinuation;
                this.f13927d = c3718dl;
                this.f13928e = webView;
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                List<String> listM20048d;
                if (this.f13926c.isActive()) {
                    this.f13927d.m17376a((View) this.f13928e);
                    if (this.f13927d.f13893A) {
                        Triple triple = this.f13927d.f13894B;
                        if (triple == null) {
                            triple = new Triple("Unknown URL", -1, "No description");
                        }
                        ChartboostError.Load.WebViewFailed webViewFailed = new ChartboostError.Load.WebViewFailed("WebView failed to load main frame. URL: " + ((String) triple.component1()) + ", Error Code: " + ((Integer) triple.component2()) + ", Description: " + ((Object) ((CharSequence) triple.component3())), null);
                        CancellableContinuation cancellableContinuation = this.f13926c;
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m44946constructorimpl(Result.m44945boximpl(Result.m44946constructorimpl(ResultKt.createFailure(webViewFailed)))));
                        return;
                    }
                    this.f13927d.m17377a(this.f13928e);
                    if (webView != null) {
                        String str2 = String.format("document.querySelectorAll('video, audio').forEach(media => media.muted = %b);", Arrays.copyOf(new Object[]{Boolean.TRUE}, 1));
                        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                        webView.evaluateJavascript(str2, null);
                    }
                    C4177y8 c4177y8M19185j = this.f13927d.m18336v().m19185j();
                    if (c4177y8M19185j != null && (listM20048d = c4177y8M19185j.m20048d()) != null) {
                        for (String str3 : listM20048d) {
                            if (webView != null) {
                                webView.evaluateJavascript(str3, null);
                            }
                        }
                    }
                    CancellableContinuation cancellableContinuation2 = this.f13926c;
                    Result.Companion companion2 = Result.INSTANCE;
                    cancellableContinuation2.resumeWith(Result.m44946constructorimpl(Result.m44945boximpl(Result.m44946constructorimpl(Unit.INSTANCE))));
                    InterfaceC4137wc interfaceC4137wc = this.f13927d.f13907z;
                    if (interfaceC4137wc != null) {
                        interfaceC4137wc.start();
                    }
                }
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                String strValueOf = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
                C4048sb.m19408a("WebView threw " + ((Object) (webResourceError != null ? webResourceError.getDescription() : null)) + " when requesting " + strValueOf, (Throwable) null, 2, (Object) null);
                if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
                    return;
                }
                this.f13927d.f13893A = true;
                if (this.f13927d.f13894B == null) {
                    this.f13927d.f13894B = new Triple(strValueOf, webResourceError != null ? Integer.valueOf(webResourceError.getErrorCode()) : null, webResourceError != null ? webResourceError.getDescription() : null);
                }
            }

            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                C4048sb.m19408a("WebView render process " + renderProcessGoneDetail, (Throwable) null, 2, (Object) null);
                this.f13927d.m17376a((View) this.f13928e);
                if (this.f13926c.isActive()) {
                    CancellableContinuation cancellableContinuation = this.f13926c;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m44946constructorimpl(Result.m44945boximpl(Result.m44946constructorimpl(ResultKt.createFailure(ChartboostError.Load.WebViewCrashed.INSTANCE)))));
                    return true;
                }
                ChartboostError.Render.WebViewTerminated webViewTerminated = ChartboostError.Render.WebViewTerminated.INSTANCE;
                C4048sb.m19410b("WebView render process gone: " + renderProcessGoneDetail, webViewTerminated);
                this.f13927d.m18330a(webViewTerminated);
                InterfaceC4074tf interfaceC4074tfM19067i = this.f13927d.m19067i();
                if (interfaceC4074tfM19067i != null) {
                    interfaceC4074tfM19067i.mo17322b(webViewTerminated);
                }
                InterfaceC4137wc interfaceC4137wc = this.f13927d.f13907z;
                if (interfaceC4137wc == null) {
                    return true;
                }
                interfaceC4137wc.mo18398a(EnumC3737eh.FAILURE);
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(request, "request");
                if (!(view instanceof C3733ed)) {
                    C4048sb.m19411b("Expected an MraidWebView", (Throwable) null, 2, (Object) null);
                    return false;
                }
                C3733ed c3733ed = (C3733ed) view;
                boolean gestureDetected = c3733ed.getGestureDetected();
                if (this.f13927d.m18336v().m19189n()) {
                    c3733ed.m17545a();
                }
                InterfaceC4137wc interfaceC4137wc = this.f13927d.f13907z;
                if (interfaceC4137wc == null) {
                    return false;
                }
                C4177y8 c4177y8M19185j = this.f13927d.m18336v().m19185j();
                return interfaceC4137wc.mo18404a(request, c4177y8M19185j != null ? c4177y8M19185j.m20050f() : false, gestureDetected);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, C3718dl c3718dl, Continuation continuation) {
            super(2, continuation);
            this.f13919e = context;
            this.f13920f = c3718dl;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.f13919e, this.f13920f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String strM20047c;
            URL urlM20046b;
            String strM20047c2;
            Window window;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f13918d;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Context context = this.f13919e;
            C3718dl c3718dl = this.f13920f;
            this.f13916b = context;
            this.f13917c = c3718dl;
            this.f13918d = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                activity = null;
            }
            View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
            ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
            C4177y8 c4177y8M19185j = c3718dl.m18336v().m19185j();
            boolean z = (c4177y8M19185j == null || c4177y8M19185j.m20045a()) && activity != null && viewGroup != null && viewGroup.isAttachedToWindow();
            a aVar = C3718dl.f13892D;
            C4058t c4058t = c3718dl.f13904w;
            int iM17386a = aVar.m17386a(c4058t != null ? c4058t.m19448b() : null, context);
            C4058t c4058t2 = c3718dl.f13904w;
            int iM17386a2 = aVar.m17386a(c4058t2 != null ? c4058t2.m19447a() : null, context);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setVisibility(4);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(iM17386a, iM17386a2));
            if (!z || viewGroup == null) {
                C4058t c4058t3 = c3718dl.f13904w;
                String strM17387a = aVar.m17387a(c4058t3 != null ? c4058t3.m19448b() : null);
                C4058t c4058t4 = c3718dl.f13904w;
                C4048sb.m19408a("Created temp invisible container (not attached to Activity decorView) with dimensions: " + strM17387a + " x " + aVar.m17387a(c4058t4 != null ? c4058t4.m19447a() : null) + " = " + iM17386a + "px x " + iM17386a2 + "px", (Throwable) null, 2, (Object) null);
            } else {
                viewGroup.addView(frameLayout);
                frameLayout.setTranslationZ(-1000000.0f);
                C4058t c4058t5 = c3718dl.f13904w;
                String strM17387a2 = aVar.m17387a(c4058t5 != null ? c4058t5.m19448b() : null);
                C4058t c4058t6 = c3718dl.f13904w;
                C4048sb.m19408a("Created temp invisible container and attached to Activity decorView with dimensions: " + strM17387a2 + " x " + aVar.m17387a(c4058t6 != null ? c4058t6.m19447a() : null) + " = " + iM17386a + "px x " + iM17386a2 + "px", (Throwable) null, 2, (Object) null);
            }
            c3718dl.f13906y = frameLayout;
            WebView webViewMo16908a = c3718dl.f13900s.mo16908a(context);
            webViewMo16908a.getSettings().setJavaScriptEnabled(true);
            webViewMo16908a.getSettings().setMediaPlaybackRequiresUserGesture(false);
            webViewMo16908a.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            Integer numM19191p = c3718dl.m18336v().m19191p();
            Integer numM19184i = c3718dl.m18336v().m19184i();
            int iM19027a = numM19191p != null ? AbstractC3977p6.m19027a(numM19191p.intValue(), context) : -1;
            int iM19027a2 = numM19184i != null ? AbstractC3977p6.m19027a(numM19184i.intValue(), context) : -1;
            webViewMo16908a.setLayoutParams(new FrameLayout.LayoutParams(iM19027a, iM19027a2));
            C4048sb.m19408a("Set WebView dimensions: " + numM19191p + "dp x " + numM19184i + "dp = " + iM19027a + "px x " + iM19027a2 + "px", (Throwable) null, 2, (Object) null);
            ViewParent parent = webViewMo16908a.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(webViewMo16908a);
            }
            frameLayout.addView(webViewMo16908a);
            C4177y8 c4177y8M19185j2 = c3718dl.m18336v().m19185j();
            String str = "2.0";
            if (c4177y8M19185j2 == null || (strM20047c = c4177y8M19185j2.m20047c()) == null) {
                strM20047c = "2.0";
            }
            webViewMo16908a.setWebViewClient(new b(cancellableContinuationImpl, c3718dl, webViewMo16908a, strM20047c));
            c3718dl.f13905x = webViewMo16908a;
            InterfaceC4137wc interfaceC4137wcMo16909a = c3718dl.f13900s.mo16909a(context, webViewMo16908a, c3718dl.f13898q);
            interfaceC4137wcMo16909a.mo18400a(c3718dl);
            c3718dl.f13907z = interfaceC4137wcMo16909a;
            cancellableContinuationImpl.invokeOnCancellation(new a(c3718dl, webViewMo16908a));
            String str2 = c3718dl.f13896o;
            if (str2 != null) {
                String strReplace = new Regex("\\sautoplay(=[\"']?autoplay[\"']?)?", RegexOption.IGNORE_CASE).replace(str2, "");
                Set set = c3718dl.f13902u;
                if (set != null) {
                    strReplace = c3718dl.f13901t.mo19080b().mo18640a(strReplace, set);
                }
                String strMo18638a = c3718dl.f13901t.mo19080b().mo18638a(strReplace);
                C4177y8 c4177y8M19185j3 = c3718dl.m18336v().m19185j();
                String strM17388a = aVar.m17388a(strMo18638a, c4177y8M19185j3 != null ? c4177y8M19185j3.m20049e() : null);
                C4181yc c4181yc = C4181yc.f17050a;
                C4177y8 c4177y8M19185j4 = c3718dl.m18336v().m19185j();
                if (c4177y8M19185j4 != null && (strM20047c2 = c4177y8M19185j4.m20047c()) != null) {
                    str = strM20047c2;
                }
                String strM20055a = c4181yc.m20055a(str);
                C4177y8 c4177y8M19185j5 = c3718dl.m18336v().m19185j();
                webViewMo16908a.loadDataWithBaseURL((c4177y8M19185j5 == null || (urlM20046b = c4177y8M19185j5.m20046b()) == null) ? null : urlM20046b.toString(), "<html><script type=\"text/javascript\">" + strM20055a + "</script>\n" + ((Object) strM17388a) + "</html>", "text/html", "UTF-8", null);
            } else {
                URL url = c3718dl.f13897p;
                if (url != null) {
                    webViewMo16908a.loadUrl(url.toString());
                }
            }
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            return result == coroutine_suspended ? coroutine_suspended : result;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.dl$e */
    public static final class e extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f13929b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ WebView f13931d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(WebView webView, Continuation continuation) {
            super(2, continuation);
            this.f13931d = webView;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3718dl.this.new e(this.f13931d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f13929b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C3718dl c3718dl = C3718dl.this;
                WebView webView = this.f13931d;
                this.f13929b = 1;
                if (c3718dl.m17375a(webView, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            C3718dl.this.f13905x = null;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.dl$f */
    public static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f13932b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f13933c;

        /* JADX INFO: renamed from: e */
        public int f13935e;

        public f(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f13933c = obj;
            this.f13935e |= Integer.MIN_VALUE;
            return C3718dl.this.m17375a((WebView) null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3718dl(String str, URL url, EnumC4049sc placementType, C4085u4 c4085u4, InterfaceC3764fl webViewFactory, C4008qf renderableConfig, C4168y adMarkupConfig, InterfaceC4098uh trackerComponent, C3829ih telemetryManager, EnumC4036s adFormat, InterfaceC3991pk viewabilityComponent, Set set, Mediation mediation, C4058t c4058t) throws ChartboostError.Load.InvalidAdm {
        super(renderableConfig, adMarkupConfig, trackerComponent, telemetryManager, adFormat, mediation);
        Intrinsics.checkNotNullParameter(placementType, "placementType");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        Intrinsics.checkNotNullParameter(renderableConfig, "renderableConfig");
        Intrinsics.checkNotNullParameter(adMarkupConfig, "adMarkupConfig");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        Intrinsics.checkNotNullParameter(telemetryManager, "telemetryManager");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(viewabilityComponent, "viewabilityComponent");
        this.f13896o = str;
        this.f13897p = url;
        this.f13898q = placementType;
        this.f13899r = c4085u4;
        this.f13900s = webViewFactory;
        this.f13901t = viewabilityComponent;
        this.f13902u = set;
        this.f13903v = mediation;
        this.f13904w = c4058t;
        if (str == null && url == null) {
            throw new ChartboostError.Load.InvalidAdm("WebRenderable requires either HTML or URL to be provided", new IllegalArgumentException("Missing content"));
        }
    }

    public /* synthetic */ C3718dl(String str, URL url, EnumC4049sc enumC4049sc, C4085u4 c4085u4, InterfaceC3764fl interfaceC3764fl, C4008qf c4008qf, C4168y c4168y, InterfaceC4098uh interfaceC4098uh, C3829ih c3829ih, EnumC4036s enumC4036s, InterfaceC3991pk interfaceC3991pk, Set set, Mediation mediation, C4058t c4058t, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : url, enumC4049sc, (i & 8) != 0 ? null : c4085u4, (i & 16) != 0 ? new C3657b6() : interfaceC3764fl, c4008qf, c4168y, interfaceC4098uh, c3829ih, enumC4036s, interfaceC3991pk, (i & 2048) != 0 ? null : set, mediation, (i & 8192) != 0 ? null : c4058t);
    }

    /* JADX INFO: renamed from: b */
    public static final void m17365b(C3718dl c3718dl, FrameLayout frameLayout, View view) {
        FrameLayout frameLayout2;
        if (view != null) {
            try {
                if (frameLayout.indexOfChild(view) != -1) {
                    frameLayout.removeView(view);
                }
            } catch (Exception e2) {
                C4048sb.m19410b("Error cleaning up temp container", e2);
                if (frameLayout2 != frameLayout) {
                    return;
                }
            } finally {
                if (c3718dl.f13906y == frameLayout) {
                    c3718dl.f13906y = null;
                }
            }
        }
        ViewParent parent = frameLayout.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(frameLayout);
        }
        C4048sb.m19408a("Cleaned up temp container", (Throwable) null, 2, (Object) null);
    }

    /* JADX INFO: renamed from: k */
    public static final void m17374k(C3718dl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WebView webView = this$0.f13905x;
        if (webView != null) {
            webView.evaluateJavascript("document.querySelectorAll('video, audio').forEach(media => { media.muted = true;});", null);
        }
        C4048sb.m19408a("WebRenderable resumed.", (Throwable) null, 2, (Object) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: a */
    public Object mo17313a(Context context, Continuation continuation) throws Throwable {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.f13915d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.f13915d = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objWithContext = cVar.f13913b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = cVar.f13915d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            d dVar = new d(context, this, null);
            cVar.f13915d = 1;
            objWithContext = BuildersKt.withContext(main, dVar, cVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m17375a(WebView webView, Continuation continuation) throws Throwable {
        f fVar;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i = fVar.f13935e;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.f13935e = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object obj = fVar.f13933c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = fVar.f13935e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            fVar.f13932b = webView;
            fVar.f13935e = 1;
            if (DelayKt.delay(1100L, fVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            webView = (WebView) fVar.f13932b;
            ResultKt.throwOnFailure(obj);
        }
        webView.onPause();
        webView.stopLoading();
        webView.destroy();
        return Unit.INSTANCE;
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: a */
    public void mo17316a(float f2) {
        super.mo17316a(f2);
        String str = String.format("document.querySelectorAll('video, audio').forEach(media => media.muted = %b);", Arrays.copyOf(new Object[]{Boolean.FALSE}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        WebView webView = this.f13905x;
        if (webView != null) {
            webView.evaluateJavascript(str, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m17376a(View view) {
        FrameLayout frameLayout = this.f13906y;
        if (frameLayout == null) {
            return;
        }
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            m17365b(this, frameLayout, view);
        } else {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new b(frameLayout, view, this, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m17377a(WebView webView) {
        InterfaceC4013qk interfaceC4013qkMo19080b = this.f13901t.mo19080b();
        if (interfaceC4013qkMo19080b.mo18641b()) {
            this.f13895C = this.f13901t.mo19079a().mo19060a(interfaceC4013qkMo19080b, webView);
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: a */
    public void mo17319a(EnumC3737eh reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        InterfaceC4101uk interfaceC4101ukMo17380b = mo17380b();
        if (interfaceC4101ukMo17380b != null) {
            interfaceC4101ukMo17380b.mo18910a();
        }
        InterfaceC4137wc interfaceC4137wc = this.f13907z;
        if (interfaceC4137wc != null) {
            interfaceC4137wc.mo18398a(reason);
        }
        InterfaceC4137wc interfaceC4137wc2 = this.f13907z;
        if (interfaceC4137wc2 != null) {
            interfaceC4137wc2.mo18400a((InterfaceC4159xc) null);
        }
        this.f13907z = null;
        m17376a((View) this.f13905x);
        WebView webView = this.f13905x;
        if (webView != null) {
            webView.setVisibility(8);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new e(webView, null), 3, null);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4159xc
    /* JADX INFO: renamed from: a */
    public void mo17378a(EnumC3833il reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        C4048sb.m19408a("WebView stopped for " + reason, (Throwable) null, 2, (Object) null);
        if (reason == EnumC3833il.MRAID_UNLOAD) {
            ChartboostError.Render.WebViewMraidUnload webViewMraidUnload = ChartboostError.Render.WebViewMraidUnload.INSTANCE;
            C4048sb.m19410b("WebView stopped due to MRAID unload", webViewMraidUnload);
            m18330a(webViewMraidUnload);
            mo17319a(EnumC3737eh.UNLOAD);
            InterfaceC4074tf interfaceC4074tfM19067i = m19067i();
            if (interfaceC4074tfM19067i != null) {
                interfaceC4074tfM19067i.mo17322b(webViewMraidUnload);
            }
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4159xc
    /* JADX INFO: renamed from: a */
    public void mo17379a(String str, EnumC3787gl reason, boolean z) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        mo17382b(str, z);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4079tk
    /* JADX INFO: renamed from: b */
    public InterfaceC4101uk mo17380b() {
        return this.f13895C;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4159xc
    /* JADX INFO: renamed from: b */
    public void mo17381b(EnumC3895le request) {
        Intrinsics.checkNotNullParameter(request, "request");
        InterfaceC4074tf interfaceC4074tfM19067i = m19067i();
        if (interfaceC4074tfM19067i != null) {
            interfaceC4074tfM19067i.mo17320a(request);
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3860k2
    /* JADX INFO: renamed from: b */
    public void mo17382b(String str, boolean z) {
        InterfaceC4074tf interfaceC4074tfM19067i;
        C4085u4 c4085u4 = this.f13899r;
        if (c4085u4 == null) {
            super.mo17382b(str, z);
            return;
        }
        m18331a(c4085u4.m19552b(), z);
        if (!m18335r().m17617a(new AbstractC3724e4.c(this.f13899r.m19553c()), z) || (interfaceC4074tfM19067i = m19067i()) == null) {
            return;
        }
        interfaceC4074tfM19067i.mo17323f();
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: j */
    public float mo17326j() {
        super.mo17326j();
        String str = String.format("document.querySelectorAll('video, audio').forEach(media => media.muted = %b);", Arrays.copyOf(new Object[]{Boolean.TRUE}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        WebView webView = this.f13905x;
        if (webView == null) {
            return 0.0f;
        }
        webView.evaluateJavascript(str, null);
        return 0.0f;
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: m */
    public void mo17329m() {
        InterfaceC4137wc interfaceC4137wc = this.f13907z;
        if (interfaceC4137wc != null) {
            interfaceC4137wc.pause();
        }
        WebView webView = this.f13905x;
        if (webView != null) {
            webView.onPause();
        }
        C4048sb.m19408a("WebRenderable paused.", (Throwable) null, 2, (Object) null);
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: n */
    public void mo17330n() {
        WebView webView = this.f13905x;
        if (webView != null) {
            webView.onResume();
        }
        InterfaceC4137wc interfaceC4137wc = this.f13907z;
        if (interfaceC4137wc != null) {
            interfaceC4137wc.mo18397a();
        }
        WebView webView2 = this.f13905x;
        if (webView2 != null) {
            webView2.postDelayed(new Runnable() { // from class: com.chartboost.sdk.impl.dl$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C3718dl.m17374k(this.f$0);
                }
            }, 100L);
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: o */
    public void mo17331o() {
        InterfaceC4101uk interfaceC4101ukMo17380b = mo17380b();
        if (interfaceC4101ukMo17380b != null) {
            interfaceC4101ukMo17380b.mo18916c();
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3860k2
    /* JADX INFO: renamed from: x */
    public void mo17335x() {
        InterfaceC4101uk interfaceC4101ukMo17380b = mo17380b();
        if (interfaceC4101ukMo17380b != null) {
            interfaceC4101ukMo17380b.mo18915b();
        }
        InterfaceC4137wc interfaceC4137wc = this.f13907z;
        if (interfaceC4137wc != null) {
            interfaceC4137wc.mo18397a();
        }
        WebView webView = this.f13905x;
        if (webView != null) {
            webView.onResume();
        }
        WebView webView2 = this.f13905x;
        if (webView2 != null) {
            webView2.evaluateJavascript("window?.chartboost?.onShow?.();", null);
        }
        WebView webView3 = this.f13905x;
        if (webView3 != null) {
            webView3.evaluateJavascript("document.querySelectorAll('video, audio').forEach(media => { if (media.paused) media.play(); });", null);
        }
        super.mo17335x();
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public WebView mo17327k() {
        WebView webView = this.f13905x;
        if (webView == null) {
            return null;
        }
        m17376a((View) webView);
        return webView;
    }
}

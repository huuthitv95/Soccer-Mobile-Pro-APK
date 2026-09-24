package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.chartboost.sdk.C3613R;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.c9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3683c9 extends AbstractC4019r4 {

    /* JADX INFO: renamed from: e */
    public final C4113va f13679e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC4064t5 f13680f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC3868ka f13681g;

    /* JADX INFO: renamed from: h */
    public final CoroutineDispatcher f13682h;

    /* JADX INFO: renamed from: i */
    public final C4127w2 f13683i;

    /* JADX INFO: renamed from: j */
    public Job f13684j;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.c9$a */
    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final a f13685b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4039s2 invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new C4039s2(it);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.c9$b */
    public static final class b extends Lambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC3868ka f13686b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Context f13687c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC3868ka interfaceC3868ka, Context context) {
            super(2);
            this.f13686b = interfaceC3868ka;
            this.f13687c = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4042s5 invoke(InterfaceC4064t5 cb, InterfaceC3888l7 et) {
            Intrinsics.checkNotNullParameter(cb, "cb");
            Intrinsics.checkNotNullParameter(et, "et");
            return new C4061t2(this.f13686b, new C4185yg(this.f13687c), cb, et);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.c9$c */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f13688a;

        static {
            int[] iArr = new int[C4113va.b.values().length];
            try {
                iArr[C4113va.b.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C4113va.b.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C4113va.b.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C4113va.b.BOTTOM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f13688a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.c9$d */
    public static final class d extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f13689b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ImageView f13691d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ImageView imageView, Continuation continuation) {
            super(2, continuation);
            this.f13691d = imageView;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3683c9.this.new d(this.f13691d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f13689b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C4127w2 c4127w2 = C3683c9.this.f13683i;
                String strM19683b = C3683c9.this.f13679e.m19683b();
                this.f13689b = 1;
                obj = c4127w2.m19737a(strM19683b, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                this.f13691d.setImageBitmap(bitmap);
            }
            this.f13691d.setVisibility(0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.c9$e */
    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m17060a(Throwable th) {
            C3683c9.this.f13684j = null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m17060a((Throwable) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3683c9(Context context, String baseUrl, String html, C4113va infoIcon, InterfaceC3888l7 eventTracker, InterfaceC4064t5 callback, InterfaceC3868ka impressionInterface, CoroutineDispatcher dispatcher, Function1 cbWebViewFactory, C4127w2 cbImageDownloader) {
        super(context, html, callback, impressionInterface, baseUrl, eventTracker, cbWebViewFactory, null, new b(impressionInterface, context), 128, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(infoIcon, "infoIcon");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(cbWebViewFactory, "cbWebViewFactory");
        Intrinsics.checkNotNullParameter(cbImageDownloader, "cbImageDownloader");
        this.f13679e = infoIcon;
        this.f13680f = callback;
        this.f13681g = impressionInterface;
        this.f13682h = dispatcher;
        this.f13683i = cbImageDownloader;
        addView(getWebViewContainer());
        callback.mo18757a();
        callback.mo18762d();
    }

    public /* synthetic */ C3683c9(Context context, String str, String str2, C4113va c4113va, InterfaceC3888l7 interfaceC3888l7, InterfaceC4064t5 interfaceC4064t5, InterfaceC3868ka interfaceC3868ka, CoroutineDispatcher coroutineDispatcher, Function1 function1, C4127w2 c4127w2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, c4113va, interfaceC3888l7, interfaceC4064t5, interfaceC3868ka, (i & 128) != 0 ? Dispatchers.getMain() : coroutineDispatcher, (i & 256) != 0 ? a.f13685b : function1, (i & 512) != 0 ? new C4127w2(null, null, null, 7, null) : c4127w2);
    }

    /* JADX INFO: renamed from: a */
    public static final void m17051a(C3683c9 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f13681g.mo18368a(new C3884l3(this$0.f13679e.m19682a(), Boolean.FALSE));
    }

    /* JADX INFO: renamed from: a */
    public final int m17054a(double d2) {
        Resources resources;
        DisplayMetrics displayMetrics;
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            d2 *= (double) displayMetrics.density;
        }
        return MathKt.roundToInt(d2);
    }

    @Override // com.chartboost.sdk.impl.AbstractC3969ok
    /* JADX INFO: renamed from: a */
    public void mo17055a() {
        Job job = this.f13684j;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f13684j = null;
        super.mo17055a();
    }

    /* JADX INFO: renamed from: a */
    public final void m17056a(RelativeLayout container) {
        Intrinsics.checkNotNullParameter(container, "container");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(m17054a(this.f13679e.m19686e().m19688b()), m17054a(this.f13679e.m19686e().m19687a()));
        int i = c.f13688a[this.f13679e.m19685d().ordinal()];
        if (i == 1) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else if (i == 3) {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        } else if (i == 4) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        }
        layoutParams.setMargins(m17054a(this.f13679e.m19684c().m19688b()), m17054a(this.f13679e.m19684c().m19687a()), m17054a(this.f13679e.m19684c().m19688b()), m17054a(this.f13679e.m19684c().m19687a()));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(C3613R.drawable.cb_info_icon);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.chartboost.sdk.impl.c9$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3683c9.m17051a(this.f$0, view);
            }
        });
        imageView.setVisibility(8);
        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.f13682h), null, null, new d(imageView, null), 3, null);
        jobLaunch$default.invokeOnCompletion(new e());
        this.f13684j = jobLaunch$default;
        container.addView(imageView, layoutParams);
        this.f13680f.mo18758a(imageView);
    }
}

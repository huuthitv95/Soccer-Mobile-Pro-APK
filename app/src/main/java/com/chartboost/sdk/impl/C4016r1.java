package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.view.SurfaceView;
import com.chartboost.sdk.internal.Networking.EndpointRepository;
import com.chartboost.sdk.internal.Networking.okhttp.OkHttpNetworkClient;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import okhttp3.OkHttpClient;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.r1 */
/* JADX INFO: loaded from: classes9.dex */
public final class C4016r1 implements InterfaceC3972p1 {

    /* JADX INFO: renamed from: A */
    public final Lazy f16022A;

    /* JADX INFO: renamed from: B */
    public final Lazy f16023B;

    /* JADX INFO: renamed from: C */
    public final Lazy f16024C;

    /* JADX INFO: renamed from: D */
    public final Lazy f16025D;

    /* JADX INFO: renamed from: E */
    public final Lazy f16026E;

    /* JADX INFO: renamed from: F */
    public final Lazy f16027F;

    /* JADX INFO: renamed from: G */
    public final Lazy f16028G;

    /* JADX INFO: renamed from: H */
    public final Lazy f16029H;

    /* JADX INFO: renamed from: I */
    public final Lazy f16030I;

    /* JADX INFO: renamed from: J */
    public final Lazy f16031J;

    /* JADX INFO: renamed from: K */
    public final Lazy f16032K;

    /* JADX INFO: renamed from: L */
    public final Lazy f16033L;

    /* JADX INFO: renamed from: M */
    public final Lazy f16034M;

    /* JADX INFO: renamed from: a */
    public final InterfaceC3859k1 f16035a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4000q7 f16036b;

    /* JADX INFO: renamed from: c */
    public final Lazy f16037c;

    /* JADX INFO: renamed from: d */
    public final Lazy f16038d;

    /* JADX INFO: renamed from: e */
    public final Lazy f16039e;

    /* JADX INFO: renamed from: f */
    public final Lazy f16040f;

    /* JADX INFO: renamed from: g */
    public final Lazy f16041g;

    /* JADX INFO: renamed from: h */
    public final Lazy f16042h;

    /* JADX INFO: renamed from: i */
    public final Lazy f16043i;

    /* JADX INFO: renamed from: j */
    public final Lazy f16044j;

    /* JADX INFO: renamed from: k */
    public final Lazy f16045k;

    /* JADX INFO: renamed from: l */
    public final Lazy f16046l;

    /* JADX INFO: renamed from: m */
    public final Lazy f16047m;

    /* JADX INFO: renamed from: n */
    public final Lazy f16048n;

    /* JADX INFO: renamed from: o */
    public final Lazy f16049o;

    /* JADX INFO: renamed from: p */
    public final Lazy f16050p;

    /* JADX INFO: renamed from: q */
    public final Lazy f16051q;

    /* JADX INFO: renamed from: r */
    public final Lazy f16052r;

    /* JADX INFO: renamed from: s */
    public final Lazy f16053s;

    /* JADX INFO: renamed from: t */
    public final Lazy f16054t;

    /* JADX INFO: renamed from: u */
    public final Lazy f16055u;

    /* JADX INFO: renamed from: v */
    public final Lazy f16056v;

    /* JADX INFO: renamed from: w */
    public final Lazy f16057w;

    /* JADX INFO: renamed from: x */
    public final Lazy f16058x;

    /* JADX INFO: renamed from: y */
    public final Lazy f16059y;

    /* JADX INFO: renamed from: z */
    public final Lazy f16060z;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$a */
    /* JADX INFO: loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16061a;

        static {
            int[] iArr = new int[C3717dk.b.values().length];
            try {
                iArr[C3717dk.b.MEDIA_PLAYER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C3717dk.b.EXO_PLAYER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f16061a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$a0 */
    public static final class a0 extends Lambda implements Function0 {
        public a0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4031rg invoke() {
            return new C4031rg(C4016r1.this.f16035a.mo18325i());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$b */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$b$a */
        public static final class a extends Lambda implements Function5 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C4016r1 f16064b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C4016r1 c4016r1) {
                super(5);
                this.f16064b = c4016r1;
            }

            @Override // kotlin.jvm.functions.Function5
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SurfaceHolderCallbackC3629a1 invoke(Context cxt, SurfaceView s, InterfaceC3721e1 interfaceC3721e1, InterfaceC3945ni h, C4001q8 c4001q8) {
                Intrinsics.checkNotNullParameter(cxt, "cxt");
                Intrinsics.checkNotNullParameter(s, "s");
                Intrinsics.checkNotNullParameter(h, "h");
                Intrinsics.checkNotNullParameter(c4001q8, "<anonymous parameter 4>");
                return new SurfaceHolderCallbackC3629a1(cxt, null, this.f16064b.m19230A(), s, interfaceC3721e1, h, this.f16064b.m19241L(), 2, null);
            }
        }

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Function5 invoke() {
            return new a(C4016r1.this);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$b0 */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class b0 extends Lambda implements Function0 {
        public b0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3829ih invoke() {
            return new C3829ih(C4016r1.this.m19236G(), C4016r1.this.m19234E(), null, 0L, 0, C4016r1.this.m19238I(), 28, null);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$c */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$c$a */
        public static final class a extends Lambda implements Function5 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C4016r1 f16067b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C4016r1 c4016r1) {
                super(5);
                this.f16067b = c4016r1;
            }

            @Override // kotlin.jvm.functions.Function5
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SurfaceHolderCallbackC3675c1 invoke(Context context, SurfaceView s, InterfaceC3721e1 interfaceC3721e1, InterfaceC3945ni h, C4001q8 fc) {
                Intrinsics.checkNotNullParameter(context, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(s, "s");
                Intrinsics.checkNotNullParameter(h, "h");
                Intrinsics.checkNotNullParameter(fc, "fc");
                return new SurfaceHolderCallbackC3675c1(null, s, interfaceC3721e1, h, this.f16067b.m19241L(), this.f16067b.m19239J(), null, fc, 65, null);
            }
        }

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Function5 invoke() {
            return new a(C4016r1.this);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$c0 */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class c0 extends Lambda implements Function0 {
        public c0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3852jh invoke() {
            return new C3852jh(C4016r1.this.mo18992f(), new C4136wb(), null, 4, null);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$d */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3790h1 invoke() {
            return new C3790h1(C4016r1.this.f16035a.getContext(), C4016r1.this.f16035a.mo18318b());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$d0 */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class d0 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final d0 f16070b = new d0();

        public d0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3875kh invoke() {
            return new C3875kh();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$e */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class e extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final e f16071b = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4128w3 invoke() {
            return new C4128w3();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$e0 */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class e0 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final e0 f16072b = new e0();

        public e0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3921mh invoke() {
            return new C3921mh();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$f */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class f extends Lambda implements Function0 {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3818i6 invoke() {
            return new C3818i6(C4016r1.this.f16035a.getContext(), C4016r1.this.f16035a.mo18326j(), C4016r1.this.f16035a.mo18322f());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$f0 */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class f0 extends Lambda implements Function0 {
        public f0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3646ai invoke() {
            return new C3646ai(C4016r1.this.mo18988b());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$g */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class g extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC4066t7 f16075b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C4016r1 f16076c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC4066t7 interfaceC4066t7, C4016r1 c4016r1) {
            super(0);
            this.f16075b = interfaceC4066t7;
            this.f16076c = c4016r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4131w6 invoke() {
            return new C4131w6(this.f16075b.mo19461b(), this.f16076c.mo18994h(), this.f16076c.mo18993g(), this.f16076c.mo18996j(), this.f16076c.mo18988b(), this.f16076c.mo19005s(), this.f16076c.f16036b);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$g0 */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class g0 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final g0 f16077b = new g0();

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$g0$a */
        public static final class a extends Lambda implements Function4 {

            /* JADX INFO: renamed from: b */
            public static final a f16078b = new a();

            public a() {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C4122vj invoke(C4078tj va, C4122vj.b l, CoroutineDispatcher d, C4001q8 c4001q8) {
                Intrinsics.checkNotNullParameter(va, "va");
                Intrinsics.checkNotNullParameter(l, "l");
                Intrinsics.checkNotNullParameter(d, "d");
                return new C4122vj(va, l, 0.0f, null, c4001q8, d, null, 76, null);
            }
        }

        public g0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Function4 invoke() {
            return a.f16078b;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$h */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class h extends Lambda implements Function0 {

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$h$a */
        public static final class a extends Lambda implements Function0 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C4016r1 f16080b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C4016r1 c4016r1) {
                super(0);
                this.f16080b = c4016r1;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Long invoke() {
                return Long.valueOf(((C3920mg) this.f16080b.mo18988b().get()).f15361E);
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$h$b */
        public static final class b extends Lambda implements Function0 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C4016r1 f16081b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C4016r1 c4016r1) {
                super(0);
                this.f16081b = c4016r1;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Long invoke() {
                return Long.valueOf(((C3920mg) this.f16081b.mo18988b().get()).f15362F);
            }
        }

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4152x5 invoke() {
            CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));
            C3999q6 c3999q6 = new C3999q6(AbstractC3885l4.m18484a(), Dispatchers.getIO(), null, 4, null);
            C4072td c4072td = new C4072td(new OkHttpClient(), Dispatchers.getIO());
            C4086u5 c4086u5 = new C4086u5(CoroutineScope);
            return new C4152x5(CoroutineScope, c3999q6, c4072td, new C4108v5(c3999q6, c4086u5, Dispatchers.getIO()), c4086u5, Dispatchers.getIO(), new a(C4016r1.this), 52428800L, new b(C4016r1.this));
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$h0 */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class h0 extends Lambda implements Function0 {
        public h0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4166xj invoke() {
            C3717dk c3717dk = new C3717dk(0L, 0, 0, 0L, 0L, 0L, 0, null, 255, null);
            return new C4166xj(c3717dk.m17342b(), c3717dk.m17343c(), c3717dk.m17344d(), c3717dk.m17345e(), c3717dk.m17346f(), c3717dk.m17347g(), c3717dk.m17341a(), C4016r1.this.mo18996j());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$i */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class i extends Lambda implements Function0 {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3635a7 invoke() {
            Object obj = C4016r1.this.mo18988b().get();
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            return new C3635a7((C3920mg) obj);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$i0 */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class i0 extends Lambda implements Function0 {
        public i0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3717dk.b invoke() {
            C3717dk.b bVarM17348h;
            C3717dk c3717dkM18666e;
            C3920mg c3920mg = (C3920mg) C4016r1.this.mo18988b().get();
            if (c3920mg == null || (c3717dkM18666e = c3920mg.m18666e()) == null || (bVarM17348h = c3717dkM18666e.m17348h()) == null) {
                bVarM17348h = C3717dk.b.EXO_PLAYER;
            }
            C4048sb.m19408a("Video player type: " + bVarM17348h, (Throwable) null, 2, (Object) null);
            return bVarM17348h;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$j */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class j extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final j f16085b = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4198z7 invoke() {
            return new C4198z7(null, 1, null);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$j0 */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class j0 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final j0 f16086b = new j0();

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$j0$a */
        public static final class a extends Lambda implements Function3 {

            /* JADX INFO: renamed from: b */
            public static final a f16087b = new a();

            public a() {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C3786gk invoke(InterfaceC3721e1 interfaceC3721e1, InterfaceC3763fk.b vp, InterfaceC3945ni interfaceC3945ni) {
                Intrinsics.checkNotNullParameter(vp, "vp");
                Intrinsics.checkNotNullParameter(interfaceC3945ni, "<anonymous parameter 2>");
                return new C3786gk(interfaceC3721e1, vp, null, 4, null);
            }
        }

        public j0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Function3 invoke() {
            return a.f16087b;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$k */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class k extends Lambda implements Function0 {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3728e8 invoke() {
            return new C3728e8(C4016r1.this.mo18990d());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$k0 */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class k0 extends Lambda implements Function0 {
        public k0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3878kk invoke() {
            return new C3878kk(C4016r1.this.mo19004r(), C4016r1.this.mo18990d(), null, null, 12, null);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$l */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class l extends Lambda implements Function0 {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4001q8 invoke() {
            return new C4001q8(C4016r1.this.f16035a.getContext(), C4016r1.this.mo18988b());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$l0 */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class l0 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC4066t7 f16092c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(InterfaceC4066t7 interfaceC4066t7) {
            super(0);
            this.f16092c = interfaceC4066t7;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3901lk invoke() {
            return new C3901lk(C4016r1.this.mo18993g(), C4016r1.this.mo19004r(), C4016r1.this.mo18996j(), C4016r1.this.mo18994h(), C4016r1.this.m19237H(), this.f16092c.mo19461b());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$m */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class m extends Lambda implements Function0 {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4155x8 invoke() {
            return new C4155x8(C4016r1.this.f16035a.getContext());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$n */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class n extends Lambda implements Function0 {
        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4105v2 invoke() {
            return new C4105v2(C4016r1.this.f16035a.getContext(), C4016r1.this.f16035a.mo18321e(), C4016r1.this.m19232C(), C4016r1.this.f16035a.mo18317a(), null, 16, null);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$o */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class o extends Lambda implements Function0 {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3775g9 invoke() {
            return new C3775g9(C4016r1.this.m19231B(), C4016r1.this.m19246z(), null, 4, null);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$p */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class p extends Lambda implements Function0 {
        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3708db invoke() {
            PackageManager packageManager = C4016r1.this.f16035a.getContext().getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
            return new C3708db(packageManager, null, 2, null);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$q */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class q extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final q f16097b = new q();

        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OkHttpNetworkClient invoke() {
            return new OkHttpNetworkClient(0L, 0L, 0L, 7, null);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$r */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class r extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final r f16098b = new r();

        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3962od invoke() {
            return new C3962od();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$s */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class s extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC4066t7 f16099b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C4016r1 f16100c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(InterfaceC4066t7 interfaceC4066t7, C4016r1 c4016r1) {
            super(0);
            this.f16099b = interfaceC4066t7;
            this.f16100c = c4016r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3746f3 invoke() {
            return new C3746f3(this.f16099b.mo19461b(), this.f16100c.m19233D(), this.f16100c.mo18996j(), this.f16100c.mo19005s(), this.f16100c.f16035a.mo18319c(), this.f16099b.mo19460a(), this.f16100c.f16036b);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$t */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class t extends Lambda implements Function0 {
        public t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4028rd invoke() {
            return new C4028rd(C4016r1.this.f16035a.getContext());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$u */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class u extends Lambda implements Function0 {
        public u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4073te invoke() {
            return new C4073te(C4016r1.this.mo18991e(), C4016r1.this.mo18994h(), C4016r1.this.mo18993g(), C4016r1.this.mo19007u(), C4016r1.this.mo18988b(), C4016r1.this.f16036b, C4016r1.this.mo18999m(), C4016r1.this.mo18997k());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$v */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class v extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC4183ye f16103b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(InterfaceC4183ye interfaceC4183ye) {
            super(0);
            this.f16103b = interfaceC4183ye;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4117ve invoke() {
            return this.f16103b.mo20056a();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$w */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class w extends Lambda implements Function0 {
        public w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3769g3 invoke() {
            return new C3769g3(C4016r1.this.f16035a.getContext());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$x */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class x extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final x f16105b = new x();

        public x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3634a6 invoke() {
            return new C3634a6(null, 1, null);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$y */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class y extends Lambda implements Function0 {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC4183ye f16107c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(InterfaceC4183ye interfaceC4183ye) {
            super(0);
            this.f16107c = interfaceC4183ye;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3667bg invoke() {
            return new C3667bg(C4016r1.this.f16035a.getContext(), C4016r1.this.mo19002p(), C4016r1.this.mo18996j(), C4016r1.this.mo18988b(), C4016r1.this.f16035a.mo18325i(), C4016r1.this.mo19005s(), C4016r1.this.mo19006t(), C4016r1.this.mo18997k(), this.f16107c.mo20056a(), null, C4016r1.this.mo19000n());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r1$z */
    public static final class z extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f16108b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C4016r1 f16109c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(Function1 function1, C4016r1 c4016r1) {
            super(0);
            this.f16108b = function1;
            this.f16109c = c4016r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AtomicReference invoke() {
            return new AtomicReference(this.f16108b.invoke(this.f16109c.f16035a));
        }
    }

    public C4016r1(InterfaceC3859k1 androidComponent, InterfaceC4066t7 executorComponent, InterfaceC4183ye privacyComponent, Function1 sdkConfigFactory, final InterfaceC4098uh trackerComponent) {
        Intrinsics.checkNotNullParameter(androidComponent, "androidComponent");
        Intrinsics.checkNotNullParameter(executorComponent, "executorComponent");
        Intrinsics.checkNotNullParameter(privacyComponent, "privacyComponent");
        Intrinsics.checkNotNullParameter(sdkConfigFactory, "sdkConfigFactory");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        this.f16035a = androidComponent;
        this.f16036b = new C4163xg(new Supplier() { // from class: com.chartboost.sdk.impl.r1$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                return C4016r1.m19222a(trackerComponent);
            }
        });
        this.f16037c = LazyKt.lazy(new u());
        this.f16038d = LazyKt.lazy(q.f16097b);
        this.f16039e = LazyKt.lazy(new v(privacyComponent));
        this.f16040f = LazyKt.lazy(new y(privacyComponent));
        this.f16041g = LazyKt.lazy(new f());
        this.f16042h = LazyKt.lazy(new i());
        this.f16043i = LazyKt.lazy(new h());
        this.f16044j = LazyKt.lazy(new s(executorComponent, this));
        this.f16045k = LazyKt.lazy(e0.f16072b);
        this.f16046l = LazyKt.lazy(new a0());
        this.f16047m = LazyKt.lazy(new w());
        this.f16048n = LazyKt.lazy(new n());
        this.f16049o = LazyKt.lazy(new l());
        this.f16050p = LazyKt.lazy(new z(sdkConfigFactory, this));
        this.f16051q = LazyKt.lazy(r.f16098b);
        this.f16052r = LazyKt.lazy(new g(executorComponent, this));
        this.f16053s = LazyKt.lazy(e.f16071b);
        this.f16054t = LazyKt.lazy(d0.f16070b);
        this.f16055u = LazyKt.lazy(j.f16085b);
        this.f16056v = LazyKt.lazy(new k());
        this.f16057w = LazyKt.lazy(new p());
        this.f16058x = LazyKt.lazy(new i0());
        this.f16059y = LazyKt.lazy(new l0(executorComponent));
        this.f16060z = LazyKt.lazy(new k0());
        this.f16022A = LazyKt.lazy(new h0());
        this.f16023B = LazyKt.lazy(new c());
        this.f16024C = LazyKt.lazy(new b());
        this.f16025D = LazyKt.lazy(j0.f16086b);
        this.f16026E = LazyKt.lazy(g0.f16077b);
        this.f16027F = LazyKt.lazy(new o());
        this.f16028G = LazyKt.lazy(new m());
        this.f16029H = LazyKt.lazy(new d());
        this.f16030I = LazyKt.lazy(new t());
        this.f16031J = LazyKt.lazy(new c0());
        this.f16032K = LazyKt.lazy(new f0());
        this.f16033L = LazyKt.lazy(new b0());
        this.f16034M = LazyKt.lazy(x.f16105b);
    }

    public /* synthetic */ C4016r1(InterfaceC3859k1 interfaceC3859k1, InterfaceC4066t7 interfaceC4066t7, InterfaceC4183ye interfaceC4183ye, Function1 function1, InterfaceC4098uh interfaceC4098uh, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC3859k1, interfaceC4066t7, interfaceC4183ye, (i2 & 8) != 0 ? AbstractC3994q1.f15845a : function1, interfaceC4098uh);
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC3888l7 m19222a(InterfaceC4098uh trackerComponent) {
        Intrinsics.checkNotNullParameter(trackerComponent, "$trackerComponent");
        return trackerComponent.mo19602a();
    }

    /* JADX INFO: renamed from: A */
    public C3728e8 m19230A() {
        return (C3728e8) this.f16056v.getValue();
    }

    /* JADX INFO: renamed from: B */
    public final C4155x8 m19231B() {
        return (C4155x8) this.f16028G.getValue();
    }

    /* JADX INFO: renamed from: C */
    public final C3775g9 m19232C() {
        return (C3775g9) this.f16027F.getValue();
    }

    /* JADX INFO: renamed from: D */
    public final C3962od m19233D() {
        return (C3962od) this.f16051q.getValue();
    }

    /* JADX INFO: renamed from: E */
    public C4028rd m19234E() {
        return (C4028rd) this.f16030I.getValue();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3972p1
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public C3667bg mo19007u() {
        return (C3667bg) this.f16040f.getValue();
    }

    /* JADX INFO: renamed from: G */
    public C3852jh m19236G() {
        return (C3852jh) this.f16031J.getValue();
    }

    /* JADX INFO: renamed from: H */
    public C3875kh m19237H() {
        return (C3875kh) this.f16054t.getValue();
    }

    /* JADX INFO: renamed from: I */
    public InterfaceC4186yh m19238I() {
        return (InterfaceC4186yh) this.f16032K.getValue();
    }

    /* JADX INFO: renamed from: J */
    public final Function4 m19239J() {
        return (Function4) this.f16026E.getValue();
    }

    /* JADX INFO: renamed from: K */
    public final C3717dk.b m19240K() {
        return (C3717dk.b) this.f16058x.getValue();
    }

    /* JADX INFO: renamed from: L */
    public final Function3 m19241L() {
        return (Function3) this.f16025D.getValue();
    }

    /* JADX INFO: renamed from: M */
    public final InterfaceC3855jk m19242M() {
        return (InterfaceC3855jk) this.f16060z.getValue();
    }

    /* JADX INFO: renamed from: N */
    public final InterfaceC3855jk m19243N() {
        return (InterfaceC3855jk) this.f16059y.getValue();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3972p1
    /* JADX INFO: renamed from: a */
    public C4117ve mo18987a() {
        return (C4117ve) this.f16039e.getValue();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3972p1
    /* JADX INFO: renamed from: b */
    public AtomicReference mo18988b() {
        return (AtomicReference) this.f16050p.getValue();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3972p1
    /* JADX INFO: renamed from: c */
    public InterfaceC4052sf mo18989c() {
        return (InterfaceC4052sf) this.f16034M.getValue();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3972p1
    /* JADX INFO: renamed from: d */
    public InterfaceC4154x7 mo18990d() {
        return (InterfaceC4154x7) this.f16055u.getValue();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3972p1
    /* JADX INFO: renamed from: e */
    public C4131w6 mo18991e() {
        return (C4131w6) this.f16052r.getValue();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3972p1
    /* JADX INFO: renamed from: f */
    public InterfaceC3917md mo18992f() {
        return (InterfaceC3917md) this.f16038d.getValue();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3972p1
    /* JADX INFO: renamed from: g */
    public C3746f3 mo18993g() {
        return (C3746f3) this.f16044j.getValue();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3972p1
    /* JADX INFO: renamed from: h */
    public C4001q8 mo18994h() {
        return (C4001q8) this.f16049o.getValue();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3972p1
    /* JADX INFO: renamed from: i */
    public InterfaceC4153x6 mo18995i() {
        return (InterfaceC4153x6) this.f16043i.getValue();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3972p1
    /* JADX INFO: renamed from: j */
    public C3769g3 mo18996j() {
        return (C3769g3) this.f16047m.getValue();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3972p1
    /* JADX INFO: renamed from: k */
    public C4031rg mo18997k() {
        return (C4031rg) this.f16046l.getValue();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3972p1
    /* JADX INFO: renamed from: l */
    public Function5 mo18998l() {
        int i2 = a.f16061a[m19240K().ordinal()];
        if (i2 == 1) {
            return m19245y();
        }
        if (i2 == 2) {
            return m19244x();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3972p1
    /* JADX INFO: renamed from: m */
    public EndpointRepository mo18999m() {
        return (EndpointRepository) this.f16042h.getValue();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3972p1
    /* JADX INFO: renamed from: n */
    public C3818i6 mo19000n() {
        return (C3818i6) this.f16041g.getValue();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3972p1
    /* JADX INFO: renamed from: o */
    public C4073te mo19001o() {
        return (C4073te) this.f16037c.getValue();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3972p1
    /* JADX INFO: renamed from: p */
    public C4105v2 mo19002p() {
        return (C4105v2) this.f16048n.getValue();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3972p1
    /* JADX INFO: renamed from: q */
    public C3829ih mo19003q() {
        return (C3829ih) this.f16033L.getValue();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3972p1
    /* JADX INFO: renamed from: r */
    public C4166xj mo19004r() {
        return (C4166xj) this.f16022A.getValue();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3972p1
    /* JADX INFO: renamed from: s */
    public C3921mh mo19005s() {
        return (C3921mh) this.f16045k.getValue();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3972p1
    /* JADX INFO: renamed from: t */
    public C4128w3 mo19006t() {
        return (C4128w3) this.f16053s.getValue();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3972p1
    /* JADX INFO: renamed from: v */
    public C3708db mo19008v() {
        return (C3708db) this.f16057w.getValue();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3972p1
    /* JADX INFO: renamed from: w */
    public InterfaceC3855jk mo19009w() {
        InterfaceC3855jk interfaceC3855jkM19243N;
        int i2 = a.f16061a[m19240K().ordinal()];
        if (i2 == 1) {
            interfaceC3855jkM19243N = m19243N();
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            interfaceC3855jkM19243N = m19242M();
        }
        C4048sb.m19408a("Video repository: " + interfaceC3855jkM19243N, (Throwable) null, 2, (Object) null);
        return interfaceC3855jkM19243N;
    }

    /* JADX INFO: renamed from: x */
    public final Function5 m19244x() {
        return (Function5) this.f16024C.getValue();
    }

    /* JADX INFO: renamed from: y */
    public final Function5 m19245y() {
        return (Function5) this.f16023B.getValue();
    }

    /* JADX INFO: renamed from: z */
    public final C3790h1 m19246z() {
        return (C3790h1) this.f16029H.getValue();
    }
}

package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.internal.Model.CBError;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.e0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3720e0 implements InterfaceC3766g0, InterfaceC4104v1, InterfaceC3911m7 {

    /* JADX INFO: renamed from: a */
    public final AbstractC3628a0 f13970a;

    /* JADX INFO: renamed from: b */
    public final C4001q8 f13971b;

    /* JADX INFO: renamed from: c */
    public final C3769g3 f13972c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3855jk f13973d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC4192z1 f13974e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC4080u f13975f;

    /* JADX INFO: renamed from: g */
    public final C3918me f13976g;

    /* JADX INFO: renamed from: h */
    public final Mediation f13977h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC3911m7 f13978i;

    /* JADX INFO: renamed from: j */
    public final AtomicReference f13979j;

    /* JADX INFO: renamed from: k */
    public C3950o1 f13980k;

    /* JADX INFO: renamed from: l */
    public InterfaceC3743f0 f13981l;

    /* JADX INFO: renamed from: m */
    public C3674c0 f13982m;

    /* JADX INFO: renamed from: n */
    public final AtomicBoolean f13983n;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.e0$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f13984a;

        static {
            int[] iArr = new int[EnumC4126w1.values().length];
            try {
                iArr[EnumC4126w1.FAILURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4126w1.READY_TO_SHOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4126w1.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13984a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.e0$b */
    public static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C3950o1 f13986c;

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.e0$b$a */
        public static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3720e0 f13987b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C3950o1 f13988c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3720e0 c3720e0, C3950o1 c3950o1) {
                super(1);
                this.f13987b = c3720e0;
                this.f13988c = c3950o1;
            }

            /* JADX INFO: renamed from: a */
            public final void m17452a(C4004qb fold) {
                Intrinsics.checkNotNullParameter(fold, "$this$fold");
                this.f13987b.m17443b(fold, this.f13988c);
                this.f13987b.m17440b(this.f13988c);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m17452a((C4004qb) obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.e0$b$b, reason: collision with other inner class name */
        public static final class C15477b extends Lambda implements Function2 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3720e0 f13989b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C3950o1 f13990c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C15477b(C3720e0 c3720e0, C3950o1 c3950o1) {
                super(2);
                this.f13989b = c3720e0;
                this.f13990c = c3950o1;
            }

            /* JADX INFO: renamed from: a */
            public final void m17453a(C4004qb fold, CBError error) {
                Intrinsics.checkNotNullParameter(fold, "$this$fold");
                Intrinsics.checkNotNullParameter(error, "error");
                this.f13989b.m17435a(error, this.f13990c.m18865d());
                this.f13989b.m17433a(fold, this.f13990c);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                m17453a((C4004qb) obj, (CBError) obj2);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C3950o1 c3950o1) {
            super(1);
            this.f13986c = c3950o1;
        }

        /* JADX INFO: renamed from: a */
        public final void m17451a(C4004qb loadAd) {
            Intrinsics.checkNotNullParameter(loadAd, "$this$loadAd");
            AbstractC4124w.m19731a(loadAd, new a(C3720e0.this, this.f13986c), new C15477b(C3720e0.this, this.f13986c));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m17451a((C4004qb) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.e0$c */
    public static final class c extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C3950o1 f13991b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C3720e0 f13992c;

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.e0$c$a */
        public static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3950o1 f13993b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C3720e0 f13994c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3950o1 c3950o1, C3720e0 c3720e0) {
                super(1);
                this.f13993b = c3950o1;
                this.f13994c = c3720e0;
            }

            /* JADX INFO: renamed from: a */
            public final void m17455a(C4004qb fold) {
                Unit unit;
                String strM16861c;
                Intrinsics.checkNotNullParameter(fold, "$this$fold");
                this.f13993b.m18858a(fold.m19155a());
                C3651b0 c3651b0M19155a = fold.m19155a();
                if (c3651b0M19155a == null || (strM16861c = c3651b0M19155a.m16861c()) == null) {
                    unit = null;
                } else {
                    C3950o1 c3950o1 = this.f13993b;
                    C3720e0 c3720e0 = this.f13994c;
                    c3950o1.m18860a(strM16861c);
                    c3720e0.m17438a(strM16861c, InterfaceC3807hi.a.FINISH_SUCCESS);
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    C3950o1 c3950o2 = this.f13993b;
                    C3720e0 c3720e1 = this.f13994c;
                    C4048sb.m19417e("NRP waterfall response missing ADM for location " + c3950o2.m18865d(), null, 2, null);
                    c3720e1.m17432a(c3950o2, new CBError(CBError.Internal.MISCELLANEOUS, "NRP waterfall response missing ADM"));
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m17455a((C4004qb) obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.e0$c$b */
        public static final class b extends Lambda implements Function2 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3720e0 f13995b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C3950o1 f13996c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C3720e0 c3720e0, C3950o1 c3950o1) {
                super(2);
                this.f13995b = c3720e0;
                this.f13996c = c3950o1;
            }

            /* JADX INFO: renamed from: a */
            public final void m17456a(C4004qb fold, CBError error) {
                Intrinsics.checkNotNullParameter(fold, "$this$fold");
                Intrinsics.checkNotNullParameter(error, "error");
                this.f13995b.m17435a(error, this.f13996c.m18865d());
                this.f13995b.m17433a(fold, this.f13996c);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                m17456a((C4004qb) obj, (CBError) obj2);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C3950o1 c3950o1, C3720e0 c3720e0) {
            super(1);
            this.f13991b = c3950o1;
            this.f13992c = c3720e0;
        }

        /* JADX INFO: renamed from: a */
        public final void m17454a(C4004qb loadAd) {
            Intrinsics.checkNotNullParameter(loadAd, "$this$loadAd");
            AbstractC4124w.m19731a(loadAd, new a(this.f13991b, this.f13992c), new b(this.f13992c, this.f13991b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m17454a((C4004qb) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.e0$d */
    public static final class d extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C3950o1 f13997b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C3720e0 f13998c;

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.e0$d$a */
        public static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3950o1 f13999b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C3720e0 f14000c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3950o1 c3950o1, C3720e0 c3720e0) {
                super(1);
                this.f13999b = c3950o1;
                this.f14000c = c3720e0;
            }

            /* JADX INFO: renamed from: a */
            public final void m17458a(C4004qb fold) {
                Intrinsics.checkNotNullParameter(fold, "$this$fold");
                this.f13999b.m18858a(fold.m19155a());
                this.f14000c.m17447e(this.f13999b);
                this.f14000c.m17443b(fold, this.f13999b);
                this.f14000c.mo17428a(this.f13999b, InterfaceC3807hi.a.FINISH_SUCCESS);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m17458a((C4004qb) obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.e0$d$b */
        public static final class b extends Lambda implements Function2 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3720e0 f14001b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C3950o1 f14002c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C3720e0 c3720e0, C3950o1 c3950o1) {
                super(2);
                this.f14001b = c3720e0;
                this.f14002c = c3950o1;
            }

            /* JADX INFO: renamed from: a */
            public final void m17459a(C4004qb fold, CBError it) {
                Intrinsics.checkNotNullParameter(fold, "$this$fold");
                Intrinsics.checkNotNullParameter(it, "it");
                this.f14001b.m17433a(fold, this.f14002c);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                m17459a((C4004qb) obj, (CBError) obj2);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C3950o1 c3950o1, C3720e0 c3720e0) {
            super(1);
            this.f13997b = c3950o1;
            this.f13998c = c3720e0;
        }

        /* JADX INFO: renamed from: a */
        public final void m17457a(C4004qb loadAd) {
            Intrinsics.checkNotNullParameter(loadAd, "$this$loadAd");
            AbstractC4124w.m19731a(loadAd, new a(this.f13997b, this.f13998c), new b(this.f13998c, this.f13997b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m17457a((C4004qb) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.e0$e */
    public /* synthetic */ class e extends FunctionReferenceImpl implements Function2 {
        public e(Object obj) {
            super(2, obj, C3720e0.class, "loadOpenRTBAd", "loadOpenRTBAd(Lcom/chartboost/sdk/internal/AdUnitManager/data/AppRequest;Lcom/chartboost/sdk/internal/AdUnitManager/loaders/LoadParams;)V", 0);
        }

        /* JADX INFO: renamed from: a */
        public final void m17460a(C3950o1 p0, C3982pb p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((C3720e0) this.receiver).m17445c(p0, p1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m17460a((C3950o1) obj, (C3982pb) obj2);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.e0$f */
    public /* synthetic */ class f extends FunctionReferenceImpl implements Function2 {
        public f(Object obj) {
            super(2, obj, C3720e0.class, "loadAdGet", "loadAdGet(Lcom/chartboost/sdk/internal/AdUnitManager/data/AppRequest;Lcom/chartboost/sdk/internal/AdUnitManager/loaders/LoadParams;)V", 0);
        }

        /* JADX INFO: renamed from: a */
        public final void m17461a(C3950o1 p0, C3982pb p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((C3720e0) this.receiver).m17429a(p0, p1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m17461a((C3950o1) obj, (C3982pb) obj2);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.e0$g */
    public /* synthetic */ class g extends FunctionReferenceImpl implements Function2 {
        public g(Object obj) {
            super(2, obj, C3720e0.class, "loadNrpAd", "loadNrpAd(Lcom/chartboost/sdk/internal/AdUnitManager/data/AppRequest;Lcom/chartboost/sdk/internal/AdUnitManager/loaders/LoadParams;)V", 0);
        }

        /* JADX INFO: renamed from: a */
        public final void m17462a(C3950o1 p0, C3982pb p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((C3720e0) this.receiver).m17441b(p0, p1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m17462a((C3950o1) obj, (C3982pb) obj2);
            return Unit.INSTANCE;
        }
    }

    public C3720e0(AbstractC3628a0 adType, C4001q8 fileCache, C3769g3 reachability, InterfaceC3855jk videoRepository, InterfaceC4192z1 assetsDownloader, InterfaceC4080u adLoader, C3918me ortbLoader, Mediation mediation, InterfaceC3911m7 eventTracker, AtomicReference atomicReference) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(reachability, "reachability");
        Intrinsics.checkNotNullParameter(videoRepository, "videoRepository");
        Intrinsics.checkNotNullParameter(assetsDownloader, "assetsDownloader");
        Intrinsics.checkNotNullParameter(adLoader, "adLoader");
        Intrinsics.checkNotNullParameter(ortbLoader, "ortbLoader");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f13970a = adType;
        this.f13971b = fileCache;
        this.f13972c = reachability;
        this.f13973d = videoRepository;
        this.f13974e = assetsDownloader;
        this.f13975f = adLoader;
        this.f13976g = ortbLoader;
        this.f13977h = mediation;
        this.f13978i = eventTracker;
        this.f13979j = atomicReference;
        this.f13983n = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m17419a(C3720e0 c3720e0, String str, InterfaceC3743f0 interfaceC3743f0, String str2, C3674c0 c3674c0, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            c3674c0 = null;
        }
        c3720e0.m17437a(str, interfaceC3743f0, str2, c3674c0);
    }

    /* JADX INFO: renamed from: a */
    public final C3950o1 m17424a() {
        return this.f13980k;
    }

    /* JADX INFO: renamed from: a */
    public final CBError.Impression m17425a(CBError cBError) {
        return (cBError != null ? cBError.getImpressionError() : null) != null ? cBError.getImpressionError() : CBError.Impression.INTERNAL;
    }

    /* JADX INFO: renamed from: a */
    public final void m17426a(InterfaceC3807hi interfaceC3807hi, String str) {
        track((AbstractC3738ei) new C4091ua(interfaceC3807hi, "", this.f13970a.m16771b(), str, this.f13977h, null, 32, null));
    }

    /* JADX INFO: renamed from: a */
    public final void m17427a(C3950o1 c3950o1) {
        String strM16876r;
        InterfaceC3911m7 interfaceC3911m7 = this.f13978i;
        C3651b0 c3651b0M18857a = c3950o1.m18857a();
        if (c3651b0M18857a == null || (strM16876r = c3651b0M18857a.m16876r()) == null) {
            strM16876r = "";
        }
        interfaceC3911m7.clear(strM16876r, c3950o1.m18865d());
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3766g0
    /* JADX INFO: renamed from: a */
    public void mo17428a(C3950o1 appRequest, InterfaceC3807hi trackingEventName) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(trackingEventName, "trackingEventName");
        InterfaceC3743f0 interfaceC3743f0 = this.f13981l;
        if (interfaceC3743f0 != null) {
            interfaceC3743f0.mo17233b(m17444c(appRequest), trackingEventName);
        }
        this.f13983n.set(false);
    }

    /* JADX INFO: renamed from: a */
    public final void m17429a(C3950o1 c3950o1, C3982pb c3982pb) {
        this.f13975f.mo18650a(c3982pb, new b(c3950o1));
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4104v1
    /* JADX INFO: renamed from: a */
    public void mo17430a(C3950o1 request, EnumC4126w1 resultAsset) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(resultAsset, "resultAsset");
        int i = a.f13984a[resultAsset.ordinal()];
        if (i == 1) {
            m17446d(request);
        } else if (i == 2) {
            C4048sb.m19408a("onAssetDownloaded: Ready to show", (Throwable) null, 2, (Object) null);
        } else {
            if (i != 3) {
                return;
            }
            C4048sb.m19408a("onAssetDownloaded: Success", (Throwable) null, 2, (Object) null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m17431a(C3950o1 c3950o1, CBError.Impression impression) {
        InterfaceC3743f0 interfaceC3743f0 = this.f13981l;
        if (interfaceC3743f0 != null) {
            interfaceC3743f0.mo17230a(m17444c(c3950o1), impression);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m17432a(C3950o1 c3950o1, CBError cBError) {
        m17442b(c3950o1, m17425a(cBError));
        m17448f(c3950o1);
    }

    /* JADX INFO: renamed from: a */
    public final void m17433a(C4004qb c4004qb, C3950o1 c3950o1) {
        m17436a(c3950o1.m18865d(), (C3651b0) null);
        m17432a(c3950o1, c4004qb.m19156b());
    }

    /* JADX INFO: renamed from: a */
    public final void m17434a(CBError cBError, InterfaceC3807hi interfaceC3807hi, String str) {
        String message = cBError.getMessage();
        if (message == null) {
            message = "";
        }
        track((AbstractC3738ei) new C3796h7(interfaceC3807hi, message, this.f13970a.m16771b(), str, this.f13977h));
    }

    /* JADX INFO: renamed from: a */
    public final void m17435a(CBError cBError, String str) {
        CBError.Type type = cBError.getType();
        if (type == CBError.Internal.HTTP_NOT_FOUND || type == CBError.Internal.HTTP_NOT_OK) {
            m17434a(cBError, InterfaceC3807hi.a.SERVER_ERROR, str);
        } else if (type == CBError.Internal.UNSUPPORTED_OS_VERSION) {
            m17434a(cBError, InterfaceC3807hi.f.UNSUPPORTED_OS_VERSION, str);
        } else {
            m17434a(cBError, InterfaceC3807hi.a.REQUEST_ERROR, str);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m17436a(String str, C3651b0 c3651b0) {
        String strM16871m;
        String strM16867i;
        String strM16874p;
        String strM16860b;
        String strM16883y;
        if (str == null) {
            str = "no location";
        }
        String str2 = str;
        String strM16771b = this.f13970a.m16771b();
        if (c3651b0 == null || (strM16871m = c3651b0.m16871m()) == null) {
            strM16871m = "";
        }
        if (c3651b0 == null || (strM16867i = c3651b0.m16867i()) == null) {
            strM16867i = "";
        }
        if (c3651b0 == null || (strM16874p = c3651b0.m16874p()) == null) {
            strM16874p = "";
        }
        if (c3651b0 == null || (strM16860b = c3651b0.m16860b()) == null) {
            strM16860b = "";
        }
        store(new C4076th(str2, strM16771b, strM16871m, strM16867i, strM16874p, strM16860b, (c3651b0 == null || (strM16883y = c3651b0.m16883y()) == null) ? "" : strM16883y, AbstractC3697d0.m17242a(this.f13982m)));
    }

    /* JADX INFO: renamed from: a */
    public final void m17437a(String location, InterfaceC3743f0 callback, String str, C3674c0 c3674c0) {
        C3651b0 c3651b0M18857a;
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.f13983n.getAndSet(true)) {
            m17426a(InterfaceC3807hi.a.IGNORED, location);
            return;
        }
        C3950o1 c3950o1 = this.f13980k;
        if (c3950o1 != null && (c3651b0M18857a = c3950o1.m18857a()) != null && !this.f13971b.m19135a(c3651b0M18857a).booleanValue()) {
            m17427a(c3950o1);
            this.f13980k = null;
        }
        C3950o1 c3950o2 = this.f13980k;
        if (c3950o2 != null) {
            c3950o2.m18860a(str);
        }
        C3950o1 c3950o3 = this.f13980k;
        if (c3950o3 == null) {
            C3950o1 c3950o4 = new C3950o1((int) System.currentTimeMillis(), location, str, null, null, false, false, 120, null);
            this.f13981l = callback;
            this.f13982m = c3674c0;
            c3950o4.m18859a(c3674c0);
            this.f13980k = c3950o4;
            c3950o3 = c3950o4;
        }
        if (!this.f13972c.m17757e()) {
            m17442b(c3950o3, CBError.Impression.INTERNET_UNAVAILABLE_AT_CACHE);
            return;
        }
        c3950o3.m18861a(true);
        if (c3950o3.m18857a() != null) {
            mo17428a(c3950o3, InterfaceC3807hi.a.IGNORED);
        } else {
            m17426a(InterfaceC3807hi.a.START, c3950o3.m18865d());
            m17450h(c3950o3);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m17438a(String bidResponse, InterfaceC3807hi trackingEventName) {
        Intrinsics.checkNotNullParameter(bidResponse, "bidResponse");
        Intrinsics.checkNotNullParameter(trackingEventName, "trackingEventName");
        InterfaceC3743f0 interfaceC3743f0 = this.f13981l;
        if (interfaceC3743f0 != null) {
            interfaceC3743f0.mo17228a(bidResponse, trackingEventName);
        }
        this.f13983n.set(false);
    }

    /* JADX INFO: renamed from: b */
    public final void m17439b() {
        if (this.f13983n.get()) {
            return;
        }
        C3950o1 c3950o1 = this.f13980k;
        if (c3950o1 != null) {
            m17427a(c3950o1);
            c3950o1.m18858a((C3651b0) null);
        }
        this.f13980k = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m17440b(C3950o1 c3950o1) {
        this.f13974e.mo16797a(c3950o1, this.f13970a.m16771b(), this, this);
    }

    /* JADX INFO: renamed from: b */
    public final void m17441b(C3950o1 c3950o1, C3982pb c3982pb) {
        this.f13975f.mo18650a(c3982pb, new c(c3950o1, this));
    }

    /* JADX INFO: renamed from: b */
    public final void m17442b(C3950o1 c3950o1, CBError.Impression impression) {
        this.f13983n.set(false);
        m17431a(c3950o1, impression);
        if (impression == CBError.Impression.NO_AD_FOUND) {
            return;
        }
        String strM16771b = this.f13970a.m16771b();
        C3651b0 c3651b0M18857a = c3950o1.m18857a();
        String strM16859a = c3651b0M18857a != null ? c3651b0M18857a.m16859a() : null;
        C4048sb.m19411b("reportError: adTypeTraits: " + strM16771b + " reason: cache  format: web error: " + impression + " adId: " + strM16859a + " appRequest.location: " + c3950o1.m18865d(), (Throwable) null, 2, (Object) null);
    }

    /* JADX INFO: renamed from: b */
    public final void m17443b(C4004qb c4004qb, C3950o1 c3950o1) {
        m17436a(c3950o1.m18865d(), c4004qb.m19155a());
        c3950o1.m18858a(c4004qb.m19155a());
    }

    /* JADX INFO: renamed from: c */
    public final String m17444c(C3950o1 c3950o1) {
        C3651b0 c3651b0M18857a = c3950o1.m18857a();
        if (c3651b0M18857a != null) {
            return c3651b0M18857a.m16871m();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m17445c(C3950o1 c3950o1, C3982pb c3982pb) {
        this.f13976g.mo18650a(c3982pb, new d(c3950o1, this));
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f13978i.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei clearFromStorage(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f13978i.clearFromStorage(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo43985clearFromStorage(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f13978i.mo43985clearFromStorage(event);
    }

    /* JADX INFO: renamed from: d */
    public final void m17446d(C3950o1 c3950o1) {
        m17442b(c3950o1, CBError.Impression.ASSETS_DOWNLOAD_FAILURE);
        m17448f(c3950o1);
    }

    /* JADX INFO: renamed from: e */
    public final void m17447e(C3950o1 c3950o1) {
        String strM16856C;
        String strM16855B;
        C3651b0 c3651b0M18857a = c3950o1.m18857a();
        if (c3651b0M18857a == null || !c3651b0M18857a.m16857D()) {
            return;
        }
        InterfaceC3855jk interfaceC3855jk = this.f13973d;
        C3651b0 c3651b0M18857a2 = c3950o1.m18857a();
        String str = "";
        if (c3651b0M18857a2 == null || (strM16856C = c3651b0M18857a2.m16856C()) == null) {
            strM16856C = "";
        }
        C3651b0 c3651b0M18857a3 = c3950o1.m18857a();
        if (c3651b0M18857a3 != null && (strM16855B = c3651b0M18857a3.m16855B()) != null) {
            str = strM16855B;
        }
        interfaceC3855jk.mo18296a(strM16856C, str, false, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m17448f(C3950o1 c3950o1) {
        m17427a(c3950o1);
        c3950o1.m18858a((C3651b0) null);
        this.f13983n.set(false);
    }

    /* JADX INFO: renamed from: g */
    public final void m17449g(C3950o1 c3950o1) {
        C3674c0 c3674c0 = this.f13982m;
        Integer numValueOf = c3674c0 != null ? Integer.valueOf(c3674c0.m16996a()) : null;
        C3674c0 c3674c1 = this.f13982m;
        C3982pb c3982pb = new C3982pb(c3950o1, true, numValueOf, c3674c1 != null ? Integer.valueOf(c3674c1.m16998c()) : null);
        AtomicReference atomicReference = this.f13979j;
        C3920mg c3920mg = atomicReference != null ? (C3920mg) atomicReference.get() : null;
        if (c3920mg == null) {
            C4048sb.m19417e("SDK configuration is null for location: " + c3950o1.m18865d() + ". Falling back to legacy ad request.", null, 2, null);
        }
        boolean zM18671j = c3920mg != null ? c3920mg.m18671j() : false;
        C4197z6 c4197z6M18664c = c3920mg != null ? c3920mg.m18664c() : null;
        if (c4197z6M18664c == null) {
            c4197z6M18664c = C4197z6.INSTANCE.m20112a();
        }
        Pair pairM17945a = C3812i0.f14536a.m17945a(c3950o1, c3982pb, new e(this), new f(this), new g(this), this.f13970a, zM18671j, c4197z6M18664c);
        ((Function2) pairM17945a.component1()).invoke(c3950o1, (C3982pb) pairM17945a.component2());
    }

    /* JADX INFO: renamed from: h */
    public final void m17450h(C3950o1 c3950o1) {
        try {
            m17449g(c3950o1);
        } catch (Exception e2) {
            C4048sb.m19410b("sendAdGetRequest", e2);
            m17432a(c3950o1, new CBError(CBError.Internal.MISCELLANEOUS, "error sending ad-get request"));
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei persist(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f13978i.persist(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: persist */
    public void mo43986persist(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f13978i.mo43986persist(event);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C3692ci refresh(C3692ci c3692ci) {
        Intrinsics.checkNotNullParameter(c3692ci, "<this>");
        return this.f13978i.refresh(c3692ci);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: refresh */
    public void mo43987refresh(C3692ci config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f13978i.mo43987refresh(config);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C4076th store(C4076th c4076th) {
        Intrinsics.checkNotNullParameter(c4076th, "<this>");
        return this.f13978i.store(c4076th);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: store */
    public void mo43988store(C4076th ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f13978i.mo43988store(ad);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei track(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f13978i.track(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: track */
    public void mo43989track(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f13978i.mo43989track(event);
    }
}

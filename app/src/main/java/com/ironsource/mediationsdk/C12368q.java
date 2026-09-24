package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.TextUtils;
import com.ironsource.C11367Bd;
import com.ironsource.C11373C1;
import com.ironsource.C11445G1;
import com.ironsource.C11455Gb;
import com.ironsource.C11473Hb;
import com.ironsource.C11486I6;
import com.ironsource.C11494Ie;
import com.ironsource.C11553M1;
import com.ironsource.C11566Me;
import com.ironsource.C11648R9;
import com.ironsource.C11694U4;
import com.ironsource.C11787Zc;
import com.ironsource.C12317m4;
import com.ironsource.C12387n9;
import com.ironsource.C12464re;
import com.ironsource.C12580w5;
import com.ironsource.C12624yd;
import com.ironsource.EnumC12446qe;
import com.ironsource.EnumC12598x5;
import com.ironsource.InterfaceC11456Gc;
import com.ironsource.InterfaceC12263j7;
import com.ironsource.InterfaceC12605xc;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.q */
/* JADX INFO: loaded from: classes6.dex */
class C12368q implements InterfaceC12605xc {

    /* JADX INFO: renamed from: z */
    private static C12368q f31409z;

    /* JADX INFO: renamed from: a */
    private C11566Me f31410a;

    /* JADX INFO: renamed from: p */
    private NetworkStateReceiver f31425p;

    /* JADX INFO: renamed from: q */
    private CountDownTimer f31426q;

    /* JADX INFO: renamed from: t */
    private String f31429t;

    /* JADX INFO: renamed from: u */
    private C11494Ie f31430u;

    /* JADX INFO: renamed from: w */
    private long f31432w;

    /* JADX INFO: renamed from: b */
    private int f31411b = e.f31449f;

    /* JADX INFO: renamed from: c */
    private InterfaceC12263j7 f31412c = C11455Gb.m25891U().mo25847k();

    /* JADX INFO: renamed from: d */
    private final String f31413d = "appKey";

    /* JADX INFO: renamed from: e */
    private final String f31414e = getClass().getSimpleName();

    /* JADX INFO: renamed from: l */
    private boolean f31421l = false;

    /* JADX INFO: renamed from: n */
    private boolean f31423n = false;

    /* JADX INFO: renamed from: r */
    private List<InterfaceC11456Gc> f31427r = new ArrayList();

    /* JADX INFO: renamed from: s */
    private String f31428s = "";

    /* JADX INFO: renamed from: y */
    private f f31434y = new a();

    /* JADX INFO: renamed from: m */
    private Handler f31422m = IronSourceThreadManager.INSTANCE.getInitHandler();

    /* JADX INFO: renamed from: f */
    private int f31415f = 1;

    /* JADX INFO: renamed from: g */
    private int f31416g = 0;

    /* JADX INFO: renamed from: h */
    private int f31417h = 62;

    /* JADX INFO: renamed from: i */
    private int f31418i = 12;

    /* JADX INFO: renamed from: j */
    private int f31419j = 5;

    /* JADX INFO: renamed from: o */
    private AtomicBoolean f31424o = new AtomicBoolean(true);

    /* JADX INFO: renamed from: k */
    private boolean f31420k = false;

    /* JADX INFO: renamed from: v */
    private boolean f31431v = false;

    /* JADX INFO: renamed from: x */
    private C11648R9 f31433x = new C11648R9();

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.q$a */
    class a extends f {
        a() {
            super();
        }

        /* JADX WARN: Code duplicated, block: B:55:0x02a0 A[Catch: Exception -> 0x02f5, TryCatch #0 {Exception -> 0x02f5, blocks: (B:2:0x0000, B:4:0x0010, B:5:0x001f, B:7:0x002b, B:8:0x003a, B:10:0x007e, B:12:0x0091, B:14:0x00ce, B:15:0x00f7, B:17:0x0127, B:19:0x012d, B:20:0x0154, B:22:0x017f, B:24:0x0189, B:25:0x0196, B:26:0x01aa, B:28:0x01b0, B:29:0x01ca, B:31:0x01e7, B:66:0x02ef, B:32:0x020c, B:34:0x0214, B:35:0x0226, B:37:0x022c, B:38:0x0238, B:40:0x023f, B:41:0x024a, B:43:0x0250, B:44:0x025a, B:46:0x025e, B:48:0x026a, B:50:0x0287, B:51:0x0290, B:53:0x0294, B:65:0x02e5, B:55:0x02a0, B:57:0x02a8, B:59:0x02b3, B:60:0x02b7, B:61:0x02c1, B:63:0x02c7, B:64:0x02d3), top: B:71:0x0000 }] */
        /* JADX WARN: Code duplicated, block: B:57:0x02a8 A[Catch: Exception -> 0x02f5, TryCatch #0 {Exception -> 0x02f5, blocks: (B:2:0x0000, B:4:0x0010, B:5:0x001f, B:7:0x002b, B:8:0x003a, B:10:0x007e, B:12:0x0091, B:14:0x00ce, B:15:0x00f7, B:17:0x0127, B:19:0x012d, B:20:0x0154, B:22:0x017f, B:24:0x0189, B:25:0x0196, B:26:0x01aa, B:28:0x01b0, B:29:0x01ca, B:31:0x01e7, B:66:0x02ef, B:32:0x020c, B:34:0x0214, B:35:0x0226, B:37:0x022c, B:38:0x0238, B:40:0x023f, B:41:0x024a, B:43:0x0250, B:44:0x025a, B:46:0x025e, B:48:0x026a, B:50:0x0287, B:51:0x0290, B:53:0x0294, B:65:0x02e5, B:55:0x02a0, B:57:0x02a8, B:59:0x02b3, B:60:0x02b7, B:61:0x02c1, B:63:0x02c7, B:64:0x02d3), top: B:71:0x0000 }] */
        /* JADX WARN: Code duplicated, block: B:59:0x02b3 A[Catch: Exception -> 0x02f5, TryCatch #0 {Exception -> 0x02f5, blocks: (B:2:0x0000, B:4:0x0010, B:5:0x001f, B:7:0x002b, B:8:0x003a, B:10:0x007e, B:12:0x0091, B:14:0x00ce, B:15:0x00f7, B:17:0x0127, B:19:0x012d, B:20:0x0154, B:22:0x017f, B:24:0x0189, B:25:0x0196, B:26:0x01aa, B:28:0x01b0, B:29:0x01ca, B:31:0x01e7, B:66:0x02ef, B:32:0x020c, B:34:0x0214, B:35:0x0226, B:37:0x022c, B:38:0x0238, B:40:0x023f, B:41:0x024a, B:43:0x0250, B:44:0x025a, B:46:0x025e, B:48:0x026a, B:50:0x0287, B:51:0x0290, B:53:0x0294, B:65:0x02e5, B:55:0x02a0, B:57:0x02a8, B:59:0x02b3, B:60:0x02b7, B:61:0x02c1, B:63:0x02c7, B:64:0x02d3), top: B:71:0x0000 }] */
        /* JADX WARN: Code duplicated, block: B:63:0x02c7 A[Catch: Exception -> 0x02f5, LOOP:3: B:61:0x02c1->B:63:0x02c7, LOOP_END, TryCatch #0 {Exception -> 0x02f5, blocks: (B:2:0x0000, B:4:0x0010, B:5:0x001f, B:7:0x002b, B:8:0x003a, B:10:0x007e, B:12:0x0091, B:14:0x00ce, B:15:0x00f7, B:17:0x0127, B:19:0x012d, B:20:0x0154, B:22:0x017f, B:24:0x0189, B:25:0x0196, B:26:0x01aa, B:28:0x01b0, B:29:0x01ca, B:31:0x01e7, B:66:0x02ef, B:32:0x020c, B:34:0x0214, B:35:0x0226, B:37:0x022c, B:38:0x0238, B:40:0x023f, B:41:0x024a, B:43:0x0250, B:44:0x025a, B:46:0x025e, B:48:0x026a, B:50:0x0287, B:51:0x0290, B:53:0x0294, B:65:0x02e5, B:55:0x02a0, B:57:0x02a8, B:59:0x02b3, B:60:0x02b7, B:61:0x02c1, B:63:0x02c7, B:64:0x02d3), top: B:71:0x0000 }] */
        @Override // java.lang.Runnable
        public void run() {
            C12368q c12368q;
            Iterator it;
            try {
                C12367p c12367pM32628h = C12367p.m32628h();
                if (!TextUtils.isEmpty(C12368q.this.f31428s)) {
                    C11486I6.m26069a().m26071a("userId", C12368q.this.f31428s);
                }
                if (!TextUtils.isEmpty(C12368q.this.f31429t)) {
                    C11486I6.m26069a().m26071a("appKey", C12368q.this.f31429t);
                }
                C12368q c12368q2 = C12368q.this;
                c12368q2.f31433x.m27362i(c12368q2.f31428s);
                C12368q.this.f31432w = new Date().getTime();
                C12624yd.m34235c().m34237a();
                C12368q.this.f31430u = c12367pM32628h.m32656b(ContextProvider.getInstance().getApplicationContext(), C12368q.this.f31428s, this.f31452c);
                C12368q c12368q3 = C12368q.this;
                if (c12368q3.f31430u != null) {
                    c12368q3.f31422m.removeCallbacks(this);
                    if (C12368q.this.f31430u.m26143q()) {
                        C12368q.this.m32685b(d.INITIATED);
                        new C11473Hb().m26007a(C12368q.this.f31430u.m26133c().m26602b().m25547e().m26336b(), c12367pM32628h.m32675v());
                        C11553M1 c11553m1M25548f = C12368q.this.f31430u.m26133c().m26602b().m25548f();
                        if (c11553m1M25548f != null) {
                            C11694U4 c11694u4 = C11694U4.f25873a;
                            c11694u4.m27586c(c11553m1M25548f.m26455g());
                            c11694u4.m27582a(c11553m1M25548f.m26454f());
                            c11694u4.m27581a(c11553m1M25548f.m26458j());
                            IronSourceThreadManager.INSTANCE.setUseSharedExecutorService(c11553m1M25548f.m26456h());
                            C12368q.this.f31412c.mo26713a(c11553m1M25548f);
                        }
                        C12368q.this.m32682a(ContextProvider.getInstance().getApplicationContext(), C12368q.this.f31430u);
                        long time = new Date().getTime();
                        C12368q c12368q4 = C12368q.this;
                        c12367pM32628h.m32649a(time - c12368q4.f31432w, c12368q4.f31430u.m26138i());
                        if (c11553m1M25548f != null && c11553m1M25548f.m26453e()) {
                            new C11367Bd(C11455Gb.m25891U().mo25850q(), new Function0() { // from class: com.ironsource.mediationsdk.q$a$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Long.valueOf(System.currentTimeMillis());
                                }
                            }, C11455Gb.m25891U(), IronSourceThreadManager.INSTANCE.getThreadPoolExecutor()).m25508c(ContextProvider.getInstance().getApplicationContext());
                        }
                        C12368q.this.f31410a = new C11566Me();
                        C12368q c12368q5 = C12368q.this;
                        c12368q5.f31410a.m26558a(c12368q5.f31412c);
                        if (C12368q.this.f31430u.m26133c().m26602b().m25549g() && ContextProvider.getInstance().getApplicationContext() != null) {
                            C12387n9.f31560a.m32822a(ContextProvider.getInstance().getApplicationContext());
                        }
                        List<IronSource.EnumC12328a> listM26137h = C12368q.this.f31430u.m26137h();
                        Iterator it2 = C12368q.this.f31427r.iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC11456Gc) it2.next()).mo25925a(listM26137h, C12368q.this.m32680h(), C12368q.this.f31430u.m26133c());
                        }
                        C11787Zc.f26696P.m28079i();
                        C11445G1 c11445g1M25546d = C12368q.this.f31430u.m26133c().m26602b().m25546d();
                        if (c11445g1M25546d.m25827f()) {
                            C12317m4.m32153d().m32156a(c11445g1M25546d.m25819b(), c11445g1M25546d.m25825d(), c11445g1M25546d.m25822c(), c11445g1M25546d.m25826e(), IronSourceUtils.m32764d(), c11445g1M25546d.m25815a(), c11445g1M25546d.m25828g());
                        }
                    } else {
                        C12368q c12368q6 = C12368q.this;
                        if (!c12368q6.f31421l) {
                            c12368q6.m32685b(d.INIT_FAILED);
                            C12368q c12368q7 = C12368q.this;
                            c12368q7.f31421l = true;
                            Iterator it3 = c12368q7.f31427r.iterator();
                            while (it3.hasNext()) {
                                ((InterfaceC11456Gc) it3.next()).mo25926g("serverResponseIsNotValid");
                            }
                        }
                    }
                } else {
                    if (c12368q3.f31416g == 3) {
                        c12368q3.f31431v = true;
                        Iterator it4 = c12368q3.f31427r.iterator();
                        while (it4.hasNext()) {
                            ((InterfaceC11456Gc) it4.next()).mo25924a();
                        }
                    }
                    if (this.f31450a) {
                        C12368q c12368q8 = C12368q.this;
                        if (c12368q8.f31416g < c12368q8.f31417h) {
                            c12368q8.f31420k = true;
                            c12368q8.f31422m.postDelayed(this, c12368q8.f31415f * 1000);
                            C12368q c12368q9 = C12368q.this;
                            if (c12368q9.f31416g < c12368q9.f31418i) {
                                c12368q9.f31415f *= 2;
                            }
                        }
                    }
                    if (this.f31450a) {
                        C12368q c12368q10 = C12368q.this;
                        if (c12368q10.f31416g == c12368q10.f31419j) {
                            c12368q = C12368q.this;
                            if (!c12368q.f31421l) {
                                c12368q.f31421l = true;
                                if (TextUtils.isEmpty(this.f31451b)) {
                                    this.f31451b = "noServerResponse";
                                }
                                it = C12368q.this.f31427r.iterator();
                                while (it.hasNext()) {
                                    ((InterfaceC11456Gc) it.next()).mo25926g(this.f31451b);
                                }
                                C12368q.this.m32685b(d.INIT_FAILED);
                                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No server response", 1);
                            }
                        }
                    } else {
                        c12368q = C12368q.this;
                        if (!c12368q.f31421l) {
                            c12368q.f31421l = true;
                            if (TextUtils.isEmpty(this.f31451b)) {
                                this.f31451b = "noServerResponse";
                            }
                            it = C12368q.this.f31427r.iterator();
                            while (it.hasNext()) {
                                ((InterfaceC11456Gc) it.next()).mo25926g(this.f31451b);
                            }
                            C12368q.this.m32685b(d.INIT_FAILED);
                            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No server response", 1);
                        }
                    }
                    C12368q.this.f31416g++;
                }
                C12368q.this.m32679e();
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.q$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: com.ironsource.mediationsdk.q$b$a */
        class a extends CountDownTimer {
            a(long j, long j2) {
                super(j, j2);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                C12368q c12368q = C12368q.this;
                if (c12368q.f31421l) {
                    return;
                }
                c12368q.f31421l = true;
                Iterator it = c12368q.f31427r.iterator();
                while (it.hasNext()) {
                    ((InterfaceC11456Gc) it.next()).mo25926g("noInternetConnection");
                }
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No internet connection", 1);
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j) {
                if (j <= 45000) {
                    C12368q c12368q = C12368q.this;
                    c12368q.f31431v = true;
                    Iterator it = c12368q.f31427r.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC11456Gc) it.next()).mo25924a();
                    }
                }
            }
        }

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C12368q.this.f31426q = new a(60000L, 15000L).start();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.q$c */
    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f31438a;

        static {
            int[] iArr = new int[d.values().length];
            f31438a = iArr;
            try {
                iArr[d.INIT_IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31438a[d.INIT_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31438a[d.INITIATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.q$d */
    enum d {
        NOT_INIT,
        INIT_IN_PROGRESS,
        INIT_FAILED,
        INITIATED
    }

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.q$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        public static int f31444a = 0;

        /* JADX INFO: renamed from: b */
        public static int f31445b = 1;

        /* JADX INFO: renamed from: c */
        public static int f31446c = 2;

        /* JADX INFO: renamed from: d */
        public static int f31447d = 3;

        /* JADX INFO: renamed from: e */
        public static int f31448e = 4;

        /* JADX INFO: renamed from: f */
        public static int f31449f = 5;
    }

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.q$f */
    abstract class f implements Runnable {

        /* JADX INFO: renamed from: b */
        String f31451b;

        /* JADX INFO: renamed from: a */
        boolean f31450a = true;

        /* JADX INFO: renamed from: c */
        protected C12367p.b f31452c = new a();

        /* JADX INFO: renamed from: com.ironsource.mediationsdk.q$f$a */
        class a implements C12367p.b {
            a() {
            }

            @Override // com.ironsource.mediationsdk.C12367p.b
            /* JADX INFO: renamed from: a */
            public void mo32676a(String str) {
                f fVar = f.this;
                fVar.f31450a = false;
                fVar.f31451b = str;
            }
        }

        f() {
        }
    }

    private C12368q() {
    }

    /* JADX INFO: renamed from: c */
    public static synchronized C12368q m32678c() {
        if (f31409z == null) {
            f31409z = new C12368q();
        }
        return f31409z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m32679e() {
        if (C11455Gb.m25891U().mo25846h().mo32194u()) {
            C11455Gb.m25891U().mo25850q().mo25281a(new C12580w5(EnumC12598x5.EP_CONFIG_RECEIVED, (JSONObject) null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public boolean m32680h() {
        return this.f31420k;
    }

    /* JADX INFO: renamed from: a */
    public void m32682a(Context context, C11494Ie c11494Ie) {
        this.f31433x.m27362i(c11494Ie.m26136g().m27830h());
        this.f31433x.m27356c(c11494Ie.m26136g().m27826d());
        C11373C1 c11373c1M26602b = c11494Ie.m26133c().m26602b();
        this.f31433x.m27347a(c11373c1M26602b.m25543a());
        this.f31433x.m27357d(c11373c1M26602b.m25545c().m25241b());
        this.f31433x.m27353b(c11373c1M26602b.m25553k().m27844b());
        this.f31433x.m27346a(Boolean.valueOf(IronSourceUtils.m32761c(context)));
        C11553M1 c11553m1M25548f = c11494Ie.m26133c().m26602b().m25548f();
        this.f31433x.m27350b(c11553m1M25548f.m26450b());
        C11455Gb.m25885O().mo25779o().mo32174a(c11553m1M25548f.m26451c());
    }

    /* JADX INFO: renamed from: b */
    public int m32684b() {
        return this.f31411b;
    }

    /* JADX INFO: renamed from: d */
    public synchronized boolean m32686d() {
        return this.f31431v;
    }

    /* JADX INFO: renamed from: f */
    void m32687f() {
        m32685b(d.INIT_FAILED);
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m32688g() {
        int iM32677a = m32677a(m32681a());
        this.f31411b = iM32677a;
        this.f31433x.m27355c(iM32677a);
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m32685b(d dVar) {
        IronLog.INTERNAL.verbose("old status: " + m32681a() + ", new status: " + dVar + ")");
        C12464re.f31842a.m33249a(EnumC12446qe.values()[dVar.ordinal()]);
    }

    /* JADX INFO: renamed from: a */
    private static int m32677a(d dVar) {
        int i = c.f31438a[dVar.ordinal()];
        if (i == 1) {
            return e.f31447d;
        }
        if (i == 2) {
            return e.f31448e;
        }
        if (i != 3) {
            return e.f31444a;
        }
        return e.f31445b;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m32683a(Context context, String str, String str2, IronSource.EnumC12328a... enumC12328aArr) {
        try {
            AtomicBoolean atomicBoolean = this.f31424o;
            if (atomicBoolean != null && atomicBoolean.compareAndSet(true, false)) {
                m32685b(d.INIT_IN_PROGRESS);
                this.f31428s = str2;
                this.f31429t = str;
                if (IronSourceUtils.m32780g(context)) {
                    this.f31422m.post(this.f31434y);
                } else {
                    this.f31423n = true;
                    if (this.f31425p == null) {
                        this.f31425p = new NetworkStateReceiver(context, this);
                    }
                    context.registerReceiver(this.f31425p, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new b());
                }
            } else {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, this.f31414e + ": Multiple calls to init are not allowed", 2);
            }
        } catch (Exception e2) {
            C12317m4.m32153d().m32155a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    @Override // com.ironsource.InterfaceC12605xc
    /* JADX INFO: renamed from: a */
    public void mo31712a(boolean z) {
        if (this.f31423n && z) {
            CountDownTimer countDownTimer = this.f31426q;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.f31423n = false;
            this.f31420k = true;
            C11455Gb.m25891U().mo25850q().mo25281a(new C12580w5(EnumC12598x5.INIT_AFTER_REACHABILITY_CHANGE, IronSourceUtils.m32751b(false)));
            this.f31422m.post(this.f31434y);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized d m32681a() {
        return d.values()[C12464re.f31842a.m33248a().ordinal()];
    }
}

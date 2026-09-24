package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import android.util.Log;
import com.ironsource.C11341A5;
import com.ironsource.C11455Gb;
import com.ironsource.C11491Ib;
import com.ironsource.C11509Jb;
import com.ironsource.C11537L3;
import com.ironsource.C11568Mg;
import com.ironsource.C11569N;
import com.ironsource.C11613P7;
import com.ironsource.C11660S4;
import com.ironsource.C11677T4;
import com.ironsource.C11695U5;
import com.ironsource.C11703Ud;
import com.ironsource.C11744X3;
import com.ironsource.C11796a4;
import com.ironsource.C12145d5;
import com.ironsource.C12268jc;
import com.ironsource.C12317m4;
import com.ironsource.C12386n8;
import com.ironsource.C12404o8;
import com.ironsource.C12422p8;
import com.ironsource.C12540u1;
import com.ironsource.C12547u8;
import com.ironsource.C12561v4;
import com.ironsource.C12565v8;
import com.ironsource.C12579w4;
import com.ironsource.EnumC11764Y6;
import com.ironsource.HandlerC11678T5;
import com.ironsource.InterfaceC11730W6;
import com.ironsource.InterfaceC12454r4;
import com.ironsource.InterfaceC12472s4;
import com.ironsource.InterfaceC12525t4;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.sdk.controller.e */
/* JADX INFO: loaded from: classes6.dex */
public class C12496e implements InterfaceC12494c, InterfaceC12503l {

    /* JADX INFO: renamed from: b */
    private InterfaceC12503l f32019b;

    /* JADX INFO: renamed from: d */
    private CountDownTimer f32021d;

    /* JADX INFO: renamed from: g */
    private final C11613P7 f32024g;

    /* JADX INFO: renamed from: h */
    private final C11568Mg f32025h;

    /* JADX INFO: renamed from: k */
    private final C12268jc f32028k;

    /* JADX INFO: renamed from: a */
    private final String f32018a = "e";

    /* JADX INFO: renamed from: c */
    private C12386n8.b f32020c = C12386n8.b.None;

    /* JADX INFO: renamed from: e */
    private final C11537L3 f32022e = new C11537L3("NativeCommandExecutor");

    /* JADX INFO: renamed from: f */
    private final C11537L3 f32023f = new C11537L3("ControllerCommandsExecutor");

    /* JADX INFO: renamed from: i */
    private final Map<String, InterfaceC12503l.a> f32026i = new HashMap();

    /* JADX INFO: renamed from: j */
    private final Map<String, InterfaceC12503l.b> f32027j = new HashMap();

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.e$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ JSONObject f32029a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC12472s4 f32030b;

        a(JSONObject jSONObject, InterfaceC12472s4 interfaceC12472s4) {
            this.f32029a = jSONObject;
            this.f32030b = interfaceC12472s4;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC12503l interfaceC12503l = C12496e.this.f32019b;
            if (interfaceC12503l != null) {
                interfaceC12503l.mo33416a(this.f32029a, this.f32030b);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.e$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C11660S4 f32032a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Map f32033b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC12472s4 f32034c;

        b(C11660S4 c11660s4, Map map, InterfaceC12472s4 interfaceC12472s4) {
            this.f32032a = c11660s4;
            this.f32033b = map;
            this.f32034c = interfaceC12472s4;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC12503l interfaceC12503l = C12496e.this.f32019b;
            if (interfaceC12503l != null) {
                interfaceC12503l.mo33406a(this.f32032a, this.f32033b, this.f32034c);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.e$c */
    class c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f32036a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f32037b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C11660S4 f32038c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC12454r4 f32039d;

        c(String str, String str2, C11660S4 c11660s4, InterfaceC12454r4 interfaceC12454r4) {
            this.f32036a = str;
            this.f32037b = str2;
            this.f32038c = c11660s4;
            this.f32039d = interfaceC12454r4;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC12503l interfaceC12503l = C12496e.this.f32019b;
            if (interfaceC12503l != null) {
                interfaceC12503l.mo33411a(this.f32036a, this.f32037b, this.f32038c, this.f32039d);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.e$d */
    class d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ JSONObject f32041a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC12454r4 f32042b;

        d(JSONObject jSONObject, InterfaceC12454r4 interfaceC12454r4) {
            this.f32041a = jSONObject;
            this.f32042b = interfaceC12454r4;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC12503l interfaceC12503l = C12496e.this.f32019b;
            if (interfaceC12503l != null) {
                interfaceC12503l.mo33415a(this.f32041a, this.f32042b);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.e$e */
    class e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C11660S4 f32044a;

        e(C11660S4 c11660s4) {
            this.f32044a = c11660s4;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC12503l interfaceC12503l = C12496e.this.f32019b;
            if (interfaceC12503l != null) {
                interfaceC12503l.mo33404a(this.f32044a);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.e$f */
    class f implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C11660S4 f32046a;

        f(C11660S4 c11660s4) {
            this.f32046a = c11660s4;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC12503l interfaceC12503l = C12496e.this.f32019b;
            if (interfaceC12503l != null) {
                interfaceC12503l.mo33421b(this.f32046a);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.e$g */
    class g implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C11660S4 f32048a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Map f32049b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC12454r4 f32050c;

        g(C11660S4 c11660s4, Map map, InterfaceC12454r4 interfaceC12454r4) {
            this.f32048a = c11660s4;
            this.f32049b = map;
            this.f32050c = interfaceC12454r4;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC12503l interfaceC12503l = C12496e.this.f32019b;
            if (interfaceC12503l != null) {
                interfaceC12503l.mo33405a(this.f32048a, this.f32049b, this.f32050c);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.e$h */
    class h implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC12503l.a f32052a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC12497f.c f32053b;

        h(InterfaceC12503l.a aVar, InterfaceC12497f.c cVar) {
            this.f32052a = aVar;
            this.f32053b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12496e c12496e = C12496e.this;
            if (c12496e.f32019b != null) {
                if (this.f32052a != null) {
                    c12496e.f32026i.put(this.f32053b.m33445f(), this.f32052a);
                }
                C12496e.this.f32019b.mo33407a(this.f32053b, this.f32052a);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.e$i */
    class i implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ JSONObject f32055a;

        i(JSONObject jSONObject) {
            this.f32055a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC12503l interfaceC12503l = C12496e.this.f32019b;
            if (interfaceC12503l != null) {
                interfaceC12503l.mo33423b(this.f32055a);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.e$j */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC12503l interfaceC12503l = C12496e.this.f32019b;
            if (interfaceC12503l != null) {
                interfaceC12503l.mo33401a();
                C12496e.this.f32019b = null;
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.e$k */
    class k extends CountDownTimer {
        k(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.m33642i(C12496e.this.f32018a, "Global Controller Timer Finish");
            C12496e.this.m33394d(C11744X3.c.f26207k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.e$l */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C12496e.this.mo33363d();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.e$m */
    class m implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f32060a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f32061b;

        m(String str, String str2) {
            this.f32060a = str;
            this.f32061b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C12496e c12496e = C12496e.this;
                c12496e.f32019b = c12496e.m33391b(c12496e.f32025h.m26581b(), C12496e.this.f32025h.m26583d(), C12496e.this.f32025h.m26585f(), C12496e.this.f32025h.m26584e(), C12496e.this.f32025h.m26586g(), C12496e.this.f32025h.m26582c(), this.f32060a, this.f32061b);
                C12496e.this.f32019b.mo33419b();
            } catch (Throwable th) {
                C12317m4.m32153d().m32155a(th);
                C12496e.this.m33394d(Log.getStackTraceString(th));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.e$n */
    class n extends CountDownTimer {
        n(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.m33642i(C12496e.this.f32018a, "Recovered Controller | Global Controller Timer Finish");
            C12496e.this.m33394d(C11744X3.c.f26207k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.e$o */
    class o implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f32064a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f32065b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C11660S4 f32066c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC12525t4 f32067d;

        o(String str, String str2, C11660S4 c11660s4, InterfaceC12525t4 interfaceC12525t4) {
            this.f32064a = str;
            this.f32065b = str2;
            this.f32066c = c11660s4;
            this.f32067d = interfaceC12525t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC12503l interfaceC12503l = C12496e.this.f32019b;
            if (interfaceC12503l != null) {
                interfaceC12503l.mo33413a(this.f32064a, this.f32065b, this.f32066c, this.f32067d);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.e$p */
    class p implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ JSONObject f32069a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC12525t4 f32070b;

        p(JSONObject jSONObject, InterfaceC12525t4 interfaceC12525t4) {
            this.f32069a = jSONObject;
            this.f32070b = interfaceC12525t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC12503l interfaceC12503l = C12496e.this.f32019b;
            if (interfaceC12503l != null) {
                interfaceC12503l.mo33417a(this.f32069a, this.f32070b);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.e$q */
    class q implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f32072a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f32073b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C11660S4 f32074c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC12472s4 f32075d;

        q(String str, String str2, C11660S4 c11660s4, InterfaceC12472s4 interfaceC12472s4) {
            this.f32072a = str;
            this.f32073b = str2;
            this.f32074c = c11660s4;
            this.f32075d = interfaceC12472s4;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC12503l interfaceC12503l = C12496e.this.f32019b;
            if (interfaceC12503l != null) {
                interfaceC12503l.mo33412a(this.f32072a, this.f32073b, this.f32074c, this.f32075d);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.e$r */
    class r implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f32077a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC12472s4 f32078b;

        r(String str, InterfaceC12472s4 interfaceC12472s4) {
            this.f32077a = str;
            this.f32078b = interfaceC12472s4;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC12503l interfaceC12503l = C12496e.this.f32019b;
            if (interfaceC12503l != null) {
                interfaceC12503l.mo33409a(this.f32077a, this.f32078b);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.e$s */
    class s implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C11660S4 f32080a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Map f32081b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC12472s4 f32082c;

        s(C11660S4 c11660s4, Map map, InterfaceC12472s4 interfaceC12472s4) {
            this.f32080a = c11660s4;
            this.f32081b = map;
            this.f32082c = interfaceC12472s4;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12547u8.m33895a(C11703Ud.f25971j, new C12422p8().m33061a(C11341A5.f23831v, this.f32080a.m27445f()).m33061a(C11341A5.f23832w, C12565v8.m33935a(this.f32080a, C12386n8.e.Interstitial)).m33061a(C11341A5.f23833x, Boolean.valueOf(C12565v8.m33938a(this.f32080a))).m33061a(C11341A5.f23796I, Long.valueOf(C11569N.f25195a.m26595b(this.f32080a.m27447h()))).m33062a());
            InterfaceC12503l interfaceC12503l = C12496e.this.f32019b;
            if (interfaceC12503l != null) {
                interfaceC12503l.mo33422b(this.f32080a, this.f32081b, this.f32082c);
            }
        }
    }

    public C12496e(Context context, C11796a4 c11796a4, C11677T4 c11677t4, C11613P7 c11613p7, int i2, JSONObject jSONObject, String str, String str2, C12268jc c12268jc) {
        this.f32028k = c12268jc;
        this.f32024g = c11613p7;
        String networkStorageDir = IronSourceStorageUtils.getNetworkStorageDir(context);
        C12145d5 c12145d5M31284a = C12145d5.m31284a(networkStorageDir, c11613p7, jSONObject);
        this.f32025h = new C11568Mg(context, c11796a4, c11677t4, i2, c12145d5M31284a, networkStorageDir);
        m33386a(context, c11796a4, c11677t4, i2, c12145d5M31284a, networkStorageDir, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void m33393c(Context context, C11796a4 c11796a4, C11677T4 c11677t4, int i2, C12145d5 c12145d5, String str, String str2, String str3) {
        try {
            C12513v c12513vM33391b = m33391b(context, c11796a4, c11677t4, i2, c12145d5, str, str2, str3);
            try {
                this.f32019b = c12513vM33391b;
                c12513vM33391b.mo33419b();
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                C12317m4.m32153d().m32155a(th2);
                m33394d(Log.getStackTraceString(th2));
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m33394d(String str) {
        C12547u8.m33895a(C11703Ud.f25965d, new C12422p8().m33061a(C11341A5.f23788A, str).m33062a());
        this.f32020c = C12386n8.b.Loading;
        this.f32019b = new C12505n(str, this.f32024g);
        this.f32022e.m26347c();
        this.f32022e.m26344a();
        C11613P7 c11613p7 = this.f32024g;
        if (c11613p7 != null) {
            c11613p7.m27221c(new l());
        }
    }

    /* JADX INFO: renamed from: e */
    private void m33395e(String str) {
        IronSourceNetwork.updateInitFailed(new C12404o8(1001, str));
    }

    /* JADX INFO: renamed from: i */
    private InterfaceC12503l.a m33396i() {
        return new InterfaceC12503l.a() { // from class: com.ironsource.sdk.controller.e$$ExternalSyntheticLambda0
            @Override // com.ironsource.sdk.controller.InterfaceC12503l.a
            /* JADX INFO: renamed from: a */
            public final void mo26765a(InterfaceC12497f.a aVar) {
                this.f$0.m33389a(aVar);
            }
        };
    }

    /* JADX INFO: renamed from: j */
    private InterfaceC12503l.b m33397j() {
        return new InterfaceC12503l.b() { // from class: com.ironsource.sdk.controller.e$$ExternalSyntheticLambda2
            @Override // com.ironsource.sdk.controller.InterfaceC12503l.b
            /* JADX INFO: renamed from: a */
            public final void mo26766a(C11491Ib c11491Ib) {
                this.f$0.m33387a(c11491Ib);
            }
        };
    }

    /* JADX INFO: renamed from: l */
    private void m33398l() {
        Logger.m33642i(this.f32018a, "handleReadyState");
        this.f32020c = C12386n8.b.Ready;
        CountDownTimer countDownTimer = this.f32021d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        m33400n();
        this.f32023f.m26347c();
        this.f32023f.m26344a();
        InterfaceC12503l interfaceC12503l = this.f32019b;
        if (interfaceC12503l != null) {
            interfaceC12503l.mo33425f();
        }
    }

    /* JADX INFO: renamed from: m */
    private boolean m33399m() {
        return C12386n8.b.Ready.equals(this.f32020c);
    }

    /* JADX INFO: renamed from: n */
    private void m33400n() {
        this.f32025h.m26579a(true);
        InterfaceC12503l interfaceC12503l = this.f32019b;
        if (interfaceC12503l != null) {
            interfaceC12503l.mo33414a(this.f32025h.m26587i());
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33414a(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: b */
    public void mo33419b() {
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    @Deprecated
    /* JADX INFO: renamed from: f */
    public void mo33425f() {
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: g */
    public void mo33426g() {
        InterfaceC12503l interfaceC12503l;
        if (!m33399m() || (interfaceC12503l = this.f32019b) == null) {
            return;
        }
        interfaceC12503l.mo33426g();
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: h */
    public C12386n8.c mo33427h() {
        InterfaceC12503l interfaceC12503l = this.f32019b;
        return interfaceC12503l != null ? interfaceC12503l.mo33427h() : C12386n8.c.None;
    }

    /* JADX INFO: renamed from: k */
    public InterfaceC12503l m33428k() {
        return this.f32019b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m33389a(InterfaceC12497f.a aVar) {
        InterfaceC12503l.a aVarRemove = this.f32026i.remove(aVar.m33434c());
        if (aVarRemove != null) {
            aVarRemove.mo26765a(aVar);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m33392b(Runnable runnable) {
        m33390a(runnable, 0L);
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: e */
    public void mo33424e() {
        InterfaceC12503l interfaceC12503l;
        if (!m33399m() || (interfaceC12503l = this.f32019b) == null) {
            return;
        }
        interfaceC12503l.mo33424e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public C12513v m33391b(Context context, C11796a4 c11796a4, C11677T4 c11677t4, int i2, C12145d5 c12145d5, String str, String str2, String str3) throws Throwable {
        C12547u8.m33895a(C11703Ud.f25964c, new C12422p8().m33061a(C11341A5.f23834y, "thread-" + Thread.currentThread().getName()).m33062a());
        C12513v c12513v = new C12513v(context, c11677t4, c11796a4, this, this.f32024g, i2, c12145d5, str, m33396i(), m33397j(), str2, str3);
        C11695U5 c11695u5 = new C11695U5(context, c12145d5, new HandlerC11678T5(this.f32024g.m27214a()), new C11509Jb(c12145d5.m31288a()));
        c12513v.m33562a(new C12512u(context));
        c12513v.m33560a(new C12506o(context));
        c12513v.m33561a(new C12508q(context));
        c12513v.m33558a(new C12500i(context));
        c12513v.m33557a(new C12492a(context));
        c12513v.m33559a(new C12501j(c12145d5.m31288a(), c11695u5));
        c12513v.m33564a(new C12540u1());
        c12513v.m33565a(new C12579w4(context, new C12561v4()));
        return c12513v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m33387a(C11491Ib c11491Ib) {
        InterfaceC12503l.b bVar = this.f32027j.get(c11491Ib.m26097d());
        if (bVar != null) {
            bVar.mo26766a(c11491Ib);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m33390a(Runnable runnable, long j2) {
        C11613P7 c11613p7 = this.f32024g;
        if (c11613p7 != null) {
            c11613p7.m27225d(runnable, j2);
        } else {
            Logger.m33640e(this.f32018a, "mThreadManager = null");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m33386a(final Context context, final C11796a4 c11796a4, final C11677T4 c11677t4, final int i2, final C12145d5 c12145d5, final String str, final String str2, final String str3) {
        int iMo32196w = C11455Gb.m25891U().mo25846h().mo32196w();
        if (iMo32196w > 0) {
            C12547u8.m33895a(C11703Ud.f25960B, new C12422p8().m33061a(C11341A5.f23834y, String.valueOf(iMo32196w)).m33062a());
        }
        Runnable runnable = new Runnable() { // from class: com.ironsource.sdk.controller.e$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m33393c(context, c11796a4, c11677t4, i2, c12145d5, str, str2, str3);
            }
        };
        if (C11455Gb.m25891U().mo25846h().mo32190q()) {
            this.f32024g.m27220b(runnable, iMo32196w);
        } else {
            m33390a(runnable, iMo32196w);
        }
        this.f32021d = new k(200000L, 1000L).start();
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12494c
    /* JADX INFO: renamed from: c */
    public void mo33361c() {
        Logger.m33642i(this.f32018a, "handleControllerLoaded");
        this.f32020c = C12386n8.b.Loaded;
        this.f32022e.m26347c();
        this.f32022e.m26344a();
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12494c
    /* JADX INFO: renamed from: d */
    public void mo33363d() {
        Logger.m33642i(this.f32018a, "handleControllerReady ");
        this.f32028k.m31885a(mo33427h());
        if (C12386n8.c.Web.equals(mo33427h())) {
            C12547u8.m33895a(C11703Ud.f25966e, new C12422p8().m33061a(C11341A5.f23834y, String.valueOf(this.f32025h.m26588l())).m33062a());
            IronSourceNetwork.updateInitSucceeded();
        }
        m33398l();
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12494c
    /* JADX INFO: renamed from: c */
    public void mo33362c(String str) {
        Logger.m33642i(this.f32018a, "handleControllerFailed ");
        C12422p8 c12422p8 = new C12422p8();
        c12422p8.m33061a(C11341A5.f23788A, str);
        c12422p8.m33061a(C11341A5.f23834y, String.valueOf(this.f32025h.m26588l()));
        C12547u8.m33895a(C11703Ud.f25976o, c12422p8.m33062a());
        this.f32025h.m26579a(false);
        m33395e(str);
        if (this.f32021d != null) {
            Logger.m33642i(this.f32018a, "cancel timer mControllerReadyTimer");
            this.f32021d.cancel();
        }
        m33394d(str);
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12494c
    /* JADX INFO: renamed from: b */
    public void mo33360b(String str) {
        C12547u8.m33895a(C11703Ud.f25986y, new C12422p8().m33061a(C11341A5.f23834y, str).m33062a());
        CountDownTimer countDownTimer = this.f32021d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        m33394d(str);
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: b */
    public void mo33422b(C11660S4 c11660s4, Map<String, String> map, InterfaceC12472s4 interfaceC12472s4) {
        this.f32023f.m26345a(new s(c11660s4, map, interfaceC12472s4));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: b */
    public void mo33421b(C11660S4 c11660s4) {
        this.f32023f.m26345a(new f(c11660s4));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: b */
    public void mo33423b(JSONObject jSONObject) {
        this.f32023f.m26345a(new i(jSONObject));
    }

    /* JADX INFO: renamed from: a */
    public void m33408a(Runnable runnable) {
        this.f32022e.m26345a(runnable);
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: b */
    public void mo33420b(Context context) {
        InterfaceC12503l interfaceC12503l;
        if (!m33399m() || (interfaceC12503l = this.f32019b) == null) {
            return;
        }
        interfaceC12503l.mo33420b(context);
    }

    @Override // com.ironsource.InterfaceC11799a7
    /* JADX INFO: renamed from: a */
    public void mo28114a(InterfaceC11730W6 interfaceC11730W6) {
        EnumC11764Y6 enumC11764Y6Mo27808b = interfaceC11730W6.mo27808b();
        if (enumC11764Y6Mo27808b == EnumC11764Y6.SendEvent) {
            C12547u8.m33895a(C11703Ud.f25959A, new C12422p8().m33061a(C11341A5.f23834y, interfaceC11730W6.mo27807a() + " : strategy: " + enumC11764Y6Mo27808b).m33062a());
            return;
        }
        if (enumC11764Y6Mo27808b == EnumC11764Y6.NativeController) {
            C12505n c12505n = new C12505n(interfaceC11730W6.mo27807a(), this.f32024g);
            this.f32019b = c12505n;
            this.f32028k.m31885a(c12505n.mo33427h());
            C12547u8.m33895a(C11703Ud.f25965d, new C12422p8().m33061a(C11341A5.f23788A, interfaceC11730W6.mo27807a() + " : strategy: " + enumC11764Y6Mo27808b).m33062a());
            C12547u8.m33895a(C11703Ud.f25959A, new C12422p8().m33061a(C11341A5.f23834y, interfaceC11730W6.mo27807a() + " : strategy: " + enumC11764Y6Mo27808b).m33062a());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m33388a(C12386n8.e eVar, C11660S4 c11660s4, String str, String str2) {
        Logger.m33642i(this.f32018a, "recoverWebController for product: " + eVar.toString());
        C12422p8 c12422p8 = new C12422p8();
        c12422p8.m33061a(C11341A5.f23832w, eVar.toString());
        c12422p8.m33061a(C11341A5.f23831v, c11660s4.m27445f());
        C12547u8.m33895a(C11703Ud.f25963b, c12422p8.m33062a());
        this.f32025h.m26590n();
        mo33401a();
        m mVar = new m(str, str2);
        if (C11455Gb.m25891U().mo25846h().mo32190q()) {
            this.f32024g.m27219b(mVar);
        } else {
            m33392b(mVar);
        }
        this.f32021d = new n(200000L, 1000L).start();
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33413a(String str, String str2, C11660S4 c11660s4, InterfaceC12525t4 interfaceC12525t4) {
        if (this.f32025h.m26580a(mo33427h(), this.f32020c)) {
            m33388a(C12386n8.e.RewardedVideo, c11660s4, str, str2);
        }
        this.f32023f.m26345a(new o(str, str2, c11660s4, interfaceC12525t4));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33417a(JSONObject jSONObject, InterfaceC12525t4 interfaceC12525t4) {
        this.f32023f.m26345a(new p(jSONObject, interfaceC12525t4));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33412a(String str, String str2, C11660S4 c11660s4, InterfaceC12472s4 interfaceC12472s4) {
        if (this.f32025h.m26580a(mo33427h(), this.f32020c)) {
            m33388a(C12386n8.e.Interstitial, c11660s4, str, str2);
        }
        this.f32023f.m26345a(new q(str, str2, c11660s4, interfaceC12472s4));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33409a(String str, InterfaceC12472s4 interfaceC12472s4) {
        Logger.m33642i(this.f32018a, "load interstitial");
        this.f32023f.m26345a(new r(str, interfaceC12472s4));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33416a(JSONObject jSONObject, InterfaceC12472s4 interfaceC12472s4) {
        this.f32023f.m26345a(new a(jSONObject, interfaceC12472s4));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33406a(C11660S4 c11660s4, Map<String, String> map, InterfaceC12472s4 interfaceC12472s4) {
        this.f32023f.m26345a(new b(c11660s4, map, interfaceC12472s4));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public boolean mo33418a(String str) {
        if (this.f32019b == null || !m33399m()) {
            return false;
        }
        return this.f32019b.mo33418a(str);
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33411a(String str, String str2, C11660S4 c11660s4, InterfaceC12454r4 interfaceC12454r4) {
        if (this.f32025h.m26580a(mo33427h(), this.f32020c)) {
            m33388a(C12386n8.e.Banner, c11660s4, str, str2);
        }
        this.f32023f.m26345a(new c(str, str2, c11660s4, interfaceC12454r4));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33415a(JSONObject jSONObject, InterfaceC12454r4 interfaceC12454r4) {
        this.f32023f.m26345a(new d(jSONObject, interfaceC12454r4));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33404a(C11660S4 c11660s4) {
        this.f32023f.m26345a(new e(c11660s4));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33405a(C11660S4 c11660s4, Map<String, String> map, InterfaceC12454r4 interfaceC12454r4) {
        this.f32023f.m26345a(new g(c11660s4, map, interfaceC12454r4));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33407a(InterfaceC12497f.c cVar, InterfaceC12503l.a aVar) {
        this.f32023f.m26345a(new h(aVar, cVar));
    }

    /* JADX INFO: renamed from: a */
    public void m33410a(String str, InterfaceC12503l.b bVar) {
        this.f32027j.put(str, bVar);
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33403a(Context context) {
        InterfaceC12503l interfaceC12503l;
        if (!m33399m() || (interfaceC12503l = this.f32019b) == null) {
            return;
        }
        interfaceC12503l.mo33403a(context);
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33401a() {
        Logger.m33642i(this.f32018a, "destroy controller");
        CountDownTimer countDownTimer = this.f32021d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        C11537L3 c11537l3 = this.f32023f;
        if (c11537l3 != null) {
            c11537l3.m26346b();
        }
        this.f32021d = null;
        m33392b(new j());
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33402a(Activity activity) {
        this.f32019b.mo33402a(activity);
    }
}

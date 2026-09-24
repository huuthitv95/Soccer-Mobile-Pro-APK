package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.ironsource.mediationsdk.C12367p;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.l3 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC12295l3 implements InterfaceC11343A7 {

    /* JADX INFO: renamed from: O */
    static boolean f30794O = false;

    /* JADX INFO: renamed from: A */
    private int[] f30795A;

    /* JADX INFO: renamed from: B */
    private int[] f30796B;

    /* JADX INFO: renamed from: C */
    private int[] f30797C;

    /* JADX INFO: renamed from: G */
    int f30801G;

    /* JADX INFO: renamed from: H */
    String f30802H;

    /* JADX INFO: renamed from: I */
    String f30803I;

    /* JADX INFO: renamed from: J */
    Set<Integer> f30804J;

    /* JADX INFO: renamed from: K */
    private HandlerThreadC12634z5 f30805K;

    /* JADX INFO: renamed from: L */
    private C11767Y9 f30806L;

    /* JADX INFO: renamed from: M */
    private C11512Je f30807M;

    /* JADX INFO: renamed from: l */
    private boolean f30820l;

    /* JADX INFO: renamed from: p */
    private C11358B4 f30824p;

    /* JADX INFO: renamed from: q */
    private AbstractC12157e f30825q;

    /* JADX INFO: renamed from: r */
    private ArrayList<C12580w5> f30826r;

    /* JADX INFO: renamed from: t */
    private int f30828t;

    /* JADX INFO: renamed from: u */
    private InterfaceC11470H8 f30829u;

    /* JADX INFO: renamed from: v */
    private Context f30830v;

    /* JADX INFO: renamed from: z */
    private int[] f30834z;

    /* JADX INFO: renamed from: a */
    final int f30809a = 1;

    /* JADX INFO: renamed from: b */
    final int f30810b = 100;

    /* JADX INFO: renamed from: c */
    final int f30811c = 5000;

    /* JADX INFO: renamed from: d */
    final int f30812d = 90000;

    /* JADX INFO: renamed from: e */
    final int f30813e = 1024;

    /* JADX INFO: renamed from: f */
    final int f30814f = 5;

    /* JADX INFO: renamed from: g */
    final String f30815g = "supersonic_sdk.db";

    /* JADX INFO: renamed from: h */
    final String f30816h = IronSourceConstants.EVENTS_PROVIDER;

    /* JADX INFO: renamed from: i */
    final String f30817i = "placement";

    /* JADX INFO: renamed from: j */
    private final String f30818j = "abt";

    /* JADX INFO: renamed from: k */
    private final String f30819k = C11540L6.f24958a1;

    /* JADX INFO: renamed from: m */
    private boolean f30821m = false;

    /* JADX INFO: renamed from: n */
    private boolean f30822n = false;

    /* JADX INFO: renamed from: o */
    private int f30823o = -1;

    /* JADX INFO: renamed from: s */
    private boolean f30827s = true;

    /* JADX INFO: renamed from: w */
    private int f30831w = 100;

    /* JADX INFO: renamed from: x */
    private int f30832x = 5000;

    /* JADX INFO: renamed from: y */
    private int f30833y = 1;

    /* JADX INFO: renamed from: D */
    private Map<String, String> f30798D = new HashMap();

    /* JADX INFO: renamed from: E */
    private Map<String, String> f30799E = new HashMap();

    /* JADX INFO: renamed from: F */
    private String f30800F = "";

    /* JADX INFO: renamed from: N */
    private final Object f30808N = new Object();

    /* JADX INFO: renamed from: com.ironsource.l3$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC12295l3.this.m32014a();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l3$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C12580w5 f30836a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ IronSource.EnumC12328a f30837b;

        b(C12580w5 c12580w5, IronSource.EnumC12328a enumC12328a) {
            this.f30836a = c12580w5;
            this.f30837b = enumC12328a;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f30836a.m34044a("eventSessionId", AbstractC12295l3.this.f30829u.mo25986b());
            this.f30836a.m34044a("essn", Integer.valueOf(AbstractC12295l3.this.f30829u.mo25987c()));
            String strM32733a = IronSourceUtils.m32733a(AbstractC12295l3.this.f30830v);
            if (AbstractC12295l3.this.mo28077g(this.f30836a)) {
                this.f30836a.m34044a("connectionType", strM32733a);
            }
            if (AbstractC12295l3.this.m32019a(strM32733a, this.f30836a)) {
                C12580w5 c12580w5 = this.f30836a;
                c12580w5.m34042a(AbstractC12295l3.this.m32022b(c12580w5));
            }
            String strM27579d = C11693U3.m27579d(AbstractC12295l3.this.f30830v);
            if (strM27579d != null) {
                this.f30836a.m34044a("rawConnectionType", strM27579d);
            }
            int iM32012a = AbstractC12295l3.this.m32012a(this.f30836a.m34046c(), this.f30837b);
            if (iM32012a != e.NOT_SUPPORTED.m32048b()) {
                this.f30836a.m34044a("adUnit", Integer.valueOf(iM32012a));
            }
            AbstractC12295l3.this.m32015a(this.f30836a, "reason");
            AbstractC12295l3.this.m32015a(this.f30836a, IronSourceConstants.EVENTS_EXT1);
            if (!AbstractC12295l3.this.f30799E.isEmpty()) {
                for (Map.Entry entry : AbstractC12295l3.this.f30799E.entrySet()) {
                    if (!this.f30836a.m34045b().has((String) entry.getKey()) && entry.getKey() != "eventId" && entry.getKey() != "timestamp") {
                        this.f30836a.m34044a((String) entry.getKey(), entry.getValue());
                    }
                }
            }
            if (AbstractC12295l3.this.m32028i(this.f30836a)) {
                if (AbstractC12295l3.this.mo28078h(this.f30836a) && !AbstractC12295l3.this.m32025e(this.f30836a)) {
                    this.f30836a.m34044a("sessionDepth", Integer.valueOf(AbstractC12295l3.this.mo25614c(this.f30836a)));
                }
                if (AbstractC12295l3.this.mo25619j(this.f30836a)) {
                    AbstractC12295l3.this.mo25618f(this.f30836a);
                }
                long jMo25985a = AbstractC12295l3.this.f30829u.mo25985a();
                if (jMo25985a > 0) {
                    this.f30836a.m34044a("firstSessionTimestamp", Long.valueOf(jMo25985a));
                }
                IronLog.EVENT.verbose(this.f30836a.toString());
                AbstractC12295l3.this.f30826r.add(this.f30836a);
                AbstractC12295l3.this.f30828t++;
            }
            AbstractC12295l3 abstractC12295l3 = AbstractC12295l3.this;
            boolean zM32018a = abstractC12295l3.m32021a(abstractC12295l3.f30796B) ? AbstractC12295l3.this.m32018a(this.f30836a.m34046c(), AbstractC12295l3.this.f30796B) : AbstractC12295l3.this.mo25616d(this.f30836a);
            AbstractC12295l3 abstractC12295l4 = AbstractC12295l3.this;
            if (!abstractC12295l4.f30821m && zM32018a) {
                abstractC12295l4.f30821m = true;
            }
            if (abstractC12295l4.f30824p != null) {
                if (abstractC12295l4.m32027g()) {
                    AbstractC12295l3.this.m32026f();
                    return;
                }
                AbstractC12295l3 abstractC12295l5 = AbstractC12295l3.this;
                if (abstractC12295l5.m32024b((ArrayList<C12580w5>) abstractC12295l5.f30826r) || zM32018a) {
                    AbstractC12295l3.this.m32014a();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l3$d */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC12295l3.this.m32026f();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l3$e */
    public enum e {
        NOT_SUPPORTED(-1),
        INTERSTITIAL(2),
        REWARDED_VIDEO(3),
        NATIVE_AD(4),
        BANNER(8);


        /* JADX INFO: renamed from: a */
        private int f30847a;

        e(int i) {
            this.f30847a = i;
        }

        /* JADX INFO: renamed from: b */
        public int m32048b() {
            return this.f30847a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public synchronized int m32022b(C12580w5 c12580w5) {
        return c12580w5.m34046c() + 90000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: f */
    public void m32026f() {
        ArrayList<C12580w5> arrayListMo25403a;
        try {
            this.f30821m = false;
            ArrayList<C12580w5> arrayList = new ArrayList<>();
            try {
                synchronized (this.f30808N) {
                    arrayListMo25403a = this.f30824p.mo25403a(this.f30803I);
                    this.f30824p.mo25405b(this.f30803I);
                }
                InterfaceC11359B5.c cVar = new InterfaceC11359B5.c(new InterfaceC11359B5.a(arrayListMo25403a, this.f30826r), this.f30832x);
                this.f30824p.mo25404a(cVar.m25406a(), this.f30803I);
                arrayList.addAll(cVar.m25407b());
            } catch (Throwable th) {
                C12317m4.m32153d().m32155a(th);
                IronLog.INTERNAL.error("CombinedEventList exception: " + th.getMessage());
                arrayList.clear();
                arrayList.addAll(this.f30826r);
            }
            if (arrayList.size() > 0) {
                this.f30826r.clear();
                this.f30828t = 0;
                JSONObject jSONObjectM26073b = C11486I6.m26069a().m26073b();
                try {
                    m32017a(jSONObjectM26073b);
                    String strM32038b = m32038b();
                    if (!TextUtils.isEmpty(strM32038b)) {
                        jSONObjectM26073b.put("abt", strM32038b);
                    }
                    String strM32671k = C12367p.m32628h().m32671k();
                    if (!TextUtils.isEmpty(strM32671k)) {
                        jSONObjectM26073b.put(C11540L6.f24958a1, strM32671k);
                    }
                    Map<String, String> mapM32040c = m32040c();
                    if (!mapM32040c.isEmpty()) {
                        for (Map.Entry<String, String> entry : mapM32040c.entrySet()) {
                            if (!jSONObjectM26073b.has(entry.getKey())) {
                                jSONObjectM26073b.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    JSONObject jSONObjectM25837a = new C11449G5().m25837a();
                    Iterator<String> itKeys = jSONObjectM25837a.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObjectM26073b.put(next, jSONObjectM25837a.get(next));
                    }
                } catch (Throwable th2) {
                    C12317m4.m32153d().m32155a(th2);
                    IronLog.INTERNAL.error("Exception while building the event general properties: " + th2.getMessage());
                }
                String strMo27249a = this.f30825q.mo27249a(arrayList, jSONObjectM26073b);
                if (TextUtils.isEmpty(strMo27249a)) {
                    IronLog.INTERNAL.error("Failed to parse events.");
                    return;
                }
                if (!f30794O && this.f30820l && m32020a(arrayList, EnumC12598x5.FIRST_INSTANCE.m34138b())) {
                    IronLog.INTERNAL.verbose("events data: " + strMo27249a);
                    f30794O = true;
                }
                if (this.f30822n) {
                    try {
                        strMo27249a = Base64.encodeToString(C11597O9.m26742a(strMo27249a, this.f30823o), 0);
                    } catch (Exception e2) {
                        C12317m4.m32153d().m32155a(e2);
                    }
                }
                C12536tf.f32480a.m33824a(new RunnableC11467H5(new c(), strMo27249a, this.f30825q.m31334b(), arrayList));
            }
        } catch (Throwable th3) {
            C12317m4.m32153d().m32155a(th3);
            IronLog.INTERNAL.error("Send event exception: " + th3.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public boolean m32027g() {
        return (this.f30828t >= this.f30831w || this.f30821m) && this.f30820l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public boolean m32028i(C12580w5 c12580w5) {
        if (c12580w5 == null) {
            return false;
        }
        if (m32021a(this.f30834z)) {
            return !m32018a(c12580w5.m34046c(), this.f30834z);
        }
        if (m32021a(this.f30795A)) {
            return m32018a(c12580w5.m34046c(), this.f30795A);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m32030a(Context context, C11767Y9 c11767y9) {
        String strM32734a = IronSourceUtils.m32734a(context, this.f30803I, this.f30802H);
        this.f30802H = strM32734a;
        m32023b(strM32734a);
        this.f30825q.m31333a(IronSourceUtils.m32747b(context, this.f30803I, (String) null));
        this.f30824p = C11358B4.m25402a(context, "supersonic_sdk.db", 5);
        this.f30805K.m34256a(new a());
        this.f30834z = IronSourceUtils.m32762c(context, this.f30803I);
        this.f30795A = IronSourceUtils.m32756b(context, this.f30803I);
        this.f30796B = IronSourceUtils.m32768d(context, this.f30803I);
        this.f30797C = IronSourceUtils.m32744a(context, this.f30803I);
        this.f30806L = c11767y9;
        this.f30830v = context;
    }

    /* JADX INFO: renamed from: c */
    protected abstract int mo25614c(C12580w5 c12580w5);

    @Override // com.ironsource.InterfaceC11343A7
    /* JADX INFO: renamed from: c */
    public void mo25290c(int[] iArr, Context context) {
        this.f30795A = iArr;
        IronSourceUtils.m32755b(context, this.f30803I, iArr);
    }

    /* JADX INFO: renamed from: d */
    abstract void mo25615d();

    @Override // com.ironsource.InterfaceC11343A7
    /* JADX INFO: renamed from: d */
    public void mo25291d(int i) {
        if (i > 0) {
            this.f30832x = i;
        }
    }

    /* JADX INFO: renamed from: d */
    protected abstract boolean mo25616d(C12580w5 c12580w5);

    /* JADX INFO: renamed from: e */
    protected abstract String mo25617e(int i);

    /* JADX INFO: renamed from: e */
    void m32042e() {
        this.f30826r = new ArrayList<>();
        this.f30828t = 0;
        this.f30825q = C11413E5.m25661a(this.f30802H, this.f30801G);
        HandlerThreadC12634z5 handlerThreadC12634z5 = new HandlerThreadC12634z5(this.f30803I + "EventThread");
        this.f30805K = handlerThreadC12634z5;
        handlerThreadC12634z5.start();
        this.f30805K.m34255a();
        this.f30829u = C11455Gb.m25891U().mo25848m();
        this.f30804J = new HashSet();
        mo25615d();
    }

    /* JADX INFO: renamed from: f */
    protected abstract void mo25618f(C12580w5 c12580w5);

    /* JADX INFO: renamed from: h */
    public void m32044h() {
        this.f30805K.m34256a(new d());
    }

    /* JADX INFO: renamed from: j */
    protected abstract boolean mo25619j(C12580w5 c12580w5);

    /* JADX INFO: renamed from: b */
    private void m32023b(String str) {
        AbstractC12157e abstractC12157e = this.f30825q;
        if (abstractC12157e == null || !abstractC12157e.mo27250c().equals(str)) {
            this.f30825q = C11413E5.m25661a(str, this.f30801G);
        }
    }

    @Override // com.ironsource.InterfaceC11343A7
    /* JADX INFO: renamed from: d */
    public void mo25292d(int[] iArr, Context context) {
        this.f30797C = iArr;
        IronSourceUtils.m32740a(context, this.f30803I, iArr);
    }

    /* JADX INFO: renamed from: g */
    protected boolean mo28077g(C12580w5 c12580w5) {
        return (c12580w5.m34046c() == EnumC12598x5.CONSENT_TRUE_CODE.m34138b() || c12580w5.m34046c() == EnumC12598x5.CONSENT_FALSE_CODE.m34138b() || c12580w5.m34046c() == EnumC12598x5.SET_META_DATA.m34138b() || c12580w5.m34046c() == EnumC12598x5.SET_META_DATA_AFTER_INIT.m34138b() || c12580w5.m34046c() == EnumC12598x5.SET_USER_ID.m34138b()) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    protected boolean mo28078h(C12580w5 c12580w5) {
        return (c12580w5.m34046c() == EnumC12598x5.FIRST_INSTANCE.m34138b() || c12580w5.m34046c() == EnumC12598x5.FIRST_INSTANCE_RESULT.m34138b() || c12580w5.m34046c() == EnumC12598x5.INIT_COMPLETE.m34138b() || c12580w5.m34046c() == EnumC12598x5.SDK_INIT_FAILED.m34138b() || c12580w5.m34046c() == EnumC12598x5.SDK_INIT_SUCCESS.m34138b() || c12580w5.m34046c() == EnumC12598x5.USING_CACHE_FOR_INIT_EVENT.m34138b() || c12580w5.m34046c() == EnumC12598x5.CONSENT_TRUE_CODE.m34138b() || c12580w5.m34046c() == EnumC12598x5.CONSENT_FALSE_CODE.m34138b() || c12580w5.m34046c() == EnumC12598x5.SET_META_DATA.m34138b() || c12580w5.m34046c() == EnumC12598x5.SET_META_DATA_AFTER_INIT.m34138b() || c12580w5.m34046c() == EnumC12598x5.SET_USER_ID.m34138b()) ? false : true;
    }

    @Override // com.ironsource.InterfaceC11343A7
    /* JADX INFO: renamed from: c */
    public void mo25289c(int i) {
        this.f30823o = i;
    }

    @Override // com.ironsource.InterfaceC11343A7
    /* JADX INFO: renamed from: b */
    public void mo25285b(int i) {
        if (i > 0) {
            this.f30833y = i;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m32041c(boolean z) {
        this.f30820l = z;
    }

    /* JADX INFO: renamed from: com.ironsource.l3$c */
    class c implements InterfaceC11361B7 {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public /* synthetic */ void m32045b(InterfaceC11361B7.a aVar) {
            try {
                if (aVar.m25421c()) {
                    AbstractC12295l3 abstractC12295l3 = AbstractC12295l3.this;
                    ArrayList<C12580w5> arrayListMo25403a = abstractC12295l3.f30824p.mo25403a(abstractC12295l3.f30803I);
                    AbstractC12295l3.this.f30828t = arrayListMo25403a.size() + AbstractC12295l3.this.f30826r.size();
                } else {
                    IronLog.INTERNAL.error("Failed to send events. Saving them back to storage.");
                    AbstractC12295l3.this.mo28076a(AbstractC12295l3.this.m32013a(aVar.m25420b(), aVar.m25419a()));
                }
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
            }
            m32046a(aVar.m25420b());
        }

        /* JADX INFO: renamed from: a */
        public void m32046a(ArrayList<C12580w5> arrayList) {
            if (arrayList != null) {
                try {
                    arrayList.clear();
                } catch (Exception e) {
                    C12317m4.m32153d().m32155a(e);
                    IronLog.INTERNAL.error("clearData exception: " + e.getMessage());
                }
            }
        }

        @Override // com.ironsource.InterfaceC11361B7
        /* JADX INFO: renamed from: a */
        public synchronized void mo25415a(final InterfaceC11361B7.a aVar) {
            AbstractC12295l3.this.f30805K.m34256a(new Runnable() { // from class: com.ironsource.l3$c$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m32045b(aVar);
                }
            });
        }
    }

    @Override // com.ironsource.InterfaceC11343A7
    /* JADX INFO: renamed from: b */
    public void mo25288b(int[] iArr, Context context) {
        this.f30834z = iArr;
        IronSourceUtils.m32760c(context, this.f30803I, iArr);
    }

    /* JADX INFO: renamed from: c */
    public Map<String, String> m32040c() {
        return this.f30798D;
    }

    @Override // com.ironsource.InterfaceC11343A7
    /* JADX INFO: renamed from: b */
    public void mo25286b(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC12157e abstractC12157e = this.f30825q;
        if (abstractC12157e != null) {
            abstractC12157e.m31333a(str);
        }
        IronSourceUtils.m32773e(context, this.f30803I, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public boolean m32025e(C12580w5 c12580w5) {
        JSONObject jSONObjectM34045b = c12580w5.m34045b();
        if (jSONObjectM34045b == null) {
            return false;
        }
        return jSONObjectM34045b.has("sessionDepth");
    }

    @Override // com.ironsource.InterfaceC11343A7
    /* JADX INFO: renamed from: b */
    public void mo25287b(boolean z) {
        this.f30822n = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public boolean m32024b(ArrayList<C12580w5> arrayList) {
        return arrayList != null && arrayList.size() >= this.f30833y;
    }

    /* JADX INFO: renamed from: b */
    public String m32038b() {
        return this.f30800F;
    }

    /* JADX INFO: renamed from: b */
    public void m32039b(Map<String, String> map) {
        this.f30799E.putAll(map);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m32031a(C11512Je c11512Je) {
        this.f30807M = c11512Je;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public synchronized boolean m32019a(String str, C12580w5 c12580w5) {
        boolean zContains;
        if (!str.equalsIgnoreCase("none")) {
            return false;
        }
        if (m32021a(this.f30797C)) {
            zContains = m32018a(c12580w5.m34046c(), this.f30797C);
        } else {
            zContains = this.f30804J.contains(Integer.valueOf(c12580w5.m34046c()));
        }
        return zContains;
    }

    @Override // com.ironsource.InterfaceC11343A7
    /* JADX INFO: renamed from: a */
    public synchronized void mo25281a(C12580w5 c12580w5) {
        m32033a(c12580w5, (IronSource.EnumC12328a) null);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m32033a(C12580w5 c12580w5, IronSource.EnumC12328a enumC12328a) {
        if (c12580w5 != null) {
            if (this.f30827s) {
                this.f30805K.m34256a(new b(c12580w5, enumC12328a));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m32020a(ArrayList<C12580w5> arrayList, int i) {
        Iterator<C12580w5> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().m34046c() == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public ArrayList<C12580w5> m32013a(ArrayList<C12580w5> arrayList, String str) {
        String strM32029a = m32029a(str, 1024);
        Iterator<C12580w5> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().m34043a(strM32029a);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    protected void mo28076a(ArrayList<C12580w5> arrayList) {
        if (arrayList != null) {
            synchronized (this.f30808N) {
                this.f30824p.mo25404a(arrayList, this.f30803I);
                this.f30828t = this.f30824p.mo25403a(this.f30803I).size() + this.f30826r.size();
            }
        }
    }

    @Override // com.ironsource.InterfaceC11343A7
    /* JADX INFO: renamed from: a */
    public void mo25280a(int i) {
        if (i > 0) {
            this.f30831w = i;
        }
    }

    @Override // com.ironsource.InterfaceC11343A7
    /* JADX INFO: renamed from: a */
    public void mo25284a(int[] iArr, Context context) {
        this.f30796B = iArr;
        IronSourceUtils.m32767d(context, this.f30803I, iArr);
    }

    @Override // com.ironsource.InterfaceC11343A7
    /* JADX INFO: renamed from: a */
    public void mo25282a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f30802H = str;
        IronSourceUtils.m32766d(context, this.f30803I, str);
        m32023b(str);
    }

    @Override // com.ironsource.InterfaceC11343A7
    /* JADX INFO: renamed from: a */
    public void mo25283a(boolean z) {
        this.f30827s = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m32014a() {
        synchronized (this.f30808N) {
            this.f30824p.mo25404a(this.f30826r, this.f30803I);
            this.f30826r.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public boolean m32021a(int[] iArr) {
        return iArr != null && iArr.length > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public boolean m32018a(int i, int[] iArr) {
        if (m32021a(iArr)) {
            for (int i2 : iArr) {
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private void m32017a(JSONObject jSONObject) {
        try {
            C11767Y9 c11767y9 = this.f30806L;
            if (c11767y9 != null) {
                if (c11767y9.m28021a() > 0) {
                    jSONObject.put("age", this.f30806L.m28021a());
                }
                if (!TextUtils.isEmpty(this.f30806L.m28028b())) {
                    jSONObject.put(C11767Y9.f26622n, this.f30806L.m28028b());
                }
                if (this.f30806L.m28031e() > 0) {
                    jSONObject.put("lvl", this.f30806L.m28031e());
                }
                if (this.f30806L.m28030d() != null) {
                    jSONObject.put("pay", this.f30806L.m28030d().get());
                }
                if (this.f30806L.m28029c() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    jSONObject.put("iapt", this.f30806L.m28029c());
                }
                if (this.f30806L.m28034h() > 0) {
                    jSONObject.put("ucd", this.f30806L.m28034h());
                }
            }
            C11512Je c11512Je = this.f30807M;
            if (c11512Je != null) {
                String strM26234b = c11512Je.m26234b();
                if (!TextUtils.isEmpty(strM26234b)) {
                    jSONObject.put("segmentId", strM26234b);
                }
                JSONObject jSONObjectM26233a = this.f30807M.m26233a();
                Iterator<String> itKeys = jSONObjectM26233a.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectM26233a.get(next));
                }
            }
        } catch (JSONException e2) {
            C12317m4.m32153d().m32155a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m32035a(String str) {
        this.f30800F = str;
    }

    /* JADX INFO: renamed from: a */
    public void m32036a(Map<String, String> map) {
        this.f30798D.putAll(map);
    }

    /* JADX INFO: renamed from: a */
    public void m32037a(Map<String, Object> map, int i, String str) {
        map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(i));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        map.put(IronSourceConstants.AUCTION_FALLBACK, str);
    }

    /* JADX INFO: renamed from: a */
    private void m32016a(C12580w5 c12580w5, String str, int i) {
        JSONObject jSONObjectM34045b = c12580w5.m34045b();
        if (jSONObjectM34045b == null || !jSONObjectM34045b.has(str)) {
            return;
        }
        try {
            c12580w5.m34044a(str, m32029a(jSONObjectM34045b.optString(str, null), i));
        } catch (Exception e2) {
            C12317m4.m32153d().m32155a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    String m32029a(String str, int i) {
        return (TextUtils.isEmpty(str) || str.length() <= i) ? str : str.substring(0, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m32015a(C12580w5 c12580w5, String str) {
        m32016a(c12580w5, str, 1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public int m32012a(int i, IronSource.EnumC12328a enumC12328a) {
        int iM32048b = e.NOT_SUPPORTED.m32048b();
        if (enumC12328a != IronSource.EnumC12328a.REWARDED_VIDEO && ((i < 1000 || i >= 2000) && (i < 91000 || i >= 92000))) {
            if (enumC12328a != IronSource.EnumC12328a.INTERSTITIAL && ((i < 2000 || i >= 3000) && (i < 92000 || i >= 93000))) {
                if (enumC12328a == IronSource.EnumC12328a.BANNER || ((i >= 3000 && i < 4000) || (i >= 93000 && i < 94000))) {
                    return e.BANNER.m32048b();
                }
                return (enumC12328a == IronSource.EnumC12328a.NATIVE_AD || (i >= 4000 && i < 5000) || (i >= 94000 && i < 95000)) ? e.NATIVE_AD.m32048b() : iM32048b;
            }
            return e.INTERSTITIAL.m32048b();
        }
        return e.REWARDED_VIDEO.m32048b();
    }

    /* JADX INFO: renamed from: a */
    public void m32032a(C11767Y9 c11767y9) {
        this.f30806L = c11767y9;
    }

    /* JADX INFO: renamed from: a */
    void m32034a(Runnable runnable) {
        this.f30805K.m34256a(runnable);
    }

    /* JADX INFO: renamed from: f */
    protected int m32043f(int i) {
        return m32012a(i, (IronSource.EnumC12328a) null);
    }
}

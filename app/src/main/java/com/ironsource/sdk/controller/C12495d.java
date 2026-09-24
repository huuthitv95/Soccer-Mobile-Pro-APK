package com.ironsource.sdk.controller;

import com.ironsource.C11341A5;
import com.ironsource.C11703Ud;
import com.ironsource.C11744X3;
import com.ironsource.C12145d5;
import com.ironsource.C12317m4;
import com.ironsource.C12422p8;
import com.ironsource.C12547u8;
import com.ironsource.C12601x8;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.sdk.controller.d */
/* JADX INFO: loaded from: classes6.dex */
class C12495d {

    /* JADX INFO: renamed from: h */
    static final String f31993h = "controllerSourceData";

    /* JADX INFO: renamed from: i */
    private static final String f31994i = "next_";

    /* JADX INFO: renamed from: j */
    private static final String f31995j = "fallback_";

    /* JADX INFO: renamed from: k */
    private static final String f31996k = "controllerSourceCode";

    /* JADX INFO: renamed from: a */
    private long f31997a;

    /* JADX INFO: renamed from: b */
    private int f31998b;

    /* JADX INFO: renamed from: c */
    private c f31999c;

    /* JADX INFO: renamed from: d */
    private d f32000d = d.NONE;

    /* JADX INFO: renamed from: e */
    private String f32001e;

    /* JADX INFO: renamed from: f */
    private String f32002f;

    /* JADX INFO: renamed from: g */
    private C12145d5 f32003g;

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.d$a */
    class a extends JSONObject {
        a() throws JSONException {
            putOpt(C11744X3.a.f26173j, Integer.valueOf(C12495d.this.f31998b));
            putOpt(C12495d.f31996k, Integer.valueOf(C12495d.this.f32000d.m33385b()));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.d$b */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f32005a;

        static {
            int[] iArr = new int[c.values().length];
            f32005a = iArr;
            try {
                iArr[c.FETCH_FROM_SERVER_NO_FALLBACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32005a[c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32005a[c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.d$c */
    public enum c {
        FETCH_FROM_SERVER_NO_FALLBACK,
        FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK,
        FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.d$d */
    public enum d {
        NONE(0),
        PREPARED_CONTROLLER_LOADED(1),
        CONTROLLER_FROM_SERVER(2),
        MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(3),
        FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(4),
        FALLBACK_CONTROLLER_RECOVERY(5);


        /* JADX INFO: renamed from: a */
        private int f32017a;

        d(int i) {
            this.f32017a = i;
        }

        /* JADX INFO: renamed from: b */
        public int m33385b() {
            return this.f32017a;
        }
    }

    C12495d(JSONObject jSONObject, String str, String str2, C12145d5 c12145d5) {
        int iOptInt = jSONObject.optInt(C11744X3.a.f26173j, -1);
        this.f31998b = iOptInt;
        this.f31999c = m33364a(iOptInt);
        this.f32001e = str;
        this.f32002f = str2;
        this.f32003g = c12145d5;
    }

    /* JADX INFO: renamed from: a */
    private c m33364a(int i) {
        if (i != 1) {
            return i != 2 ? c.FETCH_FROM_SERVER_NO_FALLBACK : c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL;
        }
        return c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK;
    }

    /* JADX INFO: renamed from: b */
    private boolean m33368b() throws Exception {
        return IronSourceStorageUtils.renameFile(m33373i().getPath(), m33380g().getPath());
    }

    /* JADX INFO: renamed from: c */
    private void m33369c() {
        try {
            C12601x8 c12601x8M33380g = m33380g();
            if (c12601x8M33380g.exists()) {
                C12601x8 c12601x8M33372h = m33372h();
                if (c12601x8M33372h.exists()) {
                    c12601x8M33372h.delete();
                }
                IronSourceStorageUtils.renameFile(c12601x8M33380g.getPath(), c12601x8M33372h.getPath());
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m33370d() {
        IronSourceStorageUtils.deleteFile(m33372h());
    }

    /* JADX INFO: renamed from: e */
    private void m33371e() {
        IronSourceStorageUtils.deleteFile(m33380g());
    }

    /* JADX INFO: renamed from: h */
    private C12601x8 m33372h() {
        return new C12601x8(this.f32001e, "fallback_mobileController.html");
    }

    /* JADX INFO: renamed from: i */
    private C12601x8 m33373i() {
        return new C12601x8(this.f32001e, "next_mobileController.html");
    }

    /* JADX INFO: renamed from: j */
    private boolean m33374j() {
        return m33372h().exists();
    }

    /* JADX INFO: renamed from: l */
    private void m33375l() {
        C12422p8 c12422p8M33061a = new C12422p8().m33061a(C11341A5.f23834y, Integer.valueOf(this.f31998b));
        if (this.f31997a > 0) {
            c12422p8M33061a.m33061a(C11341A5.f23789B, Long.valueOf(System.currentTimeMillis() - this.f31997a));
        }
        C12547u8.m33895a(C11703Ud.f25985x, c12422p8M33061a.m33062a());
    }

    /* JADX INFO: renamed from: f */
    JSONObject m33379f() throws JSONException {
        return new a();
    }

    /* JADX INFO: renamed from: g */
    C12601x8 m33380g() {
        return new C12601x8(this.f32001e, C11744X3.f26144f);
    }

    /* JADX INFO: renamed from: k */
    boolean m33381k() {
        int i = b.f32005a[this.f31999c.ordinal()];
        if (i == 1) {
            m33371e();
            m33366a(new C12601x8(this.f32001e, SDKUtils.getFileName(this.f32002f)));
            return false;
        }
        if (i == 2) {
            m33369c();
            m33366a(new C12601x8(this.f32001e, SDKUtils.getFileName(this.f32002f)));
            return false;
        }
        if (i == 3) {
            try {
                C12601x8 c12601x8M33380g = m33380g();
                C12601x8 c12601x8M33373i = m33373i();
                if (!c12601x8M33373i.exists() && !c12601x8M33380g.exists()) {
                    m33366a(new C12601x8(this.f32001e, SDKUtils.getFileName(this.f32002f)));
                    return false;
                }
                if (!c12601x8M33373i.exists() && c12601x8M33380g.exists()) {
                    d dVar = d.MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                    this.f32000d = dVar;
                    m33365a(dVar);
                    m33366a(new C12601x8(this.f32001e, c12601x8M33373i.getName()));
                    return true;
                }
                m33369c();
                if (m33368b()) {
                    d dVar2 = d.PREPARED_CONTROLLER_LOADED;
                    this.f32000d = dVar2;
                    m33365a(dVar2);
                    m33370d();
                    m33366a(new C12601x8(this.f32001e, c12601x8M33373i.getName()));
                    return true;
                }
                if (!m33367a()) {
                    m33366a(new C12601x8(this.f32001e, SDKUtils.getFileName(this.f32002f)));
                    return false;
                }
                d dVar3 = d.FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                this.f32000d = dVar3;
                m33365a(dVar3);
                m33366a(new C12601x8(this.f32001e, c12601x8M33373i.getName()));
                return true;
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    boolean m33382m() {
        return this.f32000d != d.NONE;
    }

    /* JADX INFO: renamed from: a */
    void m33377a(Runnable runnable) {
        if (m33382m()) {
            return;
        }
        if (this.f31999c == c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK) {
            m33370d();
        }
        d dVar = d.CONTROLLER_FROM_SERVER;
        this.f32000d = dVar;
        m33365a(dVar);
        runnable.run();
    }

    /* JADX INFO: renamed from: a */
    void m33378a(Runnable runnable, Runnable runnable2) {
        if (m33382m()) {
            return;
        }
        if (this.f31999c == c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK && m33367a()) {
            d dVar = d.FALLBACK_CONTROLLER_RECOVERY;
            this.f32000d = dVar;
            m33365a(dVar);
            runnable.run();
            return;
        }
        m33375l();
        runnable2.run();
    }

    /* JADX INFO: renamed from: a */
    private void m33366a(C12601x8 c12601x8) {
        if (this.f32003g.m31293c()) {
            return;
        }
        this.f32003g.mo31290a(c12601x8, this.f32002f);
    }

    /* JADX INFO: renamed from: a */
    void m33376a(C12422p8 c12422p8) {
        c12422p8.m33061a(C11341A5.f23834y, Integer.valueOf(this.f31998b));
        C12547u8.m33895a(C11703Ud.f25983v, c12422p8.m33062a());
        this.f31997a = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: a */
    private void m33365a(d dVar) {
        C12422p8 c12422p8M33061a = new C12422p8().m33061a(C11341A5.f23834y, Integer.valueOf(this.f31998b)).m33061a(C11341A5.f23835z, Integer.valueOf(dVar.m33385b()));
        if (this.f31997a > 0) {
            c12422p8M33061a.m33061a(C11341A5.f23789B, Long.valueOf(System.currentTimeMillis() - this.f31997a));
        }
        C12547u8.m33895a(C11703Ud.f25984w, c12422p8M33061a.m33062a());
    }

    /* JADX INFO: renamed from: a */
    private boolean m33367a() {
        try {
            if (m33374j()) {
                return IronSourceStorageUtils.renameFile(m33372h().getPath(), m33380g().getPath());
            }
            return false;
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            return false;
        }
    }
}

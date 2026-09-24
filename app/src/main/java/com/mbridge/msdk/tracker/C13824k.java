package com.mbridge.msdk.tracker;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.unity3d.ads.BuildConfig;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.k */
/* JADX INFO: compiled from: Global.java */
/* JADX INFO: loaded from: classes7.dex */
class C13824k {

    /* JADX INFO: renamed from: o */
    private static volatile String f39403o = "";

    /* JADX INFO: renamed from: a */
    private final String f39404a;

    /* JADX INFO: renamed from: b */
    private final C13826m f39405b;

    /* JADX INFO: renamed from: c */
    private Context f39406c;

    /* JADX INFO: renamed from: d */
    private C13881x f39407d;

    /* JADX INFO: renamed from: e */
    private JSONObject f39408e;

    /* JADX INFO: renamed from: f */
    private List<String> f39409f;

    /* JADX INFO: renamed from: g */
    private List<String> f39410g;

    /* JADX INFO: renamed from: h */
    private volatile C13816c f39411h;

    /* JADX INFO: renamed from: i */
    private volatile InterfaceC13825l f39412i;

    /* JADX INFO: renamed from: j */
    private volatile InterfaceC13817d f39413j;

    /* JADX INFO: renamed from: k */
    private volatile C13823j f39414k;

    /* JADX INFO: renamed from: l */
    private volatile C13876s f39415l;

    /* JADX INFO: renamed from: m */
    private volatile boolean f39416m = true;

    /* JADX INFO: renamed from: n */
    private volatile C13872o f39417n;

    C13824k(String str, C13826m c13826m) {
        this.f39404a = str;
        this.f39405b = c13826m;
    }

    /* JADX INFO: renamed from: a */
    void m41041a(Context context) {
        this.f39406c = context;
    }

    /* JADX INFO: renamed from: a */
    void m41042a(C13881x c13881x) {
        this.f39407d = c13881x;
    }

    /* JADX INFO: renamed from: a */
    void m41043a(JSONObject jSONObject) {
        this.f39408e = jSONObject;
    }

    /* JADX INFO: renamed from: a */
    boolean m41044a() throws IllegalStateException {
        if (C13882y.m41417b(m41046b())) {
            throw new IllegalStateException("config can not be null");
        }
        if (C13882y.m41417b(m41050f())) {
            throw new IllegalStateException("decorate can not be null");
        }
        if (C13882y.m41417b(m41062r())) {
            throw new IllegalStateException("responseHandler can not be null");
        }
        if (C13882y.m41417b(m41058n()) || C13882y.m41417b(m41058n().m41343b())) {
            throw new IllegalStateException("networkStackConfig or stack can not be null");
        }
        if (TextUtils.isEmpty(m41058n().m41344c())) {
            throw new IllegalStateException("report url is null");
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    boolean m41045a(C13818e c13818e) {
        if (C13882y.m41417b(c13818e)) {
            return false;
        }
        InterfaceC13819f interfaceC13819f = m41046b().f39649j;
        if (C13882y.m41414a(interfaceC13819f)) {
            try {
                return interfaceC13819f.mo35095a(c13818e);
            } catch (Exception e) {
                if (C13814a.f39370a) {
                    Log.e("TrackManager", "event filter apply exception", e);
                }
            }
        }
        String strM41012g = c13818e.m41012g();
        if (TextUtils.isEmpty(strM41012g)) {
            return false;
        }
        List<String> list = this.f39410g;
        if (list != null) {
            try {
                return !list.contains(strM41012g);
            } catch (Exception e2) {
                if (C13814a.f39370a) {
                    Log.e("TrackManager", "disallowTrackEventNames contains exception", e2);
                }
            }
        }
        List<String> list2 = this.f39409f;
        if (list2 != null) {
            try {
                return list2.contains(strM41012g);
            } catch (Exception e3) {
                if (C13814a.f39370a) {
                    Log.e("TrackManager", "allowTrackEventNames contains exception", e3);
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    C13881x m41046b() {
        C13881x c13881x = this.f39407d;
        if (c13881x != null) {
            return c13881x;
        }
        C13881x c13881xM41406a = new C13881x.b().m41406a();
        this.f39407d = c13881xM41406a;
        return c13881xM41406a;
    }

    /* JADX INFO: renamed from: c */
    Context m41047c() {
        return this.f39406c;
    }

    /* JADX INFO: renamed from: d */
    C13816c m41048d() {
        if (C13882y.m41417b(this.f39411h)) {
            synchronized (C13824k.class) {
                if (C13882y.m41417b(this.f39411h)) {
                    String strM41064t = m41064t();
                    this.f39411h = new C13816c(new C13815b(m41047c(), m41049e(), strM41064t), strM41064t);
                }
            }
        }
        return this.f39411h;
    }

    /* JADX INFO: renamed from: e */
    String m41049e() {
        return TextUtils.isEmpty(m41066v()) ? String.format("track_manager_%s.db", BuildConfig.FLAVOR) : String.format("track_manager_%s.db", m41066v());
    }

    /* JADX INFO: renamed from: f */
    InterfaceC13817d m41050f() {
        if (C13882y.m41417b(this.f39413j)) {
            this.f39413j = m41046b().f39647h;
        }
        return this.f39413j;
    }

    /* JADX INFO: renamed from: g */
    InterfaceC13825l m41051g() {
        if (C13882y.m41417b(this.f39412i)) {
            synchronized (C13824k.class) {
                if (C13882y.m41417b(this.f39412i)) {
                    this.f39412i = new C13874q(new C13820g(m41048d(), m41060p()));
                }
            }
        }
        return this.f39412i;
    }

    /* JADX INFO: renamed from: h */
    C13823j m41052h() {
        if (C13882y.m41417b(this.f39414k)) {
            synchronized (C13824k.class) {
                if (C13882y.m41417b(this.f39414k)) {
                    this.f39414k = new C13823j();
                }
            }
        }
        return this.f39414k;
    }

    /* JADX INFO: renamed from: i */
    int m41053i() {
        if (m41046b().f39640a < 0) {
            return 50;
        }
        return m41046b().f39640a;
    }

    /* JADX INFO: renamed from: j */
    int m41054j() {
        return Math.max(m41046b().f39644e, 0);
    }

    /* JADX INFO: renamed from: k */
    int m41055k() {
        if (m41046b().f39643d <= 0) {
            return 2;
        }
        return m41046b().f39643d;
    }

    /* JADX INFO: renamed from: l */
    int m41056l() {
        return Math.max(m41046b().f39641b, 0);
    }

    /* JADX INFO: renamed from: m */
    C13872o m41057m() {
        if (C13882y.m41417b(this.f39417n)) {
            synchronized (C13824k.class) {
                if (C13882y.m41417b(this.f39417n)) {
                    this.f39417n = new C13872o(m41055k(), m41058n(), m41062r(), m41061q());
                }
            }
        }
        return this.f39417n;
    }

    /* JADX INFO: renamed from: n */
    C13873p m41058n() {
        return m41046b().f39646g;
    }

    /* JADX INFO: renamed from: o */
    JSONObject m41059o() {
        JSONObject jSONObject = this.f39408e;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        this.f39408e = jSONObject2;
        return jSONObject2;
    }

    /* JADX INFO: renamed from: p */
    C13876s m41060p() {
        if (C13882y.m41417b(this.f39415l)) {
            synchronized (C13824k.class) {
                if (C13882y.m41417b(this.f39415l)) {
                    this.f39415l = new C13876s(this);
                }
            }
        }
        return this.f39415l;
    }

    /* JADX INFO: renamed from: q */
    int m41061q() {
        return m41046b().f39642c;
    }

    /* JADX INFO: renamed from: r */
    AbstractC13880w m41062r() {
        return m41046b().f39648i;
    }

    /* JADX INFO: renamed from: s */
    String m41063s() {
        if (!TextUtils.isEmpty(f39403o)) {
            return f39403o;
        }
        String string = UUID.randomUUID().toString();
        f39403o = string;
        return string;
    }

    /* JADX INFO: renamed from: t */
    String m41064t() {
        return "event_table";
    }

    /* JADX INFO: renamed from: u */
    C13826m m41065u() {
        return this.f39405b;
    }

    /* JADX INFO: renamed from: v */
    String m41066v() {
        return this.f39404a;
    }

    /* JADX INFO: renamed from: w */
    boolean m41067w() {
        return this.f39416m;
    }

    /* JADX INFO: renamed from: x */
    String m41068x() {
        if (!C13882y.m41417b(this.f39406c) && !C13882y.m41417b(this.f39407d)) {
            try {
                m41060p().m41374j();
                this.f39416m = false;
                if (TextUtils.isEmpty(f39403o)) {
                    f39403o = UUID.randomUUID().toString();
                }
                return f39403o;
            } catch (Exception e) {
                if (C13814a.f39370a) {
                    Log.e("TrackManager", "start error", e);
                }
                this.f39416m = true;
            }
        }
        return "";
    }
}

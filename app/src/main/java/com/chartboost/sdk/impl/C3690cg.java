package com.chartboost.sdk.impl;

import android.os.Build;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.cg */
/* JADX INFO: loaded from: classes3.dex */
public class C3690cg {

    /* JADX INFO: renamed from: a */
    public final String f13720a;

    /* JADX INFO: renamed from: b */
    public final String f13721b;

    /* JADX INFO: renamed from: c */
    public final String f13722c;

    /* JADX INFO: renamed from: d */
    public final String f13723d;

    /* JADX INFO: renamed from: e */
    public final String f13724e;

    /* JADX INFO: renamed from: f */
    public final String f13725f;

    /* JADX INFO: renamed from: g */
    public final String f13726g;

    /* JADX INFO: renamed from: h */
    public final String f13727h;

    /* JADX INFO: renamed from: i */
    public final String f13728i;

    /* JADX INFO: renamed from: j */
    public final String f13729j;

    /* JADX INFO: renamed from: k */
    public final String f13730k;

    /* JADX INFO: renamed from: l */
    public final String f13731l;

    /* JADX INFO: renamed from: m */
    public final JSONObject f13732m;

    /* JADX INFO: renamed from: n */
    public final String f13733n;

    /* JADX INFO: renamed from: o */
    public final String f13734o;

    /* JADX INFO: renamed from: p */
    public final Integer f13735p;

    /* JADX INFO: renamed from: q */
    public final C4106v3 f13736q;

    /* JADX INFO: renamed from: r */
    public final C4139we f13737r;

    /* JADX INFO: renamed from: s */
    public final C4053sg f13738s;

    /* JADX INFO: renamed from: t */
    public final C3958o9 f13739t;

    /* JADX INFO: renamed from: u */
    public final C3850jf f13740u;

    /* JADX INFO: renamed from: v */
    public final C3944nh f13741v;

    /* JADX INFO: renamed from: w */
    public final C3725e5 f13742w;

    /* JADX INFO: renamed from: x */
    public final C3795h6 f13743x;

    /* JADX INFO: renamed from: y */
    public final C3755fc f13744y;

    public C3690cg(String str, String str2, C3958o9 c3958o9, C3850jf c3850jf, C4106v3 c4106v3, C4053sg c4053sg, C3944nh c3944nh, C4139we c4139we, C3725e5 c3725e5, C3795h6 c3795h6, C3755fc c3755fc) {
        String str3;
        this.f13739t = c3958o9;
        this.f13740u = c3850jf;
        this.f13736q = c4106v3;
        this.f13738s = c4053sg;
        this.f13741v = c3944nh;
        this.f13737r = c4139we;
        this.f13727h = str;
        this.f13728i = str2;
        this.f13742w = c3725e5;
        this.f13743x = c3795h6;
        this.f13744y = c3755fc;
        String str4 = Build.PRODUCT;
        if ("sdk".equals(str4) || "google_sdk".equals(str4) || ((str3 = Build.MANUFACTURER) != null && str3.contains("Genymotion"))) {
            this.f13720a = "Android Simulator";
        } else {
            this.f13720a = Build.MODEL;
        }
        String str5 = Build.MANUFACTURER;
        this.f13730k = str5 == null ? "unknown" : str5;
        this.f13729j = str5 + " " + Build.MODEL;
        this.f13731l = c3795h6.m17858b();
        StringBuilder sb = new StringBuilder("Android ");
        sb.append(Build.VERSION.RELEASE);
        this.f13721b = sb.toString();
        this.f13722c = Locale.getDefault().getCountry();
        this.f13723d = Locale.getDefault().getLanguage();
        this.f13726g = "9.11.1";
        this.f13724e = c3795h6.m17865i();
        this.f13725f = c3795h6.m17863g();
        this.f13733n = m17186b(c4106v3);
        this.f13732m = m17183a(c4106v3);
        this.f13734o = C3907m3.m18627a();
        this.f13735p = c3850jf.m18276a();
    }

    /* JADX INFO: renamed from: a */
    public C3725e5 m17182a() {
        return this.f13742w;
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m17183a(C4106v3 c4106v3) {
        return c4106v3 != null ? m17184a(c4106v3, new C4150x3()) : new JSONObject();
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m17184a(C4106v3 c4106v3, C4150x3 c4150x3) {
        return c4150x3 != null ? c4150x3.m19882a(c4106v3) : new JSONObject();
    }

    /* JADX INFO: renamed from: b */
    public C3795h6 m17185b() {
        return this.f13743x;
    }

    /* JADX INFO: renamed from: b */
    public final String m17186b(C4106v3 c4106v3) {
        return c4106v3 != null ? c4106v3.m19644d() : "";
    }

    /* JADX INFO: renamed from: c */
    public C3958o9 m17187c() {
        return this.f13739t;
    }

    /* JADX INFO: renamed from: d */
    public C3755fc m17188d() {
        return this.f13744y;
    }

    /* JADX INFO: renamed from: e */
    public Integer m17189e() {
        return Integer.valueOf(this.f13743x.m17862f());
    }

    /* JADX INFO: renamed from: f */
    public C4139we m17190f() {
        return this.f13737r;
    }

    /* JADX INFO: renamed from: g */
    public C3850jf m17191g() {
        return this.f13740u;
    }

    /* JADX INFO: renamed from: h */
    public C4053sg m17192h() {
        return this.f13738s;
    }

    /* JADX INFO: renamed from: i */
    public int m17193i() {
        C4053sg c4053sg = this.f13738s;
        if (c4053sg != null) {
            return c4053sg.m19435f();
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public C3944nh m17194j() {
        return this.f13741v;
    }
}

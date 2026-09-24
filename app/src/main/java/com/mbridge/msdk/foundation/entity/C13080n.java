package com.mbridge.msdk.foundation.entity;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C11341A5;
import com.ironsource.C11744X3;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.tools.C13211m0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.entity.n */
/* JADX INFO: compiled from: VideoReportData.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13080n {

    /* JADX INFO: renamed from: N */
    public static int f35733N = 1;

    /* JADX INFO: renamed from: O */
    public static int f35734O;

    /* JADX INFO: renamed from: A */
    private String f35735A;

    /* JADX INFO: renamed from: B */
    private String f35736B;

    /* JADX INFO: renamed from: C */
    private int f35737C;

    /* JADX INFO: renamed from: D */
    private String f35738D;

    /* JADX INFO: renamed from: E */
    private String f35739E;

    /* JADX INFO: renamed from: G */
    private String f35741G;

    /* JADX INFO: renamed from: H */
    private String f35742H;

    /* JADX INFO: renamed from: I */
    private String f35743I;

    /* JADX INFO: renamed from: J */
    private int f35744J;

    /* JADX INFO: renamed from: K */
    private long f35745K;

    /* JADX INFO: renamed from: L */
    private String f35746L;

    /* JADX INFO: renamed from: M */
    private int f35747M;

    /* JADX INFO: renamed from: b */
    private String f35749b;

    /* JADX INFO: renamed from: c */
    private int f35750c;

    /* JADX INFO: renamed from: e */
    private int f35752e;

    /* JADX INFO: renamed from: f */
    private String f35753f;

    /* JADX INFO: renamed from: g */
    private String f35754g;

    /* JADX INFO: renamed from: h */
    private String f35755h;

    /* JADX INFO: renamed from: i */
    private String f35756i;

    /* JADX INFO: renamed from: j */
    private String f35757j;

    /* JADX INFO: renamed from: k */
    private String f35758k;

    /* JADX INFO: renamed from: l */
    private String f35759l;

    /* JADX INFO: renamed from: m */
    private String f35760m;

    /* JADX INFO: renamed from: n */
    private String f35761n;

    /* JADX INFO: renamed from: o */
    private String f35762o;

    /* JADX INFO: renamed from: p */
    private int f35763p;

    /* JADX INFO: renamed from: q */
    private String f35764q;

    /* JADX INFO: renamed from: r */
    private String f35765r;

    /* JADX INFO: renamed from: s */
    private String f35766s;

    /* JADX INFO: renamed from: u */
    private int f35768u;

    /* JADX INFO: renamed from: v */
    private String f35769v;

    /* JADX INFO: renamed from: w */
    private String f35770w;

    /* JADX INFO: renamed from: x */
    private String f35771x;

    /* JADX INFO: renamed from: y */
    private String f35772y;

    /* JADX INFO: renamed from: z */
    private String f35773z;

    /* JADX INFO: renamed from: a */
    private Map<String, String> f35748a = null;

    /* JADX INFO: renamed from: d */
    private int f35751d = 0;

    /* JADX INFO: renamed from: t */
    private int f35767t = 0;

    /* JADX INFO: renamed from: F */
    private int f35740F = 0;

    public C13080n(String str, int i, int i2, int i3, int i4, String str2, String str3, int i5, String str4, int i6, String str5) {
        this.f35764q = str;
        this.f35768u = i;
        this.f35769v = str5;
        this.f35763p = i2;
        this.f35747M = i3;
        this.f35744J = i4;
        try {
            if (!TextUtils.isEmpty(str2)) {
                this.f35770w = URLEncoder.encode(str2, C11341A5.f23802O);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.f35771x = str3;
        this.f35737C = i5;
        this.f35756i = str4;
        this.f35745K = i6;
    }

    /* JADX INFO: renamed from: A */
    public String m36950A() {
        return this.f35742H;
    }

    /* JADX INFO: renamed from: B */
    public String m36951B() {
        return this.f35743I;
    }

    /* JADX INFO: renamed from: C */
    public int m36952C() {
        return this.f35744J;
    }

    /* JADX INFO: renamed from: D */
    public long m36953D() {
        return this.f35745K;
    }

    /* JADX INFO: renamed from: E */
    public String m36954E() {
        return this.f35746L;
    }

    /* JADX INFO: renamed from: F */
    public int m36955F() {
        return this.f35747M;
    }

    /* JADX INFO: renamed from: a */
    public String m36956a() {
        return this.f35749b;
    }

    /* JADX INFO: renamed from: b */
    public void m36962b(String str) {
        this.f35753f = str;
    }

    /* JADX INFO: renamed from: c */
    public void m36966c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f35754g = URLEncoder.encode(str);
    }

    /* JADX INFO: renamed from: d */
    public String m36967d() {
        return this.f35753f;
    }

    /* JADX INFO: renamed from: e */
    public String m36970e() {
        return this.f35754g;
    }

    /* JADX INFO: renamed from: f */
    public String m36973f() {
        return this.f35755h;
    }

    /* JADX INFO: renamed from: g */
    public String m36975g() {
        return this.f35756i;
    }

    /* JADX INFO: renamed from: h */
    public String m36977h() {
        return this.f35757j;
    }

    /* JADX INFO: renamed from: i */
    public String m36979i() {
        return this.f35758k;
    }

    /* JADX INFO: renamed from: j */
    public void m36982j(String str) {
        this.f35764q = str;
    }

    /* JADX INFO: renamed from: k */
    public String m36983k() {
        return this.f35760m;
    }

    /* JADX INFO: renamed from: l */
    public void m36986l(String str) {
        this.f35769v = str;
    }

    /* JADX INFO: renamed from: m */
    public void m36988m(String str) {
        this.f35771x = str;
    }

    /* JADX INFO: renamed from: n */
    public String m36989n() {
        return this.f35764q;
    }

    /* JADX INFO: renamed from: o */
    public void m36992o(String str) {
        this.f35773z = str;
    }

    /* JADX INFO: renamed from: p */
    public void m36994p(String str) {
        this.f35735A = str;
    }

    /* JADX INFO: renamed from: q */
    public int m36995q() {
        return this.f35768u;
    }

    /* JADX INFO: renamed from: r */
    public String m36997r() {
        return this.f35769v;
    }

    /* JADX INFO: renamed from: s */
    public String m36999s() {
        return this.f35770w;
    }

    /* JADX INFO: renamed from: t */
    public String m37001t() {
        return TextUtils.isEmpty(this.f35771x) ? "" : this.f35771x;
    }

    public String toString() {
        return "RewardReportData [key=" + this.f35764q + ", networkType=" + this.f35768u + ", isCompleteView=" + this.f35763p + ", watchedMillis=" + this.f35747M + ", videoLength=" + this.f35744J + ", offerUrl=" + this.f35770w + ", reason=" + this.f35771x + ", result=" + this.f35737C + ", duration=" + this.f35756i + ", videoSize=" + this.f35745K + C11744X3.j.f26440e;
    }

    /* JADX INFO: renamed from: u */
    public void m37004u(String str) {
        this.f35743I = str;
    }

    /* JADX INFO: renamed from: v */
    public String m37005v() {
        return this.f35773z;
    }

    /* JADX INFO: renamed from: w */
    public String m37007w() {
        return this.f35735A;
    }

    /* JADX INFO: renamed from: x */
    public int m37008x() {
        return this.f35737C;
    }

    /* JADX INFO: renamed from: y */
    public int m37009y() {
        return this.f35740F;
    }

    /* JADX INFO: renamed from: z */
    public String m37010z() {
        return this.f35741G;
    }

    /* JADX INFO: renamed from: a */
    public void m36959a(String str) {
        this.f35749b = str;
    }

    /* JADX INFO: renamed from: b */
    public int m36960b() {
        return this.f35750c;
    }

    /* JADX INFO: renamed from: d */
    public void m36969d(String str) {
        this.f35755h = str;
    }

    /* JADX INFO: renamed from: e */
    public void m36972e(String str) {
        this.f35756i = str;
    }

    /* JADX INFO: renamed from: f */
    public void m36974f(String str) {
        this.f35757j = str;
    }

    /* JADX INFO: renamed from: g */
    public void m36976g(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f35758k = URLEncoder.encode(str, C11341A5.f23802O);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m36978h(String str) {
        this.f35759l = str;
    }

    /* JADX INFO: renamed from: i */
    public void m36980i(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f35762o = URLEncoder.encode(str, C11341A5.f23802O);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: j */
    public String m36981j() {
        return this.f35759l;
    }

    /* JADX INFO: renamed from: k */
    public void m36984k(String str) {
        this.f35766s = str;
    }

    /* JADX INFO: renamed from: l */
    public String m36985l() {
        return this.f35762o;
    }

    /* JADX INFO: renamed from: m */
    public int m36987m() {
        return this.f35763p;
    }

    /* JADX INFO: renamed from: n */
    public void m36990n(String str) {
        this.f35772y = str;
    }

    /* JADX INFO: renamed from: o */
    public String m36991o() {
        return this.f35765r;
    }

    /* JADX INFO: renamed from: p */
    public int m36993p() {
        return this.f35767t;
    }

    /* JADX INFO: renamed from: q */
    public void m36996q(String str) {
        this.f35736B = str;
    }

    /* JADX INFO: renamed from: r */
    public void m36998r(String str) {
        this.f35738D = str;
    }

    /* JADX INFO: renamed from: s */
    public void m37000s(String str) {
        this.f35739E = str;
    }

    /* JADX INFO: renamed from: t */
    public void m37002t(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f35741G = URLEncoder.encode(str, C11341A5.f23802O);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: u */
    public String m37003u() {
        return this.f35772y;
    }

    /* JADX INFO: renamed from: v */
    public void m37006v(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f35746L = URLEncoder.encode(str, C11341A5.f23802O);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m36958a(int i) {
        this.f35750c = i;
    }

    /* JADX INFO: renamed from: b */
    public void m36961b(int i) {
        this.f35767t = i;
    }

    /* JADX INFO: renamed from: c */
    public void m36965c(int i) {
        this.f35768u = i;
    }

    /* JADX INFO: renamed from: d */
    public void m36968d(int i) {
        this.f35737C = i;
    }

    /* JADX INFO: renamed from: e */
    public void m36971e(int i) {
        this.f35740F = i;
    }

    /* JADX INFO: renamed from: a */
    public String m36957a(String str, String str2) {
        Map<String, String> map;
        if (!TextUtils.isEmpty(str) && (map = this.f35748a) != null) {
            try {
                String str3 = map.get(str);
                if (!TextUtils.isEmpty(str3)) {
                    return str3;
                }
            } catch (Exception unused) {
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: b */
    public void m36963b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.f35748a == null) {
            this.f35748a = new HashMap();
        }
        try {
            this.f35748a.put(str, str2);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public int m36964c() {
        return this.f35752e;
    }

    public C13080n() {
    }

    public C13080n(String str, int i, String str2, String str3, String str4) {
        this.f35764q = str;
        this.f35769v = str4;
        this.f35768u = i;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f35770w = URLEncoder.encode(str2, C11341A5.f23802O);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        this.f35771x = str3;
    }

    public C13080n(String str, int i, int i2, String str2, int i3, String str3, int i4, String str4) {
        this.f35764q = str;
        this.f35768u = i;
        this.f35769v = str4;
        this.f35744J = i2;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f35770w = URLEncoder.encode(str2, C11341A5.f23802O);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        this.f35737C = i3;
        this.f35756i = str3;
        this.f35745K = i4;
    }

    public C13080n(Context context, CampaignEx campaignEx, int i, String str, long j, int i2) {
        if (i2 == 1 || i2 == 287 || i2 == 94) {
            this.f35764q = "m_download_end";
        } else if (i2 == 95) {
            this.f35764q = "2000025";
        }
        int iM37770s = C13211m0.m37770s(context);
        this.f35768u = iM37770s;
        this.f35769v = C13211m0.m37732a(context, iM37770s);
        this.f35744J = campaignEx.getVideoLength();
        this.f35772y = campaignEx.getRequestId();
        this.f35773z = campaignEx.getRequestIdNotice();
        if (!TextUtils.isEmpty(this.f35770w)) {
            try {
                this.f35770w = URLEncoder.encode(campaignEx.getNoticeUrl() == null ? campaignEx.getClickURL() : campaignEx.getNoticeUrl(), C11341A5.f23802O);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        this.f35737C = i;
        this.f35756i = str;
        this.f35745K = j == 0 ? campaignEx.getVideoSize() : j;
    }

    public C13080n(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7) {
        this.f35764q = str;
        this.f35760m = str2;
        this.f35742H = str3;
        this.f35765r = str4;
        this.f35743I = str5;
        this.f35753f = str6;
        this.f35768u = i;
        this.f35769v = str7;
    }

    public C13080n(String str) {
        this.f35761n = str;
    }

    public C13080n(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f35764q = str;
        this.f35737C = i;
        this.f35756i = str2;
        try {
            if (!TextUtils.isEmpty(str3)) {
                this.f35758k = URLEncoder.encode(str3, C11341A5.f23802O);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.f35753f = str4;
        this.f35743I = str5;
        this.f35771x = str6;
        this.f35757j = str7;
        if (Integer.valueOf(str2).intValue() > C13088a.f35846L) {
            this.f35737C = 2;
        }
    }

    public C13080n(String str, String str2, String str3, String str4, String str5, int i) {
        this.f35764q = str;
        this.f35753f = str2;
        this.f35772y = str3;
        this.f35773z = str4;
        this.f35743I = str5;
        this.f35768u = i;
    }

    public C13080n(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6) {
        this.f35764q = str;
        this.f35753f = str2;
        this.f35772y = str3;
        this.f35773z = str4;
        this.f35743I = str5;
        this.f35768u = i;
        this.f35771x = str6;
        this.f35752e = i2;
    }
}

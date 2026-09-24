package com.chartboost.sdk.impl;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.b0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3651b0 {

    /* JADX INFO: renamed from: A */
    public final String f13484A;

    /* JADX INFO: renamed from: B */
    public final boolean f13485B;

    /* JADX INFO: renamed from: a */
    public String f13486a;

    /* JADX INFO: renamed from: b */
    public String f13487b;

    /* JADX INFO: renamed from: c */
    public final String f13488c;

    /* JADX INFO: renamed from: d */
    public String f13489d;

    /* JADX INFO: renamed from: e */
    public final C4113va f13490e;

    /* JADX INFO: renamed from: f */
    public String f13491f;

    /* JADX INFO: renamed from: g */
    public String f13492g;

    /* JADX INFO: renamed from: h */
    public String f13493h;

    /* JADX INFO: renamed from: i */
    public final Map f13494i;

    /* JADX INFO: renamed from: j */
    public String f13495j;

    /* JADX INFO: renamed from: k */
    public String f13496k;

    /* JADX INFO: renamed from: l */
    public String f13497l;

    /* JADX INFO: renamed from: m */
    public String f13498m;

    /* JADX INFO: renamed from: n */
    public String f13499n;

    /* JADX INFO: renamed from: o */
    public int f13500o;

    /* JADX INFO: renamed from: p */
    public String f13501p;

    /* JADX INFO: renamed from: q */
    public String f13502q;

    /* JADX INFO: renamed from: r */
    public C4038s1 f13503r;

    /* JADX INFO: renamed from: s */
    public final Map f13504s;

    /* JADX INFO: renamed from: t */
    public final EnumC4184yf f13505t;

    /* JADX INFO: renamed from: u */
    public final List f13506u;

    /* JADX INFO: renamed from: v */
    public final Map f13507v;

    /* JADX INFO: renamed from: w */
    public final String f13508w;

    /* JADX INFO: renamed from: x */
    public final String f13509x;

    /* JADX INFO: renamed from: y */
    public final EnumC3709dc f13510y;

    /* JADX INFO: renamed from: z */
    public final EnumC3816i4 f13511z;

    public C3651b0(String name, String adId, String baseUrl, String impressionId, C4113va infoIcon, String cgn, String creative, String mediaType, Map assets, String videoUrl, String videoFilename, String link, String deepLink, String to, int i, String rewardCurrency, String template, C4038s1 body, Map parameters, EnumC4184yf renderingEngine, List scripts, Map events, String adm, String templateParams, EnumC3709dc mtype, EnumC3816i4 clkp, String decodedAdm) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        Intrinsics.checkNotNullParameter(infoIcon, "infoIcon");
        Intrinsics.checkNotNullParameter(cgn, "cgn");
        Intrinsics.checkNotNullParameter(creative, "creative");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(videoFilename, "videoFilename");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        Intrinsics.checkNotNullParameter(to, "to");
        Intrinsics.checkNotNullParameter(rewardCurrency, "rewardCurrency");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(renderingEngine, "renderingEngine");
        Intrinsics.checkNotNullParameter(scripts, "scripts");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(templateParams, "templateParams");
        Intrinsics.checkNotNullParameter(mtype, "mtype");
        Intrinsics.checkNotNullParameter(clkp, "clkp");
        Intrinsics.checkNotNullParameter(decodedAdm, "decodedAdm");
        this.f13486a = name;
        this.f13487b = adId;
        this.f13488c = baseUrl;
        this.f13489d = impressionId;
        this.f13490e = infoIcon;
        this.f13491f = cgn;
        this.f13492g = creative;
        this.f13493h = mediaType;
        this.f13494i = assets;
        this.f13495j = videoUrl;
        this.f13496k = videoFilename;
        this.f13497l = link;
        this.f13498m = deepLink;
        this.f13499n = to;
        this.f13500o = i;
        this.f13501p = rewardCurrency;
        this.f13502q = template;
        this.f13503r = body;
        this.f13504s = parameters;
        this.f13505t = renderingEngine;
        this.f13506u = scripts;
        this.f13507v = events;
        this.f13508w = adm;
        this.f13509x = templateParams;
        this.f13510y = mtype;
        this.f13511z = clkp;
        this.f13484A = decodedAdm;
        this.f13485B = videoUrl.length() > 0 && this.f13496k.length() > 0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C3651b0(String str, String str2, String str3, String str4, C4113va c4113va, String str5, String str6, String str7, Map map, String str8, String str9, String str10, String str11, String str12, int i, String str13, String str14, C4038s1 c4038s1, Map map2, EnumC4184yf enumC4184yf, List list, Map map3, String str15, String str16, EnumC3709dc enumC3709dc, EnumC3816i4 enumC3816i4, String str17, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str18 = (i2 & 1) != 0 ? "" : str;
        String str19 = (i2 & 2) != 0 ? "" : str2;
        String str20 = (i2 & 4) != 0 ? "https://live.chartboost.com" : str3;
        String str21 = (i2 & 8) != 0 ? "" : str4;
        C4113va c4113va2 = (i2 & 16) != 0 ? new C4113va(null, null, null, null, null, null, 63, null) : c4113va;
        String str22 = (i2 & 32) != 0 ? "" : str5;
        this(str18, str19, str20, str21, c4113va2, str22, (i2 & 64) != 0 ? "" : str6, (i2 & 128) != 0 ? "" : str7, (i2 & 256) != 0 ? new HashMap() : map, (i2 & 512) != 0 ? "" : str8, (i2 & 1024) != 0 ? "" : str9, (i2 & 2048) != 0 ? "" : str10, (i2 & 4096) != 0 ? "" : str11, (i2 & 8192) != 0 ? "" : str12, (i2 & 16384) != 0 ? 0 : i, (i2 & 32768) != 0 ? "" : str13, (i2 & 65536) != 0 ? "" : str14, (i2 & 131072) != 0 ? new C4038s1("", "", "") : c4038s1, (i2 & 262144) != 0 ? new HashMap() : map2, (i2 & 524288) != 0 ? EnumC4184yf.UNKNOWN : enumC4184yf, (i2 & 1048576) != 0 ? CollectionsKt.emptyList() : list, (i2 & 2097152) != 0 ? new HashMap() : map3, (i2 & 4194304) != 0 ? "" : str15, (i2 & 8388608) != 0 ? "" : str16, (i2 & 16777216) != 0 ? EnumC3709dc.UNKNOWN : enumC3709dc, (i2 & 33554432) != 0 ? EnumC3816i4.CLICK_PREFERENCE_EMBEDDED : enumC3816i4, (i2 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? "" : str17);
    }

    /* JADX INFO: renamed from: A */
    public final String m16854A() {
        return this.f13499n;
    }

    /* JADX INFO: renamed from: B */
    public final String m16855B() {
        return this.f13496k;
    }

    /* JADX INFO: renamed from: C */
    public final String m16856C() {
        return this.f13495j;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m16857D() {
        return this.f13485B;
    }

    /* JADX INFO: renamed from: E */
    public final Map m16858E() {
        Map map = this.f13504s;
        Map map2 = this.f13494i;
        ArrayList arrayList = new ArrayList(map2.size());
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            C4038s1 c4038s1 = (C4038s1) entry.getValue();
            arrayList.add(TuplesKt.m43482to(str, c4038s1.f16217a + RemoteSettings.FORWARD_SLASH_STRING + c4038s1.f16218b));
        }
        return MapsKt.plus(map, arrayList);
    }

    /* JADX INFO: renamed from: a */
    public final String m16859a() {
        return this.f13487b;
    }

    /* JADX INFO: renamed from: b */
    public final String m16860b() {
        if (this.f13484A.length() == 0) {
            return "";
        }
        return StringsKt.contains((CharSequence) this.f13484A, (CharSequence) "<VAST ", true) ? "Wrapper" : "Inline";
    }

    /* JADX INFO: renamed from: c */
    public final String m16861c() {
        return this.f13508w;
    }

    /* JADX INFO: renamed from: d */
    public final Map m16862d() {
        return this.f13494i;
    }

    /* JADX INFO: renamed from: e */
    public final String m16863e() {
        return this.f13488c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3651b0)) {
            return false;
        }
        C3651b0 c3651b0 = (C3651b0) obj;
        return Intrinsics.areEqual(this.f13486a, c3651b0.f13486a) && Intrinsics.areEqual(this.f13487b, c3651b0.f13487b) && Intrinsics.areEqual(this.f13488c, c3651b0.f13488c) && Intrinsics.areEqual(this.f13489d, c3651b0.f13489d) && Intrinsics.areEqual(this.f13490e, c3651b0.f13490e) && Intrinsics.areEqual(this.f13491f, c3651b0.f13491f) && Intrinsics.areEqual(this.f13492g, c3651b0.f13492g) && Intrinsics.areEqual(this.f13493h, c3651b0.f13493h) && Intrinsics.areEqual(this.f13494i, c3651b0.f13494i) && Intrinsics.areEqual(this.f13495j, c3651b0.f13495j) && Intrinsics.areEqual(this.f13496k, c3651b0.f13496k) && Intrinsics.areEqual(this.f13497l, c3651b0.f13497l) && Intrinsics.areEqual(this.f13498m, c3651b0.f13498m) && Intrinsics.areEqual(this.f13499n, c3651b0.f13499n) && this.f13500o == c3651b0.f13500o && Intrinsics.areEqual(this.f13501p, c3651b0.f13501p) && Intrinsics.areEqual(this.f13502q, c3651b0.f13502q) && Intrinsics.areEqual(this.f13503r, c3651b0.f13503r) && Intrinsics.areEqual(this.f13504s, c3651b0.f13504s) && this.f13505t == c3651b0.f13505t && Intrinsics.areEqual(this.f13506u, c3651b0.f13506u) && Intrinsics.areEqual(this.f13507v, c3651b0.f13507v) && Intrinsics.areEqual(this.f13508w, c3651b0.f13508w) && Intrinsics.areEqual(this.f13509x, c3651b0.f13509x) && this.f13510y == c3651b0.f13510y && this.f13511z == c3651b0.f13511z && Intrinsics.areEqual(this.f13484A, c3651b0.f13484A);
    }

    /* JADX INFO: renamed from: f */
    public final C4038s1 m16864f() {
        return this.f13503r;
    }

    /* JADX INFO: renamed from: g */
    public final String m16865g() {
        return this.f13491f;
    }

    /* JADX INFO: renamed from: h */
    public final EnumC3816i4 m16866h() {
        return this.f13511z;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((this.f13486a.hashCode() * 31) + this.f13487b.hashCode()) * 31) + this.f13488c.hashCode()) * 31) + this.f13489d.hashCode()) * 31) + this.f13490e.hashCode()) * 31) + this.f13491f.hashCode()) * 31) + this.f13492g.hashCode()) * 31) + this.f13493h.hashCode()) * 31) + this.f13494i.hashCode()) * 31) + this.f13495j.hashCode()) * 31) + this.f13496k.hashCode()) * 31) + this.f13497l.hashCode()) * 31) + this.f13498m.hashCode()) * 31) + this.f13499n.hashCode()) * 31) + this.f13500o) * 31) + this.f13501p.hashCode()) * 31) + this.f13502q.hashCode()) * 31) + this.f13503r.hashCode()) * 31) + this.f13504s.hashCode()) * 31) + this.f13505t.hashCode()) * 31) + this.f13506u.hashCode()) * 31) + this.f13507v.hashCode()) * 31) + this.f13508w.hashCode()) * 31) + this.f13509x.hashCode()) * 31) + this.f13510y.hashCode()) * 31) + this.f13511z.hashCode()) * 31) + this.f13484A.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final String m16867i() {
        return this.f13492g;
    }

    /* JADX INFO: renamed from: j */
    public final String m16868j() {
        return this.f13484A;
    }

    /* JADX INFO: renamed from: k */
    public final String m16869k() {
        return this.f13498m;
    }

    /* JADX INFO: renamed from: l */
    public final Map m16870l() {
        return this.f13507v;
    }

    /* JADX INFO: renamed from: m */
    public final String m16871m() {
        return this.f13489d;
    }

    /* JADX INFO: renamed from: n */
    public final C4113va m16872n() {
        return this.f13490e;
    }

    /* JADX INFO: renamed from: o */
    public final String m16873o() {
        return this.f13497l;
    }

    /* JADX INFO: renamed from: p */
    public final String m16874p() {
        return this.f13493h;
    }

    /* JADX INFO: renamed from: q */
    public final EnumC3709dc m16875q() {
        return this.f13510y;
    }

    /* JADX INFO: renamed from: r */
    public final String m16876r() {
        return this.f13486a;
    }

    /* JADX INFO: renamed from: s */
    public final Map m16877s() {
        return this.f13504s;
    }

    /* JADX INFO: renamed from: t */
    public final String m16878t() {
        JSONObject jSONObjectM20014a = AbstractC4171y2.m20014a(new AbstractC4171y2.a[0]);
        for (Map.Entry entry : m16858E().entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            Intrinsics.checkNotNull(jSONObjectM20014a);
            AbstractC4193z2.m20094a(jSONObjectM20014a, str, str2);
        }
        String string = jSONObjectM20014a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public String toString() {
        return "AdUnit(name=" + this.f13486a + ", adId=" + this.f13487b + ", baseUrl=" + this.f13488c + ", impressionId=" + this.f13489d + ", infoIcon=" + this.f13490e + ", cgn=" + this.f13491f + ", creative=" + this.f13492g + ", mediaType=" + this.f13493h + ", assets=" + this.f13494i + ", videoUrl=" + this.f13495j + ", videoFilename=" + this.f13496k + ", link=" + this.f13497l + ", deepLink=" + this.f13498m + ", to=" + this.f13499n + ", rewardAmount=" + this.f13500o + ", rewardCurrency=" + this.f13501p + ", template=" + this.f13502q + ", body=" + this.f13503r + ", parameters=" + this.f13504s + ", renderingEngine=" + this.f13505t + ", scripts=" + this.f13506u + ", events=" + this.f13507v + ", adm=" + this.f13508w + ", templateParams=" + this.f13509x + ", mtype=" + this.f13510y + ", clkp=" + this.f13511z + ", decodedAdm=" + this.f13484A + ")";
    }

    /* JADX INFO: renamed from: u */
    public final EnumC4184yf m16879u() {
        return this.f13505t;
    }

    /* JADX INFO: renamed from: v */
    public final int m16880v() {
        return this.f13500o;
    }

    /* JADX INFO: renamed from: w */
    public final String m16881w() {
        return this.f13501p;
    }

    /* JADX INFO: renamed from: x */
    public final List m16882x() {
        return this.f13506u;
    }

    /* JADX INFO: renamed from: y */
    public final String m16883y() {
        return this.f13502q;
    }

    /* JADX INFO: renamed from: z */
    public final String m16884z() {
        return this.f13509x;
    }
}

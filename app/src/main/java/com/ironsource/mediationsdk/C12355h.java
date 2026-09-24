package com.ironsource.mediationsdk;

import com.ironsource.C11767Y9;
import com.ironsource.C12106b2;
import com.ironsource.C12258j2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C12355h {

    /* JADX INFO: renamed from: a */
    private final IronSource.EnumC12328a f31244a;

    /* JADX INFO: renamed from: b */
    private final ArrayList<C12258j2> f31245b;

    /* JADX INFO: renamed from: c */
    private boolean f31246c;

    /* JADX INFO: renamed from: d */
    private String f31247d;

    /* JADX INFO: renamed from: e */
    private boolean f31248e;

    /* JADX INFO: renamed from: f */
    private Map<String, Object> f31249f;

    /* JADX INFO: renamed from: g */
    private List<String> f31250g;

    /* JADX INFO: renamed from: h */
    private int f31251h;

    /* JADX INFO: renamed from: i */
    private C12106b2 f31252i;

    /* JADX INFO: renamed from: j */
    private C11767Y9 f31253j;

    /* JADX INFO: renamed from: k */
    private String f31254k;

    /* JADX INFO: renamed from: l */
    private ISBannerSize f31255l;

    /* JADX INFO: renamed from: m */
    private boolean f31256m;

    /* JADX INFO: renamed from: n */
    private boolean f31257n;

    /* JADX INFO: renamed from: o */
    private boolean f31258o;

    /* JADX INFO: renamed from: p */
    private String f31259p;

    /* JADX INFO: renamed from: q */
    private String f31260q;

    /* JADX INFO: renamed from: r */
    private Boolean f31261r;

    /* JADX INFO: renamed from: s */
    private Double f31262s;

    public C12355h(IronSource.EnumC12328a adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f31244a = adUnit;
        this.f31245b = new ArrayList<>();
        this.f31247d = "";
        this.f31249f = new HashMap();
        this.f31250g = new ArrayList();
        this.f31251h = -1;
        this.f31254k = "";
    }

    @Deprecated(message = "Use instancesInfo instead")
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m32481i() {
    }

    @Deprecated(message = "Use instancesInfo instead")
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m32482m() {
    }

    /* JADX INFO: renamed from: a */
    public final IronSource.EnumC12328a m32483a() {
        return this.f31244a;
    }

    /* JADX INFO: renamed from: b */
    public final void m32498b(boolean z) {
        this.f31248e = z;
    }

    /* JADX INFO: renamed from: c */
    public final IronSource.EnumC12328a m32499c() {
        return this.f31244a;
    }

    /* JADX INFO: renamed from: d */
    public final void m32503d(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f31254k = str;
    }

    /* JADX INFO: renamed from: e */
    public final C12106b2 m32505e() {
        return this.f31252i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12355h) && this.f31244a == ((C12355h) obj).f31244a;
    }

    /* JADX INFO: renamed from: f */
    public final ISBannerSize m32507f() {
        return this.f31255l;
    }

    /* JADX INFO: renamed from: g */
    public final Double m32508g() {
        return this.f31262s;
    }

    /* JADX INFO: renamed from: h */
    public final Map<String, Object> m32509h() {
        return this.f31249f;
    }

    public int hashCode() {
        return this.f31244a.hashCode();
    }

    /* JADX INFO: renamed from: j */
    public final String m32510j() {
        return this.f31247d;
    }

    /* JADX INFO: renamed from: k */
    public final ArrayList<C12258j2> m32511k() {
        return this.f31245b;
    }

    /* JADX INFO: renamed from: l */
    public final List<String> m32512l() {
        return this.f31250g;
    }

    /* JADX INFO: renamed from: n */
    public final C11767Y9 m32513n() {
        return this.f31253j;
    }

    /* JADX INFO: renamed from: o */
    public final int m32514o() {
        return this.f31251h;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m32515p() {
        return this.f31257n;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m32516q() {
        return this.f31258o;
    }

    /* JADX INFO: renamed from: r */
    public final String m32517r() {
        return this.f31254k;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m32518s() {
        return this.f31256m;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m32519t() {
        return this.f31248e;
    }

    public String toString() {
        return "AuctionRequestParams(adUnit=" + this.f31244a + ")";
    }

    /* JADX INFO: renamed from: u */
    public final Boolean m32520u() {
        return this.f31261r;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m32521v() {
        return this.f31246c;
    }

    /* JADX INFO: renamed from: a */
    public final C12355h m32484a(IronSource.EnumC12328a adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        return new C12355h(adUnit);
    }

    /* JADX INFO: renamed from: b */
    public final void m32497b(String str) {
        this.f31259p = str;
    }

    /* JADX INFO: renamed from: c */
    public final void m32501c(boolean z) {
        this.f31246c = z;
    }

    /* JADX INFO: renamed from: d */
    public final void m32504d(boolean z) {
        this.f31257n = z;
    }

    /* JADX INFO: renamed from: e */
    public final void m32506e(boolean z) {
        this.f31258o = z;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C12355h m32480a(C12355h c12355h, IronSource.EnumC12328a enumC12328a, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC12328a = c12355h.f31244a;
        }
        return c12355h.m32484a(enumC12328a);
    }

    /* JADX INFO: renamed from: b */
    public final String m32496b() {
        return this.f31260q;
    }

    /* JADX INFO: renamed from: c */
    public final void m32500c(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f31247d = str;
    }

    /* JADX INFO: renamed from: d */
    public final String m32502d() {
        return this.f31259p;
    }

    /* JADX INFO: renamed from: a */
    public final void m32488a(C12258j2 instanceInfo) {
        Intrinsics.checkNotNullParameter(instanceInfo, "instanceInfo");
        this.f31245b.add(instanceInfo);
    }

    /* JADX INFO: renamed from: a */
    public final void m32494a(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f31249f = map;
    }

    /* JADX INFO: renamed from: a */
    public final void m32493a(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f31250g = list;
    }

    /* JADX INFO: renamed from: a */
    public final void m32485a(int i) {
        this.f31251h = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m32487a(C12106b2 c12106b2) {
        this.f31252i = c12106b2;
    }

    /* JADX INFO: renamed from: a */
    public final void m32486a(C11767Y9 c11767y9) {
        this.f31253j = c11767y9;
    }

    /* JADX INFO: renamed from: a */
    public final void m32489a(ISBannerSize iSBannerSize) {
        this.f31255l = iSBannerSize;
    }

    /* JADX INFO: renamed from: a */
    public final void m32495a(boolean z) {
        this.f31256m = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m32492a(String str) {
        this.f31260q = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m32490a(Boolean bool) {
        this.f31261r = bool;
    }

    /* JADX INFO: renamed from: a */
    public final void m32491a(Double d) {
        this.f31262s = d;
    }
}

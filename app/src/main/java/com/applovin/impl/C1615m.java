package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.m */
/* JADX INFO: loaded from: classes3.dex */
class C1615m extends AbstractViewOnClickListenerC1784u2 {

    /* JADX INFO: renamed from: e */
    private final C1656n f2038e;

    /* JADX INFO: renamed from: f */
    private final C1666o f2039f;

    /* JADX INFO: renamed from: g */
    private final C1604k8 f2040g;

    /* JADX INFO: renamed from: h */
    private final String f2041h;

    /* JADX INFO: renamed from: i */
    private final List f2042i;

    /* JADX INFO: renamed from: j */
    private final List f2043j;

    /* JADX INFO: renamed from: k */
    private final List f2044k;

    /* JADX INFO: renamed from: com.applovin.impl.m$a */
    enum a {
        INFO,
        BIDDERS,
        WATERFALL,
        COUNT
    }

    /* JADX INFO: renamed from: com.applovin.impl.m$b */
    class b extends C1510b4 {

        /* JADX INFO: renamed from: p */
        private final C1604k8 f2050p;

        b(C1604k8 c1604k8, String str, boolean z) {
            super(c1604k8.m3097b().m5507d(), C1615m.this.f3399a);
            this.f2050p = c1604k8;
            this.f3279c = StringUtils.createSpannedString(c1604k8.m3097b().m5504a(), ViewCompat.MEASURED_STATE_MASK, 18, 1);
            this.f3280d = !TextUtils.isEmpty(str) ? new SpannedString(str) : null;
            this.f3278b = z;
        }

        @Override // com.applovin.impl.C1775t2
        /* JADX INFO: renamed from: g */
        public int mo3165g() {
            return -12303292;
        }

        @Override // com.applovin.impl.C1510b4, com.applovin.impl.C1775t2
        /* JADX INFO: renamed from: o */
        public boolean mo2107o() {
            return this.f3278b;
        }

        /* JADX INFO: renamed from: v */
        public C1604k8 m3166v() {
            return this.f2050p;
        }
    }

    C1615m(C1656n c1656n, C1666o c1666o, C1604k8 c1604k8, Context context) {
        super(context);
        this.f2038e = c1656n;
        this.f2040g = c1604k8;
        this.f2039f = c1666o != null ? c1666o : c1656n.m3612f();
        this.f2041h = c1666o != null ? c1666o.m3713c() : c1656n.m3610d();
        this.f2042i = m3159h();
        this.f2043j = m3156e();
        this.f2044k = m3161l();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: d */
    private C1775t2 m3155d() {
        return C1775t2.m5210a().m5234d("Ad Format").m5232c(this.f2038e.m3608b()).m5226a();
    }

    /* JADX INFO: renamed from: e */
    private List m3156e() {
        C1604k8 c1604k8 = this.f2040g;
        if (c1604k8 != null && !c1604k8.m3099d()) {
            return new ArrayList();
        }
        List<C1604k8> listM3711a = this.f2039f.m3711a();
        ArrayList arrayList = new ArrayList(listM3711a.size());
        for (C1604k8 c1604k9 : listM3711a) {
            C1604k8 c1604k10 = this.f2040g;
            if (c1604k10 == null || c1604k10.m3097b().m5506c().equals(c1604k9.m3097b().m5506c())) {
                arrayList.add(new b(c1604k9, c1604k9.m3096a() != null ? c1604k9.m3096a().m2198a() : "", this.f2040g == null));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    private C1775t2 m3157f() {
        return C1775t2.m5210a().m5234d("AB Test Experiment Name").m5232c(m3162j().m3712b()).m5226a();
    }

    /* JADX INFO: renamed from: g */
    private C1775t2 m3158g() {
        return C1775t2.m5210a().m5234d("ID").m5232c(this.f2038e.m3609c()).m5226a();
    }

    /* JADX INFO: renamed from: h */
    private List m3159h() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(m3158g());
        arrayList.add(m3155d());
        if (this.f2039f.m3712b() != null) {
            arrayList.add(m3157f());
        }
        if (this.f2040g != null) {
            arrayList.add(m3160i());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    private C1775t2 m3160i() {
        return C1775t2.m5210a().m5234d("Selected Network").m5232c(this.f2040g.m3097b().m5504a()).m5226a();
    }

    /* JADX INFO: renamed from: l */
    private List m3161l() {
        C1604k8 c1604k8 = this.f2040g;
        if (c1604k8 != null && c1604k8.m3099d()) {
            return new ArrayList();
        }
        List<C1604k8> listM3715e = this.f2039f.m3715e();
        ArrayList arrayList = new ArrayList(listM3715e.size());
        for (C1604k8 c1604k9 : listM3715e) {
            C1604k8 c1604k10 = this.f2040g;
            if (c1604k10 == null || c1604k10.m3097b().m5506c().equals(c1604k9.m3097b().m5506c())) {
                arrayList.add(new b(c1604k9, null, this.f2040g == null));
                for (C1520c4 c1520c4 : c1604k9.m3098c()) {
                    arrayList.add(C1775t2.m5210a().m5234d(c1520c4.m2198a()).m5232c(c1520c4.m2199b()).m5230b(true).m5226a());
                }
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
    /* JADX INFO: renamed from: b */
    protected int mo2125b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
    /* JADX INFO: renamed from: c */
    protected List mo2126c(int i) {
        if (i == a.INFO.ordinal()) {
            return this.f2042i;
        }
        return i == a.BIDDERS.ordinal() ? this.f2043j : this.f2044k;
    }

    @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
    /* JADX INFO: renamed from: d */
    protected int mo2127d(int i) {
        if (i == a.INFO.ordinal()) {
            return this.f2042i.size();
        }
        return i == a.BIDDERS.ordinal() ? this.f2043j.size() : this.f2044k.size();
    }

    @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
    /* JADX INFO: renamed from: e */
    protected C1775t2 mo2128e(int i) {
        if (i == a.INFO.ordinal()) {
            return new C1813x4("INFO");
        }
        return i == a.BIDDERS.ordinal() ? new C1813x4("BIDDERS") : new C1813x4("WATERFALL");
    }

    /* JADX INFO: renamed from: j */
    public C1666o m3162j() {
        return this.f2039f;
    }

    /* JADX INFO: renamed from: k */
    public String m3163k() {
        return this.f2041h;
    }
}

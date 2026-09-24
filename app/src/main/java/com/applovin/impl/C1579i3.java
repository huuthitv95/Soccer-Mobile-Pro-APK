package com.applovin.impl;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.C1846R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.i3 */
/* JADX INFO: loaded from: classes3.dex */
public class C1579i3 extends AbstractViewOnClickListenerC1784u2 {

    /* JADX INFO: renamed from: e */
    private final C1559g3 f1804e;

    /* JADX INFO: renamed from: f */
    private List f1805f;

    /* JADX INFO: renamed from: g */
    private final List f1806g;

    /* JADX INFO: renamed from: h */
    private final List f1807h;

    /* JADX INFO: renamed from: i */
    private final List f1808i;

    /* JADX INFO: renamed from: j */
    private final List f1809j;

    /* JADX INFO: renamed from: k */
    private SpannedString f1810k;

    /* JADX INFO: renamed from: com.applovin.impl.i3$a */
    public enum a {
        INTEGRATIONS,
        PERMISSIONS,
        CONFIGURATION,
        DEPENDENCIES,
        TEST_ADS,
        COUNT
    }

    C1579i3(C1559g3 c1559g3, Context context) {
        super(context);
        this.f1804e = c1559g3;
        if (c1559g3.m2714q() == C1559g3.a.INVALID_INTEGRATION) {
            SpannableString spannableString = new SpannableString("Tap for more information");
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, spannableString.length(), 33);
            this.f1810k = new SpannedString(spannableString);
        } else {
            this.f1810k = new SpannedString("");
        }
        this.f1805f = m2872g();
        this.f1806g = m2864b(c1559g3.m2711n());
        this.f1807h = m2869e();
        this.f1808i = m2862a(c1559g3.m2703f());
        this.f1809j = m2874j();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: a */
    private int m2859a(boolean z) {
        return z ? C1846R.drawable.applovin_ic_check_mark_bordered : C1846R.drawable.applovin_ic_x_mark;
    }

    /* JADX INFO: renamed from: a */
    private C1775t2 m2860a(C1559g3.b bVar) {
        C1775t2.b bVarM5210a = C1775t2.m5210a();
        if (bVar == C1559g3.b.READY) {
            bVarM5210a.m5222a(this.f3399a);
        }
        return bVarM5210a.m5234d("Test Mode").m5232c(bVar.m2729c()).m5231c(bVar.m2730d()).m5229b("Restart Required").m5224a(bVar.m2728b()).m5225a(true).m5226a();
    }

    /* JADX INFO: renamed from: a */
    private C1775t2 m2861a(String str, String str2, boolean z, boolean z2) {
        return C1775t2.m5211a(z ? C1775t2.c.RIGHT_DETAIL : C1775t2.c.DETAIL).m5234d(str).m5223a(z ? null : this.f1810k).m5229b("Instructions").m5224a(str2).m5221a(z ? C1846R.drawable.applovin_ic_check_mark_bordered : m2865c(z2)).m5227b(z ? this.f3399a.getColor(C1846R.color.applovin_sdk_checkmarkColor) : m2867d(z2)).m5225a(!z).m5226a();
    }

    /* JADX INFO: renamed from: a */
    private List m2862a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1607l1 c1607l1 = (C1607l1) it.next();
                arrayList.add(m2861a(c1607l1.m3115b(), c1607l1.m3114a(), c1607l1.m3116c(), true));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    private int m2863b(boolean z) {
        Context context;
        int i;
        if (z) {
            context = this.f3399a;
            i = C1846R.color.applovin_sdk_checkmarkColor;
        } else {
            context = this.f3399a;
            i = C1846R.color.applovin_sdk_xmarkColor;
        }
        return context.getColor(i);
    }

    /* JADX INFO: renamed from: b */
    private List m2864b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1708r4 c1708r4 = (C1708r4) it.next();
                arrayList.add(m2861a(c1708r4.m4199b(), c1708r4.m4198a(), c1708r4.m4200c(), true));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    private int m2865c(boolean z) {
        return z ? C1846R.drawable.applovin_ic_x_mark : C1846R.drawable.applovin_ic_warning;
    }

    /* JADX INFO: renamed from: c */
    private C1775t2 m2866c(List list) {
        return C1775t2.m5210a().m5234d("Region/VPN Required").m5232c(CollectionUtils.implode(list, ", ", list.size())).m5226a();
    }

    /* JADX INFO: renamed from: d */
    private int m2867d(boolean z) {
        Context context;
        int i;
        if (z) {
            context = this.f3399a;
            i = C1846R.color.applovin_sdk_xmarkColor;
        } else {
            context = this.f3399a;
            i = C1846R.color.applovin_sdk_warningColor;
        }
        return context.getColor(i);
    }

    /* JADX INFO: renamed from: d */
    private C1775t2 m2868d() {
        C1775t2.b bVarM5232c = C1775t2.m5210a().m5234d("Adapter").m5232c(this.f1804e.m2700c());
        if (TextUtils.isEmpty(this.f1804e.m2700c())) {
            bVarM5232c.m5221a(m2859a(this.f1804e.m2723z())).m5227b(m2863b(this.f1804e.m2723z()));
        }
        return bVarM5232c.m5226a();
    }

    /* JADX INFO: renamed from: e */
    private List m2869e() {
        ArrayList arrayList = new ArrayList(1);
        if (this.f1804e.m2691D()) {
            arrayList.add(m2861a("Java 8", "For optimal performance, please enable Java 8 support. See: https://support.axon.ai/en/max/android/overview/integration", C1748l.m4716H0(), true));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    private C1775t2 m2870f() {
        if (this.f1804e.m2695H()) {
            return null;
        }
        return C1775t2.m5210a().m5234d("Initialization Status").m5232c(m2871f(this.f1804e.m2706i())).m5225a(false).m5226a();
    }

    /* JADX INFO: renamed from: f */
    private String m2871f(int i) {
        if (MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.getCode() == i || MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.getCode() == i || MaxAdapter.InitializationStatus.DOES_NOT_APPLY.getCode() == i) {
            return "Initialized";
        }
        if (MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() == i) {
            return "Failure";
        }
        return MaxAdapter.InitializationStatus.INITIALIZING.getCode() == i ? "Initializing..." : "Not Initialized";
    }

    /* JADX INFO: renamed from: g */
    private List m2872g() {
        ArrayList arrayList = new ArrayList(3);
        CollectionUtils.addObjectIfExists(m2873i(), arrayList);
        CollectionUtils.addObjectIfExists(m2868d(), arrayList);
        CollectionUtils.addObjectIfExists(m2870f(), arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    private C1775t2 m2873i() {
        C1775t2.b bVarM5232c = C1775t2.m5210a().m5234d("SDK").m5232c(this.f1804e.m2713p());
        if (TextUtils.isEmpty(this.f1804e.m2713p())) {
            bVarM5232c.m5221a(m2859a(this.f1804e.m2693F())).m5227b(m2863b(this.f1804e.m2693F()));
        }
        return bVarM5232c.m5226a();
    }

    /* JADX INFO: renamed from: j */
    private List m2874j() {
        ArrayList arrayList = new ArrayList(3);
        if (StringUtils.isValidString(this.f1804e.m2719v())) {
            arrayList.add(C1775t2.m5211a(C1775t2.c.DETAIL).m5234d(this.f1804e.m2719v()).m5226a());
        }
        if (this.f1804e.m2722y() == C1559g3.b.NOT_SUPPORTED) {
            return arrayList;
        }
        if (this.f1804e.m2716s() != null) {
            arrayList.add(m2866c(this.f1804e.m2716s()));
        }
        arrayList.add(m2860a(this.f1804e.m2722y()));
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public boolean m2875a(C1608l2 c1608l2) {
        return c1608l2.m3118b() == a.TEST_ADS.ordinal() && c1608l2.m3117a() == this.f1809j.size() - 1;
    }

    @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
    /* JADX INFO: renamed from: b */
    protected int mo2125b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
    /* JADX INFO: renamed from: c */
    protected List mo2126c(int i) {
        if (i == a.INTEGRATIONS.ordinal()) {
            return this.f1805f;
        }
        if (i == a.PERMISSIONS.ordinal()) {
            return this.f1806g;
        }
        if (i == a.CONFIGURATION.ordinal()) {
            return this.f1807h;
        }
        return i == a.DEPENDENCIES.ordinal() ? this.f1808i : this.f1809j;
    }

    @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
    /* JADX INFO: renamed from: d */
    protected int mo2127d(int i) {
        if (i == a.INTEGRATIONS.ordinal()) {
            return this.f1805f.size();
        }
        if (i == a.PERMISSIONS.ordinal()) {
            return this.f1806g.size();
        }
        if (i == a.CONFIGURATION.ordinal()) {
            return this.f1807h.size();
        }
        return i == a.DEPENDENCIES.ordinal() ? this.f1808i.size() : this.f1809j.size();
    }

    @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
    /* JADX INFO: renamed from: e */
    protected C1775t2 mo2128e(int i) {
        if (i == a.INTEGRATIONS.ordinal()) {
            return new C1813x4("INTEGRATIONS");
        }
        if (i == a.PERMISSIONS.ordinal()) {
            return new C1813x4("PERMISSIONS");
        }
        if (i == a.CONFIGURATION.ordinal()) {
            return new C1813x4("CONFIGURATION");
        }
        return i == a.DEPENDENCIES.ordinal() ? new C1813x4("DEPENDENCIES") : new C1813x4("TEST ADS");
    }

    /* JADX INFO: renamed from: h */
    public C1559g3 m2876h() {
        return this.f1804e;
    }

    /* JADX INFO: renamed from: k */
    public void m2877k() {
        this.f1805f = m2872g();
    }

    public String toString() {
        return "MediatedNetworkListAdapter{}";
    }
}

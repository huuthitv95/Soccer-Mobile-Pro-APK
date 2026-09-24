package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.applovin.impl.sdk.C1748l;
import com.applovin.sdk.C1846R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.n0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractActivityC1657n0 extends AbstractActivityC1680p3 {

    /* JADX INFO: renamed from: a */
    private C1748l f2379a;

    /* JADX INFO: renamed from: b */
    private AbstractViewOnClickListenerC1784u2 f2380b;

    /* JADX INFO: renamed from: com.applovin.impl.n0$a */
    class a extends AbstractViewOnClickListenerC1784u2 {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ List f2381e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ List f2382f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ List f2383g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ List f2384h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ List f2385i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, List list, List list2, List list3, List list4, List list5) {
            super(context);
            this.f2381e = list;
            this.f2382f = list2;
            this.f2383g = list3;
            this.f2384h = list4;
            this.f2385i = list5;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: b */
        protected int mo2125b() {
            return c.values().length;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: c */
        protected List mo2126c(int i) {
            List list;
            boolean z = true;
            if (i == c.MISSING_TC_NETWORKS.ordinal()) {
                list = this.f2381e;
            } else if (i == c.MISSING_AC_NETWORKS.ordinal()) {
                list = this.f2382f;
            } else {
                z = false;
                if (i == c.LISTED_TC_NETWORKS.ordinal()) {
                    list = this.f2383g;
                } else {
                    list = i == c.LISTED_AC_NETWORKS.ordinal() ? this.f2384h : this.f2385i;
                }
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractActivityC1657n0.this.m3614a((C1533d7) it.next(), z));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: d */
        protected int mo2127d(int i) {
            if (i == c.MISSING_TC_NETWORKS.ordinal()) {
                return this.f2381e.size();
            }
            if (i == c.MISSING_AC_NETWORKS.ordinal()) {
                return this.f2382f.size();
            }
            if (i == c.LISTED_TC_NETWORKS.ordinal()) {
                return this.f2383g.size();
            }
            return i == c.LISTED_AC_NETWORKS.ordinal() ? this.f2384h.size() : this.f2385i.size();
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: e */
        protected C1775t2 mo2128e(int i) {
            if (i == c.MISSING_TC_NETWORKS.ordinal()) {
                return new C1813x4("MISSING TCF VENDORS (TC STRING)");
            }
            if (i == c.MISSING_AC_NETWORKS.ordinal()) {
                return new C1813x4("MISSING ATP NETWORKS (AC STRING)");
            }
            if (i == c.LISTED_TC_NETWORKS.ordinal()) {
                return new C1813x4("LISTED TCF VENDORS (TC STRING)");
            }
            return i == c.LISTED_AC_NETWORKS.ordinal() ? new C1813x4("LISTED ATP NETWORKS (AC STRING)") : new C1813x4("NON-CONFIGURABLE NETWORKS");
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.n0$b */
    class b implements AbstractViewOnClickListenerC1784u2.a {
        b() {
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2.a
        /* JADX INFO: renamed from: a */
        public void mo2129a(C1608l2 c1608l2, C1775t2 c1775t2) {
            AbstractC1701q7.m4057a(c1775t2.m5214c(), c1775t2.m5213b(), AbstractActivityC1657n0.this);
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.n0$c */
    private enum c {
        MISSING_TC_NETWORKS,
        MISSING_AC_NETWORKS,
        LISTED_TC_NETWORKS,
        LISTED_AC_NETWORKS,
        OTHER_NETWORKS
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public C1775t2 m3614a(C1533d7 c1533d7, boolean z) {
        C1775t2.b bVarM5210a = C1775t2.m5210a();
        boolean zM2225b = this.f2379a.m4855t0().m2225b();
        C1533d7.a aVarM2425f = c1533d7.m2425f();
        C1533d7.a aVar = C1533d7.a.TCF_VENDOR;
        if (aVarM2425f == aVar || (c1533d7.m2425f() == C1533d7.a.ATP_NETWORK && zM2225b)) {
            String strM2422c = c1533d7.m2422c();
            String str = c1533d7.m2425f() == aVar ? "IAB Vendor ID: " : "Google ATP ID: ";
            bVarM5210a.m5234d(strM2422c).m5233d(z ? SupportMenu.CATEGORY_MASK : ViewCompat.MEASURED_STATE_MASK).m5229b(strM2422c).m5224a(str + c1533d7.m2423d()).m5225a(true);
        } else {
            bVarM5210a.m5234d(c1533d7.m2421b());
        }
        return bVarM5210a.m5226a();
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3
    protected C1748l getSdk() {
        return this.f2379a;
    }

    public void initialize(List<C1533d7> list, List<C1533d7> list2, List<C1533d7> list3, List<C1533d7> list4, List<C1533d7> list5, C1748l c1748l) {
        this.f2379a = c1748l;
        a aVar = new a(this, list, list2, list3, list4, list5);
        this.f2380b = aVar;
        aVar.m5278a(new b());
        this.f2380b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1846R.layout.mediation_debugger_list_view);
        setTitle("Configured CMP Networks");
        ((ListView) findViewById(C1846R.id.listView)).setAdapter((ListAdapter) this.f2380b);
    }
}

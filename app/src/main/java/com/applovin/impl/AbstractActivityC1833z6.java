package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.sdk.C1748l;
import com.applovin.sdk.C1846R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.z6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractActivityC1833z6 extends AbstractActivityC1680p3 {

    /* JADX INFO: renamed from: a */
    private C1748l f4101a;

    /* JADX INFO: renamed from: b */
    private AbstractViewOnClickListenerC1784u2 f4102b;

    /* JADX INFO: renamed from: com.applovin.impl.z6$a */
    class a extends AbstractViewOnClickListenerC1784u2 {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ ArrayList f4103e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ ArrayList f4104f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ boolean f4105g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, ArrayList arrayList, ArrayList arrayList2, boolean z) {
            super(context);
            this.f4103e = arrayList;
            this.f4104f = arrayList2;
            this.f4105g = z;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: b */
        protected int mo2125b() {
            return b.values().length;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: c */
        protected List mo2126c(int i) {
            return i == b.TC_NETWORKS.ordinal() ? this.f4103e : this.f4104f;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: d */
        protected int mo2127d(int i) {
            return i == b.TC_NETWORKS.ordinal() ? this.f4103e.size() : this.f4104f.size();
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: e */
        protected C1775t2 mo2128e(int i) {
            if (i == b.TC_NETWORKS.ordinal()) {
                return new C1813x4("TCF VENDORS (TC STRING)");
            }
            return new C1813x4(this.f4105g ? "ATP NETWORKS (AC STRING)" : "APPLOVIN PRIVACY SETTING");
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.z6$b */
    private enum b {
        TC_NETWORKS,
        AC_NETWORKS
    }

    /* JADX INFO: renamed from: a */
    private C1775t2 m5753a(String str, String str2) {
        return C1775t2.m5210a().m5234d(str).m5232c(str2).m5226a();
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3
    protected C1748l getSdk() {
        return this.f4101a;
    }

    public void initialize(List<C1533d7> list, C1748l c1748l) {
        this.f4101a = c1748l;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strM3958a = AbstractC1694q0.m3953b().m3958a(this);
        boolean zM2225b = c1748l.m4855t0().m2225b();
        if (!zM2225b) {
            arrayList2.add(m5753a("Has User Consent", strM3958a));
        }
        for (C1533d7 c1533d7 : list) {
            Boolean boolM2419a = c1533d7.m2419a();
            if (boolM2419a != null) {
                if (c1533d7.m2425f() == C1533d7.a.TCF_VENDOR) {
                    arrayList.add(m5753a(c1533d7.m2421b(), String.valueOf(boolM2419a)));
                } else if (c1533d7.m2425f() == C1533d7.a.ATP_NETWORK) {
                    arrayList2.add(m5753a(c1533d7.m2421b(), String.valueOf(boolM2419a)));
                }
            } else if (zM2225b && c1533d7.m2425f() == C1533d7.a.ATP_NETWORK) {
                arrayList2.add(m5753a(c1533d7.m2421b(), strM3958a));
            }
        }
        a aVar = new a(this, arrayList, arrayList2, zM2225b);
        this.f4102b = aVar;
        aVar.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1846R.layout.mediation_debugger_list_view);
        setTitle("Network Consent Statuses");
        ((ListView) findViewById(C1846R.id.listView)).setAdapter((ListAdapter) this.f4102b);
    }
}

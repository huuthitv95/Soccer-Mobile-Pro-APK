package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerCmpNetworksListActivity;
import com.applovin.mediation.MaxDebuggerTcfStringActivity;
import com.applovin.sdk.C1846R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.b7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractActivityC1513b7 extends AbstractActivityC1680p3 {

    /* JADX INFO: renamed from: a */
    private C1748l f1190a;

    /* JADX INFO: renamed from: b */
    private AbstractViewOnClickListenerC1784u2 f1191b;

    /* JADX INFO: renamed from: c */
    private final List f1192c = new ArrayList();

    /* JADX INFO: renamed from: d */
    private final List f1193d = new ArrayList();

    /* JADX INFO: renamed from: e */
    private final List f1194e = new ArrayList();

    /* JADX INFO: renamed from: f */
    private final List f1195f = new ArrayList();

    /* JADX INFO: renamed from: g */
    private final List f1196g = new ArrayList();

    /* JADX INFO: renamed from: com.applovin.impl.b7$a */
    class a extends AbstractViewOnClickListenerC1784u2 {
        a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: b */
        protected int mo2125b() {
            return e.values().length;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: c */
        protected List mo2126c(int i) {
            return i == e.IAB_TCF_PARAMETERS.ordinal() ? AbstractActivityC1513b7.this.m2119c() : AbstractActivityC1513b7.this.m2113a();
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: d */
        protected int mo2127d(int i) {
            return i == e.IAB_TCF_PARAMETERS.ordinal() ? d.values().length : c.values().length;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: e */
        protected C1775t2 mo2128e(int i) {
            return i == e.IAB_TCF_PARAMETERS.ordinal() ? new C1813x4("IAB TCF Parameters") : new C1813x4("CMP CONFIGURATION");
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.b7$b */
    class b implements AbstractViewOnClickListenerC1784u2.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC1523c7 f1198a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C1748l f1199b;

        /* JADX INFO: renamed from: com.applovin.impl.b7$b$a */
        class a implements AbstractC1525d.b {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f1201a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ String f1202b;

            a(String str, String str2) {
                this.f1201a = str;
                this.f1202b = str2;
            }

            @Override // com.applovin.impl.AbstractC1525d.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void mo2130a(MaxDebuggerTcfStringActivity maxDebuggerTcfStringActivity) {
                maxDebuggerTcfStringActivity.initialize(this.f1201a, this.f1202b, b.this.f1199b);
            }
        }

        /* JADX INFO: renamed from: com.applovin.impl.b7$b$b, reason: collision with other inner class name */
        class C15434b implements AbstractC1525d.b {
            C15434b() {
            }

            @Override // com.applovin.impl.AbstractC1525d.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void mo2130a(MaxDebuggerCmpNetworksListActivity maxDebuggerCmpNetworksListActivity) {
                maxDebuggerCmpNetworksListActivity.initialize(AbstractActivityC1513b7.this.f1194e, AbstractActivityC1513b7.this.f1195f, AbstractActivityC1513b7.this.f1192c, AbstractActivityC1513b7.this.f1193d, AbstractActivityC1513b7.this.f1196g, b.this.f1199b);
            }
        }

        b(SharedPreferencesOnSharedPreferenceChangeListenerC1523c7 sharedPreferencesOnSharedPreferenceChangeListenerC1523c7, C1748l c1748l) {
            this.f1198a = sharedPreferencesOnSharedPreferenceChangeListenerC1523c7;
            this.f1199b = c1748l;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2.a
        /* JADX INFO: renamed from: a */
        public void mo2129a(C1608l2 c1608l2, C1775t2 c1775t2) {
            String strM2109a;
            String strM2227c;
            if (c1608l2.m3118b() != e.IAB_TCF_PARAMETERS.ordinal()) {
                if (c1608l2.m3117a() == c.CONFIGURED_NETWORKS.ordinal()) {
                    AbstractC1525d.m2246a(AbstractActivityC1513b7.this, MaxDebuggerCmpNetworksListActivity.class, this.f1199b.m4826e(), new C15434b());
                    return;
                } else {
                    AbstractC1701q7.m4057a(c1775t2.m5214c(), c1775t2.m5213b(), AbstractActivityC1513b7.this);
                    return;
                }
            }
            if (c1608l2.m3117a() == d.TC_STRING.ordinal()) {
                strM2109a = C1511b5.f1184x.m2109a();
                strM2227c = this.f1198a.m2234j();
            } else {
                strM2109a = C1511b5.f1185y.m2109a();
                strM2227c = this.f1198a.m2227c();
            }
            AbstractC1525d.m2246a(AbstractActivityC1513b7.this, MaxDebuggerTcfStringActivity.class, this.f1199b.m4826e(), new a(strM2109a, strM2227c));
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.b7$c */
    private enum c {
        CMP_SDK_ID,
        CMP_SDK_VERSION,
        INSTRUCTIONS,
        CONFIGURED_NETWORKS
    }

    /* JADX INFO: renamed from: com.applovin.impl.b7$d */
    private enum d {
        GDPR_APPLIES,
        TC_STRING,
        AC_STRING
    }

    /* JADX INFO: renamed from: com.applovin.impl.b7$e */
    private enum e {
        IAB_TCF_PARAMETERS,
        CMP_CONFIGURATION
    }

    /* JADX INFO: renamed from: a */
    private C1775t2 m2111a(String str, Integer num) {
        return C1775t2.m5211a(C1775t2.c.RIGHT_DETAIL).m5234d(str).m5232c(num != null ? num.toString() : "No value set").m5231c(num != null ? ViewCompat.MEASURED_STATE_MASK : SupportMenu.CATEGORY_MASK).m5226a();
    }

    /* JADX INFO: renamed from: a */
    private C1775t2 m2112a(String str, String str2, boolean z) {
        boolean zIsValidString = StringUtils.isValidString(str2);
        if (zIsValidString && str2.length() > 35) {
            str2 = str2.substring(0, 35) + "...";
        }
        C1775t2.b bVarM5234d = C1775t2.m5211a(C1775t2.c.DETAIL).m5234d(str);
        if (!zIsValidString) {
            str2 = "No value set";
        }
        C1775t2.b bVarM5225a = bVarM5234d.m5232c(str2).m5231c(z ? SupportMenu.CATEGORY_MASK : ViewCompat.MEASURED_STATE_MASK).m5225a(zIsValidString);
        if (zIsValidString) {
            bVarM5225a.m5222a(this);
        }
        return bVarM5225a.m5226a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public List m2113a() {
        String str;
        ArrayList arrayList = new ArrayList(c.values().length);
        int size = this.f1194e.size() + this.f1195f.size();
        arrayList.add(m2117b());
        arrayList.add(m2111a(C1511b5.f1182v.m2109a(), this.f1190a.m4855t0().m2231f()));
        arrayList.add(C1775t2.m5211a(C1775t2.c.DETAIL).m5234d("To check which networks are missing from your CMP, first make sure that you have granted consent to all networks through your CMP flow. Then add the following networks to your CMP network list.").m5226a());
        C1775t2.b bVarM5234d = C1775t2.m5211a(C1775t2.c.RIGHT_DETAIL).m5234d("Configured CMP Networks");
        if (size > 0) {
            str = "Missing " + size + " network(s)";
        } else {
            str = "";
        }
        arrayList.add(bVarM5234d.m5232c(str).m5231c(size > 0 ? SupportMenu.CATEGORY_MASK : ViewCompat.MEASURED_STATE_MASK).m5222a(this).m5225a(true).m5226a());
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private void m2115a(C1533d7 c1533d7, List list) {
        if (c1533d7.m2423d() != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (c1533d7.m2423d().equals(((C1533d7) it.next()).m2423d())) {
                    return;
                }
            }
        }
        list.add(c1533d7);
    }

    /* JADX INFO: renamed from: a */
    private void m2116a(List list) {
        boolean zM2225b = this.f1190a.m4855t0().m2225b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1533d7 c1533d7 = (C1533d7) it.next();
            if (c1533d7.m2425f() == C1533d7.a.TCF_VENDOR) {
                if (Boolean.TRUE.equals(c1533d7.m2419a())) {
                    m2115a(c1533d7, this.f1192c);
                } else {
                    m2115a(c1533d7, this.f1194e);
                }
            } else if (c1533d7.m2425f() != C1533d7.a.ATP_NETWORK) {
                this.f1196g.add(c1533d7);
            } else if (!zM2225b) {
                this.f1196g.add(c1533d7);
            } else if (Boolean.TRUE.equals(c1533d7.m2419a())) {
                m2115a(c1533d7, this.f1193d);
            } else {
                m2115a(c1533d7, this.f1195f);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private C1775t2 m2117b() {
        C1775t2.b bVarM5225a;
        String strM2109a = C1511b5.f1181u.m2109a();
        Integer numM2230e = this.f1190a.m4855t0().m2230e();
        if (StringUtils.isValidString(this.f1190a.m4855t0().m2229d())) {
            bVarM5225a = C1775t2.m5211a(C1775t2.c.RIGHT_DETAIL);
        } else {
            C1775t2.b bVarM5229b = C1775t2.m5211a(C1775t2.c.DETAIL).m5229b("Unknown CMP SDK ID");
            bVarM5225a = bVarM5229b.m5224a("Your integrated CMP might not be Google-certified. " + ("SharedPreferences value for key " + strM2109a + " is " + numM2230e + ".") + "\n\nIf you use Google AdMob or Google Ad Manager, make sure that the integrated CMP is included in the list of Google-certified CMPs at: https://support.google.com/admob/answer/13554116").m5221a(C1846R.drawable.applovin_ic_warning).m5227b(getColor(C1846R.color.applovin_sdk_warningColor)).m5225a(true);
        }
        bVarM5225a.m5234d(strM2109a);
        bVarM5225a.m5232c(numM2230e != null ? numM2230e.toString() : "No value set");
        bVarM5225a.m5231c(numM2230e != null ? ViewCompat.MEASURED_STATE_MASK : SupportMenu.CATEGORY_MASK);
        return bVarM5225a.m5226a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public List m2119c() {
        ArrayList arrayList = new ArrayList(d.values().length);
        Integer numM2232g = this.f1190a.m4855t0().m2232g();
        String strM2234j = this.f1190a.m4855t0().m2234j();
        String strM2227c = this.f1190a.m4855t0().m2227c();
        arrayList.add(m2111a(C1511b5.f1183w.m2109a(), numM2232g));
        arrayList.add(m2112a(C1511b5.f1184x.m2109a(), strM2234j, !AbstractC1553f7.m2622b(strM2234j)));
        arrayList.add(m2112a(C1511b5.f1185y.m2109a(), strM2227c, false));
        return arrayList;
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3
    protected C1748l getSdk() {
        return this.f1190a;
    }

    public void initialize(List<C1533d7> list, C1748l c1748l) {
        this.f1190a = c1748l;
        SharedPreferencesOnSharedPreferenceChangeListenerC1523c7 sharedPreferencesOnSharedPreferenceChangeListenerC1523c7M4855t0 = c1748l.m4855t0();
        m2116a(list);
        a aVar = new a(this);
        this.f1191b = aVar;
        aVar.m5278a(new b(sharedPreferencesOnSharedPreferenceChangeListenerC1523c7M4855t0, c1748l));
        this.f1191b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1846R.layout.mediation_debugger_list_view);
        setTitle("CMP (Consent Management Platform)");
        ((ListView) findViewById(C1846R.id.listView)).setAdapter((ListAdapter) this.f1191b);
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        AbstractViewOnClickListenerC1784u2 abstractViewOnClickListenerC1784u2 = this.f1191b;
        if (abstractViewOnClickListenerC1784u2 != null) {
            abstractViewOnClickListenerC1784u2.m5278a((AbstractViewOnClickListenerC1784u2.a) null);
        }
    }
}

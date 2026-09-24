package com.applovin.impl;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.webkit.internal.AssetHelper;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitsListActivity;
import com.applovin.mediation.MaxDebuggerAxonEventsListActivity;
import com.applovin.mediation.MaxDebuggerDetailActivity;
import com.applovin.mediation.MaxDebuggerTcfConsentStatusesListActivity;
import com.applovin.mediation.MaxDebuggerTcfInfoListActivity;
import com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity;
import com.applovin.mediation.MaxDebuggerTestModeNetworkActivity;
import com.applovin.mediation.MaxDebuggerUnifiedFlowActivity;
import com.applovin.sdk.C1846R;

/* JADX INFO: renamed from: com.applovin.impl.o3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractActivityC1670o3 extends AbstractActivityC1680p3 {

    /* JADX INFO: renamed from: a */
    private C1697q3 f2445a;

    /* JADX INFO: renamed from: b */
    private DataSetObserver f2446b;

    /* JADX INFO: renamed from: c */
    private FrameLayout f2447c;

    /* JADX INFO: renamed from: d */
    private ListView f2448d;

    /* JADX INFO: renamed from: e */
    private C1478a f2449e;

    /* JADX INFO: renamed from: com.applovin.impl.o3$a */
    class a extends DataSetObserver {
        a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractActivityC1670o3.this.m3721a();
            AbstractActivityC1670o3 abstractActivityC1670o3 = AbstractActivityC1670o3.this;
            abstractActivityC1670o3.m3727b((Context) abstractActivityC1670o3);
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.o3$b */
    class b implements AbstractViewOnClickListenerC1784u2.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C1515c f2451a;

        /* JADX INFO: renamed from: com.applovin.impl.o3$b$a */
        class a implements AbstractC1525d.b {
            a() {
            }

            @Override // com.applovin.impl.AbstractC1525d.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void mo2130a(MaxDebuggerUnifiedFlowActivity maxDebuggerUnifiedFlowActivity) {
                maxDebuggerUnifiedFlowActivity.initialize(AbstractActivityC1670o3.this.f2445a.m4000u());
            }
        }

        /* JADX INFO: renamed from: com.applovin.impl.o3$b$b, reason: collision with other inner class name */
        class C15439b implements AbstractC1525d.b {
            C15439b() {
            }

            @Override // com.applovin.impl.AbstractC1525d.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void mo2130a(MaxDebuggerTcfInfoListActivity maxDebuggerTcfInfoListActivity) {
                maxDebuggerTcfInfoListActivity.initialize(AbstractActivityC1670o3.this.f2445a.m3993d(), AbstractActivityC1670o3.this.f2445a.m4000u());
            }
        }

        /* JADX INFO: renamed from: com.applovin.impl.o3$b$c */
        class c implements AbstractC1525d.b {
            c() {
            }

            @Override // com.applovin.impl.AbstractC1525d.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void mo2130a(MaxDebuggerTcfConsentStatusesListActivity maxDebuggerTcfConsentStatusesListActivity) {
                maxDebuggerTcfConsentStatusesListActivity.initialize(AbstractActivityC1670o3.this.f2445a.m3993d(), AbstractActivityC1670o3.this.f2445a.m4000u());
            }
        }

        /* JADX INFO: renamed from: com.applovin.impl.o3$b$d */
        class d implements AbstractC1525d.b {
            d() {
            }

            @Override // com.applovin.impl.AbstractC1525d.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void mo2130a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(AbstractActivityC1670o3.this.f2445a.m3994f(), false, AbstractActivityC1670o3.this.f2445a.m4000u());
            }
        }

        /* JADX INFO: renamed from: com.applovin.impl.o3$b$e */
        class e implements AbstractC1525d.b {
            e() {
            }

            @Override // com.applovin.impl.AbstractC1525d.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void mo2130a(MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                maxDebuggerTestLiveNetworkActivity.initialize(AbstractActivityC1670o3.this.f2445a.m3997k(), AbstractActivityC1670o3.this.f2445a.m4002x(), AbstractActivityC1670o3.this.f2445a.m4000u());
            }
        }

        /* JADX INFO: renamed from: com.applovin.impl.o3$b$f */
        class f implements AbstractC1525d.b {
            f() {
            }

            @Override // com.applovin.impl.AbstractC1525d.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void mo2130a(MaxDebuggerTestModeNetworkActivity maxDebuggerTestModeNetworkActivity) {
                maxDebuggerTestModeNetworkActivity.initialize(AbstractActivityC1670o3.this.f2445a.m4001w(), AbstractActivityC1670o3.this.f2445a.m4000u());
            }
        }

        /* JADX INFO: renamed from: com.applovin.impl.o3$b$g */
        /* JADX INFO: loaded from: classes9.dex */
        class g implements AbstractC1525d.b {
            g() {
            }

            @Override // com.applovin.impl.AbstractC1525d.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void mo2130a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(AbstractActivityC1670o3.this.f2445a.m3998p(), true, AbstractActivityC1670o3.this.f2445a.m4000u());
            }
        }

        /* JADX INFO: renamed from: com.applovin.impl.o3$b$h */
        class h implements AbstractC1525d.b {
            h() {
            }

            @Override // com.applovin.impl.AbstractC1525d.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void mo2130a(AbstractActivityC1556g0 abstractActivityC1556g0) {
                abstractActivityC1556g0.initialize(AbstractActivityC1670o3.this.f2445a.m4000u().m4768G().getTrackedAxonEvents(), AbstractActivityC1670o3.this.f2445a.m4000u());
            }
        }

        /* JADX INFO: renamed from: com.applovin.impl.o3$b$i */
        class i implements AbstractC1525d.b {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C1775t2 f2461a;

            i(C1775t2 c1775t2) {
                this.f2461a = c1775t2;
            }

            @Override // com.applovin.impl.AbstractC1525d.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void mo2130a(MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                maxDebuggerDetailActivity.initialize(((C1510b4) this.f2461a).m2108r());
            }
        }

        b(C1515c c1515c) {
            this.f2451a = c1515c;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2.a
        /* JADX INFO: renamed from: a */
        public void mo2129a(C1608l2 c1608l2, C1775t2 c1775t2) {
            int iM3118b = c1608l2.m3118b();
            if (iM3118b == C1697q3.e.APP_INFO.ordinal()) {
                AbstractC1701q7.m4057a(c1775t2.m5214c(), c1775t2.m5213b(), AbstractActivityC1670o3.this);
                return;
            }
            if (iM3118b == C1697q3.e.MAX.ordinal()) {
                if (AbstractActivityC1670o3.this.f2445a.m3991a(c1775t2)) {
                    AbstractC1525d.m2246a(AbstractActivityC1670o3.this, MaxDebuggerUnifiedFlowActivity.class, this.f2451a, new a());
                    return;
                } else {
                    AbstractC1701q7.m4057a(c1775t2.m5214c(), c1775t2.m5213b(), AbstractActivityC1670o3.this);
                    return;
                }
            }
            if (iM3118b == C1697q3.e.PRIVACY.ordinal()) {
                if (c1608l2.m3117a() != C1697q3.d.CMP.ordinal()) {
                    if (c1608l2.m3117a() == C1697q3.d.NETWORK_CONSENT_STATUSES.ordinal()) {
                        AbstractC1525d.m2246a(AbstractActivityC1670o3.this, MaxDebuggerTcfConsentStatusesListActivity.class, this.f2451a, new c());
                        return;
                    }
                    return;
                } else if (StringUtils.isValidString(AbstractActivityC1670o3.this.f2445a.m4000u().m4855t0().m2234j())) {
                    AbstractC1525d.m2246a(AbstractActivityC1670o3.this, MaxDebuggerTcfInfoListActivity.class, this.f2451a, new C15439b());
                    return;
                } else {
                    AbstractC1701q7.m4057a(c1775t2.m5214c(), c1775t2.m5213b(), AbstractActivityC1670o3.this);
                    return;
                }
            }
            if (iM3118b != C1697q3.e.ADS.ordinal()) {
                if (iM3118b == C1697q3.e.EVENTS.ordinal()) {
                    AbstractC1525d.m2246a(AbstractActivityC1670o3.this, MaxDebuggerAxonEventsListActivity.class, this.f2451a, new h());
                    return;
                } else {
                    if ((iM3118b == C1697q3.e.INCOMPLETE_NETWORKS.ordinal() || iM3118b == C1697q3.e.COMPLETED_NETWORKS.ordinal()) && (c1775t2 instanceof C1510b4)) {
                        AbstractC1525d.m2246a(AbstractActivityC1670o3.this, MaxDebuggerDetailActivity.class, this.f2451a, new i(c1775t2));
                        return;
                    }
                    return;
                }
            }
            if (c1608l2.m3117a() == C1697q3.b.AD_UNITS.ordinal()) {
                if (AbstractActivityC1670o3.this.f2445a.m3994f().size() > 0) {
                    AbstractC1525d.m2246a(AbstractActivityC1670o3.this, MaxDebuggerAdUnitsListActivity.class, this.f2451a, new d());
                    return;
                } else {
                    AbstractC1701q7.m4057a("No live ad units", "Please setup or enable your MAX ad units on https://applovin.com.", AbstractActivityC1670o3.this);
                    return;
                }
            }
            if (c1608l2.m3117a() == C1697q3.b.SELECT_LIVE_NETWORKS.ordinal()) {
                if (AbstractActivityC1670o3.this.f2445a.m3997k().size() <= 0 && AbstractActivityC1670o3.this.f2445a.m4002x().size() <= 0) {
                    AbstractC1701q7.m4057a("Complete Integrations", "Please complete integrations in order to access this.", AbstractActivityC1670o3.this);
                    return;
                } else if (AbstractActivityC1670o3.this.f2445a.m4000u().m4857u0().m2928c()) {
                    AbstractC1701q7.m4057a("Restart Required", c1775t2.m5213b(), AbstractActivityC1670o3.this);
                    return;
                } else {
                    AbstractC1525d.m2246a(AbstractActivityC1670o3.this, MaxDebuggerTestLiveNetworkActivity.class, this.f2451a, new e());
                    return;
                }
            }
            if (c1608l2.m3117a() != C1697q3.b.SELECT_TEST_MODE_NETWORKS.ordinal()) {
                if (c1608l2.m3117a() == C1697q3.b.INITIALIZATION_AD_UNITS.ordinal()) {
                    AbstractC1525d.m2246a(AbstractActivityC1670o3.this, MaxDebuggerAdUnitsListActivity.class, this.f2451a, new g());
                }
            } else if (!AbstractActivityC1670o3.this.f2445a.m4000u().m4857u0().m2928c()) {
                AbstractActivityC1670o3.this.getSdk().m4857u0().m2923a();
                AbstractC1701q7.m4057a("Restart Required", c1775t2.m5213b(), AbstractActivityC1670o3.this);
            } else if (AbstractActivityC1670o3.this.f2445a.m4001w().size() > 0) {
                AbstractC1525d.m2246a(AbstractActivityC1670o3.this, MaxDebuggerTestModeNetworkActivity.class, this.f2451a, new f());
            } else {
                AbstractC1701q7.m4057a("Complete Integrations", "Please complete integrations in order to access this.", AbstractActivityC1670o3.this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m3721a() {
        C1478a c1478a = this.f2449e;
        if (c1478a != null) {
            c1478a.m1759b();
            this.f2447c.removeView(this.f2449e);
            this.f2449e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3722a(Context context) {
        AbstractC1701q7.m4057a(this.f2445a.m3996i(), this.f2445a.m3995h(), context);
    }

    /* JADX INFO: renamed from: b */
    private void m3726b() {
        C1697q3 c1697q3 = this.f2445a;
        if (c1697q3 == null) {
            return;
        }
        String strM3999q = c1697q3.m3999q();
        if (TextUtils.isEmpty(strM3999q)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.TEXT", strM3999q);
        intent.putExtra("android.intent.extra.TITLE", "Mediation Debugger logs");
        intent.putExtra("android.intent.extra.SUBJECT", "MAX Mediation Debugger logs");
        startActivity(Intent.createChooser(intent, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m3727b(final Context context) {
        if (!StringUtils.isValidString(this.f2445a.m3995h()) || this.f2445a.m4003y()) {
            return;
        }
        this.f2445a.m3992b(true);
        runOnUiThread(new Runnable() { // from class: com.applovin.impl.o3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3722a(context);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    private void m3728c() {
        m3721a();
        C1478a c1478a = new C1478a(this, 50, R.attr.progressBarStyleLarge);
        this.f2449e = c1478a;
        c1478a.setColor(-3355444);
        this.f2447c.addView(this.f2449e, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f2447c.bringChildToFront(this.f2449e);
        this.f2449e.m1758a();
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3
    protected C1748l getSdk() {
        C1697q3 c1697q3 = this.f2445a;
        if (c1697q3 != null) {
            return c1697q3.m4000u();
        }
        return null;
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(C1846R.layout.mediation_debugger_list_view);
        this.f2447c = (FrameLayout) findViewById(R.id.content);
        ListView listView = (ListView) findViewById(C1846R.id.listView);
        this.f2448d = listView;
        listView.setAdapter((ListAdapter) this.f2445a);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1846R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        C1697q3 c1697q3 = this.f2445a;
        if (c1697q3 != null) {
            c1697q3.unregisterDataSetObserver(this.f2446b);
            this.f2445a.m5278a((AbstractViewOnClickListenerC1784u2.a) null);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C1846R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        m3726b();
        return true;
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        C1697q3 c1697q3 = this.f2445a;
        if (c1697q3 == null || !c1697q3.m4004z()) {
            return;
        }
        this.f2445a.m5280c();
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        C1697q3 c1697q3 = this.f2445a;
        if (c1697q3 == null || c1697q3.m4004z()) {
            return;
        }
        m3728c();
    }

    public void setListAdapter(C1697q3 c1697q3, C1515c c1515c) {
        DataSetObserver dataSetObserver;
        C1697q3 c1697q4 = this.f2445a;
        if (c1697q4 != null && (dataSetObserver = this.f2446b) != null) {
            c1697q4.unregisterDataSetObserver(dataSetObserver);
        }
        this.f2445a = c1697q3;
        this.f2446b = new a();
        m3727b((Context) this);
        this.f2445a.registerDataSetObserver(this.f2446b);
        this.f2445a.m5278a(new b(c1515c));
    }
}

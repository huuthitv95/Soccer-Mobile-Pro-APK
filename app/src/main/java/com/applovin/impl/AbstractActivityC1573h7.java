package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.C1846R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.h7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractActivityC1573h7 extends AbstractActivityC1680p3 {

    /* JADX INFO: renamed from: a */
    private C1748l f1778a;

    /* JADX INFO: renamed from: b */
    private List f1779b;

    /* JADX INFO: renamed from: c */
    private AbstractViewOnClickListenerC1784u2 f1780c;

    /* JADX INFO: renamed from: d */
    private List f1781d;

    /* JADX INFO: renamed from: e */
    private ListView f1782e;

    /* JADX INFO: renamed from: com.applovin.impl.h7$a */
    class a extends AbstractViewOnClickListenerC1784u2 {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ List f1783e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, List list) {
            super(context);
            this.f1783e = list;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: a */
        protected C1775t2 mo2747a() {
            return new C1775t2.b(C1775t2.c.SECTION_CENTERED).m5234d("Select a network to load test ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").m5226a();
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: b */
        protected int mo2125b() {
            return 1;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: c */
        protected List mo2126c(int i) {
            return AbstractActivityC1573h7.this.f1781d;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: d */
        protected int mo2127d(int i) {
            return this.f1783e.size();
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: e */
        protected C1775t2 mo2128e(int i) {
            return new C1813x4("TEST MODE NETWORKS");
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.h7$b */
    class b implements AbstractViewOnClickListenerC1784u2.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ List f1785a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C1748l f1786b;

        b(List list, C1748l c1748l) {
            this.f1785a = list;
            this.f1786b = c1748l;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2.a
        /* JADX INFO: renamed from: a */
        public void mo2129a(C1608l2 c1608l2, C1775t2 c1775t2) {
            List listM2718u = ((C1559g3) this.f1785a.get(c1608l2.m3117a())).m2718u();
            if (listM2718u.equals(this.f1786b.m4857u0().m2927b())) {
                this.f1786b.m4857u0().m2925a((List) null);
            } else {
                this.f1786b.m4857u0().m2925a(listM2718u);
            }
            AbstractActivityC1573h7.this.f1780c.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.h7$c */
    class c extends C1510b4 {

        /* JADX INFO: renamed from: p */
        final /* synthetic */ C1559g3 f1788p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C1559g3 c1559g3, Context context, C1559g3 c1559g4) {
            super(c1559g3, context);
            this.f1788p = c1559g4;
        }

        @Override // com.applovin.impl.C1510b4, com.applovin.impl.C1775t2
        /* JADX INFO: renamed from: d */
        public int mo2104d() {
            if (this.f1788p.m2718u().equals(AbstractActivityC1573h7.this.f1778a.m4857u0().m2927b())) {
                return C1846R.drawable.applovin_ic_check_mark_borderless;
            }
            return 0;
        }

        @Override // com.applovin.impl.C1510b4, com.applovin.impl.C1775t2
        /* JADX INFO: renamed from: e */
        public int mo2105e() {
            if (this.f1788p.m2718u().equals(AbstractActivityC1573h7.this.f1778a.m4857u0().m2927b())) {
                return -16776961;
            }
            return super.mo2105e();
        }

        @Override // com.applovin.impl.C1775t2
        /* JADX INFO: renamed from: k */
        public SpannedString mo2748k() {
            return StringUtils.createSpannedString(this.f1788p.m2704g(), mo2107o() ? ViewCompat.MEASURED_STATE_MASK : -7829368, 18, 1);
        }
    }

    public AbstractActivityC1573h7() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    /* JADX INFO: renamed from: a */
    private List m2845a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1559g3 c1559g3 = (C1559g3) it.next();
            arrayList.add(new c(c1559g3, this, c1559g3));
        }
        return arrayList;
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3
    protected C1748l getSdk() {
        return this.f1778a;
    }

    public void initialize(List<C1559g3> list, C1748l c1748l) {
        this.f1778a = c1748l;
        this.f1779b = list;
        this.f1781d = m2845a(list);
        a aVar = new a(this, list);
        this.f1780c = aVar;
        aVar.m5278a(new b(list, c1748l));
        this.f1780c.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Test Mode Network");
        setContentView(C1846R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(C1846R.id.listView);
        this.f1782e = listView;
        listView.setAdapter((ListAdapter) this.f1780c);
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f1781d = m2845a(this.f1779b);
        this.f1780c.notifyDataSetChanged();
    }
}

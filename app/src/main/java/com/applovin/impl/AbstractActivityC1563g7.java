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

/* JADX INFO: renamed from: com.applovin.impl.g7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractActivityC1563g7 extends AbstractActivityC1680p3 {

    /* JADX INFO: renamed from: a */
    private C1748l f1722a;

    /* JADX INFO: renamed from: b */
    private List f1723b;

    /* JADX INFO: renamed from: c */
    private List f1724c;

    /* JADX INFO: renamed from: d */
    private AbstractViewOnClickListenerC1784u2 f1725d;

    /* JADX INFO: renamed from: e */
    private List f1726e;

    /* JADX INFO: renamed from: f */
    private List f1727f;

    /* JADX INFO: renamed from: g */
    private ListView f1728g;

    /* JADX INFO: renamed from: com.applovin.impl.g7$a */
    class a extends AbstractViewOnClickListenerC1784u2 {
        a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: a */
        protected C1775t2 mo2747a() {
            return new C1775t2.b(C1775t2.c.SECTION_CENTERED).m5234d("Select a network to load ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").m5226a();
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: b */
        protected int mo2125b() {
            return c.COUNT.ordinal();
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: c */
        protected List mo2126c(int i) {
            return i == c.BIDDERS.ordinal() ? AbstractActivityC1563g7.this.f1726e : AbstractActivityC1563g7.this.f1727f;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: d */
        protected int mo2127d(int i) {
            return i == c.BIDDERS.ordinal() ? AbstractActivityC1563g7.this.f1726e.size() : AbstractActivityC1563g7.this.f1727f.size();
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: e */
        protected C1775t2 mo2128e(int i) {
            return i == c.BIDDERS.ordinal() ? new C1813x4("BIDDERS") : new C1813x4("WATERFALL");
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.g7$b */
    class b extends C1510b4 {

        /* JADX INFO: renamed from: p */
        final /* synthetic */ C1802w2 f1730p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C1559g3 c1559g3, Context context, C1802w2 c1802w2) {
            super(c1559g3, context);
            this.f1730p = c1802w2;
        }

        @Override // com.applovin.impl.C1510b4, com.applovin.impl.C1775t2
        /* JADX INFO: renamed from: d */
        public int mo2104d() {
            if (AbstractActivityC1563g7.this.f1722a.m4857u0().m2927b() == null || !AbstractActivityC1563g7.this.f1722a.m4857u0().m2927b().equals(this.f1730p.m5505b())) {
                return 0;
            }
            return C1846R.drawable.applovin_ic_check_mark_borderless;
        }

        @Override // com.applovin.impl.C1510b4, com.applovin.impl.C1775t2
        /* JADX INFO: renamed from: e */
        public int mo2105e() {
            if (AbstractActivityC1563g7.this.f1722a.m4857u0().m2927b() == null || !AbstractActivityC1563g7.this.f1722a.m4857u0().m2927b().equals(this.f1730p.m5505b())) {
                return super.mo2105e();
            }
            return -16776961;
        }

        @Override // com.applovin.impl.C1775t2
        /* JADX INFO: renamed from: k */
        public SpannedString mo2748k() {
            return StringUtils.createSpannedString(this.f1730p.m5504a(), mo2107o() ? ViewCompat.MEASURED_STATE_MASK : -7829368, 18, 1);
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.g7$c */
    enum c {
        BIDDERS,
        WATERFALL,
        COUNT
    }

    public AbstractActivityC1563g7() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    /* JADX INFO: renamed from: a */
    private C1802w2 m2741a(C1608l2 c1608l2) {
        return c1608l2.m3118b() == c.BIDDERS.ordinal() ? (C1802w2) this.f1723b.get(c1608l2.m3117a()) : (C1802w2) this.f1724c.get(c1608l2.m3117a());
    }

    /* JADX INFO: renamed from: a */
    private List m2743a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1802w2 c1802w2 = (C1802w2) it.next();
            arrayList.add(new b(c1802w2.m5507d(), this, c1802w2));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m2744a(C1748l c1748l, C1608l2 c1608l2, C1775t2 c1775t2) {
        List listM5505b = m2741a(c1608l2).m5505b();
        if (listM5505b.equals(c1748l.m4857u0().m2927b())) {
            c1748l.m4857u0().m2925a((List) null);
        } else {
            c1748l.m4857u0().m2925a(listM5505b);
        }
        this.f1725d.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3
    protected C1748l getSdk() {
        return this.f1722a;
    }

    public void initialize(List<C1802w2> list, List<C1802w2> list2, final C1748l c1748l) {
        this.f1722a = c1748l;
        this.f1723b = list;
        this.f1724c = list2;
        this.f1726e = m2743a(list);
        this.f1727f = m2743a(list2);
        a aVar = new a(this);
        this.f1725d = aVar;
        aVar.m5278a(new AbstractViewOnClickListenerC1784u2.a() { // from class: com.applovin.impl.g7$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2.a
            /* JADX INFO: renamed from: a */
            public final void mo2129a(C1608l2 c1608l2, C1775t2 c1775t2) {
                this.f$0.m2744a(c1748l, c1608l2, c1775t2);
            }
        });
        this.f1725d.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Live Network");
        setContentView(C1846R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(C1846R.id.listView);
        this.f1728g = listView;
        listView.setAdapter((ListAdapter) this.f1725d);
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f1726e = m2743a(this.f1723b);
        this.f1727f = m2743a(this.f1724c);
        this.f1725d.m5280c();
    }
}

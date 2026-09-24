package com.applovin.impl;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.sdk.C1748l;
import com.applovin.mediation.MaxDebuggerMultiAdActivity;
import com.applovin.sdk.C1846R;

/* JADX INFO: renamed from: com.applovin.impl.h3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractActivityC1569h3 extends AbstractActivityC1680p3 {

    /* JADX INFO: renamed from: a */
    private C1579i3 f1747a;

    /* JADX INFO: renamed from: b */
    private ListView f1748b;

    /* JADX INFO: renamed from: com.applovin.impl.h3$a */
    class a implements AbstractViewOnClickListenerC1784u2.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C1559g3 f1749a;

        /* JADX INFO: renamed from: com.applovin.impl.h3$a$a, reason: collision with other inner class name */
        class C15437a implements AbstractC1525d.b {
            C15437a() {
            }

            @Override // com.applovin.impl.AbstractC1525d.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void mo2130a(MaxDebuggerMultiAdActivity maxDebuggerMultiAdActivity) {
                maxDebuggerMultiAdActivity.initialize(a.this.f1749a);
            }
        }

        a(C1559g3 c1559g3) {
            this.f1749a = c1559g3;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2.a
        /* JADX INFO: renamed from: a */
        public void mo2129a(C1608l2 c1608l2, C1775t2 c1775t2) {
            if (c1608l2.m3118b() != C1579i3.a.TEST_ADS.ordinal()) {
                AbstractC1701q7.m4057a(c1775t2.m5214c(), c1775t2.m5213b(), AbstractActivityC1569h3.this);
                return;
            }
            C1748l c1748lM2712o = this.f1749a.m2712o();
            C1559g3.b bVarM2722y = this.f1749a.m2722y();
            if (!AbstractActivityC1569h3.this.f1747a.m2875a(c1608l2)) {
                AbstractC1701q7.m4057a(c1775t2.m5214c(), c1775t2.m5213b(), AbstractActivityC1569h3.this);
                return;
            }
            if (C1559g3.b.READY == bVarM2722y) {
                AbstractC1525d.m2246a(AbstractActivityC1569h3.this, MaxDebuggerMultiAdActivity.class, c1748lM2712o.m4826e(), new C15437a());
            } else if (C1559g3.b.DISABLED != bVarM2722y) {
                AbstractC1701q7.m4057a(c1775t2.m5214c(), c1775t2.m5213b(), AbstractActivityC1569h3.this);
            } else {
                c1748lM2712o.m4857u0().m2923a();
                AbstractC1701q7.m4057a(c1775t2.m5214c(), c1775t2.m5213b(), AbstractActivityC1569h3.this);
            }
        }
    }

    public AbstractActivityC1569h3() {
        this.communicatorTopics.add("adapter_initialization_status");
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3
    protected C1748l getSdk() {
        C1579i3 c1579i3 = this.f1747a;
        if (c1579i3 != null) {
            return c1579i3.m2876h().m2712o();
        }
        return null;
    }

    public void initialize(C1559g3 c1559g3) {
        setTitle(c1559g3.m2704g());
        C1579i3 c1579i3 = new C1579i3(c1559g3, this);
        this.f1747a = c1579i3;
        c1579i3.m5278a(new a(c1559g3));
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1846R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(C1846R.id.listView);
        this.f1748b = listView;
        listView.setAdapter((ListAdapter) this.f1747a);
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (this.f1747a.m2876h().m2699b().equals(appLovinCommunicatorMessage.getMessageData().getString("adapter_class", ""))) {
            this.f1747a.m2877k();
            this.f1747a.m5280c();
        }
    }
}

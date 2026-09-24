package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.sdk.C1748l;
import com.applovin.sdk.C1846R;

/* JADX INFO: renamed from: com.applovin.impl.d1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractActivityC1527d1 extends Activity {

    /* JADX INFO: renamed from: a */
    private C1537e1 f1323a;

    /* JADX INFO: renamed from: b */
    private FrameLayout f1324b;

    /* JADX INFO: renamed from: c */
    private ListView f1325c;

    /* JADX INFO: renamed from: com.applovin.impl.d1$a */
    class a implements AbstractViewOnClickListenerC1784u2.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C1515c f1326a;

        /* JADX INFO: renamed from: com.applovin.impl.d1$a$a, reason: collision with other inner class name */
        class C15435a implements AbstractC1525d.b {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C1608l2 f1328a;

            C15435a(C1608l2 c1608l2) {
                this.f1328a = c1608l2;
            }

            @Override // com.applovin.impl.AbstractC1525d.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void mo2130a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
                maxCreativeDebuggerDisplayedAdActivity.m3836a((C1705r1) AbstractActivityC1527d1.this.f1323a.m2456d().get(this.f1328a.m3117a()), AbstractActivityC1527d1.this.f1323a.m2457e());
            }
        }

        a(C1515c c1515c) {
            this.f1326a = c1515c;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2.a
        /* JADX INFO: renamed from: a */
        public void mo2129a(C1608l2 c1608l2, C1775t2 c1775t2) {
            if (c1608l2.m3118b() != C1537e1.a.RECENT_ADS.ordinal()) {
                return;
            }
            AbstractC1525d.m2246a(AbstractActivityC1527d1.this, MaxCreativeDebuggerDisplayedAdActivity.class, this.f1326a, new C15435a(c1608l2));
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2342a(int i) {
        TextView textView = new TextView(this);
        textView.setGravity(17);
        textView.setTextSize(18.0f);
        textView.setText(i);
        this.f1324b.addView(textView, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f1324b.bringChildToFront(textView);
    }

    /* JADX INFO: renamed from: a */
    public void m2343a(C1537e1 c1537e1, C1515c c1515c) {
        this.f1323a = c1537e1;
        c1537e1.m5278a(new a(c1515c));
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Creative Debugger");
        setContentView(C1846R.layout.mediation_debugger_list_view);
        this.f1324b = (FrameLayout) findViewById(R.id.content);
        this.f1325c = (ListView) findViewById(C1846R.id.listView);
        AbstractC1564g8.m2754a(this.f1324b, C1748l.f3003E0);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        C1537e1 c1537e1 = this.f1323a;
        if (c1537e1 != null) {
            c1537e1.m5278a((AbstractViewOnClickListenerC1784u2.a) null);
            this.f1323a.m2459g();
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        C1537e1 c1537e1 = this.f1323a;
        if (c1537e1 == null) {
            finish();
            return;
        }
        this.f1325c.setAdapter((ListAdapter) c1537e1);
        C1537e1 c1537e2 = this.f1323a;
        if (c1537e2 != null && !c1537e2.m2457e().m4866z().m2561g()) {
            m2342a(C1846R.string.applovin_creative_debugger_disabled_text);
            return;
        }
        C1537e1 c1537e3 = this.f1323a;
        if (c1537e3 == null || !c1537e3.m2458f()) {
            return;
        }
        m2342a(C1846R.string.applovin_creative_debugger_no_ads_text);
    }
}

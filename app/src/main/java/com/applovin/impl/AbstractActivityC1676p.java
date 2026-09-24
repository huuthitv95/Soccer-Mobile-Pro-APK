package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerWaterfallSegmentsActivity;
import com.applovin.sdk.C1846R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.p */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractActivityC1676p extends AbstractActivityC1680p3 {

    /* JADX INFO: renamed from: a */
    private C1656n f2486a;

    /* JADX INFO: renamed from: b */
    private C1748l f2487b;

    /* JADX INFO: renamed from: c */
    private AbstractViewOnClickListenerC1784u2 f2488c;

    /* JADX INFO: renamed from: com.applovin.impl.p$a */
    class a extends AbstractViewOnClickListenerC1784u2 {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ C1656n f2489e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, C1656n c1656n) {
            super(context);
            this.f2489e = c1656n;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: b */
        protected int mo2125b() {
            return this.f2489e.m3613g().size();
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: c */
        protected List mo2126c(int i) {
            ArrayList arrayList = new ArrayList();
            C1666o c1666o = (C1666o) this.f2489e.m3613g().get(i);
            arrayList.add(AbstractActivityC1676p.this.m3789c(c1666o.m3713c()));
            if (c1666o.m3712b() != null) {
                arrayList.add(AbstractActivityC1676p.this.m3781a("AB Test Experiment Name", c1666o.m3712b()));
            }
            C1624m8 c1624m8M3714d = c1666o.m3714d();
            AbstractActivityC1676p abstractActivityC1676p = AbstractActivityC1676p.this;
            arrayList.add(abstractActivityC1676p.m3781a("Device ID Targeting", abstractActivityC1676p.m3783a(c1624m8M3714d.m3241a())));
            AbstractActivityC1676p abstractActivityC1676p2 = AbstractActivityC1676p.this;
            arrayList.add(abstractActivityC1676p2.m3781a("Device Type Targeting", abstractActivityC1676p2.m3788b(c1624m8M3714d.m3242b())));
            if (c1624m8M3714d.m3243c() != null) {
                arrayList.add(AbstractActivityC1676p.this.m3782a(c1624m8M3714d.m3243c()));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: d */
        protected int mo2127d(int i) {
            C1666o c1666o = (C1666o) this.f2489e.m3613g().get(i);
            return (c1666o.m3712b() != null ? 1 : 0) + 3 + (c1666o.m3714d().m3243c() == null ? 0 : 1);
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: e */
        protected C1775t2 mo2128e(int i) {
            if (i == b.TARGETED_WATERFALL.ordinal()) {
                return new C1813x4("TARGETED WATERFALL FOR CURRENT DEVICE");
            }
            return i == b.OTHER_WATERFALLS.ordinal() ? new C1813x4("OTHER WATERFALLS") : new C1813x4("");
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.p$b */
    public enum b {
        TARGETED_WATERFALL,
        OTHER_WATERFALLS
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public C1775t2 m3781a(String str, String str2) {
        return C1775t2.m5211a(C1775t2.c.RIGHT_DETAIL).m5234d(str).m5232c(str2).m5226a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public C1775t2 m3782a(List list) {
        return C1775t2.m5211a(C1775t2.c.DETAIL).m5234d("Segment Targeting").m5223a(StringUtils.createSpannedString(list.size() + " segment group(s)", -7829368, 14)).m5222a(this).m5225a(true).m5226a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public String m3783a(String str) {
        if (str.equals("idfa")) {
            return "IDFA Only";
        }
        return str.equals("dnt") ? "No IDFA Only" : "All";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3784a(C1656n c1656n, C1608l2 c1608l2, C1748l c1748l, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(c1656n, (C1666o) c1656n.m3613g().get(c1608l2.m3118b()), null, c1748l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3785a(C1656n c1656n, C1608l2 c1608l2, C1748l c1748l, MaxDebuggerWaterfallSegmentsActivity maxDebuggerWaterfallSegmentsActivity) {
        C1666o c1666o = (C1666o) c1656n.m3613g().get(c1608l2.m3118b());
        maxDebuggerWaterfallSegmentsActivity.initialize(c1666o.m3713c(), c1666o.m3714d().m3243c(), c1748l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3786a(final C1748l c1748l, final C1656n c1656n, final C1608l2 c1608l2, C1775t2 c1775t2) {
        if (c1608l2.m3117a() == 0) {
            AbstractC1525d.m2246a(this, MaxDebuggerAdUnitDetailActivity.class, c1748l.m4826e(), new AbstractC1525d.b() { // from class: com.applovin.impl.p$$ExternalSyntheticLambda0
                @Override // com.applovin.impl.AbstractC1525d.b
                /* JADX INFO: renamed from: a */
                public final void mo2130a(Activity activity) {
                    AbstractActivityC1676p.m3784a(c1656n, c1608l2, c1748l, (MaxDebuggerAdUnitDetailActivity) activity);
                }
            });
        } else {
            AbstractC1525d.m2246a(this, MaxDebuggerWaterfallSegmentsActivity.class, c1748l.m4826e(), new AbstractC1525d.b() { // from class: com.applovin.impl.p$$ExternalSyntheticLambda1
                @Override // com.applovin.impl.AbstractC1525d.b
                /* JADX INFO: renamed from: a */
                public final void mo2130a(Activity activity) {
                    AbstractActivityC1676p.m3785a(c1656n, c1608l2, c1748l, (MaxDebuggerWaterfallSegmentsActivity) activity);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public String m3788b(String str) {
        if (str.equals("phone")) {
            return "Phones";
        }
        return str.equals("tablet") ? "Tablets" : "All";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public C1775t2 m3789c(String str) {
        return C1775t2.m5211a(C1775t2.c.RIGHT_DETAIL).m5228b(StringUtils.createSpannedString(str, ViewCompat.MEASURED_STATE_MASK, 18, 1)).m5222a(this).m5225a(true).m5226a();
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3
    protected C1748l getSdk() {
        return this.f2487b;
    }

    public void initialize(final C1656n c1656n, final C1748l c1748l) {
        this.f2486a = c1656n;
        this.f2487b = c1748l;
        a aVar = new a(this, c1656n);
        this.f2488c = aVar;
        aVar.m5278a(new AbstractViewOnClickListenerC1784u2.a() { // from class: com.applovin.impl.p$$ExternalSyntheticLambda2
            @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2.a
            /* JADX INFO: renamed from: a */
            public final void mo2129a(C1608l2 c1608l2, C1775t2 c1775t2) {
                this.f$0.m3786a(c1748l, c1656n, c1608l2, c1775t2);
            }
        });
        this.f2488c.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1846R.layout.mediation_debugger_list_view);
        setTitle(this.f2486a.m3610d());
        ListView listView = (ListView) findViewById(C1846R.id.listView);
        listView.setAdapter((ListAdapter) this.f2488c);
        listView.setDividerHeight(0);
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        AbstractViewOnClickListenerC1784u2 abstractViewOnClickListenerC1784u2 = this.f2488c;
        if (abstractViewOnClickListenerC1784u2 != null) {
            abstractViewOnClickListenerC1784u2.m5278a((AbstractViewOnClickListenerC1784u2.a) null);
        }
    }
}

package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerAdUnitWaterfallsListActivity;
import com.applovin.sdk.C1846R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.q */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractActivityC1693q extends AbstractActivityC1680p3 {

    /* JADX INFO: renamed from: a */
    private C1748l f2581a;

    /* JADX INFO: renamed from: b */
    private AbstractViewOnClickListenerC1784u2 f2582b;

    /* JADX INFO: renamed from: c */
    private List f2583c;

    /* JADX INFO: renamed from: d */
    private boolean f2584d;

    /* JADX INFO: renamed from: e */
    private ListView f2585e;

    /* JADX INFO: renamed from: com.applovin.impl.q$a */
    class a extends AbstractViewOnClickListenerC1784u2 {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ List f2586e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, List list) {
            super(context);
            this.f2586e = list;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: b */
        protected int mo2125b() {
            return 1;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: c */
        protected List mo2126c(int i) {
            return AbstractActivityC1693q.this.f2583c;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: d */
        protected int mo2127d(int i) {
            return this.f2586e.size();
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: e */
        protected C1775t2 mo2128e(int i) {
            return new C1813x4("");
        }
    }

    /* JADX INFO: renamed from: a */
    private List m3944a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1656n c1656n = (C1656n) it.next();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ID\t\t\t\t\t\t", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(c1656n.m3609c(), ViewCompat.MEASURED_STATE_MASK));
            spannableStringBuilder.append((CharSequence) new SpannedString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("FORMAT  ", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(c1656n.m3608b(), ViewCompat.MEASURED_STATE_MASK));
            arrayList.add(C1775t2.m5211a(C1775t2.c.DETAIL).m5228b(StringUtils.createSpannedString(c1656n.m3610d(), ViewCompat.MEASURED_STATE_MASK, 18, 1)).m5223a(new SpannedString(spannableStringBuilder)).m5222a(this).m5225a(true).m5226a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3947a(List list, final C1748l c1748l, C1608l2 c1608l2, C1775t2 c1775t2) {
        final C1656n c1656n = (C1656n) list.get(c1608l2.m3117a());
        if (c1656n.m3613g().size() == 1) {
            AbstractC1525d.m2246a(this, MaxDebuggerAdUnitDetailActivity.class, c1748l.m4826e(), new AbstractC1525d.b() { // from class: com.applovin.impl.q$$ExternalSyntheticLambda0
                @Override // com.applovin.impl.AbstractC1525d.b
                /* JADX INFO: renamed from: a */
                public final void mo2130a(Activity activity) {
                    ((MaxDebuggerAdUnitDetailActivity) activity).initialize(c1656n, null, null, c1748l);
                }
            });
        } else {
            AbstractC1525d.m2246a(this, MaxDebuggerAdUnitWaterfallsListActivity.class, c1748l.m4826e(), new AbstractC1525d.b() { // from class: com.applovin.impl.q$$ExternalSyntheticLambda1
                @Override // com.applovin.impl.AbstractC1525d.b
                /* JADX INFO: renamed from: a */
                public final void mo2130a(Activity activity) {
                    ((MaxDebuggerAdUnitWaterfallsListActivity) activity).initialize(c1656n, c1748l);
                }
            });
        }
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3
    protected C1748l getSdk() {
        return this.f2581a;
    }

    public void initialize(final List<C1656n> list, boolean z, final C1748l c1748l) {
        this.f2584d = z;
        this.f2581a = c1748l;
        this.f2583c = m3944a(list);
        a aVar = new a(this, list);
        this.f2582b = aVar;
        aVar.m5278a(new AbstractViewOnClickListenerC1784u2.a() { // from class: com.applovin.impl.q$$ExternalSyntheticLambda2
            @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2.a
            /* JADX INFO: renamed from: a */
            public final void mo2129a(C1608l2 c1608l2, C1775t2 c1775t2) {
                this.f$0.m3947a(list, c1748l, c1608l2, c1775t2);
            }
        });
        this.f2582b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle((this.f2584d ? "Selective Init " : "").concat("Ad Units"));
        setContentView(C1846R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(C1846R.id.listView);
        this.f2585e = listView;
        listView.setAdapter((ListAdapter) this.f2582b);
    }
}

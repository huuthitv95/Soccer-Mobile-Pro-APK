package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.sdk.C1748l;
import com.applovin.sdk.C1846R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.l8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractActivityC1614l8 extends AbstractActivityC1680p3 {

    /* JADX INFO: renamed from: a */
    private String f2033a;

    /* JADX INFO: renamed from: b */
    private C1748l f2034b;

    /* JADX INFO: renamed from: c */
    private AbstractViewOnClickListenerC1784u2 f2035c;

    /* JADX INFO: renamed from: com.applovin.impl.l8$a */
    class a extends AbstractViewOnClickListenerC1784u2 {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ List f2036e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, List list) {
            super(context);
            this.f2036e = list;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: a */
        protected C1775t2 mo2747a() {
            return new C1775t2.b(C1775t2.c.SECTION_CENTERED).m5234d("A plus in front of each segment indicates inclusion and a minus indicates exclusion. The comma in comma-separated values functions as an ∨ (or) operator, and a new row functions as an ∧ (and) operator.").m5226a();
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: b */
        protected int mo2125b() {
            return 1;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: c */
        protected List mo2126c(int i) {
            return this.f2036e;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: d */
        protected int mo2127d(int i) {
            return this.f2036e.size();
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: e */
        protected C1775t2 mo2128e(int i) {
            return new C1813x4("SEGMENT TARGETING");
        }
    }

    /* JADX INFO: renamed from: a */
    private List m3153a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C1775t2.m5211a(C1775t2.c.DETAIL).m5234d((String) it.next()).m5226a());
        }
        return arrayList;
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3
    protected C1748l getSdk() {
        return this.f2034b;
    }

    public void initialize(String str, List<String> list, C1748l c1748l) {
        this.f2033a = str;
        this.f2034b = c1748l;
        a aVar = new a(this, m3153a(list));
        this.f2035c = aVar;
        aVar.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1846R.layout.mediation_debugger_list_view);
        setTitle(this.f2033a);
        ((ListView) findViewById(C1846R.id.listView)).setAdapter((ListAdapter) this.f2035c);
    }
}

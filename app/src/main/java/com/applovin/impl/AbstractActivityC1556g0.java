package com.applovin.impl;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.C1846R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.g0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractActivityC1556g0 extends AbstractActivityC1680p3 {

    /* JADX INFO: renamed from: a */
    private C1748l f1636a;

    /* JADX INFO: renamed from: b */
    private AbstractViewOnClickListenerC1784u2 f1637b;

    /* JADX INFO: renamed from: c */
    private List f1638c;

    /* JADX INFO: renamed from: d */
    private final Set f1639d = new HashSet();

    /* JADX INFO: renamed from: e */
    private TextView f1640e;

    /* JADX INFO: renamed from: f */
    private ListView f1641f;

    /* JADX INFO: renamed from: com.applovin.impl.g0$a */
    class a extends AbstractViewOnClickListenerC1784u2 {
        a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: b */
        protected int mo2125b() {
            return 1;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: c */
        protected List mo2126c(int i) {
            return AbstractActivityC1556g0.this.f1638c;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: d */
        protected int mo2127d(int i) {
            return AbstractActivityC1556g0.this.f1638c.size();
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: e */
        protected C1775t2 mo2128e(int i) {
            return new C1813x4("");
        }
    }

    /* JADX INFO: renamed from: a */
    private int m2636a(boolean z) {
        return z ? C1846R.drawable.applovin_ic_x_mark : C1846R.drawable.applovin_ic_check_mark_bordered;
    }

    /* JADX INFO: renamed from: a */
    private List m2638a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            C1546f0 c1546f0 = (C1546f0) list.get(i);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String strM2528a = c1546f0.m2528a();
            boolean zIsValidString = StringUtils.isValidString(strM2528a);
            if (this.f1639d.contains(Integer.valueOf(i))) {
                Map mapM2532d = c1546f0.m2532d();
                Map mapM2531c = c1546f0.m2531c();
                spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("PARAMETERS: ", -7829368));
                spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(!mapM2532d.isEmpty() ? JsonUtils.maybeConvertToIndentedString(new JSONObject(mapM2532d)) : "None", ViewCompat.MEASURED_STATE_MASK));
                spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("\nOPTIONS: ", -7829368));
                spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(mapM2531c.isEmpty() ? "None" : JsonUtils.maybeConvertToIndentedString(new JSONObject(mapM2531c)), ViewCompat.MEASURED_STATE_MASK));
                if (zIsValidString) {
                    spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("\nERROR: ", SupportMenu.CATEGORY_MASK));
                    spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(strM2528a, SupportMenu.CATEGORY_MASK));
                }
            }
            arrayList.add(C1775t2.m5211a(C1775t2.c.DETAIL).m5228b(StringUtils.createSpannedString(c1546f0.m2530b(), ViewCompat.MEASURED_STATE_MASK, 18, 1)).m5223a(new SpannedString(spannableStringBuilder)).m5221a(m2636a(zIsValidString)).m5227b(m2641b(zIsValidString)).m5225a(true).m5226a());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private void m2639a() {
        if (this.f1638c.isEmpty()) {
            this.f1640e.setVisibility(0);
            this.f1641f.setVisibility(8);
        } else {
            this.f1640e.setVisibility(8);
            this.f1641f.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m2640a(List list, C1608l2 c1608l2, C1775t2 c1775t2) {
        int iM3117a = c1608l2.m3117a();
        if (this.f1639d.contains(Integer.valueOf(iM3117a))) {
            this.f1639d.remove(Integer.valueOf(iM3117a));
        } else {
            this.f1639d.add(Integer.valueOf(iM3117a));
        }
        this.f1638c = m2638a(list);
        this.f1637b.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: b */
    private int m2641b(boolean z) {
        return getColor(z ? C1846R.color.applovin_sdk_xmarkColor : C1846R.color.applovin_sdk_checkmarkColor);
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3
    protected C1748l getSdk() {
        return this.f1636a;
    }

    public void initialize(final List<C1546f0> list, C1748l c1748l) {
        this.f1636a = c1748l;
        this.f1638c = m2638a(list);
        a aVar = new a(this);
        this.f1637b = aVar;
        aVar.m5278a(new AbstractViewOnClickListenerC1784u2.a() { // from class: com.applovin.impl.g0$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2.a
            /* JADX INFO: renamed from: a */
            public final void mo2129a(C1608l2 c1608l2, C1775t2 c1775t2) {
                this.f$0.m2640a(list, c1608l2, c1775t2);
            }
        });
        this.f1637b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Axon Events");
        setContentView(C1846R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(C1846R.id.listView);
        this.f1641f = listView;
        listView.setAdapter((ListAdapter) this.f1637b);
        TextView textView = new TextView(this);
        this.f1640e = textView;
        textView.setGravity(17);
        this.f1640e.setTextSize(18.0f);
        this.f1640e.setText(C1846R.string.applovin_mediation_debugger_no_axon_events_text);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C1846R.dimen.default_margin);
        this.f1640e.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        ((FrameLayout) findViewById(R.id.content)).addView(this.f1640e, new FrameLayout.LayoutParams(-1, -1, 17));
        m2639a();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1846R.menu.axon_events_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != C1846R.id.action_clear) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.f1636a.m4768G().clearTrackedAxonEvents();
        this.f1638c.clear();
        this.f1637b.notifyDataSetChanged();
        m2639a();
        return true;
    }
}

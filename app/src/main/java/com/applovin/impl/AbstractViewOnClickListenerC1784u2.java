package com.applovin.impl;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C1846R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.u2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractViewOnClickListenerC1784u2 extends BaseAdapter implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    protected Context f3399a;

    /* JADX INFO: renamed from: b */
    private List f3400b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private Map f3401c = new HashMap();

    /* JADX INFO: renamed from: d */
    private a f3402d;

    /* JADX INFO: renamed from: com.applovin.impl.u2$a */
    /* JADX INFO: loaded from: classes9.dex */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo2129a(C1608l2 c1608l2, C1775t2 c1775t2);
    }

    protected AbstractViewOnClickListenerC1784u2(Context context) {
        this.f3399a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    private Drawable m5276a(View view) {
        Drawable background = view.getBackground();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.f3399a.getColor(C1846R.color.applovin_sdk_highlightListItemColor));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable);
        stateListDrawable.addState(new int[0], background);
        return stateListDrawable;
    }

    /* JADX INFO: renamed from: a */
    private C1608l2 m5277a(int i) {
        for (int i2 = 0; i2 < mo2125b(); i2++) {
            Integer num = (Integer) this.f3401c.get(Integer.valueOf(i2));
            if (num != null) {
                if (i <= num.intValue() + mo2127d(i2)) {
                    return new C1608l2(i2, i - (num.intValue() + 1));
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    protected C1775t2 mo2747a() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m5278a(a aVar) {
        this.f3402d = aVar;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    /* JADX INFO: renamed from: b */
    protected abstract int mo2125b();

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1775t2 getItem(int i) {
        return (C1775t2) this.f3400b.get(i);
    }

    /* JADX INFO: renamed from: c */
    protected abstract List mo2126c(int i);

    /* JADX INFO: renamed from: c */
    public void m5280c() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.u2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.notifyDataSetChanged();
            }
        });
    }

    /* JADX INFO: renamed from: d */
    protected abstract int mo2127d(int i);

    /* JADX INFO: renamed from: e */
    protected abstract C1775t2 mo2128e(int i);

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f3400b.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return getItem(i).m5219m();
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C1716s2 c1716s2;
        C1775t2 item = getItem(i);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(item.m5217j(), viewGroup, false);
            c1716s2 = new C1716s2();
            c1716s2.f2788a = (TextView) view.findViewById(R.id.text1);
            c1716s2.f2789b = (TextView) view.findViewById(R.id.text2);
            c1716s2.f2790c = (ImageView) view.findViewById(C1846R.id.imageView);
            c1716s2.f2791d = (ImageView) view.findViewById(C1846R.id.detailImageView);
            view.setTag(c1716s2);
            view.setOnClickListener(this);
            view.setBackground(m5276a(view));
        } else {
            c1716s2 = (C1716s2) view.getTag();
        }
        c1716s2.m4339a(i);
        c1716s2.m4340a(item);
        view.setEnabled(item.mo2107o());
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return C1775t2.m5212n();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return getItem(i).mo2107o();
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        int i;
        this.f3400b = new ArrayList();
        int iMo2125b = mo2125b();
        this.f3401c = new HashMap(iMo2125b);
        C1775t2 c1775t2Mo2747a = mo2747a();
        if (c1775t2Mo2747a != null) {
            this.f3400b.add(c1775t2Mo2747a);
            i = 1;
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < iMo2125b; i2++) {
            int iMo2127d = mo2127d(i2);
            if (iMo2127d != 0) {
                this.f3400b.add(mo2128e(i2));
                this.f3400b.addAll(mo2126c(i2));
                this.f3401c.put(Integer.valueOf(i2), Integer.valueOf(i));
                i += iMo2127d + 1;
            }
        }
        this.f3400b.add(new C1813x4(""));
        super.notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C1716s2 c1716s2 = (C1716s2) view.getTag();
        C1775t2 c1775t2M4341b = c1716s2.m4341b();
        C1608l2 c1608l2M5277a = m5277a(c1716s2.m4338a());
        a aVar = this.f3402d;
        if (aVar == null || c1608l2M5277a == null) {
            return;
        }
        aVar.mo2129a(c1608l2M5277a, c1775t2M4341b);
    }
}

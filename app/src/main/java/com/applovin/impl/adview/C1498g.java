package com.applovin.impl.adview;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: com.applovin.impl.adview.g */
/* JADX INFO: loaded from: classes3.dex */
public class C1498g extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private AbstractC1496e f1114a;

    /* JADX INFO: renamed from: b */
    private int f1115b;

    public C1498g(AbstractC1496e.a aVar, Activity activity) {
        super(activity);
        setBackgroundColor(0);
        AbstractC1496e abstractC1496eM2015a = AbstractC1496e.m2015a(aVar, activity);
        this.f1114a = abstractC1496eM2015a;
        addView(abstractC1496eM2015a);
    }

    /* JADX INFO: renamed from: a */
    public void m2032a(int i, int i2, int i3, int i4) {
        this.f1115b = i;
        int i5 = i2 + i + i3;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i5;
            layoutParams.width = i5;
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(i5, i5));
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i, i4);
        layoutParams2.setMargins(i3, i3, i3, 0);
        this.f1114a.setLayoutParams(layoutParams2);
        this.f1114a.mo2016a(i);
    }

    /* JADX INFO: renamed from: a */
    public void m2033a(AbstractC1496e.a aVar) {
        if (aVar == null || aVar == this.f1114a.getStyle()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f1114a.getLayoutParams();
        removeView(this.f1114a);
        AbstractC1496e abstractC1496eM2015a = AbstractC1496e.m2015a(aVar, getContext());
        this.f1114a = abstractC1496eM2015a;
        addView(abstractC1496eM2015a);
        this.f1114a.setLayoutParams(layoutParams);
        this.f1114a.mo2016a(this.f1115b);
    }
}

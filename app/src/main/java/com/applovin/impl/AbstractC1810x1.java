package com.applovin.impl;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.C1498g;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;

/* JADX INFO: renamed from: com.applovin.impl.x1 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC1810x1 {

    /* JADX INFO: renamed from: a */
    final C1748l f3550a;

    /* JADX INFO: renamed from: b */
    final Activity f3551b;

    /* JADX INFO: renamed from: c */
    final AbstractC1736b f3552c;

    /* JADX INFO: renamed from: d */
    final ViewGroup f3553d;

    /* JADX INFO: renamed from: e */
    final FrameLayout.LayoutParams f3554e;

    AbstractC1810x1(AbstractC1736b abstractC1736b, Activity activity, C1748l c1748l) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        this.f3554e = layoutParams;
        this.f3552c = abstractC1736b;
        this.f3550a = c1748l;
        this.f3551b = activity;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f3553d = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        frameLayout.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: a */
    public void mo2345a(View view) {
        this.f3553d.removeView(view);
    }

    /* JADX INFO: renamed from: a */
    public void mo1805a(C1498g c1498g) {
        if (c1498g == null || c1498g.getParent() != null) {
            return;
        }
        m5563a(this.f3552c.m4549n(), (this.f3552c.m4556q0() ? 3 : 5) | 48, c1498g);
    }

    /* JADX INFO: renamed from: a */
    void m5563a(AbstractC1736b.d dVar, int i, C1498g c1498g) {
        c1498g.m2032a(dVar.f2914a, dVar.f2918e, dVar.f2917d, i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(c1498g.getLayoutParams());
        int i2 = dVar.f2916c;
        layoutParams.setMargins(i2, dVar.f2915b, i2, 0);
        layoutParams.gravity = i;
        this.f3553d.addView(c1498g, layoutParams);
    }
}

package com.applovin.impl;

import android.app.Activity;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.adview.C1498g;
import com.applovin.impl.adview.C1502k;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;

/* JADX INFO: renamed from: com.applovin.impl.a2 */
/* JADX INFO: loaded from: classes3.dex */
public class C1481a2 extends AbstractC1810x1 {
    public C1481a2(AbstractC1736b abstractC1736b, Activity activity, C1748l c1748l) {
        super(abstractC1736b, activity, c1748l);
    }

    @Override // com.applovin.impl.AbstractC1810x1
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ void mo1805a(C1498g c1498g) {
        super.mo1805a(c1498g);
    }

    /* JADX INFO: renamed from: a */
    public void m1806a(C1498g c1498g, C1502k c1502k, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.f3553d.addView(appLovinAdView);
        if (c1498g != null) {
            m5563a(this.f3552c.m4549n(), (this.f3552c.m4556q0() ? 3 : 5) | 48, c1498g);
        }
        if (c1502k != null) {
            this.f3553d.addView(c1502k, this.f3554e);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f3553d);
        } else {
            this.f3551b.setContentView(this.f3553d);
        }
    }
}

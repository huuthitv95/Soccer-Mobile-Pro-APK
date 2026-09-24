package com.applovin.impl;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.adview.C1498g;
import com.applovin.impl.adview.C1502k;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: renamed from: com.applovin.impl.d2 */
/* JADX INFO: loaded from: classes3.dex */
public class C1528d2 extends AbstractC1810x1 {
    public C1528d2(AbstractC1736b abstractC1736b, Activity activity, C1748l c1748l) {
        super(abstractC1736b, activity, c1748l);
    }

    @Override // com.applovin.impl.AbstractC1810x1
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ void mo2345a(View view) {
        super.mo2345a(view);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0088  */
    /* JADX WARN: Code duplicated, block: B:20:0x0090  */
    /* JADX WARN: Code duplicated, block: B:23:0x009e  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:29:0x0131  */
    /* JADX WARN: Code duplicated, block: B:31:0x0153  */
    /* JADX WARN: Code duplicated, block: B:33:0x015d  */
    /* JADX WARN: Code duplicated, block: B:35:0x019e  */
    /* JADX WARN: Code duplicated, block: B:37:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:39:0x01ad  */
    /* JADX INFO: renamed from: a */
    public void m2346a(ImageView imageView, C1498g c1498g, C1478a c1478a, ProgressBar progressBar, C1596k0 c1596k0, View view, View view2, AppLovinAdView appLovinAdView, C1502k c1502k, ImageView imageView2, ViewGroup viewGroup) {
        int i;
        FrameLayout.LayoutParams layoutParams;
        C1711r7 c1711r7;
        if (this.f3552c.m4535f0() == AbstractC1736b.e.TOP) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2, 48);
        } else {
            if (this.f3552c.m4535f0() != AbstractC1736b.e.BOTTOM) {
                if (this.f3552c.m4535f0() == AbstractC1736b.e.LEFT) {
                    layoutParams = new FrameLayout.LayoutParams(-2, -1, 3);
                } else if (this.f3552c.m4535f0() == AbstractC1736b.e.RIGHT) {
                    i = 5;
                    layoutParams = new FrameLayout.LayoutParams(-2, -1, 5);
                } else {
                    i = 5;
                    layoutParams = this.f3554e;
                }
                appLovinAdView.setLayoutParams(this.f3554e);
                this.f3553d.addView(appLovinAdView);
                view2.setLayoutParams(this.f3554e);
                this.f3553d.addView(view2);
                view.setLayoutParams(layoutParams);
                this.f3553d.addView(view);
                if (c1498g != null) {
                    if (this.f3552c.m4567w0()) {
                        i = 3;
                    }
                    m5563a(this.f3552c.m4549n(), i | 48, c1498g);
                }
                if (imageView != null) {
                    int iDpToPx = AppLovinSdkUtils.dpToPx(this.f3551b, ((Integer) this.f3550a.m4801a(C1831z4.f3933g2)).intValue());
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iDpToPx, iDpToPx, ((Integer) this.f3550a.m4801a(C1831z4.f3951i2)).intValue());
                    int iDpToPx2 = AppLovinSdkUtils.dpToPx(this.f3551b, ((Integer) this.f3550a.m4801a(C1831z4.f3942h2)).intValue());
                    layoutParams2.setMargins(iDpToPx2, iDpToPx2, iDpToPx2, iDpToPx2);
                    this.f3553d.addView(imageView, layoutParams2);
                }
                if (c1478a != null) {
                    this.f3553d.addView(c1478a, this.f3554e);
                }
                if (c1596k0 != null) {
                    int iDpToPx3 = AppLovinSdkUtils.dpToPx(this.f3551b, ((Integer) this.f3550a.m4801a(C1831z4.f3824T1)).intValue());
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iDpToPx3, iDpToPx3, ((Integer) this.f3550a.m4801a(C1831z4.f3816S1)).intValue());
                    int iDpToPx4 = AppLovinSdkUtils.dpToPx(this.f3551b, ((Integer) this.f3550a.m4801a(C1831z4.f3808R1)).intValue());
                    layoutParams3.setMargins(iDpToPx4, iDpToPx4, iDpToPx4, iDpToPx4);
                    this.f3553d.addView(c1596k0, layoutParams3);
                }
                if (progressBar != null) {
                    FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, 20, 80);
                    layoutParams4.setMargins(0, 0, 0, ((Integer) this.f3550a.m4801a(C1831z4.f3978l2)).intValue());
                    this.f3553d.addView(progressBar, layoutParams4);
                }
                if (imageView2 != null) {
                    c1711r7 = (C1711r7) this.f3552c;
                    if (c1711r7.m4238l1()) {
                        int iDpToPx5 = AppLovinSdkUtils.dpToPx(this.f3551b, c1711r7.m4232f1().m5603g());
                        int iDpToPx6 = AppLovinSdkUtils.dpToPx(this.f3551b, c1711r7.m4232f1().m5600d());
                        int iDpToPx7 = AppLovinSdkUtils.dpToPx(this.f3551b, ((Integer) this.f3550a.m4801a(C1831z4.f3883a5)).intValue());
                        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iDpToPx5, iDpToPx6, 83);
                        layoutParams5.setMargins(iDpToPx7, iDpToPx7, iDpToPx7, iDpToPx7);
                        this.f3553d.addView(imageView2, layoutParams5);
                    }
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
            layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        }
        i = 5;
        appLovinAdView.setLayoutParams(this.f3554e);
        this.f3553d.addView(appLovinAdView);
        view2.setLayoutParams(this.f3554e);
        this.f3553d.addView(view2);
        view.setLayoutParams(layoutParams);
        this.f3553d.addView(view);
        if (c1498g != null) {
            if (this.f3552c.m4567w0()) {
                i = 3;
            }
            m5563a(this.f3552c.m4549n(), i | 48, c1498g);
        }
        if (imageView != null) {
            int iDpToPx8 = AppLovinSdkUtils.dpToPx(this.f3551b, ((Integer) this.f3550a.m4801a(C1831z4.f3933g2)).intValue());
            FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(iDpToPx8, iDpToPx8, ((Integer) this.f3550a.m4801a(C1831z4.f3951i2)).intValue());
            int iDpToPx9 = AppLovinSdkUtils.dpToPx(this.f3551b, ((Integer) this.f3550a.m4801a(C1831z4.f3942h2)).intValue());
            layoutParams6.setMargins(iDpToPx9, iDpToPx9, iDpToPx9, iDpToPx9);
            this.f3553d.addView(imageView, layoutParams6);
        }
        if (c1478a != null) {
            this.f3553d.addView(c1478a, this.f3554e);
        }
        if (c1596k0 != null) {
            int iDpToPx10 = AppLovinSdkUtils.dpToPx(this.f3551b, ((Integer) this.f3550a.m4801a(C1831z4.f3824T1)).intValue());
            FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(iDpToPx10, iDpToPx10, ((Integer) this.f3550a.m4801a(C1831z4.f3816S1)).intValue());
            int iDpToPx11 = AppLovinSdkUtils.dpToPx(this.f3551b, ((Integer) this.f3550a.m4801a(C1831z4.f3808R1)).intValue());
            layoutParams7.setMargins(iDpToPx11, iDpToPx11, iDpToPx11, iDpToPx11);
            this.f3553d.addView(c1596k0, layoutParams7);
        }
        if (progressBar != null) {
            FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-1, 20, 80);
            layoutParams8.setMargins(0, 0, 0, ((Integer) this.f3550a.m4801a(C1831z4.f3978l2)).intValue());
            this.f3553d.addView(progressBar, layoutParams8);
        }
        if (imageView2 != null) {
            c1711r7 = (C1711r7) this.f3552c;
            if (c1711r7.m4238l1()) {
                int iDpToPx12 = AppLovinSdkUtils.dpToPx(this.f3551b, c1711r7.m4232f1().m5603g());
                int iDpToPx13 = AppLovinSdkUtils.dpToPx(this.f3551b, c1711r7.m4232f1().m5600d());
                int iDpToPx14 = AppLovinSdkUtils.dpToPx(this.f3551b, ((Integer) this.f3550a.m4801a(C1831z4.f3883a5)).intValue());
                FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(iDpToPx12, iDpToPx13, 83);
                layoutParams9.setMargins(iDpToPx14, iDpToPx14, iDpToPx14, iDpToPx14);
                this.f3553d.addView(imageView2, layoutParams9);
            }
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

    @Override // com.applovin.impl.AbstractC1810x1
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ void mo1805a(C1498g c1498g) {
        super.mo1805a(c1498g);
    }

    /* JADX INFO: renamed from: a */
    public void m2347a(C1498g c1498g, C1502k c1502k, View view, ProgressBar progressBar) {
        if (view != null) {
            view.setVisibility(0);
        }
        if (((Boolean) this.f3550a.m4801a(C1831z4.f3853W6)).booleanValue()) {
            AbstractC1713s.m4306b(this.f3553d, view);
        } else {
            AbstractC1713s.m4304a(this.f3553d, view);
        }
        if (c1498g != null) {
            m5563a(this.f3552c.m4549n(), (this.f3552c.m4556q0() ? 3 : 5) | 48, c1498g);
        }
        if (progressBar != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 20, ((Boolean) this.f3550a.m4801a(C1831z4.f4037s2)).booleanValue() ? 80 : 48);
            layoutParams.setMargins(0, 0, 0, ((Integer) this.f3550a.m4801a(C1831z4.f4045t2)).intValue());
            this.f3553d.addView(progressBar, layoutParams);
        }
        if (c1502k != null) {
            this.f3553d.addView(c1502k, this.f3554e);
        }
    }
}

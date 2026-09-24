package com.applovin.impl;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: renamed from: com.applovin.impl.s2 */
/* JADX INFO: loaded from: classes3.dex */
public class C1716s2 {

    /* JADX INFO: renamed from: a */
    public TextView f2788a;

    /* JADX INFO: renamed from: b */
    public TextView f2789b;

    /* JADX INFO: renamed from: c */
    public ImageView f2790c;

    /* JADX INFO: renamed from: d */
    public ImageView f2791d;

    /* JADX INFO: renamed from: e */
    private C1775t2 f2792e;

    /* JADX INFO: renamed from: f */
    private int f2793f;

    /* JADX INFO: renamed from: a */
    public int m4338a() {
        return this.f2793f;
    }

    /* JADX INFO: renamed from: a */
    public void m4339a(int i) {
        this.f2793f = i;
    }

    /* JADX INFO: renamed from: a */
    public void m4340a(C1775t2 c1775t2) {
        this.f2792e = c1775t2;
        this.f2788a.setText(c1775t2.mo2748k());
        this.f2788a.setTextColor(c1775t2.m5218l());
        if (this.f2789b != null) {
            if (TextUtils.isEmpty(c1775t2.mo5215f())) {
                this.f2789b.setVisibility(8);
            } else {
                this.f2789b.setTypeface(null, 0);
                this.f2789b.setVisibility(0);
                this.f2789b.setText(c1775t2.mo5215f());
                this.f2789b.setTextColor(c1775t2.mo3165g());
                if (c1775t2.mo5220p()) {
                    this.f2789b.setTypeface(null, 1);
                }
            }
        }
        if (this.f2790c != null) {
            if (c1775t2.mo2106h() > 0) {
                this.f2790c.setImageResource(c1775t2.mo2106h());
                this.f2790c.setColorFilter(c1775t2.m5216i());
                this.f2790c.setVisibility(0);
            } else {
                this.f2790c.setVisibility(8);
            }
        }
        if (this.f2791d != null) {
            if (c1775t2.mo2104d() <= 0) {
                this.f2791d.setVisibility(8);
                return;
            }
            this.f2791d.setImageResource(c1775t2.mo2104d());
            this.f2791d.setColorFilter(c1775t2.mo2105e());
            this.f2791d.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: b */
    public C1775t2 m4341b() {
        return this.f2792e;
    }
}

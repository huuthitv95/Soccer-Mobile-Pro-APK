package com.fyber.inneractive.sdk.flow.storepromo.p275ui;

import android.content.Context;
import android.content.IntentFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.C7809R;
import com.fyber.inneractive.sdk.config.C8021o;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.flow.storepromo.C8178b;
import com.fyber.inneractive.sdk.util.AbstractC9174o;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.storepromo.ui.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C8217c {

    /* JADX INFO: renamed from: a */
    public View f18311a;

    /* JADX INFO: renamed from: b */
    public ViewGroup f18312b;

    /* JADX INFO: renamed from: c */
    public final Animation f18313c;

    /* JADX INFO: renamed from: d */
    public final Animation f18314d;

    /* JADX INFO: renamed from: e */
    public C8216b f18315e;

    /* JADX INFO: renamed from: f */
    public C8178b f18316f;

    /* JADX INFO: renamed from: g */
    public final float f18317g;

    /* JADX INFO: renamed from: h */
    public int f18318h = -1;

    /* JADX INFO: renamed from: i */
    public final AnimationAnimationListenerC8215a f18319i = new AnimationAnimationListenerC8215a(this);

    public C8217c(Context context, View view, C8178b c8178b) {
        float f;
        this.f18311a = view;
        this.f18313c = AnimationUtils.loadAnimation(context, C7809R.anim.store_promo_appear_anim);
        this.f18314d = AnimationUtils.loadAnimation(context, C7809R.anim.store_promo_disappear_anim);
        C8021o c8021o = IAConfigManager.f17654M.f17688t.f17862b;
        c8021o.getClass();
        try {
            f = Float.parseFloat(c8021o.m20445a("dtx_store_promo_height", Float.toString(0.7f)));
        } catch (Throwable unused) {
            f = 0.7f;
        }
        this.f18317g = Math.max(f, 0.7f);
        this.f18316f = c8178b;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C7809R.layout.dt_store_promo_layout, (ViewGroup) null);
        this.f18312b = viewGroup;
        viewGroup.setOnClickListener(null);
        this.f18312b.setBackgroundColor(context.getResources().getColor(C7809R.color.dtx_store_promo_bg_fade));
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        this.f18311a.setLayoutParams(layoutParams2);
        this.f18312b.setVisibility(8);
        ViewGroup viewGroup2 = this.f18312b;
        if (viewGroup2 != null) {
            viewGroup2.setLayoutParams(layoutParams);
            this.f18312b.addView(this.f18311a);
        }
        if (this.f18315e == null) {
            C8216b c8216b = new C8216b(this);
            this.f18315e = c8216b;
            AbstractC9174o.f21470a.registerReceiver(c8216b, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20622a() {
        View view;
        int iM22000c = AbstractC9174o.m22000c();
        if (iM22000c == this.f18318h || (view = this.f18311a) == null || view.getLayoutParams() == null) {
            return;
        }
        this.f18318h = iM22000c;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f18311a.getLayoutParams();
        layoutParams.height = iM22000c == 2 ? AbstractC9174o.m22004e() : (int) (AbstractC9174o.m22002d() * this.f18317g);
        this.f18311a.setLayoutParams(layoutParams);
    }
}

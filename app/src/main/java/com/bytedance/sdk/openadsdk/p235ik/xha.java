package com.bytedance.sdk.openadsdk.p235ik;

import android.content.Context;
import android.graphics.Color;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;
import com.bytedance.sdk.openadsdk.utils.C3583qd;

/* JADX INFO: loaded from: classes3.dex */
public class xha extends LinearLayout {

    /* JADX INFO: renamed from: ik */
    private final C3386qt f12056ik;

    /* JADX INFO: renamed from: lr */
    private C3385mj f12057lr;

    /* JADX INFO: renamed from: ri */
    private final FilterWord f12058ri;

    public xha(Context context, FilterWord filterWord, C3386qt c3386qt) {
        super(context);
        setOrientation(1);
        this.f12058ri = filterWord;
        this.f12056ik = c3386qt;
        m15341ri();
    }

    /* JADX INFO: renamed from: ik */
    private void m15339ik() {
        String name = this.f12058ri.getName();
        C3195mj c3195mj = new C3195mj(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C3583qd.m16589lr(getContext(), 12.0f);
        layoutParams.gravity = 17;
        c3195mj.setGravity(17);
        c3195mj.setText(name);
        c3195mj.setTextColor(Color.argb(85, 22, 24, 35));
        c3195mj.setTextSize(this.f12056ik.jbs() ? 14 : 10);
        addView(c3195mj, layoutParams);
    }

    /* JADX INFO: renamed from: lr */
    private void m15340lr() {
        this.f12057lr = new C3385mj(getContext(), this.f12056ik);
        new LinearLayout.LayoutParams(-1, -2);
        this.f12057lr.m15316ri(this.f12058ri.getOptions());
        addView(this.f12057lr);
    }

    /* JADX INFO: renamed from: ri */
    private void m15341ri() {
        m15339ik();
        m15340lr();
    }
}

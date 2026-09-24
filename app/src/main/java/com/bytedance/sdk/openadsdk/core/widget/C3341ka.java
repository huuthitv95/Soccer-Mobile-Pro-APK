package com.bytedance.sdk.openadsdk.core.widget;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.utils.C3583qd;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.widget.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C3341ka {
    /* JADX INFO: renamed from: lr */
    public static Drawable m15009lr() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C3583qd.m16589lr(C3299nr.m14642ri(), 44.0f));
        gradientDrawable.setStroke(C3583qd.m16589lr(C3299nr.m14642ri(), 1.0f), Color.parseColor("#33FFFFFF"));
        gradientDrawable.setColor(Color.parseColor("#99333333"));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: ri */
    public static Drawable m15010ri() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setStroke(C3583qd.m16589lr(C3299nr.m14642ri(), 1.0f), Color.parseColor("#33FFFFFF"));
        gradientDrawable.setColor(Color.parseColor("#99333333"));
        return gradientDrawable;
    }
}

package com.bytedance.sdk.component.adexpress.p124ka;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.xha;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.ka.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2493ik {
    /* JADX INFO: renamed from: ri */
    public static Drawable m8815ri(Context context, int i, int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        if (context != null) {
            gradientDrawable.setStroke(i, i2);
        }
        gradientDrawable.setColor(i3);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: ri */
    public static Drawable m8816ri(Context context, xha xhaVar) {
        if (context == null || xhaVar == null) {
            return null;
        }
        return m8815ri(context, (int) xha.m8833ri(context, xhaVar.m8696bu()), xhaVar.slm(), xhaVar.m8732zf());
    }
}

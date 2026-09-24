package com.mbridge.msdk.video.dynview.util.drawable;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.mbridge.msdk.foundation.tools.C13229v0;

/* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.util.drawable.a */
/* JADX INFO: compiled from: UIDrawableUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13978a {
    /* JADX INFO: renamed from: a */
    public static void m41869a(View view, float f, float f2, String str, String[] strArr, GradientDrawable.Orientation orientation) {
        if (view == null || strArr == null) {
            return;
        }
        int[] iArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            iArr[i] = Color.parseColor(strArr[i]);
        }
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
        gradientDrawable.setCornerRadius(C13229v0.m37876a(view.getContext(), f2));
        gradientDrawable.setStroke(C13229v0.m37876a(view.getContext(), f), Color.parseColor(str));
        view.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: a */
    public static void m41870a(View view, int i, int i2, String str, String str2) {
        if (view != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(Color.parseColor(str2));
            gradientDrawable.setCornerRadius(C13229v0.m37876a(view.getContext(), i2));
            gradientDrawable.setStroke(C13229v0.m37876a(view.getContext(), i), Color.parseColor(str));
            view.setBackground(gradientDrawable);
        }
    }
}

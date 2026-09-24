package com.bytedance.sdk.openadsdk.core.jbs.p220ri;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import com.bytedance.sdk.openadsdk.utils.C3583qd;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.jbs.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3240ri {
    /* JADX INFO: renamed from: lr */
    public static float m13719lr(Context context) {
        return C3583qd.m16581ik(context, C3583qd.m16573aw(context));
    }

    /* JADX INFO: renamed from: ri */
    public static float m13720ri(Context context) {
        return C3583qd.m16581ik(context, C3583qd.m16575co(context));
    }

    /* JADX INFO: renamed from: ri */
    public static Pair<Float, Float> m13721ri(Window window, int i) {
        View decorView = window.getDecorView();
        float[] fArrM13722ri = {decorView.getWidth() - (decorView.getPaddingLeft() * 2), decorView.getHeight() - (decorView.getPaddingTop() * 2)};
        fArrM13722ri[0] = C3583qd.m16581ik(window.getContext(), fArrM13722ri[0]);
        float fM16581ik = C3583qd.m16581ik(window.getContext(), fArrM13722ri[1]);
        fArrM13722ri[1] = fM16581ik;
        if (fArrM13722ri[0] < 10.0f || fM16581ik < 10.0f) {
            fArrM13722ri = m13722ri(window.getContext(), C3583qd.m16581ik(window.getContext(), C3583qd.m16601ri()), i);
        }
        float fMax = Math.max(fArrM13722ri[0], fArrM13722ri[1]);
        float fMin = Math.min(fArrM13722ri[0], fArrM13722ri[1]);
        if (i == 1) {
            fArrM13722ri[0] = fMin;
            fArrM13722ri[1] = fMax;
        } else {
            fArrM13722ri[0] = fMax;
            fArrM13722ri[1] = fMin;
        }
        return new Pair<>(Float.valueOf(fArrM13722ri[0]), Float.valueOf(fArrM13722ri[1]));
    }

    /* JADX INFO: renamed from: ri */
    private static float[] m13722ri(Context context, int i, int i2) {
        float fM13720ri = m13720ri(context);
        float fM13719lr = m13719lr(context);
        if ((i2 == 1) != (fM13720ri > fM13719lr)) {
            float f = fM13720ri + fM13719lr;
            fM13719lr = f - fM13719lr;
            fM13720ri = f - fM13719lr;
        }
        if (i2 == 1) {
            fM13720ri -= i;
        } else {
            fM13719lr -= i;
        }
        return new float[]{fM13719lr, fM13720ri};
    }
}

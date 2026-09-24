package com.bytedance.sdk.openadsdk.core;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.jbs.C3222ac;
import com.bytedance.sdk.openadsdk.core.p221ka.C3260ka;
import com.bytedance.sdk.openadsdk.utils.C3583qd;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.pv */
/* JADX INFO: loaded from: classes3.dex */
public class C3302pv {
    /* JADX INFO: renamed from: ik */
    private static int m14650ik(View view, int i) {
        if (i == 3) {
            return C3583qd.m16578fi(view.getContext().getApplicationContext()) / 2;
        }
        return 20;
    }

    /* JADX INFO: renamed from: lr */
    private static int m14651lr(View view, int i) {
        if (i == 3) {
            return (int) (((double) C3583qd.m16580ik(view.getContext().getApplicationContext())) * 0.7d);
        }
        return 20;
    }

    /* JADX INFO: renamed from: lr */
    private static int m14652lr(View view, int i, int i2, boolean z) throws Throwable {
        if (view.getWindowVisibility() != 0) {
            return 4;
        }
        if (!m14653lr(view)) {
            return 1;
        }
        if (m14657ri(view, i2, z)) {
            return !m14655ri(view, i) ? 3 : 0;
        }
        return 6;
    }

    /* JADX INFO: renamed from: lr */
    private static boolean m14653lr(View view) {
        return view != null && view.isShown();
    }

    /* JADX INFO: renamed from: ri */
    public static float m14654ri(View view) {
        if (view != null) {
            try {
                if (view.getVisibility() == 0 && view.getParent() != null) {
                    Rect rect = new Rect();
                    if (!view.getGlobalVisibleRect(rect)) {
                        return -1.0f;
                    }
                    long jHeight = ((long) rect.height()) * ((long) rect.width());
                    long height = ((long) view.getHeight()) * ((long) view.getWidth());
                    if (height <= 0) {
                        return -1.0f;
                    }
                    return jHeight / height;
                }
            } catch (Throwable unused) {
            }
        }
        return -1.0f;
    }

    /* JADX INFO: renamed from: ri */
    private static boolean m14655ri(View view, int i) {
        float fM14654ri = m14654ri(view);
        return fM14654ri > 0.0f && fM14654ri >= ((float) i) / 100.0f;
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m14656ri(View view, int i, int i2, boolean z) {
        if (i2 == 1) {
            while (view != null) {
                try {
                    if (view.getVisibility() != 0) {
                        return false;
                    }
                    if ((view instanceof C3222ac) || (view instanceof C3260ka)) {
                        break;
                    }
                    view = (View) view.getParent();
                } catch (Throwable unused) {
                }
            }
            if (z) {
                i = 0;
            }
        }
        return m14652lr(view, i, i2, z) == 0;
    }

    /* JADX INFO: renamed from: ri */
    private static boolean m14657ri(View view, int i, boolean z) {
        int iM14651lr = m14651lr(view, i);
        int iM14650ik = m14650ik(view, i);
        if (i == 1 && z) {
            return view.getWidth() > 0 && view.getHeight() > 0;
        }
        return view.getWidth() >= iM14651lr && view.getHeight() >= iM14650ik;
    }
}

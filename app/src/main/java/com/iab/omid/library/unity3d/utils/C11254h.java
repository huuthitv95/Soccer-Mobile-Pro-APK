package com.iab.omid.library.unity3d.utils;

import android.view.View;

/* JADX INFO: renamed from: com.iab.omid.library.unity3d.utils.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C11254h {
    /* JADX INFO: renamed from: a */
    public static String m24869a(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static View m24870b(View view) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static float m24871c(View view) {
        return view.getZ();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m24872d(View view) {
        return m24869a(view) == null;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m24873e(View view) {
        if (!view.isAttachedToWindow() || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == 0.0f) {
                return false;
            }
            view = m24870b(view);
        }
        return true;
    }
}

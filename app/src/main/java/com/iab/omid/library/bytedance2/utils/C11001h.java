package com.iab.omid.library.bytedance2.utils;

import android.view.View;

/* JADX INFO: renamed from: com.iab.omid.library.bytedance2.utils.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C11001h {
    /* JADX INFO: renamed from: a */
    public static String m23611a(View view) {
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
    public static View m23612b(View view) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static float m23613c(View view) {
        return view.getZ();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m23614d(View view) {
        return m23611a(view) == null;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m23615e(View view) {
        if (!view.isAttachedToWindow() || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == 0.0f) {
                return false;
            }
            view = m23612b(view);
        }
        return true;
    }
}

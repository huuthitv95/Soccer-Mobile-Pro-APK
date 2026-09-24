package com.iab.omid.library.vungle.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.utils.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C11317h {
    /* JADX INFO: renamed from: a */
    public static String m25169a(View view) {
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
    public static Activity m25170b(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static View m25171c(View view) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static float m25172d(View view) {
        return view.getZ();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m25173e(View view) {
        Activity activityM25170b;
        if (Build.VERSION.SDK_INT < 24 || (activityM25170b = m25170b(view)) == null) {
            return false;
        }
        return activityM25170b.isInPictureInPictureMode();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m25174f(View view) {
        return m25169a(view) == null;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m25175g(View view) {
        if (!view.isAttachedToWindow() || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == 0.0f) {
                return false;
            }
            view = m25171c(view);
        }
        return true;
    }
}

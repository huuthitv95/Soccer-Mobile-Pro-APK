package com.iab.omid.library.ironsrc.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: com.iab.omid.library.ironsrc.utils.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C11156h {
    /* JADX INFO: renamed from: a */
    public static String m24377a(View view) {
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
    public static Activity m24378b(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static View m24379c(View view) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static float m24380d(View view) {
        return view.getZ();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m24381e(View view) {
        Activity activityM24378b;
        if (Build.VERSION.SDK_INT < 24 || (activityM24378b = m24378b(view)) == null) {
            return false;
        }
        return activityM24378b.isInPictureInPictureMode();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m24382f(View view) {
        return m24377a(view) == null;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m24383g(View view) {
        if (!view.isAttachedToWindow() || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == 0.0f) {
                return false;
            }
            view = m24379c(view);
        }
        return true;
    }
}

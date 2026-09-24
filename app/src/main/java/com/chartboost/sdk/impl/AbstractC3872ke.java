package com.chartboost.sdk.impl;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.ironsource.C11744X3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ke */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3872ke {

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ke$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f15119a;

        static {
            int[] iArr = new int[EnumC3849je.values().length];
            try {
                iArr[EnumC3849je.PORTRAIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3849je.PORTRAIT_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3849je.PORTRAIT_REVERSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3849je.PORTRAIT_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC3849je.LANDSCAPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC3849je.LANDSCAPE_LEFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC3849je.LANDSCAPE_REVERSE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC3849je.LANDSCAPE_RIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f15119a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final int m18418a(Context context) {
        Display defaultDisplay;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return 0;
        }
        return defaultDisplay.getRotation();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        if (r5 != false) goto L20;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.chartboost.sdk.impl.EnumC3849je m18419a(android.content.Context r5, com.chartboost.sdk.impl.C4021r6 r6) {
        /*
            if (r5 != 0) goto L5
            com.chartboost.sdk.impl.je r5 = com.chartboost.sdk.impl.EnumC3849je.PORTRAIT
            return r5
        L5:
            com.chartboost.sdk.impl.s6 r6 = r6.m19302a()     // Catch: java.lang.Exception -> L6b
            int r0 = m18418a(r5)     // Catch: java.lang.Exception -> L6b
            int r1 = r6.m19388b()     // Catch: java.lang.Exception -> L6b
            int r2 = r6.m19387a()     // Catch: java.lang.Exception -> L6b
            r3 = 1
            r4 = 2
            if (r1 != r2) goto L26
            android.content.res.Resources r5 = r5.getResources()     // Catch: java.lang.Exception -> L6b
            android.content.res.Configuration r5 = r5.getConfiguration()     // Catch: java.lang.Exception -> L6b
            int r5 = r5.orientation     // Catch: java.lang.Exception -> L6b
            if (r5 == r4) goto L32
            goto L30
        L26:
            int r5 = r6.m19388b()     // Catch: java.lang.Exception -> L6b
            int r6 = r6.m19387a()     // Catch: java.lang.Exception -> L6b
            if (r5 >= r6) goto L32
        L30:
            r5 = r3
            goto L33
        L32:
            r5 = 0
        L33:
            r6 = 3
            if (r0 == 0) goto L3b
            if (r0 == r4) goto L3b
            if (r5 != 0) goto L54
            goto L3d
        L3b:
            if (r5 == 0) goto L54
        L3d:
            if (r0 == 0) goto L51
            if (r0 == r3) goto L4e
            if (r0 == r4) goto L4b
            if (r0 == r6) goto L48
            com.chartboost.sdk.impl.je r5 = com.chartboost.sdk.impl.EnumC3849je.PORTRAIT     // Catch: java.lang.Exception -> L6b
            return r5
        L48:
            com.chartboost.sdk.impl.je r5 = com.chartboost.sdk.impl.EnumC3849je.LANDSCAPE_RIGHT     // Catch: java.lang.Exception -> L6b
            return r5
        L4b:
            com.chartboost.sdk.impl.je r5 = com.chartboost.sdk.impl.EnumC3849je.PORTRAIT_REVERSE     // Catch: java.lang.Exception -> L6b
            return r5
        L4e:
            com.chartboost.sdk.impl.je r5 = com.chartboost.sdk.impl.EnumC3849je.LANDSCAPE_LEFT     // Catch: java.lang.Exception -> L6b
            return r5
        L51:
            com.chartboost.sdk.impl.je r5 = com.chartboost.sdk.impl.EnumC3849je.PORTRAIT     // Catch: java.lang.Exception -> L6b
            return r5
        L54:
            if (r0 == 0) goto L68
            if (r0 == r3) goto L65
            if (r0 == r4) goto L62
            if (r0 == r6) goto L5f
            com.chartboost.sdk.impl.je r5 = com.chartboost.sdk.impl.EnumC3849je.LANDSCAPE     // Catch: java.lang.Exception -> L6b
            return r5
        L5f:
            com.chartboost.sdk.impl.je r5 = com.chartboost.sdk.impl.EnumC3849je.PORTRAIT_RIGHT     // Catch: java.lang.Exception -> L6b
            return r5
        L62:
            com.chartboost.sdk.impl.je r5 = com.chartboost.sdk.impl.EnumC3849je.LANDSCAPE_REVERSE     // Catch: java.lang.Exception -> L6b
            return r5
        L65:
            com.chartboost.sdk.impl.je r5 = com.chartboost.sdk.impl.EnumC3849je.PORTRAIT_LEFT     // Catch: java.lang.Exception -> L6b
            return r5
        L68:
            com.chartboost.sdk.impl.je r5 = com.chartboost.sdk.impl.EnumC3849je.LANDSCAPE     // Catch: java.lang.Exception -> L6b
            return r5
        L6b:
            r5 = move-exception
            java.lang.String r6 = "Cannot getOrientation"
            com.chartboost.sdk.impl.C4048sb.m19410b(r6, r5)
            com.chartboost.sdk.impl.je r5 = com.chartboost.sdk.impl.EnumC3849je.LANDSCAPE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.AbstractC3872ke.m18419a(android.content.Context, com.chartboost.sdk.impl.r6):com.chartboost.sdk.impl.je");
    }

    /* JADX INFO: renamed from: a */
    public static final void m18420a(Activity activity, C3920mg c3920mg) {
        if (activity == null || m18422a(activity) || c3920mg == null || !c3920mg.m18672k() || !c3920mg.m18673m()) {
            return;
        }
        activity.setRequestedOrientation(-1);
    }

    /* JADX INFO: renamed from: a */
    public static final void m18421a(Activity activity, C3920mg c3920mg, C4021r6 displayMeasurement) {
        Intrinsics.checkNotNullParameter(displayMeasurement, "displayMeasurement");
        if (activity == null || m18422a(activity) || c3920mg == null) {
            return;
        }
        int i = 1;
        if (c3920mg.m18672k() && c3920mg.m18673m()) {
            switch (a.f15119a[m18419a(activity, displayMeasurement).ordinal()]) {
                case 1:
                case 2:
                    break;
                case 3:
                case 4:
                    i = 9;
                    break;
                case 5:
                case 6:
                    i = 0;
                    break;
                default:
                    i = 8;
                    break;
            }
            activity.setRequestedOrientation(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m18422a(Activity activity) {
        View decorView;
        Drawable background;
        if (activity == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT != 26 || activity.getApplicationInfo().targetSdkVersion <= 26) {
            return false;
        }
        Window window = activity.getWindow();
        return window == null || (decorView = window.getDecorView()) == null || (background = decorView.getBackground()) == null || background.getAlpha() != 255;
    }

    /* JADX INFO: renamed from: b */
    public static final String m18423b(Context context, C4021r6 displayMeasurement) {
        Intrinsics.checkNotNullParameter(displayMeasurement, "displayMeasurement");
        switch (a.f15119a[m18419a(context, displayMeasurement).ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return C11744X3.i.f26322D;
            case 5:
            case 6:
            case 7:
            case 8:
                return C11744X3.i.f26320C;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m18424c(Context context, C4021r6 displayMeasurement) {
        Intrinsics.checkNotNullParameter(displayMeasurement, "displayMeasurement");
        EnumC3849je enumC3849jeM18419a = m18419a(context, displayMeasurement);
        return enumC3849jeM18419a == EnumC3849je.PORTRAIT || enumC3849jeM18419a == EnumC3849je.PORTRAIT_REVERSE || enumC3849jeM18419a == EnumC3849je.PORTRAIT_LEFT || enumC3849jeM18419a == EnumC3849je.PORTRAIT_RIGHT;
    }
}

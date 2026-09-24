package com.chartboost.sdk.impl;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.r6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4021r6 {

    /* JADX INFO: renamed from: a */
    public final WindowManager f16123a;

    /* JADX INFO: renamed from: b */
    public final DisplayMetrics f16124b;

    /* JADX INFO: renamed from: c */
    public final Function0 f16125c;

    /* JADX INFO: renamed from: d */
    public final DisplayMetrics f16126d;

    /* JADX INFO: renamed from: e */
    public final float f16127e;

    /* JADX INFO: renamed from: f */
    public final int f16128f;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r6$a */
    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final a f16129b = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
    }

    public C4021r6(WindowManager windowManager, DisplayMetrics displayMetrics, Function0 androidVersion, DisplayMetrics realDisplayMetrics) {
        Intrinsics.checkNotNullParameter(windowManager, "windowManager");
        Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
        Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
        Intrinsics.checkNotNullParameter(realDisplayMetrics, "realDisplayMetrics");
        this.f16123a = windowManager;
        this.f16124b = displayMetrics;
        this.f16125c = androidVersion;
        this.f16126d = realDisplayMetrics;
        this.f16127e = displayMetrics.density;
        this.f16128f = displayMetrics.densityDpi;
    }

    public /* synthetic */ C4021r6(WindowManager windowManager, DisplayMetrics displayMetrics, Function0 function0, DisplayMetrics displayMetrics2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(windowManager, displayMetrics, (i & 4) != 0 ? a.f16129b : function0, (i & 8) != 0 ? new DisplayMetrics() : displayMetrics2);
    }

    /* JADX INFO: renamed from: a */
    public final C4043s6 m19302a() {
        try {
            if (((Number) this.f16125c.invoke()).intValue() >= 30) {
                return m19303a(this.f16123a);
            }
            DisplayMetrics displayMetrics = this.f16124b;
            return new C4043s6(displayMetrics.widthPixels, displayMetrics.heightPixels);
        } catch (Exception e) {
            C4048sb.m19410b("Cannot create device size", e);
            return new C4043s6(0, 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public final C4043s6 m19303a(WindowManager windowManager) {
        WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "getCurrentWindowMetrics(...)");
        WindowInsets windowInsets = currentWindowMetrics.getWindowInsets();
        Intrinsics.checkNotNullExpressionValue(windowInsets, "getWindowInsets(...)");
        Insets insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout());
        Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
        int i = insetsIgnoringVisibility.right + insetsIgnoringVisibility.left;
        int i2 = insetsIgnoringVisibility.top + insetsIgnoringVisibility.bottom;
        Rect bounds = currentWindowMetrics.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        return new C4043s6(bounds.width() - i, bounds.height() - i2);
    }

    /* JADX INFO: renamed from: b */
    public final float m19304b() {
        return this.f16127e;
    }

    /* JADX INFO: renamed from: c */
    public final int m19305c() {
        return this.f16128f;
    }

    /* JADX INFO: renamed from: d */
    public final C4043s6 m19306d() {
        try {
            if (((Number) this.f16125c.invoke()).intValue() >= 30) {
                Rect bounds = this.f16123a.getCurrentWindowMetrics().getBounds();
                return new C4043s6(bounds.width(), bounds.height());
            }
            this.f16126d.setTo(this.f16124b);
            Display defaultDisplay = this.f16123a.getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getRealMetrics(this.f16126d);
            }
            DisplayMetrics displayMetrics = this.f16126d;
            return new C4043s6(displayMetrics.widthPixels, displayMetrics.heightPixels);
        } catch (Exception e) {
            C4048sb.m19410b("Cannot create size", e);
            return new C4043s6(0, 0);
        }
    }
}

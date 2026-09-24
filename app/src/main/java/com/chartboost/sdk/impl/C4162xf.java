package com.chartboost.sdk.impl;

import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.xf */
/* JADX INFO: loaded from: classes3.dex */
public final class C4162xf {

    /* JADX INFO: renamed from: a */
    public final WeakReference f16945a;

    public C4162xf(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f16945a = new WeakReference(activity);
    }

    /* JADX INFO: renamed from: a */
    public final DisplayMetrics m19960a() {
        Activity activity = (Activity) this.f16945a.get();
        if (activity != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics;
        }
        DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "getDisplayMetrics(...)");
        return displayMetrics2;
    }

    /* JADX INFO: renamed from: b */
    public final C4140wf m19961b() {
        DisplayMetrics displayMetricsM19960a = m19960a();
        int i = displayMetricsM19960a.widthPixels;
        int i2 = displayMetricsM19960a.heightPixels;
        float f = displayMetricsM19960a.density;
        WindowInsetsCompat windowInsetsCompatM19962c = m19962c();
        if (windowInsetsCompatM19962c == null) {
            return new C4140wf(i, i2, f, null, null, 24, null);
        }
        Insets insets = windowInsetsCompatM19962c.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
        DisplayCutoutCompat displayCutout = windowInsetsCompatM19962c.getDisplayCutout();
        Insets insetsM97of = displayCutout != null ? Insets.m97of(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom()) : Insets.NONE;
        Intrinsics.checkNotNull(insetsM97of);
        Insets insetsM97of2 = Insets.m97of(Math.max(insets.left, insetsM97of.left), Math.max(insets.top, insetsM97of.top), Math.max(insets.right, insetsM97of.right), Math.max(insets.bottom, insetsM97of.bottom));
        Intrinsics.checkNotNullExpressionValue(insetsM97of2, "of(...)");
        int i3 = (i - insetsM97of2.left) - insetsM97of2.right;
        int i4 = (i2 - insetsM97of2.top) - insetsM97of2.bottom;
        C4048sb.m19413c("VAST rendering container computed: width=" + i3 + ", height=" + i4 + ", density=" + f, null, 2, null);
        return new C4140wf(i3, i4, f, null, insetsM97of2, 8, null);
    }

    /* JADX INFO: renamed from: c */
    public final WindowInsetsCompat m19962c() {
        Window window;
        View decorView;
        Activity activity = (Activity) this.f16945a.get();
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(decorView);
        C4048sb.m19408a("Window insets retrieved: " + rootWindowInsets, (Throwable) null, 2, (Object) null);
        return rootWindowInsets;
    }
}

package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.cd */
/* JADX INFO: loaded from: classes3.dex */
public final class C3687cd {

    /* JADX INFO: renamed from: a */
    public Context f13699a;

    /* JADX INFO: renamed from: b */
    public C3710dd f13700b;

    /* JADX INFO: renamed from: c */
    public C3710dd f13701c;

    /* JADX INFO: renamed from: d */
    public C3710dd f13702d;

    /* JADX INFO: renamed from: e */
    public C3710dd f13703e;

    public C3687cd(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f13699a = context;
        this.f13700b = new C3710dd(context);
        this.f13701c = new C3710dd(this.f13699a);
        this.f13702d = new C3710dd(this.f13699a);
        this.f13703e = new C3710dd(this.f13699a);
    }

    /* JADX INFO: renamed from: a */
    public final C3710dd m17160a() {
        return this.f13703e;
    }

    /* JADX INFO: renamed from: a */
    public final void m17161a(int i, int i2) {
        this.f13701c.m17280a(i, i2);
    }

    /* JADX INFO: renamed from: a */
    public final void m17162a(int i, int i2, int i3, int i4) {
        this.f13703e.m17281a(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: a */
    public final void m17163a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        DisplayMetrics displayMetrics = this.f13699a.getResources().getDisplayMetrics();
        m17165b(displayMetrics.widthPixels, displayMetrics.heightPixels);
        View rootView = view.getRootView();
        if (rootView == null) {
            rootView = view;
        }
        m17161a(rootView.getWidth(), rootView.getHeight());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        m17162a(iArr[0], iArr[1], view.getWidth(), view.getHeight());
        m17166b(iArr[0], iArr[1], view.getWidth(), view.getHeight());
    }

    /* JADX INFO: renamed from: b */
    public final C3710dd m17164b() {
        return this.f13702d;
    }

    /* JADX INFO: renamed from: b */
    public final void m17165b(int i, int i2) {
        this.f13700b.m17280a(i, i2);
    }

    /* JADX INFO: renamed from: b */
    public final void m17166b(int i, int i2, int i3, int i4) {
        this.f13702d.m17281a(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: c */
    public final C3710dd m17167c() {
        return this.f13701c;
    }

    /* JADX INFO: renamed from: d */
    public final C3710dd m17168d() {
        return this.f13700b;
    }
}

package com.chartboost.sdk.impl;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C3926n extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a */
    public final float f15412a;

    /* JADX INFO: renamed from: b */
    public final Function0 f15413b;

    /* JADX INFO: renamed from: c */
    public boolean f15414c;

    public C3926n(float f, Function0 onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f15412a = f;
        this.f15413b = onClick;
    }

    public /* synthetic */ C3926n(float f, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 10.0f : f, function0);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f15414c = false;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent e2, float f, float f2) {
        Intrinsics.checkNotNullParameter(e2, "e2");
        this.f15414c = ((float) Math.hypot((double) f, (double) f2)) > this.f15412a;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (this.f15414c) {
            return false;
        }
        this.f15413b.invoke();
        return true;
    }
}

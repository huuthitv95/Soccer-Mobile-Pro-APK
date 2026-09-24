package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.yg */
/* JADX INFO: loaded from: classes3.dex */
public final class C4185yg extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a */
    public final GestureDetector f17060a;

    /* JADX INFO: renamed from: b */
    public boolean f17061b;

    public C4185yg(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f17060a = new GestureDetector(context, this);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m20061a() {
        return this.f17061b;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m20062a(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return this.f17060a.onTouchEvent(event);
    }

    /* JADX INFO: renamed from: b */
    public final void m20063b() {
        this.f17061b = false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f17061b = true;
        return super.onSingleTapUp(e);
    }
}

package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ed */
/* JADX INFO: loaded from: classes9.dex */
public final class C3733ed extends WebView {

    /* JADX INFO: renamed from: a */
    public final GestureDetector f14072a;

    /* JADX INFO: renamed from: b */
    public boolean f14073b;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ed$a */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            C3733ed.this.f14073b = true;
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3733ed(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f14072a = new GestureDetector(context, new a());
    }

    /* JADX INFO: renamed from: a */
    public final void m17545a() {
        this.f14073b = false;
    }

    public final boolean getGestureDetected() {
        return this.f14073b;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f14072a.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}

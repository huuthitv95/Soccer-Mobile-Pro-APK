package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ph */
/* JADX INFO: loaded from: classes3.dex */
public final class C3988ph extends View {

    /* JADX INFO: renamed from: h */
    public static final a f15822h = new a(null);

    /* JADX INFO: renamed from: i */
    public static final int f15823i = -436207617;

    /* JADX INFO: renamed from: j */
    public static final int f15824j = -1711276033;

    /* JADX INFO: renamed from: k */
    public static final int f15825k = -15262682;

    /* JADX INFO: renamed from: a */
    public final InterfaceC3680c6 f15826a;

    /* JADX INFO: renamed from: b */
    public final Lazy f15827b;

    /* JADX INFO: renamed from: c */
    public final Lazy f15828c;

    /* JADX INFO: renamed from: d */
    public final Lazy f15829d;

    /* JADX INFO: renamed from: e */
    public final RectF f15830e;

    /* JADX INFO: renamed from: f */
    public float f15831f;

    /* JADX INFO: renamed from: g */
    public float f15832g;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ph$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m19073a() {
            return C3988ph.f15823i;
        }

        /* JADX INFO: renamed from: b */
        public final int m19074b() {
            return C3988ph.f15824j;
        }

        /* JADX INFO: renamed from: c */
        public final int m19075c() {
            return C3988ph.f15825k;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ph$b */
    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint invoke() {
            Paint paint = new Paint(1);
            C3988ph c3988ph = C3988ph.this;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(c3988ph.f15826a.mo17043a(2));
            paint.setColor(C3988ph.f15822h.m19074b());
            paint.setStrokeCap(Paint.Cap.ROUND);
            return paint;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ph$c */
    public static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final c f15834b = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint invoke() {
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(C3988ph.f15822h.m19075c());
            return paint;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ph$d */
    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint invoke() {
            Paint paint = new Paint(1);
            C3988ph c3988ph = C3988ph.this;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(c3988ph.f15826a.mo17043a(2));
            paint.setColor(C3988ph.f15822h.m19073a());
            paint.setStrokeCap(Paint.Cap.ROUND);
            return paint;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3988ph(Context context, AttributeSet attributeSet, int i, InterfaceC3680c6 densityProvider) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(densityProvider, "densityProvider");
        this.f15826a = densityProvider;
        this.f15827b = LazyKt.lazy(c.f15834b);
        this.f15828c = LazyKt.lazy(new b());
        this.f15829d = LazyKt.lazy(new d());
        this.f15830e = new RectF();
        this.f15831f = 1.0f;
        this.f15832g = -1.0f;
    }

    private final Paint getArcBackgroundPaint() {
        return (Paint) this.f15828c.getValue();
    }

    public final int getArcColor() {
        return getProgressPaint().getColor();
    }

    public final Paint getBackgroundPaint() {
        return (Paint) this.f15827b.getValue();
    }

    public final int getBackgroundPaintColor() {
        return getBackgroundPaint().getColor();
    }

    public final float getProgress() {
        return this.f15831f;
    }

    public final Paint getProgressPaint() {
        return (Paint) this.f15829d.getValue();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawCircle(this.f15830e.centerX(), this.f15830e.centerY(), this.f15830e.width() / 2, getBackgroundPaint());
        canvas.drawArc(this.f15830e, 0.0f, 360.0f, false, getArcBackgroundPaint());
        float f = this.f15831f;
        if (f > 0.0f) {
            canvas.drawArc(this.f15830e, -90.0f, f * 360.0f, false, getProgressPaint());
        }
        this.f15832g = this.f15831f;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float strokeWidth = getProgressPaint().getStrokeWidth() / 2;
        this.f15830e.set(strokeWidth, strokeWidth, i - strokeWidth, i2 - strokeWidth);
    }

    public final void setArcColor(int i) {
        getProgressPaint().setColor(i);
        invalidate();
    }

    public final void setBackgroundPaintColor(int i) {
        getBackgroundPaint().setColor(i);
        invalidate();
    }

    public final void setProgress(float f) {
        float fCoerceIn = RangesKt.coerceIn(f, 0.0f, 1.0f);
        if (fCoerceIn != this.f15831f || this.f15832g == -1.0f) {
            this.f15831f = fCoerceIn;
            this.f15832g = fCoerceIn;
            invalidate();
        }
    }
}

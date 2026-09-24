package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.utils.C3583qd;

/* JADX INFO: loaded from: classes3.dex */
public class slm extends View {

    /* JADX INFO: renamed from: di */
    private float f11851di;

    /* JADX INFO: renamed from: fi */
    private Drawable f11852fi;

    /* JADX INFO: renamed from: ik */
    private int f11853ik;

    /* JADX INFO: renamed from: ka */
    private Drawable f11854ka;

    /* JADX INFO: renamed from: lr */
    private final boolean f11855lr;

    /* JADX INFO: renamed from: ri */
    private final Path f11856ri;

    public slm(Context context) {
        this(context, false);
    }

    public slm(Context context, boolean z) {
        super(context);
        this.f11856ri = new Path();
        this.f11855lr = z;
        m15097ri();
    }

    /* JADX INFO: renamed from: lr */
    private void m15096lr() {
        int width = getWidth();
        int height = getHeight();
        if (this.f11851di <= 0.0f || width <= 0 || height <= 0) {
            return;
        }
        this.f11856ri.reset();
        this.f11856ri.addRect(new RectF(0.0f, 0.0f, width * this.f11851di, height), Path.Direction.CCW);
    }

    /* JADX INFO: renamed from: ri */
    private void m15097ri() {
        Context context = getContext();
        this.f11854ka = C2729uq.m10303ik(context, this.f11855lr ? "tt_star_thick_dark" : "tt_star_thick");
        this.f11852fi = C2729uq.m10303ik(context, "tt_star");
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f11853ik <= 0) {
            return;
        }
        int iSave = canvas.save();
        for (int i = 0; i < 5; i++) {
            this.f11854ka.draw(canvas);
            canvas.translate(this.f11853ik, 0.0f);
        }
        canvas.restoreToCount(iSave);
        canvas.clipPath(this.f11856ri);
        for (int i2 = 0; i2 < 5; i2++) {
            this.f11852fi.draw(canvas);
            canvas.translate(this.f11853ik, 0.0f);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f11853ik * 5, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f11853ik, 1073741824));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m15096lr();
    }

    /* JADX INFO: renamed from: ri */
    public void m15098ri(double d, int i) {
        int iM16603ri = (int) C3583qd.m16603ri(getContext(), i, false);
        this.f11853ik = iM16603ri;
        this.f11854ka.setBounds(0, 0, iM16603ri, iM16603ri);
        Drawable drawable = this.f11852fi;
        int i2 = this.f11853ik;
        drawable.setBounds(0, 0, i2, i2);
        this.f11851di = ((float) d) / 5.0f;
        m15096lr();
        requestLayout();
    }
}

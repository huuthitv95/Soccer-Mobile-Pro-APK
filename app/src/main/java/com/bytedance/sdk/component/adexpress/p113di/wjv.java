package com.bytedance.sdk.component.adexpress.p113di;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;
import com.bytedance.sdk.component.adexpress.dynamic.p116fi.C2440sf;
import com.bytedance.sdk.component.adexpress.p124ka.xha;
import com.bytedance.sdk.component.utils.C2729uq;

/* JADX INFO: loaded from: classes3.dex */
public class wjv extends FrameLayout {
    private static final int jbs = (C2440sf.m8415lr("", 0.0f, true)[1] / 2) + 1;

    /* JADX INFO: renamed from: qt */
    private static final int f6397qt = (C2440sf.m8415lr("", 0.0f, true)[1] / 2) + 3;

    /* JADX INFO: renamed from: di */
    private Drawable f6398di;

    /* JADX INFO: renamed from: fi */
    private Drawable f6399fi;

    /* JADX INFO: renamed from: ik */
    private float f6400ik;

    /* JADX INFO: renamed from: ka */
    private float f6401ka;

    /* JADX INFO: renamed from: lr */
    LinearLayout f6402lr;

    /* JADX INFO: renamed from: mj */
    private float f6403mj;

    /* JADX INFO: renamed from: ri */
    LinearLayout f6404ri;
    private double xha;

    public wjv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6404ri = new LinearLayout(getContext());
        this.f6402lr = new LinearLayout(getContext());
        this.f6404ri.setOrientation(0);
        this.f6404ri.setGravity(GravityCompat.START);
        this.f6402lr.setOrientation(0);
        this.f6402lr.setGravity(GravityCompat.START);
        this.f6399fi = C2729uq.m10303ik(context, "tt_star_thick");
        this.f6398di = C2729uq.m10303ik(context, "tt_star");
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.f6400ik, (int) this.f6401ka));
        imageView.setPadding(1, jbs, 1, f6397qt);
        return imageView;
    }

    public Drawable getStarEmptyDrawable() {
        return this.f6399fi;
    }

    public Drawable getStarFillDrawable() {
        return this.f6398di;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f6404ri.measure(i, i2);
        double d = this.xha;
        float f = this.f6400ik;
        this.f6402lr.measure(View.MeasureSpec.makeMeasureSpec((int) (((double) ((((int) d) * f) + 1.0f)) + (((double) (f - 2.0f)) * (d - ((double) ((int) d))))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f6404ri.getMeasuredHeight(), 1073741824));
        if (this.f6403mj > 0.0f) {
            LinearLayout linearLayout = this.f6404ri;
            linearLayout.setPadding(0, ((int) (linearLayout.getMeasuredHeight() - this.f6403mj)) / 2, 0, 0);
            this.f6402lr.setPadding(0, ((int) (this.f6404ri.getMeasuredHeight() - this.f6403mj)) / 2, 0, 0);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m8284ri(double d, int i, int i2, int i3) {
        float f = i2;
        this.f6400ik = (int) xha.m8828ik(getContext(), f);
        this.f6401ka = (int) xha.m8828ik(getContext(), f);
        this.xha = d;
        this.f6403mj = i3;
        removeAllViews();
        for (int i4 = 0; i4 < 5; i4++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.f6402lr.addView(starImageView);
        }
        for (int i5 = 0; i5 < 5; i5++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.f6404ri.addView(starImageView2);
        }
        addView(this.f6404ri);
        addView(this.f6402lr);
        requestLayout();
    }
}

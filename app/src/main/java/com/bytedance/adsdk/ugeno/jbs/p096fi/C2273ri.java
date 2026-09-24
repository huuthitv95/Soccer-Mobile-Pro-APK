package com.bytedance.adsdk.ugeno.jbs.p096fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;
import com.bytedance.adsdk.ugeno.InterfaceC2282ka;
import com.bytedance.adsdk.ugeno.xha.C2345ka;
import com.bytedance.adsdk.ugeno.xha.C2347mj;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.jbs.fi.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2273ri extends FrameLayout {

    /* JADX INFO: renamed from: di */
    private LinearLayout f5716di;

    /* JADX INFO: renamed from: fi */
    private LinearLayout f5717fi;

    /* JADX INFO: renamed from: ik */
    private double f5718ik;

    /* JADX INFO: renamed from: ka */
    private float f5719ka;

    /* JADX INFO: renamed from: lr */
    private float f5720lr;

    /* JADX INFO: renamed from: mj */
    private InterfaceC2282ka f5721mj;

    /* JADX INFO: renamed from: ri */
    private float f5722ri;
    private Context xha;

    public C2273ri(Context context) {
        super(context);
        this.xha = context;
        this.f5717fi = new LinearLayout(context);
        this.f5716di = new LinearLayout(context);
        this.f5717fi.setOrientation(0);
        this.f5717fi.setGravity(GravityCompat.START);
        this.f5716di.setOrientation(0);
        this.f5716di.setGravity(GravityCompat.START);
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) this.f5722ri, (int) this.f5720lr);
        layoutParams.leftMargin = (int) this.f5719ka;
        layoutParams.topMargin = 0;
        layoutParams.rightMargin = (int) this.f5719ka;
        layoutParams.bottomMargin = 1;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC2282ka interfaceC2282ka = this.f5721mj;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.xha();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC2282ka interfaceC2282ka = this.f5721mj;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.mo7698mj();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        InterfaceC2282ka interfaceC2282ka = this.f5721mj;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.mo7737ri(i, i2, i3, i4);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        InterfaceC2282ka interfaceC2282ka = this.f5721mj;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.mo7740ri(i, i2);
        }
        super.onMeasure(i, i2);
        this.f5717fi.measure(i, i2);
        double dFloor = Math.floor(this.f5718ik);
        float f = this.f5719ka;
        float f2 = this.f5722ri;
        this.f5716di.measure(View.MeasureSpec.makeMeasureSpec((int) ((((double) (f + f + f2)) * dFloor) + ((double) f) + ((this.f5718ik - dFloor) * ((double) f2))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f5717fi.getMeasuredHeight(), 1073741824));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        InterfaceC2282ka interfaceC2282ka = this.f5721mj;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.mo7735lr(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    /* JADX INFO: renamed from: ri */
    public void m7676ri(double d, int i, int i2, float f, int i3) {
        removeAllViews();
        this.f5717fi.removeAllViews();
        this.f5716di.removeAllViews();
        this.f5722ri = (int) C2347mj.m8043ri(this.xha, f);
        this.f5720lr = (int) C2347mj.m8043ri(this.xha, f);
        this.f5718ik = d;
        this.f5719ka = i3;
        for (int i4 = 0; i4 < 5; i4++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setImageResource(C2345ka.m8033lr(this.xha, "tt_ugen_rating_star"));
            starImageView.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            this.f5716di.addView(starImageView);
        }
        for (int i5 = 0; i5 < 5; i5++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageResource(C2345ka.m8033lr(this.xha, "tt_ugen_rating_star"));
            starImageView2.setColorFilter(i2);
            this.f5717fi.addView(starImageView2);
        }
        addView(this.f5717fi);
        addView(this.f5716di);
        requestLayout();
    }

    /* JADX INFO: renamed from: ri */
    public void m7677ri(InterfaceC2282ka interfaceC2282ka) {
        this.f5721mj = interfaceC2282ka;
    }
}

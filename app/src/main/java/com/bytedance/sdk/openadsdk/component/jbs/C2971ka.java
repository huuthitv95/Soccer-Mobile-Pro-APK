package com.bytedance.sdk.openadsdk.component.jbs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.adexpress.p124ka.C2496lr;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p217di.C3191fi;
import com.bytedance.sdk.openadsdk.core.p217di.C3192ik;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;
import com.bytedance.sdk.openadsdk.core.widget.C3335bu;
import com.bytedance.sdk.openadsdk.core.widget.C3339ik;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.slm;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.C3586sf;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.jbs.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2971ka extends AbstractC2970ik {

    /* JADX INFO: renamed from: aw */
    private final C3192ik f9018aw;
    private final slm bgr;

    /* JADX INFO: renamed from: bu */
    private final C3191fi f9019bu;
    private final C3193ka slm;

    /* JADX INFO: renamed from: vr */
    private final C3195mj f9020vr;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.jbs.ka$ri */
    private static final class ri extends Drawable {

        /* JADX INFO: renamed from: ka */
        private final boolean f9024ka;

        /* JADX INFO: renamed from: fi */
        private static final int f9022fi = Color.parseColor("#b0000000");

        /* JADX INFO: renamed from: di */
        private static final int f9021di = Color.parseColor("#40000000");

        /* JADX INFO: renamed from: ri */
        private final RectF f9026ri = new RectF();

        /* JADX INFO: renamed from: lr */
        private final Paint f9025lr = new Paint();

        /* JADX INFO: renamed from: ik */
        private final Path f9023ik = new Path();

        public ri(Context context) {
            this.f9024ka = C2496lr.m8822ri(context);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            canvas.drawPath(this.f9023ik, this.f9025lr);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        protected void onBoundsChange(Rect rect) {
            float[] fArr;
            super.onBoundsChange(rect);
            this.f9026ri.set(rect);
            this.f9023ik.reset();
            int iHeight = rect.height() / 2;
            Path path = this.f9023ik;
            RectF rectF = this.f9026ri;
            if (this.f9024ka) {
                float f = iHeight;
                fArr = new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f, f};
            } else {
                float f2 = iHeight;
                fArr = new float[]{0.0f, 0.0f, f2, f2, f2, f2, 0.0f, 0.0f};
            }
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            float f3 = rect.right;
            boolean z = this.f9024ka;
            this.f9025lr.setShader(new LinearGradient(0.0f, 0.0f, f3, 0.0f, new int[]{z ? f9021di : f9022fi, z ? f9022fi : f9021di}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public C2971ka(Context context, wjv wjvVar) {
        super(context);
        setId(520093753);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setBackgroundColor(0);
        int iM16589lr = C3583qd.m16589lr(context, 8.0f);
        int iM16589lr2 = C3583qd.m16589lr(context, 9.0f);
        int iM16589lr3 = C3583qd.m16589lr(context, 10.0f);
        int iM16589lr4 = C3583qd.m16589lr(context, 40.0f);
        this.f9008co = new C3339ik(context);
        this.f9008co.setPadding(iM16589lr2, 0, iM16589lr2, 0);
        this.f9008co.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C3583qd.m16589lr(context, 32.0f), C3583qd.m16589lr(context, 14.0f));
        layoutParams.addRule(12);
        layoutParams.addRule(11);
        layoutParams.setMargins(0, 0, iM16589lr3, iM16589lr3);
        this.f9008co.setLayoutParams(layoutParams);
        C3192ik c3192ik = new C3192ik(context);
        this.f9018aw = c3192ik;
        c3192ik.setBackgroundColor(-1);
        c3192ik.setId(520093758);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, C3583qd.m16589lr(context, 107.0f));
        layoutParams2.addRule(12);
        c3192ik.setLayoutParams(layoutParams2);
        C3191fi c3191fi = new C3191fi(context);
        c3191fi.setOrientation(0);
        c3191fi.setGravity(16);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        c3191fi.setLayoutParams(layoutParams3);
        c3192ik.addView(c3191fi);
        this.f9009di = new C3335bu(context);
        this.f9009di.setId(520093759);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(iM16589lr4, iM16589lr4);
        layoutParams4.rightMargin = iM16589lr;
        layoutParams4.setMarginEnd(iM16589lr);
        this.f9009di.setLayoutParams(layoutParams4);
        this.xha = new C3195mj(context);
        this.xha.setId(520093761);
        this.xha.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.xha.setEllipsize(TextUtils.TruncateAt.END);
        this.xha.setMaxLines(2);
        this.xha.setTextColor(Color.parseColor("#161823"));
        this.xha.setTextSize(30.0f);
        c3191fi.addView(this.f9009di);
        c3191fi.addView(this.xha);
        C3192ik c3192ik2 = new C3192ik(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams5.addRule(2, c3192ik.getId());
        layoutParams5.addRule(10);
        c3192ik2.setLayoutParams(layoutParams5);
        this.f9016ri = new C3193ka(context);
        this.f9016ri.setId(520093754);
        this.f9016ri.setScaleType(ImageView.ScaleType.CENTER_CROP);
        c3192ik2.addView(this.f9016ri, new FrameLayout.LayoutParams(-1, -1));
        this.f9013lr = new C3192ik(context);
        this.f9013lr.setId(520093755);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams6.gravity = 17;
        c3192ik2.addView(this.f9013lr, layoutParams6);
        this.f9011ik = new C3193ka(context);
        this.f9011ik.setId(520093756);
        c3192ik2.addView(this.f9011ik, new FrameLayout.LayoutParams(-1, -1));
        this.f9010fi = new C3195mj(context);
        this.f9010fi.setId(520093717);
        this.f9010fi.setBackground(C3586sf.m16644ri(context, Color.parseColor("#b3000000"), 24));
        this.f9010fi.setEllipsize(TextUtils.TruncateAt.END);
        this.f9010fi.setGravity(17);
        this.f9010fi.setSingleLine(true);
        this.f9010fi.setText(C2729uq.m10311ri(context, "tt_video_download_apk"));
        this.f9010fi.setTextColor(-1);
        this.f9010fi.setTextSize(1, 16.0f);
        this.f9010fi.setTag("open_ad_click_button_tag");
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(C3583qd.m16589lr(context, 236.0f), C3583qd.m16589lr(context, 48.0f));
        layoutParams7.gravity = 81;
        layoutParams7.bottomMargin = C3583qd.m16589lr(context, 32.0f);
        c3192ik2.addView(this.f9010fi, layoutParams7);
        C3191fi c3191fi2 = new C3191fi(context);
        this.f9019bu = c3191fi2;
        c3191fi2.setOrientation(0);
        c3191fi2.setGravity(16);
        c3191fi2.setBackground(new ri(context));
        c3191fi2.setPadding(C3583qd.m16589lr(context, 16.0f), C3583qd.m16589lr(context, 8.0f), C3583qd.m16589lr(context, 16.0f), C3583qd.m16589lr(context, 8.0f));
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams8.addRule(10);
        layoutParams8.topMargin = C3583qd.m16589lr(context, 90.0f);
        c3191fi2.setLayoutParams(layoutParams8);
        C3335bu c3335bu = new C3335bu(context);
        this.slm = c3335bu;
        c3191fi2.addView(c3335bu, new LinearLayout.LayoutParams(C3583qd.m16589lr(context, 36.0f), C3583qd.m16589lr(context, 36.0f)));
        C3191fi c3191fi3 = new C3191fi(context);
        c3191fi3.setOrientation(1);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams9.leftMargin = C3583qd.m16589lr(context, 8.0f);
        c3191fi2.addView(c3191fi3, layoutParams9);
        C3195mj c3195mj = new C3195mj(context);
        this.f9020vr = c3195mj;
        c3195mj.setTextColor(-1);
        c3191fi3.addView(c3195mj, new LinearLayout.LayoutParams(-2, -2));
        slm slmVar = new slm(context, true);
        this.bgr = slmVar;
        c3191fi3.addView(slmVar, new LinearLayout.LayoutParams(-2, -2));
        this.f9012ka = PAGLogoView.createPAGLogoViewByMaterial(context, wjvVar);
        this.f9012ka.setId(520093757);
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-2, C3583qd.m16589lr(context, 14.0f));
        layoutParams10.gravity = 83;
        c3192ik2.addView(this.f9012ka, layoutParams10);
        addView(c3192ik2);
        addView(this.f9008co);
        addView(c3192ik);
        addView(this.f9014mj);
        addView(c3191fi2);
    }

    @Override // com.bytedance.sdk.openadsdk.component.jbs.AbstractC2970ik
    public C3193ka getAdIconView() {
        return this.slm;
    }

    @Override // com.bytedance.sdk.openadsdk.component.jbs.AbstractC2970ik
    public C3195mj getAdTitleTextView() {
        return this.f9020vr;
    }

    @Override // com.bytedance.sdk.openadsdk.component.jbs.AbstractC2970ik
    public C3191fi getOverlayLayout() {
        return this.f9019bu;
    }

    @Override // com.bytedance.sdk.openadsdk.component.jbs.AbstractC2970ik
    public slm getScoreBar() {
        return this.bgr;
    }

    @Override // com.bytedance.sdk.openadsdk.component.jbs.AbstractC2970ik
    public View getUserInfo() {
        return this.f9018aw;
    }
}

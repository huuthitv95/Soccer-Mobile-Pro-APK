package com.mbridge.msdk.dycreator.baseview.rewardpopview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes5.dex */
public class MBGradientAndShadowTextView extends TextView {

    /* JADX INFO: renamed from: a */
    private int f35158a;

    /* JADX INFO: renamed from: b */
    private int f35159b;

    /* JADX INFO: renamed from: c */
    private int f35160c;

    /* JADX INFO: renamed from: d */
    private int f35161d;

    /* JADX INFO: renamed from: e */
    private LinearGradient f35162e;
    public float mShadowDx;
    public float mShadowDy;
    public float mShadowRadius;

    public static class GradientAndShadowParameters {
        public int gradientEndColor;
        public int gradientStartColor;
        public int shadowColor;
        public int textSize = 40;
        public float shadowRadius = 3.0f;
        public float shadowDx = 1.5f;
        public float shadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context) {
        super(context);
        this.f35158a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f35159b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f35160c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f35161d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        m36288a();
    }

    /* JADX INFO: renamed from: a */
    private void m36288a() {
        setTextSize(this.f35161d);
        setTypeface(Typeface.defaultFromStyle(3));
        this.f35162e = new LinearGradient(0.0f, 0.0f, 0.0f, getTextSize(), this.f35158a, this.f35159b, Shader.TileMode.CLAMP);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        getPaint().setShader(null);
        getPaint().setShadowLayer(3.0f, 1.5f, 1.8f, this.f35160c);
        super.onDraw(canvas);
        getPaint().clearShadowLayer();
        getPaint().setShader(this.f35162e);
        super.onDraw(canvas);
    }

    public MBGradientAndShadowTextView(Context context, GradientAndShadowParameters gradientAndShadowParameters) {
        super(context);
        this.f35158a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f35159b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f35160c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f35161d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        if (gradientAndShadowParameters != null) {
            this.f35158a = gradientAndShadowParameters.gradientStartColor;
            this.f35159b = gradientAndShadowParameters.gradientEndColor;
            this.f35160c = gradientAndShadowParameters.shadowColor;
            this.f35161d = gradientAndShadowParameters.textSize;
            this.mShadowRadius = gradientAndShadowParameters.shadowRadius;
            this.mShadowDx = gradientAndShadowParameters.shadowDx;
            this.mShadowDy = gradientAndShadowParameters.shadowDy;
        }
        m36288a();
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35158a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f35159b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f35160c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f35161d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35158a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f35159b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f35160c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f35161d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f35158a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f35159b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f35160c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f35161d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }
}

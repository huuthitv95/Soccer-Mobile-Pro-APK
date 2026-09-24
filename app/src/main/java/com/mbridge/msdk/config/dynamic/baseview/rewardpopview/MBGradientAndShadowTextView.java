package com.mbridge.msdk.config.dynamic.baseview.rewardpopview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewConst;

/* JADX INFO: loaded from: classes5.dex */
public class MBGradientAndShadowTextView extends TextView {

    /* JADX INFO: renamed from: a */
    private int f34620a;

    /* JADX INFO: renamed from: b */
    private int f34621b;

    /* JADX INFO: renamed from: c */
    private int f34622c;

    /* JADX INFO: renamed from: d */
    private int f34623d;

    /* JADX INFO: renamed from: e */
    private LinearGradient f34624e;
    public float mShadowDx;
    public float mShadowDy;
    public float mShadowRadius;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.rewardpopview.MBGradientAndShadowTextView$a */
    public static class C12883a {

        /* JADX INFO: renamed from: a */
        public int f34625a;

        /* JADX INFO: renamed from: b */
        public int f34626b;

        /* JADX INFO: renamed from: c */
        public int f34627c;

        /* JADX INFO: renamed from: d */
        public int f34628d = 40;

        /* JADX INFO: renamed from: e */
        public float f34629e = 3.0f;

        /* JADX INFO: renamed from: f */
        public float f34630f = 1.5f;

        /* JADX INFO: renamed from: g */
        public float f34631g = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context) {
        super(context);
        this.f34620a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f34621b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f34622c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f34623d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        m35967a();
    }

    /* JADX INFO: renamed from: a */
    private void m35967a() {
        setTextSize(this.f34623d);
        setTypeface(Typeface.defaultFromStyle(3));
        this.f34624e = new LinearGradient(0.0f, 0.0f, 0.0f, getTextSize(), this.f34620a, this.f34621b, Shader.TileMode.CLAMP);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        getPaint().setShader(null);
        getPaint().setShadowLayer(3.0f, 1.5f, 1.8f, this.f34622c);
        super.onDraw(canvas);
        getPaint().clearShadowLayer();
        getPaint().setShader(this.f34624e);
        super.onDraw(canvas);
    }

    public MBGradientAndShadowTextView(Context context, C12883a c12883a) {
        super(context);
        this.f34620a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f34621b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f34622c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f34623d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        if (c12883a != null) {
            this.f34620a = c12883a.f34625a;
            this.f34621b = c12883a.f34626b;
            this.f34622c = c12883a.f34627c;
            this.f34623d = c12883a.f34628d;
            this.mShadowRadius = c12883a.f34629e;
            this.mShadowDx = c12883a.f34630f;
            this.mShadowDy = c12883a.f34631g;
        }
        m35967a();
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34620a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f34621b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f34622c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f34623d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34620a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f34621b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f34622c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f34623d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f34620a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f34621b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f34622c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f34623d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }
}

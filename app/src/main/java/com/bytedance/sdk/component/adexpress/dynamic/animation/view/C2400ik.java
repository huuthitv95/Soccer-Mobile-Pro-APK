package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.internal.view.SupportMenu;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2425sf;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.xha;
import com.bytedance.sdk.component.adexpress.p126ri.p129ri.C2531ri;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.view.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2400ik {

    /* JADX INFO: renamed from: di */
    private int f6431di;

    /* JADX INFO: renamed from: fi */
    private int f6432fi;

    /* JADX INFO: renamed from: ka */
    private int f6434ka;

    /* JADX INFO: renamed from: ri */
    Paint f6436ri;

    /* JADX INFO: renamed from: lr */
    Path f6435lr = new Path();

    /* JADX INFO: renamed from: ik */
    Path f6433ik = new Path();

    public C2400ik() {
        Paint paint = new Paint();
        this.f6436ri = paint;
        paint.setAntiAlias(true);
    }

    /* JADX INFO: renamed from: ri */
    public void m8303ri(Canvas canvas, IAnimation iAnimation, View view) {
        int iIntValue;
        String str;
        float[] fArrM8691lr;
        int iIntValue2 = 0;
        if (iAnimation.getRippleValue() != 0.0f) {
            if (C2531ri.m9163ri().m9166ik() != null) {
                try {
                    str = (String) view.getTag(2097610712);
                    try {
                        fArrM8691lr = xha.m8691lr(str);
                    } catch (Exception unused) {
                        fArrM8691lr = null;
                    }
                } catch (Exception unused2) {
                    str = "";
                }
                if (str.startsWith("#")) {
                    this.f6436ri.setColor(Color.parseColor(str));
                    this.f6436ri.setAlpha(90);
                } else if (fArrM8691lr != null) {
                    this.f6436ri.setColor(com.bytedance.sdk.component.adexpress.p124ka.xha.m8834ri(fArrM8691lr[3] * (1.0f - iAnimation.getRippleValue()), fArrM8691lr[0] / 256.0f, fArrM8691lr[1] / 256.0f, fArrM8691lr[2] / 256.0f));
                }
            }
            ((ViewGroup) view.getParent()).setClipChildren(true);
            int i = this.f6434ka;
            int i2 = this.f6432fi;
            canvas.drawCircle(i, i2, Math.min(i, i2) * 2 * iAnimation.getRippleValue(), this.f6436ri);
        }
        if (iAnimation.getShineValue() != 0.0f) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).setClipChildren(true);
            }
            if (view.getParent().getParent() != null) {
                ((ViewGroup) view.getParent().getParent()).setClipChildren(true);
            }
            this.f6435lr.reset();
            try {
                iIntValue = ((Integer) view.getTag(2097610711)).intValue();
            } catch (Exception unused3) {
                iIntValue = 0;
            }
            if (iIntValue >= 0) {
                int shineValue = ((int) ((((this.f6434ka * 4) + (iIntValue * 2)) + (this.f6432fi * 2)) * iAnimation.getShineValue())) - ((this.f6432fi * 2) + iIntValue);
                float f = shineValue;
                int i3 = this.f6432fi;
                this.f6436ri.setShader(new LinearGradient(f, 0.0f, ((iIntValue + i3) / 2) + shineValue, i3 / 2, new int[]{Color.parseColor("#20ffffff"), Color.parseColor("#60ffffff"), Color.parseColor("#65ffffff")}, (float[]) null, Shader.TileMode.MIRROR));
                this.f6436ri.setStrokeWidth(this.f6434ka * 2);
                Path path = this.f6433ik;
                if (path != null) {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                int i4 = shineValue + iIntValue;
                int i5 = this.f6432fi;
                canvas.drawLine(f, 0.0f, i4 + i5, i5, this.f6436ri);
            }
        }
        if (iAnimation.getMarqueeValue() != 0.0f) {
            try {
                iIntValue2 = ((Integer) view.getTag(2097610709)).intValue();
            } catch (Exception unused4) {
            }
            if (iIntValue2 >= 0) {
                this.f6435lr.reset();
                this.f6435lr.moveTo(0.0f, 0.0f);
                this.f6435lr.lineTo(this.f6434ka * 2, 0.0f);
                this.f6435lr.lineTo(this.f6434ka * 2, this.f6432fi * 2);
                this.f6435lr.lineTo(0.0f, this.f6432fi * 2);
                this.f6435lr.lineTo(0.0f, 0.0f);
                this.f6436ri.setShader(new LinearGradient(0.0f, 0.0f, this.f6434ka * 2, this.f6432fi * 2, new int[]{(int) (iAnimation.getMarqueeValue() * (-65536.0f)), (int) ((1.0f - iAnimation.getMarqueeValue()) * (-65536.0f))}, (float[]) null, Shader.TileMode.CLAMP));
                this.f6436ri.setColor(SupportMenu.CATEGORY_MASK);
                this.f6436ri.setStyle(Paint.Style.STROKE);
                this.f6436ri.setStrokeWidth(iIntValue2);
                canvas.drawPath(this.f6435lr, this.f6436ri);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m8304ri(View view, float f) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) (this.f6431di * f);
        view.setTranslationX((this.f6431di - layoutParams.width) / 2);
        if (view instanceof C2425sf) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    break;
                }
                viewGroup.getChildAt(i).setTranslationX((-(this.f6431di - layoutParams.width)) / 2);
                i++;
            }
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: ri */
    public void m8305ri(View view, int i, int i2) {
        String str;
        this.f6434ka = i / 2;
        this.f6432fi = i2 / 2;
        if (this.f6431di == 0 && view.getLayoutParams().width > 0) {
            this.f6431di = view.getLayoutParams().width;
        }
        try {
            str = (String) view.getTag(2097610710);
            try {
                this.f6433ik.addRoundRect(new RectF(0.0f, 0.0f, i, i2), i2 / 2, i2 / 2, Path.Direction.CW);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str = "";
        }
        if ("right".equals(str)) {
            view.setPivotX(this.f6434ka * 2);
            view.setPivotY(this.f6432fi);
        } else if ("left".equals(str)) {
            view.setPivotX(0.0f);
            view.setPivotY(this.f6432fi);
        } else {
            view.setPivotX(this.f6434ka);
            view.setPivotY(this.f6432fi);
        }
    }
}

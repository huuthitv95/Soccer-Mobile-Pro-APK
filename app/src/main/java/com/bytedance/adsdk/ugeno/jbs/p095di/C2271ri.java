package com.bytedance.adsdk.ugeno.jbs.p095di;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.InterfaceC2282ka;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.p108ri.C2334mj;
import com.bytedance.adsdk.ugeno.p108ri.xha;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.jbs.di.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2271ri extends TextView implements IAnimation, xha {

    /* JADX INFO: renamed from: di */
    private float f5706di;

    /* JADX INFO: renamed from: fi */
    private float f5707fi;

    /* JADX INFO: renamed from: ik */
    private C2334mj f5708ik;

    /* JADX INFO: renamed from: ka */
    private float f5709ka;

    /* JADX INFO: renamed from: lr */
    private float f5710lr;

    /* JADX INFO: renamed from: ri */
    private InterfaceC2282ka f5711ri;
    private float xha;

    public C2271ri(Context context) {
        super(context);
        this.f5709ka = -1.0f;
        this.f5706di = 1.0f;
        this.xha = 0.0f;
        this.f5708ik = new C2334mj(this);
    }

    /* JADX INFO: renamed from: ri */
    private int m7672ri(CharSequence charSequence, TextPaint textPaint, int i, float f) {
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.setTextSize(f);
        return new StaticLayout(charSequence, textPaint2, i, Layout.Alignment.ALIGN_NORMAL, this.f5706di, this.xha, true).getHeight();
    }

    /* JADX INFO: renamed from: ri */
    private void m7673ri(int i, int i2) {
        CharSequence text = getText();
        if (text == null || text.length() == 0 || i2 <= 0 || i <= 0 || this.f5707fi == 0.0f) {
            return;
        }
        TextPaint paint = getPaint();
        float fMax = this.f5707fi;
        int iM7672ri = m7672ri(text, paint, i, fMax);
        while (iM7672ri > i2 && fMax > this.f5709ka) {
            Log.d("UGTextView", "resizeText: targetSize=" + fMax + "; mMinTextSize=" + this.f5709ka);
            fMax = Math.max(fMax - 1.0f, this.f5709ka);
            iM7672ri = m7672ri(text, paint, i, fMax);
        }
        Log.d("UGTextView", "resizeText: targetSize: ".concat(String.valueOf(fMax)));
        setTextSize(0, fMax);
        setLineSpacing(this.xha, this.f5706di);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        InterfaceC2282ka interfaceC2282ka = this.f5711ri;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.mo7736lr(canvas);
        }
    }

    public float getBorderRadius() {
        return this.f5708ik.m8001ri();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation, com.bytedance.adsdk.ugeno.p108ri.xha
    public float getRipple() {
        return this.f5710lr;
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.xha
    public float getRubIn() {
        return this.f5708ik.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.xha
    public float getShine() {
        return this.f5708ik.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.xha
    public float getStretch() {
        return this.f5708ik.getStretch();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC2282ka interfaceC2282ka = this.f5711ri;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.xha();
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC2282ka interfaceC2282ka = this.f5711ri;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.mo7698mj();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        InterfaceC2282ka interfaceC2282ka = this.f5711ri;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.mo7739ri(canvas, this);
            this.f5711ri.mo7738ri(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        InterfaceC2282ka interfaceC2282ka = this.f5711ri;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.mo7737ri(i, i2, i3, i4);
        }
        if (z && this.f5709ka > 0.0f) {
            m7673ri(((i3 - i) - getCompoundPaddingLeft()) - getCompoundPaddingRight(), ((i4 - i2) - getCompoundPaddingBottom()) - getCompoundPaddingTop());
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        InterfaceC2282ka interfaceC2282ka = this.f5711ri;
        if (interfaceC2282ka == null) {
            super.onMeasure(i, i2);
        } else {
            int[] iArrMo7740ri = interfaceC2282ka.mo7740ri(i, i2);
            super.onMeasure(iArrMo7740ri[0], iArrMo7740ri[1]);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        InterfaceC2282ka interfaceC2282ka = this.f5711ri;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.mo7735lr(i, i2, i3, i3);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    /* JADX INFO: renamed from: ri */
    public void m7674ri(InterfaceC2282ka interfaceC2282ka) {
        this.f5711ri = interfaceC2282ka;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f5708ik.m8003ri(i);
    }

    public void setBorderRadius(float f) {
        C2334mj c2334mj = this.f5708ik;
        if (c2334mj != null) {
            c2334mj.m8002ri(f);
        }
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f, float f2) {
        super.setLineSpacing(f, f2);
        this.f5706di = f2;
        this.xha = f;
    }

    public void setMinTextSize(float f) {
        this.f5709ka = f;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f) {
        this.f5710lr = f;
        C2334mj c2334mj = this.f5708ik;
        if (c2334mj != null) {
            c2334mj.m8000lr(f);
        }
        postInvalidate();
    }

    public void setRubIn(float f) {
        C2334mj c2334mj = this.f5708ik;
        if (c2334mj != null) {
            c2334mj.m7997fi(f);
        }
    }

    public void setShine(float f) {
        C2334mj c2334mj = this.f5708ik;
        if (c2334mj != null) {
            c2334mj.m7998ik(f);
        }
    }

    public void setStretch(float f) {
        C2334mj c2334mj = this.f5708ik;
        if (c2334mj != null) {
            c2334mj.m7999ka(f);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(float f) {
        super.setTextSize(f);
        this.f5707fi = getTextSize();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.f5707fi = getTextSize();
    }
}

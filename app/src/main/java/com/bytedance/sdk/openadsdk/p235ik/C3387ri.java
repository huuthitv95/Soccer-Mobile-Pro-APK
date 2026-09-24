package com.bytedance.sdk.openadsdk.p235ik;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;
import com.bytedance.sdk.openadsdk.utils.C3583qd;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ik.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3387ri extends C3195mj {

    /* JADX INFO: renamed from: ik */
    private boolean f12051ik;

    /* JADX INFO: renamed from: ka */
    private int f12052ka;

    /* JADX INFO: renamed from: lr */
    private float f12053lr;

    /* JADX INFO: renamed from: ri */
    private Paint f12054ri;

    public C3387ri(Context context) {
        super(context);
        m15337ri();
    }

    /* JADX INFO: renamed from: ri */
    private float m15336ri(float f, String str) {
        this.f12054ri.setTextSize(f);
        return this.f12054ri.measureText(str);
    }

    /* JADX INFO: renamed from: ri */
    private void m15337ri() {
        this.f12053lr = C3583qd.m16602ri(getContext(), 8.0f);
        this.f12054ri = new Paint();
    }

    /* JADX INFO: renamed from: ri */
    private void m15338ri(String str, int i) {
        if (!this.f12051ik && i > 0) {
            float textSize = getTextSize();
            this.f12054ri.set(getPaint());
            int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
            float fM15336ri = m15336ri(textSize, str);
            while (fM15336ri > paddingLeft) {
                textSize -= 1.0f;
                this.f12054ri.setTextSize(textSize);
                if (textSize <= this.f12053lr) {
                    break;
                } else {
                    fM15336ri = m15336ri(textSize, str);
                }
            }
            setTextSize(0, textSize);
            this.f12051ik = true;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m15338ri(getText().toString(), getWidth());
    }

    @Override // com.bytedance.sdk.openadsdk.core.p217di.C3195mj, android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f12052ka = getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, this.f12052ka);
        } else {
            layoutParams.height = this.f12052ka;
        }
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.openadsdk.core.p217di.C3195mj, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        int i = this.f12052ka;
        if (i == 0 || layoutParams == null) {
            return;
        }
        layoutParams.height = i;
    }

    public void setMinTextSize(float f) {
        if (f <= 0.0f) {
            return;
        }
        this.f12053lr = f;
    }
}

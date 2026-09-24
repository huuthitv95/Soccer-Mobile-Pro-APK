package com.bytedance.sdk.component.adexpress.p113di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.di.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2378ka extends View {

    /* JADX INFO: renamed from: aw */
    private float f6305aw;
    private int bgr;

    /* JADX INFO: renamed from: co */
    private float f6306co;

    /* JADX INFO: renamed from: di */
    private int f6307di;

    /* JADX INFO: renamed from: fi */
    private float f6308fi;

    /* JADX INFO: renamed from: ik */
    private float f6309ik;
    private List<Integer> jbs;

    /* JADX INFO: renamed from: ka */
    private int f6310ka;

    /* JADX INFO: renamed from: lr */
    private int f6311lr;

    /* JADX INFO: renamed from: mj */
    private List<Integer> f6312mj;

    /* JADX INFO: renamed from: qt */
    private Paint f6313qt;

    /* JADX INFO: renamed from: ri */
    private int f6314ri;

    /* JADX INFO: renamed from: sf */
    private Paint f6315sf;
    private boolean xha;

    public C2378ka(Context context) {
        this(context, null);
    }

    public C2378ka(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public C2378ka(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6314ri = -1;
        this.f6311lr = SupportMenu.CATEGORY_MASK;
        this.f6309ik = 18.0f;
        this.f6310ka = 3;
        this.f6308fi = 50.0f;
        this.f6307di = 2;
        this.xha = false;
        this.f6312mj = new ArrayList();
        this.jbs = new ArrayList();
        this.bgr = 24;
        m8234ik();
    }

    /* JADX INFO: renamed from: ik */
    private void m8234ik() {
        Paint paint = new Paint();
        this.f6313qt = paint;
        paint.setAntiAlias(true);
        this.f6313qt.setStrokeWidth(this.bgr);
        this.f6312mj.add(255);
        this.jbs.add(0);
        Paint paint2 = new Paint();
        this.f6315sf = paint2;
        paint2.setAntiAlias(true);
        this.f6315sf.setColor(Color.parseColor("#0FFFFFFF"));
        this.f6315sf.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m8235lr() {
        this.xha = false;
        this.jbs.clear();
        this.f6312mj.clear();
        this.f6312mj.add(255);
        this.jbs.add(0);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f6313qt.setShader(new LinearGradient(this.f6306co, 0.0f, this.f6305aw, getMeasuredHeight(), -1, ViewCompat.MEASURED_SIZE_MASK, Shader.TileMode.CLAMP));
        int i = 0;
        while (true) {
            if (i >= this.f6312mj.size()) {
                break;
            }
            Integer num = this.f6312mj.get(i);
            this.f6313qt.setAlpha(num.intValue());
            Integer num2 = this.jbs.get(i);
            if (this.f6309ik + num2.intValue() < this.f6308fi) {
                canvas.drawCircle(this.f6306co, this.f6305aw, this.f6309ik + num2.intValue(), this.f6313qt);
            }
            if (num.intValue() > 0 && num2.intValue() < this.f6308fi) {
                this.f6312mj.set(i, Integer.valueOf(num.intValue() - this.f6307di > 0 ? num.intValue() - (this.f6307di * 3) : 1));
                this.jbs.set(i, Integer.valueOf(num2.intValue() + this.f6307di));
            }
            i++;
        }
        List<Integer> list = this.jbs;
        if (list.get(list.size() - 1).intValue() >= this.f6308fi / this.f6310ka) {
            this.f6312mj.add(255);
            this.jbs.add(0);
        }
        if (this.jbs.size() >= 3) {
            this.jbs.remove(0);
            this.f6312mj.remove(0);
        }
        this.f6313qt.setAlpha(255);
        this.f6313qt.setColor(this.f6311lr);
        canvas.drawCircle(this.f6306co, this.f6305aw, this.f6309ik, this.f6315sf);
        if (this.xha) {
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i / 2.0f;
        this.f6306co = f;
        this.f6305aw = i2 / 2.0f;
        float f2 = f - (this.bgr / 2.0f);
        this.f6308fi = f2;
        this.f6309ik = f2 / 4.0f;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m8236ri() {
        this.xha = true;
        invalidate();
    }

    public void setColor(int i) {
        this.f6314ri = i;
    }

    public void setCoreColor(int i) {
        this.f6311lr = i;
    }

    public void setCoreRadius(int i) {
        this.f6309ik = i;
    }

    public void setDiffuseSpeed(int i) {
        this.f6307di = i;
    }

    public void setDiffuseWidth(int i) {
        this.f6310ka = i;
    }

    public void setMaxWidth(int i) {
        this.f6308fi = i;
    }
}

package com.applovin.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: com.applovin.impl.k0 */
/* JADX INFO: loaded from: classes3.dex */
public class C1596k0 extends View {

    /* JADX INFO: renamed from: w */
    private static final int f1923w = Color.rgb(66, 145, 241);

    /* JADX INFO: renamed from: x */
    private static final int f1924x = Color.rgb(66, 145, 241);

    /* JADX INFO: renamed from: y */
    private static final int f1925y = Color.rgb(66, 145, 241);

    /* JADX INFO: renamed from: a */
    private Paint f1926a;

    /* JADX INFO: renamed from: b */
    private Paint f1927b;

    /* JADX INFO: renamed from: c */
    protected Paint f1928c;

    /* JADX INFO: renamed from: d */
    protected Paint f1929d;

    /* JADX INFO: renamed from: e */
    private RectF f1930e;

    /* JADX INFO: renamed from: f */
    private float f1931f;

    /* JADX INFO: renamed from: g */
    private int f1932g;

    /* JADX INFO: renamed from: h */
    private int f1933h;

    /* JADX INFO: renamed from: i */
    private int f1934i;

    /* JADX INFO: renamed from: j */
    private int f1935j;

    /* JADX INFO: renamed from: k */
    private int f1936k;

    /* JADX INFO: renamed from: l */
    private float f1937l;

    /* JADX INFO: renamed from: m */
    private int f1938m;

    /* JADX INFO: renamed from: n */
    private String f1939n;

    /* JADX INFO: renamed from: o */
    private String f1940o;

    /* JADX INFO: renamed from: p */
    private float f1941p;

    /* JADX INFO: renamed from: q */
    private String f1942q;

    /* JADX INFO: renamed from: r */
    private float f1943r;

    /* JADX INFO: renamed from: s */
    private final float f1944s;

    /* JADX INFO: renamed from: t */
    private final float f1945t;

    /* JADX INFO: renamed from: u */
    private final float f1946u;

    /* JADX INFO: renamed from: v */
    private final int f1947v;

    /* JADX INFO: renamed from: com.applovin.impl.k0$a */
    private static class a {
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static float m3045c(Resources resources, float f) {
            return (f * resources.getDisplayMetrics().density) + 0.5f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static float m3046d(Resources resources, float f) {
            return f * resources.getDisplayMetrics().scaledDensity;
        }
    }

    public C1596k0(Context context) {
        this(context, null);
    }

    public C1596k0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1596k0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1930e = new RectF();
        this.f1934i = 0;
        this.f1939n = "";
        this.f1940o = "";
        this.f1942q = "";
        this.f1945t = a.m3046d(getResources(), 14.0f);
        this.f1947v = (int) a.m3045c(getResources(), 100.0f);
        this.f1944s = a.m3045c(getResources(), 4.0f);
        this.f1946u = a.m3046d(getResources(), 18.0f);
        m3041a();
        m3042b();
    }

    /* JADX INFO: renamed from: a */
    private int m3040a(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int i2 = this.f1947v;
        return mode == Integer.MIN_VALUE ? Math.min(i2, size) : i2;
    }

    private float getProgressAngle() {
        return (getProgress() / this.f1935j) * 360.0f;
    }

    /* JADX INFO: renamed from: a */
    protected void m3041a() {
        this.f1936k = f1923w;
        this.f1932g = f1924x;
        this.f1931f = this.f1945t;
        setMax(100);
        setProgress(0);
        this.f1937l = this.f1944s;
        this.f1938m = 0;
        this.f1941p = this.f1946u;
        this.f1933h = f1925y;
    }

    /* JADX INFO: renamed from: b */
    protected void m3042b() {
        TextPaint textPaint = new TextPaint();
        this.f1928c = textPaint;
        textPaint.setColor(this.f1932g);
        this.f1928c.setTextSize(this.f1931f);
        this.f1928c.setAntiAlias(true);
        TextPaint textPaint2 = new TextPaint();
        this.f1929d = textPaint2;
        textPaint2.setColor(this.f1933h);
        this.f1929d.setTextSize(this.f1941p);
        this.f1929d.setAntiAlias(true);
        Paint paint = new Paint();
        this.f1926a = paint;
        paint.setColor(this.f1936k);
        this.f1926a.setStyle(Paint.Style.STROKE);
        this.f1926a.setAntiAlias(true);
        this.f1926a.setStrokeWidth(this.f1937l);
        Paint paint2 = new Paint();
        this.f1927b = paint2;
        paint2.setColor(this.f1938m);
        this.f1927b.setAntiAlias(true);
    }

    public int getFinishedStrokeColor() {
        return this.f1936k;
    }

    public float getFinishedStrokeWidth() {
        return this.f1937l;
    }

    public int getInnerBackgroundColor() {
        return this.f1938m;
    }

    public String getInnerBottomText() {
        return this.f1942q;
    }

    public int getInnerBottomTextColor() {
        return this.f1933h;
    }

    public float getInnerBottomTextSize() {
        return this.f1941p;
    }

    public int getMax() {
        return this.f1935j;
    }

    public String getPrefixText() {
        return this.f1939n;
    }

    public int getProgress() {
        return this.f1934i;
    }

    public String getSuffixText() {
        return this.f1940o;
    }

    public int getTextColor() {
        return this.f1932g;
    }

    public float getTextSize() {
        return this.f1931f;
    }

    @Override // android.view.View
    public void invalidate() {
        m3042b();
        super.invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.f1937l;
        this.f1930e.set(f, f, getWidth() - f, getHeight() - f);
        float width = getWidth();
        float f2 = this.f1937l;
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, ((width - f2) + f2) / 2.0f, this.f1927b);
        canvas.drawArc(this.f1930e, 270.0f, -getProgressAngle(), false, this.f1926a);
        String str = this.f1939n + this.f1934i + this.f1940o;
        if (!TextUtils.isEmpty(str)) {
            canvas.drawText(str, (getWidth() - this.f1928c.measureText(str)) / 2.0f, (getWidth() - (this.f1928c.descent() + this.f1928c.ascent())) / 2.0f, this.f1928c);
        }
        if (TextUtils.isEmpty(getInnerBottomText())) {
            return;
        }
        this.f1929d.setTextSize(this.f1941p);
        canvas.drawText(getInnerBottomText(), (getWidth() - this.f1929d.measureText(getInnerBottomText())) / 2.0f, (getHeight() - this.f1943r) - ((this.f1928c.descent() + this.f1928c.ascent()) / 2.0f), this.f1929d);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(m3040a(i), m3040a(i2));
        this.f1943r = getHeight() - ((getHeight() * 3) / 4);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.f1932g = bundle.getInt("text_color");
        this.f1931f = bundle.getFloat("text_size");
        this.f1941p = bundle.getFloat("inner_bottom_text_size");
        this.f1942q = bundle.getString("inner_bottom_text");
        this.f1933h = bundle.getInt("inner_bottom_text_color");
        this.f1936k = bundle.getInt("finished_stroke_color");
        this.f1937l = bundle.getFloat("finished_stroke_width");
        this.f1938m = bundle.getInt("inner_background_color");
        m3042b();
        setMax(bundle.getInt("max"));
        setProgress(bundle.getInt("progress"));
        this.f1939n = bundle.getString("prefix");
        this.f1940o = bundle.getString("suffix");
        super.onRestoreInstanceState(bundle.getParcelable("saved_instance"));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("saved_instance", super.onSaveInstanceState());
        bundle.putInt("text_color", getTextColor());
        bundle.putFloat("text_size", getTextSize());
        bundle.putFloat("inner_bottom_text_size", getInnerBottomTextSize());
        bundle.putFloat("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putString("inner_bottom_text", getInnerBottomText());
        bundle.putInt("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putInt("finished_stroke_color", getFinishedStrokeColor());
        bundle.putInt("max", getMax());
        bundle.putInt("progress", getProgress());
        bundle.putString("suffix", getSuffixText());
        bundle.putString("prefix", getPrefixText());
        bundle.putFloat("finished_stroke_width", getFinishedStrokeWidth());
        bundle.putInt("inner_background_color", getInnerBackgroundColor());
        return bundle;
    }

    public void setFinishedStrokeColor(int i) {
        this.f1936k = i;
        invalidate();
    }

    public void setFinishedStrokeWidth(float f) {
        this.f1937l = f;
        invalidate();
    }

    public void setInnerBackgroundColor(int i) {
        this.f1938m = i;
        invalidate();
    }

    public void setInnerBottomText(String str) {
        this.f1942q = str;
        invalidate();
    }

    public void setInnerBottomTextColor(int i) {
        this.f1933h = i;
        invalidate();
    }

    public void setInnerBottomTextSize(float f) {
        this.f1941p = f;
        invalidate();
    }

    public void setMax(int i) {
        if (i > 0) {
            this.f1935j = i;
            invalidate();
        }
    }

    public void setPrefixText(String str) {
        this.f1939n = str;
        invalidate();
    }

    public void setProgress(int i) {
        this.f1934i = i;
        if (i > getMax()) {
            this.f1934i %= getMax();
        }
        invalidate();
    }

    public void setSuffixText(String str) {
        this.f1940o = str;
        invalidate();
    }

    public void setTextColor(int i) {
        this.f1932g = i;
        invalidate();
    }

    public void setTextSize(float f) {
        this.f1931f = f;
        invalidate();
    }
}

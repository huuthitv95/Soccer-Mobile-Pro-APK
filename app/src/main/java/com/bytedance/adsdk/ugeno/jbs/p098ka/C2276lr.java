package com.bytedance.adsdk.ugeno.jbs.p098ka;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.chartboost.sdk.impl.cc$$ExternalSyntheticApiModelOutline0;
import java.util.HashSet;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.jbs.ka.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2276lr extends Drawable {

    /* JADX INFO: renamed from: ac */
    private ImageView.ScaleType f5737ac;

    /* JADX INFO: renamed from: aw */
    private Shader.TileMode f5738aw;
    private boolean bgr;

    /* JADX INFO: renamed from: bu */
    private boolean f5739bu;

    /* JADX INFO: renamed from: co */
    private Shader.TileMode f5740co;

    /* JADX INFO: renamed from: di */
    private final int f5741di;

    /* JADX INFO: renamed from: fi */
    private final Paint f5742fi;

    /* JADX INFO: renamed from: ik */
    private final RectF f5743ik;
    private final Paint jbs;

    /* JADX INFO: renamed from: ka */
    private final Bitmap f5744ka;

    /* JADX INFO: renamed from: mj */
    private final RectF f5746mj;

    /* JADX INFO: renamed from: nr */
    private float f5747nr;

    /* JADX INFO: renamed from: qt */
    private final Matrix f5748qt;

    /* JADX INFO: renamed from: sf */
    private final RectF f5750sf;
    private final boolean[] slm;
    private ColorStateList tan;

    /* JADX INFO: renamed from: vr */
    private float f5751vr;
    private final int xha;

    /* JADX INFO: renamed from: ri */
    private final RectF f5749ri = new RectF();

    /* JADX INFO: renamed from: lr */
    private final RectF f5745lr = new RectF();

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.jbs.ka.lr$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: ri */
        static final /* synthetic */ int[] f5752ri;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f5752ri = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5752ri[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5752ri[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5752ri[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5752ri[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5752ri[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5752ri[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public C2276lr(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.f5743ik = rectF;
        this.f5746mj = new RectF();
        this.f5748qt = new Matrix();
        this.f5750sf = new RectF();
        this.f5740co = Shader.TileMode.CLAMP;
        this.f5738aw = Shader.TileMode.CLAMP;
        this.bgr = true;
        this.f5751vr = 0.0f;
        this.slm = new boolean[]{true, true, true, true};
        this.f5739bu = false;
        this.f5747nr = 0.0f;
        this.tan = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        this.f5737ac = ImageView.ScaleType.FIT_CENTER;
        this.f5744ka = bitmap;
        int width = bitmap.getWidth();
        this.f5741di = width;
        int height = bitmap.getHeight();
        this.xha = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.f5742fi = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.jbs = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.tan.getColorForState(getState(), ViewCompat.MEASURED_STATE_MASK));
        paint2.setStrokeWidth(this.f5747nr);
    }

    /* JADX INFO: renamed from: lr */
    public static Bitmap m7700lr(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
            return null;
        }
    }

    /* JADX INFO: renamed from: lr */
    private void m7701lr(Canvas canvas) {
        float f;
        float f2;
        if (m7702lr(this.slm) || this.f5751vr == 0.0f) {
            return;
        }
        float f3 = this.f5745lr.left;
        float f4 = this.f5745lr.top;
        float fWidth = this.f5745lr.width() + f3;
        float fHeight = f4 + this.f5745lr.height();
        float f5 = this.f5751vr;
        float f6 = this.f5747nr / 2.0f;
        if (this.slm[0]) {
            f = f4;
        } else {
            f = f4;
            canvas.drawLine(f3 - f6, f4, f3 + f5, f, this.jbs);
            canvas.drawLine(f3, f - f6, f3, f + f5, this.jbs);
        }
        if (!this.slm[1]) {
            float f7 = f;
            canvas.drawLine((fWidth - f5) - f6, f7, fWidth, f, this.jbs);
            canvas.drawLine(fWidth, f7 - f6, fWidth, f7 + f5, this.jbs);
            fWidth = fWidth;
        }
        if (this.slm[2]) {
            f2 = fHeight;
        } else {
            canvas.drawLine((fWidth - f5) - f6, fHeight, fWidth + f6, fHeight, this.jbs);
            float f8 = fWidth;
            canvas.drawLine(f8, fHeight - f5, fWidth, fHeight, this.jbs);
            f2 = fHeight;
        }
        if (this.slm[3]) {
            return;
        }
        canvas.drawLine(f3 - f6, f2, f3 + f5, f2, this.jbs);
        canvas.drawLine(f3, f2 - f5, f3, f2, this.jbs);
    }

    /* JADX INFO: renamed from: lr */
    private static boolean m7702lr(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ri */
    public static Drawable m7703ri(Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof C2276lr) {
                return drawable;
            }
            if (Build.VERSION.SDK_INT >= 28 && cc$$ExternalSyntheticApiModelOutline0.m17156m((Object) drawable)) {
                return drawable;
            }
            if (drawable instanceof LayerDrawable) {
                Drawable.ConstantState constantState = drawable.mutate().getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i = 0; i < numberOfLayers; i++) {
                    layerDrawable.setDrawableByLayerId(layerDrawable.getId(i), m7703ri(layerDrawable.getDrawable(i)));
                }
                return layerDrawable;
            }
        }
        Bitmap bitmapM7700lr = m7700lr(drawable);
        return bitmapM7700lr != null ? new C2276lr(bitmapM7700lr) : drawable;
    }

    /* JADX INFO: renamed from: ri */
    public static C2276lr m7704ri(Bitmap bitmap) {
        if (bitmap != null) {
            return new C2276lr(bitmap);
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    private void m7705ri() {
        float fWidth;
        float fHeight;
        int i = AnonymousClass1.f5752ri[this.f5737ac.ordinal()];
        if (i == 1) {
            this.f5746mj.set(this.f5749ri);
            RectF rectF = this.f5746mj;
            float f = this.f5747nr;
            rectF.inset(f / 2.0f, f / 2.0f);
            this.f5748qt.reset();
            this.f5748qt.setTranslate((int) (((this.f5746mj.width() - this.f5741di) * 0.5f) + 0.5f), (int) (((this.f5746mj.height() - this.xha) * 0.5f) + 0.5f));
        } else if (i == 2) {
            this.f5746mj.set(this.f5749ri);
            RectF rectF2 = this.f5746mj;
            float f2 = this.f5747nr;
            rectF2.inset(f2 / 2.0f, f2 / 2.0f);
            this.f5748qt.reset();
            float fWidth2 = 0.0f;
            if (this.f5741di * this.f5746mj.height() > this.f5746mj.width() * this.xha) {
                fWidth = this.f5746mj.height() / this.xha;
                fHeight = 0.0f;
                fWidth2 = (this.f5746mj.width() - (this.f5741di * fWidth)) * 0.5f;
            } else {
                fWidth = this.f5746mj.width() / this.f5741di;
                fHeight = (this.f5746mj.height() - (this.xha * fWidth)) * 0.5f;
            }
            this.f5748qt.setScale(fWidth, fWidth);
            Matrix matrix = this.f5748qt;
            float f3 = this.f5747nr;
            matrix.postTranslate(((int) (fWidth2 + 0.5f)) + (f3 / 2.0f), ((int) (fHeight + 0.5f)) + (f3 / 2.0f));
        } else if (i == 3) {
            this.f5748qt.reset();
            float fMin = (((float) this.f5741di) > this.f5749ri.width() || ((float) this.xha) > this.f5749ri.height()) ? Math.min(this.f5749ri.width() / this.f5741di, this.f5749ri.height() / this.xha) : 1.0f;
            float fWidth3 = (int) (((this.f5749ri.width() - (this.f5741di * fMin)) * 0.5f) + 0.5f);
            float fHeight2 = (int) (((this.f5749ri.height() - (this.xha * fMin)) * 0.5f) + 0.5f);
            this.f5748qt.setScale(fMin, fMin);
            this.f5748qt.postTranslate(fWidth3, fHeight2);
            this.f5746mj.set(this.f5743ik);
            this.f5748qt.mapRect(this.f5746mj);
            RectF rectF3 = this.f5746mj;
            float f4 = this.f5747nr;
            rectF3.inset(f4 / 2.0f, f4 / 2.0f);
            this.f5748qt.setRectToRect(this.f5743ik, this.f5746mj, Matrix.ScaleToFit.FILL);
        } else if (i == 5) {
            this.f5746mj.set(this.f5743ik);
            this.f5748qt.setRectToRect(this.f5743ik, this.f5749ri, Matrix.ScaleToFit.END);
            this.f5748qt.mapRect(this.f5746mj);
            RectF rectF4 = this.f5746mj;
            float f5 = this.f5747nr;
            rectF4.inset(f5 / 2.0f, f5 / 2.0f);
            this.f5748qt.setRectToRect(this.f5743ik, this.f5746mj, Matrix.ScaleToFit.FILL);
        } else if (i == 6) {
            this.f5746mj.set(this.f5743ik);
            this.f5748qt.setRectToRect(this.f5743ik, this.f5749ri, Matrix.ScaleToFit.START);
            this.f5748qt.mapRect(this.f5746mj);
            RectF rectF5 = this.f5746mj;
            float f6 = this.f5747nr;
            rectF5.inset(f6 / 2.0f, f6 / 2.0f);
            this.f5748qt.setRectToRect(this.f5743ik, this.f5746mj, Matrix.ScaleToFit.FILL);
        } else if (i != 7) {
            this.f5746mj.set(this.f5743ik);
            this.f5748qt.setRectToRect(this.f5743ik, this.f5749ri, Matrix.ScaleToFit.CENTER);
            this.f5748qt.mapRect(this.f5746mj);
            RectF rectF6 = this.f5746mj;
            float f7 = this.f5747nr;
            rectF6.inset(f7 / 2.0f, f7 / 2.0f);
            this.f5748qt.setRectToRect(this.f5743ik, this.f5746mj, Matrix.ScaleToFit.FILL);
        } else {
            this.f5746mj.set(this.f5749ri);
            RectF rectF7 = this.f5746mj;
            float f8 = this.f5747nr;
            rectF7.inset(f8 / 2.0f, f8 / 2.0f);
            this.f5748qt.reset();
            this.f5748qt.setRectToRect(this.f5743ik, this.f5746mj, Matrix.ScaleToFit.FILL);
        }
        this.f5745lr.set(this.f5746mj);
        this.bgr = true;
    }

    /* JADX INFO: renamed from: ri */
    private void m7706ri(Canvas canvas) {
        if (m7702lr(this.slm) || this.f5751vr == 0.0f) {
            return;
        }
        float f = this.f5745lr.left;
        float f2 = this.f5745lr.top;
        float fWidth = this.f5745lr.width() + f;
        float fHeight = this.f5745lr.height() + f2;
        float f3 = this.f5751vr;
        if (!this.slm[0]) {
            this.f5750sf.set(f, f2, f + f3, f2 + f3);
            canvas.drawRect(this.f5750sf, this.f5742fi);
        }
        if (!this.slm[1]) {
            this.f5750sf.set(fWidth - f3, f2, fWidth, f3);
            canvas.drawRect(this.f5750sf, this.f5742fi);
        }
        if (!this.slm[2]) {
            this.f5750sf.set(fWidth - f3, fHeight - f3, fWidth, fHeight);
            canvas.drawRect(this.f5750sf, this.f5742fi);
        }
        if (this.slm[3]) {
            return;
        }
        this.f5750sf.set(f, fHeight - f3, f3 + f, fHeight);
        canvas.drawRect(this.f5750sf, this.f5742fi);
    }

    /* JADX INFO: renamed from: ri */
    private static boolean m7707ri(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.bgr) {
            BitmapShader bitmapShader = new BitmapShader(this.f5744ka, this.f5740co, this.f5738aw);
            if (this.f5740co == Shader.TileMode.CLAMP && this.f5738aw == Shader.TileMode.CLAMP) {
                bitmapShader.setLocalMatrix(this.f5748qt);
            }
            this.f5742fi.setShader(bitmapShader);
            this.bgr = false;
        }
        if (this.f5739bu) {
            if (this.f5747nr <= 0.0f) {
                canvas.drawOval(this.f5745lr, this.f5742fi);
                return;
            } else {
                canvas.drawOval(this.f5745lr, this.f5742fi);
                canvas.drawOval(this.f5746mj, this.jbs);
                return;
            }
        }
        if (!m7707ri(this.slm)) {
            canvas.drawRect(this.f5745lr, this.f5742fi);
            if (this.f5747nr > 0.0f) {
                canvas.drawRect(this.f5746mj, this.jbs);
                return;
            }
            return;
        }
        float f = this.f5751vr;
        if (this.f5747nr <= 0.0f) {
            canvas.drawRoundRect(this.f5745lr, f, f, this.f5742fi);
            m7706ri(canvas);
        } else {
            canvas.drawRoundRect(this.f5745lr, f, f, this.f5742fi);
            canvas.drawRoundRect(this.f5746mj, f, f, this.jbs);
            m7706ri(canvas);
            m7701lr(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f5742fi.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f5742fi.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.xha;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f5741di;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.tan.isStateful();
    }

    /* JADX INFO: renamed from: lr */
    public C2276lr m7708lr(Shader.TileMode tileMode) {
        if (this.f5738aw != tileMode) {
            this.f5738aw = tileMode;
            this.bgr = true;
            invalidateSelf();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f5749ri.set(rect);
        m7705ri();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState = this.tan.getColorForState(iArr, 0);
        if (this.jbs.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        this.jbs.setColor(colorForState);
        return true;
    }

    /* JADX INFO: renamed from: ri */
    public C2276lr m7709ri(float f) {
        this.f5747nr = f;
        this.jbs.setStrokeWidth(f);
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public C2276lr m7710ri(float f, float f2, float f3, float f4) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f));
        hashSet.add(Float.valueOf(f2));
        hashSet.add(Float.valueOf(f3));
        hashSet.add(Float.valueOf(f4));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
        }
        if (hashSet.isEmpty()) {
            this.f5751vr = 0.0f;
        } else {
            float fFloatValue = ((Float) hashSet.iterator().next()).floatValue();
            if (Float.isInfinite(fFloatValue) || Float.isNaN(fFloatValue) || fFloatValue < 0.0f) {
                throw new IllegalArgumentException("Invalid radius value: ".concat(String.valueOf(fFloatValue)));
            }
            this.f5751vr = fFloatValue;
        }
        boolean[] zArr = this.slm;
        zArr[0] = f > 0.0f;
        zArr[1] = f2 > 0.0f;
        zArr[2] = f3 > 0.0f;
        zArr[3] = f4 > 0.0f;
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public C2276lr m7711ri(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.tan = colorStateList;
        this.jbs.setColor(colorStateList.getColorForState(getState(), ViewCompat.MEASURED_STATE_MASK));
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public C2276lr m7712ri(Shader.TileMode tileMode) {
        if (this.f5740co != tileMode) {
            this.f5740co = tileMode;
            this.bgr = true;
            invalidateSelf();
        }
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public C2276lr m7713ri(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.f5737ac != scaleType) {
            this.f5737ac = scaleType;
            m7705ri();
        }
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public C2276lr m7714ri(boolean z) {
        this.f5739bu = z;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f5742fi.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5742fi.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f5742fi.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f5742fi.setFilterBitmap(z);
        invalidateSelf();
    }
}

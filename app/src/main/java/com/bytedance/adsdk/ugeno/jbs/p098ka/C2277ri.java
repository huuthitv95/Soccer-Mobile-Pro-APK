package com.bytedance.adsdk.ugeno.jbs.p098ka;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.InterfaceC2282ka;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.p108ri.C2334mj;
import com.bytedance.adsdk.ugeno.p108ri.xha;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.jbs.ka.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2277ri extends ImageView implements IAnimation, xha {

    /* JADX INFO: renamed from: lr */
    static final /* synthetic */ boolean f5754lr = true;

    /* JADX INFO: renamed from: ac */
    private InterfaceC2282ka f5756ac;

    /* JADX INFO: renamed from: aw */
    private boolean f5757aw;
    private boolean bgr;

    /* JADX INFO: renamed from: bu */
    private ImageView.ScaleType f5758bu;

    /* JADX INFO: renamed from: co */
    private boolean f5759co;

    /* JADX INFO: renamed from: di */
    private Drawable f5760di;

    /* JADX INFO: renamed from: fi */
    private final float[] f5761fi;
    private C2334mj ihz;

    /* JADX INFO: renamed from: ik */
    private float f5762ik;
    private ColorFilter jbs;

    /* JADX INFO: renamed from: mj */
    private float f5763mj;

    /* JADX INFO: renamed from: nr */
    private Shader.TileMode f5764nr;

    /* JADX INFO: renamed from: qt */
    private boolean f5765qt;

    /* JADX INFO: renamed from: sf */
    private Drawable f5766sf;
    private int slm;
    private Shader.TileMode tan;

    /* JADX INFO: renamed from: vr */
    private int f5767vr;
    private ColorStateList xha;

    /* JADX INFO: renamed from: ri */
    public static final Shader.TileMode f5755ri = Shader.TileMode.CLAMP;

    /* JADX INFO: renamed from: ka */
    private static final ImageView.ScaleType[] f5753ka = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.jbs.ka.ri$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: ri */
        static final /* synthetic */ int[] f5768ri;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f5768ri = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5768ri[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5768ri[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5768ri[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5768ri[ImageView.ScaleType.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5768ri[ImageView.ScaleType.CENTER_CROP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5768ri[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public C2277ri(Context context) {
        super(context);
        this.f5761fi = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.xha = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        this.f5763mj = 0.0f;
        this.jbs = null;
        this.f5765qt = false;
        this.f5759co = false;
        this.f5757aw = false;
        this.bgr = false;
        Shader.TileMode tileMode = f5755ri;
        this.f5764nr = tileMode;
        this.tan = tileMode;
        this.ihz = new C2334mj(this);
    }

    /* JADX INFO: renamed from: ik */
    private void m7715ik() {
        m7719ri(this.f5766sf, this.f5758bu);
    }

    /* JADX INFO: renamed from: ka */
    private void m7716ka() {
        Drawable drawable = this.f5766sf;
        if (drawable == null || !this.f5765qt) {
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.f5766sf = drawableMutate;
        if (this.f5759co) {
            drawableMutate.setColorFilter(this.jbs);
        }
    }

    /* JADX INFO: renamed from: lr */
    private Drawable m7717lr() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.slm;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception e) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.slm, e);
                this.slm = 0;
            }
        }
        return C2276lr.m7703ri(drawable);
    }

    /* JADX INFO: renamed from: ri */
    private Drawable m7718ri() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.f5767vr;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception e) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.f5767vr, e);
                this.f5767vr = 0;
            }
        }
        return C2276lr.m7703ri(drawable);
    }

    /* JADX INFO: renamed from: ri */
    private void m7719ri(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof C2276lr) {
            C2276lr c2276lr = (C2276lr) drawable;
            c2276lr.m7713ri(scaleType).m7709ri(this.f5763mj).m7711ri(this.xha).m7714ri(this.f5757aw).m7712ri(this.f5764nr).m7708lr(this.tan);
            float[] fArr = this.f5761fi;
            if (fArr != null) {
                c2276lr.m7710ri(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            m7716ka();
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                m7719ri(layerDrawable.getDrawable(i), scaleType);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m7720ri(boolean z) {
        if (this.bgr) {
            if (z) {
                this.f5760di = C2276lr.m7703ri(this.f5760di);
            }
            m7719ri(this.f5760di, ImageView.ScaleType.FIT_XY);
        }
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        InterfaceC2282ka interfaceC2282ka = this.f5756ac;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.mo7736lr(canvas);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public int getBorderColor() {
        return this.xha.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.xha;
    }

    public float getBorderRadius() {
        return this.ihz.m8001ri();
    }

    public float getBorderWidth() {
        return this.f5763mj;
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float fMax = 0.0f;
        for (float f : this.f5761fi) {
            fMax = Math.max(f, fMax);
        }
        return fMax;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation, com.bytedance.adsdk.ugeno.p108ri.xha
    public float getRipple() {
        return this.f5762ik;
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.xha
    public float getRubIn() {
        return this.ihz.getRubIn();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f5758bu;
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.xha
    public float getShine() {
        return this.ihz.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.xha
    public float getStretch() {
        return this.ihz.getStretch();
    }

    public Shader.TileMode getTileModeX() {
        return this.f5764nr;
    }

    public Shader.TileMode getTileModeY() {
        return this.tan;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC2282ka interfaceC2282ka = this.f5756ac;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.xha();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC2282ka interfaceC2282ka = this.f5756ac;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.mo7698mj();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        InterfaceC2282ka interfaceC2282ka = this.f5756ac;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.mo7739ri(canvas, this);
            this.f5756ac.mo7738ri(canvas);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        InterfaceC2282ka interfaceC2282ka = this.f5756ac;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.mo7737ri(i, i2, i3, i4);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        InterfaceC2282ka interfaceC2282ka = this.f5756ac;
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
        InterfaceC2282ka interfaceC2282ka = this.f5756ac;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.mo7735lr(i, i2, i3, i3);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    /* JADX INFO: renamed from: ri */
    public void m7721ri(float f, float f2, float f3, float f4) {
        float[] fArr = this.f5761fi;
        if (fArr[0] == f && fArr[1] == f2 && fArr[2] == f4 && fArr[3] == f3) {
            return;
        }
        fArr[0] = f;
        fArr[1] = f2;
        fArr[3] = f3;
        fArr[2] = f4;
        m7715ik();
        m7720ri(false);
        invalidate();
    }

    /* JADX INFO: renamed from: ri */
    public void m7722ri(InterfaceC2282ka interfaceC2282ka) {
        this.f5756ac = interfaceC2282ka;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        ColorDrawable colorDrawable = new ColorDrawable(i);
        this.f5760di = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.f5760di = drawable;
        m7720ri(true);
        super.setBackgroundDrawable(this.f5760di);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        if (this.slm != i) {
            this.slm = i;
            Drawable drawableM7717lr = m7717lr();
            this.f5760di = drawableM7717lr;
            setBackgroundDrawable(drawableM7717lr);
        }
    }

    public void setBorderColor(int i) {
        setBorderColor(ColorStateList.valueOf(i));
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.xha.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        }
        this.xha = colorStateList;
        m7715ik();
        m7720ri(false);
        if (this.f5763mj > 0.0f) {
            invalidate();
        }
    }

    public void setBorderRadius(float f) {
        C2334mj c2334mj = this.ihz;
        if (c2334mj != null) {
            c2334mj.m8002ri(f);
        }
    }

    public void setBorderWidth(float f) {
        if (this.f5763mj == f) {
            return;
        }
        this.f5763mj = f;
        m7715ik();
        m7720ri(false);
        invalidate();
    }

    public void setBorderWidth(int i) {
        setBorderWidth(getResources().getDimension(i));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.jbs != colorFilter) {
            this.jbs = colorFilter;
            this.f5759co = true;
            this.f5765qt = true;
            m7716ka();
            invalidate();
        }
    }

    public void setCornerRadius(float f) {
        m7721ri(f, f, f, f);
    }

    public void setCornerRadiusDimen(int i) {
        float dimension = getResources().getDimension(i);
        m7721ri(dimension, dimension, dimension, dimension);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f5767vr = 0;
        this.f5766sf = C2276lr.m7704ri(bitmap);
        m7715ik();
        super.setImageDrawable(this.f5766sf);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f5767vr = 0;
        this.f5766sf = C2276lr.m7703ri(drawable);
        m7715ik();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        if (this.f5767vr != i) {
            this.f5767vr = i;
            this.f5766sf = m7718ri();
            m7715ik();
            super.setImageDrawable(this.f5766sf);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z) {
        this.f5757aw = z;
        m7715ik();
        m7720ri(false);
        invalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f) {
        this.f5762ik = f;
        C2334mj c2334mj = this.ihz;
        if (c2334mj != null) {
            c2334mj.m8000lr(f);
        }
        postInvalidate();
    }

    public void setRubIn(float f) {
        C2334mj c2334mj = this.ihz;
        if (c2334mj != null) {
            c2334mj.m7997fi(f);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (!f5754lr && scaleType == null) {
            throw new AssertionError();
        }
        if (this.f5758bu != scaleType) {
            this.f5758bu = scaleType;
            int i = AnonymousClass1.f5768ri[scaleType.ordinal()];
            if (i == 1 || i == 2 || i == 3 || i == 4) {
                super.setScaleType(scaleType);
            } else {
                super.setScaleType(ImageView.ScaleType.FIT_XY);
            }
            m7715ik();
            m7720ri(false);
            invalidate();
        }
    }

    public void setShine(float f) {
        C2334mj c2334mj = this.ihz;
        if (c2334mj != null) {
            c2334mj.m7998ik(f);
        }
    }

    public void setStretch(float f) {
        C2334mj c2334mj = this.ihz;
        if (c2334mj != null) {
            c2334mj.m7999ka(f);
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.f5764nr == tileMode) {
            return;
        }
        this.f5764nr = tileMode;
        m7715ik();
        m7720ri(false);
        invalidate();
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.tan == tileMode) {
            return;
        }
        this.tan = tileMode;
        m7715ik();
        m7720ri(false);
        invalidate();
    }
}

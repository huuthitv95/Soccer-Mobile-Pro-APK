package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.widget.mj */
/* JADX INFO: loaded from: classes9.dex */
public class C3343mj extends View {

    /* JADX INFO: renamed from: ri */
    private static final int[] f11751ri = {Color.parseColor("#1AFFFFFF"), Color.parseColor("#4DFFFFFF"), Color.parseColor("#99FFFFFF")};

    /* JADX INFO: renamed from: di */
    private final Paint f11752di;

    /* JADX INFO: renamed from: fi */
    private final Paint f11753fi;

    /* JADX INFO: renamed from: ik */
    private final RectF f11754ik;
    private int jbs;

    /* JADX INFO: renamed from: ka */
    private final ArrayList<ri> f11755ka;

    /* JADX INFO: renamed from: lr */
    private final RectF f11756lr;

    /* JADX INFO: renamed from: mj */
    private int f11757mj;
    private int xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.widget.mj$ri */
    /* JADX INFO: loaded from: classes3.dex */
    private static final class ri {

        /* JADX INFO: renamed from: ik */
        float f11758ik;

        /* JADX INFO: renamed from: ka */
        float f11759ka;

        /* JADX INFO: renamed from: lr */
        public float f11760lr;

        /* JADX INFO: renamed from: ri */
        public Paint f11761ri;

        public ri(Paint paint, float f, float f2, float f3) {
            this.f11761ri = paint;
            this.f11760lr = f;
            this.f11758ik = f2;
            this.f11759ka = f3;
        }
    }

    public C3343mj(Context context) {
        super(context);
        this.f11756lr = new RectF();
        this.f11754ik = new RectF();
        this.f11755ka = new ArrayList<>();
        this.f11752di = new Paint();
        Paint paint = new Paint();
        this.f11753fi = paint;
        paint.setColor(Color.parseColor("#D9D9D9"));
    }

    /* JADX INFO: renamed from: ri */
    private void m15020ri() {
        if (this.xha <= 0) {
            return;
        }
        this.f11754ik.right = Math.max(this.jbs, (int) (((this.f11757mj * 1.0f) / 100.0f) * getWidth()));
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f11756lr;
        int i = this.xha;
        canvas.drawRoundRect(rectF, i, i, this.f11753fi);
        RectF rectF2 = this.f11754ik;
        int i2 = this.xha;
        canvas.drawRoundRect(rectF2, i2, i2, this.f11752di);
        int iSave = canvas.save();
        canvas.translate(this.f11754ik.right - this.jbs, 0.0f);
        for (ri riVar : this.f11755ka) {
            canvas.drawCircle(riVar.f11758ik, riVar.f11759ka, riVar.f11760lr, riVar.f11761ri);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = i2 / 2;
        this.xha = i5;
        this.jbs = i5 * 5;
        float f = i;
        float f2 = i2;
        this.f11756lr.set(0.0f, 0.0f, f, f2);
        this.f11754ik.set(0.0f, 0.0f, 0.0f, f2);
        this.f11752di.setShader(new LinearGradient(0.0f, 0.0f, f, f2, new int[]{Color.parseColor("#90C0FF"), Color.parseColor("#196BE4")}, (float[]) null, Shader.TileMode.CLAMP));
        this.f11755ka.clear();
        float f3 = this.xha / 4.0f;
        for (int i6 : f11751ri) {
            Paint paint = new Paint();
            paint.setColor(i6);
            this.f11755ka.add(new ri(paint, this.xha / 2.0f, f3, f2 / 2.0f));
            f3 += (this.xha / 2.0f) * 3.0f;
        }
        m15020ri();
    }

    public void setProgress(int i) {
        int i2 = this.f11757mj;
        if (i2 == i) {
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i > 100) {
            i = 100;
        }
        if (i2 == i) {
            return;
        }
        this.f11757mj = i;
        m15020ri();
    }
}

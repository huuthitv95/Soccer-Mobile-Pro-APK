package com.bytedance.adsdk.p065lr.p068ik.p069ik;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.adsdk.p065lr.C2127qt;
import com.bytedance.adsdk.p065lr.jbs;
import com.bytedance.adsdk.p065lr.p066di.C2017di;
import com.bytedance.adsdk.p065lr.p074ri.C2142ri;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.ik.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2064ka extends AbstractC2068ri {

    /* JADX INFO: renamed from: co */
    private AbstractC2139ri<Bitmap, Bitmap> f4855co;
    private final Rect jbs;

    /* JADX INFO: renamed from: mj */
    private final Paint f4856mj;

    /* JADX INFO: renamed from: qt */
    private final Rect f4857qt;

    /* JADX INFO: renamed from: sf */
    private AbstractC2139ri<ColorFilter, ColorFilter> f4858sf;
    protected final C2127qt xha;

    C2064ka(jbs jbsVar, C2058fi c2058fi) {
        super(jbsVar, c2058fi);
        this.f4856mj = new C2142ri(3);
        this.jbs = new Rect();
        this.f4857qt = new Rect();
        this.xha = jbsVar.m6938di(c2058fi.xha());
    }

    /* JADX INFO: renamed from: co */
    private Bitmap m6755co() {
        Bitmap bitmapXha;
        AbstractC2139ri<Bitmap, Bitmap> abstractC2139ri = this.f4855co;
        if (abstractC2139ri != null && (bitmapXha = abstractC2139ri.xha()) != null) {
            return bitmapXha;
        }
        Bitmap bitmapM6942fi = this.f4881lr.m6942fi(this.f4879ik.xha());
        if (bitmapM6942fi != null) {
            return bitmapM6942fi;
        }
        C2127qt c2127qt = this.xha;
        if (c2127qt != null) {
            return c2127qt.m7066sf();
        }
        return null;
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri
    /* JADX INFO: renamed from: lr */
    public void mo6709lr(Canvas canvas, Matrix matrix, int i) {
        super.mo6709lr(canvas, matrix, i);
        Bitmap bitmapM6755co = m6755co();
        if (bitmapM6755co == null || bitmapM6755co.isRecycled() || this.xha == null) {
            return;
        }
        float fM6540ri = C2017di.m6540ri();
        this.f4856mj.setAlpha(i);
        AbstractC2139ri<ColorFilter, ColorFilter> abstractC2139ri = this.f4858sf;
        if (abstractC2139ri != null) {
            this.f4856mj.setColorFilter(abstractC2139ri.xha());
        }
        canvas.save();
        canvas.concat(matrix);
        this.jbs.set(0, 0, bitmapM6755co.getWidth(), bitmapM6755co.getHeight());
        if (this.f4881lr.m6945fi()) {
            this.f4857qt.set(0, 0, (int) (this.xha.m7064ri() * fM6540ri), (int) (this.xha.m7061lr() * fM6540ri));
        } else {
            this.f4857qt.set(0, 0, (int) (bitmapM6755co.getWidth() * fM6540ri), (int) (bitmapM6755co.getHeight() * fM6540ri));
        }
        canvas.drawBitmap(bitmapM6755co, this.jbs, this.f4857qt, this.f4856mj);
        canvas.restore();
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri, com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2149fi
    /* JADX INFO: renamed from: ri */
    public void mo6710ri(RectF rectF, Matrix matrix, boolean z) {
        super.mo6710ri(rectF, matrix, z);
        if (this.xha != null) {
            float fM6540ri = C2017di.m6540ri();
            rectF.set(0.0f, 0.0f, this.xha.m7064ri() * fM6540ri, this.xha.m7061lr() * fM6540ri);
            this.f4885ri.mapRect(rectF);
        }
    }
}

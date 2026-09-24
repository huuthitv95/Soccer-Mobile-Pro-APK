package com.bytedance.adsdk.p065lr.p068ik.p069ik;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.p065lr.jbs;
import com.bytedance.adsdk.p065lr.p074ri.C2142ri;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.ik.mj */
/* JADX INFO: loaded from: classes3.dex */
public class C2066mj extends AbstractC2068ri {

    /* JADX INFO: renamed from: co */
    private AbstractC2139ri<ColorFilter, ColorFilter> f4864co;
    private final float[] jbs;

    /* JADX INFO: renamed from: mj */
    private final Paint f4865mj;

    /* JADX INFO: renamed from: qt */
    private final Path f4866qt;

    /* JADX INFO: renamed from: sf */
    private final C2058fi f4867sf;
    private final RectF xha;

    C2066mj(jbs jbsVar, C2058fi c2058fi) {
        super(jbsVar, c2058fi);
        this.xha = new RectF();
        C2142ri c2142ri = new C2142ri();
        this.f4865mj = c2142ri;
        this.jbs = new float[8];
        this.f4866qt = new Path();
        this.f4867sf = c2058fi;
        c2142ri.setAlpha(0);
        c2142ri.setStyle(Paint.Style.FILL);
        c2142ri.setColor(c2058fi.slm());
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri
    /* JADX INFO: renamed from: lr */
    public void mo6709lr(Canvas canvas, Matrix matrix, int i) {
        super.mo6709lr(canvas, matrix, i);
        int iAlpha = Color.alpha(this.f4867sf.slm());
        if (iAlpha == 0) {
            return;
        }
        int iIntValue = (int) ((i / 255.0f) * (((iAlpha / 255.0f) * (this.f4880ka.m7126ri() == null ? 100 : this.f4880ka.m7126ri().xha().intValue())) / 100.0f) * 255.0f);
        this.f4865mj.setAlpha(iIntValue);
        AbstractC2139ri<ColorFilter, ColorFilter> abstractC2139ri = this.f4864co;
        if (abstractC2139ri != null) {
            this.f4865mj.setColorFilter(abstractC2139ri.xha());
        }
        if (iIntValue > 0) {
            float[] fArr = this.jbs;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.f4867sf.m6722nr();
            float[] fArr2 = this.jbs;
            fArr2[3] = 0.0f;
            fArr2[4] = this.f4867sf.m6722nr();
            this.jbs[5] = this.f4867sf.m6714bu();
            float[] fArr3 = this.jbs;
            fArr3[6] = 0.0f;
            fArr3[7] = this.f4867sf.m6714bu();
            matrix.mapPoints(this.jbs);
            this.f4866qt.reset();
            Path path = this.f4866qt;
            float[] fArr4 = this.jbs;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.f4866qt;
            float[] fArr5 = this.jbs;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.f4866qt;
            float[] fArr6 = this.jbs;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.f4866qt;
            float[] fArr7 = this.jbs;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.f4866qt;
            float[] fArr8 = this.jbs;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.f4866qt.close();
            canvas.drawPath(this.f4866qt, this.f4865mj);
        }
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri, com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2149fi
    /* JADX INFO: renamed from: ri */
    public void mo6710ri(RectF rectF, Matrix matrix, boolean z) {
        super.mo6710ri(rectF, matrix, z);
        this.xha.set(0.0f, 0.0f, this.f4867sf.m6722nr(), this.f4867sf.m6714bu());
        this.f4885ri.mapRect(this.xha);
        rectF.set(this.xha);
    }
}

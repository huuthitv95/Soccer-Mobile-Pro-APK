package com.bytedance.adsdk.p065lr.p068ik.p069ik;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.adsdk.p065lr.jbs;
import com.bytedance.adsdk.p065lr.p066di.C2017di;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.ik.qt */
/* JADX INFO: loaded from: classes3.dex */
public class C2067qt extends C2064ka {
    private int jbs;

    /* JADX INFO: renamed from: mj */
    private Path f4868mj;

    /* JADX INFO: renamed from: qt */
    private int f4869qt;

    public C2067qt(jbs jbsVar, C2058fi c2058fi, Context context) {
        super(jbsVar, c2058fi);
        this.f4868mj = null;
        this.jbs = -1;
        this.f4869qt = -1;
        if (this.xha != null) {
            float fM6540ri = C2017di.m6540ri();
            this.jbs = (int) (this.xha.m7064ri() * fM6540ri);
            this.f4869qt = (int) (this.xha.m7061lr() * fM6540ri);
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, this.jbs, this.f4869qt);
            Path path = new Path();
            this.f4868mj = path;
            float f = fM6540ri * 40.0f;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
        }
    }

    /* JADX INFO: renamed from: ri */
    private static void m6760ri(View view, int i, int i2) {
        view.layout(0, 0, i, i2);
        view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p069ik.C2064ka, com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri
    /* JADX INFO: renamed from: lr */
    public void mo6709lr(Canvas canvas, Matrix matrix, int i) {
        View viewM6970ri = this.f4881lr.m6970ri();
        if (this.jbs <= 0 || viewM6970ri == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        m6790ri(i);
        float fDi = m6780di();
        m6760ri(viewM6970ri, this.jbs, this.f4869qt);
        viewM6970ri.setAlpha(fDi);
        canvas.clipPath(this.f4868mj);
        viewM6970ri.draw(canvas);
        canvas.restore();
    }
}

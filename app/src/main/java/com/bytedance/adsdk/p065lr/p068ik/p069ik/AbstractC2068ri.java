package com.bytedance.adsdk.p065lr.p068ik.p069ik;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.p065lr.C2023fi;
import com.bytedance.adsdk.p065lr.C2127qt;
import com.bytedance.adsdk.p065lr.jbs;
import com.bytedance.adsdk.p065lr.p066di.C2017di;
import com.bytedance.adsdk.p065lr.p067fi.C2044qt;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.C2080mj;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.C2083ri;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.bgr;
import com.bytedance.adsdk.p065lr.p074ri.C2142ri;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.C2135ka;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.C2137mj;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.slm;
import com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2149fi;
import com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2150ik;
import com.bytedance.adsdk.p065lr.xha;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.ik.ri */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2068ri implements AbstractC2139ri.ri, InterfaceC2149fi {

    /* JADX INFO: renamed from: ac */
    private final String f4870ac;

    /* JADX INFO: renamed from: aw */
    private final Paint f4871aw;

    /* JADX INFO: renamed from: ay */
    private AbstractC2068ri f4872ay;
    private final Paint bgr;

    /* JADX INFO: renamed from: bu */
    private final RectF f4873bu;

    /* JADX INFO: renamed from: di */
    BlurMaskFilter f4875di;

    /* JADX INFO: renamed from: dw */
    private Paint f4876dw;

    /* JADX INFO: renamed from: fi */
    float f4877fi;

    /* JADX INFO: renamed from: fr */
    private List<AbstractC2068ri> f4878fr;
    private float hcw;
    private boolean igq;
    private C2137mj ihz;

    /* JADX INFO: renamed from: ik */
    final C2058fi f4879ik;

    /* JADX INFO: renamed from: ka */
    final slm f4880ka;

    /* JADX INFO: renamed from: lr */
    final jbs f4881lr;

    /* JADX INFO: renamed from: nr */
    private final RectF f4883nr;
    private final Matrix ory;

    /* JADX INFO: renamed from: ri */
    final Matrix f4885ri;
    private final RectF slm;

    /* JADX INFO: renamed from: su */
    private final List<AbstractC2139ri<?, ?>> f4887su;
    private final RectF tan;

    /* JADX INFO: renamed from: uq */
    private C2135ka f4888uq;

    /* JADX INFO: renamed from: vr */
    private final RectF f4889vr;
    private AbstractC2068ri wjv;

    /* JADX INFO: renamed from: zf */
    private boolean f4890zf;
    private final Path xha = new Path();

    /* JADX INFO: renamed from: mj */
    private final Matrix f4882mj = new Matrix();
    private final Matrix jbs = new Matrix();

    /* JADX INFO: renamed from: qt */
    private final Paint f4884qt = new C2142ri(1);

    /* JADX INFO: renamed from: sf */
    private final Paint f4886sf = new C2142ri(1, PorterDuff.Mode.DST_IN);

    /* JADX INFO: renamed from: co */
    private final Paint f4874co = new C2142ri(1, PorterDuff.Mode.DST_OUT);

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.ik.ri$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: lr */
        static final /* synthetic */ int[] f4892lr;

        /* JADX INFO: renamed from: ri */
        static final /* synthetic */ int[] f4893ri;

        static {
            int[] iArr = new int[C2080mj.ri.values().length];
            f4892lr = iArr;
            try {
                iArr[C2080mj.ri.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4892lr[C2080mj.ri.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4892lr[C2080mj.ri.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4892lr[C2080mj.ri.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[C2058fi.ri.values().length];
            f4893ri = iArr2;
            try {
                iArr2[C2058fi.ri.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4893ri[C2058fi.ri.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4893ri[C2058fi.ri.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4893ri[C2058fi.ri.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4893ri[C2058fi.ri.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4893ri[C2058fi.ri.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4893ri[C2058fi.ri.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    AbstractC2068ri(jbs jbsVar, C2058fi c2058fi) {
        C2142ri c2142ri = new C2142ri(1);
        this.f4871aw = c2142ri;
        this.bgr = new C2142ri(PorterDuff.Mode.CLEAR);
        this.f4889vr = new RectF();
        this.slm = new RectF();
        this.f4873bu = new RectF();
        this.f4883nr = new RectF();
        this.tan = new RectF();
        this.f4885ri = new Matrix();
        this.f4887su = new ArrayList();
        this.igq = true;
        this.f4877fi = 0.0f;
        this.ory = new Matrix();
        this.hcw = 1.0f;
        this.f4881lr = jbsVar;
        this.f4879ik = c2058fi;
        this.f4870ac = c2058fi.m6716di() + "#draw";
        if (c2058fi.m6715co() == C2058fi.lr.INVERT) {
            c2142ri.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            c2142ri.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        slm slmVarM6910qt = c2058fi.m6728vr().m6910qt();
        this.f4880ka = slmVarM6910qt;
        slmVarM6910qt.m7129ri((AbstractC2139ri.ri) this);
        if (c2058fi.m6723qt() != null && !c2058fi.m6723qt().isEmpty()) {
            C2137mj c2137mj = new C2137mj(c2058fi.m6723qt());
            this.ihz = c2137mj;
            Iterator<AbstractC2139ri<bgr, Path>> it = c2137mj.m7101lr().iterator();
            while (it.hasNext()) {
                it.next().m7111ri(this);
            }
            for (AbstractC2139ri<Integer, Integer> abstractC2139ri : this.ihz.m7100ik()) {
                m6793ri(abstractC2139ri);
                abstractC2139ri.m7111ri(this);
            }
        }
        m6762co();
    }

    /* JADX INFO: renamed from: aw */
    private void m6761aw() {
        this.f4881lr.invalidateSelf();
    }

    private boolean bgr() {
        if (this.ihz.m7101lr().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.ihz.m7102ri().size(); i++) {
            if (this.ihz.m7102ri().get(i).m6853ri() != C2080mj.ri.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: co */
    private void m6762co() {
        if (this.f4879ik.m6719ka().isEmpty()) {
            m6770lr(true);
            return;
        }
        C2135ka c2135ka = new C2135ka(this.f4879ik.m6719ka());
        this.f4888uq = c2135ka;
        c2135ka.m7110ri();
        this.f4888uq.m7111ri(new AbstractC2139ri.ri() { // from class: com.bytedance.adsdk.lr.ik.ik.ri.1
            @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri.ri
            /* JADX INFO: renamed from: ri */
            public void mo6789ri() {
                AbstractC2068ri abstractC2068ri = AbstractC2068ri.this;
                abstractC2068ri.m6770lr(abstractC2068ri.f4888uq.jbs() == 1.0f);
            }
        });
        m6770lr(this.f4888uq.xha().floatValue() == 1.0f);
        m6793ri(this.f4888uq);
    }

    /* JADX INFO: renamed from: fi */
    private void m6763fi(Canvas canvas, Matrix matrix, AbstractC2139ri<bgr, Path> abstractC2139ri, AbstractC2139ri<Integer, Integer> abstractC2139ri2) {
        C2017di.m6546ri(canvas, this.f4889vr, this.f4886sf);
        canvas.drawRect(this.f4889vr, this.f4884qt);
        this.f4874co.setAlpha((int) (abstractC2139ri2.xha().intValue() * 2.55f));
        this.xha.set(abstractC2139ri.xha());
        this.xha.transform(matrix);
        canvas.drawPath(this.xha, this.f4874co);
        canvas.restore();
    }

    /* JADX INFO: renamed from: ik */
    private void m6765ik(float f) {
        this.f4881lr.m6988su().m7186ik().m7054ri(this.f4879ik.m6716di(), f);
    }

    /* JADX INFO: renamed from: ik */
    private void m6766ik(Canvas canvas, Matrix matrix, AbstractC2139ri<bgr, Path> abstractC2139ri, AbstractC2139ri<Integer, Integer> abstractC2139ri2) {
        C2017di.m6546ri(canvas, this.f4889vr, this.f4874co);
        canvas.drawRect(this.f4889vr, this.f4884qt);
        this.f4874co.setAlpha((int) (abstractC2139ri2.xha().intValue() * 2.55f));
        this.xha.set(abstractC2139ri.xha());
        this.xha.transform(matrix);
        canvas.drawPath(this.xha, this.f4874co);
        canvas.restore();
    }

    /* JADX INFO: renamed from: ka */
    private void m6767ka(Canvas canvas, Matrix matrix, AbstractC2139ri<bgr, Path> abstractC2139ri, AbstractC2139ri<Integer, Integer> abstractC2139ri2) {
        C2017di.m6546ri(canvas, this.f4889vr, this.f4886sf);
        this.xha.set(abstractC2139ri.xha());
        this.xha.transform(matrix);
        this.f4884qt.setAlpha((int) (abstractC2139ri2.xha().intValue() * 2.55f));
        canvas.drawPath(this.xha, this.f4884qt);
        canvas.restore();
    }

    /* JADX INFO: renamed from: lr */
    private void m6768lr(Canvas canvas, Matrix matrix, AbstractC2139ri<bgr, Path> abstractC2139ri, AbstractC2139ri<Integer, Integer> abstractC2139ri2) {
        C2017di.m6546ri(canvas, this.f4889vr, this.f4884qt);
        canvas.drawRect(this.f4889vr, this.f4884qt);
        this.xha.set(abstractC2139ri.xha());
        this.xha.transform(matrix);
        this.f4884qt.setAlpha((int) (abstractC2139ri2.xha().intValue() * 2.55f));
        canvas.drawPath(this.xha, this.f4874co);
        canvas.restore();
    }

    /* JADX INFO: renamed from: lr */
    private void m6769lr(RectF rectF, Matrix matrix) {
        if (m6782ik() && this.f4879ik.m6715co() != C2058fi.lr.INVERT) {
            this.f4883nr.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.wjv.mo6710ri(this.f4883nr, matrix, true);
            if (rectF.intersect(this.f4883nr)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m6770lr(boolean z) {
        if (z != this.igq) {
            this.igq = z;
            m6761aw();
        }
    }

    /* JADX INFO: renamed from: ri */
    static AbstractC2068ri m6771ri(C2065lr c2065lr, C2058fi c2058fi, jbs jbsVar, xha xhaVar, Context context) {
        switch (AnonymousClass2.f4893ri[c2058fi.m6726sf().ordinal()]) {
            case 1:
                return new xha(jbsVar, c2058fi, c2065lr, xhaVar);
            case 2:
                return new C2065lr(jbsVar, c2058fi, xhaVar.m7189lr(c2058fi.xha()), xhaVar, context);
            case 3:
                return new C2066mj(jbsVar, c2058fi);
            case 4:
                if (m6778ri(jbsVar, c2058fi, "text:")) {
                    return new C2059ik(jbsVar, c2058fi, context);
                }
                return m6778ri(jbsVar, c2058fi, "videoview:") ? new C2067qt(jbsVar, c2058fi, context) : new C2064ka(jbsVar, c2058fi);
            case 5:
                return new C2057di(jbsVar, c2058fi);
            case 6:
                return new jbs(jbsVar, c2058fi);
            default:
                Objects.toString(c2058fi.m6726sf());
                return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m6772ri(Canvas canvas) {
        C2023fi.m6599ri("Layer#clearLayer");
        canvas.drawRect(this.f4889vr.left - 1.0f, this.f4889vr.top - 1.0f, this.f4889vr.right + 1.0f, this.f4889vr.bottom + 1.0f, this.bgr);
        C2023fi.m6596lr("Layer#clearLayer");
    }

    /* JADX INFO: renamed from: ri */
    private void m6773ri(Canvas canvas, Matrix matrix) {
        C2023fi.m6599ri("Layer#saveLayer");
        C2017di.m6547ri(canvas, this.f4889vr, this.f4886sf, 19);
        if (Build.VERSION.SDK_INT < 28) {
            m6772ri(canvas);
        }
        C2023fi.m6596lr("Layer#saveLayer");
        for (int i = 0; i < this.ihz.m7102ri().size(); i++) {
            C2080mj c2080mj = this.ihz.m7102ri().get(i);
            AbstractC2139ri<bgr, Path> abstractC2139ri = this.ihz.m7101lr().get(i);
            AbstractC2139ri<Integer, Integer> abstractC2139ri2 = this.ihz.m7100ik().get(i);
            int i2 = AnonymousClass2.f4892lr[c2080mj.m6853ri().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == 0) {
                        this.f4884qt.setColor(ViewCompat.MEASURED_STATE_MASK);
                        this.f4884qt.setAlpha(255);
                        canvas.drawRect(this.f4889vr, this.f4884qt);
                    }
                    if (c2080mj.m6851ka()) {
                        m6766ik(canvas, matrix, abstractC2139ri, abstractC2139ri2);
                    } else {
                        m6774ri(canvas, matrix, abstractC2139ri);
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (c2080mj.m6851ka()) {
                            m6768lr(canvas, matrix, abstractC2139ri, abstractC2139ri2);
                        } else {
                            m6775ri(canvas, matrix, abstractC2139ri, abstractC2139ri2);
                        }
                    }
                } else if (c2080mj.m6851ka()) {
                    m6763fi(canvas, matrix, abstractC2139ri, abstractC2139ri2);
                } else {
                    m6767ka(canvas, matrix, abstractC2139ri, abstractC2139ri2);
                }
            } else if (bgr()) {
                this.f4884qt.setAlpha(255);
                canvas.drawRect(this.f4889vr, this.f4884qt);
            }
        }
        C2023fi.m6599ri("Layer#restoreLayer");
        canvas.restore();
        C2023fi.m6596lr("Layer#restoreLayer");
    }

    /* JADX INFO: renamed from: ri */
    private void m6774ri(Canvas canvas, Matrix matrix, AbstractC2139ri<bgr, Path> abstractC2139ri) {
        this.xha.set(abstractC2139ri.xha());
        this.xha.transform(matrix);
        canvas.drawPath(this.xha, this.f4874co);
    }

    /* JADX INFO: renamed from: ri */
    private void m6775ri(Canvas canvas, Matrix matrix, AbstractC2139ri<bgr, Path> abstractC2139ri, AbstractC2139ri<Integer, Integer> abstractC2139ri2) {
        this.xha.set(abstractC2139ri.xha());
        this.xha.transform(matrix);
        this.f4884qt.setAlpha((int) (abstractC2139ri2.xha().intValue() * 2.55f));
        canvas.drawPath(this.xha, this.f4884qt);
    }

    /* JADX INFO: renamed from: ri */
    private void m6776ri(RectF rectF, Matrix matrix) {
        this.f4873bu.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (xha()) {
            int size = this.ihz.m7102ri().size();
            for (int i = 0; i < size; i++) {
                C2080mj c2080mj = this.ihz.m7102ri().get(i);
                Path pathXha = this.ihz.m7101lr().get(i).xha();
                if (pathXha != null) {
                    this.xha.set(pathXha);
                    this.xha.transform(matrix);
                    int i2 = AnonymousClass2.f4892lr[c2080mj.m6853ri().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        return;
                    }
                    if ((i2 == 3 || i2 == 4) && c2080mj.m6851ka()) {
                        return;
                    }
                    this.xha.computeBounds(this.tan, false);
                    if (i == 0) {
                        this.f4873bu.set(this.tan);
                    } else {
                        RectF rectF2 = this.f4873bu;
                        rectF2.set(Math.min(rectF2.left, this.tan.left), Math.min(this.f4873bu.top, this.tan.top), Math.max(this.f4873bu.right, this.tan.right), Math.max(this.f4873bu.bottom, this.tan.bottom));
                    }
                }
            }
            if (rectF.intersect(this.f4873bu)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* JADX INFO: renamed from: ri */
    private static boolean m6778ri(jbs jbsVar, C2058fi c2058fi, String str) {
        C2127qt c2127qtM6938di;
        if (jbsVar == null || c2058fi == null || str == null || (c2127qtM6938di = jbsVar.m6938di(c2058fi.xha())) == null) {
            return false;
        }
        return str.equals(c2127qtM6938di.m7063qt());
    }

    /* JADX INFO: renamed from: vr */
    private void m6779vr() {
        if (this.f4878fr != null) {
            return;
        }
        if (this.f4872ay == null) {
            this.f4878fr = Collections.EMPTY_LIST;
            return;
        }
        this.f4878fr = new ArrayList();
        for (AbstractC2068ri abstractC2068ri = this.f4872ay; abstractC2068ri != null; abstractC2068ri = abstractC2068ri.f4872ay) {
            this.f4878fr.add(abstractC2068ri);
        }
    }

    /* JADX INFO: renamed from: di */
    public float m6780di() {
        return this.hcw;
    }

    /* JADX INFO: renamed from: fi */
    public String m6781fi() {
        C2058fi c2058fi = this.f4879ik;
        if (c2058fi != null) {
            return c2058fi.xha();
        }
        return null;
    }

    /* JADX INFO: renamed from: ik */
    boolean m6782ik() {
        return this.wjv != null;
    }

    public String jbs() {
        return this.f4879ik.m6716di();
    }

    /* JADX INFO: renamed from: ka */
    public Matrix m6783ka() {
        return this.ory;
    }

    /* JADX INFO: renamed from: lr */
    public BlurMaskFilter m6784lr(float f) {
        if (this.f4877fi == f) {
            return this.f4875di;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.f4875di = blurMaskFilter;
        this.f4877fi = f;
        return blurMaskFilter;
    }

    /* JADX INFO: renamed from: lr */
    C2058fi m6785lr() {
        return this.f4879ik;
    }

    /* JADX INFO: renamed from: lr */
    public void mo6709lr(Canvas canvas, Matrix matrix, int i) {
        m6790ri(i);
    }

    /* JADX INFO: renamed from: lr */
    void m6786lr(AbstractC2068ri abstractC2068ri) {
        this.f4872ay = abstractC2068ri;
    }

    /* JADX INFO: renamed from: mj */
    public boolean m6787mj() {
        return this.igq;
    }

    /* JADX INFO: renamed from: qt */
    public C2083ri mo6788qt() {
        return this.f4879ik.wjv();
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri.ri
    /* JADX INFO: renamed from: ri */
    public void mo6789ri() {
        m6761aw();
    }

    /* JADX INFO: renamed from: ri */
    void mo6758ri(float f) {
        this.f4880ka.m7127ri(f);
        if (this.ihz != null) {
            for (int i = 0; i < this.ihz.m7101lr().size(); i++) {
                this.ihz.m7101lr().get(i).mo7086ri(f);
            }
        }
        C2135ka c2135ka = this.f4888uq;
        if (c2135ka != null) {
            c2135ka.mo7086ri(f);
        }
        AbstractC2068ri abstractC2068ri = this.wjv;
        if (abstractC2068ri != null) {
            abstractC2068ri.mo6758ri(f);
        }
        for (int i2 = 0; i2 < this.f4887su.size(); i2++) {
            this.f4887su.get(i2).mo7086ri(f);
        }
    }

    /* JADX INFO: renamed from: ri */
    protected void m6790ri(int i) {
        this.hcw = ((this.f4880ka.m7126ri() != null ? this.f4880ka.m7126ri().xha().intValue() : 100) / 100.0f) * (i / 255.0f);
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2149fi
    /* JADX INFO: renamed from: ri */
    public void mo6791ri(Canvas canvas, Matrix matrix, int i) {
        Paint paint;
        Integer numXha;
        C2023fi.m6599ri(this.f4870ac);
        if (!this.igq || this.f4879ik.m6727uq()) {
            C2023fi.m6596lr(this.f4870ac);
            return;
        }
        m6779vr();
        C2023fi.m6599ri("Layer#parentMatrix");
        this.ory.set(matrix);
        this.f4882mj.reset();
        this.f4882mj.set(matrix);
        for (int size = this.f4878fr.size() - 1; size >= 0; size--) {
            this.f4882mj.preConcat(this.f4878fr.get(size).f4880ka.m7123ka());
        }
        C2023fi.m6596lr("Layer#parentMatrix");
        AbstractC2139ri<?, Integer> abstractC2139riM7126ri = this.f4880ka.m7126ri();
        int iIntValue = (int) ((((i / 255.0f) * ((abstractC2139riM7126ri == null || (numXha = abstractC2139riM7126ri.xha()) == null) ? 100 : numXha.intValue())) / 100.0f) * 255.0f);
        if (!m6782ik() && !xha()) {
            this.f4882mj.preConcat(this.f4880ka.m7123ka());
            C2023fi.m6599ri("Layer#drawLayer");
            mo6709lr(canvas, this.f4882mj, iIntValue);
            C2023fi.m6596lr("Layer#drawLayer");
            m6765ik(C2023fi.m6596lr(this.f4870ac));
            return;
        }
        C2023fi.m6599ri("Layer#computeBounds");
        mo6710ri(this.f4889vr, this.f4882mj, false);
        m6769lr(this.f4889vr, matrix);
        this.f4882mj.preConcat(this.f4880ka.m7123ka());
        m6776ri(this.f4889vr, this.f4882mj);
        this.slm.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.jbs);
        if (!this.jbs.isIdentity()) {
            Matrix matrix2 = this.jbs;
            matrix2.invert(matrix2);
            this.jbs.mapRect(this.slm);
        }
        if (!this.f4889vr.intersect(this.slm)) {
            this.f4889vr.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        C2023fi.m6596lr("Layer#computeBounds");
        if (this.f4889vr.width() >= 1.0f && this.f4889vr.height() >= 1.0f) {
            C2023fi.m6599ri("Layer#saveLayer");
            this.f4884qt.setAlpha(255);
            C2017di.m6546ri(canvas, this.f4889vr, this.f4884qt);
            C2023fi.m6596lr("Layer#saveLayer");
            m6772ri(canvas);
            C2023fi.m6599ri("Layer#drawLayer");
            mo6709lr(canvas, this.f4882mj, iIntValue);
            C2023fi.m6596lr("Layer#drawLayer");
            if (xha()) {
                m6773ri(canvas, this.f4882mj);
            }
            if (m6782ik()) {
                C2023fi.m6599ri("Layer#drawMatte");
                C2023fi.m6599ri("Layer#saveLayer");
                C2017di.m6547ri(canvas, this.f4889vr, this.f4871aw, 19);
                C2023fi.m6596lr("Layer#saveLayer");
                m6772ri(canvas);
                this.wjv.mo6791ri(canvas, matrix, iIntValue);
                C2023fi.m6599ri("Layer#restoreLayer");
                canvas.restore();
                C2023fi.m6596lr("Layer#restoreLayer");
                C2023fi.m6596lr("Layer#drawMatte");
            }
            C2023fi.m6599ri("Layer#restoreLayer");
            canvas.restore();
            C2023fi.m6596lr("Layer#restoreLayer");
        }
        if (this.f4890zf && (paint = this.f4876dw) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.f4876dw.setColor(-251901);
            this.f4876dw.setStrokeWidth(4.0f);
            canvas.drawRect(this.f4889vr, this.f4876dw);
            this.f4876dw.setStyle(Paint.Style.FILL);
            this.f4876dw.setColor(1357638635);
            canvas.drawRect(this.f4889vr, this.f4876dw);
        }
        m6765ik(C2023fi.m6596lr(this.f4870ac));
    }

    /* JADX INFO: renamed from: ri */
    public void mo6710ri(RectF rectF, Matrix matrix, boolean z) {
        this.f4889vr.set(0.0f, 0.0f, 0.0f, 0.0f);
        m6779vr();
        this.f4885ri.set(matrix);
        if (z) {
            List<AbstractC2068ri> list = this.f4878fr;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f4885ri.preConcat(this.f4878fr.get(size).f4880ka.m7123ka());
                }
            } else {
                AbstractC2068ri abstractC2068ri = this.f4872ay;
                if (abstractC2068ri != null) {
                    this.f4885ri.preConcat(abstractC2068ri.f4880ka.m7123ka());
                }
            }
        }
        this.f4885ri.preConcat(this.f4880ka.m7123ka());
    }

    /* JADX INFO: renamed from: ri */
    void m6792ri(AbstractC2068ri abstractC2068ri) {
        this.wjv = abstractC2068ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m6793ri(AbstractC2139ri<?, ?> abstractC2139ri) {
        if (abstractC2139ri == null) {
            return;
        }
        this.f4887su.add(abstractC2139ri);
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2150ik
    /* JADX INFO: renamed from: ri */
    public void mo6794ri(List<InterfaceC2150ik> list, List<InterfaceC2150ik> list2) {
    }

    /* JADX INFO: renamed from: ri */
    void mo6759ri(boolean z) {
        if (z && this.f4876dw == null) {
            this.f4876dw = new C2142ri();
        }
        this.f4890zf = z;
    }

    /* JADX INFO: renamed from: sf */
    public C2044qt mo6795sf() {
        return this.f4879ik.m6713ay();
    }

    boolean xha() {
        C2137mj c2137mj = this.ihz;
        return (c2137mj == null || c2137mj.m7101lr().isEmpty()) ? false : true;
    }
}

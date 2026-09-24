package com.bytedance.adsdk.p065lr.p068ik.p069ik;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.LongSparseArray;
import com.bytedance.adsdk.p065lr.C2012ac;
import com.bytedance.adsdk.p065lr.p066di.C2017di;
import com.bytedance.adsdk.p065lr.p068ik.C2056ik;
import com.bytedance.adsdk.p065lr.p068ik.C2069ka;
import com.bytedance.adsdk.p065lr.p068ik.C2070lr;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.slm;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2098sf;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.C2141vr;
import com.bytedance.adsdk.p065lr.p074ri.p076ri.C2151ka;
import com.bytedance.adsdk.p065lr.xha;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class jbs extends AbstractC2068ri {

    /* JADX INFO: renamed from: ac */
    private AbstractC2139ri<Integer, Integer> f4837ac;

    /* JADX INFO: renamed from: aw */
    private final LongSparseArray<String> f4838aw;

    /* JADX INFO: renamed from: ay */
    private AbstractC2139ri<Float, Float> f4839ay;
    private final List<C2063ri> bgr;

    /* JADX INFO: renamed from: bu */
    private final xha f4840bu;

    /* JADX INFO: renamed from: co */
    private final Map<C2069ka, List<C2151ka>> f4841co;

    /* JADX INFO: renamed from: fr */
    private AbstractC2139ri<Float, Float> f4842fr;
    private AbstractC2139ri<Typeface, Typeface> igq;
    private AbstractC2139ri<Integer, Integer> ihz;
    private final Matrix jbs;

    /* JADX INFO: renamed from: mj */
    private final RectF f4843mj;

    /* JADX INFO: renamed from: nr */
    private AbstractC2139ri<Integer, Integer> f4844nr;

    /* JADX INFO: renamed from: qt */
    private final Paint f4845qt;

    /* JADX INFO: renamed from: sf */
    private final Paint f4846sf;
    private final com.bytedance.adsdk.p065lr.jbs slm;

    /* JADX INFO: renamed from: su */
    private AbstractC2139ri<Float, Float> f4847su;
    private AbstractC2139ri<Integer, Integer> tan;

    /* JADX INFO: renamed from: uq */
    private AbstractC2139ri<Float, Float> f4848uq;

    /* JADX INFO: renamed from: vr */
    private final C2141vr f4849vr;
    private AbstractC2139ri<Float, Float> wjv;
    private final StringBuilder xha;

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.ik.jbs$3 */
    static /* synthetic */ class C20623 {

        /* JADX INFO: renamed from: ri */
        static final /* synthetic */ int[] f4852ri;

        static {
            int[] iArr = new int[C2070lr.ri.values().length];
            f4852ri = iArr;
            try {
                iArr[C2070lr.ri.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4852ri[C2070lr.ri.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4852ri[C2070lr.ri.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.ik.jbs$ri */
    private static class C2063ri {

        /* JADX INFO: renamed from: lr */
        private float f4853lr;

        /* JADX INFO: renamed from: ri */
        private String f4854ri;

        private C2063ri() {
            this.f4854ri = "";
            this.f4853lr = 0.0f;
        }

        /* JADX INFO: renamed from: ri */
        void m6754ri(String str, float f) {
            this.f4854ri = str;
            this.f4853lr = f;
        }
    }

    jbs(com.bytedance.adsdk.p065lr.jbs jbsVar, C2058fi c2058fi) {
        super(jbsVar, c2058fi);
        this.xha = new StringBuilder(2);
        this.f4843mj = new RectF();
        this.jbs = new Matrix();
        int i = 1;
        this.f4845qt = new Paint(i) { // from class: com.bytedance.adsdk.lr.ik.ik.jbs.1
            {
                setStyle(Paint.Style.FILL);
            }
        };
        this.f4846sf = new Paint(i) { // from class: com.bytedance.adsdk.lr.ik.ik.jbs.2
            {
                setStyle(Paint.Style.STROKE);
            }
        };
        this.f4841co = new HashMap();
        this.f4838aw = new LongSparseArray<>();
        this.bgr = new ArrayList();
        this.slm = jbsVar;
        this.f4840bu = c2058fi.m6724ri();
        C2141vr c2141vrMo6903ri = c2058fi.tan().mo6903ri();
        this.f4849vr = c2141vrMo6903ri;
        c2141vrMo6903ri.m7111ri(this);
        m6793ri(c2141vrMo6903ri);
        C2098sf c2098sfM6711ac = c2058fi.m6711ac();
        if (c2098sfM6711ac != null && c2098sfM6711ac.f5049ri != null) {
            AbstractC2139ri<Integer, Integer> abstractC2139riMo6903ri = c2098sfM6711ac.f5049ri.mo6903ri();
            this.f4844nr = abstractC2139riMo6903ri;
            abstractC2139riMo6903ri.m7111ri(this);
            m6793ri(this.f4844nr);
        }
        if (c2098sfM6711ac != null && c2098sfM6711ac.f5048lr != null) {
            AbstractC2139ri<Integer, Integer> abstractC2139riMo6903ri2 = c2098sfM6711ac.f5048lr.mo6903ri();
            this.f4837ac = abstractC2139riMo6903ri2;
            abstractC2139riMo6903ri2.m7111ri(this);
            m6793ri(this.f4837ac);
        }
        if (c2098sfM6711ac != null && c2098sfM6711ac.f5046ik != null) {
            AbstractC2139ri<Float, Float> abstractC2139riMo6903ri3 = c2098sfM6711ac.f5046ik.mo6903ri();
            this.f4848uq = abstractC2139riMo6903ri3;
            abstractC2139riMo6903ri3.m7111ri(this);
            m6793ri(this.f4848uq);
        }
        if (c2098sfM6711ac == null || c2098sfM6711ac.f5047ka == null) {
            return;
        }
        AbstractC2139ri<Float, Float> abstractC2139riMo6903ri4 = c2098sfM6711ac.f5047ka.mo6903ri();
        this.f4839ay = abstractC2139riMo6903ri4;
        abstractC2139riMo6903ri4.m7111ri(this);
        m6793ri(this.f4839ay);
    }

    /* JADX INFO: renamed from: ik */
    private boolean m6735ik(int i) {
        return Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 8 || Character.getType(i) == 19;
    }

    /* JADX INFO: renamed from: lr */
    private C2063ri m6736lr(int i) {
        for (int size = this.bgr.size(); size < i; size++) {
            this.bgr.add(new C2063ri());
        }
        return this.bgr.get(i - 1);
    }

    /* JADX INFO: renamed from: ri */
    private Typeface m6737ri(C2056ik c2056ik) {
        Typeface typefaceXha;
        AbstractC2139ri<Typeface, Typeface> abstractC2139ri = this.igq;
        if (abstractC2139ri != null && (typefaceXha = abstractC2139ri.xha()) != null) {
            return typefaceXha;
        }
        Typeface typefaceM6969ri = this.slm.m6969ri(c2056ik);
        return typefaceM6969ri != null ? typefaceM6969ri : c2056ik.m6705ka();
    }

    /* JADX INFO: renamed from: ri */
    private String m6738ri(String str, int i) {
        int iCodePointAt = str.codePointAt(i);
        int iCharCount = Character.charCount(iCodePointAt) + i;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!m6735ik(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j = iCodePointAt;
        if (this.f4838aw.indexOfKey(j) >= 0) {
            return this.f4838aw.get(j);
        }
        this.xha.setLength(0);
        while (i < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i);
            this.xha.appendCodePoint(iCodePointAt3);
            i += Character.charCount(iCodePointAt3);
        }
        String string = this.xha.toString();
        this.f4838aw.put(j, string);
        return string;
    }

    /* JADX INFO: renamed from: ri */
    private List<C2151ka> m6739ri(C2069ka c2069ka) {
        if (this.f4841co.containsKey(c2069ka)) {
            return this.f4841co.get(c2069ka);
        }
        List<slm> listM6798ri = c2069ka.m6798ri();
        int size = listM6798ri.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C2151ka(this.slm, this, listM6798ri.get(i), this.f4840bu));
        }
        this.f4841co.put(c2069ka, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ri */
    private List<String> m6740ri(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    /* JADX INFO: renamed from: ri */
    private List<C2063ri> m6741ri(String str, float f, C2056ik c2056ik, float f2, float f3, boolean z) {
        float fMeasureText;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (z) {
                C2069ka c2069ka = this.f4840bu.bgr().get(C2069ka.m6796ri(cCharAt, c2056ik.m6707ri(), c2056ik.m6704ik()));
                if (c2069ka != null) {
                    fMeasureText = ((float) c2069ka.m6797lr()) * f2 * C2017di.m6540ri();
                }
            } else {
                fMeasureText = this.f4845qt.measureText(str.substring(i4, i4 + 1));
            }
            float f7 = fMeasureText + f3;
            if (cCharAt == ' ') {
                z2 = true;
                f6 = f7;
            } else if (z2) {
                z2 = false;
                i3 = i4;
                f5 = f7;
            } else {
                f5 += f7;
            }
            f4 += f7;
            if (f > 0.0f && f4 >= f && cCharAt != ' ') {
                i++;
                C2063ri c2063riM6736lr = m6736lr(i);
                if (i3 == i2) {
                    String strSubstring = str.substring(i2, i4);
                    String strTrim = strSubstring.trim();
                    c2063riM6736lr.m6754ri(strTrim, (f4 - f7) - ((strTrim.length() - strSubstring.length()) * f6));
                    i2 = i4;
                    i3 = i2;
                    f4 = f7;
                    f5 = f4;
                } else {
                    String strSubstring2 = str.substring(i2, i3 - 1);
                    String strTrim2 = strSubstring2.trim();
                    c2063riM6736lr.m6754ri(strTrim2, ((f4 - f5) - ((strSubstring2.length() - strTrim2.length()) * f6)) - f6);
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            m6736lr(i).m6754ri(str.substring(i2), f4);
        }
        return this.bgr.subList(0, i);
    }

    /* JADX INFO: renamed from: ri */
    private void m6742ri(Canvas canvas, C2070lr c2070lr, int i, float f) {
        PointF pointF = c2070lr.f4902co;
        PointF pointF2 = c2070lr.f4901aw;
        float fM6540ri = C2017di.m6540ri();
        float f2 = (i * c2070lr.f4903di * fM6540ri) + (pointF == null ? 0.0f : (c2070lr.f4903di * 0.6f * fM6540ri) + pointF.y);
        float f3 = pointF == null ? 0.0f : pointF.x;
        float f4 = pointF2 != null ? pointF2.x : 0.0f;
        int i2 = C20623.f4852ri[c2070lr.f4906ka.ordinal()];
        if (i2 == 1) {
            canvas.translate(f3, f2);
        } else if (i2 == 2) {
            canvas.translate((f3 + f4) - f, f2);
        } else {
            if (i2 != 3) {
                return;
            }
            canvas.translate((f3 + (f4 / 2.0f)) - (f / 2.0f), f2);
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m6743ri(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* JADX INFO: renamed from: ri */
    private void m6744ri(C2069ka c2069ka, float f, C2070lr c2070lr, Canvas canvas) {
        List<C2151ka> listM6739ri = m6739ri(c2069ka);
        for (int i = 0; i < listM6739ri.size(); i++) {
            Path pathMo7131ka = listM6739ri.get(i).mo7131ka();
            pathMo7131ka.computeBounds(this.f4843mj, false);
            this.jbs.reset();
            this.jbs.preTranslate(0.0f, (-c2070lr.xha) * C2017di.m6540ri());
            this.jbs.preScale(f, f);
            pathMo7131ka.transform(this.jbs);
            if (c2070lr.f4911sf) {
                m6743ri(pathMo7131ka, this.f4845qt, canvas);
                m6743ri(pathMo7131ka, this.f4846sf, canvas);
            } else {
                m6743ri(pathMo7131ka, this.f4846sf, canvas);
                m6743ri(pathMo7131ka, this.f4845qt, canvas);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m6745ri(C2070lr c2070lr, Matrix matrix) {
        AbstractC2139ri<Integer, Integer> abstractC2139ri = this.tan;
        if (abstractC2139ri != null) {
            this.f4845qt.setColor(abstractC2139ri.xha().intValue());
        } else {
            AbstractC2139ri<Integer, Integer> abstractC2139ri2 = this.f4844nr;
            if (abstractC2139ri2 != null) {
                this.f4845qt.setColor(abstractC2139ri2.xha().intValue());
            } else {
                this.f4845qt.setColor(c2070lr.f4908mj);
            }
        }
        AbstractC2139ri<Integer, Integer> abstractC2139ri3 = this.ihz;
        if (abstractC2139ri3 != null) {
            this.f4846sf.setColor(abstractC2139ri3.xha().intValue());
        } else {
            AbstractC2139ri<Integer, Integer> abstractC2139ri4 = this.f4837ac;
            if (abstractC2139ri4 != null) {
                this.f4846sf.setColor(abstractC2139ri4.xha().intValue());
            } else {
                this.f4846sf.setColor(c2070lr.jbs);
            }
        }
        int iIntValue = ((this.f4880ka.m7126ri() == null ? 100 : this.f4880ka.m7126ri().xha().intValue()) * 255) / 100;
        this.f4845qt.setAlpha(iIntValue);
        this.f4846sf.setAlpha(iIntValue);
        AbstractC2139ri<Float, Float> abstractC2139ri5 = this.wjv;
        if (abstractC2139ri5 != null) {
            this.f4846sf.setStrokeWidth(abstractC2139ri5.xha().floatValue());
            return;
        }
        AbstractC2139ri<Float, Float> abstractC2139ri6 = this.f4848uq;
        if (abstractC2139ri6 != null) {
            this.f4846sf.setStrokeWidth(abstractC2139ri6.xha().floatValue());
        } else {
            this.f4846sf.setStrokeWidth(c2070lr.f4909qt * C2017di.m6540ri());
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0053  */
    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
    /* JADX WARN: Code duplicated, block: B:18:0x005f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0071 A[LOOP:1: B:20:0x006b->B:22:0x0071, LOOP_END] */
    /* JADX INFO: renamed from: ri */
    private void m6746ri(C2070lr c2070lr, Matrix matrix, C2056ik c2056ik, Canvas canvas) {
        float fFloatValue;
        float f;
        int i;
        int i2;
        float f2;
        List<C2063ri> listM6741ri;
        int i3;
        jbs jbsVar = this;
        C2070lr c2070lr2 = c2070lr;
        AbstractC2139ri<Float, Float> abstractC2139ri = jbsVar.f4847su;
        float fFloatValue2 = (abstractC2139ri != null ? abstractC2139ri.xha().floatValue() : c2070lr2.f4905ik) / 100.0f;
        float fM6542ri = C2017di.m6542ri(matrix);
        List<String> listM6740ri = jbsVar.m6740ri(c2070lr2.f4910ri);
        int size = listM6740ri.size();
        float f3 = c2070lr2.f4904fi / 10.0f;
        AbstractC2139ri<Float, Float> abstractC2139ri2 = jbsVar.f4842fr;
        if (abstractC2139ri2 == null) {
            AbstractC2139ri<Float, Float> abstractC2139ri3 = jbsVar.f4839ay;
            if (abstractC2139ri3 != null) {
                fFloatValue = abstractC2139ri3.xha().floatValue();
            }
            f = f3;
            i = -1;
            i2 = 0;
            while (i2 < size) {
                String str = listM6740ri.get(i2);
                if (c2070lr2.f4901aw == null) {
                    f2 = 0.0f;
                } else {
                    f2 = c2070lr2.f4901aw.x;
                }
                listM6741ri = jbsVar.m6741ri(str, f2, c2056ik, fFloatValue2, f, true);
                i3 = 0;
                while (i3 < listM6741ri.size()) {
                    C2063ri c2063ri = listM6741ri.get(i3);
                    i++;
                    canvas.save();
                    jbsVar.m6742ri(canvas, c2070lr2, i, c2063ri.f4853lr);
                    float f4 = fFloatValue2;
                    C2070lr c2070lr3 = c2070lr2;
                    float f5 = f;
                    jbsVar.m6751ri(c2063ri.f4854ri, c2070lr3, c2056ik, canvas, fM6542ri, f4, f5);
                    fFloatValue2 = f4;
                    canvas.restore();
                    i3++;
                    jbsVar = this;
                    f = f5;
                    c2070lr2 = c2070lr;
                }
                i2++;
                jbsVar = this;
                f = f;
                c2070lr2 = c2070lr;
            }
        }
        fFloatValue = abstractC2139ri2.xha().floatValue();
        f3 += fFloatValue;
        f = f3;
        i = -1;
        i2 = 0;
        while (i2 < size) {
            String str2 = listM6740ri.get(i2);
            if (c2070lr2.f4901aw == null) {
                f2 = 0.0f;
            } else {
                f2 = c2070lr2.f4901aw.x;
            }
            listM6741ri = jbsVar.m6741ri(str2, f2, c2056ik, fFloatValue2, f, true);
            i3 = 0;
            while (i3 < listM6741ri.size()) {
                C2063ri c2063ri2 = listM6741ri.get(i3);
                i++;
                canvas.save();
                jbsVar.m6742ri(canvas, c2070lr2, i, c2063ri2.f4853lr);
                float f6 = fFloatValue2;
                C2070lr c2070lr4 = c2070lr2;
                float f7 = f;
                jbsVar.m6751ri(c2063ri2.f4854ri, c2070lr4, c2056ik, canvas, fM6542ri, f6, f7);
                fFloatValue2 = f6;
                canvas.restore();
                i3++;
                jbsVar = this;
                f = f7;
                c2070lr2 = c2070lr;
            }
            i2++;
            jbsVar = this;
            f = f;
            c2070lr2 = c2070lr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0099  */
    /* JADX WARN: Code duplicated, block: B:24:0x009b  */
    /* JADX WARN: Code duplicated, block: B:28:0x00af A[LOOP:1: B:26:0x00a9->B:28:0x00af, LOOP_END] */
    /* JADX INFO: renamed from: ri */
    private void m6747ri(C2070lr c2070lr, C2056ik c2056ik, Canvas canvas) {
        float fFloatValue;
        float fM6540ri;
        List<String> listM6740ri;
        int size;
        int i;
        int i2;
        float f;
        List<C2063ri> listM6741ri;
        int i3;
        Typeface typefaceM6737ri = m6737ri(c2056ik);
        if (typefaceM6737ri != null) {
            String strM6451lr = c2070lr.f4910ri;
            C2012ac c2012acM6935ay = this.slm.m6935ay();
            if (c2012acM6935ay != null) {
                strM6451lr = c2012acM6935ay.m6451lr(jbs(), strM6451lr);
            }
            this.f4845qt.setTypeface(typefaceM6737ri);
            AbstractC2139ri<Float, Float> abstractC2139ri = this.f4847su;
            float fFloatValue2 = abstractC2139ri != null ? abstractC2139ri.xha().floatValue() : c2070lr.f4905ik;
            this.f4845qt.setTextSize(C2017di.m6540ri() * fFloatValue2);
            this.f4846sf.setTypeface(this.f4845qt.getTypeface());
            this.f4846sf.setTextSize(this.f4845qt.getTextSize());
            float f2 = c2070lr.f4904fi / 10.0f;
            AbstractC2139ri<Float, Float> abstractC2139ri2 = this.f4842fr;
            if (abstractC2139ri2 != null) {
                fFloatValue = abstractC2139ri2.xha().floatValue();
            } else {
                AbstractC2139ri<Float, Float> abstractC2139ri3 = this.f4839ay;
                if (abstractC2139ri3 != null) {
                    fFloatValue = abstractC2139ri3.xha().floatValue();
                }
                fM6540ri = ((f2 * C2017di.m6540ri()) * fFloatValue2) / 100.0f;
                listM6740ri = m6740ri(strM6451lr);
                size = listM6740ri.size();
                i = 0;
                i2 = -1;
                while (i < size) {
                    String str = listM6740ri.get(i);
                    if (c2070lr.f4901aw == null) {
                        f = 0.0f;
                    } else {
                        f = c2070lr.f4901aw.x;
                    }
                    C2056ik c2056ik2 = c2056ik;
                    listM6741ri = m6741ri(str, f, c2056ik2, 0.0f, fM6540ri, false);
                    for (i3 = 0; i3 < listM6741ri.size(); i3++) {
                        C2063ri c2063ri = listM6741ri.get(i3);
                        i2++;
                        canvas.save();
                        m6742ri(canvas, c2070lr, i2, c2063ri.f4853lr);
                        m6750ri(c2063ri.f4854ri, c2070lr, canvas, fM6540ri);
                        canvas.restore();
                    }
                    i++;
                    c2056ik = c2056ik2;
                }
            }
            f2 += fFloatValue;
            fM6540ri = ((f2 * C2017di.m6540ri()) * fFloatValue2) / 100.0f;
            listM6740ri = m6740ri(strM6451lr);
            size = listM6740ri.size();
            i = 0;
            i2 = -1;
            while (i < size) {
                String str2 = listM6740ri.get(i);
                if (c2070lr.f4901aw == null) {
                    f = 0.0f;
                } else {
                    f = c2070lr.f4901aw.x;
                }
                C2056ik c2056ik3 = c2056ik;
                listM6741ri = m6741ri(str2, f, c2056ik3, 0.0f, fM6540ri, false);
                while (i3 < listM6741ri.size()) {
                    C2063ri c2063ri2 = listM6741ri.get(i3);
                    i2++;
                    canvas.save();
                    m6742ri(canvas, c2070lr, i2, c2063ri2.f4853lr);
                    m6750ri(c2063ri2.f4854ri, c2070lr, canvas, fM6540ri);
                    canvas.restore();
                }
                i++;
                c2056ik = c2056ik3;
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m6748ri(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    /* JADX INFO: renamed from: ri */
    private void m6749ri(String str, C2070lr c2070lr, Canvas canvas) {
        if (c2070lr.f4911sf) {
            m6748ri(str, this.f4845qt, canvas);
            m6748ri(str, this.f4846sf, canvas);
        } else {
            m6748ri(str, this.f4846sf, canvas);
            m6748ri(str, this.f4845qt, canvas);
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m6750ri(String str, C2070lr c2070lr, Canvas canvas, float f) {
        int length = 0;
        while (length < str.length()) {
            String strM6738ri = m6738ri(str, length);
            length += strM6738ri.length();
            m6749ri(strM6738ri, c2070lr, canvas);
            canvas.translate(this.f4845qt.measureText(strM6738ri) + f, 0.0f);
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m6751ri(String str, C2070lr c2070lr, C2056ik c2056ik, Canvas canvas, float f, float f2, float f3) {
        for (int i = 0; i < str.length(); i++) {
            C2069ka c2069ka = this.f4840bu.bgr().get(C2069ka.m6796ri(str.charAt(i), c2056ik.m6707ri(), c2056ik.m6704ik()));
            if (c2069ka != null) {
                m6744ri(c2069ka, f2, c2070lr, canvas);
                canvas.translate((((float) c2069ka.m6797lr()) * f2 * C2017di.m6540ri()) + f3, 0.0f);
            }
        }
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri
    /* JADX INFO: renamed from: lr */
    public void mo6709lr(Canvas canvas, Matrix matrix, int i) {
        super.mo6709lr(canvas, matrix, i);
        C2070lr c2070lrXha = this.f4849vr.xha();
        C2056ik c2056ik = this.f4840bu.m7201vr().get(c2070lrXha.f4907lr);
        if (c2056ik == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        m6745ri(c2070lrXha, matrix);
        if (this.slm.m6946fr()) {
            m6746ri(c2070lrXha, matrix, c2056ik, canvas);
        } else {
            m6747ri(c2070lrXha, c2056ik, canvas);
        }
        canvas.restore();
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri, com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2149fi
    /* JADX INFO: renamed from: ri */
    public void mo6710ri(RectF rectF, Matrix matrix, boolean z) {
        super.mo6710ri(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.f4840bu.m7187ka().width(), this.f4840bu.m7187ka().height());
    }
}

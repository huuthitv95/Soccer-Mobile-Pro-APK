package com.bytedance.adsdk.ugeno.p093fi;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.bytedance.adsdk.ugeno.xha.C2341di;
import com.bytedance.adsdk.ugeno.xha.C2342fi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.fi.ka */
/* JADX INFO: loaded from: classes3.dex */
class C2264ka {

    /* JADX INFO: renamed from: ik */
    static final /* synthetic */ boolean f5682ik = true;

    /* JADX INFO: renamed from: di */
    private long[] f5683di;

    /* JADX INFO: renamed from: fi */
    private boolean[] f5684fi;

    /* JADX INFO: renamed from: ka */
    private final InterfaceC2266ri f5685ka;

    /* JADX INFO: renamed from: lr */
    long[] f5686lr;

    /* JADX INFO: renamed from: ri */
    int[] f5687ri;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.fi.ka$lr */
    private static class lr implements Comparable<lr> {

        /* JADX INFO: renamed from: lr */
        int f5688lr;

        /* JADX INFO: renamed from: ri */
        int f5689ri;

        private lr() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public int compareTo(lr lrVar) {
            int i = this.f5688lr;
            int i2 = lrVar.f5688lr;
            return i != i2 ? i - i2 : this.f5689ri - lrVar.f5689ri;
        }

        public String toString() {
            return "Order{order=" + this.f5688lr + ", index=" + this.f5689ri + AbstractJsonLexerKt.END_OBJ;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.fi.ka$ri */
    static class ri {

        /* JADX INFO: renamed from: lr */
        int f5690lr;

        /* JADX INFO: renamed from: ri */
        List<C2263ik> f5691ri;

        ri() {
        }

        /* JADX INFO: renamed from: ri */
        void m7658ri() {
            this.f5691ri = null;
            this.f5690lr = 0;
        }
    }

    C2264ka(InterfaceC2266ri interfaceC2266ri) {
        this.f5685ka = interfaceC2266ri;
    }

    /* JADX INFO: renamed from: di */
    private int m7613di(InterfaceC2265lr interfaceC2265lr, boolean z) {
        return z ? interfaceC2265lr.slm() : interfaceC2265lr.mo7607vr();
    }

    /* JADX INFO: renamed from: fi */
    private int m7614fi(InterfaceC2265lr interfaceC2265lr, boolean z) {
        return z ? interfaceC2265lr.bgr() : interfaceC2265lr.mo7589aw();
    }

    /* JADX INFO: renamed from: ik */
    private int m7615ik(InterfaceC2265lr interfaceC2265lr, boolean z) {
        return z ? interfaceC2265lr.mo7589aw() : interfaceC2265lr.bgr();
    }

    /* JADX INFO: renamed from: ik */
    private int m7616ik(boolean z) {
        return z ? this.f5685ka.getPaddingTop() : this.f5685ka.getPaddingStart();
    }

    /* JADX INFO: renamed from: ik */
    private void m7617ik(int i) {
        boolean[] zArr = this.f5684fi;
        if (zArr == null) {
            this.f5684fi = new boolean[Math.max(i, 10)];
        } else if (zArr.length < i) {
            this.f5684fi = new boolean[Math.max(zArr.length * 2, i)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    /* JADX INFO: renamed from: ka */
    private int m7618ka(InterfaceC2265lr interfaceC2265lr, boolean z) {
        return z ? interfaceC2265lr.mo7607vr() : interfaceC2265lr.slm();
    }

    /* JADX INFO: renamed from: ka */
    private int m7619ka(boolean z) {
        return z ? this.f5685ka.getPaddingBottom() : this.f5685ka.getPaddingEnd();
    }

    /* JADX INFO: renamed from: lr */
    private int m7620lr(int i, InterfaceC2265lr interfaceC2265lr, int i2) {
        InterfaceC2266ri interfaceC2266ri = this.f5685ka;
        int iMo7579lr = interfaceC2266ri.mo7579lr(i, interfaceC2266ri.getPaddingTop() + this.f5685ka.getPaddingBottom() + interfaceC2265lr.bgr() + interfaceC2265lr.slm() + i2, interfaceC2265lr.mo7598lr());
        int size = View.MeasureSpec.getSize(iMo7579lr);
        if (size > interfaceC2265lr.mo7602qt()) {
            return View.MeasureSpec.makeMeasureSpec(interfaceC2265lr.mo7602qt(), View.MeasureSpec.getMode(iMo7579lr));
        }
        return size < interfaceC2265lr.mo7601mj() ? View.MeasureSpec.makeMeasureSpec(interfaceC2265lr.mo7601mj(), View.MeasureSpec.getMode(iMo7579lr)) : iMo7579lr;
    }

    /* JADX INFO: renamed from: lr */
    private int m7621lr(View view, boolean z) {
        return z ? view.getMeasuredHeight() : view.getMeasuredWidth();
    }

    /* JADX INFO: renamed from: lr */
    private int m7622lr(InterfaceC2265lr interfaceC2265lr, boolean z) {
        return z ? interfaceC2265lr.mo7598lr() : interfaceC2265lr.mo7603ri();
    }

    /* JADX INFO: renamed from: lr */
    private int m7623lr(boolean z) {
        return z ? this.f5685ka.getPaddingEnd() : this.f5685ka.getPaddingBottom();
    }

    /* JADX INFO: renamed from: lr */
    private List<lr> m7624lr(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC2265lr interfaceC2265lr = (InterfaceC2265lr) this.f5685ka.mo7584ri(i2).getLayoutParams();
            lr lrVar = new lr();
            lrVar.f5688lr = interfaceC2265lr.mo7593ik();
            lrVar.f5689ri = i2;
            arrayList.add(lrVar);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: lr */
    private void m7625lr(int i, int i2, C2263ik c2263ik, int i3, int i4, boolean z) {
        float f;
        int iMax;
        int i5 = c2263ik.f5672fi;
        float f2 = 0.0f;
        if (c2263ik.f5680sf <= 0.0f || i3 > c2263ik.f5672fi) {
            return;
        }
        float f3 = (c2263ik.f5672fi - i3) / c2263ik.f5680sf;
        c2263ik.f5672fi = i4 + c2263ik.f5671di;
        if (!z) {
            c2263ik.xha = Integer.MIN_VALUE;
        }
        int i6 = 0;
        float f4 = 0.0f;
        boolean z2 = false;
        int i7 = 0;
        while (i6 < c2263ik.f5676mj) {
            int i8 = c2263ik.f5681vr + i6;
            View viewMo7580lr = this.f5685ka.mo7580lr(i8);
            if (viewMo7580lr == null || viewMo7580lr.getVisibility() == 8) {
                f = f2;
            } else {
                InterfaceC2265lr interfaceC2265lr = (InterfaceC2265lr) viewMo7580lr.getLayoutParams();
                int flexDirection = this.f5685ka.getFlexDirection();
                f = f2;
                if (flexDirection == 0 || flexDirection == 1) {
                    int measuredWidth = viewMo7580lr.getMeasuredWidth();
                    long[] jArr = this.f5683di;
                    if (jArr != null) {
                        measuredWidth = m7646ri(jArr[i8]);
                    }
                    int measuredHeight = viewMo7580lr.getMeasuredHeight();
                    long[] jArr2 = this.f5683di;
                    if (jArr2 != null) {
                        measuredHeight = m7641lr(jArr2[i8]);
                    }
                    if (!this.f5684fi[i8] && interfaceC2265lr.mo7592fi() > f) {
                        float fMo7592fi = measuredWidth - (interfaceC2265lr.mo7592fi() * f3);
                        if (i6 == c2263ik.f5676mj - 1) {
                            fMo7592fi += f4;
                            f4 = f;
                        }
                        int iRound = Math.round(fMo7592fi);
                        if (iRound < interfaceC2265lr.xha()) {
                            iRound = interfaceC2265lr.xha();
                            this.f5684fi[i8] = true;
                            c2263ik.f5680sf -= interfaceC2265lr.mo7592fi();
                            z2 = true;
                        } else {
                            f4 += fMo7592fi - iRound;
                            double d = f4;
                            if (d > 1.0d) {
                                iRound++;
                                f4 -= 1.0f;
                            } else if (d < -1.0d) {
                                iRound--;
                                f4 += 1.0f;
                            }
                        }
                        int iM7620lr = m7620lr(i2, interfaceC2265lr, c2263ik.f5668aw);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewMo7580lr.measure(iMakeMeasureSpec, iM7620lr);
                        int measuredWidth2 = viewMo7580lr.getMeasuredWidth();
                        int measuredHeight2 = viewMo7580lr.getMeasuredHeight();
                        m7632ri(i8, iMakeMeasureSpec, iM7620lr, viewMo7580lr);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i7, measuredHeight + interfaceC2265lr.bgr() + interfaceC2265lr.slm() + this.f5685ka.mo7582ri(viewMo7580lr));
                    c2263ik.f5672fi += measuredWidth + interfaceC2265lr.mo7589aw() + interfaceC2265lr.mo7607vr();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewMo7580lr.getMeasuredHeight();
                    long[] jArr3 = this.f5683di;
                    if (jArr3 != null) {
                        measuredHeight3 = m7641lr(jArr3[i8]);
                    }
                    int measuredWidth3 = viewMo7580lr.getMeasuredWidth();
                    long[] jArr4 = this.f5683di;
                    if (jArr4 != null) {
                        measuredWidth3 = m7646ri(jArr4[i8]);
                    }
                    if (!this.f5684fi[i8] && interfaceC2265lr.mo7592fi() > f) {
                        float fMo7592fi2 = measuredHeight3 - (interfaceC2265lr.mo7592fi() * f3);
                        if (i6 == c2263ik.f5676mj - 1) {
                            fMo7592fi2 += f4;
                            f4 = f;
                        }
                        int iRound2 = Math.round(fMo7592fi2);
                        if (iRound2 < interfaceC2265lr.mo7601mj()) {
                            iRound2 = interfaceC2265lr.mo7601mj();
                            this.f5684fi[i8] = true;
                            c2263ik.f5680sf -= interfaceC2265lr.mo7592fi();
                            z2 = true;
                        } else {
                            f4 += fMo7592fi2 - iRound2;
                            double d2 = f4;
                            if (d2 > 1.0d) {
                                iRound2++;
                                f4 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                iRound2--;
                                f4 += 1.0f;
                            }
                        }
                        int iM7627ri = m7627ri(i, interfaceC2265lr, c2263ik.f5668aw);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewMo7580lr.measure(iM7627ri, iMakeMeasureSpec2);
                        int measuredWidth4 = viewMo7580lr.getMeasuredWidth();
                        int measuredHeight4 = viewMo7580lr.getMeasuredHeight();
                        m7632ri(i8, iM7627ri, iMakeMeasureSpec2, viewMo7580lr);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i7, measuredWidth3 + interfaceC2265lr.mo7589aw() + interfaceC2265lr.mo7607vr() + this.f5685ka.mo7582ri(viewMo7580lr));
                    c2263ik.f5672fi += measuredHeight3 + interfaceC2265lr.bgr() + interfaceC2265lr.slm();
                }
                c2263ik.xha = Math.max(c2263ik.xha, iMax);
                i7 = iMax;
            }
            i6++;
            f2 = f;
        }
        if (!z2 || i5 == c2263ik.f5672fi) {
            return;
        }
        m7625lr(i, i2, c2263ik, i3, i4, true);
    }

    /* JADX INFO: renamed from: lr */
    private void m7626lr(View view, int i, int i2) {
        InterfaceC2265lr interfaceC2265lr = (InterfaceC2265lr) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i - interfaceC2265lr.mo7589aw()) - interfaceC2265lr.mo7607vr()) - this.f5685ka.mo7582ri(view), interfaceC2265lr.xha()), interfaceC2265lr.jbs());
        long[] jArr = this.f5683di;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? m7641lr(jArr[i2]) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        m7632ri(i2, iMakeMeasureSpec2, iMakeMeasureSpec, view);
    }

    /* JADX INFO: renamed from: ri */
    private int m7627ri(int i, InterfaceC2265lr interfaceC2265lr, int i2) {
        InterfaceC2266ri interfaceC2266ri = this.f5685ka;
        int iMo7581ri = interfaceC2266ri.mo7581ri(i, interfaceC2266ri.getPaddingLeft() + this.f5685ka.getPaddingRight() + interfaceC2265lr.mo7589aw() + interfaceC2265lr.mo7607vr() + i2, interfaceC2265lr.mo7603ri());
        int size = View.MeasureSpec.getSize(iMo7581ri);
        if (size > interfaceC2265lr.jbs()) {
            return View.MeasureSpec.makeMeasureSpec(interfaceC2265lr.jbs(), View.MeasureSpec.getMode(iMo7581ri));
        }
        return size < interfaceC2265lr.xha() ? View.MeasureSpec.makeMeasureSpec(interfaceC2265lr.xha(), View.MeasureSpec.getMode(iMo7581ri)) : iMo7581ri;
    }

    /* JADX INFO: renamed from: ri */
    private int m7628ri(View view, boolean z) {
        return z ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    /* JADX INFO: renamed from: ri */
    private int m7629ri(InterfaceC2265lr interfaceC2265lr, boolean z) {
        return z ? interfaceC2265lr.mo7603ri() : interfaceC2265lr.mo7598lr();
    }

    /* JADX INFO: renamed from: ri */
    private int m7630ri(boolean z) {
        return z ? this.f5685ka.getPaddingStart() : this.f5685ka.getPaddingTop();
    }

    /* JADX INFO: renamed from: ri */
    private List<C2263ik> m7631ri(List<C2263ik> list, int i, int i2) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        C2263ik c2263ik = new C2263ik();
        c2263ik.xha = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(c2263ik);
            }
            arrayList.add(list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(c2263ik);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ri */
    private void m7632ri(int i, int i2, int i3, View view) {
        long[] jArr = this.f5686lr;
        if (jArr != null) {
            jArr[i] = m7642lr(i2, i3);
        }
        long[] jArr2 = this.f5683di;
        if (jArr2 != null) {
            jArr2[i] = m7642lr(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m7633ri(int i, int i2, C2263ik c2263ik, int i3, int i4, boolean z) {
        float f;
        float f2;
        int iMax;
        double d;
        double d2;
        float f3 = 0.0f;
        if (c2263ik.f5678qt <= 0.0f || i3 < c2263ik.f5672fi) {
            return;
        }
        int i5 = c2263ik.f5672fi;
        float f4 = (i3 - c2263ik.f5672fi) / c2263ik.f5678qt;
        c2263ik.f5672fi = i4 + c2263ik.f5671di;
        if (!z) {
            c2263ik.xha = Integer.MIN_VALUE;
        }
        int i6 = 0;
        float f5 = 0.0f;
        boolean z2 = false;
        int i7 = 0;
        while (i6 < c2263ik.f5676mj) {
            int i8 = c2263ik.f5681vr + i6;
            View viewMo7580lr = this.f5685ka.mo7580lr(i8);
            if (viewMo7580lr == null || viewMo7580lr.getVisibility() == 8) {
                f = f3;
                f2 = f4;
            } else {
                InterfaceC2265lr interfaceC2265lr = (InterfaceC2265lr) viewMo7580lr.getLayoutParams();
                int flexDirection = this.f5685ka.getFlexDirection();
                f = f3;
                if (flexDirection == 0 || flexDirection == 1) {
                    f2 = f4;
                    int measuredWidth = viewMo7580lr.getMeasuredWidth();
                    long[] jArr = this.f5683di;
                    if (jArr != null) {
                        measuredWidth = m7646ri(jArr[i8]);
                    }
                    int measuredHeight = viewMo7580lr.getMeasuredHeight();
                    long[] jArr2 = this.f5683di;
                    if (jArr2 != null) {
                        measuredHeight = m7641lr(jArr2[i8]);
                    }
                    if (!this.f5684fi[i8] && interfaceC2265lr.mo7596ka() > f) {
                        float fMo7596ka = measuredWidth + (f2 * interfaceC2265lr.mo7596ka());
                        if (i6 == c2263ik.f5676mj - 1) {
                            fMo7596ka += f5;
                            f5 = f;
                        }
                        int iRound = Math.round(fMo7596ka);
                        if (iRound > interfaceC2265lr.jbs()) {
                            iRound = interfaceC2265lr.jbs();
                            this.f5684fi[i8] = true;
                            c2263ik.f5678qt -= interfaceC2265lr.mo7596ka();
                            z2 = true;
                        } else {
                            f5 += fMo7596ka - iRound;
                            double d3 = f5;
                            if (d3 > 1.0d) {
                                iRound++;
                                d = d3 - 1.0d;
                            } else if (d3 < -1.0d) {
                                iRound--;
                                d = d3 + 1.0d;
                            }
                            f5 = (float) d;
                        }
                        int iM7620lr = m7620lr(i2, interfaceC2265lr, c2263ik.f5668aw);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewMo7580lr.measure(iMakeMeasureSpec, iM7620lr);
                        int measuredWidth2 = viewMo7580lr.getMeasuredWidth();
                        int measuredHeight2 = viewMo7580lr.getMeasuredHeight();
                        m7632ri(i8, iMakeMeasureSpec, iM7620lr, viewMo7580lr);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i7, measuredHeight + interfaceC2265lr.bgr() + interfaceC2265lr.slm() + this.f5685ka.mo7582ri(viewMo7580lr));
                    c2263ik.f5672fi += measuredWidth + interfaceC2265lr.mo7589aw() + interfaceC2265lr.mo7607vr();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewMo7580lr.getMeasuredHeight();
                    long[] jArr3 = this.f5683di;
                    if (jArr3 != null) {
                        measuredHeight3 = m7641lr(jArr3[i8]);
                    }
                    int measuredWidth3 = viewMo7580lr.getMeasuredWidth();
                    long[] jArr4 = this.f5683di;
                    f2 = f4;
                    if (jArr4 != null) {
                        measuredWidth3 = m7646ri(jArr4[i8]);
                    }
                    if (!this.f5684fi[i8] && interfaceC2265lr.mo7596ka() > f) {
                        float fMo7596ka2 = measuredHeight3 + (f2 * interfaceC2265lr.mo7596ka());
                        if (i6 == c2263ik.f5676mj - 1) {
                            fMo7596ka2 += f5;
                            f5 = f;
                        }
                        int iRound2 = Math.round(fMo7596ka2);
                        if (iRound2 > interfaceC2265lr.mo7602qt()) {
                            iRound2 = interfaceC2265lr.mo7602qt();
                            this.f5684fi[i8] = true;
                            c2263ik.f5678qt -= interfaceC2265lr.mo7596ka();
                            z2 = true;
                        } else {
                            f5 += fMo7596ka2 - iRound2;
                            double d4 = f5;
                            if (d4 > 1.0d) {
                                iRound2++;
                                d2 = d4 - 1.0d;
                            } else if (d4 < -1.0d) {
                                iRound2--;
                                d2 = d4 + 1.0d;
                            }
                            f5 = (float) d2;
                        }
                        int iM7627ri = m7627ri(i, interfaceC2265lr, c2263ik.f5668aw);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewMo7580lr.measure(iM7627ri, iMakeMeasureSpec2);
                        int measuredWidth4 = viewMo7580lr.getMeasuredWidth();
                        int measuredHeight4 = viewMo7580lr.getMeasuredHeight();
                        m7632ri(i8, iM7627ri, iMakeMeasureSpec2, viewMo7580lr);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i7, measuredWidth3 + interfaceC2265lr.mo7589aw() + interfaceC2265lr.mo7607vr() + this.f5685ka.mo7582ri(viewMo7580lr));
                    c2263ik.f5672fi += measuredHeight3 + interfaceC2265lr.bgr() + interfaceC2265lr.slm();
                }
                c2263ik.xha = Math.max(c2263ik.xha, iMax);
                i7 = iMax;
            }
            i6++;
            f4 = f2;
            f3 = f;
        }
        if (!z2 || i5 == c2263ik.f5672fi) {
            return;
        }
        m7633ri(i, i2, c2263ik, i3, i4, true);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ri */
    private void m7634ri(View view, int i) {
        boolean z;
        InterfaceC2265lr interfaceC2265lr = (InterfaceC2265lr) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z2 = true;
        if (measuredWidth >= interfaceC2265lr.xha()) {
            if (measuredWidth > interfaceC2265lr.jbs()) {
                measuredWidth = interfaceC2265lr.jbs();
            } else {
                z = false;
            }
            if (measuredHeight < interfaceC2265lr.mo7601mj()) {
                measuredHeight = interfaceC2265lr.mo7601mj();
            } else if (measuredHeight > interfaceC2265lr.mo7602qt()) {
                measuredHeight = interfaceC2265lr.mo7602qt();
            } else {
                z2 = z;
            }
            if (z2) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                m7632ri(i, iMakeMeasureSpec, iMakeMeasureSpec2, view);
            }
        }
        measuredWidth = interfaceC2265lr.xha();
        z = true;
        if (measuredHeight < interfaceC2265lr.mo7601mj()) {
            measuredHeight = interfaceC2265lr.mo7601mj();
        } else if (measuredHeight > interfaceC2265lr.mo7602qt()) {
            measuredHeight = interfaceC2265lr.mo7602qt();
        } else {
            z2 = z;
        }
        if (z2) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            m7632ri(i, iMakeMeasureSpec3, iMakeMeasureSpec4, view);
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m7635ri(View view, int i, int i2) {
        InterfaceC2265lr interfaceC2265lr = (InterfaceC2265lr) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i - interfaceC2265lr.bgr()) - interfaceC2265lr.slm()) - this.f5685ka.mo7582ri(view), interfaceC2265lr.mo7601mj()), interfaceC2265lr.mo7602qt());
        long[] jArr = this.f5683di;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? m7646ri(jArr[i2]) : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        m7632ri(i2, iMakeMeasureSpec, iMakeMeasureSpec2, view);
    }

    /* JADX INFO: renamed from: ri */
    private void m7636ri(CompoundButton compoundButton) {
        InterfaceC2265lr interfaceC2265lr = (InterfaceC2265lr) compoundButton.getLayoutParams();
        int iXha = interfaceC2265lr.xha();
        int iMo7601mj = interfaceC2265lr.mo7601mj();
        Drawable drawableM8027ri = C2342fi.m8027ri(compoundButton);
        int minimumWidth = drawableM8027ri == null ? 0 : drawableM8027ri.getMinimumWidth();
        int minimumHeight = drawableM8027ri != null ? drawableM8027ri.getMinimumHeight() : 0;
        if (iXha == -1) {
            iXha = minimumWidth;
        }
        interfaceC2265lr.mo7605ri(iXha);
        if (iMo7601mj == -1) {
            iMo7601mj = minimumHeight;
        }
        interfaceC2265lr.mo7600lr(iMo7601mj);
    }

    /* JADX INFO: renamed from: ri */
    private void m7637ri(List<C2263ik> list, C2263ik c2263ik, int i, int i2) {
        c2263ik.f5668aw = i2;
        this.f5685ka.mo7586ri(c2263ik);
        c2263ik.slm = i;
        list.add(c2263ik);
    }

    /* JADX INFO: renamed from: ri */
    private boolean m7638ri(int i, int i2, C2263ik c2263ik) {
        return i == i2 - 1 && c2263ik.m7610lr() != 0;
    }

    /* JADX INFO: renamed from: ri */
    private boolean m7639ri(View view, int i, int i2, int i3, int i4, InterfaceC2265lr interfaceC2265lr, int i5, int i6, int i7) {
        if (this.f5685ka.getFlexWrap() == 0) {
            return false;
        }
        if (interfaceC2265lr.mo7606sf()) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int maxLine = this.f5685ka.getMaxLine();
        if (maxLine != -1 && maxLine <= i7 + 1) {
            return false;
        }
        int iMo7583ri = this.f5685ka.mo7583ri(view, i5, i6);
        if (iMo7583ri > 0) {
            i4 += iMo7583ri;
        }
        return i2 < i3 + i4;
    }

    /* JADX INFO: renamed from: ri */
    private int[] m7640ri(int i, List<lr> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (lr lrVar : list) {
            iArr[i2] = lrVar.f5689ri;
            sparseIntArray.append(lrVar.f5689ri, lrVar.f5688lr);
            i2++;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: lr */
    int m7641lr(long j) {
        return (int) (j >> 32);
    }

    /* JADX INFO: renamed from: lr */
    long m7642lr(int i, int i2) {
        return (((long) i) & 4294967295L) | (((long) i2) << 32);
    }

    /* JADX INFO: renamed from: lr */
    void m7643lr(int i, int i2, int i3) {
        int mode;
        int size;
        int flexDirection = this.f5685ka.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            mode = mode2;
            size = size2;
        } else {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
            }
            mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
        }
        List<C2263ik> flexLinesInternal = this.f5685ka.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.f5685ka.getSumOfCrossSize() + i3;
            int i4 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).xha = size - i3;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.f5685ka.getAlignContent();
                if (alignContent == 1) {
                    int i5 = size - sumOfCrossSize;
                    C2263ik c2263ik = new C2263ik();
                    c2263ik.xha = i5;
                    flexLinesInternal.add(0, c2263ik);
                    return;
                }
                if (alignContent == 2) {
                    this.f5685ka.setFlexLines(m7631ri(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize < size) {
                        float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                        ArrayList arrayList = new ArrayList();
                        int size4 = flexLinesInternal.size();
                        float f = 0.0f;
                        while (i4 < size4) {
                            arrayList.add(flexLinesInternal.get(i4));
                            if (i4 != flexLinesInternal.size() - 1) {
                                C2263ik c2263ik2 = new C2263ik();
                                if (i4 == flexLinesInternal.size() - 2) {
                                    c2263ik2.xha = Math.round(f + size3);
                                    f = 0.0f;
                                } else {
                                    c2263ik2.xha = Math.round(size3);
                                }
                                f += size3 - c2263ik2.xha;
                                if (f > 1.0f) {
                                    c2263ik2.xha++;
                                    f -= 1.0f;
                                } else if (f < -1.0f) {
                                    c2263ik2.xha--;
                                    f += 1.0f;
                                }
                                arrayList.add(c2263ik2);
                            }
                            i4++;
                        }
                        this.f5685ka.setFlexLines(arrayList);
                        return;
                    }
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        this.f5685ka.setFlexLines(m7631ri(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    C2263ik c2263ik3 = new C2263ik();
                    c2263ik3.xha = size5;
                    for (C2263ik c2263ik4 : flexLinesInternal) {
                        arrayList2.add(c2263ik3);
                        arrayList2.add(c2263ik4);
                        arrayList2.add(c2263ik3);
                    }
                    this.f5685ka.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f2 = 0.0f;
                    while (i4 < size7) {
                        C2263ik c2263ik5 = flexLinesInternal.get(i4);
                        float f3 = c2263ik5.xha + size6;
                        if (i4 == flexLinesInternal.size() - 1) {
                            f3 += f2;
                            f2 = 0.0f;
                        }
                        int iRound = Math.round(f3);
                        f2 += f3 - iRound;
                        if (f2 > 1.0f) {
                            iRound++;
                            f2 -= 1.0f;
                        } else if (f2 < -1.0f) {
                            iRound--;
                            f2 += 1.0f;
                        }
                        c2263ik5.xha = iRound;
                        i4++;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: lr */
    void m7644lr(ri riVar, int i, int i2) {
        m7654ri(riVar, i2, i, Integer.MAX_VALUE, 0, -1, (List<C2263ik>) null);
    }

    /* JADX INFO: renamed from: lr */
    boolean m7645lr(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f5685ka.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i = 0; i < flexItemCount; i++) {
            View viewMo7584ri = this.f5685ka.mo7584ri(i);
            if (viewMo7584ri != null && ((InterfaceC2265lr) viewMo7584ri.getLayoutParams()).mo7593ik() != sparseIntArray.get(i)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ri */
    int m7646ri(long j) {
        return (int) j;
    }

    /* JADX INFO: renamed from: ri */
    void m7647ri() {
        m7648ri(0);
    }

    /* JADX INFO: renamed from: ri */
    void m7648ri(int i) {
        View viewMo7580lr;
        if (i >= this.f5685ka.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.f5685ka.getFlexDirection();
        if (this.f5685ka.getAlignItems() != 4) {
            for (C2263ik c2263ik : this.f5685ka.getFlexLinesInternal()) {
                for (Integer num : c2263ik.bgr) {
                    View viewMo7580lr2 = this.f5685ka.mo7580lr(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        m7635ri(viewMo7580lr2, c2263ik.xha, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                        }
                        m7626lr(viewMo7580lr2, c2263ik.xha, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.f5687ri;
        List<C2263ik> flexLinesInternal = this.f5685ka.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
            C2263ik c2263ik2 = flexLinesInternal.get(i2);
            int i3 = c2263ik2.f5676mj;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = c2263ik2.f5681vr + i4;
                if (i4 < this.f5685ka.getFlexItemCount() && (viewMo7580lr = this.f5685ka.mo7580lr(i5)) != null && viewMo7580lr.getVisibility() != 8) {
                    InterfaceC2265lr interfaceC2265lr = (InterfaceC2265lr) viewMo7580lr.getLayoutParams();
                    if (interfaceC2265lr.mo7591di() == -1 || interfaceC2265lr.mo7591di() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            m7635ri(viewMo7580lr, c2263ik2.xha, i5);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                            }
                            m7626lr(viewMo7580lr, c2263ik2.xha, i5);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    void m7649ri(int i, int i2) {
        m7650ri(i, i2, 0);
    }

    /* JADX INFO: renamed from: ri */
    void m7650ri(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i4;
        int i5;
        m7617ik(this.f5685ka.getFlexItemCount());
        if (i3 >= this.f5685ka.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.f5685ka.getFlexDirection();
        int flexDirection2 = this.f5685ka.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = this.f5685ka.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.f5685ka.getPaddingLeft();
            paddingRight = this.f5685ka.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = this.f5685ka.getLargestMainSize();
            }
            paddingLeft = this.f5685ka.getPaddingTop();
            paddingRight = this.f5685ka.getPaddingBottom();
        }
        int i6 = paddingLeft + paddingRight;
        int i7 = size;
        int[] iArr = this.f5687ri;
        int i8 = iArr != null ? iArr[i3] : 0;
        List<C2263ik> flexLinesInternal = this.f5685ka.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i8 < size2) {
            C2263ik c2263ik = flexLinesInternal.get(i8);
            if (c2263ik.f5672fi >= i7 || !c2263ik.f5669bu) {
                i4 = i;
                i5 = i2;
                if (c2263ik.f5672fi > i7 && c2263ik.f5677nr) {
                    m7625lr(i4, i5, c2263ik, i7, i6, false);
                }
            } else {
                i4 = i;
                i5 = i2;
                m7633ri(i4, i5, c2263ik, i7, i6, false);
            }
            i8++;
            i = i4;
            i2 = i5;
        }
    }

    /* JADX INFO: renamed from: ri */
    void m7651ri(View view, C2263ik c2263ik, int i, int i2, int i3, int i4) {
        InterfaceC2265lr interfaceC2265lr = (InterfaceC2265lr) view.getLayoutParams();
        int alignItems = this.f5685ka.getAlignItems();
        if (interfaceC2265lr.mo7591di() != -1) {
            alignItems = interfaceC2265lr.mo7591di();
        }
        int i5 = c2263ik.xha;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.f5685ka.getFlexWrap() == 2) {
                    view.layout(i, (i2 - i5) + view.getMeasuredHeight() + interfaceC2265lr.bgr(), i3, (i4 - i5) + view.getMeasuredHeight() + interfaceC2265lr.bgr());
                    return;
                } else {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - interfaceC2265lr.slm(), i3, i6 - interfaceC2265lr.slm());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i5 - view.getMeasuredHeight()) + interfaceC2265lr.bgr()) - interfaceC2265lr.slm()) / 2;
                if (this.f5685ka.getFlexWrap() != 2) {
                    int i7 = i2 + measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else {
                    int i8 = i2 - measuredHeight;
                    view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                    return;
                }
            }
            if (alignItems == 3) {
                if (this.f5685ka.getFlexWrap() != 2) {
                    int iMax = Math.max(c2263ik.f5670co - view.getBaseline(), interfaceC2265lr.bgr());
                    view.layout(i, i2 + iMax, i3, i4 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max((c2263ik.f5670co - view.getMeasuredHeight()) + view.getBaseline(), interfaceC2265lr.slm());
                    view.layout(i, i2 - iMax2, i3, i4 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.f5685ka.getFlexWrap() != 2) {
            view.layout(i, i2 + interfaceC2265lr.bgr(), i3, i4 + interfaceC2265lr.bgr());
        } else {
            view.layout(i, i2 - interfaceC2265lr.slm(), i3, i4 - interfaceC2265lr.slm());
        }
    }

    /* JADX INFO: renamed from: ri */
    void m7652ri(View view, C2263ik c2263ik, boolean z, int i, int i2, int i3, int i4) {
        InterfaceC2265lr interfaceC2265lr = (InterfaceC2265lr) view.getLayoutParams();
        int alignItems = this.f5685ka.getAlignItems();
        if (interfaceC2265lr.mo7591di() != -1) {
            alignItems = interfaceC2265lr.mo7591di();
        }
        int i5 = c2263ik.xha;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (z) {
                    view.layout((i - i5) + view.getMeasuredWidth() + interfaceC2265lr.mo7589aw(), i2, (i3 - i5) + view.getMeasuredWidth() + interfaceC2265lr.mo7589aw(), i4);
                    return;
                } else {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - interfaceC2265lr.mo7607vr(), i2, ((i3 + i5) - view.getMeasuredWidth()) - interfaceC2265lr.mo7607vr(), i4);
                    return;
                }
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i5 - view.getMeasuredWidth()) + C2341di.m8026ri(marginLayoutParams)) - C2341di.m8025lr(marginLayoutParams)) / 2;
                if (z) {
                    view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
                    return;
                } else {
                    view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (z) {
            view.layout(i - interfaceC2265lr.mo7607vr(), i2, i3 - interfaceC2265lr.mo7607vr(), i4);
        } else {
            view.layout(i + interfaceC2265lr.mo7589aw(), i2, i3 + interfaceC2265lr.mo7589aw(), i4);
        }
    }

    /* JADX INFO: renamed from: ri */
    void m7653ri(ri riVar, int i, int i2) {
        m7654ri(riVar, i, i2, Integer.MAX_VALUE, 0, -1, (List<C2263ik>) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ri */
    void m7654ri(ri riVar, int i, int i2, int i3, int i4, int i5, List<C2263ik> list) {
        int i6;
        int i7;
        int i8;
        int i9;
        int iMo7581ri;
        int i10;
        int i11;
        int i12;
        C2263ik c2263ik;
        int i13;
        int i14;
        boolean z;
        int i15;
        boolean z2;
        int i16;
        int i17 = i;
        boolean zMo7588ri = this.f5685ka.mo7588ri();
        int mode = View.MeasureSpec.getMode(i17);
        int size = View.MeasureSpec.getSize(i17);
        List<C2263ik> arrayList = list == null ? new ArrayList() : list;
        riVar.f5691ri = arrayList;
        boolean z3 = i5 == -1;
        int iM7630ri = m7630ri(zMo7588ri);
        int iM7623lr = m7623lr(zMo7588ri);
        int iM7616ik = m7616ik(zMo7588ri);
        int iM7619ka = m7619ka(zMo7588ri);
        C2263ik c2263ik2 = new C2263ik();
        int i18 = i4;
        c2263ik2.f5681vr = i18;
        int i19 = iM7630ri + iM7623lr;
        c2263ik2.f5672fi = i19;
        int flexItemCount = this.f5685ka.getFlexItemCount();
        boolean z4 = z3;
        C2263ik c2263ik3 = c2263ik2;
        int i20 = Integer.MIN_VALUE;
        int i21 = 0;
        int iCombineMeasuredStates = 0;
        int i22 = 0;
        while (i18 < flexItemCount) {
            View viewMo7580lr = this.f5685ka.mo7580lr(i18);
            if (viewMo7580lr == null) {
                if (m7638ri(i18, flexItemCount, c2263ik3)) {
                    m7637ri(arrayList, c2263ik3, i18, i21);
                }
                i7 = i19;
            } else {
                i7 = i19;
                if (viewMo7580lr.getVisibility() == 8) {
                    c2263ik3.jbs++;
                    c2263ik3.f5676mj++;
                    if (m7638ri(i18, flexItemCount, c2263ik3)) {
                        m7637ri(arrayList, c2263ik3, i18, i21);
                    }
                } else {
                    if (viewMo7580lr instanceof CompoundButton) {
                        m7636ri((CompoundButton) viewMo7580lr);
                    }
                    InterfaceC2265lr interfaceC2265lr = (InterfaceC2265lr) viewMo7580lr.getLayoutParams();
                    int i23 = flexItemCount;
                    if (interfaceC2265lr.mo7591di() == 4) {
                        c2263ik3.bgr.add(Integer.valueOf(i18));
                    }
                    int iM7629ri = m7629ri(interfaceC2265lr, zMo7588ri);
                    if (interfaceC2265lr.mo7590co() != -1.0f && mode == 1073741824) {
                        iM7629ri = Math.round(size * interfaceC2265lr.mo7590co());
                    }
                    if (zMo7588ri) {
                        iMo7581ri = this.f5685ka.mo7581ri(i17, i7 + m7615ik(interfaceC2265lr, true) + m7618ka(interfaceC2265lr, true), iM7629ri);
                        i8 = i21;
                        int iMo7579lr = this.f5685ka.mo7579lr(i2, iM7616ik + iM7619ka + m7614fi(interfaceC2265lr, true) + m7613di(interfaceC2265lr, true) + i21, m7622lr(interfaceC2265lr, true));
                        viewMo7580lr.measure(iMo7581ri, iMo7579lr);
                        m7632ri(i18, iMo7581ri, iMo7579lr, viewMo7580lr);
                        i9 = 0;
                    } else {
                        i8 = i21;
                        i9 = 0;
                        int iMo7581ri2 = this.f5685ka.mo7581ri(i2, iM7616ik + iM7619ka + m7614fi(interfaceC2265lr, false) + m7613di(interfaceC2265lr, false) + i8, m7622lr(interfaceC2265lr, false));
                        int iMo7579lr2 = this.f5685ka.mo7579lr(i17, i7 + m7615ik(interfaceC2265lr, false) + m7618ka(interfaceC2265lr, false), iM7629ri);
                        viewMo7580lr.measure(iMo7581ri2, iMo7579lr2);
                        m7632ri(i18, iMo7581ri2, iMo7579lr2, viewMo7580lr);
                        iMo7581ri = iMo7579lr2;
                    }
                    m7634ri(viewMo7580lr, i18);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewMo7580lr.getMeasuredState());
                    int i24 = i9;
                    i10 = i18;
                    int i25 = iMo7581ri;
                    C2263ik c2263ik4 = c2263ik3;
                    int i26 = i22;
                    i11 = i7;
                    i12 = i8;
                    boolean z5 = zMo7588ri;
                    size = size;
                    if (m7639ri(viewMo7580lr, mode, size, c2263ik3.f5672fi, m7628ri(viewMo7580lr, zMo7588ri) + m7615ik(interfaceC2265lr, zMo7588ri) + m7618ka(interfaceC2265lr, zMo7588ri), interfaceC2265lr, i10, i26, arrayList.size())) {
                        if (c2263ik4.m7610lr() > 0) {
                            m7637ri(arrayList, c2263ik4, i10 > 0 ? i10 - 1 : i24, i12);
                            i16 = i12 + c2263ik4.xha;
                        } else {
                            i16 = i12;
                        }
                        if (z5) {
                            if (interfaceC2265lr.mo7598lr() == -1) {
                                InterfaceC2266ri interfaceC2266ri = this.f5685ka;
                                viewMo7580lr.measure(i25, interfaceC2266ri.mo7579lr(i2, interfaceC2266ri.getPaddingTop() + this.f5685ka.getPaddingBottom() + interfaceC2265lr.bgr() + interfaceC2265lr.slm() + i16, interfaceC2265lr.mo7598lr()));
                                m7634ri(viewMo7580lr, i10);
                            }
                        } else if (interfaceC2265lr.mo7603ri() == -1) {
                            InterfaceC2266ri interfaceC2266ri2 = this.f5685ka;
                            viewMo7580lr.measure(interfaceC2266ri2.mo7581ri(i2, interfaceC2266ri2.getPaddingLeft() + this.f5685ka.getPaddingRight() + interfaceC2265lr.mo7589aw() + interfaceC2265lr.mo7607vr() + i16, interfaceC2265lr.mo7603ri()), i25);
                            m7634ri(viewMo7580lr, i10);
                        }
                        C2263ik c2263ik5 = new C2263ik();
                        c2263ik5.f5676mj = 1;
                        c2263ik5.f5672fi = i11;
                        c2263ik5.f5681vr = i10;
                        i12 = i16;
                        i13 = i24;
                        c2263ik = c2263ik5;
                        i14 = Integer.MIN_VALUE;
                    } else {
                        c2263ik = c2263ik4;
                        c2263ik.f5676mj++;
                        i13 = i26 + 1;
                        i14 = i20;
                    }
                    c2263ik.f5669bu = (c2263ik.f5669bu ? 1 : 0) | (interfaceC2265lr.mo7596ka() != 0.0f ? 1 : i24);
                    c2263ik.f5677nr = (c2263ik.f5677nr ? 1 : 0) | (interfaceC2265lr.mo7592fi() != 0.0f ? 1 : i24);
                    int[] iArr = this.f5687ri;
                    if (iArr != null) {
                        iArr[i10] = arrayList.size();
                    }
                    z = z5;
                    c2263ik.f5672fi += m7628ri(viewMo7580lr, z) + m7615ik(interfaceC2265lr, z) + m7618ka(interfaceC2265lr, z);
                    c2263ik.f5678qt += interfaceC2265lr.mo7596ka();
                    c2263ik.f5680sf += interfaceC2265lr.mo7592fi();
                    this.f5685ka.mo7585ri(viewMo7580lr, i10, i13, c2263ik);
                    int iMax = Math.max(i14, m7621lr(viewMo7580lr, z) + m7614fi(interfaceC2265lr, z) + m7613di(interfaceC2265lr, z) + this.f5685ka.mo7582ri(viewMo7580lr));
                    c2263ik.xha = Math.max(c2263ik.xha, iMax);
                    if (z) {
                        if (this.f5685ka.getFlexWrap() != 2) {
                            c2263ik.f5670co = Math.max(c2263ik.f5670co, viewMo7580lr.getBaseline() + interfaceC2265lr.bgr());
                        } else {
                            c2263ik.f5670co = Math.max(c2263ik.f5670co, (viewMo7580lr.getMeasuredHeight() - viewMo7580lr.getBaseline()) + interfaceC2265lr.slm());
                        }
                    }
                    i15 = i23;
                    if (m7638ri(i10, i15, c2263ik)) {
                        m7637ri(arrayList, c2263ik, i10, i12);
                        i12 += c2263ik.xha;
                    }
                    if (i5 != -1 && arrayList.size() > 0) {
                        if (arrayList.get(arrayList.size() - 1).slm >= i5 && i10 >= i5 && !z4) {
                            i12 = -c2263ik.m7611ri();
                            z2 = true;
                        }
                        if (i12 <= i3 && z2) {
                            i6 = iCombineMeasuredStates;
                            riVar.f5690lr = i6;
                        } else {
                            i20 = iMax;
                            z4 = z2;
                            i22 = i13;
                        }
                    }
                    z2 = z4;
                    if (i12 <= i3) {
                    }
                    i20 = iMax;
                    z4 = z2;
                    i22 = i13;
                }
                int i27 = i10 + 1;
                zMo7588ri = z;
                c2263ik3 = c2263ik;
                i19 = i11;
                i21 = i12;
                i17 = i;
                flexItemCount = i15;
                i18 = i27;
                mode = mode;
            }
            i10 = i18;
            mode = mode;
            i15 = flexItemCount;
            i12 = i21;
            z = zMo7588ri;
            i11 = i7;
            c2263ik = c2263ik3;
            int i28 = i10 + 1;
            zMo7588ri = z;
            c2263ik3 = c2263ik;
            i19 = i11;
            i21 = i12;
            i17 = i;
            flexItemCount = i15;
            i18 = i28;
            mode = mode;
        }
        i6 = iCombineMeasuredStates;
        riVar.f5690lr = i6;
    }

    /* JADX INFO: renamed from: ri */
    int[] m7655ri(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f5685ka.getFlexItemCount();
        return m7640ri(flexItemCount, m7624lr(flexItemCount), sparseIntArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ri */
    int[] m7656ri(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.f5685ka.getFlexItemCount();
        List<lr> listM7624lr = m7624lr(flexItemCount);
        lr lrVar = new lr();
        if (view == null || !(layoutParams instanceof InterfaceC2265lr)) {
            lrVar.f5688lr = 1;
        } else {
            lrVar.f5688lr = ((InterfaceC2265lr) layoutParams).mo7593ik();
        }
        if (i == -1 || i == flexItemCount || i >= this.f5685ka.getFlexItemCount()) {
            lrVar.f5689ri = flexItemCount;
        } else {
            lrVar.f5689ri = i;
            while (i < flexItemCount) {
                listM7624lr.get(i).f5689ri++;
                i++;
            }
        }
        listM7624lr.add(lrVar);
        return m7640ri(flexItemCount + 1, listM7624lr, sparseIntArray);
    }
}

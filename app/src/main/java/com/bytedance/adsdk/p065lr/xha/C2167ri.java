package com.bytedance.adsdk.p065lr.xha;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.adsdk.p065lr.xha;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.xha.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2167ri<T> {

    /* JADX INFO: renamed from: aw */
    private int f5395aw;
    private int bgr;

    /* JADX INFO: renamed from: co */
    private float f5396co;

    /* JADX INFO: renamed from: di */
    public final float f5397di;

    /* JADX INFO: renamed from: fi */
    public final Interpolator f5398fi;

    /* JADX INFO: renamed from: ik */
    public final Interpolator f5399ik;
    public PointF jbs;

    /* JADX INFO: renamed from: ka */
    public final Interpolator f5400ka;

    /* JADX INFO: renamed from: lr */
    public T f5401lr;

    /* JADX INFO: renamed from: mj */
    public PointF f5402mj;

    /* JADX INFO: renamed from: qt */
    private final xha f5403qt;

    /* JADX INFO: renamed from: ri */
    public final T f5404ri;

    /* JADX INFO: renamed from: sf */
    private float f5405sf;
    private float slm;

    /* JADX INFO: renamed from: vr */
    private float f5406vr;
    public Float xha;

    public C2167ri(xha xhaVar, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.f5405sf = -3987645.8f;
        this.f5396co = -3987645.8f;
        this.f5395aw = 784923401;
        this.bgr = 784923401;
        this.f5406vr = Float.MIN_VALUE;
        this.slm = Float.MIN_VALUE;
        this.f5402mj = null;
        this.jbs = null;
        this.f5403qt = xhaVar;
        this.f5404ri = t;
        this.f5401lr = t2;
        this.f5399ik = interpolator;
        this.f5400ka = null;
        this.f5398fi = null;
        this.f5397di = f;
        this.xha = f2;
    }

    public C2167ri(xha xhaVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, float f, Float f2) {
        this.f5405sf = -3987645.8f;
        this.f5396co = -3987645.8f;
        this.f5395aw = 784923401;
        this.bgr = 784923401;
        this.f5406vr = Float.MIN_VALUE;
        this.slm = Float.MIN_VALUE;
        this.f5402mj = null;
        this.jbs = null;
        this.f5403qt = xhaVar;
        this.f5404ri = t;
        this.f5401lr = t2;
        this.f5399ik = null;
        this.f5400ka = interpolator;
        this.f5398fi = interpolator2;
        this.f5397di = f;
        this.xha = f2;
    }

    protected C2167ri(xha xhaVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.f5405sf = -3987645.8f;
        this.f5396co = -3987645.8f;
        this.f5395aw = 784923401;
        this.bgr = 784923401;
        this.f5406vr = Float.MIN_VALUE;
        this.slm = Float.MIN_VALUE;
        this.f5402mj = null;
        this.jbs = null;
        this.f5403qt = xhaVar;
        this.f5404ri = t;
        this.f5401lr = t2;
        this.f5399ik = interpolator;
        this.f5400ka = interpolator2;
        this.f5398fi = interpolator3;
        this.f5397di = f;
        this.xha = f2;
    }

    public C2167ri(T t) {
        this.f5405sf = -3987645.8f;
        this.f5396co = -3987645.8f;
        this.f5395aw = 784923401;
        this.bgr = 784923401;
        this.f5406vr = Float.MIN_VALUE;
        this.slm = Float.MIN_VALUE;
        this.f5402mj = null;
        this.jbs = null;
        this.f5403qt = null;
        this.f5404ri = t;
        this.f5401lr = t;
        this.f5399ik = null;
        this.f5400ka = null;
        this.f5398fi = null;
        this.f5397di = Float.MIN_VALUE;
        this.xha = Float.valueOf(Float.MAX_VALUE);
    }

    private C2167ri(T t, T t2) {
        this.f5405sf = -3987645.8f;
        this.f5396co = -3987645.8f;
        this.f5395aw = 784923401;
        this.bgr = 784923401;
        this.f5406vr = Float.MIN_VALUE;
        this.slm = Float.MIN_VALUE;
        this.f5402mj = null;
        this.jbs = null;
        this.f5403qt = null;
        this.f5404ri = t;
        this.f5401lr = t2;
        this.f5399ik = null;
        this.f5400ka = null;
        this.f5398fi = null;
        this.f5397di = Float.MIN_VALUE;
        this.xha = Float.valueOf(Float.MAX_VALUE);
    }

    /* JADX INFO: renamed from: di */
    public float m7206di() {
        if (this.f5405sf == -3987645.8f) {
            this.f5405sf = ((Float) this.f5404ri).floatValue();
        }
        return this.f5405sf;
    }

    /* JADX INFO: renamed from: fi */
    public boolean m7207fi() {
        return this.f5399ik == null && this.f5400ka == null && this.f5398fi == null;
    }

    /* JADX INFO: renamed from: ik */
    public float m7208ik() {
        xha xhaVar = this.f5403qt;
        if (xhaVar == null) {
            return 0.0f;
        }
        if (this.f5406vr == Float.MIN_VALUE) {
            this.f5406vr = (this.f5397di - xhaVar.m7183di()) / this.f5403qt.m7181bu();
        }
        return this.f5406vr;
    }

    public int jbs() {
        if (this.bgr == 784923401) {
            this.bgr = ((Integer) this.f5401lr).intValue();
        }
        return this.bgr;
    }

    /* JADX INFO: renamed from: ka */
    public float m7209ka() {
        if (this.f5403qt == null) {
            return 1.0f;
        }
        if (this.slm == Float.MIN_VALUE) {
            if (this.xha == null) {
                this.slm = 1.0f;
            } else {
                this.slm = m7208ik() + ((this.xha.floatValue() - this.f5397di) / this.f5403qt.m7181bu());
            }
        }
        return this.slm;
    }

    /* JADX INFO: renamed from: mj */
    public int m7210mj() {
        if (this.f5395aw == 784923401) {
            this.f5395aw = ((Integer) this.f5404ri).intValue();
        }
        return this.f5395aw;
    }

    /* JADX INFO: renamed from: ri */
    public C2167ri<T> m7211ri(T t, T t2) {
        return new C2167ri<>(t, t2);
    }

    /* JADX INFO: renamed from: ri */
    public boolean m7212ri(float f) {
        return f >= m7208ik() && f < m7209ka();
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f5404ri + ", endValue=" + this.f5401lr + ", startFrame=" + this.f5397di + ", endFrame=" + this.xha + ", interpolator=" + this.f5399ik + AbstractJsonLexerKt.END_OBJ;
    }

    public float xha() {
        if (this.f5396co == -3987645.8f) {
            this.f5396co = ((Float) this.f5401lr).floatValue();
        }
        return this.f5396co;
    }
}

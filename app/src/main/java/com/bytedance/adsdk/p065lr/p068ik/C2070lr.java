package com.bytedance.adsdk.p065lr.p068ik;

import android.graphics.PointF;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2070lr {

    /* JADX INFO: renamed from: aw */
    public PointF f4901aw;

    /* JADX INFO: renamed from: co */
    public PointF f4902co;

    /* JADX INFO: renamed from: di */
    public float f4903di;

    /* JADX INFO: renamed from: fi */
    public int f4904fi;

    /* JADX INFO: renamed from: ik */
    public float f4905ik;
    public int jbs;

    /* JADX INFO: renamed from: ka */
    public ri f4906ka;

    /* JADX INFO: renamed from: lr */
    public String f4907lr;

    /* JADX INFO: renamed from: mj */
    public int f4908mj;

    /* JADX INFO: renamed from: qt */
    public float f4909qt;

    /* JADX INFO: renamed from: ri */
    public String f4910ri;

    /* JADX INFO: renamed from: sf */
    public boolean f4911sf;
    public float xha;

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.lr$ri */
    public enum ri {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public C2070lr() {
    }

    public C2070lr(String str, String str2, float f, ri riVar, int i, float f2, float f3, int i2, int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        m6799ri(str, str2, f, riVar, i, f2, f3, i2, i3, f4, z, pointF, pointF2);
    }

    public int hashCode() {
        int iHashCode = (((((int) ((((this.f4910ri.hashCode() * 31) + this.f4907lr.hashCode()) * 31) + this.f4905ik)) * 31) + this.f4906ka.ordinal()) * 31) + this.f4904fi;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f4903di);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f4908mj;
    }

    /* JADX INFO: renamed from: ri */
    public void m6799ri(String str, String str2, float f, ri riVar, int i, float f2, float f3, int i2, int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        this.f4910ri = str;
        this.f4907lr = str2;
        this.f4905ik = f;
        this.f4906ka = riVar;
        this.f4904fi = i;
        this.f4903di = f2;
        this.xha = f3;
        this.f4908mj = i2;
        this.jbs = i3;
        this.f4909qt = f4;
        this.f4911sf = z;
        this.f4902co = pointF;
        this.f4901aw = pointF2;
    }
}

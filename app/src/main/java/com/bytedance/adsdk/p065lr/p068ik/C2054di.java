package com.bytedance.adsdk.p065lr.p068ik;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.di */
/* JADX INFO: loaded from: classes3.dex */
public class C2054di {

    /* JADX INFO: renamed from: ik */
    private final String f4793ik;

    /* JADX INFO: renamed from: lr */
    public final float f4794lr;

    /* JADX INFO: renamed from: ri */
    public final float f4795ri;

    public C2054di(String str, float f, float f2) {
        this.f4793ik = str;
        this.f4794lr = f2;
        this.f4795ri = f;
    }

    /* JADX INFO: renamed from: ri */
    public boolean m6700ri(String str) {
        if (this.f4793ik.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f4793ik.endsWith("\r")) {
            String str2 = this.f4793ik;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}

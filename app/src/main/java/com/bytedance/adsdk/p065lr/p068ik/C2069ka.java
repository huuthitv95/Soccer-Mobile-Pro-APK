package com.bytedance.adsdk.p065lr.p068ik;

import com.bytedance.adsdk.p065lr.p068ik.p070lr.slm;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2069ka {

    /* JADX INFO: renamed from: di */
    private final String f4895di;

    /* JADX INFO: renamed from: fi */
    private final String f4896fi;

    /* JADX INFO: renamed from: ik */
    private final double f4897ik;

    /* JADX INFO: renamed from: ka */
    private final double f4898ka;

    /* JADX INFO: renamed from: lr */
    private final char f4899lr;

    /* JADX INFO: renamed from: ri */
    private final List<slm> f4900ri;

    public C2069ka(List<slm> list, char c, double d, double d2, String str, String str2) {
        this.f4900ri = list;
        this.f4899lr = c;
        this.f4897ik = d;
        this.f4898ka = d2;
        this.f4896fi = str;
        this.f4895di = str2;
    }

    /* JADX INFO: renamed from: ri */
    public static int m6796ri(char c, String str, String str2) {
        return (((c * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public int hashCode() {
        return m6796ri(this.f4899lr, this.f4895di, this.f4896fi);
    }

    /* JADX INFO: renamed from: lr */
    public double m6797lr() {
        return this.f4898ka;
    }

    /* JADX INFO: renamed from: ri */
    public List<slm> m6798ri() {
        return this.f4900ri;
    }
}

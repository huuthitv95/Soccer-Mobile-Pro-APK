package com.bytedance.adsdk.p065lr.p072ka;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ka.ik */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC2117ik {
    JSON(".json"),
    ZIP(".zip");


    /* JADX INFO: renamed from: ik */
    public final String f5111ik;

    EnumC2117ik(String str) {
        this.f5111ik = str;
    }

    /* JADX INFO: renamed from: ri */
    public String m6995ri() {
        return ".temp" + this.f5111ik;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f5111ik;
    }
}

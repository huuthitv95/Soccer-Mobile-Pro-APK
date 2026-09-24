package com.bytedance.sdk.component.p160lr.p161ri;

/* JADX INFO: renamed from: com.bytedance.sdk.component.lr.ri.aw */
/* JADX INFO: loaded from: classes3.dex */
public class C2645aw {

    /* JADX INFO: renamed from: di */
    public ri f7520di;

    /* JADX INFO: renamed from: fi */
    public byte[] f7521fi;

    /* JADX INFO: renamed from: ik */
    public jbs f7522ik;

    /* JADX INFO: renamed from: ka */
    public String f7523ka;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.lr.ri.aw$ri */
    public enum ri {
        STRING_TYPE,
        BYTE_ARRAY_TYPE
    }

    public C2645aw() {
    }

    public C2645aw(jbs jbsVar, String str, ri riVar) {
        this.f7522ik = jbsVar;
        this.f7523ka = str;
        this.f7520di = riVar;
    }

    public C2645aw(jbs jbsVar, byte[] bArr, ri riVar) {
        this.f7522ik = jbsVar;
        this.f7521fi = bArr;
        this.f7520di = riVar;
    }

    /* JADX INFO: renamed from: ri */
    public static C2645aw m9874ri(jbs jbsVar, String str) {
        return new C2645aw(jbsVar, str, ri.STRING_TYPE);
    }

    /* JADX INFO: renamed from: ri */
    public static C2645aw m9875ri(jbs jbsVar, byte[] bArr) {
        return new C2645aw(jbsVar, bArr, ri.BYTE_ARRAY_TYPE);
    }
}

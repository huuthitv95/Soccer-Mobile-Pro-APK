package com.fyber.inneractive.sdk.rtb.data.types;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.rtb.data.types.a */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC9109a {
    VAST_1_0(1),
    VAST_2_0(2),
    VAST_3_0(3),
    VAST_1_0_WRAPPER(4),
    VAST_2_0_WRAPPER(5),
    VAST_3_0_WRAPPER(6);

    int value;

    EnumC9109a(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m21904a() {
        return this.value;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return String.valueOf(this.value);
    }
}

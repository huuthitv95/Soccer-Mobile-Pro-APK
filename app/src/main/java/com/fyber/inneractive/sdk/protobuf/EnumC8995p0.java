package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.p0 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC8995p0 {
    SCALAR(false),
    VECTOR(true),
    PACKED_VECTOR(true),
    MAP(false);

    private final boolean isList;

    EnumC8995p0(boolean z) {
        this.isList = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21693a() {
        return this.isList;
    }
}

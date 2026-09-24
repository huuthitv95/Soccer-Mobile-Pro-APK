package com.mbridge.msdk.thrid.okhttp.internal.http2;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.b */
/* JADX INFO: compiled from: ErrorCode.java */
/* JADX INFO: loaded from: classes7.dex */
public enum EnumC13748b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);


    /* JADX INFO: renamed from: a */
    public final int f38922a;

    EnumC13748b(int i) {
        this.f38922a = i;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC13748b m40431a(int i) {
        for (EnumC13748b enumC13748b : values()) {
            if (enumC13748b.f38922a == i) {
                return enumC13748b;
            }
        }
        return null;
    }
}

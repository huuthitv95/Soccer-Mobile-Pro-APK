package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public enum zzqg {
    DOUBLE(0, 1, zzqv.DOUBLE),
    FLOAT(1, 1, zzqv.FLOAT),
    INT64(2, 1, zzqv.LONG),
    UINT64(3, 1, zzqv.LONG),
    INT32(4, 1, zzqv.INT),
    FIXED64(5, 1, zzqv.LONG),
    FIXED32(6, 1, zzqv.INT),
    BOOL(7, 1, zzqv.BOOLEAN),
    STRING(8, 1, zzqv.STRING),
    MESSAGE(9, 1, zzqv.MESSAGE),
    BYTES(10, 1, zzqv.BYTE_STRING),
    UINT32(11, 1, zzqv.INT),
    ENUM(12, 1, zzqv.ENUM),
    SFIXED32(13, 1, zzqv.INT),
    SFIXED64(14, 1, zzqv.LONG),
    SINT32(15, 1, zzqv.INT),
    SINT64(16, 1, zzqv.LONG),
    GROUP(17, 1, zzqv.MESSAGE),
    DOUBLE_LIST(18, 2, zzqv.DOUBLE),
    FLOAT_LIST(19, 2, zzqv.FLOAT),
    INT64_LIST(20, 2, zzqv.LONG),
    UINT64_LIST(21, 2, zzqv.LONG),
    INT32_LIST(22, 2, zzqv.INT),
    FIXED64_LIST(23, 2, zzqv.LONG),
    FIXED32_LIST(24, 2, zzqv.INT),
    BOOL_LIST(25, 2, zzqv.BOOLEAN),
    STRING_LIST(26, 2, zzqv.STRING),
    MESSAGE_LIST(27, 2, zzqv.MESSAGE),
    BYTES_LIST(28, 2, zzqv.BYTE_STRING),
    UINT32_LIST(29, 2, zzqv.INT),
    ENUM_LIST(30, 2, zzqv.ENUM),
    SFIXED32_LIST(31, 2, zzqv.INT),
    SFIXED64_LIST(32, 2, zzqv.LONG),
    SINT32_LIST(33, 2, zzqv.INT),
    SINT64_LIST(34, 2, zzqv.LONG),
    DOUBLE_LIST_PACKED(35, 3, zzqv.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, zzqv.FLOAT),
    INT64_LIST_PACKED(37, 3, zzqv.LONG),
    UINT64_LIST_PACKED(38, 3, zzqv.LONG),
    INT32_LIST_PACKED(39, 3, zzqv.INT),
    FIXED64_LIST_PACKED(40, 3, zzqv.LONG),
    FIXED32_LIST_PACKED(41, 3, zzqv.INT),
    BOOL_LIST_PACKED(42, 3, zzqv.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, zzqv.INT),
    ENUM_LIST_PACKED(44, 3, zzqv.ENUM),
    SFIXED32_LIST_PACKED(45, 3, zzqv.INT),
    SFIXED64_LIST_PACKED(46, 3, zzqv.LONG),
    SINT32_LIST_PACKED(47, 3, zzqv.INT),
    SINT64_LIST_PACKED(48, 3, zzqv.LONG),
    GROUP_LIST(49, 2, zzqv.MESSAGE),
    MAP(50, 4, zzqv.VOID);

    private static final zzqg[] zzZ;
    private final int zzab;

    static {
        zzqg[] zzqgVarArrValues = values();
        zzZ = new zzqg[zzqgVarArrValues.length];
        for (zzqg zzqgVar : zzqgVarArrValues) {
            zzZ[zzqgVar.zzab] = zzqgVar;
        }
    }

    zzqg(int i, int i2, zzqv zzqvVar) {
        this.zzab = i;
        int i3 = i2 - 1;
        if (i3 == 1 || i3 == 3) {
            zzqvVar.zza();
        }
        if (i2 == 1) {
            zzqv zzqvVar2 = zzqv.VOID;
            zzqvVar.ordinal();
        }
    }

    public final int zza() {
        return this.zzab;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public enum zzidh {
    DOUBLE(0, 1, zziei.DOUBLE),
    FLOAT(1, 1, zziei.FLOAT),
    INT64(2, 1, zziei.LONG),
    UINT64(3, 1, zziei.LONG),
    INT32(4, 1, zziei.INT),
    FIXED64(5, 1, zziei.LONG),
    FIXED32(6, 1, zziei.INT),
    BOOL(7, 1, zziei.BOOLEAN),
    STRING(8, 1, zziei.STRING),
    MESSAGE(9, 1, zziei.MESSAGE),
    BYTES(10, 1, zziei.BYTE_STRING),
    UINT32(11, 1, zziei.INT),
    ENUM(12, 1, zziei.ENUM),
    SFIXED32(13, 1, zziei.INT),
    SFIXED64(14, 1, zziei.LONG),
    SINT32(15, 1, zziei.INT),
    SINT64(16, 1, zziei.LONG),
    GROUP(17, 1, zziei.MESSAGE),
    DOUBLE_LIST(18, 2, zziei.DOUBLE),
    FLOAT_LIST(19, 2, zziei.FLOAT),
    INT64_LIST(20, 2, zziei.LONG),
    UINT64_LIST(21, 2, zziei.LONG),
    INT32_LIST(22, 2, zziei.INT),
    FIXED64_LIST(23, 2, zziei.LONG),
    FIXED32_LIST(24, 2, zziei.INT),
    BOOL_LIST(25, 2, zziei.BOOLEAN),
    STRING_LIST(26, 2, zziei.STRING),
    MESSAGE_LIST(27, 2, zziei.MESSAGE),
    BYTES_LIST(28, 2, zziei.BYTE_STRING),
    UINT32_LIST(29, 2, zziei.INT),
    ENUM_LIST(30, 2, zziei.ENUM),
    SFIXED32_LIST(31, 2, zziei.INT),
    SFIXED64_LIST(32, 2, zziei.LONG),
    SINT32_LIST(33, 2, zziei.INT),
    SINT64_LIST(34, 2, zziei.LONG),
    DOUBLE_LIST_PACKED(35, 3, zziei.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, zziei.FLOAT),
    INT64_LIST_PACKED(37, 3, zziei.LONG),
    UINT64_LIST_PACKED(38, 3, zziei.LONG),
    INT32_LIST_PACKED(39, 3, zziei.INT),
    FIXED64_LIST_PACKED(40, 3, zziei.LONG),
    FIXED32_LIST_PACKED(41, 3, zziei.INT),
    BOOL_LIST_PACKED(42, 3, zziei.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, zziei.INT),
    ENUM_LIST_PACKED(44, 3, zziei.ENUM),
    SFIXED32_LIST_PACKED(45, 3, zziei.INT),
    SFIXED64_LIST_PACKED(46, 3, zziei.LONG),
    SINT32_LIST_PACKED(47, 3, zziei.INT),
    SINT64_LIST_PACKED(48, 3, zziei.LONG),
    GROUP_LIST(49, 2, zziei.MESSAGE),
    MAP(50, 4, zziei.VOID);

    private static final zzidh[] zzaa;
    private final int zzZ;

    static {
        zzidh[] zzidhVarArrValues = values();
        zzaa = new zzidh[zzidhVarArrValues.length];
        for (zzidh zzidhVar : zzidhVarArrValues) {
            zzaa[zzidhVar.zzZ] = zzidhVar;
        }
    }

    zzidh(int i, int i2, zziei zzieiVar) {
        this.zzZ = i;
        int i3 = i2 - 1;
        if (i3 == 1 || i3 == 3) {
            zzieiVar.zza();
        }
        if (i2 == 1) {
            zziei zzieiVar2 = zziei.VOID;
            zzieiVar.ordinal();
        }
    }

    public final int zza() {
        return this.zzZ;
    }
}

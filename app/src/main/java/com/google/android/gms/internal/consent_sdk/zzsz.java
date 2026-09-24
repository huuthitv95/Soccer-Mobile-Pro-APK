package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public enum zzsz {
    DOUBLE(zzta.DOUBLE, 1),
    FLOAT(zzta.FLOAT, 5),
    INT64(zzta.LONG, 0),
    UINT64(zzta.LONG, 0),
    INT32(zzta.INT, 0),
    FIXED64(zzta.LONG, 1),
    FIXED32(zzta.INT, 5),
    BOOL(zzta.BOOLEAN, 0),
    STRING(zzta.STRING, 2),
    GROUP(zzta.MESSAGE, 3),
    MESSAGE(zzta.MESSAGE, 2),
    BYTES(zzta.BYTE_STRING, 2),
    UINT32(zzta.INT, 0),
    ENUM(zzta.ENUM, 0),
    SFIXED32(zzta.INT, 5),
    SFIXED64(zzta.LONG, 1),
    SINT32(zzta.INT, 0),
    SINT64(zzta.LONG, 0);

    private final zzta zzt;
    private final int zzu;

    zzsz(zzta zztaVar, int i) {
        this.zzt = zztaVar;
        this.zzu = i;
    }

    public final int zza() {
        return this.zzu;
    }

    public final zzta zzb() {
        return this.zzt;
    }
}

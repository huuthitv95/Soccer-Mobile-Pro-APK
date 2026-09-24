package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public enum zzigu {
    DOUBLE(zzigv.DOUBLE, 1),
    FLOAT(zzigv.FLOAT, 5),
    INT64(zzigv.LONG, 0),
    UINT64(zzigv.LONG, 0),
    INT32(zzigv.INT, 0),
    FIXED64(zzigv.LONG, 1),
    FIXED32(zzigv.INT, 5),
    BOOL(zzigv.BOOLEAN, 0),
    STRING(zzigv.STRING, 2),
    GROUP(zzigv.MESSAGE, 3),
    MESSAGE(zzigv.MESSAGE, 2),
    BYTES(zzigv.BYTE_STRING, 2),
    UINT32(zzigv.INT, 0),
    ENUM(zzigv.ENUM, 0),
    SFIXED32(zzigv.INT, 5),
    SFIXED64(zzigv.LONG, 1),
    SINT32(zzigv.INT, 0),
    SINT64(zzigv.LONG, 0);

    private final zzigv zzs;
    private final int zzt;

    zzigu(zzigv zzigvVar, int i) {
        this.zzs = zzigvVar;
        this.zzt = i;
    }

    public final zzigv zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }
}

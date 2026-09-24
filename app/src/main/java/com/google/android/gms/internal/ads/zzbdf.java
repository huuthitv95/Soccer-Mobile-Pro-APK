package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbdf extends zzidr implements zzifd {
    private static final zzbdf zzd;
    private static volatile zzifk zze;
    private int zza;
    private zzbdl zzb;
    private zzidz zzc = zzbC();

    static {
        zzbdf zzbdfVar = new zzbdf();
        zzd = zzbdfVar;
        zzidr.zzbu(zzbdf.class, zzbdfVar);
    }

    private zzbdf() {
    }

    public static zzbdf zzc(byte[] bArr, zzidb zzidbVar) throws zzieg {
        return (zzbdf) zzidr.zzbV(zzd, bArr, zzidbVar);
    }

    public final zzbdl zza() {
        zzbdl zzbdlVar = this.zzb;
        return zzbdlVar == null ? zzbdl.zze() : zzbdlVar;
    }

    public final List zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002'", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzbdf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzbde(bArr);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifk zzifkVar = zze;
        if (zzifkVar != null) {
            return zzifkVar;
        }
        synchronized (zzbdf.class) {
            zzidmVar = zze;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzd);
                zze = zzidmVar;
            }
        }
        return zzidmVar;
    }
}

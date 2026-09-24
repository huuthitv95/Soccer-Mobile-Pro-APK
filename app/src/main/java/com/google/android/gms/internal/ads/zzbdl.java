package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbdl extends zzidr implements zzifd {
    private static final zzbdl zzd;
    private static volatile zzifk zze;
    private int zza;
    private zzbdn zzb;
    private zzicn zzc = zzicn.zza;

    static {
        zzbdl zzbdlVar = new zzbdl();
        zzd = zzbdlVar;
        zzidr.zzbu(zzbdl.class, zzbdlVar);
    }

    private zzbdl() {
    }

    public static zzbdl zze() {
        return zzd;
    }

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final zzbdn zzb() {
        zzbdn zzbdnVar = this.zzb;
        return zzbdnVar == null ? zzbdn.zzd() : zzbdnVar;
    }

    public final boolean zzc() {
        return (this.zza & 2) != 0;
    }

    public final zzicn zzd() {
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
            return zzbv(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzbdl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzbdk(bArr);
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
        synchronized (zzbdl.class) {
            zzidmVar = zze;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzd);
                zze = zzidmVar;
            }
        }
        return zzidmVar;
    }
}

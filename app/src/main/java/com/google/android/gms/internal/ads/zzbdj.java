package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbdj extends zzidr implements zzifd {
    private static final zzbdj zze;
    private static volatile zzifk zzf;
    private int zza;
    private zzbdp zzb;
    private zzicn zzc;
    private zzicn zzd;

    static {
        zzbdj zzbdjVar = new zzbdj();
        zze = zzbdjVar;
        zzidr.zzbu(zzbdj.class, zzbdjVar);
    }

    private zzbdj() {
        zzicn zzicnVar = zzicn.zza;
        this.zzc = zzicnVar;
        this.zzd = zzicnVar;
    }

    public static zzbdj zzd(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzbdj) zzidr.zzbT(zze, zzicnVar, zzidbVar);
    }

    public static zzbdj zze(byte[] bArr, zzidb zzidbVar) throws zzieg {
        return (zzbdj) zzidr.zzbV(zze, bArr, zzidbVar);
    }

    public final zzbdp zza() {
        zzbdp zzbdpVar = this.zzb;
        return zzbdpVar == null ? zzbdp.zzj() : zzbdpVar;
    }

    public final zzicn zzb() {
        return this.zzc;
    }

    public final zzicn zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zze, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzbdj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzbdi(bArr);
        }
        if (iOrdinal == 5) {
            return zze;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifk zzifkVar = zzf;
        if (zzifkVar != null) {
            return zzifkVar;
        }
        synchronized (zzbdj.class) {
            zzidmVar = zzf;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zze);
                zzf = zzidmVar;
            }
        }
        return zzidmVar;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhqj extends zzidr implements zzifd {
    private static final zzhqj zze;
    private static volatile zzifk zzf;
    private int zza;
    private int zzb;
    private zzhqn zzc;
    private zzicn zzd = zzicn.zza;

    static {
        zzhqj zzhqjVar = new zzhqj();
        zze = zzhqjVar;
        zzidr.zzbu(zzhqj.class, zzhqjVar);
    }

    private zzhqj() {
    }

    public static zzhqi zzd() {
        return (zzhqi) zze.zzbn();
    }

    public static zzhqj zze() {
        return zze;
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhqn zzb() {
        zzhqn zzhqnVar = this.zzc;
        return zzhqnVar == null ? zzhqn.zzc() : zzhqnVar;
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
            return zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhqj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhqi(bArr);
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
        synchronized (zzhqj.class) {
            zzidmVar = zzf;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zze);
                zzf = zzidmVar;
            }
        }
        return zzidmVar;
    }

    final /* synthetic */ void zzg(zzhqn zzhqnVar) {
        zzhqnVar.getClass();
        this.zzc = zzhqnVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzh(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zzd = zzicnVar;
    }
}

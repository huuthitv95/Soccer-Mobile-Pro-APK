package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhqf extends zzidr implements zzifd {
    private static final zzhqf zze;
    private static volatile zzifk zzf;
    private int zza;
    private int zzb;
    private zzhqj zzc;
    private zzhry zzd;

    static {
        zzhqf zzhqfVar = new zzhqf();
        zze = zzhqfVar;
        zzidr.zzbu(zzhqf.class, zzhqfVar);
    }

    private zzhqf() {
    }

    public static zzhqf zzd(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhqf) zzidr.zzbT(zze, zzicnVar, zzidbVar);
    }

    public static zzhqe zze() {
        return (zzhqe) zze.zzbn();
    }

    public static zzifk zzg() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhqj zzb() {
        zzhqj zzhqjVar = this.zzc;
        return zzhqjVar == null ? zzhqj.zze() : zzhqjVar;
    }

    public final zzhry zzc() {
        zzhry zzhryVar = this.zzd;
        return zzhryVar == null ? zzhry.zzg() : zzhryVar;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhqf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhqe(bArr);
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
        synchronized (zzhqf.class) {
            zzidmVar = zzf;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zze);
                zzf = zzidmVar;
            }
        }
        return zzidmVar;
    }

    final /* synthetic */ void zzh(zzhqj zzhqjVar) {
        zzhqjVar.getClass();
        this.zzc = zzhqjVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzi(zzhry zzhryVar) {
        zzhryVar.getClass();
        this.zzd = zzhryVar;
        this.zza |= 2;
    }
}

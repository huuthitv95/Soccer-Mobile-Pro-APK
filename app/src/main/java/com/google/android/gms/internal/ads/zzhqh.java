package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhqh extends zzidr implements zzifd {
    private static final zzhqh zzd;
    private static volatile zzifk zze;
    private int zza;
    private zzhql zzb;
    private zzhsa zzc;

    static {
        zzhqh zzhqhVar = new zzhqh();
        zzd = zzhqhVar;
        zzidr.zzbu(zzhqh.class, zzhqhVar);
    }

    private zzhqh() {
    }

    public static zzhqh zzc(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhqh) zzidr.zzbT(zzd, zzicnVar, zzidbVar);
    }

    public static zzhqg zzd() {
        return (zzhqg) zzd.zzbn();
    }

    public final zzhql zza() {
        zzhql zzhqlVar = this.zzb;
        return zzhqlVar == null ? zzhql.zzd() : zzhqlVar;
    }

    public final zzhsa zzb() {
        zzhsa zzhsaVar = this.zzc;
        return zzhsaVar == null ? zzhsa.zzg() : zzhsaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhqh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhqg(bArr);
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
        synchronized (zzhqh.class) {
            zzidmVar = zze;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzd);
                zze = zzidmVar;
            }
        }
        return zzidmVar;
    }

    final /* synthetic */ void zze(zzhql zzhqlVar) {
        zzhqlVar.getClass();
        this.zzb = zzhqlVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzg(zzhsa zzhsaVar) {
        zzhsaVar.getClass();
        this.zzc = zzhsaVar;
        this.zza |= 2;
    }
}

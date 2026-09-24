package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhry extends zzidr implements zzifd {
    private static final zzhry zze;
    private static volatile zzifk zzf;
    private int zza;
    private int zzb;
    private zzhsc zzc;
    private zzicn zzd = zzicn.zza;

    static {
        zzhry zzhryVar = new zzhry();
        zze = zzhryVar;
        zzidr.zzbu(zzhry.class, zzhryVar);
    }

    private zzhry() {
    }

    public static zzhry zzd(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhry) zzidr.zzbT(zze, zzicnVar, zzidbVar);
    }

    public static zzhrx zze() {
        return (zzhrx) zze.zzbn();
    }

    public static zzhry zzg() {
        return zze;
    }

    public static zzifk zzh() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhsc zzb() {
        zzhsc zzhscVar = this.zzc;
        return zzhscVar == null ? zzhsc.zzd() : zzhscVar;
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
            return new zzhry();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhrx(bArr);
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
        synchronized (zzhry.class) {
            zzidmVar = zzf;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zze);
                zzf = zzidmVar;
            }
        }
        return zzidmVar;
    }

    final /* synthetic */ void zzi(zzhsc zzhscVar) {
        zzhscVar.getClass();
        this.zzc = zzhscVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzj(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zzd = zzicnVar;
    }
}

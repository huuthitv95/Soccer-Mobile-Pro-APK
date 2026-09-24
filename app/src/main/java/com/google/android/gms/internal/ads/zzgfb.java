package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgfb extends zzidr implements zzifd {
    private static final zzgfb zzf;
    private static volatile zzifk zzg;
    private int zza;
    private zzgfd zzb;
    private zzicn zzc;
    private zzicn zzd;
    private int zze;

    static {
        zzgfb zzgfbVar = new zzgfb();
        zzf = zzgfbVar;
        zzidr.zzbu(zzgfb.class, zzgfbVar);
    }

    private zzgfb() {
        zzicn zzicnVar = zzicn.zza;
        this.zzc = zzicnVar;
        this.zzd = zzicnVar;
    }

    public static zzgfa zzd() {
        return (zzgfa) zzf.zzbn();
    }

    public final zzgfd zza() {
        zzgfd zzgfdVar = this.zzb;
        return zzgfdVar == null ? zzgfd.zzg() : zzgfdVar;
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
            return zzbv(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002\u0004᠌\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", zzgfr.zza});
        }
        if (iOrdinal == 3) {
            return new zzgfb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzgfa(bArr);
        }
        if (iOrdinal == 5) {
            return zzf;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifk zzifkVar = zzg;
        if (zzifkVar != null) {
            return zzifkVar;
        }
        synchronized (zzgfb.class) {
            zzidmVar = zzg;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzf);
                zzg = zzidmVar;
            }
        }
        return zzidmVar;
    }

    final /* synthetic */ void zze(zzgfd zzgfdVar) {
        zzgfdVar.getClass();
        this.zzb = zzgfdVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzg(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zza |= 2;
        this.zzc = zzicnVar;
    }

    final /* synthetic */ void zzh(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zza |= 4;
        this.zzd = zzicnVar;
    }

    public final int zzj() {
        int iZza = zzgfs.zza(this.zze);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    final /* synthetic */ void zzk(int i) {
        this.zze = i - 1;
        this.zza |= 8;
    }
}

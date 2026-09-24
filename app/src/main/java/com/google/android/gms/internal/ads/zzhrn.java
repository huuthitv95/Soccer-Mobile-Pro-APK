package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhrn extends zzidr implements zzifd {
    private static final zzhrn zzf;
    private static volatile zzifk zzg;
    private int zza;
    private int zzb;
    private zzhrj zzc;
    private zzicn zzd;
    private zzicn zze;

    static {
        zzhrn zzhrnVar = new zzhrn();
        zzf = zzhrnVar;
        zzidr.zzbu(zzhrn.class, zzhrnVar);
    }

    private zzhrn() {
        zzicn zzicnVar = zzicn.zza;
        this.zzd = zzicnVar;
        this.zze = zzicnVar;
    }

    public static zzhrn zze(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhrn) zzidr.zzbT(zzf, zzicnVar, zzidbVar);
    }

    public static zzhrm zzg() {
        return (zzhrm) zzf.zzbn();
    }

    public static zzhrn zzh() {
        return zzf;
    }

    public static zzifk zzi() {
        return zzf.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhrj zzb() {
        zzhrj zzhrjVar = this.zzc;
        return zzhrjVar == null ? zzhrj.zzc() : zzhrjVar;
    }

    public final zzicn zzc() {
        return this.zzd;
    }

    public final zzicn zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzhrn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhrm(bArr);
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
        synchronized (zzhrn.class) {
            zzidmVar = zzg;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzf);
                zzg = zzidmVar;
            }
        }
        return zzidmVar;
    }

    final /* synthetic */ void zzj(zzhrj zzhrjVar) {
        zzhrjVar.getClass();
        this.zzc = zzhrjVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzk(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zzd = zzicnVar;
    }

    final /* synthetic */ void zzl(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zze = zzicnVar;
    }
}

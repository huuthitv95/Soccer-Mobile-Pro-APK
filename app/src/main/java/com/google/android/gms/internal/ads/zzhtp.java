package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhtp extends zzidr implements zzifd {
    private static final zzhtp zzd;
    private static volatile zzifk zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzhtp zzhtpVar = new zzhtp();
        zzd = zzhtpVar;
        zzidr.zzbu(zzhtp.class, zzhtpVar);
    }

    private zzhtp() {
    }

    public static zzhto zzd() {
        return (zzhto) zzd.zzbn();
    }

    public static zzhtp zze() {
        return zzd;
    }

    public final zzhrw zza() {
        zzhrw zzhrwVarZzb = zzhrw.zzb(this.zza);
        return zzhrwVarZzb == null ? zzhrw.UNRECOGNIZED : zzhrwVarZzb;
    }

    public final zzhrw zzb() {
        zzhrw zzhrwVarZzb = zzhrw.zzb(this.zzb);
        return zzhrwVarZzb == null ? zzhrw.UNRECOGNIZED : zzhrwVarZzb;
    }

    public final int zzc() {
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
            return zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhtp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhto(bArr);
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
        synchronized (zzhtp.class) {
            zzidmVar = zze;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzd);
                zze = zzidmVar;
            }
        }
        return zzidmVar;
    }

    final /* synthetic */ void zzg(zzhrw zzhrwVar) {
        this.zza = zzhrwVar.zza();
    }

    final /* synthetic */ void zzh(zzhrw zzhrwVar) {
        this.zzb = zzhrwVar.zza();
    }

    final /* synthetic */ void zzi(int i) {
        this.zzc = i;
    }
}

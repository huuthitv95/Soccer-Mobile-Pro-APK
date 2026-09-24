package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhrj extends zzidr implements zzifd {
    private static final zzhrj zzd;
    private static volatile zzifk zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzhrj zzhrjVar = new zzhrj();
        zzd = zzhrjVar;
        zzidr.zzbu(zzhrj.class, zzhrjVar);
    }

    private zzhrj() {
    }

    public static zzhri zzb() {
        return (zzhri) zzd.zzbn();
    }

    public static zzhrj zzc() {
        return zzd;
    }

    public final zzhrw zza() {
        zzhrw zzhrwVarZzb = zzhrw.zzb(this.zza);
        return zzhrwVarZzb == null ? zzhrw.UNRECOGNIZED : zzhrwVarZzb;
    }

    final /* synthetic */ void zzd(zzhrw zzhrwVar) {
        this.zza = zzhrwVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhrj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhri(bArr);
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
        synchronized (zzhrj.class) {
            zzidmVar = zze;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzd);
                zze = zzidmVar;
            }
        }
        return zzidmVar;
    }

    public final int zzg() {
        int i = this.zzb;
        int i2 = 2;
        if (i != 0) {
            if (i == 2) {
                i2 = 4;
            } else if (i == 3) {
                i2 = 5;
            } else if (i != 4) {
                i2 = i != 5 ? 0 : 7;
            } else {
                i2 = 6;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int zzh() {
        int i = this.zzc;
        int i2 = 2;
        if (i != 0) {
            if (i != 1) {
                i2 = i != 2 ? 0 : 4;
            } else {
                i2 = 3;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    final /* synthetic */ void zzi(int i) {
        this.zzb = zzhrv.zza(i);
    }

    final /* synthetic */ void zzj(int i) {
        this.zzc = zzhro.zza(i);
    }
}

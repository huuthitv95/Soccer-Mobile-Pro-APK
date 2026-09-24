package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhsc extends zzidr implements zzifd {
    private static final zzhsc zzc;
    private static volatile zzifk zzd;
    private int zza;
    private int zzb;

    static {
        zzhsc zzhscVar = new zzhsc();
        zzc = zzhscVar;
        zzidr.zzbu(zzhsc.class, zzhscVar);
    }

    private zzhsc() {
    }

    public static zzhsb zzc() {
        return (zzhsb) zzc.zzbn();
    }

    public static zzhsc zzd() {
        return zzc;
    }

    public final zzhrw zza() {
        zzhrw zzhrwVarZzb = zzhrw.zzb(this.zza);
        return zzhrwVarZzb == null ? zzhrw.UNRECOGNIZED : zzhrwVarZzb;
    }

    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzhsc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhsb(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifk zzifkVar = zzd;
        if (zzifkVar != null) {
            return zzifkVar;
        }
        synchronized (zzhsc.class) {
            zzidmVar = zzd;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzc);
                zzd = zzidmVar;
            }
        }
        return zzidmVar;
    }

    final /* synthetic */ void zze(zzhrw zzhrwVar) {
        this.zza = zzhrwVar.zza();
    }

    final /* synthetic */ void zzg(int i) {
        this.zzb = i;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhqb extends zzidr implements zzifd {
    private static final zzhqb zzd;
    private static volatile zzifk zze;
    private int zza;
    private int zzb;
    private zzhqd zzc;

    static {
        zzhqb zzhqbVar = new zzhqb();
        zzd = zzhqbVar;
        zzidr.zzbu(zzhqb.class, zzhqbVar);
    }

    private zzhqb() {
    }

    public static zzhqb zzc(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhqb) zzidr.zzbT(zzd, zzicnVar, zzidbVar);
    }

    public static zzhqa zzd() {
        return (zzhqa) zzd.zzbn();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhqd zzb() {
        zzhqd zzhqdVar = this.zzc;
        return zzhqdVar == null ? zzhqd.zzc() : zzhqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhqb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhqa(bArr);
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
        synchronized (zzhqb.class) {
            zzidmVar = zze;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzd);
                zze = zzidmVar;
            }
        }
        return zzidmVar;
    }

    final /* synthetic */ void zze(int i) {
        this.zzb = i;
    }

    final /* synthetic */ void zzg(zzhqd zzhqdVar) {
        zzhqdVar.getClass();
        this.zzc = zzhqdVar;
        this.zza |= 1;
    }
}

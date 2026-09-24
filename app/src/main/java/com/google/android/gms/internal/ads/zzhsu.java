package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhsu extends zzidr implements zzifd {
    private static final zzhsu zzd;
    private static volatile zzifk zze;
    private int zza;
    private int zzb;
    private zzhsw zzc;

    static {
        zzhsu zzhsuVar = new zzhsu();
        zzd = zzhsuVar;
        zzidr.zzbu(zzhsu.class, zzhsuVar);
    }

    private zzhsu() {
    }

    public static zzhsu zzc(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhsu) zzidr.zzbT(zzd, zzicnVar, zzidbVar);
    }

    public static zzhst zzd() {
        return (zzhst) zzd.zzbn();
    }

    public static zzifk zze() {
        return zzd.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhsw zzb() {
        zzhsw zzhswVar = this.zzc;
        return zzhswVar == null ? zzhsw.zzd() : zzhswVar;
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
            return new zzhsu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhst(bArr);
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
        synchronized (zzhsu.class) {
            zzidmVar = zze;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzd);
                zze = zzidmVar;
            }
        }
        return zzidmVar;
    }

    final /* synthetic */ void zzg(zzhsw zzhswVar) {
        zzhswVar.getClass();
        this.zzc = zzhswVar;
        this.zza |= 1;
    }
}

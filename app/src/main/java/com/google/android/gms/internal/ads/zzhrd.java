package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhrd extends zzidr implements zzifd {
    private static final zzhrd zzc;
    private static volatile zzifk zzd;
    private int zza;
    private zzicn zzb = zzicn.zza;

    static {
        zzhrd zzhrdVar = new zzhrd();
        zzc = zzhrdVar;
        zzidr.zzbu(zzhrd.class, zzhrdVar);
    }

    private zzhrd() {
    }

    public static zzhrd zzc(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhrd) zzidr.zzbT(zzc, zzicnVar, zzidbVar);
    }

    public static zzhrc zzd() {
        return (zzhrc) zzc.zzbn();
    }

    public static zzifk zze() {
        return zzc.zzbd();
    }

    public final int zza() {
        return this.zza;
    }

    public final zzicn zzb() {
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
            return zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzhrd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhrc(bArr);
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
        synchronized (zzhrd.class) {
            zzidmVar = zzd;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzc);
                zzd = zzidmVar;
            }
        }
        return zzidmVar;
    }

    final /* synthetic */ void zzg(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zzb = zzicnVar;
    }
}

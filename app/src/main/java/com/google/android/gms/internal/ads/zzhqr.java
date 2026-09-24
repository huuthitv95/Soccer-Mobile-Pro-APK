package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhqr extends zzidr implements zzifd {
    private static final zzhqr zzd;
    private static volatile zzifk zze;
    private int zza;
    private zzhqt zzb;
    private int zzc;

    static {
        zzhqr zzhqrVar = new zzhqr();
        zzd = zzhqrVar;
        zzidr.zzbu(zzhqr.class, zzhqrVar);
    }

    private zzhqr() {
    }

    public static zzhqr zzc(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhqr) zzidr.zzbT(zzd, zzicnVar, zzidbVar);
    }

    public static zzhqq zzd() {
        return (zzhqq) zzd.zzbn();
    }

    public final zzhqt zza() {
        zzhqt zzhqtVar = this.zzb;
        return zzhqtVar == null ? zzhqt.zzc() : zzhqtVar;
    }

    public final int zzb() {
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
            return zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhqr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhqq(bArr);
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
        synchronized (zzhqr.class) {
            zzidmVar = zze;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzd);
                zze = zzidmVar;
            }
        }
        return zzidmVar;
    }

    final /* synthetic */ void zze(zzhqt zzhqtVar) {
        zzhqtVar.getClass();
        this.zzb = zzhqtVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzg(int i) {
        this.zzc = i;
    }
}

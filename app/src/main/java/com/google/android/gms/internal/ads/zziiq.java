package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zziiq extends zzidr implements zzifd {
    private static final zziiq zze;
    private static volatile zzifk zzf;
    private int zza;
    private int zzb;
    private zzicn zzc;
    private zzicn zzd;

    static {
        zziiq zziiqVar = new zziiq();
        zze = zziiqVar;
        zzidr.zzbu(zziiq.class, zziiqVar);
    }

    private zziiq() {
        zzicn zzicnVar = zzicn.zza;
        this.zzc = zzicnVar;
        this.zzd = zzicnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zziiq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zziip(bArr);
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
        synchronized (zziiq.class) {
            zzidmVar = zzf;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zze);
                zzf = zzidmVar;
            }
        }
        return zzidmVar;
    }
}

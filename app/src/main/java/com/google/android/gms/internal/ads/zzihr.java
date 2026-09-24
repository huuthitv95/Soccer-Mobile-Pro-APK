package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzihr extends zzidr implements zzifd {
    private static final zzihr zze;
    private static volatile zzifk zzf;
    private int zza;
    private int zzb;
    private long zzc;
    private zzicn zzd = zzicn.zza;

    static {
        zzihr zzihrVar = new zzihr();
        zze = zzihrVar;
        zzidr.zzbu(zzihr.class, zzihrVar);
    }

    private zzihr() {
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", zzihq.zza, "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzihr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzihp(bArr);
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
        synchronized (zzihr.class) {
            zzidmVar = zzf;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zze);
                zzf = zzidmVar;
            }
        }
        return zzidmVar;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zziiz extends zzidr implements zzifd {
    private static final zziiz zzf;
    private static volatile zzifk zzg;
    private int zza;
    private int zzb;
    private int zzc;
    private long zzd;
    private long zze;

    static {
        zziiz zziizVar = new zziiz();
        zzf = zziizVar;
        zzidr.zzbu(zziiz.class, zziizVar);
    }

    private zziiz() {
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", zziiy.zza, "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zziiz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zziix(bArr);
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
        synchronized (zziiz.class) {
            zzidmVar = zzg;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzf);
                zzg = zzidmVar;
            }
        }
        return zzidmVar;
    }
}

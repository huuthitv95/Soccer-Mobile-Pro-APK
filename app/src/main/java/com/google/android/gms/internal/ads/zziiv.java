package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zziiv extends zzidr implements zzifd {
    private static final zziiv zze;
    private static volatile zzifk zzf;
    private int zza;
    private int zzb;
    private boolean zzc;
    private int zzd;

    static {
        zziiv zziivVar = new zziiv();
        zze = zziivVar;
        zzidr.zzbu(zziiv.class, zziivVar);
    }

    private zziiv() {
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            zzidx zzidxVar = zziit.zza;
            return zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zza", "zzb", zzidxVar, "zzc", "zzd", zzidxVar});
        }
        if (iOrdinal == 3) {
            return new zziiv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zziiu(bArr);
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
        synchronized (zziiv.class) {
            zzidmVar = zzf;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zze);
                zzf = zzidmVar;
            }
        }
        return zzidmVar;
    }
}

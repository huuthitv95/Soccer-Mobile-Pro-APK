package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzayw extends zzidr implements zzifd {
    private static final zzayw zzc;
    private static volatile zzifk zzd;
    private int zza;
    private String zzb = "";

    static {
        zzayw zzaywVar = new zzayw();
        zzc = zzaywVar;
        zzidr.zzbu(zzayw.class, zzaywVar);
    }

    private zzayw() {
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzayw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzayv(bArr);
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
        synchronized (zzayw.class) {
            zzidmVar = zzd;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzc);
                zzd = zzidmVar;
            }
        }
        return zzidmVar;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zziju extends zzidr implements zzifd {
    private static final zziju zzd;
    private static volatile zzifk zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zziju zzijuVar = new zziju();
        zzd = zzijuVar;
        zzidr.zzbu(zziju.class, zzijuVar);
    }

    private zziju() {
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            zzidx zzidxVar = zzijt.zza;
            return zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", zzidxVar, "zzc", zzidxVar});
        }
        if (iOrdinal == 3) {
            return new zziju();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzijs(bArr);
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
        synchronized (zziju.class) {
            zzidmVar = zze;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzd);
                zze = zzidmVar;
            }
        }
        return zzidmVar;
    }
}

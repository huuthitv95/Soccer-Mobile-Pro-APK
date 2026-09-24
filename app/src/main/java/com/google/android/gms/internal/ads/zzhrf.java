package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhrf extends zzidr implements zzifd {
    private static final zzhrf zza;
    private static volatile zzifk zzb;

    static {
        zzhrf zzhrfVar = new zzhrf();
        zza = zzhrfVar;
        zzidr.zzbu(zzhrf.class, zzhrfVar);
    }

    private zzhrf() {
    }

    public static zzhrf zza(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhrf) zzidr.zzbT(zza, zzicnVar, zzidbVar);
    }

    public static zzhrf zzb() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        byte[] bArr = null;
        if (iOrdinal == 2) {
            return zzbv(zza, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new zzhrf();
        }
        if (iOrdinal == 4) {
            return new zzhre(bArr);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifk zzifkVar = zzb;
        if (zzifkVar != null) {
            return zzifkVar;
        }
        synchronized (zzhrf.class) {
            zzidmVar = zzb;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zza);
                zzb = zzidmVar;
            }
        }
        return zzidmVar;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhud extends zzidr implements zzifd {
    private static final zzhud zzb;
    private static volatile zzifk zzc;
    private int zza;

    static {
        zzhud zzhudVar = new zzhud();
        zzb = zzhudVar;
        zzidr.zzbu(zzhud.class, zzhudVar);
    }

    private zzhud() {
    }

    public static zzhud zzb(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhud) zzidr.zzbT(zzb, zzicnVar, zzidbVar);
    }

    public static zzhud zzc() {
        return zzb;
    }

    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzhud();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhuc(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifk zzifkVar = zzc;
        if (zzifkVar != null) {
            return zzifkVar;
        }
        synchronized (zzhud.class) {
            zzidmVar = zzc;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzb);
                zzc = zzidmVar;
            }
        }
        return zzidmVar;
    }
}

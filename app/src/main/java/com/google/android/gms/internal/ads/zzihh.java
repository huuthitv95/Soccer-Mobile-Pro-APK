package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzihh extends zzidr implements zzifd {
    private static final zzihh zzc;
    private static volatile zzifk zzd;
    private zzidz zza = zzbC();
    private zzidz zzb = zzbC();

    static {
        zzihh zzihhVar = new zzihh();
        zzc = zzihhVar;
        zzidr.zzbu(zzihh.class, zzihhVar);
    }

    private zzihh() {
    }

    public static zzihh zzc(byte[] bArr, zzidb zzidbVar) throws zzieg {
        return (zzihh) zzidr.zzbV(zzc, bArr, zzidbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u0016\u0003\u0016", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzihh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzihg(bArr);
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
        synchronized (zzihh.class) {
            zzidmVar = zzd;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzc);
                zzd = zzidmVar;
            }
        }
        return zzidmVar;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfqx extends zzidr implements zzifd {
    private static final zzfqx zze;
    private static volatile zzifk zzf;
    private int zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;

    static {
        zzfqx zzfqxVar = new zzfqx();
        zze = zzfqxVar;
        zzidr.zzbu(zzfqx.class, zzfqxVar);
    }

    private zzfqx() {
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zze, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzfqx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfqw(bArr);
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
        synchronized (zzfqx.class) {
            zzidmVar = zzf;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zze);
                zzf = zzidmVar;
            }
        }
        return zzidmVar;
    }
}

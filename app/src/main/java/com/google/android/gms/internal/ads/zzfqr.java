package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfqr extends zzidr implements zzifd {
    private static final zzfqr zzg;
    private static volatile zzifk zzh;
    private int zzb;
    private int zzc;
    private boolean zzd;
    private boolean zzf;
    private String zza = "";
    private String zze = "";

    static {
        zzfqr zzfqrVar = new zzfqr();
        zzg = zzfqrVar;
        zzidr.zzbu(zzfqr.class, zzfqrVar);
    }

    private zzfqr() {
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzg, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0007\u0005Ȉ\u0006\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzfqr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfqq(bArr);
        }
        if (iOrdinal == 5) {
            return zzg;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifk zzifkVar = zzh;
        if (zzifkVar != null) {
            return zzifkVar;
        }
        synchronized (zzfqr.class) {
            zzidmVar = zzh;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzg);
                zzh = zzidmVar;
            }
        }
        return zzidmVar;
    }
}

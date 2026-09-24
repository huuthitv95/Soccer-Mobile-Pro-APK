package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaxw extends zzidr implements zzifd {
    private static final zzaxw zzd;
    private static volatile zzifk zze;
    private int zza;
    private int zzb;
    private long zzc = -1;

    static {
        zzaxw zzaxwVar = new zzaxw();
        zzd = zzaxwVar;
        zzidr.zzbu(zzaxw.class, zzaxwVar);
    }

    private zzaxw() {
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zza", "zzb", zzaxj.zza, "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzaxw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzaxv(bArr);
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
        synchronized (zzaxw.class) {
            zzidmVar = zze;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzd);
                zze = zzidmVar;
            }
        }
        return zzidmVar;
    }
}

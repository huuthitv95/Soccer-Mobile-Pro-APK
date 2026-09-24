package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzikf extends zzidr implements zzifd {
    private static final zzikf zzh;
    private static volatile zzifk zzi;
    private int zza;
    private int zzb;
    private int zze;
    private String zzc = "";
    private zzidz zzd = zzbC();
    private zzied zzf = zzbM();
    private zzicn zzg = zzicn.zza;

    static {
        zzikf zzikfVar = new zzikf();
        zzh = zzikfVar;
        zzidr.zzbu(zzikf.class, zzikfVar);
    }

    private zzikf() {
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzh, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", zzikd.class, "zzg"});
        }
        if (iOrdinal == 3) {
            return new zzikf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzike(bArr);
        }
        if (iOrdinal == 5) {
            return zzh;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifk zzifkVar = zzi;
        if (zzifkVar != null) {
            return zzifkVar;
        }
        synchronized (zzikf.class) {
            zzidmVar = zzi;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzh);
                zzi = zzidmVar;
            }
        }
        return zzidmVar;
    }
}

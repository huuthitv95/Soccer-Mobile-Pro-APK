package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzilg extends zzidr implements zzifd {
    private static final zzilg zzj;
    private static volatile zzifk zzk;
    private int zza;
    private zzikp zzh;
    private String zzb = "";
    private String zzc = "";
    private zzied zzd = zzbM();
    private zzied zze = zzbM();
    private zzied zzf = zzbM();
    private int zzg = -1;
    private String zzi = "";

    static {
        zzilg zzilgVar = new zzilg();
        zzj = zzilgVar;
        zzidr.zzbu(zzilg.class, zzilgVar);
    }

    private zzilg() {
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzj, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0003\u0000\u0001ဈ\u0001\u0002\u001b\u0003\u001b\u0004င\u0002\u0005ဈ\u0000\b\u001b\tဈ\u0004\nဉ\u0003", new Object[]{"zza", "zzc", "zzd", zzikt.class, "zze", zzila.class, "zzg", "zzb", "zzf", zziln.class, "zzi", "zzh"});
        }
        if (iOrdinal == 3) {
            return new zzilg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzilf(bArr);
        }
        if (iOrdinal == 5) {
            return zzj;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifk zzifkVar = zzk;
        if (zzifkVar != null) {
            return zzifkVar;
        }
        synchronized (zzilg.class) {
            zzidmVar = zzk;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzj);
                zzk = zzidmVar;
            }
        }
        return zzidmVar;
    }
}

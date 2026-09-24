package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzikt extends zzidr implements zzifd {
    private static final zzikt zzn;
    private static volatile zzifk zzo;
    private int zza;
    private int zzd;
    private boolean zzf;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private zziky zzk;
    private zziks zzm;
    private String zzb = "";
    private String zzc = "";
    private int zze = 1;
    private String zzg = "";
    private String zzl = "";

    static {
        zzikt zziktVar = new zzikt();
        zzn = zziktVar;
        zzidr.zzbu(zzikt.class, zziktVar);
    }

    private zzikt() {
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzn, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bင\u0007\t᠌\b\nဉ\t\u000bဈ\n\fဉ\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", zzilc.zza, "zze", zzilb.zza, "zzf", "zzg", "zzh", "zzi", "zzj", zziku.zza, "zzk", "zzl", "zzm"});
        }
        if (iOrdinal == 3) {
            return new zzikt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzikq(bArr);
        }
        if (iOrdinal == 5) {
            return zzn;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifk zzifkVar = zzo;
        if (zzifkVar != null) {
            return zzifkVar;
        }
        synchronized (zzikt.class) {
            zzidmVar = zzo;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzn);
                zzo = zzidmVar;
            }
        }
        return zzidmVar;
    }
}

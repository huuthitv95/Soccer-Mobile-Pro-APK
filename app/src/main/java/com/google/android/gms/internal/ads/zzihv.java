package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzihv extends zzidr implements zzifd {
    private static final zzihv zzy;
    private static volatile zzifk zzz;
    private int zza;
    private int zzb;
    private boolean zzc;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzp;
    private long zzu;
    private boolean zzw;
    private String zzd = "";
    private zzied zze = zzidr.zzbM();
    private String zzj = "";
    private zzied zzo = zzbM();
    private zzidz zzv = zzbC();
    private zzidz zzx = zzbC();

    static {
        zzihv zzihvVar = new zzihv();
        zzy = zzihvVar;
        zzidr.zzbu(zzihv.class, zzihvVar);
    }

    private zzihv() {
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzy, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"zza", "zzb", zzihu.zza, "zzc", "zzd", "zze", "zzf", zzihs.zza, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zzihr.class, "zzp", "zzu", "zzv", zzihj.zza(), "zzw", "zzx", zziht.zza});
        }
        if (iOrdinal == 3) {
            return new zzihv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zziho(bArr);
        }
        if (iOrdinal == 5) {
            return zzy;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifk zzifkVar = zzz;
        if (zzifkVar != null) {
            return zzifkVar;
        }
        synchronized (zzihv.class) {
            zzidmVar = zzz;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzy);
                zzz = zzidmVar;
            }
        }
        return zzidmVar;
    }
}

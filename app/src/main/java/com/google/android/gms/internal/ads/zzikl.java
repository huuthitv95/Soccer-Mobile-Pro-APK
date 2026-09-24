package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzikl extends zzidr implements zzifd {
    private static final zzikl zzp;
    private static volatile zzifk zzu;
    private int zza;
    private boolean zzh;
    private double zzi;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private String zzb = "";
    private String zzc = "";
    private int zzd = 4;
    private zzied zze = zzidr.zzbM();
    private String zzf = "";
    private String zzg = "";
    private zzied zzj = zzbM();

    static {
        zzikl zziklVar = new zzikl();
        zzp = zziklVar;
        zzidr.zzbu(zzikl.class, zziklVar);
    }

    private zzikl() {
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzp, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zza", "zzb", "zzd", zzikk.zza, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzikj.class, "zzc", "zzk", zzikh.zza, "zzl", "zzm", "zzn", "zzo"});
        }
        if (iOrdinal == 3) {
            return new zzikl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzikg(bArr);
        }
        if (iOrdinal == 5) {
            return zzp;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifk zzifkVar = zzu;
        if (zzifkVar != null) {
            return zzifkVar;
        }
        synchronized (zzikl.class) {
            zzidmVar = zzu;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzp);
                zzu = zzidmVar;
            }
        }
        return zzidmVar;
    }
}

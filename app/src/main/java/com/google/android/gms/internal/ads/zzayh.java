package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzayh extends zzidr implements zzifd {
    private static final zzayh zzm;
    private static volatile zzifk zzn;
    private int zza;
    private long zzb;
    private int zzc;
    private boolean zzd;
    private long zzf;
    private boolean zzg;
    private long zzi;
    private long zzj;
    private long zzk;
    private zzayj zzl;
    private zzidz zze = zzbC();
    private zzied zzh = zzbM();

    static {
        zzayh zzayhVar = new zzayh();
        zzm = zzayhVar;
        zzidr.zzbu(zzayh.class, zzayhVar);
    }

    private zzayh() {
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzm, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003\u0006ဇ\u0004\u0007\u001b\bဂ\u0005\tဂ\u0006\nဂ\u0007\u000bဉ\b", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", zzayn.class, "zzi", "zzj", "zzk", "zzl"});
        }
        if (iOrdinal == 3) {
            return new zzayh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzayg(bArr);
        }
        if (iOrdinal == 5) {
            return zzm;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifk zzifkVar = zzn;
        if (zzifkVar != null) {
            return zzifkVar;
        }
        synchronized (zzayh.class) {
            zzidmVar = zzn;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzm);
                zzn = zzidmVar;
            }
        }
        return zzidmVar;
    }
}

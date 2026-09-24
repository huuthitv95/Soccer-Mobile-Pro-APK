package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzijo extends zzidr implements zzifd {
    private static final zzijo zzj;
    private static volatile zzifk zzk;
    private int zza;
    private long zzc;
    private boolean zzd;
    private int zze;
    private boolean zzh;
    private boolean zzi;
    private String zzb = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zzijo zzijoVar = new zzijo();
        zzj = zzijoVar;
        zzidr.zzbu(zzijo.class, zzijoVar);
    }

    private zzijo() {
    }

    public static zzijn zzc() {
        return (zzijn) zzj.zzbn();
    }

    final /* synthetic */ void zzd(String str) {
        this.zza |= 1;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzj, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", zzijp.zza, "zzf", "zzg", "zzh", "zzi"});
        }
        if (iOrdinal == 3) {
            return new zzijo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzijn(bArr);
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
        synchronized (zzijo.class) {
            zzidmVar = zzk;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzj);
                zzk = zzidmVar;
            }
        }
        return zzidmVar;
    }

    final /* synthetic */ void zze(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    final /* synthetic */ void zzg(boolean z) {
        this.zza |= 4;
        this.zzd = z;
    }
}

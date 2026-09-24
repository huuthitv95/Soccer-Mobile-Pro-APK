package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbdd extends zzidr implements zzifd {
    private static final zzbdd zzj;
    private static volatile zzifk zzk;
    private int zza;
    private long zzc;
    private long zzf;
    private int zzh;
    private int zzi;
    private zzicn zzb = zzicn.zza;
    private String zzd = "";
    private String zze = "";
    private String zzg = "";

    static {
        zzbdd zzbddVar = new zzbdd();
        zzj = zzbddVar;
        zzidr.zzbu(zzbdd.class, zzbddVar);
    }

    private zzbdd() {
    }

    public static zzbdc zza() {
        return (zzbdc) zzj.zzbn();
    }

    final /* synthetic */ void zzb(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zza |= 1;
        this.zzb = zzicnVar;
    }

    final /* synthetic */ void zzc(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    final /* synthetic */ void zzd(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzj, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iOrdinal == 3) {
            return new zzbdd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzbdc(bArr);
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
        synchronized (zzbdd.class) {
            zzidmVar = zzk;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzj);
                zzk = zzidmVar;
            }
        }
        return zzidmVar;
    }

    final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    final /* synthetic */ void zzg(long j) {
        this.zza |= 16;
        this.zzf = j;
    }

    final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzg = str;
    }

    final /* synthetic */ void zzj(int i) {
        this.zzh = 1;
        this.zza |= 64;
    }

    final /* synthetic */ void zzk(int i) {
        this.zzi = i - 2;
        this.zza |= 128;
    }
}

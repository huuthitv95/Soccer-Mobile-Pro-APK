package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbdp extends zzidr implements zzifd {
    private static final zzbdp zzg;
    private static volatile zzifk zzh;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private long zzd;
    private long zze;
    private long zzf;

    static {
        zzbdp zzbdpVar = new zzbdp();
        zzg = zzbdpVar;
        zzidr.zzbu(zzbdp.class, zzbdpVar);
    }

    private zzbdp() {
    }

    public static zzbdp zzg(zzicn zzicnVar) throws zzieg {
        return (zzbdp) zzidr.zzbS(zzg, zzicnVar);
    }

    public static zzbdp zzh(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzbdp) zzidr.zzbT(zzg, zzicnVar, zzidbVar);
    }

    public static zzbdo zzi() {
        return (zzbdo) zzg.zzbn();
    }

    public static zzbdp zzj() {
        return zzg;
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzc;
    }

    public final long zzc() {
        return this.zzd;
    }

    public final long zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzbdp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzbdo(bArr);
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
        synchronized (zzbdp.class) {
            zzidmVar = zzh;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzg);
                zzh = zzidmVar;
            }
        }
        return zzidmVar;
    }

    public final long zze() {
        return this.zzf;
    }

    final /* synthetic */ void zzk(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    final /* synthetic */ void zzl(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    final /* synthetic */ void zzm(long j) {
        this.zza |= 4;
        this.zzd = j;
    }

    final /* synthetic */ void zzn(long j) {
        this.zza |= 8;
        this.zze = j;
    }

    final /* synthetic */ void zzo(long j) {
        this.zza |= 16;
        this.zzf = j;
    }
}

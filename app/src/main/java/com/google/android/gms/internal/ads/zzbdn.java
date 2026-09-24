package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbdn extends zzidr implements zzifd {
    private static final zzbdn zzf;
    private static volatile zzifk zzg;
    private int zza;
    private zzbdr zzb;
    private zzicn zzc = zzicn.zza;
    private long zzd;
    private long zze;

    static {
        zzbdn zzbdnVar = new zzbdn();
        zzf = zzbdnVar;
        zzidr.zzbu(zzbdn.class, zzbdnVar);
    }

    private zzbdn() {
    }

    public static zzbdn zzd() {
        return zzf;
    }

    public final zzbdr zza() {
        zzbdr zzbdrVar = this.zzb;
        return zzbdrVar == null ? zzbdr.zzc() : zzbdrVar;
    }

    public final zzicn zzb() {
        return this.zzc;
    }

    public final long zzc() {
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
            return zzbv(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzbdn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzbdm(bArr);
        }
        if (iOrdinal == 5) {
            return zzf;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifk zzifkVar = zzg;
        if (zzifkVar != null) {
            return zzifkVar;
        }
        synchronized (zzbdn.class) {
            zzidmVar = zzg;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzf);
                zzg = zzidmVar;
            }
        }
        return zzidmVar;
    }
}

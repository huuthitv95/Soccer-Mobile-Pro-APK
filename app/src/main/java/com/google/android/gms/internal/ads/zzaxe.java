package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaxe extends zzidr implements zzifd {
    private static final zzaxe zzg;
    private static volatile zzifk zzh;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzb = 100;
    private long zze = 300;
    private long zzf = 1000;

    static {
        zzaxe zzaxeVar = new zzaxe();
        zzg = zzaxeVar;
        zzidr.zzbu(zzaxe.class, zzaxeVar);
    }

    private zzaxe() {
    }

    public static zzaxe zza() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzaxe();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzaxd(bArr);
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
        synchronized (zzaxe.class) {
            zzidmVar = zzh;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzg);
                zzh = zzidmVar;
            }
        }
        return zzidmVar;
    }
}

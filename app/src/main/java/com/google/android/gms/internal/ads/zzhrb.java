package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhrb extends zzidr implements zzifd {
    private static final zzhrb zzc;
    private static volatile zzifk zzd;
    private int zza;
    private int zzb;

    static {
        zzhrb zzhrbVar = new zzhrb();
        zzc = zzhrbVar;
        zzidr.zzbu(zzhrb.class, zzhrbVar);
    }

    private zzhrb() {
    }

    public static zzhrb zzc(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhrb) zzidr.zzbT(zzc, zzicnVar, zzidbVar);
    }

    public static zzhra zzd() {
        return (zzhra) zzc.zzbn();
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzb", "zza"});
        }
        if (iOrdinal == 3) {
            return new zzhrb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhra(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifk zzifkVar = zzd;
        if (zzifkVar != null) {
            return zzifkVar;
        }
        synchronized (zzhrb.class) {
            zzidmVar = zzd;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzc);
                zzd = zzidmVar;
            }
        }
        return zzidmVar;
    }

    final /* synthetic */ void zze(int i) {
        this.zza = i;
    }
}

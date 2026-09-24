package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhqt extends zzidr implements zzifd {
    private static final zzhqt zzb;
    private static volatile zzifk zzc;
    private int zza;

    static {
        zzhqt zzhqtVar = new zzhqt();
        zzb = zzhqtVar;
        zzidr.zzbu(zzhqt.class, zzhqtVar);
    }

    private zzhqt() {
    }

    public static zzhqs zzb() {
        return (zzhqs) zzb.zzbn();
    }

    public static zzhqt zzc() {
        return zzb;
    }

    public final int zza() {
        return this.zza;
    }

    final /* synthetic */ void zzd(int i) {
        this.zza = i;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzhqt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhqs(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifk zzifkVar = zzc;
        if (zzifkVar != null) {
            return zzifkVar;
        }
        synchronized (zzhqt.class) {
            zzidmVar = zzc;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzb);
                zzc = zzidmVar;
            }
        }
        return zzidmVar;
    }
}

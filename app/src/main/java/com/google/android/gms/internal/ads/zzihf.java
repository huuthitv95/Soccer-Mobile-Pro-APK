package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzihf extends zzidr implements zzifd {
    private static final zzihf zzd;
    private static volatile zzifk zze;
    private int zza;
    private String zzb = "";
    private zzidz zzc = zzbC();

    static {
        zzihf zzihfVar = new zzihf();
        zzd = zzihfVar;
        zzidr.zzbu(zzihf.class, zzihfVar);
    }

    private zzihf() {
    }

    public static zzihe zzc() {
        return (zzihe) zzd.zzbn();
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzd, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003'", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzihf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzihe(bArr);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifk zzifkVar = zze;
        if (zzifkVar != null) {
            return zzifkVar;
        }
        synchronized (zzihf.class) {
            zzidmVar = zze;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzd);
                zze = zzidmVar;
            }
        }
        return zzidmVar;
    }

    final /* synthetic */ void zze(int i) {
        this.zza = 15;
    }
}

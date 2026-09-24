package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzihn extends zzidr implements zzifd {
    private static final zzihn zzb;
    private static volatile zzifk zzc;
    private zzied zza = zzbM();

    static {
        zzihn zzihnVar = new zzihn();
        zzb = zzihnVar;
        zzidr.zzbu(zzihn.class, zzihnVar);
    }

    private zzihn() {
    }

    public static zzihm zzc() {
        return (zzihm) zzb.zzbn();
    }

    final /* synthetic */ void zzd(zzihl zzihlVar) {
        zzihlVar.getClass();
        zzied zziedVar = this.zza;
        if (!zziedVar.zza()) {
            this.zza = zzidr.zzbN(zziedVar);
        }
        this.zza.add(zzihlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zzihl.class});
        }
        if (iOrdinal == 3) {
            return new zzihn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzihm(bArr);
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
        synchronized (zzihn.class) {
            zzidmVar = zzc;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzb);
                zzc = zzidmVar;
            }
        }
        return zzidmVar;
    }
}

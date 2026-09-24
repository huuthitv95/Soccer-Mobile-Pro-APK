package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class zzhtd extends zzidr implements zzifd {
    public static final /* synthetic */ int zza = 0;
    private static final zzhtd zzd;
    private static volatile zzifk zze;
    private String zzb = "";
    private zzied zzc = zzbM();

    static {
        zzhtd zzhtdVar = new zzhtd();
        zzd = zzhtdVar;
        zzidr.zzbu(zzhtd.class, zzhtdVar);
    }

    private zzhtd() {
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzb", "zzc", zzhsk.class});
        }
        if (iOrdinal == 3) {
            return new zzhtd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhtc(bArr);
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
        synchronized (zzhtd.class) {
            zzidmVar = zze;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzd);
                zze = zzidmVar;
            }
        }
        return zzidmVar;
    }
}

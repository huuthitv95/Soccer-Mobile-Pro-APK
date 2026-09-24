package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhsw extends zzidr implements zzifd {
    private static final zzhsw zzb;
    private static volatile zzifk zzc;
    private String zza = "";

    static {
        zzhsw zzhswVar = new zzhsw();
        zzb = zzhswVar;
        zzidr.zzbu(zzhsw.class, zzhswVar);
    }

    private zzhsw() {
    }

    public static zzhsw zzb(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhsw) zzidr.zzbT(zzb, zzicnVar, zzidbVar);
    }

    public static zzhsv zzc() {
        return (zzhsv) zzb.zzbn();
    }

    public static zzhsw zzd() {
        return zzb;
    }

    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzhsw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhsv(bArr);
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
        synchronized (zzhsw.class) {
            zzidmVar = zzc;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzb);
                zzc = zzidmVar;
            }
        }
        return zzidmVar;
    }

    final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza = str;
    }
}

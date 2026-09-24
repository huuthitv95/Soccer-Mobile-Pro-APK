package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfxj extends zzidr implements zzifd {
    private static final zzfxj zzf;
    private static volatile zzifk zzg;
    private int zza;
    private zzidz zzb = zzbC();
    private String zzc = "";
    private String zzd = "";
    private String zze = "";

    static {
        zzfxj zzfxjVar = new zzfxj();
        zzf = zzfxjVar;
        zzidr.zzbu(zzfxj.class, zzfxjVar);
    }

    private zzfxj() {
    }

    public static zzfxi zza() {
        return (zzfxi) zzf.zzbn();
    }

    final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzc = str;
    }

    final /* synthetic */ void zzd(int i) {
        zzidz zzidzVar = this.zzb;
        if (!zzidzVar.zza()) {
            this.zzb = zzidr.zzbD(zzidzVar);
        }
        this.zzb.zzi(2);
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zza", "zzb", zzfxh.zza, "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzfxj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfxi(bArr);
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
        synchronized (zzfxj.class) {
            zzidmVar = zzg;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzf);
                zzg = zzidmVar;
            }
        }
        return zzidmVar;
    }
}

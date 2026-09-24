package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhta extends zzidr implements zzifd {
    private static final zzhta zzd;
    private static volatile zzifk zze;
    private int zza;
    private String zzb = "";
    private zzhsi zzc;

    static {
        zzhta zzhtaVar = new zzhta();
        zzd = zzhtaVar;
        zzidr.zzbu(zzhta.class, zzhtaVar);
    }

    private zzhta() {
    }

    public static zzhta zzc(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhta) zzidr.zzbT(zzd, zzicnVar, zzidbVar);
    }

    public static zzhsz zzd() {
        return (zzhsz) zzd.zzbn();
    }

    public static zzhta zze() {
        return zzd;
    }

    public final String zza() {
        return this.zzb;
    }

    public final zzhsi zzb() {
        zzhsi zzhsiVar = this.zzc;
        return zzhsiVar == null ? zzhsi.zzh() : zzhsiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhta();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhsz(bArr);
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
        synchronized (zzhta.class) {
            zzidmVar = zze;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzd);
                zze = zzidmVar;
            }
        }
        return zzidmVar;
    }

    final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zzb = str;
    }

    final /* synthetic */ void zzh(zzhsi zzhsiVar) {
        zzhsiVar.getClass();
        this.zzc = zzhsiVar;
        this.zza |= 1;
    }
}

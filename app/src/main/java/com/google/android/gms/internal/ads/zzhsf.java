package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhsf extends zzidr implements zzifd {
    private static final zzhsf zzd;
    private static volatile zzifk zze;
    private String zza = "";
    private zzicn zzb = zzicn.zza;
    private int zzc;

    static {
        zzhsf zzhsfVar = new zzhsf();
        zzd = zzhsfVar;
        zzidr.zzbu(zzhsf.class, zzhsfVar);
    }

    private zzhsf() {
    }

    public static zzhsd zzd() {
        return (zzhsd) zzd.zzbn();
    }

    public static zzhsf zze() {
        return zzd;
    }

    public final String zza() {
        return this.zza;
    }

    public final zzicn zzb() {
        return this.zzb;
    }

    public final zzhse zzc() {
        zzhse zzhseVar;
        int i = this.zzc;
        if (i == 0) {
            zzhseVar = zzhse.UNKNOWN_KEYMATERIAL;
        } else if (i == 1) {
            zzhseVar = zzhse.SYMMETRIC;
        } else if (i == 2) {
            zzhseVar = zzhse.ASYMMETRIC_PRIVATE;
        } else if (i != 3) {
            zzhseVar = i != 4 ? null : zzhse.REMOTE;
        } else {
            zzhseVar = zzhse.ASYMMETRIC_PUBLIC;
        }
        return zzhseVar == null ? zzhse.UNRECOGNIZED : zzhseVar;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhsf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhsd(bArr);
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
        synchronized (zzhsf.class) {
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
        this.zza = str;
    }

    final /* synthetic */ void zzh(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zzb = zzicnVar;
    }

    final /* synthetic */ void zzi(zzhse zzhseVar) {
        this.zzc = zzhseVar.zza();
    }
}

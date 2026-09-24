package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgfd extends zzidr implements zzifd {
    private static final zzgfd zzf;
    private static volatile zzifk zzg;
    private int zza;
    private Object zzc;
    private int zzd;
    private int zzb = 0;
    private zzidz zze = zzbC();

    static {
        zzgfd zzgfdVar = new zzgfd();
        zzf = zzgfdVar;
        zzidr.zzbu(zzgfd.class, zzgfdVar);
    }

    private zzgfd() {
    }

    public static zzgfd zzd(zzicn zzicnVar) throws zzieg {
        return (zzgfd) zzidr.zzbS(zzf, zzicnVar);
    }

    public static zzgfc zze() {
        return (zzgfc) zzf.zzbn();
    }

    public static zzgfd zzg() {
        return zzf;
    }

    public final zzbdp zza() {
        return this.zzb == 1 ? (zzbdp) this.zzc : zzbdp.zzj();
    }

    public final zzbdn zzb() {
        return this.zzb == 2 ? (zzbdn) this.zzc : zzbdn.zzd();
    }

    public final zzbdh zzc() {
        zzbdh zzbdhVarZzb = zzbdh.zzb(this.zzd);
        return zzbdhVarZzb == null ? zzbdh.UNSUPPORTED : zzbdhVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzf, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003᠌\u0000\u0004'", new Object[]{"zzc", "zzb", "zza", zzbdp.class, zzbdn.class, "zzd", zzbdh.zzc(), "zze"});
        }
        if (iOrdinal == 3) {
            return new zzgfd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzgfc(bArr);
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
        synchronized (zzgfd.class) {
            zzidmVar = zzg;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzf);
                zzg = zzidmVar;
            }
        }
        return zzidmVar;
    }

    final /* synthetic */ void zzh(zzbdp zzbdpVar) {
        zzbdpVar.getClass();
        this.zzc = zzbdpVar;
        this.zzb = 1;
    }

    final /* synthetic */ void zzi(zzbdn zzbdnVar) {
        zzbdnVar.getClass();
        this.zzc = zzbdnVar;
        this.zzb = 2;
    }

    final /* synthetic */ void zzj(zzbdh zzbdhVar) {
        this.zzd = zzbdhVar.zza();
        this.zza |= 1;
    }

    final /* synthetic */ void zzk(Iterable iterable) {
        zzidz zzidzVar = this.zze;
        if (!zzidzVar.zza()) {
            this.zze = zzidr.zzbD(zzidzVar);
        }
        zzibw.zzaW(iterable, this.zze);
    }
}

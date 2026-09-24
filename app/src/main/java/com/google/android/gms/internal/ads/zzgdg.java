package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgdg extends zzidr implements zzifd {
    private static final zzgdg zzf;
    private static volatile zzifk zzg;
    private int zza;
    private float zzc;
    private String zzb = "https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1";
    private long zzd = 1000;
    private long zze = 60000;

    static {
        zzgdg zzgdgVar = new zzgdg();
        zzf = zzgdgVar;
        zzidr.zzbu(zzgdg.class, zzgdgVar);
    }

    private zzgdg() {
    }

    public static zzgdf zze() {
        return (zzgdf) zzf.zzbn();
    }

    public static zzgdg zzg() {
        return zzf;
    }

    public final String zza() {
        return this.zzb;
    }

    public final float zzb() {
        return this.zzc;
    }

    public final long zzc() {
        return this.zzd;
    }

    public final long zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzgdg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzgdf(bArr);
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
        synchronized (zzgdg.class) {
            zzidmVar = zzg;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzf);
                zzg = zzidmVar;
            }
        }
        return zzidmVar;
    }

    final /* synthetic */ void zzh(float f) {
        this.zza |= 2;
        this.zzc = f;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzawh extends zzidr implements zzifd {
    private static final zzawh zzj;
    private static volatile zzifk zzk;
    private int zza;
    private int zzb;
    private boolean zze;
    private zzawy zzg;
    private zzaxe zzh;
    private boolean zzi;
    private boolean zzc = true;
    private String zzd = "unknown_host";
    private boolean zzf = true;

    static {
        zzawh zzawhVar = new zzawh();
        zzj = zzawhVar;
        zzidr.zzbu(zzawh.class, zzawhVar);
    }

    private zzawh() {
    }

    public static zzawg zze() {
        return (zzawg) zzj.zzbn();
    }

    public final String zza() {
        return this.zzd;
    }

    @Deprecated
    public final boolean zzb() {
        return this.zze;
    }

    public final zzawy zzc() {
        zzawy zzawyVar = this.zzg;
        return zzawyVar == null ? zzawy.zzd() : zzawyVar;
    }

    public final zzaxe zzd() {
        zzaxe zzaxeVar = this.zzh;
        return zzaxeVar == null ? zzaxe.zza() : zzaxeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzj, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zza", "zzb", zzawk.zza, "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iOrdinal == 3) {
            return new zzawh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzawg(bArr);
        }
        if (iOrdinal == 5) {
            return zzj;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifk zzifkVar = zzk;
        if (zzifkVar != null) {
            return zzifkVar;
        }
        synchronized (zzawh.class) {
            zzidmVar = zzk;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzj);
                zzk = zzidmVar;
            }
        }
        return zzidmVar;
    }

    final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    final /* synthetic */ void zzh(boolean z) {
        this.zza |= 8;
        this.zze = z;
    }
}

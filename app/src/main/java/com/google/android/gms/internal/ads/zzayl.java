package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzayl extends zzidr implements zzifd {
    private static final zzayl zzf;
    private static volatile zzifk zzg;
    private int zza;
    private zzicn zzb;
    private zzicn zzc;
    private zzicn zzd;
    private zzicn zze;

    static {
        zzayl zzaylVar = new zzayl();
        zzf = zzaylVar;
        zzidr.zzbu(zzayl.class, zzaylVar);
    }

    private zzayl() {
        zzicn zzicnVar = zzicn.zza;
        this.zzb = zzicnVar;
        this.zzc = zzicnVar;
        this.zzd = zzicnVar;
        this.zze = zzicnVar;
    }

    public static zzayl zze(byte[] bArr, zzidb zzidbVar) throws zzieg {
        return (zzayl) zzidr.zzbV(zzf, bArr, zzidbVar);
    }

    public static zzayk zzg() {
        return (zzayk) zzf.zzbn();
    }

    public final zzicn zza() {
        return this.zzb;
    }

    public final zzicn zzb() {
        return this.zzc;
    }

    public final zzicn zzc() {
        return this.zzd;
    }

    public final zzicn zzd() {
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
            return zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzayl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzayk(bArr);
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
        synchronized (zzayl.class) {
            zzidmVar = zzg;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzf);
                zzg = zzidmVar;
            }
        }
        return zzidmVar;
    }

    final /* synthetic */ void zzh(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zza |= 1;
        this.zzb = zzicnVar;
    }

    final /* synthetic */ void zzi(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zza |= 2;
        this.zzc = zzicnVar;
    }

    final /* synthetic */ void zzj(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zza |= 4;
        this.zzd = zzicnVar;
    }

    final /* synthetic */ void zzk(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zza |= 8;
        this.zze = zzicnVar;
    }
}

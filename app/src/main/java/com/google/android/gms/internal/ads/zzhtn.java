package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhtn extends zzidr implements zzifd {
    private static final zzhtn zze;
    private static volatile zzifk zzf;
    private int zza;
    private zzhtp zzb;
    private int zzc;
    private zzicn zzd = zzicn.zza;

    static {
        zzhtn zzhtnVar = new zzhtn();
        zze = zzhtnVar;
        zzidr.zzbu(zzhtn.class, zzhtnVar);
    }

    private zzhtn() {
    }

    public static zzhtn zzd(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhtn) zzidr.zzbT(zze, zzicnVar, zzidbVar);
    }

    public static zzhtm zze() {
        return (zzhtm) zze.zzbn();
    }

    public final zzhtp zza() {
        zzhtp zzhtpVar = this.zzb;
        return zzhtpVar == null ? zzhtp.zze() : zzhtpVar;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final zzicn zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhtn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhtm(bArr);
        }
        if (iOrdinal == 5) {
            return zze;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifk zzifkVar = zzf;
        if (zzifkVar != null) {
            return zzifkVar;
        }
        synchronized (zzhtn.class) {
            zzidmVar = zzf;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zze);
                zzf = zzidmVar;
            }
        }
        return zzidmVar;
    }

    final /* synthetic */ void zzg(zzhtp zzhtpVar) {
        zzhtpVar.getClass();
        this.zzb = zzhtpVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzh(int i) {
        this.zzc = i;
    }

    final /* synthetic */ void zzi(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zzd = zzicnVar;
    }
}

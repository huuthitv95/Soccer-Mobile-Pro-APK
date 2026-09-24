package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhtv extends zzidr implements zzifd {
    private static final zzhtv zze;
    private static volatile zzifk zzf;
    private int zza;
    private int zzb;
    private zzhtz zzc;
    private zzicn zzd = zzicn.zza;

    static {
        zzhtv zzhtvVar = new zzhtv();
        zze = zzhtvVar;
        zzidr.zzbu(zzhtv.class, zzhtvVar);
    }

    private zzhtv() {
    }

    public static zzhtv zzd(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhtv) zzidr.zzbT(zze, zzicnVar, zzidbVar);
    }

    public static zzhtu zze() {
        return (zzhtu) zze.zzbn();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhtz zzb() {
        zzhtz zzhtzVar = this.zzc;
        return zzhtzVar == null ? zzhtz.zzc() : zzhtzVar;
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
            return zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhtv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhtu(bArr);
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
        synchronized (zzhtv.class) {
            zzidmVar = zzf;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zze);
                zzf = zzidmVar;
            }
        }
        return zzidmVar;
    }

    final /* synthetic */ void zzg(zzhtz zzhtzVar) {
        zzhtzVar.getClass();
        this.zzc = zzhtzVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzh(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zzd = zzicnVar;
    }
}

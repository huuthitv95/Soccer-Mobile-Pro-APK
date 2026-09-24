package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhsy extends zzidr implements zzifd {
    private static final zzhsy zzd;
    private static volatile zzifk zze;
    private int zza;
    private int zzb;
    private zzhta zzc;

    static {
        zzhsy zzhsyVar = new zzhsy();
        zzd = zzhsyVar;
        zzidr.zzbu(zzhsy.class, zzhsyVar);
    }

    private zzhsy() {
    }

    public static zzhsy zzc(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhsy) zzidr.zzbT(zzd, zzicnVar, zzidbVar);
    }

    public static zzhsx zzd() {
        return (zzhsx) zzd.zzbn();
    }

    public static zzifk zze() {
        return zzd.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhta zzb() {
        zzhta zzhtaVar = this.zzc;
        return zzhtaVar == null ? zzhta.zze() : zzhtaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhsy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhsx(bArr);
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
        synchronized (zzhsy.class) {
            zzidmVar = zze;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzd);
                zze = zzidmVar;
            }
        }
        return zzidmVar;
    }

    final /* synthetic */ void zzg(zzhta zzhtaVar) {
        zzhtaVar.getClass();
        this.zzc = zzhtaVar;
        this.zza |= 1;
    }
}

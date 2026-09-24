package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhql extends zzidr implements zzifd {
    private static final zzhql zzd;
    private static volatile zzifk zze;
    private int zza;
    private zzhqn zzb;
    private int zzc;

    static {
        zzhql zzhqlVar = new zzhql();
        zzd = zzhqlVar;
        zzidr.zzbu(zzhql.class, zzhqlVar);
    }

    private zzhql() {
    }

    public static zzhqk zzc() {
        return (zzhqk) zzd.zzbn();
    }

    public static zzhql zzd() {
        return zzd;
    }

    public final zzhqn zza() {
        zzhqn zzhqnVar = this.zzb;
        return zzhqnVar == null ? zzhqn.zzc() : zzhqnVar;
    }

    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhql();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhqk(bArr);
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
        synchronized (zzhql.class) {
            zzidmVar = zze;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzd);
                zze = zzidmVar;
            }
        }
        return zzidmVar;
    }

    final /* synthetic */ void zze(zzhqn zzhqnVar) {
        zzhqnVar.getClass();
        this.zzb = zzhqnVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzg(int i) {
        this.zzc = i;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhsn extends zzidr implements zzifd {
    private static final zzhsn zzf;
    private static volatile zzifk zzg;
    private int zza;
    private zzhsf zzb;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        zzhsn zzhsnVar = new zzhsn();
        zzf = zzhsnVar;
        zzidr.zzbu(zzhsn.class, zzhsnVar);
    }

    private zzhsn() {
    }

    public static zzhsm zze() {
        return (zzhsm) zzf.zzbn();
    }

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final zzhsf zzb() {
        zzhsf zzhsfVar = this.zzb;
        return zzhsfVar == null ? zzhsf.zze() : zzhsfVar;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzhtb zzd() {
        zzhtb zzhtbVarZzb = zzhtb.zzb(this.zze);
        return zzhtbVarZzb == null ? zzhtb.UNRECOGNIZED : zzhtbVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzhsn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhsm(bArr);
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
        synchronized (zzhsn.class) {
            zzidmVar = zzg;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzf);
                zzg = zzidmVar;
            }
        }
        return zzidmVar;
    }

    final /* synthetic */ void zzg(zzhsf zzhsfVar) {
        zzhsfVar.getClass();
        this.zzb = zzhsfVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzh(int i) {
        this.zzd = i;
    }

    final /* synthetic */ void zzi(zzhtb zzhtbVar) {
        this.zze = zzhtbVar.zza();
    }

    public final int zzk() {
        int i = this.zzc;
        int i2 = 2;
        if (i != 0) {
            if (i == 1) {
                i2 = 3;
            } else if (i != 2) {
                i2 = i != 3 ? 0 : 5;
            } else {
                i2 = 4;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    final /* synthetic */ void zzl(int i) {
        this.zzc = zzhsg.zza(i);
    }
}

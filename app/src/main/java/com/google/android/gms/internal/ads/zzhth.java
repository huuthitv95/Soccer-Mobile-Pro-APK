package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhth extends zzidr implements zzifd {
    private static final zzhth zzb;
    private static volatile zzifk zzc;
    private int zza;

    static {
        zzhth zzhthVar = new zzhth();
        zzb = zzhthVar;
        zzidr.zzbu(zzhth.class, zzhthVar);
    }

    private zzhth() {
    }

    public static zzhtg zzb() {
        return (zzhtg) zzb.zzbn();
    }

    public static zzhth zzc() {
        return zzb;
    }

    public final zzhrw zza() {
        zzhrw zzhrwVarZzb = zzhrw.zzb(this.zza);
        return zzhrwVarZzb == null ? zzhrw.UNRECOGNIZED : zzhrwVarZzb;
    }

    final /* synthetic */ void zzd(zzhrw zzhrwVar) {
        this.zza = zzhrwVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzhth();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhtg(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifk zzifkVar = zzc;
        if (zzifkVar != null) {
            return zzifkVar;
        }
        synchronized (zzhth.class) {
            zzidmVar = zzc;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzb);
                zzc = zzidmVar;
            }
        }
        return zzidmVar;
    }
}

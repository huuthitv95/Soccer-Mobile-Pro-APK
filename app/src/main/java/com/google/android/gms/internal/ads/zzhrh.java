package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhrh extends zzidr implements zzifd {
    private static final zzhrh zzd;
    private static volatile zzifk zze;
    private int zza;
    private zzhrj zzb;
    private int zzc;

    static {
        zzhrh zzhrhVar = new zzhrh();
        zzd = zzhrhVar;
        zzidr.zzbu(zzhrh.class, zzhrhVar);
    }

    private zzhrh() {
    }

    public static zzhrh zzb(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhrh) zzidr.zzbT(zzd, zzicnVar, zzidbVar);
    }

    public static zzhrg zzc() {
        return (zzhrg) zzd.zzbn();
    }

    public final zzhrj zza() {
        zzhrj zzhrjVar = this.zzb;
        return zzhrjVar == null ? zzhrj.zzc() : zzhrjVar;
    }

    final /* synthetic */ void zzd(zzhrj zzhrjVar) {
        zzhrjVar.getClass();
        this.zzb = zzhrjVar;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhrh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhrg(bArr);
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
        synchronized (zzhrh.class) {
            zzidmVar = zze;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzd);
                zze = zzidmVar;
            }
        }
        return zzidmVar;
    }
}

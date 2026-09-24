package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfqc extends zzidr implements zzifd {
    private static final zzfqc zzd;
    private static volatile zzifk zze;
    private int zza;
    private zzied zzb = zzbM();
    private zzihf zzc;

    static {
        zzfqc zzfqcVar = new zzfqc();
        zzd = zzfqcVar;
        zzidr.zzbu(zzfqc.class, zzfqcVar);
    }

    private zzfqc() {
    }

    public static zzfpz zzb() {
        return (zzfpz) zzd.zzbn();
    }

    public final int zza() {
        return this.zzb.size();
    }

    final /* synthetic */ void zzc(zzfqb zzfqbVar) {
        zzfqbVar.getClass();
        zzied zziedVar = this.zzb;
        if (!zziedVar.zza()) {
            this.zzb = zzidr.zzbN(zziedVar);
        }
        this.zzb.add(zzfqbVar);
    }

    final /* synthetic */ void zzd() {
        this.zzb = zzbM();
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zzb", zzfqb.class, "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzfqc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfpz(bArr);
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
        synchronized (zzfqc.class) {
            zzidmVar = zze;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzd);
                zze = zzidmVar;
            }
        }
        return zzidmVar;
    }
}

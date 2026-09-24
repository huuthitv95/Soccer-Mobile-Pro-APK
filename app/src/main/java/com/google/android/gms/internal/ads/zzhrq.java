package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhrq extends zzidr implements zzifd {
    private static final zzhrq zzb;
    private static volatile zzifk zzc;
    private int zza;

    static {
        zzhrq zzhrqVar = new zzhrq();
        zzb = zzhrqVar;
        zzidr.zzbu(zzhrq.class, zzhrqVar);
    }

    private zzhrq() {
    }

    public static zzhrq zzb(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhrq) zzidr.zzbT(zzb, zzicnVar, zzidbVar);
    }

    public static zzhrq zzc() {
        return zzb;
    }

    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzhrq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhrp(bArr);
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
        synchronized (zzhrq.class) {
            zzidmVar = zzc;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzb);
                zzc = zzidmVar;
            }
        }
        return zzidmVar;
    }
}

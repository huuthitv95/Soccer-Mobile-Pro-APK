package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzget extends zzidr implements zzifd {
    private static final zzget zzc;
    private static volatile zzifk zzd;
    private int zza;
    private zzawj zzb;

    static {
        zzget zzgetVar = new zzget();
        zzc = zzgetVar;
        zzidr.zzbu(zzget.class, zzgetVar);
    }

    private zzget() {
    }

    public static zzges zza() {
        return (zzges) zzc.zzbn();
    }

    final /* synthetic */ void zzb(zzawj zzawjVar) {
        zzawjVar.getClass();
        this.zzb = zzawjVar;
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
            return zzbv(zzc, "\u0004\u0001\u0000\u0001\u0012\u0012\u0001\u0000\u0000\u0000\u0012ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzget();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzges(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifk zzifkVar = zzd;
        if (zzifkVar != null) {
            return zzifkVar;
        }
        synchronized (zzget.class) {
            zzidmVar = zzd;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzc);
                zzd = zzidmVar;
            }
        }
        return zzidmVar;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfqn extends zzidr implements zzifd {
    private static final zzfqn zzb;
    private static volatile zzifk zzc;
    private boolean zza;

    static {
        zzfqn zzfqnVar = new zzfqn();
        zzb = zzfqnVar;
        zzidr.zzbu(zzfqn.class, zzfqnVar);
    }

    private zzfqn() {
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzfqn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfqm(bArr);
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
        synchronized (zzfqn.class) {
            zzidmVar = zzc;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzb);
                zzc = zzidmVar;
            }
        }
        return zzidmVar;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfqp extends zzidr implements zzifd {
    private static final zzfqp zzc;
    private static volatile zzifk zzd;
    private zzied zza = zzbM();
    private long zzb;

    static {
        zzfqp zzfqpVar = new zzfqp();
        zzc = zzfqpVar;
        zzidr.zzbu(zzfqp.class, zzfqpVar);
    }

    private zzfqp() {
    }

    public static zzfqo zza() {
        return (zzfqo) zzc.zzbn();
    }

    final /* synthetic */ void zzb(zzfph zzfphVar) {
        zzfphVar.getClass();
        zzied zziedVar = this.zza;
        if (!zziedVar.zza()) {
            this.zza = zzidr.zzbN(zziedVar);
        }
        this.zza.add(zzfphVar);
    }

    final /* synthetic */ void zzc(long j) {
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"zza", zzfph.class, "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzfqp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfqo(bArr);
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
        synchronized (zzfqp.class) {
            zzidmVar = zzd;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzc);
                zzd = zzidmVar;
            }
        }
        return zzidmVar;
    }
}

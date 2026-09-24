package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfqg extends zzidr implements zzifd {
    private static final zzfqg zzi;
    private static volatile zzifk zzj;
    private long zzb;
    private long zzc;
    private boolean zzd;
    private long zze;
    private long zzf;
    private int zzh;
    private String zza = "";
    private String zzg = "";

    static {
        zzfqg zzfqgVar = new zzfqg();
        zzi = zzfqgVar;
        zzidr.zzbu(zzfqg.class, zzfqgVar);
    }

    private zzfqg() {
    }

    public static zzfqf zza() {
        return (zzfqf) zzi.zzbn();
    }

    final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza = str;
    }

    final /* synthetic */ void zzc(long j) {
        this.zzb = j;
    }

    final /* synthetic */ void zzd(long j) {
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzi, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0007\u0005\u0002\u0006\u0002\u0007Ȉ\b\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (iOrdinal == 3) {
            return new zzfqg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfqf(bArr);
        }
        if (iOrdinal == 5) {
            return zzi;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifk zzifkVar = zzj;
        if (zzifkVar != null) {
            return zzifkVar;
        }
        synchronized (zzfqg.class) {
            zzidmVar = zzj;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzi);
                zzj = zzidmVar;
            }
        }
        return zzidmVar;
    }

    final /* synthetic */ void zze(boolean z) {
        this.zzd = z;
    }

    final /* synthetic */ void zzg(long j) {
        this.zze = j;
    }

    final /* synthetic */ void zzh(long j) {
        this.zzf = j;
    }

    final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zzg = str;
    }

    final /* synthetic */ void zzk(int i) {
        this.zzh = i - 2;
    }
}

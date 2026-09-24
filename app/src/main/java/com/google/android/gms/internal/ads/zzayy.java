package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzayy extends zzidr implements zzifd {
    private static final zzayy zzf;
    private static volatile zzifk zzg;
    private int zza;
    private zzied zzb = zzbM();
    private zzicn zzc = zzicn.zza;
    private int zzd = 1;
    private int zze = 1;

    static {
        zzayy zzayyVar = new zzayy();
        zzf = zzayyVar;
        zzidr.zzbu(zzayy.class, zzayyVar);
    }

    private zzayy() {
    }

    public static zzayx zza() {
        return (zzayx) zzf.zzbn();
    }

    final /* synthetic */ void zzb(zzicn zzicnVar) {
        zzicnVar.getClass();
        zzied zziedVar = this.zzb;
        if (!zziedVar.zza()) {
            this.zzb = zzidr.zzbN(zziedVar);
        }
        this.zzb.add(zzicnVar);
    }

    final /* synthetic */ void zzc(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zza |= 1;
        this.zzc = zzicnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zza", "zzb", "zzc", "zzd", zzays.zza, "zze", zzayo.zza});
        }
        if (iOrdinal == 3) {
            return new zzayy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzayx(bArr);
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
        synchronized (zzayy.class) {
            zzidmVar = zzg;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzf);
                zzg = zzidmVar;
            }
        }
        return zzidmVar;
    }

    final /* synthetic */ void zze(int i) {
        this.zzd = 4;
        this.zza |= 2;
    }

    final /* synthetic */ void zzg(int i) {
        this.zze = i - 1;
        this.zza |= 4;
    }
}

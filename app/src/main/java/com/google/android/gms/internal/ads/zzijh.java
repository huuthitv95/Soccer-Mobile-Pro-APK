package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzijh extends zzidr implements zzifd {
    private static final zzijh zzf;
    private static volatile zzifk zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private zzicn zzd;
    private zzicn zze;

    static {
        zzijh zzijhVar = new zzijh();
        zzf = zzijhVar;
        zzidr.zzbu(zzijh.class, zzijhVar);
    }

    private zzijh() {
        zzicn zzicnVar = zzicn.zza;
        this.zzd = zzicnVar;
        this.zze = zzicnVar;
    }

    public static zzijf zzc() {
        return (zzijf) zzf.zzbn();
    }

    final /* synthetic */ void zzd(String str) {
        this.zza |= 2;
        this.zzc = MimeTypes.IMAGE_PNG;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", zzijg.zza, "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzijh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzijf(bArr);
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
        synchronized (zzijh.class) {
            zzidmVar = zzg;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzf);
                zzg = zzidmVar;
            }
        }
        return zzidmVar;
    }

    final /* synthetic */ void zze(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zza |= 4;
        this.zzd = zzicnVar;
    }

    final /* synthetic */ void zzh(int i) {
        this.zzb = 1;
        this.zza = 1 | this.zza;
    }
}

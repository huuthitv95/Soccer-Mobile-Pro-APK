package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zziir extends zzidr implements zzifd {
    private static final zziir zzi;
    private static volatile zzifk zzj;
    private int zza;
    private zziiq zzb;
    private zzicn zzd;
    private zzicn zze;
    private int zzf;
    private zzicn zzg;
    private byte zzh = 2;
    private zzied zzc = zzbM();

    static {
        zziir zziirVar = new zziir();
        zzi = zziirVar;
        zzidr.zzbu(zziir.class, zziirVar);
    }

    private zziir() {
        zzicn zzicnVar = zzicn.zza;
        this.zzd = zzicnVar;
        this.zze = zzicnVar;
        this.zzg = zzicnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        byte[] bArr = null;
        switch (zzidqVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzh);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzh = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbv(zzi, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zza", "zzb", "zzc", zziij.class, "zzd", "zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new zziir();
            case NEW_BUILDER:
                return new zziio(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzi;
            case GET_PARSER:
                zzifk zzifkVar = zzj;
                if (zzifkVar != null) {
                    return zzifkVar;
                }
                synchronized (zziir.class) {
                    zzidmVar = zzj;
                    if (zzidmVar == null) {
                        zzidmVar = new zzidm(zzi);
                        zzj = zzidmVar;
                    }
                    break;
                }
                return zzidmVar;
            default:
                throw null;
        }
    }
}

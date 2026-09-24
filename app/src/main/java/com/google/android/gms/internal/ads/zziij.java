package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zziij extends zzidr implements zzifd {
    private static final zziij zze;
    private static volatile zzifk zzf;
    private int zza;
    private zzicn zzb;
    private zzicn zzc;
    private byte zzd = 2;

    static {
        zziij zziijVar = new zziij();
        zze = zziijVar;
        zzidr.zzbu(zziij.class, zziijVar);
    }

    private zziij() {
        zzicn zzicnVar = zzicn.zza;
        this.zzb = zzicnVar;
        this.zzc = zzicnVar;
    }

    public static zziii zzc() {
        return (zziii) zze.zzbn();
    }

    final /* synthetic */ void zzd(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zza |= 1;
        this.zzb = zzicnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        byte[] bArr = null;
        switch (zzidqVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzd);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzd = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbv(zze, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new zziij();
            case NEW_BUILDER:
                return new zziii(bArr);
            case GET_DEFAULT_INSTANCE:
                return zze;
            case GET_PARSER:
                zzifk zzifkVar = zzf;
                if (zzifkVar != null) {
                    return zzifkVar;
                }
                synchronized (zziij.class) {
                    zzidmVar = zzf;
                    if (zzidmVar == null) {
                        zzidmVar = new zzidm(zze);
                        zzf = zzidmVar;
                    }
                    break;
                }
                return zzidmVar;
            default:
                throw null;
        }
    }

    final /* synthetic */ void zze(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zza |= 2;
        this.zzc = zzicnVar;
    }
}

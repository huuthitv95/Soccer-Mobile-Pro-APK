package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zziin extends zzidr implements zzifd {
    private static final zziin zzh;
    private static volatile zzifk zzi;
    private int zza;
    private zziim zzb;
    private zzicn zzd;
    private zzicn zze;
    private int zzf;
    private byte zzg = 2;
    private zzied zzc = zzbM();

    static {
        zziin zziinVar = new zziin();
        zzh = zziinVar;
        zzidr.zzbu(zziin.class, zziinVar);
    }

    private zziin() {
        zzicn zzicnVar = zzicn.zza;
        this.zzd = zzicnVar;
        this.zze = zzicnVar;
    }

    public static zziik zzc() {
        return (zziik) zzh.zzbn();
    }

    final /* synthetic */ void zzd(zziij zziijVar) {
        zziijVar.getClass();
        zzied zziedVar = this.zzc;
        if (!zziedVar.zza()) {
            this.zzc = zzidr.zzbN(zziedVar);
        }
        this.zzc.add(zziijVar);
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        byte[] bArr = null;
        switch (zzidqVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzg);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzg = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbv(zzh, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zza", "zzb", "zzc", zziij.class, "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zziin();
            case NEW_BUILDER:
                return new zziik(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzh;
            case GET_PARSER:
                zzifk zzifkVar = zzi;
                if (zzifkVar != null) {
                    return zzifkVar;
                }
                synchronized (zziin.class) {
                    zzidmVar = zzi;
                    if (zzidmVar == null) {
                        zzidmVar = new zzidm(zzh);
                        zzi = zzidmVar;
                    }
                    break;
                }
                return zzidmVar;
            default:
                throw null;
        }
    }
}

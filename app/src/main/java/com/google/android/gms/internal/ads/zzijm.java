package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzijm extends zzidr implements zzifd {
    private static final zzijm zzl;
    private static volatile zzifk zzm;
    private int zza;
    private int zzb;
    private zziin zzd;
    private zziir zze;
    private int zzf;
    private int zzi;
    private byte zzk = 2;
    private String zzc = "";
    private zzidz zzg = zzbC();
    private String zzh = "";
    private zzied zzj = zzidr.zzbM();

    static {
        zzijm zzijmVar = new zzijm();
        zzl = zzijmVar;
        zzidr.zzbu(zzijm.class, zzijmVar);
    }

    private zzijm() {
    }

    public static zzijl zze() {
        return (zzijl) zzl.zzbn();
    }

    public final String zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zzj.size();
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        byte[] bArr = null;
        switch (zzidqVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzk);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzk = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbv(zzl, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", zzijj.zza, "zzj"});
            case NEW_MUTABLE_INSTANCE:
                return new zzijm();
            case NEW_BUILDER:
                return new zzijl(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzl;
            case GET_PARSER:
                zzifk zzifkVar = zzm;
                if (zzifkVar != null) {
                    return zzifkVar;
                }
                synchronized (zzijm.class) {
                    zzidmVar = zzm;
                    if (zzidmVar == null) {
                        zzidmVar = new zzidm(zzl);
                        zzm = zzidmVar;
                    }
                    break;
                }
                return zzidmVar;
            default:
                throw null;
        }
    }

    final /* synthetic */ void zzg(int i) {
        this.zza |= 1;
        this.zzb = i;
    }

    final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    final /* synthetic */ void zzi(zziin zziinVar) {
        zziinVar.getClass();
        this.zzd = zziinVar;
        this.zza |= 4;
    }

    final /* synthetic */ void zzj(String str) {
        str.getClass();
        zzied zziedVar = this.zzj;
        if (!zziedVar.zza()) {
            this.zzj = zzidr.zzbN(zziedVar);
        }
        this.zzj.add(str);
    }

    final /* synthetic */ void zzl(int i) {
        this.zzi = i - 1;
        this.zza |= 64;
    }
}

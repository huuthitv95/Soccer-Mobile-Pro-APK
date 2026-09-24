package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzikb extends zzidr implements zzifd {
    private static final zzikb zzR;
    private static volatile zzifk zzS;
    private zzijx zzA;
    private zziid zzC;
    private zzihv zzE;
    private zziiw zzG;
    private int zzH;
    private long zzK;
    private zzika zzL;
    private zzijb zzM;
    private zziju zzO;
    private int zza;
    private int zzb;
    private int zzc;
    private zzihz zzg;
    private zzijh zzk;
    private boolean zzl;
    private boolean zzo;
    private boolean zzp;
    private zzijo zzv;
    private boolean zzw;
    private byte zzQ = 2;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private zzied zzh = zzbM();
    private zzied zzi = zzbM();
    private String zzj = "";
    private zzied zzm = zzidr.zzbM();
    private String zzn = "";
    private zzicn zzu = zzicn.zza;
    private String zzx = "";
    private zzied zzy = zzidr.zzbM();
    private zzied zzz = zzidr.zzbM();
    private zzied zzB = zzbM();
    private String zzD = "";
    private zzied zzF = zzbM();
    private zzied zzI = zzbM();
    private zzied zzJ = zzbM();
    private String zzN = "";
    private zzied zzP = zzbM();

    static {
        zzikb zzikbVar = new zzikb();
        zzR = zzikbVar;
        zzidr.zzbu(zzikb.class, zzikbVar);
    }

    private zzikb() {
    }

    public static zzihx zzg() {
        return (zzihx) zzR.zzbn();
    }

    public final String zzc() {
        return this.zzd;
    }

    public final List zzd() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        byte[] bArr = null;
        switch (zzidqVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzQ);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzQ = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbv(zzR, "\u0001%\u0000\u0001\u0001%%\u0000\n\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017\"ဉ\u0018#ဈ\u0019$ဉ\u001a%\u001b", new Object[]{"zza", "zzd", "zze", "zzf", "zzh", zzijm.class, "zzl", "zzm", "zzn", "zzo", "zzp", "zzb", zziji.zza, "zzc", zzihw.zza, "zzg", "zzj", "zzk", "zzu", "zzi", zzikf.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", zzikl.class, "zzC", "zzD", "zzE", "zzF", zziih.class, "zzG", "zzH", zzijv.zza, "zzI", zziiz.class, "zzJ", zzije.class, "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", zzijr.class});
            case NEW_MUTABLE_INSTANCE:
                return new zzikb();
            case NEW_BUILDER:
                return new zzihx(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzR;
            case GET_PARSER:
                zzifk zzifkVar = zzS;
                if (zzifkVar != null) {
                    return zzifkVar;
                }
                synchronized (zzikb.class) {
                    zzidmVar = zzS;
                    if (zzidmVar == null) {
                        zzidmVar = new zzidm(zzR);
                        zzS = zzidmVar;
                    }
                    break;
                }
                return zzidmVar;
            default:
                throw null;
        }
    }

    public final String zze() {
        return this.zzj;
    }

    final /* synthetic */ void zzh(String str) {
        this.zza |= 4;
        this.zzd = str;
    }

    final /* synthetic */ void zzi(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    final /* synthetic */ void zzj(zzihz zzihzVar) {
        zzihzVar.getClass();
        this.zzg = zzihzVar;
        this.zza |= 32;
    }

    final /* synthetic */ void zzk(zzijm zzijmVar) {
        zzijmVar.getClass();
        zzied zziedVar = this.zzh;
        if (!zziedVar.zza()) {
            this.zzh = zzidr.zzbN(zziedVar);
        }
        this.zzh.add(zzijmVar);
    }

    final /* synthetic */ void zzl(String str) {
        this.zza |= 64;
        this.zzj = str;
    }

    final /* synthetic */ void zzm() {
        this.zza &= -65;
        this.zzj = zzR.zzj;
    }

    final /* synthetic */ void zzn(zzijh zzijhVar) {
        zzijhVar.getClass();
        this.zzk = zzijhVar;
        this.zza |= 128;
    }

    final /* synthetic */ void zzo(zzijo zzijoVar) {
        zzijoVar.getClass();
        this.zzv = zzijoVar;
        this.zza |= 8192;
    }

    final /* synthetic */ void zzp(Iterable iterable) {
        zzied zziedVar = this.zzy;
        if (!zziedVar.zza()) {
            this.zzy = zzidr.zzbN(zziedVar);
        }
        zzibw.zzaW(iterable, this.zzy);
    }

    final /* synthetic */ void zzq(Iterable iterable) {
        zzied zziedVar = this.zzz;
        if (!zziedVar.zza()) {
            this.zzz = zzidr.zzbN(zziedVar);
        }
        zzibw.zzaW(iterable, this.zzz);
    }

    final /* synthetic */ void zzs(int i) {
        this.zzb = i - 1;
        this.zza |= 1;
    }
}

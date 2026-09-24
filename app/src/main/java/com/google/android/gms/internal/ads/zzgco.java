package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgco extends zzidr implements zzifd {
    private static final zzgco zzD;
    private static volatile zzifk zzE;
    private boolean zzC;
    private int zza;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private int zzh;
    private zzgdg zzj;
    private boolean zzk;
    private zzgdi zzn;
    private int zzc = 1;
    private boolean zzd = true;
    private String zzg = "unknown_host";
    private boolean zzi = true;
    private long zzl = 100;
    private long zzm = 2000;
    private long zzo = 10;
    private long zzp = 100;
    private long zzu = 20000;
    private String zzv = "";
    private String zzw = "";
    private long zzx = 500;
    private long zzy = 3000;
    private boolean zzz = true;
    private boolean zzA = true;
    private boolean zzB = true;

    static {
        zzgco zzgcoVar = new zzgco();
        zzD = zzgcoVar;
        zzidr.zzbu(zzgco.class, zzgcoVar);
    }

    private zzgco() {
    }

    public static zzgcn zzw() {
        return (zzgcn) zzD.zzbn();
    }

    final /* synthetic */ void zzA(long j) {
        this.zza |= 1024;
        this.zzl = j;
    }

    final /* synthetic */ void zzB(long j) {
        this.zza |= 2048;
        this.zzm = j;
    }

    final /* synthetic */ void zzC(zzgdi zzgdiVar) {
        zzgdiVar.getClass();
        this.zzn = zzgdiVar;
        this.zza |= 4096;
    }

    final /* synthetic */ void zzD(long j) {
        this.zza |= 524288;
        this.zzy = j;
    }

    final /* synthetic */ void zzE(boolean z) {
        this.zza |= 1048576;
        this.zzz = z;
    }

    public final int zzG() {
        int iZza = zzgcq.zza(this.zzb);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzH() {
        int iZza = zzgcq.zza(this.zzc);
        if (iZza == 0) {
            return 2;
        }
        return iZza;
    }

    public final int zzI() {
        int i = this.zzh;
        int i2 = 2;
        if (i != 0) {
            if (i != 1) {
                i2 = i != 2 ? 0 : 4;
            } else {
                i2 = 3;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    final /* synthetic */ void zzJ(int i) {
        this.zzb = i - 1;
        this.zza |= 1;
    }

    public final boolean zza() {
        return this.zzd;
    }

    public final boolean zzb() {
        return this.zze;
    }

    public final boolean zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            zzidx zzidxVar = zzgcp.zza;
            return zzbv(zzD, "\u0004\u0018\u0000\u0001\u0001\u0019\u0018\u0000\u0000\u0000\u0001᠌\u0000\u0003ဈ\u0005\u0004ဇ\u0007\u0005ဉ\b\u0006ဇ\t\u0007ဂ\u000b\bဉ\f\tဇ\u0002\nဂ\r\u000bဂ\u000e\fဂ\u000f\rဈ\u0010\u000eဈ\u0011\u000fဂ\u0012\u0010ဂ\u0013\u0011ဇ\u0014\u0012ဂ\n\u0013ဇ\u0015\u0014ဇ\u0016\u0015ဇ\u0017\u0016᠌\u0001\u0017ဇ\u0003\u0018ဇ\u0004\u0019ဌ\u0006", new Object[]{"zza", "zzb", zzidxVar, "zzg", "zzi", "zzj", "zzk", "zzm", "zzn", "zzd", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzl", "zzA", "zzB", "zzC", "zzc", zzidxVar, "zze", "zzf", "zzh"});
        }
        if (iOrdinal == 3) {
            return new zzgco();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzgcn(bArr);
        }
        if (iOrdinal == 5) {
            return zzD;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifk zzifkVar = zzE;
        if (zzifkVar != null) {
            return zzifkVar;
        }
        synchronized (zzgco.class) {
            zzidmVar = zzE;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzD);
                zzE = zzidmVar;
            }
        }
        return zzidmVar;
    }

    public final boolean zze() {
        return this.zzi;
    }

    public final zzgdg zzg() {
        zzgdg zzgdgVar = this.zzj;
        return zzgdgVar == null ? zzgdg.zzg() : zzgdgVar;
    }

    public final boolean zzh() {
        return this.zzk;
    }

    public final long zzi() {
        return this.zzl;
    }

    public final long zzj() {
        return this.zzm;
    }

    public final zzgdi zzk() {
        zzgdi zzgdiVar = this.zzn;
        return zzgdiVar == null ? zzgdi.zzj() : zzgdiVar;
    }

    public final long zzl() {
        return this.zzo;
    }

    public final long zzm() {
        return this.zzp;
    }

    public final long zzn() {
        return this.zzu;
    }

    public final String zzo() {
        return this.zzv;
    }

    public final String zzp() {
        return this.zzw;
    }

    public final long zzq() {
        return this.zzx;
    }

    public final long zzr() {
        return this.zzy;
    }

    public final boolean zzs() {
        return this.zzz;
    }

    public final boolean zzt() {
        return this.zzA;
    }

    public final boolean zzu() {
        return this.zzB;
    }

    public final boolean zzv() {
        return this.zzC;
    }

    final /* synthetic */ void zzx(boolean z) {
        this.zza |= 4;
        this.zzd = z;
    }

    final /* synthetic */ void zzy(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzg = str;
    }

    final /* synthetic */ void zzz(zzgdg zzgdgVar) {
        zzgdgVar.getClass();
        this.zzj = zzgdgVar;
        this.zza |= 256;
    }
}

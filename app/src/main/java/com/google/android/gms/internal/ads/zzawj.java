package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzawj extends zzidr implements zzifd {
    private static final zzawj zzo;
    private static volatile zzifk zzp;
    private int zza;
    private long zzc;
    private int zzg;
    private long zzi;
    private long zzl;
    private long zzm;
    private zzied zzb = zzbM();
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";
    private zzidz zzn = zzbC();

    static {
        zzawj zzawjVar = new zzawj();
        zzo = zzawjVar;
        zzidr.zzbu(zzawj.class, zzawjVar);
    }

    private zzawj() {
    }

    public static zzawi zza() {
        return (zzawi) zzo.zzbn();
    }

    final /* synthetic */ void zzb(zzaxb zzaxbVar) {
        zzaxbVar.getClass();
        zzied zziedVar = this.zzb;
        if (!zziedVar.zza()) {
            this.zzb = zzidr.zzbN(zziedVar);
        }
        this.zzb.add(zzaxbVar);
    }

    final /* synthetic */ void zzc() {
        this.zzb = zzbM();
    }

    final /* synthetic */ void zzd(long j) {
        this.zza |= 1;
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
            return zzbv(zzo, "\u0004\r\u0000\u0001\b@\r\u0000\u0002\u0000\b\u001b\u0015ဂ\u0000\u0016ဈ\u0001\u0017ဈ\u0002\u0018ဈ\u0003\u0019᠌\u0004(ဈ\u0005)ဂ\u0006<ဈ\u0007=ဈ\b>ဂ\t?ဂ\n@'", new Object[]{"zza", "zzb", zzaxb.class, "zzc", "zzd", "zze", "zzf", "zzg", zzawz.zza, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (iOrdinal == 3) {
            return new zzawj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzawi(bArr);
        }
        if (iOrdinal == 5) {
            return zzo;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifk zzifkVar = zzp;
        if (zzifkVar != null) {
            return zzifkVar;
        }
        synchronized (zzawj.class) {
            zzidmVar = zzp;
            if (zzidmVar == null) {
                zzidmVar = new zzidm(zzo);
                zzp = zzidmVar;
            }
        }
        return zzidmVar;
    }

    final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzd = str;
    }

    final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zza |= 4;
        this.zze = str;
    }

    final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zza |= 8;
        this.zzf = str;
    }

    final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzh = str;
    }

    final /* synthetic */ void zzj(long j) {
        this.zza |= 64;
        this.zzi = j;
    }

    final /* synthetic */ void zzk(String str) {
        str.getClass();
        this.zza |= 128;
        this.zzj = str;
    }

    final /* synthetic */ void zzl(String str) {
        str.getClass();
        this.zza |= 256;
        this.zzk = str;
    }

    final /* synthetic */ void zzm(long j) {
        this.zza |= 512;
        this.zzl = j;
    }

    final /* synthetic */ void zzn(long j) {
        this.zza |= 1024;
        this.zzm = j;
    }

    final /* synthetic */ void zzp(int i) {
        this.zzg = i - 1;
        this.zza |= 16;
    }
}

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaib implements zzafp {
    private final byte[] zza;
    private final zzes zzb;
    private final zzafw zzc;
    private zzafs zzd;
    private zzahb zze;
    private int zzf;
    private zzap zzg;
    private zzagc zzh;
    private int zzi;
    private int zzj;
    private zzahz zzk;
    private int zzl;
    private long zzm;

    static {
        int i = zzaia.zza;
    }

    public zzaib() {
        throw null;
    }

    public zzaib(int i) {
        this.zza = new byte[42];
        this.zzb = new zzes(new byte[32768], 0);
        this.zzc = new zzafw();
        this.zzf = 0;
    }

    private final long zzh(zzes zzesVar, boolean z) {
        boolean zZza;
        this.zzh.getClass();
        int iZzg = zzesVar.zzg();
        while (iZzg <= zzesVar.zze() - 16) {
            zzesVar.zzh(iZzg);
            zzagc zzagcVar = this.zzh;
            int i = this.zzj;
            zzafw zzafwVar = this.zzc;
            if (zzafx.zza(zzesVar, zzagcVar, i, zzafwVar)) {
                zzesVar.zzh(iZzg);
                return zzafwVar.zza;
            }
            iZzg++;
        }
        if (!z) {
            zzesVar.zzh(iZzg);
            return -1L;
        }
        while (iZzg <= zzesVar.zze() - this.zzi) {
            zzesVar.zzh(iZzg);
            try {
                zZza = zzafx.zza(zzesVar, this.zzh, this.zzj, this.zzc);
            } catch (IndexOutOfBoundsException unused) {
                zZza = false;
            }
            if (zzesVar.zzg() <= zzesVar.zze() && zZza) {
                zzesVar.zzh(iZzg);
                return this.zzc.zza;
            }
            iZzg++;
        }
        zzesVar.zzh(zzesVar.zze());
        return -1L;
    }

    private final void zzi() {
        long j = this.zzm * 1000000;
        zzagc zzagcVar = this.zzh;
        String str = zzfk.zza;
        this.zze.zze(j / ((long) zzagcVar.zze), 1, this.zzl, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final boolean zza(zzafq zzafqVar) throws IOException {
        zzafz.zza(zzafqVar, false);
        zzes zzesVar = new zzes(4);
        ((zzafg) zzafqVar).zzh(zzesVar.zzi(), 0, 4, false);
        return zzesVar.zzz() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public /* synthetic */ List zzb() {
        return zzgvz.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzc(zzafs zzafsVar) {
        this.zzd = zzafsVar;
        this.zze = zzafsVar.zzu(0, 1);
        zzafsVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public /* synthetic */ zzafp zzg() {
        return zzafp.CC.$default$zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zze(long j, long j2) {
        if (j == 0) {
            this.zzf = 0;
        } else {
            zzahz zzahzVar = this.zzk;
            if (zzahzVar != null) {
                zzahzVar.zzb(j2);
            }
        }
        this.zzm = j2 != 0 ? -1L : 0L;
        this.zzl = 0;
        this.zzb.zza(0);
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final int zzd(zzafq zzafqVar, zzagp zzagpVar) throws IOException {
        boolean zZzb;
        zzagc zzagcVar;
        zzags zzagrVar;
        boolean z;
        int i = this.zzf;
        if (i == 0) {
            zzafqVar.zzl();
            long jZzm = zzafqVar.zzm();
            zzap zzapVarZza = zzafz.zza(zzafqVar, true);
            zzafqVar.zzf((int) (zzafqVar.zzm() - jZzm));
            this.zzg = zzapVarZza;
            this.zzf = 1;
            return 0;
        }
        if (i == 1) {
            zzafqVar.zzi(this.zza, 0, 42);
            zzafqVar.zzl();
            this.zzf = 2;
            return 0;
        }
        if (i == 2) {
            zzes zzesVar = new zzes(4);
            zzafqVar.zzc(zzesVar.zzi(), 0, 4);
            if (zzesVar.zzz() != 1716281667) {
                throw zzat.zzb("Failed to read FLAC stream marker.", null);
            }
            this.zzf = 3;
            return 0;
        }
        if (i == 3) {
            zzafy zzafyVar = new zzafy(this.zzh);
            do {
                zZzb = zzafz.zzb(zzafqVar, zzafyVar);
                zzagcVar = zzafyVar.zza;
                String str = zzfk.zza;
                this.zzh = zzagcVar;
            } while (!zZzb);
            zzagcVar.getClass();
            this.zzi = Math.max(zzagcVar.zzc, 6);
            zzv zzvVarZzc = this.zzh.zzc(this.zza, this.zzg);
            zzahb zzahbVar = this.zze;
            zzt zztVarZza = zzvVarZzc.zza();
            zztVarZza.zzn("audio/flac");
            zzahbVar.zzA(zztVarZza.zzO());
            this.zze.zzO(this.zzh.zza());
            this.zzf = 4;
            return 0;
        }
        if (i == 4) {
            zzafqVar.zzl();
            zzes zzesVar2 = new zzes(2);
            zzafqVar.zzi(zzesVar2.zzi(), 0, 2);
            int iZzt = zzesVar2.zzt();
            if ((iZzt >> 2) != 16382) {
                zzafqVar.zzl();
                throw zzat.zzb("First frame does not start with sync code.", null);
            }
            zzafqVar.zzl();
            this.zzj = iZzt;
            zzafs zzafsVar = this.zzd;
            String str2 = zzfk.zza;
            long jZzn = zzafqVar.zzn();
            long jZzo = zzafqVar.zzo();
            zzagc zzagcVar2 = this.zzh;
            zzagcVar2.getClass();
            zzagb zzagbVar = zzagcVar2.zzk;
            if (zzagbVar != null && zzagbVar.zza.length > 0) {
                zzagrVar = new zzaga(zzagcVar2, jZzn);
            } else if (jZzo == -1 || zzagcVar2.zzj <= 0) {
                zzagrVar = new zzagr(zzagcVar2.zza(), 0L);
            } else {
                zzahz zzahzVar = new zzahz(zzagcVar2, this.zzj, jZzn, jZzo);
                this.zzk = zzahzVar;
                zzagrVar = zzahzVar.zza();
            }
            zzafsVar.zzw(zzagrVar);
            this.zzf = 5;
            return 0;
        }
        this.zze.getClass();
        zzagc zzagcVar3 = this.zzh;
        zzagcVar3.getClass();
        zzahz zzahzVar2 = this.zzk;
        if (zzahzVar2 != null && zzahzVar2.zzc()) {
            return zzahzVar2.zzd(zzafqVar, zzagpVar);
        }
        if (this.zzm == -1) {
            this.zzm = zzafx.zzb(zzafqVar, zzagcVar3);
            return 0;
        }
        zzes zzesVar3 = this.zzb;
        int iZze = zzesVar3.zze();
        if (iZze < 32768) {
            int iZza = zzafqVar.zza(zzesVar3.zzi(), iZze, 32768 - iZze);
            z = iZza == -1;
            if (!z) {
                zzesVar3.zzf(iZze + iZza);
            } else if (zzesVar3.zzd() == 0) {
                zzi();
                return -1;
            }
        } else {
            z = false;
        }
        int iZzg = zzesVar3.zzg();
        int i2 = this.zzl;
        int i3 = this.zzi;
        if (i2 < i3) {
            zzesVar3.zzk(Math.min(i3 - i2, zzesVar3.zzd()));
        }
        long jZzh = zzh(zzesVar3, z);
        int iZzg2 = zzesVar3.zzg() - iZzg;
        zzesVar3.zzh(iZzg);
        this.zze.zzc(zzesVar3, iZzg2);
        this.zzl += iZzg2;
        if (jZzh != -1) {
            zzi();
            this.zzl = 0;
            this.zzm = jZzh;
        }
        int length = zzesVar3.zzi().length - zzesVar3.zze();
        if (zzesVar3.zzd() >= 16 || length >= 16) {
            return 0;
        }
        int iZzd = zzesVar3.zzd();
        System.arraycopy(zzesVar3.zzi(), zzesVar3.zzg(), zzesVar3.zzi(), 0, iZzd);
        zzesVar3.zzh(0);
        zzesVar3.zzf(iZzd);
        return 0;
    }
}

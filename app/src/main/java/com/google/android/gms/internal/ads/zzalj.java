package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzalj {
    public final zzahb zza;
    public zzame zzd;
    public zzale zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private final zzv zzj;
    private boolean zzm;
    public final zzamd zzb = new zzamd();
    public final zzes zzc = new zzes();
    private final zzes zzk = new zzes(1);
    private final zzes zzl = new zzes();

    public zzalj(zzahb zzahbVar, zzame zzameVar, zzale zzaleVar, zzv zzvVar) {
        this.zza = zzahbVar;
        this.zzd = zzameVar;
        this.zze = zzaleVar;
        this.zzj = zzvVar;
        zza(zzameVar, zzaleVar);
    }

    public final void zza(zzame zzameVar, zzale zzaleVar) {
        this.zzd = zzameVar;
        this.zze = zzaleVar;
        this.zza.zzA(this.zzj);
        zzc();
    }

    public final void zzb(zzq zzqVar) {
        zzamb zzambVar = this.zzd.zza;
        zzale zzaleVar = this.zzb.zza;
        String str = zzfk.zza;
        zzamc zzamcVarZza = zzambVar.zza(zzaleVar.zza);
        zzq zzqVarZzb = zzqVar.zzb(zzamcVarZza != null ? zzamcVarZza.zzb : null);
        zzt zztVarZza = this.zzj.zza();
        zztVarZza.zzs(zzqVarZzb);
        this.zza.zzA(zztVarZza.zzO());
    }

    public final void zzc() {
        zzamd zzamdVar = this.zzb;
        zzamdVar.zzd = 0;
        zzamdVar.zzp = 0L;
        zzamdVar.zzq = false;
        zzamdVar.zzk = false;
        zzamdVar.zzo = false;
        zzamdVar.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzm = false;
    }

    public final long zzd() {
        if (!this.zzm) {
            return this.zzd.zzf[this.zzf];
        }
        zzamd zzamdVar = this.zzb;
        return zzamdVar.zzi[this.zzf];
    }

    public final long zze() {
        return !this.zzm ? this.zzd.zzc[this.zzf] : this.zzb.zzf[this.zzh];
    }

    public final int zzf() {
        return !this.zzm ? this.zzd.zzd[this.zzf] : this.zzb.zzh[this.zzf];
    }

    public final int zzg() {
        int i;
        if (this.zzm) {
            i = this.zzb.zzj[this.zzf] ? 1 : 0;
        } else {
            i = this.zzd.zzg[this.zzf];
        }
        return zzj() != null ? i | 1073741824 : i;
    }

    public final boolean zzh() {
        this.zzf++;
        if (!this.zzm) {
            return false;
        }
        int i = this.zzg + 1;
        this.zzg = i;
        int[] iArr = this.zzb.zzg;
        int i2 = this.zzh;
        if (i != iArr[i2]) {
            return true;
        }
        this.zzh = i2 + 1;
        this.zzg = 0;
        return false;
    }

    public final int zzi(int i, int i2) {
        zzes zzesVar;
        zzamc zzamcVarZzj = zzj();
        if (zzamcVarZzj == null) {
            return 0;
        }
        int i3 = zzamcVarZzj.zzd;
        if (i3 != 0) {
            zzesVar = this.zzb.zzn;
        } else {
            byte[] bArr = zzamcVarZzj.zze;
            String str = zzfk.zza;
            zzes zzesVar2 = this.zzl;
            byte[] bArr2 = bArr;
            int length = bArr2.length;
            zzesVar2.zzb(bArr2, length);
            zzesVar = zzesVar2;
            i3 = length;
        }
        zzamd zzamdVar = this.zzb;
        boolean zZzb = zzamdVar.zzb(this.zzf);
        boolean z = zZzb || i2 != 0;
        zzes zzesVar3 = this.zzk;
        zzesVar3.zzi()[0] = (byte) ((true != z ? 0 : 128) | i3);
        zzesVar3.zzh(0);
        zzahb zzahbVar = this.zza;
        zzahbVar.zzd(zzesVar3, 1, 1);
        zzahbVar.zzd(zzesVar, i3, 1);
        if (!z) {
            return i3 + 1;
        }
        if (!zZzb) {
            zzes zzesVar4 = this.zzc;
            zzesVar4.zza(8);
            byte[] bArrZzi = zzesVar4.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 1;
            bArrZzi[2] = 0;
            bArrZzi[3] = (byte) i2;
            bArrZzi[4] = (byte) ((i >> 24) & 255);
            bArrZzi[5] = (byte) ((i >> 16) & 255);
            bArrZzi[6] = (byte) ((i >> 8) & 255);
            bArrZzi[7] = (byte) (i & 255);
            zzahbVar.zzd(zzesVar4, 8, 1);
            return i3 + 9;
        }
        int i4 = i3 + 1;
        zzes zzesVar5 = zzamdVar.zzn;
        int iZzt = zzesVar5.zzt();
        zzesVar5.zzk(-2);
        int i5 = (iZzt * 6) + 2;
        if (i2 != 0) {
            zzes zzesVar6 = this.zzc;
            zzesVar6.zza(i5);
            byte[] bArrZzi2 = zzesVar6.zzi();
            zzesVar5.zzm(bArrZzi2, 0, i5);
            int i6 = (((bArrZzi2[2] & 255) << 8) | (bArrZzi2[3] & 255)) + i2;
            bArrZzi2[2] = (byte) ((i6 >> 8) & 255);
            bArrZzi2[3] = (byte) (i6 & 255);
            zzesVar5 = zzesVar6;
        }
        zzahbVar.zzd(zzesVar5, i5, 1);
        return i4 + i5;
    }

    public final zzamc zzj() {
        if (!this.zzm) {
            return null;
        }
        zzamd zzamdVar = this.zzb;
        zzale zzaleVar = zzamdVar.zza;
        String str = zzfk.zza;
        int i = zzaleVar.zza;
        zzamc zzamcVarZza = zzamdVar.zzm;
        if (zzamcVarZza == null) {
            zzamcVarZza = this.zzd.zza.zza(i);
        }
        if (zzamcVarZza == null || !zzamcVarZza.zza) {
            return null;
        }
        return zzamcVarZza;
    }

    final /* synthetic */ boolean zzk() {
        return this.zzm;
    }

    final /* synthetic */ void zzl(boolean z) {
        this.zzm = true;
    }
}

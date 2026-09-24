package com.google.android.gms.internal.ads;

import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzapv implements zzapm {
    private final zzaqp zza;
    private String zzb;
    private zzahb zzc;
    private zzapu zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzaqd zzg = new zzaqd(32, 128);
    private final zzaqd zzh = new zzaqd(33, 128);
    private final zzaqd zzi = new zzaqd(34, 128);
    private final zzaqd zzj = new zzaqd(39, 128);
    private final zzaqd zzk = new zzaqd(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzes zzn = new zzes();

    public zzapv(zzaqp zzaqpVar, String str) {
        this.zza = zzaqpVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(long j, int i, int i2, long j2) {
        this.zzd.zzb(j, i, i2, j2, this.zze);
        if (!this.zze) {
            this.zzg.zzc(i2);
            this.zzh.zzc(i2);
            this.zzi.zzc(i2);
        }
        this.zzj.zzc(i2);
        this.zzk.zzc(i2);
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzg(byte[] bArr, int i, int i2) {
        this.zzd.zzc(bArr, i, i2);
        if (!this.zze) {
            this.zzg.zzd(bArr, i, i2);
            this.zzh.zzd(bArr, i, i2);
            this.zzi.zzd(bArr, i, i2);
        }
        this.zzj.zzd(bArr, i, i2);
        this.zzk.zzd(bArr, i, i2);
    }

    @RequiresNonNull({"output", "sampleReader"})
    private final void zzh(long j, int i, int i2, long j2) {
        this.zzd.zzd(j, i, this.zze);
        if (!this.zze) {
            zzaqd zzaqdVar = this.zzg;
            zzaqdVar.zze(i2);
            zzaqd zzaqdVar2 = this.zzh;
            zzaqdVar2.zze(i2);
            zzaqd zzaqdVar3 = this.zzi;
            zzaqdVar3.zze(i2);
            if (zzaqdVar.zzb() && zzaqdVar2.zzb() && zzaqdVar3.zzb()) {
                String str = this.zzb;
                int i3 = zzaqdVar.zzb;
                byte[] bArr = new byte[zzaqdVar2.zzb + i3 + zzaqdVar3.zzb];
                System.arraycopy(zzaqdVar.zza, 0, bArr, 0, i3);
                System.arraycopy(zzaqdVar2.zza, 0, bArr, zzaqdVar.zzb, zzaqdVar2.zzb);
                System.arraycopy(zzaqdVar3.zza, 0, bArr, zzaqdVar.zzb + zzaqdVar2.zzb, zzaqdVar3.zzb);
                String strZzc = null;
                zzgi zzgiVarZzg = zzgo.zzg(zzaqdVar2.zza, 3, zzaqdVar2.zzb, null);
                zzgd zzgdVar = zzgiVarZzg.zzb;
                if (zzgdVar != null) {
                    int i4 = zzgdVar.zzf;
                    int[] iArr = zzgdVar.zze;
                    int i5 = zzgdVar.zzd;
                    strZzc = zzdp.zzc(zzgdVar.zza, zzgdVar.zzb, zzgdVar.zzc, i5, iArr, i4);
                }
                zzt zztVar = new zzt();
                zztVar.zza(str);
                zztVar.zzn("video/mp2t");
                zztVar.zzo("video/hevc");
                zztVar.zzk(strZzc);
                zztVar.zzv(zzgiVarZzg.zze);
                zztVar.zzw(zzgiVarZzg.zzf);
                zztVar.zzx(zzgiVarZzg.zzg);
                zztVar.zzy(zzgiVarZzg.zzh);
                zzh zzhVar = new zzh();
                zzhVar.zza(zzgiVarZzg.zzk);
                zzhVar.zzb(zzgiVarZzg.zzl);
                zzhVar.zzc(zzgiVarZzg.zzm);
                zzhVar.zze(zzgiVarZzg.zzc + 8);
                zzhVar.zzf(zzgiVarZzg.zzd + 8);
                zztVar.zzE(zzhVar.zzg());
                zztVar.zzB(zzgiVarZzg.zzi);
                zztVar.zzq(zzgiVarZzg.zzj);
                zztVar.zzF(zzgiVarZzg.zza + 1);
                zztVar.zzr(Collections.singletonList(bArr));
                zzv zzvVarZzO = zztVar.zzO();
                this.zzc.zzA(zzvVarZzO);
                int i6 = zzvVarZzO.zzr;
                zzgsw.zzi(i6 != -1);
                this.zza.zzb(i6);
                this.zze = true;
            }
        }
        zzaqd zzaqdVar4 = this.zzj;
        if (zzaqdVar4.zze(i2)) {
            int iZza = zzgo.zza(zzaqdVar4.zza, zzaqdVar4.zzb);
            zzes zzesVar = this.zzn;
            zzesVar.zzb(zzaqdVar4.zza, iZza);
            zzesVar.zzk(5);
            this.zza.zzc(j2, zzesVar);
        }
        zzaqd zzaqdVar5 = this.zzk;
        if (zzaqdVar5.zze(i2)) {
            int iZza2 = zzgo.zza(zzaqdVar5.zza, zzaqdVar5.zzb);
            zzes zzesVar2 = this.zzn;
            zzesVar2.zzb(zzaqdVar5.zza, iZza2);
            zzesVar2.zzk(5);
            this.zza.zzc(j2, zzesVar2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zza() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzgo.zzj(this.zzf);
        this.zzg.zza();
        this.zzh.zza();
        this.zzi.zza();
        this.zzj.zza();
        this.zzk.zza();
        this.zza.zze();
        zzapu zzapuVar = this.zzd;
        if (zzapuVar != null) {
            zzapuVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzb(zzafs zzafsVar, zzara zzaraVar) {
        zzaraVar.zza();
        this.zzb = zzaraVar.zzc();
        this.zzc = zzafsVar.zzu(zzaraVar.zzb(), 2);
        this.zzd = new zzapu(this.zzc);
        this.zza.zza(zzafsVar, zzaraVar);
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzc(long j, int i) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzd(zzes zzesVar) {
        this.zzc.getClass();
        String str = zzfk.zza;
        while (zzesVar.zzd() > 0) {
            int iZzg = zzesVar.zzg();
            int iZze = zzesVar.zze();
            byte[] bArrZzi = zzesVar.zzi();
            this.zzl += (long) zzesVar.zzd();
            this.zzc.zzc(zzesVar, zzesVar.zzd());
            while (iZzg < iZze) {
                int iZzi = zzgo.zzi(bArrZzi, iZzg, iZze, this.zzf);
                if (iZzi == iZze) {
                    zzg(bArrZzi, iZzg, iZze);
                    return;
                }
                int i = bArrZzi[iZzi + 3] & 126;
                int i2 = 3;
                if (iZzi > 0) {
                    int i3 = iZzi - 1;
                    if (bArrZzi[i3] == 0) {
                        i2 = 4;
                        iZzi = i3;
                    }
                }
                int i4 = iZzi - iZzg;
                if (i4 > 0) {
                    zzg(bArrZzi, iZzg, iZzi);
                }
                int i5 = iZze - iZzi;
                long j = this.zzl - ((long) i5);
                zzh(j, i5, i4 < 0 ? -i4 : 0, this.zzm);
                zzf(j, i5, i >> 1, this.zzm);
                iZzg = iZzi + i2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zze(boolean z) {
        this.zzc.getClass();
        String str = zzfk.zza;
        if (z) {
            this.zza.zzd();
            zzh(this.zzl, 0, 0, this.zzm);
            zzf(this.zzl, 0, 48, this.zzm);
        }
    }
}

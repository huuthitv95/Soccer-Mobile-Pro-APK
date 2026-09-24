package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzapt implements zzapm {
    private final zzaqp zza;
    private long zzf;
    private String zzh;
    private zzahb zzi;
    private zzaps zzj;
    private boolean zzk;
    private boolean zzm;
    private final String zzb = "video/mp2t";
    private final boolean[] zzg = new boolean[3];
    private final zzaqd zzc = new zzaqd(7, 128);
    private final zzaqd zzd = new zzaqd(8, 128);
    private final zzaqd zze = new zzaqd(6, 128);
    private long zzl = -9223372036854775807L;
    private final zzes zzn = new zzes();

    public zzapt(zzaqp zzaqpVar, boolean z, boolean z2, String str) {
        this.zza = zzaqpVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(long j, int i, long j2) {
        if (!this.zzk) {
            this.zzc.zzc(i);
            this.zzd.zzc(i);
        }
        this.zze.zzc(i);
        this.zzj.zzd(j, i, j2, this.zzm);
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzg(byte[] bArr, int i, int i2) {
        if (!this.zzk) {
            this.zzc.zzd(bArr, i, i2);
            this.zzd.zzd(bArr, i, i2);
        }
        this.zze.zzd(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zza() {
        this.zzf = 0L;
        this.zzm = false;
        this.zzl = -9223372036854775807L;
        zzgo.zzj(this.zzg);
        this.zzc.zza();
        this.zzd.zza();
        this.zze.zza();
        this.zza.zze();
        zzaps zzapsVar = this.zzj;
        if (zzapsVar != null) {
            zzapsVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzb(zzafs zzafsVar, zzara zzaraVar) {
        zzaraVar.zza();
        this.zzh = zzaraVar.zzc();
        this.zzi = zzafsVar.zzu(zzaraVar.zzb(), 2);
        this.zzj = new zzaps(this.zzi, false, false);
        this.zza.zza(zzafsVar, zzaraVar);
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzc(long j, int i) {
        this.zzl = j;
        int i2 = i & 2;
        this.zzm = (i2 != 0) | this.zzm;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0041  */
    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzd(zzes zzesVar) {
        int i;
        int i2;
        this.zzi.getClass();
        String str = zzfk.zza;
        int iZzg = zzesVar.zzg();
        int iZze = zzesVar.zze();
        byte[] bArrZzi = zzesVar.zzi();
        this.zzf += (long) zzesVar.zzd();
        this.zzi.zzc(zzesVar, zzesVar.zzd());
        while (true) {
            int iZzi = zzgo.zzi(bArrZzi, iZzg, iZze, this.zzg);
            if (iZzi == iZze) {
                zzg(bArrZzi, iZzg, iZze);
                return;
            }
            int i3 = bArrZzi[iZzi + 3] & Ascii.f22502US;
            if (iZzi > 0) {
                int i4 = iZzi - 1;
                if (bArrZzi[i4] == 0) {
                    i2 = 4;
                    i = i4;
                } else {
                    i = iZzi;
                    i2 = 3;
                }
            } else {
                i = iZzi;
                i2 = 3;
            }
            int i5 = i - iZzg;
            if (i5 > 0) {
                zzg(bArrZzi, iZzg, i);
            }
            int i6 = iZze - i;
            long j = this.zzf - ((long) i6);
            zzh(j, i6, i5 < 0 ? -i5 : 0, this.zzl);
            zzf(j, i3, this.zzl);
            iZzg = i + i2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zze(boolean z) {
        this.zzi.getClass();
        String str = zzfk.zza;
        if (z) {
            this.zza.zzd();
            zzh(this.zzf, 0, 0, this.zzl);
            zzf(this.zzf, 9, this.zzl);
            zzh(this.zzf, 0, 0, this.zzl);
        }
    }

    @RequiresNonNull({"output", "sampleReader"})
    private final void zzh(long j, int i, int i2, long j2) {
        if (!this.zzk) {
            zzaqd zzaqdVar = this.zzc;
            zzaqdVar.zze(i2);
            zzaqd zzaqdVar2 = this.zzd;
            zzaqdVar2.zze(i2);
            if (this.zzk) {
                if (zzaqdVar.zzb()) {
                    zzgn zzgnVarZze = zzgo.zze(zzaqdVar.zza, 4, zzaqdVar.zzb);
                    this.zza.zzb(zzgnVarZze.zzm);
                    this.zzj.zza(zzgnVarZze);
                    zzaqdVar.zza();
                } else if (zzaqdVar2.zzb()) {
                    this.zzj.zzb(zzgo.zzh(zzaqdVar2.zza, 4, zzaqdVar2.zzb));
                    zzaqdVar2.zza();
                }
            } else if (zzaqdVar.zzb() && zzaqdVar2.zzb()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(zzaqdVar.zza, zzaqdVar.zzb));
                arrayList.add(Arrays.copyOf(zzaqdVar2.zza, zzaqdVar2.zzb));
                zzgn zzgnVarZze2 = zzgo.zze(zzaqdVar.zza, 4, zzaqdVar.zzb);
                zzgm zzgmVarZzh = zzgo.zzh(zzaqdVar2.zza, 4, zzaqdVar2.zzb);
                String strZzb = zzdp.zzb(zzgnVarZze2.zza, zzgnVarZze2.zzb, zzgnVarZze2.zzc);
                zzahb zzahbVar = this.zzi;
                zzt zztVar = new zzt();
                zztVar.zza(this.zzh);
                zztVar.zzn(this.zzb);
                zztVar.zzo("video/avc");
                zztVar.zzk(strZzb);
                zztVar.zzv(zzgnVarZze2.zze);
                zztVar.zzw(zzgnVarZze2.zzf);
                zzh zzhVar = new zzh();
                zzhVar.zza(zzgnVarZze2.zzj);
                zzhVar.zzb(zzgnVarZze2.zzk);
                zzhVar.zzc(zzgnVarZze2.zzl);
                zzhVar.zze(zzgnVarZze2.zzh + 8);
                zzhVar.zzf(zzgnVarZze2.zzi + 8);
                zztVar.zzE(zzhVar.zzg());
                zztVar.zzB(zzgnVarZze2.zzg);
                zztVar.zzr(arrayList);
                int i3 = zzgnVarZze2.zzm;
                zztVar.zzq(i3);
                zzahbVar.zzA(zztVar.zzO());
                this.zzk = true;
                this.zza.zzb(i3);
                this.zzj.zza(zzgnVarZze2);
                this.zzj.zzb(zzgmVarZzh);
                zzaqdVar.zza();
                zzaqdVar2.zza();
            }
        }
        zzaqd zzaqdVar3 = this.zze;
        if (zzaqdVar3.zze(i2)) {
            int iZza = zzgo.zza(zzaqdVar3.zza, zzaqdVar3.zzb);
            zzes zzesVar = this.zzn;
            zzesVar.zzb(zzaqdVar3.zza, iZza);
            zzesVar.zzh(4);
            this.zza.zzc(j2, zzesVar);
        }
        if (this.zzj.zze(j, i, this.zzk)) {
            this.zzm = false;
        }
    }
}

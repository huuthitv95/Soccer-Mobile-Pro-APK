package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzarh implements zzarg {
    private final zzafs zza;
    private final zzahb zzb;
    private final zzark zzc;
    private final zzv zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzarh(zzafs zzafsVar, zzahb zzahbVar, zzark zzarkVar, String str, int i) throws zzat {
        this.zza = zzafsVar;
        this.zzb = zzahbVar;
        this.zzc = zzarkVar;
        int i2 = zzarkVar.zzb * zzarkVar.zze;
        int i3 = zzarkVar.zzd;
        int i4 = i2 / 8;
        if (i3 != i4) {
            StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 28 + String.valueOf(i3).length());
            sb.append("Expected block size: ");
            sb.append(i4);
            sb.append("; got: ");
            sb.append(i3);
            throw zzat.zzb(sb.toString(), null);
        }
        int i5 = zzarkVar.zzc * i4;
        int i6 = i5 * 8;
        int iMax = Math.max(i4, i5 / 10);
        this.zze = iMax;
        zzt zztVar = new zzt();
        zztVar.zzn("audio/wav");
        zztVar.zzo(str);
        zztVar.zzi(i6);
        zztVar.zzj(i6);
        zztVar.zzp(iMax);
        zztVar.zzG(zzarkVar.zzb);
        zztVar.zzH(zzarkVar.zzc);
        zztVar.zzI(i);
        this.zzd = zztVar.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzarg
    public final void zza(long j) {
        this.zzf = j;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzarg
    public final void zzb(int i, long j) {
        zzarn zzarnVar = new zzarn(this.zzc, 1, i, j);
        this.zza.zzw(zzarnVar);
        zzahb zzahbVar = this.zzb;
        zzahbVar.zzA(this.zzd);
        zzahbVar.zzO(zzarnVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzarg
    public final boolean zzc(zzafq zzafqVar, long j) throws IOException {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.zzg) < (i2 = this.zze)) {
            int iZza = this.zzb.zza(zzafqVar, (int) Math.min(i2 - i, j2), true);
            if (iZza == -1) {
                j2 = 0;
            } else {
                this.zzg += iZza;
                j2 -= (long) iZza;
            }
        }
        zzark zzarkVar = this.zzc;
        int i3 = this.zzg;
        int i4 = zzarkVar.zzd;
        int i5 = i3 / i4;
        if (i5 > 0) {
            long jZzv = this.zzf + zzfk.zzv(this.zzh, 1000000L, zzarkVar.zzc, RoundingMode.DOWN);
            int i6 = i5 * i4;
            int i7 = this.zzg - i6;
            this.zzb.zze(jZzv, 1, i6, i7, null);
            this.zzh += (long) i5;
            this.zzg = i7;
        }
        return j2 <= 0;
    }
}

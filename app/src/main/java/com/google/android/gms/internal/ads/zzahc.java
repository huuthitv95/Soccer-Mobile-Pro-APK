package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzahc {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzb(zzafq zzafqVar) throws IOException {
        if (this.zzb) {
            return;
        }
        byte[] bArr = this.zza;
        zzafqVar.zzi(bArr, 0, 10);
        zzafqVar.zzl();
        int i = zzaeq.zza;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.zzb = true;
        }
    }

    public final void zzc(zzahb zzahbVar, long j, int i, int i2, int i3, zzaha zzahaVar) {
        zzgsw.zzj(this.zzg <= i2 + i3, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.zzb) {
            int i4 = this.zzc;
            int i5 = i4 + 1;
            this.zzc = i5;
            if (i4 == 0) {
                this.zzd = j;
                this.zze = i;
                this.zzf = 0;
            }
            this.zzf += i2;
            this.zzg = i3;
            if (i5 >= 16) {
                zzd(zzahbVar, zzahaVar);
            }
        }
    }

    public final void zzd(zzahb zzahbVar, zzaha zzahaVar) {
        if (this.zzc > 0) {
            zzahbVar.zze(this.zzd, this.zze, this.zzf, this.zzg, zzahaVar);
            this.zzc = 0;
        }
    }
}

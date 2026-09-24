package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzamm {
    private final zzamn zza = new zzamn();
    private final zzes zzb = new zzes(new byte[65025], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    zzamm() {
    }

    private final int zzf(int i) {
        int i2;
        int i3 = 0;
        this.zzd = 0;
        do {
            int i4 = this.zzd;
            int i5 = i + i4;
            zzamn zzamnVar = this.zza;
            if (i5 >= zzamnVar.zzc) {
                break;
            }
            this.zzd = i4 + 1;
            i2 = zzamnVar.zzf[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final void zza() {
        this.zza.zza();
        this.zzb.zza(0);
        this.zzc = -1;
        this.zze = false;
    }

    public final zzamn zzc() {
        return this.zza;
    }

    public final zzes zzd() {
        return this.zzb;
    }

    public final void zze() {
        zzes zzesVar = this.zzb;
        if (zzesVar.zzi().length == 65025) {
            return;
        }
        zzesVar.zzb(Arrays.copyOf(zzesVar.zzi(), Math.max(65025, zzesVar.zze())), zzesVar.zze());
    }

    public final boolean zzb(zzafq zzafqVar) throws IOException {
        if (this.zze) {
            this.zze = false;
            this.zzb.zza(0);
        }
        while (true) {
            if (this.zze) {
                return true;
            }
            int i = this.zzc;
            if (i < 0) {
                zzamn zzamnVar = this.zza;
                if (!zzamnVar.zzb(zzafqVar, -1L) || !zzamnVar.zzc(zzafqVar, true)) {
                    return false;
                }
                int iZzf = zzamnVar.zzd;
                if ((zzamnVar.zza & 1) == 1 && this.zzb.zze() == 0) {
                    iZzf += zzf(0);
                    i = this.zzd;
                } else {
                    i = 0;
                }
                if (!zzaft.zzd(zzafqVar, iZzf)) {
                    return false;
                }
                this.zzc = i;
            }
            int iZzf2 = zzf(i);
            int i2 = this.zzc + this.zzd;
            if (iZzf2 > 0) {
                zzes zzesVar = this.zzb;
                zzesVar.zzc(zzesVar.zze() + iZzf2);
                if (!zzaft.zzc(zzafqVar, zzesVar.zzi(), zzesVar.zze(), iZzf2)) {
                    return false;
                }
                zzesVar.zzf(zzesVar.zze() + iZzf2);
                this.zze = this.zza.zzf[i2 + (-1)] != 255;
            }
            if (i2 == this.zza.zzc) {
                i2 = -1;
            }
            this.zzc = i2;
        }
    }
}

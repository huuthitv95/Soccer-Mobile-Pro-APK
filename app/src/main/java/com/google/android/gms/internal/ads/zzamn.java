package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzamn {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzes zzg = new zzes(255);

    zzamn() {
    }

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzafq zzafqVar, long j) throws IOException {
        zzgsw.zza(zzafqVar.zzn() == zzafqVar.zzm());
        zzes zzesVar = this.zzg;
        zzesVar.zza(4);
        while (true) {
            if ((j != -1 && zzafqVar.zzn() + 4 >= j) || !zzaft.zze(zzafqVar, zzesVar.zzi(), 0, 4, true)) {
                break;
            }
            zzesVar.zzh(0);
            if (zzesVar.zzz() == 1332176723) {
                zzafqVar.zzl();
                return true;
            }
            zzafqVar.zzf(1);
        }
        do {
            if (j != -1 && zzafqVar.zzn() >= j) {
                break;
            }
        } while (zzafqVar.zzd(1) != -1);
        return false;
    }

    public final boolean zzc(zzafq zzafqVar, boolean z) throws IOException {
        zza();
        zzes zzesVar = this.zzg;
        zzesVar.zza(27);
        if (zzaft.zze(zzafqVar, zzesVar.zzi(), 0, 27, z) && zzesVar.zzz() == 1332176723) {
            if (zzesVar.zzs() != 0) {
                if (z) {
                    return false;
                }
                throw zzat.zzc("unsupported bit stream revision");
            }
            this.zza = zzesVar.zzs();
            this.zzb = zzesVar.zzE();
            zzesVar.zzA();
            zzesVar.zzA();
            zzesVar.zzA();
            int iZzs = zzesVar.zzs();
            this.zzc = iZzs;
            this.zzd = iZzs + 27;
            zzesVar.zza(iZzs);
            if (zzaft.zze(zzafqVar, zzesVar.zzi(), 0, this.zzc, z)) {
                for (int i = 0; i < this.zzc; i++) {
                    int[] iArr = this.zzf;
                    int iZzs2 = zzesVar.zzs();
                    iArr[i] = iZzs2;
                    this.zze += iZzs2;
                }
                return true;
            }
        }
        return false;
    }
}

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaph implements zzafp {
    private final zzapi zza;
    private final zzes zzb;
    private final zzes zzc;
    private final zzer zzd;
    private zzafs zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        int i = zzapg.zza;
    }

    public zzaph() {
        throw null;
    }

    public zzaph(int i) {
        this.zza = new zzapi(true, null, 0, "audio/mp4a-latm");
        this.zzb = new zzes(2048);
        this.zzg = -1L;
        zzes zzesVar = new zzes(10);
        this.zzc = zzesVar;
        byte[] bArrZzi = zzesVar.zzi();
        this.zzd = new zzer(bArrZzi, bArrZzi.length);
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final boolean zza(zzafq zzafqVar) throws IOException {
        zzes zzesVar;
        zzafg zzafgVar;
        int i = 0;
        while (true) {
            zzesVar = this.zzc;
            zzafgVar = (zzafg) zzafqVar;
            zzafgVar.zzh(zzesVar.zzi(), 0, 10, false);
            zzesVar.zzh(0);
            if (zzesVar.zzx() != 4801587) {
                break;
            }
            zzesVar.zzk(3);
            int iZzG = zzesVar.zzG();
            i += iZzG + 10;
            zzafgVar.zzj(iZzG, false);
        }
        zzafqVar.zzl();
        zzafgVar.zzj(i, false);
        if (this.zzg == -1) {
            this.zzg = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            zzafgVar.zzh(zzesVar.zzi(), 0, 2, false);
            zzesVar.zzh(0);
            if (zzapi.zzf(zzesVar.zzt())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                zzafgVar.zzh(zzesVar.zzi(), 0, 4, false);
                zzer zzerVar = this.zzd;
                zzerVar.zzf(14);
                int iZzj = zzerVar.zzj(13);
                if (iZzj <= 6) {
                    i4++;
                    zzafqVar.zzl();
                    zzafgVar.zzj(i4, false);
                } else {
                    zzafgVar.zzj(iZzj - 6, false);
                    i3 += iZzj;
                }
            } else {
                i4++;
                zzafqVar.zzl();
                zzafgVar.zzj(i4, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public /* synthetic */ List zzb() {
        return zzgvz.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzc(zzafs zzafsVar) {
        this.zze = zzafsVar;
        this.zza.zzb(zzafsVar, new zzara(Integer.MIN_VALUE, 0, 1));
        zzafsVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final int zzd(zzafq zzafqVar, zzagp zzagpVar) throws IOException {
        this.zze.getClass();
        zzes zzesVar = this.zzb;
        int iZza = zzafqVar.zza(zzesVar.zzi(), 0, 2048);
        if (!this.zzi) {
            this.zze.zzw(new zzagr(-9223372036854775807L, 0L));
            this.zzi = true;
        }
        if (iZza == -1) {
            return -1;
        }
        zzesVar.zzh(0);
        zzesVar.zzf(iZza);
        if (!this.zzh) {
            this.zza.zzc(this.zzf, 4);
            this.zzh = true;
        }
        this.zza.zzd(zzesVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zze(long j, long j2) {
        this.zzh = false;
        this.zza.zza();
        this.zzf = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public /* synthetic */ zzafp zzg() {
        return zzafp.CC.$default$zzg(this);
    }
}

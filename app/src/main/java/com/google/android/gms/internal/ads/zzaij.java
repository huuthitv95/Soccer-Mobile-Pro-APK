package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzaij implements zzafp {
    private zzafs zzb;
    private zzaiq zzc;
    private zzafq zzd;
    private zzagx zze;
    private zzalv zzf;
    private int zzh;
    private long zzi;
    private int zzj;
    private final zzes zza = new zzes(16);
    private long zzk = -1;
    private int zzg = 0;

    @Override // com.google.android.gms.internal.ads.zzafp
    public final boolean zza(zzafq zzafqVar) throws IOException {
        int i;
        zzes zzesVar = new zzes(16);
        boolean z = true;
        while (true) {
            zzesVar.zza(8);
            if (!zzafqVar.zzh(zzesVar.zzi(), 0, 8, true)) {
                return false;
            }
            long jZzz = zzesVar.zzz();
            int iZzB = zzesVar.zzB();
            if (jZzz != 1) {
                i = 8;
            } else {
                if (!zzafqVar.zzh(zzesVar.zzi(), 8, 8, true)) {
                    return false;
                }
                jZzz = zzesVar.zzJ();
                i = 16;
            }
            long j = i;
            if (jZzz < j) {
                return false;
            }
            int i2 = (int) (jZzz - j);
            if (z) {
                if (iZzB != 1718909296 || i2 < 8) {
                    return false;
                }
                zzesVar.zza(4);
                zzafg zzafgVar = (zzafg) zzafqVar;
                zzafgVar.zzh(zzesVar.zzi(), 0, 4, false);
                if (zzesVar.zzB() != 1751476579) {
                    return false;
                }
                zzafgVar.zzj(i2 - 4, false);
            } else {
                if (iZzB == 1836086884) {
                    return true;
                }
                if (i2 != 0) {
                    ((zzafg) zzafqVar).zzj(i2, false);
                }
            }
            z = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public /* synthetic */ List zzb() {
        return zzgvz.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzc(zzafs zzafsVar) {
        this.zzb = zzafsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzf() {
        if (this.zzf != null) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public /* synthetic */ zzafp zzg() {
        return zzafp.CC.$default$zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zze(long j, long j2) {
        if (j != 0) {
            if (this.zzg == 3) {
                zzalv zzalvVar = this.zzf;
                zzalvVar.getClass();
                zzalvVar.zze(j, j2);
                return;
            }
            return;
        }
        this.zzg = 0;
        this.zzj = 0;
        this.zzk = -1L;
        if (this.zzf != null) {
            this.zzf = null;
        }
    }

    private final void zzh() {
        zzafs zzafsVar = this.zzb;
        zzafsVar.getClass();
        zzafsVar.zzv();
        this.zzb.zzw(new zzagr(-9223372036854775807L, 0L));
        this.zzg = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final int zzd(zzafq zzafqVar, zzagp zzagpVar) throws IOException {
        while (true) {
            int i = this.zzg;
            if (i == 0) {
                if (this.zzj == 0) {
                    zzes zzesVar = this.zza;
                    if (!zzafqVar.zzb(zzesVar.zzi(), 0, 8, true)) {
                        zzh();
                        return -1;
                    }
                    this.zzj = 8;
                    zzesVar.zzh(0);
                    this.zzi = zzesVar.zzz();
                    this.zzh = zzesVar.zzB();
                }
                long jZzJ = this.zzi;
                if (jZzJ == 1) {
                    zzes zzesVar2 = this.zza;
                    zzafqVar.zzc(zzesVar2.zzi(), 8, 8);
                    this.zzj += 8;
                    jZzJ = zzesVar2.zzJ();
                    this.zzi = jZzJ;
                }
                if (this.zzh == 1836086884) {
                    long jZzn = zzafqVar.zzn();
                    this.zzk = jZzn;
                    long j = this.zzj;
                    zzaiq zzaiqVar = new zzaiq(0L, jZzn - j, -9223372036854775807L, jZzn, jZzJ - j);
                    this.zzc = zzaiqVar;
                    zzafs zzafsVar = this.zzb;
                    zzafsVar.getClass();
                    zzahb zzahbVarZzu = zzafsVar.zzu(1024, 4);
                    zzt zztVar = new zzt();
                    zztVar.zzn(MimeTypes.IMAGE_HEIC);
                    zztVar.zzl(new zzap(-9223372036854775807L, zzaiqVar));
                    zzahbVarZzu.zzA(zztVar.zzO());
                    this.zzg = 2;
                } else {
                    this.zzg = 1;
                }
            } else if (i == 1) {
                zzafqVar.zzf((int) (this.zzi - ((long) this.zzj)));
                this.zzj = 0;
                this.zzg = 0;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        return -1;
                    }
                    if (this.zze == null || zzafqVar != this.zzd) {
                        this.zzd = zzafqVar;
                        this.zze = new zzagx(zzafqVar, this.zzk);
                    }
                    zzalv zzalvVar = this.zzf;
                    zzalvVar.getClass();
                    int iZzd = zzalvVar.zzd(this.zze, zzagpVar);
                    if (iZzd == 1) {
                        zzagpVar.zza += this.zzk;
                    }
                    return iZzd;
                }
                if (this.zzf == null) {
                    this.zzf = new zzalv(zzanc.zza, 8);
                }
                zzagx zzagxVar = new zzagx(zzafqVar, this.zzk);
                this.zze = zzagxVar;
                if (this.zzf.zza(zzagxVar)) {
                    zzalv zzalvVar2 = this.zzf;
                    long j2 = this.zzk;
                    zzafs zzafsVar2 = this.zzb;
                    zzafsVar2.getClass();
                    zzalvVar2.zzc(new zzagz(j2, zzafsVar2));
                    this.zzg = 3;
                } else {
                    zzh();
                }
            }
        }
    }
}

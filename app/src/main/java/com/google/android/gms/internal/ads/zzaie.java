package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaie implements zzafp {
    private zzafs zzf;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private zzaic zzo;
    private zzaii zzp;
    private final zzes zza = new zzes(4);
    private final zzes zzb = new zzes(9);
    private final zzes zzc = new zzes(11);
    private final zzes zzd = new zzes();
    private final zzaif zze = new zzaif();
    private int zzg = 1;

    static {
        int i = zzaid.zza;
    }

    private final zzes zzh(zzafq zzafqVar) throws IOException {
        zzes zzesVar = this.zzd;
        if (this.zzl > zzesVar.zzj()) {
            int iZzj = zzesVar.zzj();
            zzesVar.zzb(new byte[Math.max(iZzj + iZzj, this.zzl)], 0);
        } else {
            zzesVar.zzh(0);
        }
        zzesVar.zzf(this.zzl);
        zzafqVar.zzc(zzesVar.zzi(), 0, this.zzl);
        return zzesVar;
    }

    @RequiresNonNull({"extractorOutput"})
    private final void zzi() {
        if (this.zzn) {
            return;
        }
        this.zzf.zzw(new zzagr(-9223372036854775807L, 0L));
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final boolean zza(zzafq zzafqVar) throws IOException {
        zzes zzesVar = this.zza;
        zzafg zzafgVar = (zzafg) zzafqVar;
        zzafgVar.zzh(zzesVar.zzi(), 0, 3, false);
        zzesVar.zzh(0);
        if (zzesVar.zzx() != 4607062) {
            return false;
        }
        zzafgVar.zzh(zzesVar.zzi(), 0, 2, false);
        zzesVar.zzh(0);
        if ((zzesVar.zzt() & ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION) != 0) {
            return false;
        }
        zzafgVar.zzh(zzesVar.zzi(), 0, 4, false);
        zzesVar.zzh(0);
        int iZzB = zzesVar.zzB();
        zzafqVar.zzl();
        zzafgVar.zzj(iZzB, false);
        zzafgVar.zzh(zzesVar.zzi(), 0, 4, false);
        zzesVar.zzh(0);
        return zzesVar.zzB() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public /* synthetic */ List zzb() {
        return zzgvz.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzc(zzafs zzafsVar) {
        this.zzf = zzafsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zze(long j, long j2) {
        if (j == 0) {
            this.zzg = 1;
            this.zzh = false;
        } else {
            this.zzg = 3;
        }
        this.zzj = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public /* synthetic */ zzafp zzg() {
        return zzafp.CC.$default$zzg(this);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:40:0x00af  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzafp
    public final int zzd(zzafq zzafqVar, zzagp zzagpVar) throws IOException {
        long j;
        boolean zZzf;
        boolean z;
        long j2;
        this.zzf.getClass();
        while (true) {
            int i = this.zzg;
            int i2 = 8;
            if (i == 1) {
                zzes zzesVar = this.zzb;
                if (!zzafqVar.zzb(zzesVar.zzi(), 0, 9, true)) {
                    return -1;
                }
                zzesVar.zzh(0);
                zzesVar.zzk(4);
                int iZzs = zzesVar.zzs();
                int i3 = iZzs & 4;
                int i4 = iZzs & 1;
                if (i3 != 0 && this.zzo == null) {
                    this.zzo = new zzaic(this.zzf.zzu(8, 1));
                }
                if (i4 != 0 && this.zzp == null) {
                    this.zzp = new zzaii(this.zzf.zzu(9, 2));
                }
                this.zzf.zzv();
                this.zzj = zzesVar.zzB() - 5;
                this.zzg = 2;
            } else if (i == 2) {
                zzafqVar.zzf(this.zzj);
                this.zzj = 0;
                this.zzg = 3;
            } else if (i == 3) {
                zzes zzesVar2 = this.zzc;
                if (!zzafqVar.zzb(zzesVar2.zzi(), 0, 11, true)) {
                    return -1;
                }
                zzesVar2.zzh(0);
                this.zzk = zzesVar2.zzs();
                this.zzl = zzesVar2.zzx();
                this.zzm = zzesVar2.zzx();
                this.zzm = (this.zzm | ((long) (zzesVar2.zzs() << 24))) * 1000;
                zzesVar2.zzk(3);
                this.zzg = 4;
            } else {
                if (i != 4) {
                    throw new IllegalStateException();
                }
                if (this.zzh) {
                    j = this.zzi + this.zzm;
                } else {
                    j = this.zze.zzc() == -9223372036854775807L ? 0L : this.zzm;
                }
                int i5 = this.zzk;
                if (i5 == 8) {
                    if (this.zzo != null) {
                        zzi();
                        zZzf = this.zzo.zzf(zzh(zzafqVar), j);
                    }
                    z = true;
                    if (!this.zzh && zZzf) {
                        this.zzh = true;
                        if (this.zze.zzc() == -9223372036854775807L) {
                            j2 = -this.zzm;
                        } else {
                            j2 = 0;
                        }
                        this.zzi = j2;
                    }
                    this.zzj = 4;
                    this.zzg = 2;
                    if (z) {
                        return 0;
                    }
                } else {
                    i2 = i5;
                }
                if (i2 == 9) {
                    if (this.zzp != null) {
                        zzi();
                        zZzf = this.zzp.zzf(zzh(zzafqVar), j);
                        z = true;
                    } else {
                        zzafqVar.zzf(this.zzl);
                        zZzf = false;
                        z = false;
                    }
                } else if (i2 != 18 || this.zzn) {
                    zzafqVar.zzf(this.zzl);
                    zZzf = false;
                    z = false;
                } else {
                    zzaif zzaifVar = this.zze;
                    zZzf = zzaifVar.zzf(zzh(zzafqVar), j);
                    long jZzc = zzaifVar.zzc();
                    if (jZzc != -9223372036854775807L) {
                        this.zzf.zzw(new zzagl(zzaifVar.zze(), zzaifVar.zzd(), jZzc));
                        this.zzn = true;
                    }
                    z = true;
                }
                if (!this.zzh) {
                    this.zzh = true;
                    if (this.zze.zzc() == -9223372036854775807L) {
                        j2 = -this.zzm;
                    } else {
                        j2 = 0;
                    }
                    this.zzi = j2;
                }
                this.zzj = 4;
                this.zzg = 2;
                if (z) {
                    return 0;
                }
            }
        }
    }
}

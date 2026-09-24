package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgs {
    public final boolean zza;
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;
    public final boolean zze;
    public final int zzf;
    public final int zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final boolean zzj;
    public final boolean zzk;
    public final byte zzl;
    public final byte zzm;

    /* JADX WARN: Code duplicated, block: B:68:0x011f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0127  */
    private zzgs(zzgr zzgrVar) throws zzgq {
        byte bZzj;
        boolean zZzi = false;
        zzgsw.zza(zzgrVar.zza == 1);
        int iRemaining = zzgrVar.zzb.remaining();
        byte[] bArr = new byte[iRemaining];
        zzgrVar.zzb.asReadOnlyBuffer().get(bArr);
        zzer zzerVar = new zzer(bArr, iRemaining);
        this.zzg = zzerVar.zzj(3);
        zzerVar.zzg();
        boolean zZzi2 = zzerVar.zzi();
        this.zza = zZzi2;
        if (zZzi2) {
            zzerVar.zzj(5);
            this.zzb = false;
            this.zzh = false;
        } else {
            if (zzerVar.zzi()) {
                zzerVar.zzh(64);
                if (zzerVar.zzi()) {
                    int i = 0;
                    while (!zzerVar.zzi()) {
                        i++;
                    }
                    if (i < 32) {
                        zzerVar.zzh(i);
                    }
                }
                boolean zZzi3 = zzerVar.zzi();
                this.zzb = zZzi3;
                if (zZzi3) {
                    zzerVar.zzh(47);
                }
            } else {
                this.zzb = false;
            }
            this.zzh = zzerVar.zzi();
            int iZzj = zzerVar.zzj(5);
            for (int i2 = 0; i2 <= iZzj; i2++) {
                zzerVar.zzh(12);
                if (i2 == 0) {
                    if (zzerVar.zzj(5) > 7) {
                        zzerVar.zzi();
                    }
                } else if (zzerVar.zzj(5) > 7) {
                    zzerVar.zzg();
                }
                if (this.zzb) {
                    zzerVar.zzg();
                }
                if (this.zzh && zzerVar.zzi()) {
                    if (i2 == 0) {
                        zzerVar.zzj(4);
                    } else {
                        zzerVar.zzh(4);
                    }
                }
            }
        }
        int iZzj2 = zzerVar.zzj(4);
        int iZzj3 = zzerVar.zzj(4);
        zzerVar.zzh(iZzj2 + 1);
        zzerVar.zzh(iZzj3 + 1);
        if (this.zza) {
            this.zzc = false;
        } else {
            boolean zZzi4 = zzerVar.zzi();
            this.zzc = zZzi4;
            if (zZzi4) {
                zzerVar.zzh(4);
                zzerVar.zzh(3);
            }
        }
        zzerVar.zzh(3);
        if (this.zza) {
            this.zze = true;
            this.zzd = true;
            this.zzf = 0;
        } else {
            zzerVar.zzh(4);
            boolean zZzi5 = zzerVar.zzi();
            if (zZzi5) {
                zzerVar.zzh(2);
            }
            if (zzerVar.zzi()) {
                this.zzd = true;
            } else {
                boolean zZzi6 = zzerVar.zzi();
                this.zzd = zZzi6;
                if (!zZzi6) {
                    this.zze = true;
                }
                if (zZzi5) {
                    this.zzf = zzerVar.zzj(3) + 1;
                } else {
                    this.zzf = 0;
                }
            }
            if (zzerVar.zzi()) {
                this.zze = true;
            } else {
                this.zze = zzerVar.zzi();
            }
            if (zZzi5) {
                this.zzf = zzerVar.zzj(3) + 1;
            } else {
                this.zzf = 0;
            }
        }
        zzerVar.zzh(3);
        boolean zZzi7 = zzerVar.zzi();
        if (this.zzg == 2 && zZzi7) {
            this.zzi = zzerVar.zzi();
        } else {
            this.zzi = false;
        }
        if (this.zzg != 1) {
            this.zzj = zzerVar.zzi();
        } else {
            this.zzj = false;
        }
        if (zzerVar.zzi()) {
            this.zzl = (byte) zzerVar.zzj(8);
            this.zzm = (byte) zzerVar.zzj(8);
            bZzj = (byte) zzerVar.zzj(8);
        } else {
            this.zzl = (byte) 0;
            this.zzm = (byte) 0;
            bZzj = 0;
        }
        if (this.zzj) {
            zzerVar.zzg();
            this.zzk = false;
        } else if (this.zzl == 1 && this.zzm == 13 && bZzj == 0) {
            this.zzk = false;
        } else {
            zzerVar.zzg();
            int i3 = this.zzg;
            if (i3 == 0) {
                this.zzk = true;
                zZzi = true;
            } else if (i3 == 1) {
                this.zzk = false;
            } else if (this.zzi) {
                boolean zZzi8 = zzerVar.zzi();
                this.zzk = zZzi8;
                if (zZzi8) {
                    zZzi = zzerVar.zzi();
                }
            } else {
                this.zzk = true;
            }
            if (this.zzk && zZzi) {
                zzerVar.zzj(2);
            }
        }
        zzerVar.zzg();
    }

    public static zzgs zza(zzgr zzgrVar) {
        try {
            return new zzgs(zzgrVar);
        } catch (zzgq unused) {
            return null;
        }
    }
}

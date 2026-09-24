package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzpn {
    final /* synthetic */ zzpo zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzxc zze;
    private boolean zzf;
    private boolean zzg;

    public zzpn(zzpo zzpoVar, String str, int i, zzxc zzxcVar) {
        Objects.requireNonNull(zzpoVar);
        this.zza = zzpoVar;
        this.zzb = str;
        this.zzc = i;
        this.zzd = zzxcVar == null ? -1L : zzxcVar.zzd;
        if (zzxcVar == null || !zzxcVar.zzb()) {
            return;
        }
        this.zze = zzxcVar;
    }

    public final boolean zza(zzbf zzbfVar, zzbf zzbfVar2) {
        int i = this.zzc;
        if (i < zzbfVar.zza()) {
            zzpo zzpoVar = this.zza;
            zzbfVar.zzb(i, zzpoVar.zzj(), 0L);
            int i2 = zzpoVar.zzj().zzn;
            while (true) {
                if (i2 > zzpoVar.zzj().zzo) {
                    i = -1;
                    break;
                }
                int iZze = zzbfVar2.zze(zzbfVar.zzf(i2));
                if (iZze != -1) {
                    i = zzbfVar2.zzd(iZze, zzpoVar.zzk(), false).zzc;
                    break;
                }
                i2++;
            }
        } else if (i >= zzbfVar2.zza()) {
            i = -1;
            break;
        }
        this.zzc = i;
        if (i == -1) {
            return false;
        }
        zzxc zzxcVar = this.zze;
        return zzxcVar == null || zzbfVar2.zze(zzxcVar.zza) != -1;
    }

    public final boolean zzb(int i, zzxc zzxcVar) {
        if (zzxcVar != null) {
            long j = zzxcVar.zzd;
            if (j != -1) {
                zzxc zzxcVar2 = this.zze;
                if (zzxcVar2 == null) {
                    return !zzxcVar.zzb() && j == this.zzd;
                }
                return j == zzxcVar2.zzd && zzxcVar.zzb == zzxcVar2.zzb && zzxcVar.zzc == zzxcVar2.zzc;
            }
        }
        return i == this.zzc;
    }

    public final void zzc(int i, zzxc zzxcVar) {
        if (this.zzd == -1 && i == this.zzc && zzxcVar != null) {
            zzpo zzpoVar = this.zza;
            long j = zzxcVar.zzd;
            if (j >= zzpoVar.zzi()) {
                this.zzd = j;
            }
        }
    }

    public final boolean zzd(zznh zznhVar) {
        zzxc zzxcVar = zznhVar.zzd;
        if (zzxcVar == null) {
            return this.zzc != zznhVar.zzc;
        }
        long j = this.zzd;
        if (j == -1) {
            return false;
        }
        long j2 = zzxcVar.zzd;
        if (j2 > j) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzbf zzbfVar = zznhVar.zzb;
        int iZze = zzbfVar.zze(zzxcVar.zza);
        int iZze2 = zzbfVar.zze(this.zze.zza);
        zzxc zzxcVar2 = this.zze;
        if (j2 < zzxcVar2.zzd || iZze < iZze2) {
            return false;
        }
        if (iZze > iZze2) {
            return true;
        }
        if (!zzxcVar.zzb()) {
            int i = zzxcVar.zze;
            return i == -1 || i > zzxcVar2.zzb;
        }
        int i2 = zzxcVar.zzb;
        int i3 = zzxcVar.zzc;
        int i4 = zzxcVar2.zzb;
        if (i2 <= i4) {
            return i2 == i4 && i3 > zzxcVar2.zzc;
        }
        return true;
    }

    final /* synthetic */ String zze() {
        return this.zzb;
    }

    final /* synthetic */ int zzf() {
        return this.zzc;
    }

    final /* synthetic */ long zzg() {
        return this.zzd;
    }

    final /* synthetic */ zzxc zzh() {
        return this.zze;
    }

    final /* synthetic */ boolean zzi() {
        return this.zzf;
    }

    final /* synthetic */ void zzj(boolean z) {
        this.zzf = true;
    }

    final /* synthetic */ boolean zzk() {
        return this.zzg;
    }

    final /* synthetic */ void zzl(boolean z) {
        this.zzg = true;
    }
}

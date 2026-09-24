package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhdl {
    private static final zzhdj zza = zzhdk.zza;
    private final zzhdc zzb;
    private final zzhde zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzhdj zzg;
    private final int zzh;

    /* synthetic */ zzhdl(zzhdc zzhdcVar, int i, int i2, boolean z, boolean z2, zzhdj zzhdjVar, byte[] bArr) {
        this.zzb = zzhdcVar;
        this.zzh = i;
        int i3 = i - 2;
        this.zzc = i3 != 1 ? i3 != 3 ? zzhde.zzb : zzhde.zzc : zzhde.zza;
        this.zzd = i2;
        this.zze = z;
        this.zzf = z2;
        this.zzg = zzhdjVar;
    }

    public final zzhdc zza() {
        this.zzg.zza(this);
        return this.zzb;
    }

    public final zzhde zzb() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final boolean zzd() {
        return this.zze;
    }

    final /* synthetic */ zzhdc zzf() {
        return this.zzb;
    }

    final /* synthetic */ int zzg() {
        return this.zzd;
    }

    final /* synthetic */ boolean zzh() {
        return this.zze;
    }

    final /* synthetic */ boolean zzi() {
        return this.zzf;
    }

    final /* synthetic */ int zzj() {
        return this.zzh;
    }
}

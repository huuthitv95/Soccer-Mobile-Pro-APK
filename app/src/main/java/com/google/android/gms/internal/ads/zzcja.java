package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcja implements zzls {
    private final zzabj zza = new zzabj(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    zzcja() {
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zza(zzpz zzpzVar) {
        zzo(false);
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzb(zzlr zzlrVar, zzzf zzzfVar, zzaas[] zzaasVarArr) {
        int i;
        this.zzf = 0;
        for (zzaas zzaasVar : zzaasVarArr) {
            if (zzaasVar != null) {
                int i2 = this.zzf;
                int i3 = zzaasVar.zza().zzc;
                if (i3 == 0) {
                    i = 144310272;
                } else if (i3 == 1) {
                    i = 13107200;
                } else if (i3 != 2) {
                    i = 131072;
                    if (i3 != 3 && i3 != 5 && i3 != 6) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i = 131072000;
                }
                this.zzf = i2 + i;
            }
        }
        this.zza.zzf(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzc(zzpz zzpzVar) {
        zzo(true);
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzd(zzpz zzpzVar) {
        zzo(true);
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final zzabd zze(zzpz zzpzVar) {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final long zzf(zzpz zzpzVar) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final boolean zzg(zzpz zzpzVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final boolean zzh(zzlr zzlrVar) {
        char c;
        long j = zzlrVar.zze;
        boolean z = true;
        if (j > this.zzc) {
            c = 0;
        } else {
            c = j < this.zzb ? (char) 2 : (char) 1;
        }
        int iZzg = this.zza.zzg();
        int i = this.zzf;
        if (c != 2 && (c != 1 || !this.zzg || iZzg >= i)) {
            z = false;
        }
        this.zzg = z;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final boolean zzi(zzlr zzlrVar) {
        long j = zzlrVar.zzg ? this.zze : this.zzd;
        return j <= 0 || zzlrVar.zze >= j;
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public /* synthetic */ boolean zzj(zzpz zzpzVar, zzbf zzbfVar, zzxc zzxcVar, long j) {
        return zzls.CC.$default$zzj(this, zzpzVar, zzbfVar, zzxcVar, j);
    }

    public final synchronized void zzk(int i) {
        this.zzb = ((long) i) * 1000;
    }

    public final synchronized void zzl(int i) {
        this.zzc = ((long) i) * 1000;
    }

    public final synchronized void zzm(int i) {
        this.zzd = ((long) i) * 1000;
    }

    public final synchronized void zzn(int i) {
        this.zze = ((long) i) * 1000;
    }

    final void zzo(boolean z) {
        this.zzf = 0;
        this.zzg = false;
        if (z) {
            this.zza.zze();
        }
    }
}

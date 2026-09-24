package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzabj implements zzabd {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzabb[] zzd = new zzabb[100];

    public zzabj(boolean z, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzabd
    public final synchronized zzabb zza() {
        zzabb zzabbVar;
        this.zzb++;
        int i = this.zzc;
        if (i > 0) {
            zzabb[] zzabbVarArr = this.zzd;
            int i2 = i - 1;
            this.zzc = i2;
            zzabbVar = zzabbVarArr[i2];
            if (zzabbVar == null) {
                throw null;
            }
            zzabbVarArr[i2] = null;
        } else {
            zzabbVar = new zzabb(new byte[65536], 0);
            int i3 = this.zzb;
            zzabb[] zzabbVarArr2 = this.zzd;
            int length = zzabbVarArr2.length;
            if (i3 > length) {
                this.zzd = (zzabb[]) Arrays.copyOf(zzabbVarArr2, length + length);
                return zzabbVar;
            }
        }
        return zzabbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabd
    public final synchronized void zzb(zzabb zzabbVar) {
        zzabb[] zzabbVarArr = this.zzd;
        int i = this.zzc;
        this.zzc = i + 1;
        zzabbVarArr[i] = zzabbVar;
        this.zzb--;
        notifyAll();
    }

    @Override // com.google.android.gms.internal.ads.zzabd
    public final synchronized void zzc(zzabc zzabcVar) {
        while (zzabcVar != null) {
            zzabb[] zzabbVarArr = this.zzd;
            int i = this.zzc;
            this.zzc = i + 1;
            zzabbVarArr[i] = zzabcVar.zzd();
            this.zzb--;
            zzabcVar = zzabcVar.zze();
        }
        notifyAll();
    }

    @Override // com.google.android.gms.internal.ads.zzabd
    public final synchronized void zzd() {
        int i = this.zza;
        String str = zzfk.zza;
        int iMax = Math.max(0, ((i + 65535) / 65536) - this.zzb);
        int i2 = this.zzc;
        if (iMax >= i2) {
            return;
        }
        Arrays.fill(this.zzd, iMax, i2, (Object) null);
        this.zzc = iMax;
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i) {
        int i2 = this.zza;
        this.zza = i;
        if (i < i2) {
            zzd();
        }
    }

    public final synchronized int zzg() {
        return this.zzb * 65536;
    }
}

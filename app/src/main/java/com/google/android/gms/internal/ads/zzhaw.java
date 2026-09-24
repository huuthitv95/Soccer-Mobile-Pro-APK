package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzhaw extends zzhak {
    private zzhav zza;

    zzhaw(zzgvv zzgvvVar, boolean z, Executor executor, Callable callable) {
        super(zzgvvVar, z, false);
        this.zza = new zzhau(this, callable, executor);
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzhak
    final void zzA(int i) {
        super.zzA(i);
        if (i == 1) {
            this.zza = null;
        }
    }

    final /* synthetic */ void zzD(zzhav zzhavVar) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhab
    protected final void zzi() {
        zzhav zzhavVar = this.zza;
        if (zzhavVar != null) {
            zzhavVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhak
    final void zzw(int i, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzhak
    final void zzx() {
        zzhav zzhavVar = this.zza;
        if (zzhavVar != null) {
            zzhavVar.zze();
        }
    }
}

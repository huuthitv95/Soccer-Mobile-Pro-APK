package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzffx implements zzetf {
    final /* synthetic */ zzfga zza;

    zzffx(zzfga zzfgaVar) {
        Objects.requireNonNull(zzfgaVar);
        this.zza = zzfgaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final void zza() {
        zzfga zzfgaVar = this.zza;
        synchronized (zzfgaVar) {
            zzfgaVar.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcut zzcutVar = (zzcut) obj;
        zzfga zzfgaVar = this.zza;
        synchronized (zzfgaVar) {
            zzcut zzcutVar2 = zzfgaVar.zza;
            if (zzcutVar2 != null) {
                zzcutVar2.zzd();
            }
            zzfgaVar.zza = zzcutVar;
            zzcutVar.zza(zzfgaVar);
            zzfgaVar.zzO().zzt(new zzcuu(zzcutVar, zzfgaVar, zzfgaVar.zzO(), zzfgaVar.zzV()));
            zzcutVar.zzj();
        }
    }
}

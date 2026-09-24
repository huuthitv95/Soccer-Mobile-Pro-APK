package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzctc implements zzhbf {
    final /* synthetic */ zzctj zza;

    zzctc(zzctj zzctjVar) {
        Objects.requireNonNull(zzctjVar);
        this.zza = zzctjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzctj zzctjVar = this.zza;
        zzctjVar.zzu().zzb(zzctjVar.zzt().zzb(zzctjVar.zzr(), zzctjVar.zzs(), false, "", (String) obj, zzctjVar.zzs().zzc, null, null), true == com.google.android.gms.ads.internal.zzt.zzh().zzs(zzctjVar.zzq()) ? 2 : 1);
    }
}

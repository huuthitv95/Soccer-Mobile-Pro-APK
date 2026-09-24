package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzctd implements zzhbf {
    final /* synthetic */ String zza;
    final /* synthetic */ zzctj zzb;

    zzctd(zzctj zzctjVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzctjVar);
        this.zzb = zzctjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        zzctj zzctjVar = this.zzb;
        zzctjVar.zzu().zza(zzctjVar.zzt().zzb(zzctjVar.zzr(), zzctjVar.zzs(), false, this.zza, null, zzctjVar.zzp(), zzctjVar.zzw(), zzctjVar.zzx()), null);
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = this.zza;
        String str2 = (String) obj;
        zzctj zzctjVar = this.zzb;
        zzctjVar.zzu().zza(zzctjVar.zzt().zzb(zzctjVar.zzr(), zzctjVar.zzs(), false, str, str2, zzctjVar.zzp(), zzctjVar.zzw(), zzctjVar.zzx()), zzctjVar.zzv());
    }
}

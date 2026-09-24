package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzasv implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzasx zzc;

    zzasv(zzasx zzasxVar, String str, long j) {
        this.zza = str;
        this.zzb = j;
        Objects.requireNonNull(zzasxVar);
        this.zzc = zzasxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzasx zzasxVar = this.zzc;
        zzasxVar.zzx().zza(this.zza, this.zzb);
        zzasxVar.zzx().zzb(zzasxVar.toString());
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzfgq implements zzfmv {
    public final zzfhj zza;
    public final zzfhl zzb;
    public final com.google.android.gms.ads.internal.client.zzm zzc;
    public final String zzd;
    public final Executor zze;
    public final com.google.android.gms.ads.internal.client.zzx zzf;
    public final zzfml zzg;

    public zzfgq(zzfhj zzfhjVar, zzfhl zzfhlVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, Executor executor, com.google.android.gms.ads.internal.client.zzx zzxVar, zzfml zzfmlVar) {
        this.zza = zzfhjVar;
        this.zzb = zzfhlVar;
        this.zzc = zzmVar;
        this.zzd = str;
        this.zze = executor;
        this.zzf = zzxVar;
        this.zzg = zzfmlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfmv
    public final Executor zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfmv
    public final zzfml zzb() {
        return this.zzg;
    }
}

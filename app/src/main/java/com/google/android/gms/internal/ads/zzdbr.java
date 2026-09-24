package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdbr implements zzimi {
    private final zzdbp zza;
    private final zzimr zzb;

    private zzdbr(zzdbp zzdbpVar, zzimr zzimrVar) {
        this.zza = zzdbpVar;
        this.zzb = zzimrVar;
    }

    public static zzdbr zza(zzdbp zzdbpVar, zzimr zzimrVar) {
        return new zzdbr(zzdbpVar, zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZzf = this.zza.zzf(((zzcng) this.zzb).zza());
        zzimq.zzb(contextZzf);
        return contextZzf;
    }
}

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzyf implements zzyu {
    final /* synthetic */ zzyi zza;
    private final int zzb;

    public zzyf(zzyi zzyiVar, int i) {
        Objects.requireNonNull(zzyiVar);
        this.zza = zzyiVar;
        this.zzb = i;
    }

    final /* synthetic */ int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final boolean zzb() {
        return this.zza.zzp(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final void zzc() throws IOException {
        this.zza.zzq(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final int zzd(zzlq zzlqVar, zzip zzipVar, int i) {
        return this.zza.zzs(this.zzb, zzlqVar, zzipVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final int zze(long j) {
        return this.zza.zzt(this.zzb, j);
    }
}

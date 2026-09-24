package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzzb implements zzyu {
    private final zzyu zza;
    private final long zzb;

    public zzzb(zzyu zzyuVar, long j) {
        this.zza = zzyuVar;
        this.zzb = j;
    }

    public final zzyu zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final boolean zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final int zzd(zzlq zzlqVar, zzip zzipVar, int i) {
        int iZzd = this.zza.zzd(zzlqVar, zzipVar, i);
        if (iZzd != -4) {
            return iZzd;
        }
        zzipVar.zze += this.zzb;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final int zze(long j) {
        return this.zza.zze(j - this.zzb);
    }
}

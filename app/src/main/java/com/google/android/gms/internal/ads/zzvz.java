package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzvz implements zzvc {
    private final MediaCodec zza;

    public zzvz(MediaCodec mediaCodec) {
        this.zza = mediaCodec;
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final void zzb(int i, int i2, int i3, long j, int i4) {
        this.zza.queueInputBuffer(i, 0, i3, j, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final void zzc(int i, int i2, zzim zzimVar, long j, int i3) {
        this.zza.queueSecureInputBuffer(i, 0, zzimVar.zzb(), j, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final void zzd(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final void zzg() {
    }
}

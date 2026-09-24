package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzto implements zzrt {
    final /* synthetic */ zztp zza;

    /* synthetic */ zzto(zztp zztpVar, byte[] bArr) {
        Objects.requireNonNull(zztpVar);
        this.zza = zztpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    public final void zza(Exception exc) {
        zzef.zzf("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.zza.zzaz().zzi(exc);
    }
}

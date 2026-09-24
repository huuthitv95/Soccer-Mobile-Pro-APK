package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbya extends zzbms {
    final /* synthetic */ zzbyc zza;

    /* synthetic */ zzbya(zzbyc zzbycVar, byte[] bArr) {
        Objects.requireNonNull(zzbycVar);
        this.zza = zzbycVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmt
    public final void zze(zzbmj zzbmjVar, String str) {
        zzbyc zzbycVar = this.zza;
        if (zzbycVar.zze() == null) {
            return;
        }
        zzbycVar.zze().onCustomClick(zzbycVar.zzc(zzbmjVar), str);
    }
}

package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbqx extends zzbqu {
    final /* synthetic */ zzcfk zza;

    zzbqx(zzbqy zzbqyVar, zzcfk zzcfkVar) {
        this.zza = zzcfkVar;
        Objects.requireNonNull(zzbqyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zzb(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zzc(parcelFileDescriptor);
    }
}

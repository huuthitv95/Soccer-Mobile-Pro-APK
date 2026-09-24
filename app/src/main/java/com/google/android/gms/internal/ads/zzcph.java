package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcph implements zzegw {
    private final zzcol zza;
    private Context zzb;

    /* synthetic */ zzcph(zzcol zzcolVar, byte[] bArr) {
        this.zza = zzcolVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegw
    public final zzegx zza() {
        zzimq.zzc(this.zzb, Context.class);
        return new zzcpi(this.zza, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzegw
    public final /* bridge */ /* synthetic */ zzegw zzb(Context context) {
        this.zzb = context;
        return this;
    }
}

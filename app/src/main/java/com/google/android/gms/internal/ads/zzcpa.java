package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcpa implements zzeaq {
    private final zzcol zza;
    private Context zzb;
    private zzbqe zzc;

    /* synthetic */ zzcpa(zzcol zzcolVar, byte[] bArr) {
        this.zza = zzcolVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final zzear zza() {
        zzimq.zzc(this.zzb, Context.class);
        zzimq.zzc(this.zzc, zzbqe.class);
        return new zzcpb(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final /* bridge */ /* synthetic */ zzeaq zzb(zzbqe zzbqeVar) {
        zzbqeVar.getClass();
        this.zzc = zzbqeVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final /* bridge */ /* synthetic */ zzeaq zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcou implements zzfgi {
    private final zzcol zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzr zzd;

    /* synthetic */ zzcou(zzcol zzcolVar, byte[] bArr) {
        this.zza = zzcolVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgi
    public final zzfgj zza() {
        zzimq.zzc(this.zzb, Context.class);
        zzimq.zzc(this.zzc, String.class);
        zzimq.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzr.class);
        return new zzcov(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfgi
    public final /* bridge */ /* synthetic */ zzfgi zzb(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzrVar.getClass();
        this.zzd = zzrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfgi
    public final /* bridge */ /* synthetic */ zzfgi zzc(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfgi
    public final /* bridge */ /* synthetic */ zzfgi zzd(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}

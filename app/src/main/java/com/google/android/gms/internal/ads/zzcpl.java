package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcpl implements zzfjm {
    private final zzcol zza;
    private Context zzb;
    private String zzc;

    /* synthetic */ zzcpl(zzcol zzcolVar, byte[] bArr) {
        this.zza = zzcolVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfjm
    public final zzfjn zza() {
        zzimq.zzc(this.zzb, Context.class);
        return new zzcpm(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzfjm
    public final /* synthetic */ zzfjm zzb(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfjm
    public final /* bridge */ /* synthetic */ zzfjm zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}

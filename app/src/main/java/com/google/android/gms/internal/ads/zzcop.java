package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcop implements zzfeu {
    private final zzcol zza;
    private Context zzb;
    private String zzc;

    /* synthetic */ zzcop(zzcol zzcolVar, byte[] bArr) {
        this.zza = zzcolVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfeu
    public final zzfev zza() {
        zzimq.zzc(this.zzb, Context.class);
        zzimq.zzc(this.zzc, String.class);
        return new zzcoq(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzfeu
    public final /* bridge */ /* synthetic */ zzfeu zzb(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfeu
    public final /* bridge */ /* synthetic */ zzfeu zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}

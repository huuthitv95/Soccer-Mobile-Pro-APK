package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfdr implements zzimi {
    private final zzimr zza;

    private zzfdr(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzfdr zza(zzimr zzimrVar) {
        return new zzfdr(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfdq(((zzcng) this.zza).zza());
    }
}

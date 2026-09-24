package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdyh implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzdyh(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
    }

    public static zzdyh zza(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzdyh(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdyg((zzdyu) this.zza.zzb(), (zzdze) this.zzb.zzb());
    }
}

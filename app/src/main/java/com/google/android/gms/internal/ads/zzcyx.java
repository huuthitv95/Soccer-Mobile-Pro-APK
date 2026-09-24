package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcyx implements zzddt, com.google.android.gms.ads.internal.client.zza, zzdfl, zzdcz, zzdcf, zzdhw {
    private final Clock zza;
    private final zzcel zzb;

    public zzcyx(Clock clock, zzcel zzcelVar) {
        this.zza = clock;
        this.zzb = zzcelVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzd(zzcbd zzcbdVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzdK() {
    }

    @Override // com.google.android.gms.internal.ads.zzdfl
    public final void zzdP(zzcar zzcarVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdfl
    public final void zzdQ(zzfke zzfkeVar) {
        this.zzb.zzd(this.zza.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdr() {
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzds() {
        this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzdt() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzg() {
        this.zzb.zzh(true);
    }

    public final void zzi(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zza(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdhw
    public final void zzj(zzbhj.zzb zzbVar) {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdhw
    public final void zzk(zzbhj.zzb zzbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhw
    public final void zzl(zzbhj.zzb zzbVar) {
        this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdhw
    public final void zzm(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhw
    public final void zzn(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhw
    public final void zzo() {
    }

    public final String zzp() {
        return this.zzb.zzj();
    }
}

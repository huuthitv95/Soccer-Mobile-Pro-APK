package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcpo implements zzdve {
    private final zzcol zza;
    private zzfho zzb;
    private zzfgs zzc;
    private zzdif zzd;
    private zzdbp zze;

    /* synthetic */ zzcpo(zzcol zzcolVar, byte[] bArr) {
        this.zza = zzcolVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbm
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdvf zzh() {
        zzimq.zzc(this.zzd, zzdif.class);
        zzimq.zzc(this.zze, zzdbp.class);
        return new zzcpp(this.zza, new zzcyn(), new zzfls(), new zzdao(), new zzdzo(), this.zzd, this.zze, zzepc.zza(), null, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzdve
    public final /* synthetic */ zzdve zzb(zzfgs zzfgsVar) {
        this.zzc = zzfgsVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdve
    public final /* synthetic */ zzdve zzc(zzfho zzfhoVar) {
        this.zzb = zzfhoVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdve
    public final /* bridge */ /* synthetic */ zzdve zzd(zzdbp zzdbpVar) {
        this.zze = zzdbpVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdve
    public final /* bridge */ /* synthetic */ zzdve zze(zzdif zzdifVar) {
        this.zzd = zzdifVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdbm
    public final /* synthetic */ zzdbm zzi(zzfgs zzfgsVar) {
        this.zzc = zzfgsVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdbm
    public final /* synthetic */ zzdbm zzj(zzfho zzfhoVar) {
        this.zzb = zzfhoVar;
        return this;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcpd implements zzdmt {
    private final zzcol zza;
    private zzfho zzb;
    private zzfgs zzc;
    private zzdif zzd;
    private zzdbp zze;
    private zzeqw zzf;

    /* synthetic */ zzcpd(zzcol zzcolVar, byte[] bArr) {
        this.zza = zzcolVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbm
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdmu zzh() {
        zzimq.zzc(this.zzd, zzdif.class);
        zzimq.zzc(this.zze, zzdbp.class);
        zzimq.zzc(this.zzf, zzeqw.class);
        return new zzcpe(this.zza, new zzcyn(), new zzfls(), new zzdao(), new zzdzo(), this.zzd, this.zze, zzepc.zza(), this.zzf, null, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzdmt
    public final /* synthetic */ zzdmt zzb(zzfgs zzfgsVar) {
        this.zzc = zzfgsVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdmt
    public final /* synthetic */ zzdmt zzc(zzfho zzfhoVar) {
        this.zzb = zzfhoVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdmt
    public final /* bridge */ /* synthetic */ zzdmt zzd(zzeqw zzeqwVar) {
        this.zzf = zzeqwVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdmt
    public final /* bridge */ /* synthetic */ zzdmt zze(zzdbp zzdbpVar) {
        this.zze = zzdbpVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdmt
    public final /* bridge */ /* synthetic */ zzdmt zzf(zzdif zzdifVar) {
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

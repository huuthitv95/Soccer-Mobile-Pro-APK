package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcos implements zzcwd {
    private final zzcol zza;
    private zzfho zzb;
    private zzfgs zzc;
    private zzdif zzd;
    private zzdbp zze;
    private zzeqw zzf;
    private zzcwz zzg;
    private zzepa zzh;
    private zzcuw zzi;
    private zzdnl zzj;

    /* synthetic */ zzcos(zzcol zzcolVar, byte[] bArr) {
        this.zza = zzcolVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbm
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcwe zzh() {
        zzimq.zzc(this.zzd, zzdif.class);
        zzimq.zzc(this.zze, zzdbp.class);
        zzimq.zzc(this.zzf, zzeqw.class);
        zzimq.zzc(this.zzg, zzcwz.class);
        if (this.zzh == null) {
            this.zzh = zzepc.zza();
        }
        zzimq.zzc(this.zzi, zzcuw.class);
        zzimq.zzc(this.zzj, zzdnl.class);
        return new zzcot(this.zza, this.zzi, this.zzj, new zzcyn(), new zzfls(), new zzdao(), new zzdzo(), this.zzd, this.zze, this.zzh, this.zzf, this.zzg, null, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final /* synthetic */ zzcwd zzb(zzfgs zzfgsVar) {
        this.zzc = zzfgsVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final /* synthetic */ zzcwd zzc(zzfho zzfhoVar) {
        this.zzb = zzfhoVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final /* bridge */ /* synthetic */ zzcwd zzd(zzdnl zzdnlVar) {
        this.zzj = zzdnlVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final /* bridge */ /* synthetic */ zzcwd zze(zzcuw zzcuwVar) {
        this.zzi = zzcuwVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final /* bridge */ /* synthetic */ zzcwd zzf(zzepa zzepaVar) {
        this.zzh = zzepaVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final /* bridge */ /* synthetic */ zzcwd zzg(zzcwz zzcwzVar) {
        this.zzg = zzcwzVar;
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

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final /* bridge */ /* synthetic */ zzcwd zzk(zzeqw zzeqwVar) {
        this.zzf = zzeqwVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final /* bridge */ /* synthetic */ zzcwd zzl(zzdbp zzdbpVar) {
        this.zze = zzdbpVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final /* bridge */ /* synthetic */ zzcwd zzm(zzdif zzdifVar) {
        this.zzd = zzdifVar;
        return this;
    }
}

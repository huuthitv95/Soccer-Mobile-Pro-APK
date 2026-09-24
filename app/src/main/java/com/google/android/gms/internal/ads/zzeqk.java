package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public class zzeqk extends zzbuv {
    private final zzdcd zza;
    private final zzdkk zzb;
    private final zzdcx zzc;
    private final zzddm zzd;
    private final zzddr zze;
    private final zzdhj zzf;
    private final zzdeq zzg;
    private final zzdli zzh;
    private final zzdhf zzi;
    private final zzdcs zzj;

    public zzeqk(zzdcd zzdcdVar, zzdkk zzdkkVar, zzdcx zzdcxVar, zzddm zzddmVar, zzddr zzddrVar, zzdhj zzdhjVar, zzdeq zzdeqVar, zzdli zzdliVar, zzdhf zzdhfVar, zzdcs zzdcsVar) {
        this.zza = zzdcdVar;
        this.zzb = zzdkkVar;
        this.zzc = zzdcxVar;
        this.zzd = zzddmVar;
        this.zze = zzddrVar;
        this.zzf = zzdhjVar;
        this.zzg = zzdeqVar;
        this.zzh = zzdliVar;
        this.zzi = zzdhfVar;
        this.zzj = zzdcsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzdu();
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzf() {
        this.zzg.zzdU(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzg(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzh() {
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzi() {
        this.zzg.zzh();
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzj() {
        this.zze.zzg();
    }

    public void zzk() {
        this.zzc.zza();
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzl(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzm(zzbmj zzbmjVar, String str) {
    }

    public void zzn() {
        this.zzh.zzb();
    }

    public void zzo() {
        this.zzh.zzc();
    }

    public void zzp(zzcbp zzcbpVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzq() {
        this.zzh.zza();
    }

    public void zzr(zzcbt zzcbtVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    @Deprecated
    public final void zzs(int i) throws RemoteException {
        zzy(new com.google.android.gms.ads.internal.client.zze(i, "", AdError.UNDEFINED_DOMAIN, null, null));
    }

    public void zzt() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzu() throws RemoteException {
        this.zzh.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzv(String str) {
        zzy(new com.google.android.gms.ads.internal.client.zze(0, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzw(int i, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzx(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzy(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzj.zzc(zzflo.zzc(8, zzeVar));
    }

    public void zzz() throws RemoteException {
    }
}

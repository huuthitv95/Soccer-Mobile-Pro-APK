package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzerr extends com.google.android.gms.ads.internal.client.zzbp {
    final zzfkl zza;
    final zzdpq zzb;
    private final Context zzc;
    private final zzcmx zzd;
    private com.google.android.gms.ads.internal.client.zzbh zze;

    public zzerr(zzcmx zzcmxVar, Context context, String str) {
        zzfkl zzfklVar = new zzfkl();
        this.zza = zzfklVar;
        this.zzb = new zzdpq();
        this.zzd = zzcmxVar;
        zzfklVar.zzg(str);
        this.zzc = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final com.google.android.gms.ads.internal.client.zzbn zze() {
        zzdpr zzdprVarZzg = this.zzb.zzg();
        ArrayList arrayListZzh = zzdprVarZzg.zzh();
        zzfkl zzfklVar = this.zza;
        zzfklVar.zzm(arrayListZzh);
        zzfklVar.zzn(zzdprVarZzg.zzi());
        if (zzfklVar.zzf() == null) {
            zzfklVar.zzc(com.google.android.gms.ads.internal.client.zzr.zzb());
        }
        return new zzers(this.zzc, this.zzd, zzfklVar, zzdprVarZzg, this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zze = zzbhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(zzbmn zzbmnVar) {
        this.zzb.zzb(zzbmnVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(zzbmq zzbmqVar) {
        this.zzb.zza(zzbmqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(String str, zzbmw zzbmwVar, zzbmt zzbmtVar) {
        this.zzb.zzf(str, zzbmwVar, zzbmtVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(zzblh zzblhVar) {
        this.zza.zzo(zzblhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(zzbna zzbnaVar, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzb.zzd(zzbnaVar);
        this.zza.zzc(zzrVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(PublisherAdViewOptions publisherAdViewOptions) {
        this.zza.zzr(publisherAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(zzbnd zzbndVar) {
        this.zzb.zzc(zzbndVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(zzbrp zzbrpVar) {
        this.zza.zzq(zzbrpVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(zzbry zzbryVar) {
        this.zzb.zze(zzbryVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zza.zzs(adManagerAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
        this.zza.zzZ(zzcpVar);
    }
}

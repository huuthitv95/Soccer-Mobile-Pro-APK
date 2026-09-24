package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzenj implements zzelm {
    private final Context zza;
    private final zzdmu zzb;

    public zzenj(Context context, zzdmu zzdmuVar) {
        this.zza = context;
        this.zzb = zzdmuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final void zza(zzfke zzfkeVar, zzfjt zzfjtVar, zzelj zzeljVar) throws zzfkt {
        try {
            zzbwp zzbwpVar = (zzbwp) zzeljVar.zzb;
            zzbwpVar.zzo(zzfjtVar.zzZ);
            zzbwpVar.zzj(zzfjtVar.zzU, zzfjtVar.zzv.toString(), zzfkeVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeni(this, zzeljVar, null), (zzbuw) zzeljVar.zzc);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a interstitial RTB ad", e);
            throw new zzfkt(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final /* bridge */ /* synthetic */ Object zzb(zzfke zzfkeVar, zzfjt zzfjtVar, zzelj zzeljVar) throws zzfkt, zzeov {
        zzene zzeneVar = new zzene(zzfjtVar, (zzbwp) zzeljVar.zzb, AdFormat.INTERSTITIAL);
        zzdlo zzdloVarZzd = this.zzb.zzd(new zzcxx(zzfkeVar, zzfjtVar, zzeljVar.zza), new zzdlr(zzeneVar, null));
        zzeneVar.zzc(zzdloVarZzd.zzd());
        ((zzemv) zzeljVar.zzc).zzc(zzdloVarZzd.zzg());
        return zzdloVarZzd.zzh();
    }
}

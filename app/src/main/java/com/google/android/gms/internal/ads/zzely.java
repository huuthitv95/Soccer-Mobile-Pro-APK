package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzely implements zzelm {
    private final Context zza;
    private final zzcun zzb;

    zzely(Context context, zzcun zzcunVar) {
        this.zza = context;
        this.zzb = zzcunVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final void zza(zzfke zzfkeVar, zzfjt zzfjtVar, zzelj zzeljVar) throws zzfkt {
        try {
            zzbwp zzbwpVar = (zzbwp) zzeljVar.zzb;
            zzbwpVar.zzo(zzfjtVar.zzZ);
            zzbwpVar.zzs(zzfjtVar.zzU, zzfjtVar.zzv.toString(), zzfkeVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzelx(zzeljVar, null), (zzbuw) zzeljVar.zzc);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading an app open RTB ad", e);
            throw new zzfkt(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final /* bridge */ /* synthetic */ Object zzb(zzfke zzfkeVar, zzfjt zzfjtVar, zzelj zzeljVar) throws zzfkt, zzeov {
        zzene zzeneVar = new zzene(zzfjtVar, (zzbwp) zzeljVar.zzb, AdFormat.APP_OPEN_AD);
        zzcuk zzcukVarZzf = this.zzb.zzf(new zzcxx(zzfkeVar, zzfjtVar, zzeljVar.zza), new zzdlr(zzeneVar, null), new zzcul(zzfjtVar.zzaa));
        zzeneVar.zzc(zzcukVarZzf.zzd());
        ((zzemv) zzeljVar.zzc).zzc(zzcukVarZzf.zzg());
        return zzcukVarZzf.zzh();
    }
}

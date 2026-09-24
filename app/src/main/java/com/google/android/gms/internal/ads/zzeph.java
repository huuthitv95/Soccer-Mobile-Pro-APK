package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeph implements zzelm {
    private final Context zza;
    private final zzdvf zzb;

    public zzeph(Context context, zzdvf zzdvfVar) {
        this.zza = context;
        this.zzb = zzdvfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final void zza(zzfke zzfkeVar, zzfjt zzfjtVar, zzelj zzeljVar) throws zzfkt {
        try {
            zzbwp zzbwpVar = (zzbwp) zzeljVar.zzb;
            zzbwpVar.zzo(zzfjtVar.zzZ);
            zzfkm zzfkmVar = zzfkeVar.zza.zza;
            if (zzfkmVar.zzp.zza == 3) {
                zzbwpVar.zzp(zzfjtVar.zzU, zzfjtVar.zzv.toString(), zzfkmVar.zzd, ObjectWrapper.wrap(this.zza), new zzepg(this, zzeljVar, null), (zzbuw) zzeljVar.zzc);
            } else {
                zzbwpVar.zzl(zzfjtVar.zzU, zzfjtVar.zzv.toString(), zzfkmVar.zzd, ObjectWrapper.wrap(this.zza), new zzepg(this, zzeljVar, null), (zzbuw) zzeljVar.zzc);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a rewarded RTB ad", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final /* bridge */ /* synthetic */ Object zzb(zzfke zzfkeVar, zzfjt zzfjtVar, zzelj zzeljVar) throws zzfkt, zzeov {
        zzene zzeneVar = new zzene(zzfjtVar, (zzbwp) zzeljVar.zzb, AdFormat.REWARDED);
        zzdvb zzdvbVarZzf = this.zzb.zzf(new zzcxx(zzfkeVar, zzfjtVar, zzeljVar.zza), new zzdvc(zzeneVar));
        zzeneVar.zzc(zzdvbVarZzf.zzd());
        ((zzemv) zzeljVar.zzc).zzc(zzdvbVarZzf.zzn());
        return zzdvbVarZzf.zzh();
    }
}

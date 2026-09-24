package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzenx implements zzelm {
    private final Context zza;
    private final zzdnq zzb;
    private zzbvf zzc;
    private final VersionInfoParcel zzd;

    public zzenx(Context context, zzdnq zzdnqVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzdnqVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final void zza(zzfke zzfkeVar, zzfjt zzfjtVar, zzelj zzeljVar) throws zzfkt {
        try {
            zzbwp zzbwpVar = (zzbwp) zzeljVar.zzb;
            zzbwpVar.zzo(zzfjtVar.zzZ);
            if (this.zzd.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcs)).intValue()) {
                zzbwpVar.zzn(zzfjtVar.zzU, zzfjtVar.zzv.toString(), zzfkeVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzenw(this, zzeljVar, null), (zzbuw) zzeljVar.zzc);
                return;
            }
            String str = zzfjtVar.zzU;
            String string = zzfjtVar.zzv.toString();
            zzfkm zzfkmVar = zzfkeVar.zza.zza;
            zzbwpVar.zzr(str, string, zzfkmVar.zzd, ObjectWrapper.wrap(this.zza), new zzenw(this, zzeljVar, null), (zzbuw) zzeljVar.zzc, zzfkmVar.zzj);
        } catch (RemoteException e) {
            throw new zzfkt(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final /* bridge */ /* synthetic */ Object zzb(zzfke zzfkeVar, zzfjt zzfjtVar, zzelj zzeljVar) throws zzfkt, zzeov {
        ArrayList arrayList = zzfkeVar.zza.zza.zzh;
        if (!arrayList.contains(Integer.toString(6))) {
            throw new zzeov(2, "Unified must be used for RTB.");
        }
        zzdph zzdphVarZzaf = zzdph.zzaf(this.zzc);
        if (!arrayList.contains(Integer.toString(zzdphVarZzaf.zzx()))) {
            throw new zzeov(1, "No corresponding native ad listener");
        }
        zzdpj zzdpjVarZze = this.zzb.zze(new zzcxx(zzfkeVar, zzfjtVar, zzeljVar.zza), new zzdps(zzdphVarZzaf), new zzdrl(null, null, this.zzc));
        ((zzemv) zzeljVar.zzc).zzc(zzdpjVarZze.zzg());
        return zzdpjVarZze.zzh();
    }

    final /* synthetic */ void zzc(zzbvf zzbvfVar) {
        this.zzc = zzbvfVar;
    }
}

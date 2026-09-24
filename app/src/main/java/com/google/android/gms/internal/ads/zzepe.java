package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzepe implements zzelm {
    private final Context zza;
    private final Executor zzb;
    private final zzdvf zzc;

    public zzepe(Context context, Executor executor, zzdvf zzdvfVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdvfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final void zza(zzfke zzfkeVar, zzfjt zzfjtVar, zzelj zzeljVar) throws zzfkt {
        try {
            zzfkm zzfkmVar = zzfkeVar.zza.zza;
            if (zzfkmVar.zzp.zza == 3) {
                ((zzflk) zzeljVar.zzb).zzx(this.zza, zzfkmVar.zzd, zzfjtVar.zzv.toString(), (zzbuw) zzeljVar.zzc);
            } else {
                ((zzflk) zzeljVar.zzb).zzv(this.zza, zzfkmVar.zzd, zzfjtVar.zzv.toString(), (zzbuw) zzeljVar.zzc);
            }
        } catch (Exception e) {
            String str = zzeljVar.zza;
            String.valueOf(str);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to load ad from adapter ".concat(String.valueOf(str)), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final /* bridge */ /* synthetic */ Object zzb(zzfke zzfkeVar, zzfjt zzfjtVar, zzelj zzeljVar) throws zzfkt, zzeov {
        zzdvb zzdvbVarZzf = this.zzc.zzf(new zzcxx(zzfkeVar, zzfjtVar, zzeljVar.zza), new zzdvc(new zzepd(this, zzeljVar, zzfjtVar)));
        zzdvbVarZzf.zza().zzq(new zzcsn((zzflk) zzeljVar.zzb), this.zzb);
        ((zzemv) zzeljVar.zzc).zzc(zzdvbVarZzf.zzm());
        return zzdvbVarZzf.zzh();
    }
}

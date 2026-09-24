package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzepz implements zzelm {
    private final Context zza;
    private final Executor zzb;
    private final zzdvf zzc;

    public zzepz(Context context, Executor executor, zzdvf zzdvfVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdvfVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zze(zzfke zzfkeVar, zzfjt zzfjtVar, zzelj zzeljVar) {
        try {
            ((zzflk) zzeljVar.zzb).zzl(zzfkeVar.zza.zza.zzd, zzfjtVar.zzv.toString());
        } catch (Exception e) {
            String str = zzeljVar.zza;
            String.valueOf(str);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to load ad from adapter ".concat(String.valueOf(str)), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final void zza(zzfke zzfkeVar, zzfjt zzfjtVar, zzelj zzeljVar) throws zzfkt {
        zzflk zzflkVar = (zzflk) zzeljVar.zzb;
        if (zzflkVar.zzn()) {
            zze(zzfkeVar, zzfjtVar, zzeljVar);
            return;
        }
        zzepw zzepwVar = new zzepw(this, zzfkeVar, zzfjtVar, zzeljVar);
        zzddp zzddpVar = zzeljVar.zzc;
        ((zzemw) zzddpVar).zzd(zzepwVar);
        Context context = this.zza;
        zzfkm zzfkmVar = zzfkeVar.zza.zza;
        String string = zzfjtVar.zzv.toString();
        zzflkVar.zzk(context, zzfkmVar.zzd, null, (zzcbo) zzddpVar, string);
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final /* bridge */ /* synthetic */ Object zzb(zzfke zzfkeVar, zzfjt zzfjtVar, zzelj zzeljVar) throws zzfkt, zzeov {
        zzdvb zzdvbVarZzf = this.zzc.zzf(new zzcxx(zzfkeVar, zzfjtVar, zzeljVar.zza), new zzdvc(new zzepx(this, zzeljVar, zzfjtVar)));
        zzdvbVarZzf.zza().zzq(new zzcsn((zzflk) zzeljVar.zzb), this.zzb);
        zzddm zzddmVarZzb = zzdvbVarZzf.zzb();
        zzdcd zzdcdVarZzc = zzdvbVarZzf.zzc();
        ((zzemw) zzeljVar.zzc).zzc(new zzepy(this, zzdvbVarZzf.zzi(), zzdcdVarZzc, zzddmVarZzb, zzdvbVarZzf.zzk()));
        return zzdvbVarZzf.zzh();
    }

    final /* synthetic */ Executor zzc() {
        return this.zzb;
    }
}

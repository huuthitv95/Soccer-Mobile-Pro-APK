package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzelv implements zzelm {
    private final Context zza;
    private final zzcun zzb;
    private final Executor zzc;

    zzelv(Context context, zzcun zzcunVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcunVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final void zza(zzfke zzfkeVar, zzfjt zzfjtVar, zzelj zzeljVar) throws zzfkt {
        zzflk zzflkVar = (zzflk) zzeljVar.zzb;
        zzfkm zzfkmVar = zzfkeVar.zza.zza;
        String string = zzfjtVar.zzv.toString();
        zzflkVar.zzy(this.zza, zzfkmVar.zzd, string, (zzbuw) zzeljVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final /* bridge */ /* synthetic */ Object zzb(zzfke zzfkeVar, zzfjt zzfjtVar, zzelj zzeljVar) throws zzfkt, zzeov {
        zzcuk zzcukVarZzf = this.zzb.zzf(new zzcxx(zzfkeVar, zzfjtVar, zzeljVar.zza), new zzdlr(new zzelu(this, zzeljVar, zzfjtVar), null), new zzcul(zzfjtVar.zzaa));
        zzcukVarZzf.zza().zzq(new zzcsn((zzflk) zzeljVar.zzb), this.zzc);
        ((zzemv) zzeljVar.zzc).zzc(zzcukVarZzf.zzf());
        return zzcukVarZzf.zzh();
    }
}

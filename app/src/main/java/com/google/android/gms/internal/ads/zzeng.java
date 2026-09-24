package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeng implements zzelm {
    private final Context zza;
    private final zzdmu zzb;
    private final VersionInfoParcel zzc;
    private final Executor zzd;

    public zzeng(Context context, VersionInfoParcel versionInfoParcel, zzdmu zzdmuVar, Executor executor) {
        this.zza = context;
        this.zzc = versionInfoParcel;
        this.zzb = zzdmuVar;
        this.zzd = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final void zza(zzfke zzfkeVar, zzfjt zzfjtVar, zzelj zzeljVar) throws zzfkt {
        zzflk zzflkVar = (zzflk) zzeljVar.zzb;
        zzfkm zzfkmVar = zzfkeVar.zza.zza;
        String string = zzfjtVar.zzv.toString();
        String strZzm = com.google.android.gms.ads.internal.util.zzbp.zzm(zzfjtVar.zzs);
        zzflkVar.zzh(this.zza, zzfkmVar.zzd, string, strZzm, (zzbuw) zzeljVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final /* bridge */ /* synthetic */ Object zzb(zzfke zzfkeVar, zzfjt zzfjtVar, zzelj zzeljVar) throws zzfkt, zzeov {
        zzdlo zzdloVarZzd = this.zzb.zzd(new zzcxx(zzfkeVar, zzfjtVar, zzeljVar.zza), new zzdlr(new zzenf(this, zzeljVar, zzfjtVar), null));
        zzdloVarZzd.zza().zzq(new zzcsn((zzflk) zzeljVar.zzb), this.zzd);
        ((zzemv) zzeljVar.zzc).zzc(zzdloVarZzd.zzf());
        return zzdloVarZzd.zzh();
    }

    final /* synthetic */ VersionInfoParcel zzc() {
        return this.zzc;
    }
}

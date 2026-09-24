package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzenu implements zzelm {
    private final Context zza;
    private final zzdnq zzb;
    private final Executor zzc;

    public zzenu(Context context, zzdnq zzdnqVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdnqVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfke zzfkeVar, int i) {
        return zzfkeVar.zza.zza.zzh.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final void zza(zzfke zzfkeVar, zzfjt zzfjtVar, zzelj zzeljVar) throws zzfkt {
        zzflk zzflkVar = (zzflk) zzeljVar.zzb;
        zzfkm zzfkmVar = zzfkeVar.zza.zza;
        String string = zzfjtVar.zzv.toString();
        String strZzm = com.google.android.gms.ads.internal.util.zzbp.zzm(zzfjtVar.zzs);
        zzflkVar.zzo(this.zza, zzfkmVar.zzd, string, strZzm, (zzbuw) zzeljVar.zzc, zzfkmVar.zzj, zzfkmVar.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final /* bridge */ /* synthetic */ Object zzb(zzfke zzfkeVar, zzfjt zzfjtVar, zzelj zzeljVar) throws zzfkt, zzeov {
        zzdph zzdphVarZzag;
        zzflk zzflkVar = (zzflk) zzeljVar.zzb;
        zzbvb zzbvbVarZzD = zzflkVar.zzD();
        zzbvc zzbvcVarZzE = zzflkVar.zzE();
        zzbvf zzbvfVarZzu = zzflkVar.zzu();
        if (zzbvfVarZzu != null && zzc(zzfkeVar, 6)) {
            zzdphVarZzag = zzdph.zzaf(zzbvfVarZzu);
        } else if (zzbvbVarZzD != null && zzc(zzfkeVar, 6)) {
            zzdphVarZzag = zzdph.zzai(zzbvbVarZzD);
        } else if (zzbvbVarZzD != null && zzc(zzfkeVar, 2)) {
            zzdphVarZzag = zzdph.zzah(zzbvbVarZzD);
        } else if (zzbvcVarZzE != null && zzc(zzfkeVar, 6)) {
            zzdphVarZzag = zzdph.zzaj(zzbvcVarZzE);
        } else {
            if (zzbvcVarZzE == null || !zzc(zzfkeVar, 1)) {
                throw new zzeov(1, "No native ad mappers");
            }
            zzdphVarZzag = zzdph.zzag(zzbvcVarZzE);
        }
        if (zzdphVarZzag != null) {
            zzfkm zzfkmVar = zzfkeVar.zza.zza;
            if (zzfkmVar.zzh.contains(Integer.toString(zzdphVarZzag.zzx()))) {
                zzdpj zzdpjVarZze = this.zzb.zze(new zzcxx(zzfkeVar, zzfjtVar, zzeljVar.zza), new zzdps(zzdphVarZzag), new zzdrl(zzbvcVarZzE, zzbvbVarZzD, zzbvfVarZzu));
                ((zzemv) zzeljVar.zzc).zzc(zzdpjVarZze.zzf());
                zzdpjVarZze.zza().zzq(new zzcsn(zzflkVar), this.zzc);
                return zzdpjVarZze.zzh();
            }
        }
        throw new zzeov(1, "No corresponding native ad listener");
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzena implements zzdnc {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final ListenableFuture zzc;
    private final zzfjt zzd;
    private final zzcki zze;
    private final zzfkm zzf;
    private final zzbph zzg;
    private final boolean zzh;
    private final zzekf zzi;
    private final zzdyz zzj;

    zzena(Context context, VersionInfoParcel versionInfoParcel, ListenableFuture listenableFuture, zzfjt zzfjtVar, zzcki zzckiVar, zzfkm zzfkmVar, boolean z, zzbph zzbphVar, zzekf zzekfVar, zzdyz zzdyzVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = listenableFuture;
        this.zzd = zzfjtVar;
        this.zze = zzckiVar;
        this.zzf = zzfkmVar;
        this.zzg = zzbphVar;
        this.zzh = z;
        this.zzi = zzekfVar;
        this.zzj = zzdyzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdnc
    public final void zza(boolean z, Context context, zzdcs zzdcsVar) {
        boolean z2;
        zzdlo zzdloVar = (zzdlo) zzhbi.zzt(this.zzc);
        zzcki zzckiVar = this.zze;
        zzckiVar.zzag(true);
        boolean z3 = this.zzh;
        boolean z4 = false;
        boolean zZzc = z3 ? this.zzg.zzc(false) : false;
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zZzL = com.google.android.gms.ads.internal.util.zzs.zzL(this.zza);
        if (!z3) {
            z2 = z4;
        } else if (this.zzg.zzd()) {
            z4 = true;
            z2 = z4;
        } else {
            z2 = false;
            z4 = true;
        }
        float fZze = z4 ? this.zzg.zze() : 0.0f;
        zzfjt zzfjtVar = this.zzd;
        com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zZzc, zZzL, z2, fZze, -1, z, zzfjtVar.zzO, false);
        if (zzdcsVar != null) {
            zzdcsVar.zzb();
        }
        com.google.android.gms.ads.internal.zzt.zzb();
        zzdmr zzdmrVarZzj = zzdloVar.zzj();
        int i = zzfjtVar.zzQ;
        VersionInfoParcel versionInfoParcel = this.zzb;
        String str = zzfjtVar.zzB;
        zzfjy zzfjyVar = zzfjtVar.zzs;
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzdmrVarZzj, null, zzckiVar, i, versionInfoParcel, str, zzlVar, zzfjyVar.zzb, zzfjyVar.zza, this.zzf.zzg, zzdcsVar, zzfjtVar.zzb() ? this.zzi : null, zzckiVar.zzn()), true, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzdnc
    public final zzfjt zzb() {
        return this.zzd;
    }
}

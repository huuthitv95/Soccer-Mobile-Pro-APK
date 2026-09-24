package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzelt implements zzdnc {
    private final VersionInfoParcel zza;
    private final ListenableFuture zzb;
    private final zzfjt zzc;
    private final zzcki zzd;
    private final zzfkm zze;
    private final zzbph zzf;
    private final boolean zzg;
    private final zzekf zzh;
    private final zzdyz zzi;

    zzelt(VersionInfoParcel versionInfoParcel, ListenableFuture listenableFuture, zzfjt zzfjtVar, zzcki zzckiVar, zzfkm zzfkmVar, boolean z, zzbph zzbphVar, zzekf zzekfVar, zzdyz zzdyzVar) {
        this.zza = versionInfoParcel;
        this.zzb = listenableFuture;
        this.zzc = zzfjtVar;
        this.zzd = zzckiVar;
        this.zze = zzfkmVar;
        this.zzg = z;
        this.zzf = zzbphVar;
        this.zzh = zzekfVar;
        this.zzi = zzdyzVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    @Override // com.google.android.gms.internal.ads.zzdnc
    public final void zza(boolean z, Context context, zzdcs zzdcsVar) {
        boolean z2;
        zzcuk zzcukVar = (zzcuk) zzhbi.zzt(this.zzb);
        zzcki zzckiVar = this.zzd;
        zzckiVar.zzag(true);
        boolean z3 = this.zzg;
        boolean zZzc = z3 ? this.zzf.zzc(true) : true;
        boolean z4 = false;
        if (!z3) {
            z2 = z4;
        } else if (this.zzf.zzd()) {
            z4 = true;
            z2 = z4;
        } else {
            z2 = false;
            z4 = true;
        }
        float fZze = z4 ? this.zzf.zze() : 0.0f;
        zzfjt zzfjtVar = this.zzc;
        com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zZzc, true, z2, fZze, -1, z, zzfjtVar.zzO, false);
        if (zzdcsVar != null) {
            zzdcsVar.zzb();
        }
        com.google.android.gms.ads.internal.zzt.zzb();
        zzdmr zzdmrVarZzj = zzcukVar.zzj();
        int i = zzfjtVar.zzQ;
        if (i == -1) {
            com.google.android.gms.ads.internal.client.zzx zzxVar = this.zze.zzk;
            if (zzxVar == null) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Error setting app open orientation; no targeting orientation available.");
            } else {
                int i3 = zzxVar.zza;
                if (i3 == 1) {
                    i = 7;
                } else if (i3 == 2) {
                    i = 6;
                } else {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Error setting app open orientation; no targeting orientation available.");
                }
            }
        }
        VersionInfoParcel versionInfoParcel = this.zza;
        String str = zzfjtVar.zzB;
        zzfjy zzfjyVar = zzfjtVar.zzs;
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzdmrVarZzj, null, zzckiVar, i, versionInfoParcel, str, zzlVar, zzfjyVar.zzb, zzfjyVar.zza, this.zze.zzg, zzdcsVar, zzfjtVar.zzb() ? this.zzh : null, zzckiVar.zzn()), true, this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzdnc
    public final zzfjt zzb() {
        return this.zzc;
    }
}

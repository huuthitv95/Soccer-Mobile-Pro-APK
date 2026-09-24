package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzepp implements zzdnc {
    private final Context zza;
    private final zzdvw zzb;
    private final zzfkm zzc;
    private final VersionInfoParcel zzd;
    private final zzfjt zze;
    private final ListenableFuture zzf;
    private final zzcki zzg;
    private final zzbph zzh;
    private final boolean zzi;
    private final zzekf zzj;
    private final zzdyu zzk;
    private final zzdyz zzl;

    zzepp(Context context, zzdvw zzdvwVar, zzfkm zzfkmVar, VersionInfoParcel versionInfoParcel, zzfjt zzfjtVar, ListenableFuture listenableFuture, zzcki zzckiVar, zzbph zzbphVar, boolean z, zzekf zzekfVar, zzdyu zzdyuVar, zzdyz zzdyzVar) {
        this.zza = context;
        this.zzb = zzdvwVar;
        this.zzc = zzfkmVar;
        this.zzd = versionInfoParcel;
        this.zze = zzfjtVar;
        this.zzf = listenableFuture;
        this.zzg = zzckiVar;
        this.zzh = zzbphVar;
        this.zzi = z;
        this.zzj = zzekfVar;
        this.zzk = zzdyuVar;
        this.zzl = zzdyzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdnc
    public final void zza(boolean z, Context context, zzdcs zzdcsVar) {
        boolean z2;
        zzdvb zzdvbVar = (zzdvb) zzhbi.zzt(this.zzf);
        try {
            zzfjt zzfjtVar = this.zze;
            final zzcki zzckiVarZza = this.zzg;
            if (zzckiVarZza.zzaB()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzby)).booleanValue()) {
                    zzckiVarZza = this.zzb.zza(this.zzc.zzf, null, null);
                    zzbpx.zzb(zzckiVarZza, zzdvbVar.zzk());
                    final zzdwa zzdwaVar = new zzdwa();
                    zzdvbVar.zzl().zzi(zzckiVarZza, true, this.zzi ? this.zzh : null, this.zzk);
                    zzckiVarZza.zzP().zzG(new zzcme(zzdwaVar, zzckiVarZza) { // from class: com.google.android.gms.internal.ads.zzepo
                        private final /* synthetic */ zzcki zza;

                        {
                            this.zza = zzckiVarZza;
                        }

                        @Override // com.google.android.gms.internal.ads.zzcme
                        public final /* synthetic */ void zza(boolean z3, int i, String str, String str2) {
                            zzcki zzckiVar = this.zza;
                            zzckiVar.zzJ();
                            zzckiVar.zzP().zzq();
                        }
                    });
                    zzcmg zzcmgVarZzP = zzckiVarZza.zzP();
                    Objects.requireNonNull(zzckiVarZza);
                    zzcmgVarZzP.zzH(new zzcmf() { // from class: com.google.android.gms.internal.ads.zzepn
                        @Override // com.google.android.gms.internal.ads.zzcmf
                        public final /* synthetic */ void zza() {
                            zzckiVarZza.zzI();
                        }
                    });
                    zzfjy zzfjyVar = zzfjtVar.zzs;
                    zzckiVarZza.zzau(zzfjyVar.zzb, zzfjyVar.zza, null);
                }
            }
            zzcki zzckiVar = zzckiVarZza;
            zzckiVar.zzag(true);
            boolean z3 = this.zzi;
            boolean z4 = false;
            boolean zZzc = z3 ? this.zzh.zzc(false) : false;
            com.google.android.gms.ads.internal.zzt.zzc();
            boolean zZzL = com.google.android.gms.ads.internal.util.zzs.zzL(this.zza);
            if (!z3) {
                z2 = z4;
            } else if (this.zzh.zzd()) {
                z4 = true;
                z2 = z4;
            } else {
                z2 = false;
                z4 = true;
            }
            float fZze = z4 ? this.zzh.zze() : 0.0f;
            zzfjt zzfjtVar2 = this.zze;
            com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zZzc, zZzL, z2, fZze, -1, z, zzfjtVar2.zzO, zzfjtVar2.zzP);
            if (zzdcsVar != null) {
                zzdcsVar.zzb();
            }
            com.google.android.gms.ads.internal.zzt.zzb();
            zzdmr zzdmrVarZzj = zzdvbVar.zzj();
            int i = zzfjtVar2.zzQ;
            VersionInfoParcel versionInfoParcel = this.zzd;
            String str = zzfjtVar2.zzB;
            zzfjy zzfjyVar2 = zzfjtVar2.zzs;
            com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzdmrVarZzj, null, zzckiVar, i, versionInfoParcel, str, zzlVar, zzfjyVar2.zzb, zzfjyVar2.zza, this.zzc.zzg, zzdcsVar, zzfjtVar2.zzb() ? this.zzj : null, zzckiVar.zzn()), true, this.zzl);
        } catch (zzckx e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnc
    public final zzfjt zzb() {
        return this.zze;
    }
}

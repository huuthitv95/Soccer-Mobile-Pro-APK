package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzept implements zzelg {
    private final Context zza;
    private final zzdvw zzb;
    private final zzdvf zzc;
    private final zzfkm zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbph zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkl)).booleanValue();
    private final zzekf zzi;
    private final zzdyu zzj;
    private final zzdyz zzk;

    public zzept(Context context, VersionInfoParcel versionInfoParcel, zzfkm zzfkmVar, Executor executor, zzdvf zzdvfVar, zzdvw zzdvwVar, zzbph zzbphVar, zzekf zzekfVar, zzdyu zzdyuVar, zzdyz zzdyzVar) {
        this.zza = context;
        this.zzd = zzfkmVar;
        this.zzc = zzdvfVar;
        this.zze = executor;
        this.zzf = versionInfoParcel;
        this.zzb = zzdvwVar;
        this.zzg = zzbphVar;
        this.zzi = zzekfVar;
        this.zzj = zzdyuVar;
        this.zzk = zzdyzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final boolean zza(zzfke zzfkeVar, zzfjt zzfjtVar) {
        zzfjy zzfjyVar = zzfjtVar.zzs;
        return (zzfjyVar == null || zzfjyVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final ListenableFuture zzb(final zzfke zzfkeVar, final zzfjt zzfjtVar) {
        final zzdwa zzdwaVar = new zzdwa();
        ListenableFuture listenableFutureZza = zzhbi.zza(null);
        zzhaq zzhaqVar = new zzhaq() { // from class: com.google.android.gms.internal.ads.zzeps
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzfjtVar, zzfkeVar, zzdwaVar, obj);
            }
        };
        Executor executor = this.zze;
        ListenableFuture listenableFutureZzj = zzhbi.zzj(listenableFutureZza, zzhaqVar, executor);
        listenableFutureZzj.addListener(new Runnable(zzdwaVar) { // from class: com.google.android.gms.internal.ads.zzepm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
            }
        }, executor);
        return listenableFutureZzj;
    }

    final /* synthetic */ ListenableFuture zzc(final zzfjt zzfjtVar, zzfke zzfkeVar, zzdwa zzdwaVar, Object obj) throws zzckx {
        zzbhv zzbhvVar = zzbie.zzcQ;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
            this.zzj.zzf(zzdyi.RENDERING_WEBVIEW_CREATION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdvw zzdvwVar = this.zzb;
        zzfkm zzfkmVar = this.zzd;
        final zzcki zzckiVarZza = zzdvwVar.zza(zzfkmVar.zzf, zzfjtVar, zzfkeVar.zzb.zzb);
        zzckiVarZza.zzaw(zzfjtVar.zzW);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
            this.zzj.zzf(zzdyi.RENDERING_WEBVIEW_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzcfk zzcfkVar = new zzcfk();
        zzdvf zzdvfVar = this.zzc;
        zzcxx zzcxxVar = new zzcxx(zzfkeVar, zzfjtVar, null);
        Context context = this.zza;
        VersionInfoParcel versionInfoParcel = this.zzf;
        zzbph zzbphVar = this.zzg;
        boolean z = this.zzh;
        zzekf zzekfVar = this.zzi;
        zzdyu zzdyuVar = this.zzj;
        final zzdvb zzdvbVarZzf = zzdvfVar.zzf(zzcxxVar, new zzdvc(new zzepp(context, zzdvwVar, zzfkmVar, versionInfoParcel, zzfjtVar, zzcfkVar, zzckiVarZza, zzbphVar, z, zzekfVar, zzdyuVar, this.zzk), zzckiVarZza));
        zzcfkVar.zzc(zzdvbVarZzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
            zzdyuVar.zzf(zzdyi.RENDERING_AD_COMPONENT_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzbpx.zzb(zzckiVarZza, zzdvbVarZzf.zzk());
        zzdvbVarZzf.zzd().zzq(new zzdcz() { // from class: com.google.android.gms.internal.ads.zzepq
            @Override // com.google.android.gms.internal.ads.zzdcz
            public final /* synthetic */ void zzdr() {
                zzcki zzckiVar = zzckiVarZza;
                if (zzckiVar.zzP() != null) {
                    zzckiVar.zzP().zzq();
                }
            }
        }, zzcff.zzh);
        zzdvbVarZzf.zzl().zzi(zzckiVarZza, true, true != z ? null : zzbphVar, zzdyuVar);
        zzfjy zzfjyVar = zzfjtVar.zzs;
        String strZza = zzfjyVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgn)).booleanValue() && zzdvbVarZzf.zzo().zza(true)) {
            strZza = zzclz.zza(strZza, zzclz.zzb(zzfjtVar));
        }
        zzdvbVarZzf.zzl();
        return zzhbi.zzk(zzdvv.zzj(zzckiVarZza, zzfjyVar.zzb, strZza, zzdyuVar, zzdvfVar.zzd()), new zzgsn(this) { // from class: com.google.android.gms.internal.ads.zzepr
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj2) {
                zzcki zzckiVar = zzckiVarZza;
                if (zzfjtVar.zzM) {
                    zzckiVar.zzav();
                }
                zzdvb zzdvbVar = zzdvbVarZzf;
                zzckiVar.zzJ();
                zzckiVar.onPause();
                return zzdvbVar.zzh();
            }
        }, this.zze);
    }
}

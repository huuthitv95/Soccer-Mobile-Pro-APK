package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzemg implements zzelg {
    private final zzcwe zza;
    private final Context zzb;
    private final zzdvw zzc;
    private final zzfkm zzd;
    private final Executor zze;
    private final zzgsn zzf;
    private final zzdyu zzg;

    public zzemg(zzcwe zzcweVar, Context context, Executor executor, zzdvw zzdvwVar, zzfkm zzfkmVar, zzgsn zzgsnVar, zzdyu zzdyuVar) {
        this.zzb = context;
        this.zza = zzcweVar;
        this.zze = executor;
        this.zzc = zzdvwVar;
        this.zzd = zzfkmVar;
        this.zzf = zzgsnVar;
        this.zzg = zzdyuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final boolean zza(zzfke zzfkeVar, zzfjt zzfjtVar) {
        zzfjy zzfjyVar = zzfjtVar.zzs;
        return (zzfjyVar == null || zzfjyVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final ListenableFuture zzb(final zzfke zzfkeVar, final zzfjt zzfjtVar) {
        return zzhbi.zzj(zzhbi.zza(null), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzemf
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzfkeVar, zzfjtVar, obj);
            }
        }, this.zze);
    }

    final /* synthetic */ ListenableFuture zzc(zzfke zzfkeVar, zzfjt zzfjtVar, Object obj) throws zzckx {
        zzbhv zzbhvVar = zzbie.zzcQ;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
            this.zzg.zzf(zzdyi.RENDERING_WEBVIEW_CREATION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        Context context = this.zzb;
        com.google.android.gms.ads.internal.client.zzr zzrVarZza = zzfks.zza(context, zzfjtVar.zzu);
        final zzcki zzckiVarZza = this.zzc.zza(zzrVarZza, zzfjtVar, zzfkeVar.zzb.zzb);
        zzckiVarZza.zzaw(zzfjtVar.zzW);
        View viewZza = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziZ)).booleanValue() && zzfjtVar.zzag) ? zzcwt.zza(context, zzckiVarZza.zzE(), zzfjtVar) : new zzdvz(context, zzckiVarZza.zzE(), (com.google.android.gms.ads.internal.util.zzat) this.zzf.apply(zzfjtVar));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
            this.zzg.zzf(zzdyi.RENDERING_WEBVIEW_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzcwe zzcweVar = this.zza;
        zzcxx zzcxxVar = new zzcxx(zzfkeVar, zzfjtVar, null);
        Objects.requireNonNull(zzckiVarZza);
        final zzcva zzcvaVarZzf = zzcweVar.zzf(zzcxxVar, new zzcvg(viewZza, zzckiVarZza, new zzcxf() { // from class: com.google.android.gms.internal.ads.zzemb
            @Override // com.google.android.gms.internal.ads.zzcxf
            public final /* synthetic */ com.google.android.gms.ads.internal.client.zzea zza() {
                return zzckiVarZza.zzh();
            }
        }, zzfks.zzb(zzrVarZza)));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
            this.zzg.zzf(zzdyi.RENDERING_AD_COMPONENT_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdvv zzdvvVarZzj = zzcvaVarZzf.zzj();
        zzdyu zzdyuVar = this.zzg;
        zzdvvVarZzj.zzi(zzckiVarZza, false, null, zzdyuVar);
        zzdcx zzdcxVarZzd = zzcvaVarZzf.zzd();
        zzdcz zzdczVar = new zzdcz() { // from class: com.google.android.gms.internal.ads.zzemc
            @Override // com.google.android.gms.internal.ads.zzdcz
            public final /* synthetic */ void zzdr() {
                zzcki zzckiVar = zzckiVarZza;
                if (zzckiVar.zzP() != null) {
                    zzckiVar.zzP().zzq();
                }
            }
        };
        zzhbs zzhbsVar = zzcff.zzh;
        zzdcxVarZzd.zzq(zzdczVar, zzhbsVar);
        zzfjy zzfjyVar = zzfjtVar.zzs;
        String strZza = zzfjyVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgn)).booleanValue() && zzcvaVarZzf.zzm().zza(true)) {
            strZza = zzclz.zza(strZza, zzclz.zzb(zzfjtVar));
        }
        zzcvaVarZzf.zzj();
        ListenableFuture listenableFutureZzj = zzdvv.zzj(zzckiVarZza, zzfjyVar.zzb, strZza, zzdyuVar, zzcweVar.zze());
        if (zzfjtVar.zzM) {
            Objects.requireNonNull(zzckiVarZza);
            listenableFutureZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzema
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzckiVarZza.zzav();
                }
            }, this.zze);
        }
        listenableFutureZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzemd
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd(zzckiVarZza);
            }
        }, this.zze);
        return zzhbi.zzk(listenableFutureZzj, new zzgsn() { // from class: com.google.android.gms.internal.ads.zzeme
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj2) {
                return zzcvaVarZzf.zzi();
            }
        }, zzhbsVar);
    }

    final /* synthetic */ void zzd(zzcki zzckiVar) {
        zzckiVar.zzJ();
        zzfkm zzfkmVar = this.zzd;
        zzclo zzcloVarZzh = zzckiVar.zzh();
        com.google.android.gms.ads.internal.client.zzfw zzfwVar = zzfkmVar.zza;
        if (zzfwVar != null && zzcloVarZzh != null) {
            zzcloVarZzh.zzc(zzfwVar);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzbU)).booleanValue() || zzckiVar.isAttachedToWindow()) {
            return;
        }
        zzckiVar.onPause();
        zzckiVar.zzaG(true);
    }
}

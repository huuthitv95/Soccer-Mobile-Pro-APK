package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdti {
    private final zzfkm zza;
    private final Executor zzb;
    private final zzdvw zzc;
    private final zzdur zzd;
    private final Context zze;
    private final zzdyz zzf;
    private final zzfro zzg;
    private final zzeju zzh;
    private final zzdyu zzi;
    private final zzeac zzj;

    public zzdti(zzfkm zzfkmVar, Executor executor, zzdvw zzdvwVar, Context context, zzdyz zzdyzVar, zzfro zzfroVar, zzeju zzejuVar, zzdur zzdurVar, zzdyu zzdyuVar, zzeac zzeacVar) {
        this.zza = zzfkmVar;
        this.zzb = executor;
        this.zzc = zzdvwVar;
        this.zze = context;
        this.zzf = zzdyzVar;
        this.zzg = zzfroVar;
        this.zzh = zzejuVar;
        this.zzd = zzdurVar;
        this.zzi = zzdyuVar;
        this.zzj = zzeacVar;
    }

    private final void zzh(zzcki zzckiVar, zzcfj zzcfjVar) {
        com.google.android.gms.ads.internal.client.zzfw zzfwVar = this.zza.zza;
        if (zzfwVar != null && zzckiVar.zzh() != null) {
            zzckiVar.zzh().zzc(zzfwVar);
        }
        zzcfjVar.zzb();
    }

    private final void zzi(zzcki zzckiVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcdb zzcdbVar) {
        zzeac zzeacVar;
        zzj(zzckiVar);
        zzckiVar.zzab("/video", zzbpd.zzl);
        zzckiVar.zzab("/videoMeta", zzbpd.zzm);
        zzckiVar.zzab("/precache", new zzcip());
        zzckiVar.zzab("/delayPageLoaded", zzbpd.zzp);
        zzckiVar.zzab("/instrument", zzbpd.zzn);
        zzckiVar.zzab("/log", zzbpd.zzg);
        zzckiVar.zzab("/click", zzbpd.zzb(null, null));
        if (this.zza.zzb != null) {
            zzckiVar.zzP().zzT(true);
            zzckiVar.zzab("/open", new zzbpr(true != ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpe)).booleanValue() ? null : zzbVar, null, null, null, null, null));
        } else {
            zzckiVar.zzP().zzT(false);
        }
        if (com.google.android.gms.ads.internal.zzt.zzD().zza(zzckiVar.getContext())) {
            Map map = new HashMap();
            if (zzckiVar.zzC() != null) {
                map = zzckiVar.zzC().zzaw;
            }
            zzckiVar.zzab("/logScionEvent", new zzbpk(zzckiVar.getContext(), map));
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpe)).booleanValue()) {
            zzckiVar.zzP().zzi(zzbVar);
            zzckiVar.zzP().zzj(zzcdbVar);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziK)).booleanValue() || (zzeacVar = this.zzj) == null) {
            return;
        }
        zzckiVar.zzab("/onDeviceStorageEvent", new zzbpm(zzeacVar));
    }

    private static final void zzj(zzcki zzckiVar) {
        zzckiVar.zzab("/videoClicked", zzbpd.zzh);
        zzckiVar.zzP().zzR(true);
        zzckiVar.zzab("/getNativeAdViewSignals", zzbpd.zzs);
        zzckiVar.zzab("/getNativeClickMeta", zzbpd.zzt);
    }

    public final ListenableFuture zza(final JSONObject jSONObject, final com.google.android.gms.ads.internal.zzb zzbVar, final zzcdb zzcdbVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcU)).booleanValue()) {
            this.zzi.zzf(zzdyi.NATIVE_ASSETS_LOADING_VIDEO_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        ListenableFuture listenableFutureZza = zzhbi.zza(null);
        zzhaq zzhaqVar = new zzhaq() { // from class: com.google.android.gms.internal.ads.zzdtd
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zze(zzbVar, zzcdbVar, obj);
            }
        };
        Executor executor = this.zzb;
        return zzhbi.zzj(zzhbi.zzj(listenableFutureZza, zzhaqVar, executor), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzdth
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(jSONObject, (zzcki) obj);
            }
        }, executor);
    }

    public final ListenableFuture zzb(final String str, final String str2, final zzfjt zzfjtVar, final zzfjw zzfjwVar, final com.google.android.gms.ads.internal.client.zzr zzrVar, final com.google.android.gms.ads.internal.zzb zzbVar, final zzcdb zzcdbVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcU)).booleanValue()) {
            this.zzi.zzf(zzdyi.NATIVE_ASSETS_LOADING_VIDEO_COMPOSITION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        return zzhbi.zzj(zzhbi.zza(null), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzdtc
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzd(zzrVar, zzfjtVar, zzfjwVar, zzbVar, zzcdbVar, str, str2, obj);
            }
        }, this.zzb);
    }

    final /* synthetic */ ListenableFuture zzc(JSONObject jSONObject, final zzcki zzckiVar) {
        zzbrp zzbrpVar = this.zza.zzb;
        final zzcfj zzcfjVarZza = zzcfj.zza(zzckiVar);
        if (zzbrpVar != null) {
            zzckiVar.zzaf(zzcms.zze());
        } else {
            zzckiVar.zzaf(zzcms.zzd());
        }
        zzckiVar.zzP().zzG(new zzcme() { // from class: com.google.android.gms.internal.ads.zzdtg
            @Override // com.google.android.gms.internal.ads.zzcme
            public final /* synthetic */ void zza(boolean z, int i, String str, String str2) {
                this.zza.zzg(zzckiVar, zzcfjVarZza, z, i, str, str2);
            }
        });
        zzckiVar.zzb("google.afma.nativeAds.renderVideo", jSONObject);
        return zzcfjVarZza;
    }

    final /* synthetic */ ListenableFuture zzd(com.google.android.gms.ads.internal.client.zzr zzrVar, zzfjt zzfjtVar, zzfjw zzfjwVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcdb zzcdbVar, String str, String str2, Object obj) throws zzckx {
        final zzcki zzckiVarZza = this.zzc.zza(zzrVar, zzfjtVar, zzfjwVar);
        final zzcfj zzcfjVarZza = zzcfj.zza(zzckiVarZza);
        if (this.zza.zzb != null) {
            zzi(zzckiVarZza, zzbVar, zzcdbVar);
            zzckiVarZza.zzaf(zzcms.zze());
        } else {
            zzduo zzduoVarZza = this.zzd.zza();
            zzcmg zzcmgVarZzP = zzckiVarZza.zzP();
            zzbhv zzbhvVar = zzbie.zzpe;
            zzcmgVarZzP.zzab(zzduoVarZza, zzduoVarZza, zzduoVarZza, zzduoVarZza, zzduoVarZza, false, null, !((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue() ? new com.google.android.gms.ads.internal.zzb(this.zze, null, null) : zzbVar, null, true != ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue() ? null : zzcdbVar, this.zzh, this.zzg, this.zzf, null, zzduoVarZza, null, null, null, null, this.zzj, null, null);
            zzj(zzckiVarZza);
        }
        zzckiVarZza.zzP().zzG(new zzcme() { // from class: com.google.android.gms.internal.ads.zzdtf
            @Override // com.google.android.gms.internal.ads.zzcme
            public final /* synthetic */ void zza(boolean z, int i, String str3, String str4) {
                this.zza.zzf(zzckiVarZza, zzcfjVarZza, z, i, str3, str4);
            }
        });
        zzckiVarZza.zzau(str, str2, null);
        return zzcfjVarZza;
    }

    final /* synthetic */ ListenableFuture zze(com.google.android.gms.ads.internal.zzb zzbVar, zzcdb zzcdbVar, Object obj) throws zzckx {
        zzcki zzckiVarZza = this.zzc.zza(com.google.android.gms.ads.internal.client.zzr.zzb(), null, null);
        final zzcfj zzcfjVarZza = zzcfj.zza(zzckiVarZza);
        zzi(zzckiVarZza, zzbVar, zzcdbVar);
        zzckiVarZza.zzP().zzH(new zzcmf() { // from class: com.google.android.gms.internal.ads.zzdte
            @Override // com.google.android.gms.internal.ads.zzcmf
            public final /* synthetic */ void zza() {
                zzcfjVarZza.zzb();
            }
        });
        zzckiVarZza.loadUrl((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeG));
        return zzcfjVarZza;
    }

    final /* synthetic */ void zzf(zzcki zzckiVar, zzcfj zzcfjVar, boolean z, int i, String str, String str2) {
        if (z) {
            com.google.android.gms.ads.internal.client.zzfw zzfwVar = this.zza.zza;
            if (zzfwVar != null && zzckiVar.zzh() != null) {
                zzckiVar.zzh().zzc(zzfwVar);
            }
            zzcfjVar.zzb();
            return;
        }
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 63 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Html video Web View failed to load. Error code: ");
        sb.append(i);
        sb.append(", Description: ");
        sb.append(str);
        sb.append(", Failing URL: ");
        sb.append(str2);
        zzcfjVar.zzd(new zzeov(1, sb.toString()));
    }

    final /* synthetic */ void zzg(zzcki zzckiVar, zzcfj zzcfjVar, boolean z, int i, String str, String str2) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeO)).booleanValue()) {
            zzh(zzckiVar, zzcfjVar);
            return;
        }
        if (z) {
            zzh(zzckiVar, zzcfjVar);
            return;
        }
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 64 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Native Video WebView failed to load. Error code: ");
        sb.append(i);
        sb.append(", Description: ");
        sb.append(str);
        sb.append(", Failing URL: ");
        sb.append(str2);
        zzcfjVar.zzd(new zzeov(1, sb.toString()));
    }
}

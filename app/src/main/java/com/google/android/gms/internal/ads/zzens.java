package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C11494Ie;
import com.mbridge.msdk.foundation.entity.AbstractC13068b;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzens implements zzenm {
    private final zzdnq zza;
    private final zzhbs zzb;
    private final zzdsb zzc;
    private final zzfll zzd;
    private final zzdur zze;
    private final zzdyu zzf;
    private final VersionInfoParcel zzg;
    private final Context zzh;
    private final zzccx zzi;

    public zzens(zzdnq zzdnqVar, zzhbs zzhbsVar, zzdsb zzdsbVar, zzfll zzfllVar, zzdur zzdurVar, zzdyu zzdyuVar, VersionInfoParcel versionInfoParcel, Context context, zzccx zzccxVar) {
        this.zzg = versionInfoParcel;
        this.zzh = context;
        this.zzi = zzccxVar;
        this.zza = zzdnqVar;
        this.zzb = zzhbsVar;
        this.zzc = zzdsbVar;
        this.zzd = zzfllVar;
        this.zze = zzdurVar;
        this.zzf = zzdyuVar;
    }

    private final ListenableFuture zzg(final zzfke zzfkeVar, final zzfjt zzfjtVar, final JSONObject jSONObject) {
        com.google.android.gms.ads.internal.zzb zzbVar;
        zzcdb zzcdbVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcQ)).booleanValue()) {
            this.zzf.zzf(zzdyi.RENDERING_WEBVIEW_CREATION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        final ListenableFuture listenableFutureZzb = this.zzd.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpe)).booleanValue()) {
            Context context = this.zzh;
            zzcdb zzcdbVarZza = zzdca.zza(context, this.zzg, zzfjtVar, this.zzi);
            zzbVar = new com.google.android.gms.ads.internal.zzb(context, zzcdbVarZza, null);
            zzcdbVar = zzcdbVarZza;
        } else {
            zzbVar = new com.google.android.gms.ads.internal.zzb(this.zzh, null, null);
            zzcdbVar = null;
        }
        final com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar;
        final zzcdb zzcdbVar2 = zzcdbVar;
        final ListenableFuture listenableFutureZza = this.zzc.zza(zzfkeVar, zzfjtVar, jSONObject, zzbVar2, zzcdbVar2);
        return zzhbi.zzo(listenableFutureZzb, listenableFutureZza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzenq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzf(listenableFutureZza, listenableFutureZzb, zzfkeVar, zzfjtVar, jSONObject, zzbVar2, zzcdbVar2);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final boolean zza(zzfke zzfkeVar, zzfjt zzfjtVar) {
        zzfjy zzfjyVar = zzfjtVar.zzs;
        return (zzfjyVar == null || zzfjyVar.zzc == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final ListenableFuture zzb(final zzfke zzfkeVar, final zzfjt zzfjtVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcP)).booleanValue()) {
            this.zzf.zzf(zzdyi.RENDERING_NATIVE_ADS_NATIVE_JS_WEBVIEW_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        ListenableFuture listenableFutureZzb = this.zzd.zzb();
        zzhaq zzhaqVar = new zzhaq() { // from class: com.google.android.gms.internal.ads.zzenr
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzfjtVar, (zzdul) obj);
            }
        };
        zzhbs zzhbsVar = this.zzb;
        return zzhbi.zzj(zzhbi.zzj(listenableFutureZzb, zzhaqVar, zzhbsVar), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzenn
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzd(zzfkeVar, zzfjtVar, (JSONArray) obj);
            }
        }, zzhbsVar);
    }

    final /* synthetic */ ListenableFuture zzc(zzfjt zzfjtVar, final zzdul zzdulVar) throws JSONException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcP)).booleanValue()) {
            this.zzf.zzf(zzdyi.RENDERING_NATIVE_ADS_PREPROCESS_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjT)).booleanValue() && PlatformVersion.isAtLeastR()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(C11494Ie.f24627n, zzfjtVar.zzs.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzhbi.zzj(zzdulVar.zzc("google.afma.nativeAds.preProcessJson", jSONObject2), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzeno
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zze(zzdulVar, (JSONObject) obj);
            }
        }, this.zzb);
    }

    final /* synthetic */ ListenableFuture zzd(zzfke zzfkeVar, zzfjt zzfjtVar, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return zzhbi.zzc(new zzedr(3));
        }
        int i = zzfkeVar.zza.zza.zzl;
        if (i <= 1) {
            return zzhbi.zzk(zzg(zzfkeVar, zzfjtVar, jSONArray.getJSONObject(0)), zzenp.zza, this.zzb);
        }
        int length = jSONArray.length();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcR)).booleanValue()) {
            this.zzf.zzd("nsl", String.valueOf(length));
        }
        this.zzd.zza(Math.min(length, i));
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < length) {
                arrayList.add(zzg(zzfkeVar, zzfjtVar, jSONArray.getJSONObject(i2)));
            } else {
                arrayList.add(zzhbi.zzc(new zzedr(3)));
            }
        }
        return zzhbi.zza(arrayList);
    }

    final /* synthetic */ ListenableFuture zze(zzdul zzdulVar, JSONObject jSONObject) throws zzbtl {
        this.zzd.zzc(zzhbi.zza(zzdulVar));
        if (!jSONObject.optBoolean("success")) {
            throw new zzbtl("process json failed");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcP)).booleanValue()) {
            this.zzf.zzf(zzdyi.RENDERING_NATIVE_ADS_PREPROCESS_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        return zzhbi.zza(jSONObject.getJSONObject("json").getJSONArray(AbstractC13068b.JSON_KEY_ADS));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzdpc zzf(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzfke zzfkeVar, zzfjt zzfjtVar, JSONObject jSONObject, com.google.android.gms.ads.internal.zzb zzbVar, zzcdb zzcdbVar) throws Throwable {
        zzdph zzdphVar = (zzdph) listenableFuture.get();
        zzdul zzdulVar = (zzdul) listenableFuture2.get();
        zzbhv zzbhvVar = zzbie.zzcQ;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
            this.zzf.zzf(zzdyi.RENDERING_WEBVIEW_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdpi zzdpiVarZzd = this.zza.zzd(new zzcxx(zzfkeVar, zzfjtVar, null), new zzdps(zzdphVar), new zzdod(jSONObject, zzdulVar, zzbVar, zzcdbVar));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            zzdyu zzdyuVar = this.zzf;
            zzdyuVar.zzf(zzdyi.RENDERING_AD_COMPONENT_CREATION_END.zza(), jCurrentTimeMillis);
            zzdyuVar.zzf(zzdyi.RENDERING_CONFIGURE_WEBVIEW_START.zza(), jCurrentTimeMillis);
        }
        zzdpiVarZzd.zzi().zzb();
        zzdpiVarZzd.zzj().zza(zzdulVar);
        zzdpiVarZzd.zzk().zza(zzdphVar.zzT());
        zzdpiVarZzd.zzl().zza(this.zze, zzdphVar.zzU());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
            this.zzf.zzf(zzdyi.RENDERING_CONFIGURE_WEBVIEW_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        return zzdpiVarZzd.zzh();
    }
}

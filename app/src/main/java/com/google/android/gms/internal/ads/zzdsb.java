package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C11744X3;
import com.ironsource.C11761Y3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdsb {
    private final zzhbs zza;
    private final zzdsq zzb;
    private final zzdsv zzc;
    private final zzdyu zzd;

    zzdsb(zzhbs zzhbsVar, zzdsq zzdsqVar, zzdsv zzdsvVar, zzdyu zzdyuVar) {
        this.zza = zzhbsVar;
        this.zzb = zzdsqVar;
        this.zzc = zzdsvVar;
        this.zzd = zzdyuVar;
    }

    private final ListenableFuture zze(ListenableFuture listenableFuture, zzdyi zzdyiVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcU)).booleanValue()) {
            zzhbi.zzr(listenableFuture, new zzdry(this, zzdyiVar), this.zza);
        }
        return listenableFuture;
    }

    private static final boolean zzf(JSONObject jSONObject) {
        return jSONObject.optInt("template_id") == 3;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00fa  */
    public final ListenableFuture zza(final zzfke zzfkeVar, final zzfjt zzfjtVar, final JSONObject jSONObject, com.google.android.gms.ads.internal.zzb zzbVar, zzcdb zzcdbVar) {
        ListenableFuture listenableFutureZza;
        JSONArray jSONArrayOptJSONArray;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcP)).booleanValue()) {
            this.zzd.zzf(zzdyi.RENDERING_NATIVE_ASSETS_LOADING_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        final ListenableFuture listenableFutureZzc = this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzdsa
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzb(zzfkeVar, zzfjtVar, jSONObject);
            }
        });
        zze(listenableFutureZzc, zzdyi.NATIVE_ASSETS_LOADING_BASIC_END);
        zzdsq zzdsqVar = this.zzb;
        final ListenableFuture listenableFutureZzb = zzdsqVar.zzb(jSONObject, "images", zzdyi.NATIVE_ASSETS_LOADING_IMAGE_START);
        zze(listenableFutureZzb, zzdyi.NATIVE_ASSETS_LOADING_IMAGE_END);
        zzfjw zzfjwVar = zzfkeVar.zzb.zzb;
        final ListenableFuture listenableFutureZzc2 = zzdsqVar.zzc(jSONObject, "images", zzfjtVar, zzfjwVar, zzbVar, zzcdbVar);
        zze(listenableFutureZzc2, zzdyi.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_END);
        final ListenableFuture listenableFutureZza2 = zzdsqVar.zza(jSONObject, "secondary_image", zzdyi.NATIVE_ASSETS_LOADING_LOGO_START);
        zze(listenableFutureZza2, zzdyi.NATIVE_ASSETS_LOADING_LOGO_END);
        final ListenableFuture listenableFutureZza3 = zzdsqVar.zza(jSONObject, "app_icon", zzdyi.NATIVE_ASSETS_LOADING_ICON_START);
        zze(listenableFutureZza3, zzdyi.NATIVE_ASSETS_LOADING_ICON_END);
        final ListenableFuture listenableFutureZzd = zzdsqVar.zzd(jSONObject, C11761Y3.f26572c, zzdyi.NATIVE_ASSETS_LOADING_ATTRIBUTION_START);
        zze(listenableFutureZzd, zzdyi.NATIVE_ASSETS_LOADING_ATTRIBUTION_END);
        final ListenableFuture listenableFutureZzg = zzdsqVar.zzg(jSONObject, zzfjtVar, zzfjwVar, zzbVar, zzcdbVar);
        zze(listenableFutureZzg, zzdyi.NATIVE_ASSETS_LOADING_VIDEO_END);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzov)).booleanValue() || !jSONObject.has("video")) {
            listenableFutureZza = zzhbi.zza(new Bundle());
            break;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject.has("flags") && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("flags")) != null) {
            int i = 0;
            while (true) {
                if (i < jSONArrayOptJSONArray.length()) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject2 == null || !jSONObjectOptJSONObject2.optString("key").equals("afma_video_player_type")) {
                        i++;
                    } else {
                        try {
                            if (Integer.parseInt(jSONObjectOptJSONObject2.optString("value")) == 3) {
                                listenableFutureZza = this.zzb.zzf(listenableFutureZzg);
                                zze(listenableFutureZza, zzdyi.NATIVE_ASSETS_LOADING_MEDIA_END);
                                break;
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
                listenableFutureZza = zzhbi.zza(new Bundle());
                break;
            }
        }
        listenableFutureZza = zzhbi.zza(new Bundle());
        break;
        final ListenableFuture listenableFutureZza4 = this.zzc.zza(jSONObject, "custom_assets");
        zze(listenableFutureZza4, zzdyi.NATIVE_ASSETS_LOADING_CUSTOM_END);
        final ListenableFuture listenableFutureZze = this.zzb.zze(jSONObject, zzbVar, zzcdbVar);
        zze(listenableFutureZze, zzdyi.NATIVE_ASSETS_LOADING_OMID_END);
        ArrayList arrayList = new ArrayList();
        arrayList.add(listenableFutureZzc);
        arrayList.add(listenableFutureZzb);
        arrayList.add(listenableFutureZzc2);
        arrayList.add(listenableFutureZza2);
        arrayList.add(listenableFutureZza3);
        arrayList.add(listenableFutureZzd);
        arrayList.add(listenableFutureZzg);
        arrayList.add(listenableFutureZza);
        arrayList.add(listenableFutureZza4);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgr)).booleanValue() || zzf(jSONObject)) {
            arrayList.add(listenableFutureZze);
        }
        final ListenableFuture listenableFuture = listenableFutureZza;
        return zzhbi.zzn(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdrz
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc(listenableFutureZzc, listenableFutureZzb, listenableFutureZza3, listenableFutureZza2, listenableFutureZzd, jSONObject, listenableFutureZzg, listenableFuture, listenableFutureZzc2, listenableFutureZze, listenableFutureZza4);
            }
        }, this.zza);
    }

    final /* synthetic */ zzdph zzb(zzfke zzfkeVar, zzfjt zzfjtVar, JSONObject jSONObject) throws zzeov {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcU)).booleanValue()) {
            this.zzd.zzf(zzdyi.NATIVE_ASSETS_LOADING_BASIC_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdph zzdphVar = new zzdph();
        zzdphVar.zza(jSONObject.optInt("template_id", -1));
        zzdphVar.zzl(jSONObject.optString("custom_template_id"));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings");
        zzdphVar.zzv(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("omid_partner_name") : null);
        zzfkm zzfkmVar = zzfkeVar.zza.zza;
        if (!zzfkmVar.zzh.contains(Integer.toString(zzdphVar.zzx()))) {
            int iZzx = zzdphVar.zzx();
            StringBuilder sb = new StringBuilder(String.valueOf(iZzx).length() + 21);
            sb.append("Invalid template ID: ");
            sb.append(iZzx);
            throw new zzeov(1, sb.toString());
        }
        if (zzdphVar.zzx() == 3) {
            if (zzdphVar.zzS() == null) {
                throw new zzeov(1, "No custom template id for custom template ad response.");
            }
            if (!zzfkmVar.zzi.contains(zzdphVar.zzS())) {
                throw new zzeov(1, "Unexpected custom template id in the response.");
            }
        }
        zzdphVar.zzi(jSONObject.optDouble(CampaignEx.JSON_KEY_STAR, -1.0d));
        String strOptString = jSONObject.optString("headline", null);
        if (zzfjtVar.zzM) {
            com.google.android.gms.ads.internal.zzt.zzc();
            String strZzB = com.google.android.gms.ads.internal.util.zzs.zzB();
            StringBuilder sb2 = new StringBuilder(String.valueOf(strZzB).length() + 3 + String.valueOf(strOptString).length());
            sb2.append(strZzB);
            sb2.append(" : ");
            sb2.append(strOptString);
            strOptString = sb2.toString();
        }
        zzdphVar.zzs("headline", strOptString);
        zzdphVar.zzs("body", jSONObject.optString("body", null));
        zzdphVar.zzs("call_to_action", jSONObject.optString("call_to_action", null));
        zzdphVar.zzs(C11744X3.i.f26349U, jSONObject.optString(C11744X3.i.f26349U, null));
        zzdphVar.zzs("price", jSONObject.optString("price", null));
        zzdphVar.zzs(C11744X3.i.f26327F0, jSONObject.optString(C11744X3.i.f26327F0, null));
        return zzdphVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzdph zzc(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3, ListenableFuture listenableFuture4, ListenableFuture listenableFuture5, JSONObject jSONObject, ListenableFuture listenableFuture6, ListenableFuture listenableFuture7, ListenableFuture listenableFuture8, ListenableFuture listenableFuture9, ListenableFuture listenableFuture10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcP)).booleanValue()) {
            this.zzd.zzf(zzdyi.RENDERING_NATIVE_ASSETS_LOADING_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdph zzdphVar = (zzdph) listenableFuture.get();
        zzdphVar.zzd((List) listenableFuture2.get());
        zzdphVar.zzj((zzbls) listenableFuture3.get());
        zzdphVar.zzk((zzbls) listenableFuture4.get());
        zzdphVar.zzc((zzbll) listenableFuture5.get());
        zzdphVar.zze(zzdsq.zzl(jSONObject));
        zzdphVar.zzf(zzdsq.zzk(jSONObject));
        zzcki zzckiVar = (zzcki) listenableFuture6.get();
        if (zzckiVar != null) {
            zzdphVar.zzm(zzckiVar);
            zzdphVar.zzg(zzckiVar.zzE());
            zzdphVar.zzb(zzckiVar.zzh());
        }
        zzdphVar.zzH().putAll((Bundle) listenableFuture7.get());
        zzcki zzckiVar2 = (zzcki) listenableFuture8.get();
        if (zzckiVar2 != null) {
            zzdphVar.zzn(zzckiVar2);
            zzdphVar.zzh(zzckiVar2.zzE());
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgr)).booleanValue() || zzf(jSONObject)) {
            zzcki zzckiVar3 = (zzcki) listenableFuture9.get();
            if (zzckiVar3 != null) {
                zzdphVar.zzo(zzckiVar3);
            }
        } else {
            zzdphVar.zzp(listenableFuture9);
            zzdphVar.zzr(new zzcfk());
        }
        for (zzdss zzdssVar : (List) listenableFuture10.get()) {
            if (zzdssVar.zza != 1) {
                zzdphVar.zzt(zzdssVar.zzb, zzdssVar.zzd);
            } else {
                zzdphVar.zzs(zzdssVar.zzb, zzdssVar.zzc);
            }
        }
        return zzdphVar;
    }

    final /* synthetic */ zzdyu zzd() {
        return this.zzd;
    }
}

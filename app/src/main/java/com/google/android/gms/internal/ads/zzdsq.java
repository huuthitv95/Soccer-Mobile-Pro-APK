package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C11761Y3;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdsq {
    private final Context zza;
    private final zzdrw zzb;
    private final zzbai zzc;
    private final VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbhd zzf;
    private final Executor zzg;
    private final zzblh zzh;
    private final zzdti zzi;
    private final zzdvw zzj;
    private final ScheduledExecutorService zzk;
    private final zzdur zzl;
    private final zzdyz zzm;
    private final zzfro zzn;
    private final zzeju zzo;
    private final zzekf zzp;
    private final zzfkq zzq;
    private final zzdyu zzr;
    private final zzeac zzs;

    public zzdsq(Context context, zzdrw zzdrwVar, zzbai zzbaiVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbhd zzbhdVar, Executor executor, zzfkm zzfkmVar, zzdti zzdtiVar, zzdvw zzdvwVar, ScheduledExecutorService scheduledExecutorService, zzdyz zzdyzVar, zzfro zzfroVar, zzeju zzejuVar, zzdur zzdurVar, zzekf zzekfVar, zzfkq zzfkqVar, zzdyu zzdyuVar, zzeac zzeacVar) {
        this.zza = context;
        this.zzb = zzdrwVar;
        this.zzc = zzbaiVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbhdVar;
        this.zzg = executor;
        this.zzh = zzfkmVar.zzj;
        this.zzi = zzdtiVar;
        this.zzj = zzdvwVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdyzVar;
        this.zzn = zzfroVar;
        this.zzo = zzejuVar;
        this.zzl = zzdurVar;
        this.zzp = zzekfVar;
        this.zzq = zzfkqVar;
        this.zzr = zzdyuVar;
        this.zzs = zzeacVar;
    }

    public static final com.google.android.gms.ads.internal.client.zzew zzk(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzs(jSONObjectOptJSONObject);
    }

    public static final List zzl(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
        if (jSONObjectOptJSONObject == null) {
            return zzgvz.zzi();
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("reasons");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzgvz.zzi();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            com.google.android.gms.ads.internal.client.zzew zzewVarZzs = zzs(jSONArrayOptJSONArray.optJSONObject(i));
            if (zzewVarZzs != null) {
                arrayList.add(zzewVarZzs);
            }
        }
        return zzgvz.zzq(arrayList);
    }

    private final ListenableFuture zzm(JSONArray jSONArray, boolean z, boolean z2, zzdyi zzdyiVar) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzhbi.zza(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcU)).booleanValue()) {
            this.zzr.zzf(zzdyiVar.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        for (int i = 0; i < length; i++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i), z, null));
        }
        return zzhbi.zzk(zzhbi.zzm(arrayList), zzdsp.zza, this.zzg);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    private final ListenableFuture zzn(JSONObject jSONObject, boolean z, zzdyi zzdyiVar) {
        HashMap map;
        if (jSONObject == null) {
            return zzhbi.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeP)).booleanValue()) {
            if (jSONObject.has((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeQ))) {
                HashMap map2 = new HashMap();
                for (String str : ((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeR)).split(",")) {
                    try {
                        map2.put(str, jSONObject.getString(str));
                    } catch (JSONException unused) {
                    }
                }
                map = map2;
            } else {
                map = null;
            }
        } else {
            map = null;
        }
        final String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString) && map == null) {
            return zzhbi.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcU)).booleanValue() && zzdyiVar != null) {
            this.zzr.zzf(zzdyiVar.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z || map != null) {
            return zzhbi.zza(new zzbld(null, Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2, map));
        }
        return zzq("NativeAssetsLoader.loadImage", jSONObject.optBoolean("require"), zzhbi.zzk(this.zzb.zza(strOptString, dOptDouble, zOptBoolean), new zzgsn() { // from class: com.google.android.gms.internal.ads.zzdsf
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                return new zzbld(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2, null);
            }
        }, this.zzg), null);
    }

    private static Integer zzo(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)));
        } catch (JSONException unused) {
            return null;
        }
    }

    private final ListenableFuture zzp(JSONObject jSONObject, zzfjt zzfjtVar, zzfjw zzfjwVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcdb zzcdbVar) {
        final ListenableFuture listenableFutureZzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfjtVar, zzfjwVar, zzr(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)), zzbVar, zzcdbVar);
        return zzhbi.zzj(listenableFutureZzb, new zzhaq() { // from class: com.google.android.gms.internal.ads.zzdsk
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) throws zzeov {
                zzcki zzckiVar = (zzcki) obj;
                if (zzckiVar == null || zzckiVar.zzh() == null) {
                    throw new zzeov(1, "Retrieve video view in html5 ad response failed.");
                }
                return listenableFutureZzb;
            }
        }, zzcff.zzh);
    }

    private final ListenableFuture zzq(String str, boolean z, final ListenableFuture listenableFuture, Object obj) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcV)).booleanValue()) {
            zzcfi.zza(listenableFuture, str, this.zzg);
        }
        if (z) {
            return zzhbi.zzj(listenableFuture, new zzhaq() { // from class: com.google.android.gms.internal.ads.zzdsm
                @Override // com.google.android.gms.internal.ads.zzhaq
                public final /* synthetic */ ListenableFuture zza(Object obj2) {
                    return obj2 != null ? listenableFuture : zzhbi.zzc(new zzeov(1, "Retrieve required value in native ad response failed."));
                }
            }, zzcff.zzh);
        }
        final Object obj2 = null;
        return zzhbi.zzh(listenableFuture, Exception.class, new zzhaq(obj2) { // from class: com.google.android.gms.internal.ads.zzdsl
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj3) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (Exception) obj3);
                return zzhbi.zza(null);
            }
        }, zzcff.zzh);
    }

    private static final com.google.android.gms.ads.internal.client.zzew zzs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new com.google.android.gms.ads.internal.client.zzew(strOptString, strOptString2);
    }

    public final ListenableFuture zza(JSONObject jSONObject, String str, zzdyi zzdyiVar) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb, zzdyiVar);
    }

    public final ListenableFuture zzb(JSONObject jSONObject, String str, zzdyi zzdyiVar) {
        zzblh zzblhVar = this.zzh;
        return zzm(jSONObject.optJSONArray("images"), zzblhVar.zzb, zzblhVar.zzd, zzdyiVar);
    }

    public final ListenableFuture zzc(JSONObject jSONObject, String str, final zzfjt zzfjtVar, final zzfjw zzfjwVar, final com.google.android.gms.ads.internal.zzb zzbVar, final zzcdb zzcdbVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlt)).booleanValue()) {
            return zzhbi.zza(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzhbi.zza(null);
        }
        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            return zzhbi.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeP)).booleanValue()) {
            if (jSONObjectOptJSONObject.has((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeQ))) {
                return zzhbi.zza(null);
            }
        }
        final String strOptString = jSONObjectOptJSONObject.optString("base_url");
        final String strOptString2 = jSONObjectOptJSONObject.optString("html");
        final com.google.android.gms.ads.internal.client.zzr zzrVarZzr = zzr(jSONObjectOptJSONObject.optInt("width", 0), jSONObjectOptJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(strOptString2)) {
            return zzhbi.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcU)).booleanValue()) {
            this.zzr.zzf(zzdyi.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        final ListenableFuture listenableFutureZzj = zzhbi.zzj(zzhbi.zza(null), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzdsg
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzh(zzrVarZzr, zzfjtVar, zzfjwVar, zzbVar, zzcdbVar, strOptString, strOptString2, obj);
            }
        }, zzcff.zzf);
        ListenableFuture listenableFutureZzj2 = zzhbi.zzj(listenableFutureZzj, new zzhaq() { // from class: com.google.android.gms.internal.ads.zzdsh
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) throws zzeov {
                if (((zzcki) obj) != null) {
                    return listenableFutureZzj;
                }
                throw new zzeov(1, "Retrieve Web View from image ad response failed.");
            }
        }, zzcff.zzh);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcV)).booleanValue()) {
            zzcfi.zza(listenableFutureZzj2, "NativeAssetsLoader.loadImageHtml", this.zzg);
        }
        return listenableFutureZzj2;
    }

    public final ListenableFuture zzd(JSONObject jSONObject, String str, zzdyi zzdyiVar) {
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(C11761Y3.f26572c);
        if (jSONObjectOptJSONObject == null) {
            return zzhbi.zza(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("images");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
        if (jSONArrayOptJSONArray == null && jSONObjectOptJSONObject2 != null) {
            jSONArrayOptJSONArray = new JSONArray();
            jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
        }
        return zzq("NativeAssetsLoader.loadAttributionInfo", jSONObjectOptJSONObject.optBoolean("require"), zzhbi.zzk(zzm(jSONArrayOptJSONArray, false, true, zzdyiVar), new zzgsn() { // from class: com.google.android.gms.internal.ads.zzdsi
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzi(jSONObjectOptJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final ListenableFuture zze(JSONObject jSONObject, final com.google.android.gms.ads.internal.zzb zzbVar, final zzcdb zzcdbVar) {
        if (!jSONObject.optBoolean("enable_omid")) {
            return zzhbi.zza(null);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings");
        if (jSONObjectOptJSONObject == null) {
            return zzhbi.zza(null);
        }
        final String strOptString = jSONObjectOptJSONObject.optString("omid_html");
        if (TextUtils.isEmpty(strOptString)) {
            return zzhbi.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcU)).booleanValue()) {
            this.zzr.zzf(zzdyi.NATIVE_ASSETS_LOADING_OMID_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        ListenableFuture listenableFutureZzj = zzhbi.zzj(zzhbi.zza(null), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzdsj
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzj(strOptString, zzcdbVar, zzbVar, obj);
            }
        }, zzcff.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcV)).booleanValue()) {
            zzcfi.zza(listenableFutureZzj, "NativeAssetsLoader.omidWebView", this.zzg);
        }
        return listenableFutureZzj;
    }

    public final ListenableFuture zzf(ListenableFuture listenableFuture) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcU)).booleanValue()) {
            this.zzr.zzf(zzdyi.NATIVE_ASSETS_LOADING_MEDIA_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzcfk zzcfkVar = new zzcfk();
        zzhbi.zzr(listenableFuture, new zzdse(this, zzcfkVar), zzcff.zzf);
        return zzcfkVar;
    }

    public final ListenableFuture zzg(JSONObject jSONObject, zzfjt zzfjtVar, zzfjw zzfjwVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcdb zzcdbVar) {
        zzdsq zzdsqVar;
        ListenableFuture listenableFutureZza;
        JSONObject jSONObjectZzi = com.google.android.gms.ads.internal.util.zzbp.zzi(jSONObject, "html_containers", "instream");
        if (jSONObjectZzi != null) {
            return zzp(jSONObjectZzi, zzfjtVar, zzfjwVar, zzbVar, zzcdbVar);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject == null) {
            return zzhbi.zza(null);
        }
        String strOptString = jSONObjectOptJSONObject.optString("vast_xml");
        boolean z = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzls)).booleanValue() && jSONObjectOptJSONObject.has("html");
        if (TextUtils.isEmpty(strOptString) && !z) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Required field 'vast_xml' or 'html' is missing");
            return zzhbi.zza(null);
        }
        if (z) {
            zzdsqVar = this;
            listenableFutureZza = zzdsqVar.zzp(jSONObjectOptJSONObject, zzfjtVar, zzfjwVar, zzbVar, zzcdbVar);
        } else {
            zzdsqVar = this;
            listenableFutureZza = zzdsqVar.zzi.zza(jSONObjectOptJSONObject, zzbVar, zzcdbVar);
        }
        return zzq(true != z ? "NativeAssetsLoader.loadVideoView" : "NativeAssetsLoader.loadVideoHtml", false, zzhbi.zzi(listenableFutureZza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeH)).intValue(), TimeUnit.SECONDS, zzdsqVar.zzk), null);
    }

    final /* synthetic */ ListenableFuture zzh(com.google.android.gms.ads.internal.client.zzr zzrVar, zzfjt zzfjtVar, zzfjw zzfjwVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcdb zzcdbVar, String str, String str2, Object obj) throws zzckx {
        zzeac zzeacVar;
        zzcki zzckiVarZza = this.zzj.zza(zzrVar, zzfjtVar, zzfjwVar);
        final zzcfj zzcfjVarZza = zzcfj.zza(zzckiVarZza);
        zzduo zzduoVarZza = this.zzl.zza();
        zzcmg zzcmgVarZzP = zzckiVarZza.zzP();
        zzbhv zzbhvVar = zzbie.zzpe;
        zzcmgVarZzP.zzab(zzduoVarZza, zzduoVarZza, zzduoVarZza, zzduoVarZza, zzduoVarZza, false, null, !((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue() ? new com.google.android.gms.ads.internal.zzb(this.zza, null, null) : zzbVar, null, true != ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue() ? null : zzcdbVar, this.zzo, this.zzn, this.zzm, null, zzduoVarZza, null, null, null, null, null, null, null);
        zzckiVarZza.zzab("/getNativeAdViewSignals", zzbpd.zzs);
        zzckiVarZza.zzab("/getNativeClickMeta", zzbpd.zzt);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziK)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziM)).booleanValue() && (zzeacVar = this.zzs) != null) {
                zzckiVarZza.zzab("/onDeviceStorageEvent", new zzbpm(zzeacVar));
            }
        }
        zzckiVarZza.zzP().zzS(true);
        zzckiVarZza.zzP().zzG(new zzcme() { // from class: com.google.android.gms.internal.ads.zzdso
            @Override // com.google.android.gms.internal.ads.zzcme
            public final /* synthetic */ void zza(boolean z, int i, String str3, String str4) {
                zzcfj zzcfjVar = zzcfjVarZza;
                if (z) {
                    zzcfjVar.zzb();
                    return;
                }
                int length = String.valueOf(i).length();
                StringBuilder sb = new StringBuilder(length + 58 + String.valueOf(str3).length() + 15 + String.valueOf(str4).length());
                sb.append("Image Web View failed to load. Error code: ");
                sb.append(i);
                sb.append(", Description: ");
                sb.append(str3);
                sb.append(", Failing URL: ");
                sb.append(str4);
                zzcfjVar.zzd(new zzeov(1, sb.toString()));
            }
        });
        zzckiVarZza.zzau(str, str2, null);
        return zzcfjVarZza;
    }

    final /* synthetic */ zzbla zzi(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String strOptString = jSONObject.optString("text");
        Integer numZzo = zzo(jSONObject, "bg_color");
        Integer numZzo2 = zzo(jSONObject, "text_color");
        int iOptInt = jSONObject.optInt("text_size", -1);
        boolean zOptBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int iOptInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzbla(strOptString, list, numZzo, numZzo2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, this.zzh.zze, zOptBoolean);
    }

    final /* synthetic */ ListenableFuture zzj(String str, zzcdb zzcdbVar, com.google.android.gms.ads.internal.zzb zzbVar, Object obj) throws zzckx {
        com.google.android.gms.ads.internal.zzt.zzd();
        Context context = this.zza;
        zzekf zzekfVar = this.zzp;
        zzcki zzckiVarZza = zzcky.zza(context, zzcms.zzb(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null, zzekfVar, this.zzq, this.zzm);
        final zzcfj zzcfjVarZza = zzcfj.zza(zzckiVarZza);
        zzckiVarZza.zzP().zzG(new zzcme() { // from class: com.google.android.gms.internal.ads.zzdsn
            @Override // com.google.android.gms.internal.ads.zzcme
            public final /* synthetic */ void zza(boolean z, int i, String str2, String str3) {
                zzcfjVarZza.zzb();
            }
        });
        zzckiVarZza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpe)).booleanValue()) {
            if (zzcdbVar != null) {
                zzckiVarZza.zzP().zzj(zzcdbVar);
            }
            zzckiVarZza.zzP().zzi(zzbVar);
        }
        return zzcfjVarZza;
    }

    private final com.google.android.gms.ads.internal.client.zzr zzr(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return com.google.android.gms.ads.internal.client.zzr.zzb();
            }
            i = 0;
        }
        return new com.google.android.gms.ads.internal.client.zzr(this.zza, new AdSize(i, i2));
    }
}

package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbpd {
    public static final zzbpe zza = zzbpc.zza;
    public static final zzbpe zzb = zzbot.zza;
    public static final zzbpe zzc = zzbou.zza;
    public static final zzbpe zzd = new zzbol();
    public static final zzbpe zze = new zzbom();
    public static final zzbpe zzf = zzboz.zza;
    public static final zzbpe zzg = new zzbon();
    public static final zzbpe zzh = new zzboo();
    public static final zzbpe zzi = zzbpa.zza;
    public static final zzbpe zzj = new zzbop();
    public static final zzbpe zzk = new zzboq();
    public static final zzbpe zzl = new zzcic();
    public static final zzbpe zzm = new zzcid();
    public static final zzbpe zzn = new zzbnx();
    public static final zzbpv zzo = new zzbpv();
    public static final zzbpe zzp = new zzbor();
    public static final zzbpe zzq = new zzbos();
    public static final zzbpe zzr = new zzbny();
    public static final zzbpe zzs = new zzbnz();
    public static final zzbpe zzt = new zzboa();
    public static final zzbpe zzu = new zzbob();
    public static final zzbpe zzv = new zzboc();
    public static final zzbpe zzw = new zzbod();
    public static final zzbpe zzx = new zzboe();
    public static final zzbpe zzy = new zzbof();
    public static final zzbpe zzz = new zzbog();
    public static final zzbpe zzA = new zzboh();
    public static final zzbpe zzB = new zzboj();
    public static final zzbpe zzC = new zzbok();

    public static ListenableFuture zza(zzcki zzckiVar, String str) {
        Uri uriZzd = Uri.parse(str);
        try {
            zzbai zzbaiVarZzS = zzckiVar.zzS();
            zzfkq zzfkqVarZzT = zzckiVar.zzT();
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zznu)).booleanValue() || zzfkqVarZzT == null) {
                if (zzbaiVarZzS != null && zzbaiVarZzS.zza(uriZzd)) {
                    uriZzd = zzbaiVarZzS.zzd(uriZzd, zzckiVar.getContext(), zzckiVar.zzE(), zzckiVar.zzj());
                }
            } else if (zzbaiVarZzS != null && zzbaiVarZzS.zza(uriZzd)) {
                uriZzd = zzfkqVarZzT.zza(uriZzd, zzckiVar.getContext(), zzckiVar.zzE(), zzckiVar.zzj());
            }
        } catch (zzbaj unused) {
            String strConcat = "Unable to append parameter to URL: ".concat(str);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
        }
        Map map = new HashMap();
        if (zzckiVar.zzC() != null) {
            map = zzckiVar.zzC().zzaw;
        }
        final String strZzb = zzcdp.zzb(uriZzd, zzckiVar.getContext(), map);
        long jLongValue = ((Long) zzbkd.zze.zze()).longValue();
        if (jLongValue <= 0 || jLongValue > 260910000) {
            return zzhbi.zza(strZzb);
        }
        zzhba zzhbaVarZzw = zzhba.zzw(zzckiVar.zzaF());
        zzbov zzbovVar = zzbov.zza;
        zzhbs zzhbsVar = zzcff.zzh;
        return (zzhba) zzhbi.zzg((zzhba) zzhbi.zzk((zzhba) zzhbi.zzg(zzhbaVarZzw, Throwable.class, zzbovVar, zzhbsVar), new zzgsn() { // from class: com.google.android.gms.internal.ads.zzbow
            /* JADX WARN: Code duplicated, block: B:16:0x004f  */
            /* JADX WARN: Code duplicated, block: B:19:0x0059  */
            /* JADX WARN: Code duplicated, block: B:21:0x0067  */
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                String str2;
                String str3;
                Uri uri;
                String str4 = (String) obj;
                zzbpe zzbpeVar = zzbpd.zza;
                String strReplace = strZzb;
                if (str4 != null) {
                    if (((Boolean) zzbkd.zzf.zze()).booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(strReplace).getHost();
                        for (int i2 = 0; i2 < 3; i2++) {
                            if (host.endsWith(strArr[i2])) {
                                str2 = (String) zzbkd.zza.zze();
                                str3 = (String) zzbkd.zzb.zze();
                                if (!TextUtils.isEmpty(str2)) {
                                    strReplace = strReplace.replace(str2, str4);
                                }
                                if (!TextUtils.isEmpty(str3)) {
                                    uri = Uri.parse(strReplace);
                                    if (!TextUtils.isEmpty(uri.getQueryParameter(str3))) {
                                        break;
                                    }
                                    return uri.buildUpon().appendQueryParameter(str3, str4).toString();
                                }
                                break;
                            }
                        }
                    } else {
                        str2 = (String) zzbkd.zza.zze();
                        str3 = (String) zzbkd.zzb.zze();
                        if (!TextUtils.isEmpty(str2)) {
                            strReplace = strReplace.replace(str2, str4);
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            uri = Uri.parse(strReplace);
                            if (!TextUtils.isEmpty(uri.getQueryParameter(str3))) {
                                return uri.buildUpon().appendQueryParameter(str3, str4).toString();
                            }
                        }
                    }
                }
                return strReplace;
            }
        }, zzhbsVar), Throwable.class, new zzgsn() { // from class: com.google.android.gms.internal.ads.zzbox
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbpe zzbpeVar = zzbpd.zza;
                if (((Boolean) zzbkd.zzi.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "prepareClickUrl.attestation2");
                }
                return strZzb;
            }
        }, zzhbsVar);
    }

    public static zzbpe zzb(final zzdkm zzdkmVar, final zzcsx zzcsxVar) {
        return new zzbpe() { // from class: com.google.android.gms.internal.ads.zzboy
            @Override // com.google.android.gms.internal.ads.zzbpe
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzcki zzckiVar = (zzcki) obj;
                zzbpd.zzc(map, zzdkmVar);
                final String str = (String) map.get("u");
                if (str == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from click GMSG.");
                    return;
                }
                final zzcsx zzcsxVar2 = zzcsxVar;
                zzhba zzhbaVarZzw = zzhba.zzw(zzbpd.zza(zzckiVar, str));
                zzhaq zzhaqVar = new zzhaq() { // from class: com.google.android.gms.internal.ads.zzbpb
                    @Override // com.google.android.gms.internal.ads.zzhaq
                    public final /* synthetic */ ListenableFuture zza(Object obj2) {
                        zzcsx zzcsxVar3;
                        String str2 = (String) obj2;
                        zzbpe zzbpeVar = zzbpd.zza;
                        return (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlu)).booleanValue() && (zzcsxVar3 = zzcsxVar2) != null && zzcsx.zzc(str)) ? zzcsxVar3.zzb(str2, com.google.android.gms.ads.internal.client.zzay.zzh()) : zzhbi.zza(str2);
                    }
                };
                zzhbs zzhbsVar = zzcff.zza;
                zzhbi.zzr((zzhba) zzhbi.zzj(zzhbaVarZzw, zzhaqVar, zzhbsVar), new zzboi(zzckiVar), zzhbsVar);
            }
        };
    }

    public static void zzc(Map map, zzdkm zzdkmVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzme)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzdkmVar != null) {
            zzdkmVar.zzdu();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zze(zzclu zzcluVar, Map map) {
        Intent uri;
        PackageManager packageManager = zzcluVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String strOptString = jSONObject2.optString("id");
                        String strOptString2 = jSONObject2.optString("u");
                        String strOptString3 = jSONObject2.optString(CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT);
                        String strOptString4 = jSONObject2.optString(InneractiveMediationDefs.GENDER_MALE);
                        String strOptString5 = jSONObject2.optString("p");
                        String strOptString6 = jSONObject2.optString("c");
                        String strOptString7 = jSONObject2.optString("intent_url");
                        ResolveInfo resolveInfoResolveActivity = null;
                        if (TextUtils.isEmpty(strOptString7)) {
                            uri = null;
                        } else {
                            try {
                                uri = Intent.parseUri(strOptString7, 0);
                            } catch (URISyntaxException e) {
                                String.valueOf(strOptString7);
                                String strValueOf = String.valueOf(strOptString7);
                                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error parsing the url: ".concat(strValueOf), e);
                                uri = null;
                            }
                        }
                        if (uri == null) {
                            uri = new Intent();
                            if (!TextUtils.isEmpty(strOptString2)) {
                                uri.setData(Uri.parse(strOptString2));
                            }
                            if (!TextUtils.isEmpty(strOptString3)) {
                                uri.setAction(strOptString3);
                            }
                            if (!TextUtils.isEmpty(strOptString4)) {
                                uri.setType(strOptString4);
                            }
                            if (!TextUtils.isEmpty(strOptString5)) {
                                uri.setPackage(strOptString5);
                            }
                            if (!TextUtils.isEmpty(strOptString6)) {
                                String[] strArrSplit = strOptString6.split(RemoteSettings.FORWARD_SLASH_STRING, 2);
                                if (strArrSplit.length == 2) {
                                    uri.setComponent(new ComponentName(strArrSplit[0], strArrSplit[1]));
                                }
                            }
                        }
                        Intent intent = uri;
                        try {
                            resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
                        } catch (NullPointerException e2) {
                            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, intent.toString());
                        }
                        try {
                            jSONObject.put(strOptString, resolveInfoResolveActivity != null);
                        } catch (JSONException e3) {
                            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error constructing openable urls response.", e3);
                        }
                    } catch (JSONException e4) {
                        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error parsing the intent data.", e4);
                    }
                }
                ((zzbsa) zzcluVar).zzd("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((zzbsa) zzcluVar).zzd("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zzbsa) zzcluVar).zzd("openableIntents", new JSONObject());
        }
    }
}

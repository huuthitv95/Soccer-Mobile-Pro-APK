package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.webkit.ProxyConfig;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.mbridge.msdk.MBridgeConstans;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbpr implements zzbpe {
    private final com.google.android.gms.ads.internal.zzb zza;
    private final zzdyz zzb;
    private final zzbxo zzd;
    private final zzeju zze;
    private final zzcsx zzf;
    private final zzdbg zzg;
    private com.google.android.gms.ads.internal.util.client.zzu zzc = null;
    private com.google.android.gms.ads.internal.overlay.zzaa zzh = null;
    private final zzhbs zzi = zzcff.zzh;

    public zzbpr(com.google.android.gms.ads.internal.zzb zzbVar, zzbxo zzbxoVar, zzeju zzejuVar, zzdyz zzdyzVar, zzcsx zzcsxVar, zzdbg zzdbgVar) {
        this.zza = zzbVar;
        this.zzd = zzbxoVar;
        this.zze = zzejuVar;
        this.zzb = zzdyzVar;
        this.zzf = zzcsxVar;
        this.zzg = zzdbgVar;
    }

    public static boolean zzb(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    public static int zzc(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if (CmcdData.Factory.STREAM_TYPE_LIVE.equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    static Uri zzd(Context context, zzbai zzbaiVar, Uri uri, View view, Activity activity, zzfkq zzfkqVar) {
        if (zzbaiVar != null) {
            try {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zznu)).booleanValue() || zzfkqVar == null) {
                    if (zzbaiVar.zze(uri)) {
                        return zzbaiVar.zzd(uri, context, view, activity);
                    }
                } else if (zzbaiVar.zze(uri)) {
                    return zzfkqVar.zza(uri, context, view, activity);
                }
            } catch (zzbaj unused) {
            } catch (Exception e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            }
        }
        return uri;
    }

    static Uri zze(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            String string = uri.toString();
            String.valueOf(string);
            String strValueOf = String.valueOf(string);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error adding click uptime parameter to url: ".concat(strValueOf), e);
        }
        return uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:132:0x036b  */
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final void zzf(String str, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, String str2) {
        String str3;
        boolean zZzb;
        Object obj;
        zzdbg zzdbgVar;
        zzcki zzckiVar = (zzcki) zzaVar;
        zzfjt zzfjtVarZzC = zzckiVar.zzC();
        zzfjw zzfjwVarZzaC = zzckiVar.zzaC();
        boolean zZza = false;
        if (zzfjtVarZzC == null || zzfjwVarZzaC == null) {
            str3 = "";
            zZzb = false;
        } else {
            str3 = zzfjwVarZzaC.zzb;
            zZzb = zzfjtVarZzC.zzb();
        }
        boolean z = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmd)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) ? false : true;
        boolean z2 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzoi)).booleanValue() && map.containsKey("ig_cl") && ((String) map.get("ig_cl")).equals("true");
        if ("expand".equalsIgnoreCase(str2)) {
            if (zzckiVar.zzW()) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot expand WebView that is already expanded.");
                return;
            } else {
                zzl(false);
                ((zzcly) zzaVar).zzaI(zzb(map), zzc(map), z);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            zzl(false);
            boolean z3 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zznq)).booleanValue() && Objects.equals(map.get("is_allowed_for_lock_screen"), "1");
            if (str != null) {
                ((zzcly) zzaVar).zzaJ(zzb(map), zzc(map), str, z, z3);
                return;
            } else {
                ((zzcly) zzaVar).zzaK(zzb(map), zzc(map), (String) map.get("html"), (String) map.get("baseurl"), z);
                return;
            }
        }
        Intent uri = null;
        if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            Context context = zzckiVar.getContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfG)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("User opt out chrome custom tab.");
                zzg(10);
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfA)).booleanValue()) {
                    int i2 = zzbjd.zza;
                    String packageName = CustomTabsClient.getPackageName(context, null);
                    if (packageName != null && !context.getPackageName().equals(packageName)) {
                        zZza = true;
                    }
                } else {
                    zZza = zzbjf.zza(context);
                }
                if (zZza) {
                    boolean z4 = z2;
                    String str4 = str3;
                    zzl(true);
                    if (TextUtils.isEmpty(str)) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot open browser with null or empty url");
                        zzg(7);
                        return;
                    }
                    Uri uriZze = zze(zzd(zzckiVar.getContext(), zzckiVar.zzS(), Uri.parse(str), zzckiVar.zzE(), zzckiVar.zzj(), zzckiVar.zzT()));
                    if (zZzb && this.zze != null && zzi(zzaVar, zzckiVar.getContext(), uriZze.toString(), str4)) {
                        return;
                    }
                    this.zzh = new zzbpo(this);
                    zzcly zzclyVar = (zzcly) zzaVar;
                    String string = uriZze.toString();
                    com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = this.zzh;
                    Bundle bundle = new Bundle();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfF)).booleanValue()) {
                        if (map.containsKey("cct_init_h")) {
                            try {
                                bundle.putInt(CmcdData.Factory.STREAMING_FORMAT_HLS, Integer.parseInt((String) map.get("cct_init_h")));
                            } catch (NumberFormatException e) {
                                com.google.android.gms.ads.internal.util.zze.zzb("Invalid cct initial height parameter.", e);
                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "OpenGmsgHandler.getChromeCustomTabConfigBundle");
                            }
                        }
                        if (map.containsKey("cct_bp")) {
                            try {
                                bundle.putInt("cbp", Integer.parseInt((String) map.get("cct_bp")));
                            } catch (NumberFormatException e2) {
                                com.google.android.gms.ads.internal.util.zze.zzb("Invalid cct close button position parameter.", e2);
                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "OpenGmsgHandler.getChromeCustomTabConfigBundle");
                            }
                        }
                    }
                    zzclyVar.zzaH(new com.google.android.gms.ads.internal.overlay.zzc(null, string, null, null, null, null, null, null, ObjectWrapper.wrap(zzaaVar).asBinder(), true, bundle), z, z4, str4);
                    return;
                }
                zzg(4);
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            zzk(zzaVar, map, zZzb, str3, z, z2);
            return;
        }
        boolean z5 = z2;
        String str5 = str3;
        if (MBridgeConstans.DYNAMIC_VIEW_WX_APP.equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            zzk(zzaVar, map, zZzb, str5, z, z5);
            return;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar2 = zzaVar;
        Map map2 = map;
        boolean z6 = zZzb;
        if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjw)).booleanValue()) {
                zzl(true);
                String str6 = (String) map2.get("p");
                if (str6 == null) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Package name missing from open app action.");
                    return;
                }
                if (z6 && this.zze != null && zzi(zzaVar2, zzckiVar.getContext(), str6, str5)) {
                    return;
                }
                PackageManager packageManager = zzckiVar.getContext().getPackageManager();
                if (packageManager == null) {
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot get package manager from open app action.");
                    return;
                } else {
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str6);
                    if (launchIntentForPackage != null) {
                        ((zzcly) zzaVar2).zzaH(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzh), z, z5, str5);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        zzl(true);
        String str7 = (String) map2.get("intent_url");
        if (!TextUtils.isEmpty(str7)) {
            try {
                uri = Intent.parseUri(str7, 0);
            } catch (URISyntaxException e3) {
                String.valueOf(str7);
                String strValueOf = String.valueOf(str7);
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error parsing the url: ".concat(strValueOf), e3);
            }
        }
        if (uri != null && uri.getData() != null) {
            Uri data = uri.getData();
            if (!Uri.EMPTY.equals(data)) {
                Uri uriZze2 = zze(zzd(zzckiVar.getContext(), zzckiVar.zzS(), data, zzckiVar.zzE(), zzckiVar.zzj(), zzckiVar.zzT()));
                if (TextUtils.isEmpty(uri.getType())) {
                    uri.setData(uriZze2);
                } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjx)).booleanValue()) {
                    uri.setDataAndType(uriZze2, uri.getType());
                } else {
                    uri.setData(uriZze2);
                }
            }
        }
        boolean z7 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjS)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map2.containsKey("event_id");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzon)).booleanValue() && (zzdbgVar = this.zzg) != null) {
            zzdbgVar.zzl();
        }
        HashMap map3 = new HashMap();
        if (z7) {
            boolean z8 = z;
            obj = "event_id";
            zzbpp zzbppVar = new zzbpp(this, z8, zzaVar2, map3, map2);
            zzaVar2 = zzaVar2;
            map2 = map2;
            this.zzh = zzbppVar;
        } else {
            boolean z9 = z;
            obj = "event_id";
            zZza = z9;
        }
        if (uri != null) {
            if (!z6 || this.zze == null || !zzi(zzaVar2, zzckiVar.getContext(), uri.getData().toString(), str5)) {
                ((zzcly) zzaVar2).zzaH(new com.google.android.gms.ads.internal.overlay.zzc(uri, this.zzh), zZza, z5, str5);
                return;
            } else {
                if (z7) {
                    map3.put((String) map2.get(obj), true);
                    ((zzbsa) zzaVar2).zze("openIntentAsync", map3);
                    return;
                }
                return;
            }
        }
        String string2 = !TextUtils.isEmpty(str) ? zze(zzd(zzckiVar.getContext(), zzckiVar.zzS(), Uri.parse(str), zzckiVar.zzE(), zzckiVar.zzj(), zzckiVar.zzT())).toString() : str;
        if (!z6 || this.zze == null || !zzi(zzaVar2, zzckiVar.getContext(), string2, str5)) {
            ((zzcly) zzaVar2).zzaH(new com.google.android.gms.ads.internal.overlay.zzc((String) map2.get(CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT), string2, (String) map2.get(InneractiveMediationDefs.GENDER_MALE), (String) map2.get("p"), (String) map2.get("c"), (String) map2.get(InneractiveMediationDefs.GENDER_FEMALE), (String) map2.get("e"), this.zzh), zZza, z5, str5);
        } else if (z7) {
            map3.put((String) map2.get(obj), true);
            ((zzbsa) zzaVar2).zze("openIntentAsync", map3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbie.zzjM)).booleanValue() != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d8, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbie.zzjH)).booleanValue() : ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbie.zzjG)).booleanValue()) != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzi(com.google.android.gms.ads.internal.client.zza r10, android.content.Context r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbpr.zzi(com.google.android.gms.ads.internal.client.zza, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    private final void zzj(Context context, String str, String str2) {
        zzeju zzejuVar = this.zze;
        zzejuVar.zzd(str);
        zzdyz zzdyzVar = this.zzb;
        if (zzdyzVar != null) {
            zzekf.zzk(context, zzdyzVar, zzejuVar, str, "dialog_not_shown", zzgwc.zzb("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0153  */
    private final void zzk(com.google.android.gms.ads.internal.client.zza zzaVar, Map map, boolean z, String str, boolean z2, boolean z3) {
        boolean z4;
        Uri uriBuild;
        zzcki zzckiVar;
        Intent intentZzd;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo resolveInfoZzb;
        zzl(true);
        zzcki zzckiVar2 = (zzcki) zzaVar;
        Context context = zzckiVar2.getContext();
        zzbai zzbaiVarZzS = zzckiVar2.zzS();
        View viewZzE = zzckiVar2.zzE();
        zzfkq zzfkqVarZzT = zzckiVar2.zzT();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get("u");
        if (TextUtils.isEmpty(str2)) {
            zzckiVar = zzckiVar2;
            intentZzd = null;
        } else {
            Uri uriZze = zze(zzd(context, zzbaiVarZzS, Uri.parse(str2), viewZzE, null, zzfkqVarZzT));
            boolean z5 = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean z6 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                z4 = true;
            } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfw)).booleanValue()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ProxyConfig.MATCH_HTTP.equalsIgnoreCase(uriZze.getScheme())) {
                uriBuild = uriZze.buildUpon().scheme("https").build();
            } else {
                uriBuild = "https".equalsIgnoreCase(uriZze.getScheme()) ? uriZze.buildUpon().scheme(ProxyConfig.MATCH_HTTP).build() : null;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentZza = zzbpq.zza(uriZze, context, zzbaiVarZzS, viewZzE, zzfkqVarZzT);
            Intent intentZza2 = zzbpq.zza(uriBuild, context, zzbaiVarZzS, viewZzE, zzfkqVarZzT);
            if (z4) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzq(context, intentZza);
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzq(context, intentZza2);
            }
            ResolveInfo resolveInfoZzc = zzbpq.zzc(intentZza, arrayList, context, zzbaiVarZzS, viewZzE, zzfkqVarZzT);
            if (resolveInfoZzc != null) {
                intentZzd = zzbpq.zzd(intentZza, resolveInfoZzc, context, zzbaiVarZzS, viewZzE, zzfkqVarZzT);
            } else {
                if (intentZza2 != null && (resolveInfoZzb = zzbpq.zzb(intentZza2, context, zzbaiVarZzS, viewZzE, zzfkqVarZzT)) != null) {
                    intentZzd = zzbpq.zzd(intentZza, resolveInfoZzb, context, zzbaiVarZzS, viewZzE, zzfkqVarZzT);
                    if (zzbpq.zzb(intentZzd, context, zzbaiVarZzS, viewZzE, zzfkqVarZzT) == null) {
                    }
                }
                if (arrayList.isEmpty()) {
                    zzckiVar = zzckiVar2;
                } else if (!z6 || activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                    zzckiVar = zzckiVar2;
                    if (z5) {
                        intentZzd = zzbpq.zzd(intentZza, (ResolveInfo) arrayList.get(0), context, zzbaiVarZzS, viewZzE, zzfkqVarZzT);
                    }
                } else {
                    int size = arrayList.size();
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i);
                            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                            while (true) {
                                int i2 = i + 1;
                                if (it.hasNext()) {
                                    zzckiVar = zzckiVar2;
                                    if (it.next().processName.equals(resolveInfo.activityInfo.packageName)) {
                                        intentZzd = zzbpq.zzd(intentZza, resolveInfo, context, zzbaiVarZzS, viewZzE, zzfkqVarZzT);
                                    } else {
                                        zzckiVar2 = zzckiVar;
                                    }
                                } else {
                                    i = i2;
                                }
                            }
                        } else {
                            zzckiVar = zzckiVar2;
                            if (z5) {
                                intentZzd = zzbpq.zzd(intentZza, (ResolveInfo) arrayList.get(0), context, zzbaiVarZzS, viewZzE, zzfkqVarZzT);
                            }
                        }
                    }
                }
                intentZzd = intentZza;
            }
            zzckiVar = zzckiVar2;
        }
        if (!z || this.zze == null || intentZzd == null || !zzi(zzaVar, zzckiVar.getContext(), intentZzd.getData().toString(), str)) {
            try {
                ((zzcly) zzaVar).zzaH(new com.google.android.gms.ads.internal.overlay.zzc(intentZzd, this.zzh), z2, z3, str);
            } catch (ActivityNotFoundException e) {
                String message = e.getMessage();
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            }
        }
    }

    private final void zzl(boolean z) {
        zzbxo zzbxoVar = this.zzd;
        if (zzbxoVar != null) {
            zzbxoVar.zzb(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzg(int i) {
        zzdyz zzdyzVar;
        String str;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfz)).booleanValue() || (zzdyzVar = this.zzb) == null) {
            return;
        }
        zzdyy zzdyyVarZza = zzdyzVar.zza();
        zzdyyVarZza.zzc("action", "cct_action");
        switch (i) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        zzdyyVarZza.zzc("cct_open_status", str);
        zzdyyVarZza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcsx zzcsxVar;
        com.google.android.gms.ads.internal.client.zza zzaVar = (com.google.android.gms.ads.internal.client.zza) obj;
        String str = (String) map.get("u");
        Map map2 = new HashMap();
        zzcki zzckiVar = (zzcki) zzaVar;
        if (zzckiVar.zzC() != null) {
            map2 = zzckiVar.zzC().zzaw;
        }
        String strZza = zzcdp.zza(str, zzckiVar.getContext(), true, map2);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar == null || zzbVar.zzb()) {
            zzhbi.zzr((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlu)).booleanValue() && (zzcsxVar = this.zzf) != null && zzcsx.zzc(strZza)) ? zzcsxVar.zzb(strZza, com.google.android.gms.ads.internal.client.zzay.zzh()) : zzhbi.zza(strZza), new zzbpn(this, map, zzaVar, str2), this.zzi);
        } else {
            zzbVar.zzc(strZza);
        }
    }
}

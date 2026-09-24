package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public class zzclv extends zzckt {
    public zzclv(zzcki zzckiVar, zzbhd zzbhdVar, boolean z, zzekf zzekfVar) {
        super(zzckiVar, zzbhdVar, z, new zzbxt(zzckiVar, zzckiVar.zzK(), new zzbhl(zzckiVar.getContext())), null, zzekfVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final WebResourceResponse zzac(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof zzcki)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcki zzckiVar = (zzcki) webView;
        zzcdb zzcdbVar = this.zzb;
        if (zzcdbVar != null) {
            zzcdbVar.zze(str, map, 1);
        }
        zzfyu.zza();
        zzfyz zzfyzVar = zzfyz.zza;
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            return super.zzL(str, map);
        }
        if (zzckiVar.zzP() != null) {
            zzckiVar.zzP().zzN();
        }
        if (zzckiVar.zzN().zzg()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzaC);
        } else if (zzckiVar.zzW()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzaB);
        } else {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzaA);
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        return com.google.android.gms.ads.internal.util.zzs.zzz(zzckiVar.getContext(), zzckiVar.zzs().afmaVersion, str2);
    }
}

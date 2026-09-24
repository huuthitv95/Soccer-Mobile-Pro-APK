package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzclt {
    private final zzcls zza;
    private final zzclu zzb;

    public zzclt(zzclu zzcluVar, zzcls zzclsVar) {
        this.zza = zzclsVar;
        this.zzb = zzcluVar;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        zzclu zzcluVar = this.zzb;
        zzbai zzbaiVarZzS = ((zzcmb) zzcluVar).zzS();
        if (zzbaiVarZzS == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzbad zzbadVarZzb = zzbaiVarZzS.zzb();
        if (zzbadVarZzb == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (zzcluVar.getContext() != null) {
            return zzbadVarZzb.zzf(zzcluVar.getContext(), str, ((zzcmd) zzcluVar).zzE(), zzcluVar.zzj());
        }
        com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignals() {
        zzclu zzcluVar = this.zzb;
        zzbai zzbaiVarZzS = ((zzcmb) zzcluVar).zzS();
        if (zzbaiVarZzS == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzbad zzbadVarZzb = zzbaiVarZzS.zzb();
        if (zzbadVarZzb == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (zzcluVar.getContext() != null) {
            return zzbadVarZzb.zzj(zzcluVar.getContext(), ((zzcmd) zzcluVar).zzE(), zzcluVar.zzj());
        }
        com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignalsJson() {
        zzclu zzcluVar = this.zzb;
        zzbie.zza(zzcluVar.getContext());
        String viewSignals = getViewSignals();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzph)).booleanValue()) {
            return viewSignals;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ms", viewSignals);
            zzcmg zzcmgVarZzP = ((zzcki) zzcluVar).zzP();
            zzdbb zzdbbVarZzK = zzcmgVarZzP != null ? zzcmgVarZzP.zzK() : null;
            if (zzdbbVarZzK != null) {
                long jZza = zzdbbVarZzK.zza();
                if (jZza > 0) {
                    jSONObject.put("plcmtid", jZza);
                }
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Error constructing JSON.", e);
            return "";
        }
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (!TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zza(str);
                }
            });
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("URL is empty, ignoring message");
        }
    }

    final /* synthetic */ void zza(String str) {
        this.zza.zza(Uri.parse(str));
    }
}

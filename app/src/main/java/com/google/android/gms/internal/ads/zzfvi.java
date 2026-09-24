package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public class zzfvi {
    private final String zza;
    private zzfwk zzb;
    private long zzc;
    private int zzd;

    public zzfvi(String str) {
        zzp();
        this.zza = str;
        this.zzb = new zzfwk(null);
    }

    public void zza() {
    }

    public void zzb() {
        this.zzb.clear();
    }

    final void zzc(WebView webView) {
        this.zzb = new zzfwk(webView);
    }

    public final WebView zzd() {
        return (WebView) this.zzb.get();
    }

    public final boolean zze() {
        return this.zzb.get() != null;
    }

    public final void zzf(boolean z) {
        if (zze()) {
            zzfuz.zza().zzf(zzd(), this.zza, true != z ? "backgrounded" : "foregrounded");
        }
    }

    public final void zzg(boolean z) {
        if (zze()) {
            zzfuz.zza().zzg(zzd(), this.zza, true != z ? "unlocked" : "locked");
        }
    }

    public final void zzh(String str, long j) {
        if (j >= this.zzc) {
            this.zzd = 2;
            zzfuz.zza().zze(zzd(), this.zza, str);
        }
    }

    public final void zzi(String str, long j) {
        if (j < this.zzc || this.zzd == 3) {
            return;
        }
        this.zzd = 3;
        zzfuz.zza().zze(zzd(), this.zza, str);
    }

    public final void zzj(zzftv zzftvVar) {
        zzfuz.zza().zzb(zzd(), this.zza, zzftvVar.zzb());
    }

    public void zzk(zzfty zzftyVar, zzftw zzftwVar) {
        zzl(zzftyVar, zzftwVar, null);
    }

    protected final void zzl(zzfty zzftyVar, zzftw zzftwVar, JSONObject jSONObject) {
        String strZzh = zzftyVar.zzh();
        JSONObject jSONObject2 = new JSONObject();
        zzfvo.zzc(jSONObject2, "environment", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        zzfvo.zzc(jSONObject2, "adSessionType", zzftwVar.zzi());
        JSONObject jSONObject3 = new JSONObject();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("; ");
        sb.append(str2);
        zzfvo.zzc(jSONObject3, "deviceType", sb.toString());
        zzfvo.zzc(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzfvo.zzc(jSONObject3, C11540L6.f24911F, C11744X3.f26142d);
        zzfvo.zzc(jSONObject2, "deviceInfo", jSONObject3);
        zzfvo.zzc(jSONObject2, "deviceCategory", zzfvn.zzb().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzfvo.zzc(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzfvo.zzc(jSONObject4, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, zzftwVar.zzc().zzb());
        zzfvo.zzc(jSONObject4, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, zzftwVar.zzc().zzc());
        zzfvo.zzc(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzfvo.zzc(jSONObject5, "libraryVersion", "1.5.2-google_20241009");
        zzfvo.zzc(jSONObject5, RemoteConfigConstants.RequestFieldKey.APP_ID, zzfux.zza().zzb().getApplicationContext().getPackageName());
        zzfvo.zzc(jSONObject2, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject5);
        if (zzftwVar.zzg() != null) {
            zzfvo.zzc(jSONObject2, "contentUrl", zzftwVar.zzg());
        }
        if (zzftwVar.zzh() != null) {
            zzfvo.zzc(jSONObject2, "customReferenceData", zzftwVar.zzh());
        }
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = zzftwVar.zzd().iterator();
        if (it.hasNext()) {
            throw null;
        }
        zzfuz.zza().zzc(zzd(), strZzh, jSONObject2, jSONObject6, jSONObject);
    }

    public final void zzm() {
        zzfuz.zza().zzd(zzd(), this.zza);
    }

    public final void zzn(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        zzfvo.zzc(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        zzfuz.zza().zzi(zzd(), jSONObject);
    }

    public final void zzo(float f) {
        zzfuz.zza().zzh(zzd(), this.zza, f);
    }

    public final void zzp() {
        this.zzc = System.nanoTime();
        this.zzd = 1;
    }
}

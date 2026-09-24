package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdwq {
    private final zzfli zza;
    private final zzdwn zzb;

    zzdwq(zzfli zzfliVar, zzdwn zzdwnVar) {
        this.zza = zzfliVar;
        this.zzb = zzdwnVar;
    }

    public final zzflk zza(String str, JSONObject jSONObject) throws zzfkt {
        zzbut zzbutVarZzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzbutVarZzb = new zzbvr(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzbutVarZzb = new zzbvr(new zzbxi());
            } else {
                zzbuq zzbuqVarZzd = zzd();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString(TTEDPEventConstants.EDP_EVENT_PROPERTY_CLASS_NAME);
                        if (zzbuqVarZzd.zzc(string)) {
                            zzbutVarZzb = zzbuqVarZzd.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else {
                            zzbutVarZzb = zzbuqVarZzd.zzd(string) ? zzbuqVarZzd.zzb(string) : zzbuqVarZzd.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (JSONException e) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Invalid custom event.", e);
                        zzbutVarZzb = zzbuqVarZzd.zzb(str);
                    }
                } else {
                    zzbutVarZzb = zzbuqVarZzd.zzb(str);
                }
            }
            zzflk zzflkVar = new zzflk(zzbutVarZzb);
            this.zzb.zza(str, zzflkVar);
            return zzflkVar;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkJ)).booleanValue()) {
                this.zzb.zza(str, null);
            }
            throw new zzfkt(th);
        }
    }

    public final zzbwp zzb(String str) throws RemoteException {
        zzbwp zzbwpVarZze = zzd().zze(str);
        this.zzb.zzb(str, zzbwpVarZze);
        return zzbwpVarZze;
    }

    public final boolean zzc() {
        return this.zza.zzd() != null;
    }

    final zzbuq zzd() throws RemoteException {
        zzbuq zzbuqVarZzd = this.zza.zzd();
        if (zzbuqVarZzd != null) {
            return zzbuqVarZzd;
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Unexpected call to adapter creator.");
        throw new RemoteException();
    }
}

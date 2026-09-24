package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzcff;
import com.google.android.gms.internal.ads.zzcki;
import com.google.android.gms.internal.ads.zzgqk;
import com.google.android.gms.internal.ads.zzgql;
import com.google.android.gms.internal.ads.zzgqm;
import com.google.android.gms.internal.ads.zzgqn;
import com.google.android.gms.internal.ads.zzgrg;
import com.google.android.gms.internal.ads.zzgri;
import com.google.android.gms.internal.ads.zzgrj;
import com.google.android.gms.internal.ads.zzgrk;
import com.google.android.gms.internal.ads.zzgrl;
import com.google.android.gms.internal.ads.zzgry;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzz {
    private zzgrj zzf;
    private zzcki zzc = null;
    private boolean zze = false;
    private String zza = null;
    private zzgqm zzd = null;
    private String zzb = null;

    private final void zzl() {
        if (this.zzf == null) {
            this.zzf = new zzx(this);
        }
    }

    private final zzgrl zzm() {
        zzgrk zzgrkVarZzc = zzgrl.zzc();
        if (!((Boolean) zzba.zzc().zzd(zzbie.zzmU)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzgrkVarZzc.zza(str);
            } else {
                zzg("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzgrkVarZzc.zzb(this.zzb);
        }
        return zzgrkVarZzc.zzc();
    }

    public final synchronized void zza(zzcki zzckiVar, Context context) {
        this.zzc = zzckiVar;
        if (!zzb(context)) {
            zzg("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap map = new HashMap();
        map.put("action", "fetch_completed");
        zzi("on_play_store_bind", map);
    }

    public final synchronized boolean zzb(Context context) {
        if (!zzgry.zza(context)) {
            return false;
        }
        try {
            this.zzd = zzgqn.zza(context);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Error connecting LMD Overlay service");
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.zzd == null) {
            this.zze = false;
            return false;
        }
        zzl();
        this.zze = true;
        return true;
    }

    public final void zzc(zzcki zzckiVar, zzgrg zzgrgVar) {
        if (zzckiVar == null) {
            zzg("adWebview missing", "onLMDShow");
            return;
        }
        this.zzc = zzckiVar;
        if (!this.zze && !zzb(zzckiVar.getContext())) {
            zzg("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) zzba.zzc().zzd(zzbie.zzmU)).booleanValue()) {
            this.zzb = zzgrgVar.zzb();
        }
        zzl();
        zzgqm zzgqmVar = this.zzd;
        if (zzgqmVar != null) {
            zzgqmVar.zza(zzgrgVar, this.zzf);
        }
    }

    public final void zzd() {
        zzgqm zzgqmVar;
        if (!this.zze || (zzgqmVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzgqmVar.zzd(zzm(), this.zzf);
            zzh("onLMDOverlayExpand");
        }
    }

    public final void zze() {
        zzgqm zzgqmVar;
        if (!this.zze || (zzgqmVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzgqmVar.zzc(zzm(), this.zzf);
            zzh("onLMDOverlayCollapse");
        }
    }

    public final void zzf() {
        zzgqm zzgqmVar;
        if (!this.zze || (zzgqmVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        zzgqk zzgqkVarZzc = zzgql.zzc();
        if (!((Boolean) zzba.zzc().zzd(zzbie.zzmU)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzgqkVarZzc.zza(str);
            } else {
                zzg("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzgqkVarZzc.zzb(this.zzb);
        }
        zzgqmVar.zzb(zzgqkVarZzc.zzc(), this.zzf);
    }

    final void zzg(String str, String str2) {
        com.google.android.gms.ads.internal.util.zze.zza(str);
        if (this.zzc != null) {
            HashMap map = new HashMap();
            map.put("message", str);
            map.put("action", str2);
            zzi("onError", map);
        }
    }

    final void zzh(String str) {
        zzi(str, new HashMap());
    }

    final void zzi(final String str, final Map map) {
        zzcff.zzf.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzk(str, map);
            }
        });
    }

    final void zzj(zzgri zzgriVar) {
        if (!TextUtils.isEmpty(zzgriVar.zzb())) {
            if (!((Boolean) zzba.zzc().zzd(zzbie.zzmU)).booleanValue()) {
                this.zza = zzgriVar.zzb();
            }
        }
        switch (zzgriVar.zza()) {
            case 8152:
                zzh("onLMDOverlayOpened");
                break;
            case 8153:
                zzh("onLMDOverlayClicked");
                break;
            case 8155:
                zzh("onLMDOverlayClose");
                break;
            case 8157:
                this.zza = null;
                this.zzb = null;
                this.zze = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put("error", String.valueOf(zzgriVar.zza()));
                zzi("onLMDOverlayFailedToOpen", map);
                break;
        }
    }

    final /* synthetic */ void zzk(String str, Map map) {
        zzcki zzckiVar = this.zzc;
        if (zzckiVar != null) {
            zzckiVar.zze(str, map);
        }
    }
}

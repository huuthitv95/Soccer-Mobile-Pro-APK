package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdby extends com.google.android.gms.ads.internal.client.zzdw {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final List zze;
    private final long zzf;
    private final String zzg;
    private final zzell zzh;
    private final Bundle zzi;
    private final double zzj;
    private final int zzk;

    public zzdby(zzfjt zzfjtVar, String str, zzell zzellVar, zzfjw zzfjwVar, String str2) {
        String string = null;
        this.zzb = zzfjtVar == null ? null : zzfjtVar.zzab;
        this.zzc = str2;
        this.zzd = zzfjwVar == null ? null : zzfjwVar.zzb;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && zzfjtVar != null) {
            try {
                string = zzfjtVar.zzv.getString(TTEDPEventConstants.EDP_EVENT_PROPERTY_CLASS_NAME);
            } catch (JSONException unused) {
            }
        }
        this.zza = string != null ? string : str;
        this.zze = zzellVar.zzh();
        this.zzh = zzellVar;
        this.zzj = zzfjtVar == null ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : zzfjtVar.zzaz;
        this.zzk = zzfjtVar == null ? 2 : zzfjtVar.zzaH;
        this.zzf = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() / 1000;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhK)).booleanValue() || zzfjwVar == null) {
            this.zzi = new Bundle();
        } else {
            this.zzi = zzfjwVar.zzk;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhL)).booleanValue() && zzfjtVar != null) {
            Bundle bundle = zzfjtVar.zzaF;
            Bundle bundle2 = this.zzi;
            if (bundle2 != null) {
                bundle2.putAll(bundle);
            }
        }
        this.zzg = (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkD)).booleanValue() || zzfjwVar == null || TextUtils.isEmpty(zzfjwVar.zzi)) ? "" : zzfjwVar.zzi;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String zzf() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final List zzg() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final com.google.android.gms.ads.internal.client.zzv zzh() {
        zzell zzellVar = this.zzh;
        if (zzellVar != null) {
            return zzellVar.zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final Bundle zzi() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String zzj() {
        return this.zzc;
    }

    public final String zzk() {
        return this.zzd;
    }

    public final double zzl() {
        return this.zzj;
    }

    public final int zzm() {
        return this.zzk;
    }
}

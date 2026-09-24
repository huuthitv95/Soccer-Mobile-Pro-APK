package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C11540L6;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdye implements zzdhh, com.google.android.gms.ads.internal.client.zza, zzdcz, zzdcj, zzdfa {
    private final Context zzc;
    private final zzflf zzd;
    private final zzdyz zze;
    private final zzfke zzf;
    private final zzfjt zzg;
    private final zzeju zzh;
    private final String zzi;
    private Boolean zzk;
    private long zzj = -1;
    final AtomicBoolean zza = new AtomicBoolean(false);
    final AtomicBoolean zzb = new AtomicBoolean(false);
    private final boolean zzl = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhM)).booleanValue();

    public zzdye(Context context, zzflf zzflfVar, zzdyz zzdyzVar, zzfke zzfkeVar, zzfjt zzfjtVar, zzeju zzejuVar, String str) {
        this.zzc = context;
        this.zzd = zzflfVar;
        this.zze = zzdyzVar;
        this.zzf = zzfkeVar;
        this.zzg = zzfjtVar;
        this.zzh = zzejuVar;
        this.zzi = str;
    }

    private final boolean zzf() {
        String strZzr;
        if (this.zzk == null) {
            synchronized (this) {
                if (this.zzk == null) {
                    String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzce);
                    com.google.android.gms.ads.internal.zzt.zzc();
                    try {
                        strZzr = com.google.android.gms.ads.internal.util.zzs.zzr(this.zzc);
                    } catch (RemoteException unused) {
                        strZzr = null;
                    }
                    boolean zMatches = false;
                    if (str != null && strZzr != null) {
                        try {
                            zMatches = Pattern.matches(str, strZzr);
                        } catch (RuntimeException e) {
                            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzk = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.zzk.booleanValue();
    }

    private final zzdyy zzg(String str) {
        zzfke zzfkeVar = this.zzf;
        zzfkd zzfkdVar = zzfkeVar.zzb;
        zzdyy zzdyyVarZza = this.zze.zza();
        zzdyyVarZza.zza(zzfkdVar.zzb);
        zzfjt zzfjtVar = this.zzg;
        zzdyyVarZza.zzb(zzfjtVar);
        zzdyyVarZza.zzc("action", str);
        zzdyyVarZza.zzc(FirebaseAnalytics.Param.AD_FORMAT, this.zzi.toUpperCase(Locale.ROOT));
        List list = zzfjtVar.zzt;
        if (!list.isEmpty()) {
            zzdyyVarZza.zzc("ancn", (String) list.get(0));
        }
        if (zzfjtVar.zzb()) {
            zzdyyVarZza.zzc("device_connectivity", true != com.google.android.gms.ads.internal.zzt.zzh().zzs(this.zzc) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY);
            zzdyyVarZza.zzc("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
            zzdyyVarZza.zzc("offline_ad", "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhT)).booleanValue()) {
            boolean zZza = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zza(zzfkeVar);
            zzdyyVarZza.zzc("scar", String.valueOf(zZza));
            if (zZza) {
                com.google.android.gms.ads.internal.client.zzm zzmVar = zzfkeVar.zza.zza.zzd;
                zzdyyVarZza.zzc("ragent", zzmVar.zzp);
                zzdyyVarZza.zzc("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(zzmVar)));
            }
        }
        return zzdyyVarZza;
    }

    private final void zzi(zzdyy zzdyyVar) {
        if (!this.zzg.zzb()) {
            zzdyyVar.zzd();
            return;
        }
        this.zzh.zze(new zzejw(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis(), this.zzf.zzb.zzb.zzb, zzdyyVar.zzg(), 2));
    }

    private final boolean zzj() {
        int i = this.zzg.zzb;
        return i == 2 || i == 5 || i == 6 || i == 7;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.zzg.zzb()) {
            zzi(zzg("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcj
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzl) {
            zzdyy zzdyyVarZzg = zzg("ifts");
            zzdyyVarZzg.zzc("reason", C11540L6.f24916G1);
            int i = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            if (i >= 0) {
                zzdyyVarZzg.zzc("arec", String.valueOf(i));
            }
            String strZza = this.zzd.zza(str);
            if (strZza != null) {
                zzdyyVarZzg.zzc("areec", strZza);
            }
            zzdyyVarZzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcj
    public final void zzd(zzdnb zzdnbVar) {
        if (this.zzl) {
            zzdyy zzdyyVarZzg = zzg("ifts");
            zzdyyVarZzg.zzc("reason", "exception");
            if (!TextUtils.isEmpty(zzdnbVar.getMessage())) {
                zzdyyVarZzg.zzc(NotificationCompat.CATEGORY_MESSAGE, zzdnbVar.getMessage());
            }
            zzdyyVarZzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzdH() {
        if (zzf()) {
            zzdyy zzdyyVarZzg = zzg("adapter_impression");
            zzdyyVarZzg.zzc("imp_type", String.valueOf(this.zzg.zze));
            if (this.zzb.get()) {
                zzdyyVarZzg.zzc("po", "1");
                zzdyyVarZzg.zzc("pil", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj));
            } else {
                zzdyyVarZzg.zzc("po", "0");
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzoY)).booleanValue() && zzj()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                zzdyyVarZzg.zzc("foreground", true != com.google.android.gms.ads.internal.util.zzs.zzJ(this.zzc) ? "1" : "0");
                zzdyyVarZzg.zzc("fg_show", true != this.zza.get() ? "0" : "1");
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzoZ)).booleanValue() && zzj()) {
                zzdyyVarZzg.zzc("fg_al", true != com.google.android.gms.ads.internal.zzt.zzg().zzf() ? "0" : "1");
            }
            zzdyyVarZzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzdI() {
        if (zzf()) {
            zzg("adapter_shown").zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdr() {
        if (zzf() || this.zzg.zzb()) {
            zzdyy zzdyyVarZzg = zzg("impression");
            zzdyyVarZzg.zzc("imp_type", String.valueOf(this.zzg.zze));
            if (this.zzj > 0) {
                zzdyyVarZzg.zzc("p_imp_l", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj));
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzoY)).booleanValue() && zzj()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                zzdyyVarZzg.zzc("foreground", true != com.google.android.gms.ads.internal.util.zzs.zzJ(this.zzc) ? "1" : "0");
                zzdyyVarZzg.zzc("fg_show", true != this.zza.get() ? "0" : "1");
            }
            zzi(zzdyyVarZzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcj
    public final void zze() {
        if (this.zzl) {
            zzdyy zzdyyVarZzg = zzg("ifts");
            zzdyyVarZzg.zzc("reason", "blocked");
            zzdyyVarZzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfa
    public final void zzk() {
        if (zzf()) {
            this.zzb.set(true);
            this.zzj = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            zzdyy zzdyyVarZzg = zzg("presentation");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzoY)).booleanValue() && zzj()) {
                AtomicBoolean atomicBoolean = this.zza;
                com.google.android.gms.ads.internal.zzt.zzc();
                atomicBoolean.set(!com.google.android.gms.ads.internal.util.zzs.zzJ(this.zzc));
                zzdyyVarZzg.zzc("foreground", true != atomicBoolean.get() ? "0" : "1");
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzoZ)).booleanValue() && zzj()) {
                zzdyyVarZzg.zzc("fg_al", true == com.google.android.gms.ads.internal.zzt.zzg().zzf() ? "1" : "0");
            }
            zzdyyVarZzg.zzd();
        }
    }
}

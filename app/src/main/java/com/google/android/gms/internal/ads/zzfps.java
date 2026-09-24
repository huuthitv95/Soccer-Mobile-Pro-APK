package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfps implements Runnable {
    private final zzfpv zzb;
    private String zzc;
    private String zze;
    private zzfkd zzf;
    private com.google.android.gms.ads.internal.client.zze zzg;
    private Future zzh;
    private final List zza = new ArrayList();
    private int zzi = 2;
    private zzfpx zzd = zzfpx.SCAR_REQUEST_TYPE_UNSPECIFIED;

    zzfps(zzfpv zzfpvVar) {
        this.zzb = zzfpvVar;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        zzh();
    }

    public final synchronized zzfps zza(zzfpi zzfpiVar) {
        if (((Boolean) zzbjx.zzc.zze()).booleanValue()) {
            List list = this.zza;
            zzfpiVar.zzc();
            list.add(zzfpiVar);
            Future future = this.zzh;
            if (future != null) {
                future.cancel(false);
            }
            this.zzh = zzcff.zzd.schedule(this, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjZ)).intValue(), TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public final synchronized zzfps zzb(ArrayList arrayList) {
        if (((Boolean) zzbjx.zzc.zze()).booleanValue()) {
            if (arrayList.contains("banner") || arrayList.contains(AdFormat.BANNER.name())) {
                this.zzi = 3;
            } else if (arrayList.contains("interstitial") || arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                this.zzi = 4;
            } else if (arrayList.contains("native") || arrayList.contains(AdFormat.NATIVE.name())) {
                this.zzi = 8;
            } else if (arrayList.contains("rewarded") || arrayList.contains(AdFormat.REWARDED.name())) {
                this.zzi = 5;
            } else if (arrayList.contains("app_open_ad")) {
                this.zzi = 7;
            } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                this.zzi = 6;
            }
        }
        return this;
    }

    public final synchronized zzfps zzc(String str) {
        if (((Boolean) zzbjx.zzc.zze()).booleanValue() && zzfpr.zza(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized zzfps zzd(Bundle bundle) {
        if (((Boolean) zzbjx.zzc.zze()).booleanValue()) {
            this.zzd = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzd(bundle);
        }
        return this;
    }

    public final synchronized zzfps zze(zzfkd zzfkdVar) {
        if (((Boolean) zzbjx.zzc.zze()).booleanValue()) {
            this.zzf = zzfkdVar;
        }
        return this;
    }

    public final synchronized zzfps zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbjx.zzc.zze()).booleanValue()) {
            this.zzg = zzeVar;
        }
        return this;
    }

    public final synchronized zzfps zzg(String str) {
        if (((Boolean) zzbjx.zzc.zze()).booleanValue()) {
            this.zze = str;
        }
        return this;
    }

    public final synchronized void zzh() {
        if (((Boolean) zzbjx.zzc.zze()).booleanValue()) {
            Future future = this.zzh;
            if (future != null) {
                future.cancel(false);
            }
            List<zzfpi> list = this.zza;
            for (zzfpi zzfpiVar : list) {
                int i = this.zzi;
                if (i != 2) {
                    zzfpiVar.zzp(i);
                }
                if (!TextUtils.isEmpty(this.zzc)) {
                    zzfpiVar.zze(this.zzc);
                }
                if (!TextUtils.isEmpty(this.zze) && !zzfpiVar.zzl()) {
                    zzfpiVar.zzi(this.zze);
                }
                zzfkd zzfkdVar = this.zzf;
                if (zzfkdVar != null) {
                    zzfpiVar.zzg(zzfkdVar);
                } else {
                    com.google.android.gms.ads.internal.client.zze zzeVar = this.zzg;
                    if (zzeVar != null) {
                        zzfpiVar.zzh(zzeVar);
                    }
                }
                zzfpiVar.zzf(this.zzd);
                this.zzb.zzb(zzfpiVar.zzm());
            }
            list.clear();
        }
    }

    public final synchronized zzfps zzi(int i) {
        if (((Boolean) zzbjx.zzc.zze()).booleanValue()) {
            this.zzi = i;
        }
        return this;
    }
}

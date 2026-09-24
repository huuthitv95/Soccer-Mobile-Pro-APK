package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzene implements zzdnc {
    private final zzfjt zza;
    private final zzbwp zzb;
    private final AdFormat zzc;
    private zzdcx zzd = null;

    zzene(zzfjt zzfjtVar, zzbwp zzbwpVar, AdFormat adFormat) {
        this.zza = zzfjtVar;
        this.zzb = zzbwpVar;
        this.zzc = adFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzdnc
    public final void zza(boolean z, Context context, zzdcs zzdcsVar) throws zzdnb {
        boolean zZzk;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int iOrdinal = this.zzc.ordinal();
            if (iOrdinal == 1) {
                zZzk = this.zzb.zzk(ObjectWrapper.wrap(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 5) {
                        zZzk = this.zzb.zzt(ObjectWrapper.wrap(context));
                    }
                    throw new zzdnb("Adapter failed to show.");
                }
                zZzk = this.zzb.zzm(ObjectWrapper.wrap(context));
            }
            if (zZzk) {
                zzdcx zzdcxVar = this.zzd;
                if (zzdcxVar == null) {
                    return;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzch)).booleanValue() || this.zza.zzY != 2) {
                    return;
                }
                zzdcxVar.zza();
                return;
            }
            throw new zzdnb("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdnb(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnc
    public final zzfjt zzb() {
        return this.zza;
    }

    public final void zzc(zzdcx zzdcxVar) {
        this.zzd = zzdcxVar;
    }
}

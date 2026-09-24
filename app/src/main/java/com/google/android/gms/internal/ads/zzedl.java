package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Base64;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzedl implements zzart {
    final /* synthetic */ zzedm zza;

    zzedl(zzedm zzedmVar) {
        Objects.requireNonNull(zzedmVar);
        this.zza = zzedmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzart
    public final void zza(int i) {
        zzaru zzaruVarZzd;
        try {
            zzfqf zzfqfVarZza = zzfqg.zza();
            int i2 = 3;
            if (i != 0) {
                if (i == 1) {
                    i2 = 4;
                } else if (i != 2) {
                    i2 = i != 3 ? 7 : 6;
                } else {
                    i2 = 5;
                }
            }
            zzfqfVarZza.zzh(i2);
            if (i == 0 && (zzaruVarZzd = this.zza.zzc().zzd()) != null) {
                zzfqfVarZza.zzb(zzaruVarZzd.zzb());
                zzfqfVarZza.zzc(zzaruVarZzd.zzc());
                zzfqfVarZza.zzd(zzaruVarZzd.zzd());
                zzfqfVarZza.zze(zzaruVarZzd.zze());
                zzfqfVarZza.zzf(zzaruVarZzd.zzf());
                if (!TextUtils.isEmpty(zzaruVarZzd.zza())) {
                    zzfqfVarZza.zza(zzaruVarZzd.zza());
                }
                if (!TextUtils.isEmpty(zzaruVarZzd.zzg())) {
                    zzfqfVarZza.zzg(zzaruVarZzd.zzg());
                }
            }
            zzedm zzedmVar = this.zza;
            zzedmVar.zzc().zzc();
            zzdyz zzdyzVarZzd = zzedmVar.zzd();
            String strEncodeToString = Base64.encodeToString(((zzfqg) zzfqfVarZza.zzbu()).zzaN(), 1);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfP)).booleanValue()) {
                zzdyy zzdyyVarZza = zzdyzVarZzd.zza();
                zzdyyVarZza.zzc("action", "irda");
                zzdyyVarZza.zzc("irdd", strEncodeToString);
                zzdyyVarZza.zzf();
            }
            zzedmVar.zze().zzQ(true);
        } catch (Exception e) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfQ)).booleanValue()) {
                zzedm zzedmVar2 = this.zza;
                if (zzedmVar2.zzb == null) {
                    zzedmVar2.zzb = zzbzm.zzc(zzedmVar2.zzb());
                }
                zzedmVar2.zzb.zzh(e, "InstallReferrerUnsampled.onInstallReferrerSetupFinished");
                return;
            }
            zzedm zzedmVar3 = this.zza;
            if (zzedmVar3.zza == null) {
                zzedmVar3.zza = zzbzm.zza(zzedmVar3.zzb());
            }
            zzedmVar3.zza.zzh(e, "InstallReferrer.onInstallReferrerSetupFinished");
        }
    }
}

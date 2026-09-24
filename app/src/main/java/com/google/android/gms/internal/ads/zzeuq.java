package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeuq implements zzfby {
    private final zzhbs zza;
    private final zzdwq zzb;
    private final zzebk zzc;
    private final zzeus zzd;

    public zzeuq(zzhbs zzhbsVar, zzdwq zzdwqVar, zzebk zzebkVar, zzeus zzeusVar) {
        this.zza = zzhbsVar;
        this.zzb = zzdwqVar;
        this.zzc = zzebkVar;
        this.zzd = zzeusVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        zzbhv zzbhvVar = zzbie.zznb;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
            zzeus zzeusVar = this.zzd;
            if (zzeusVar.zzd() != null) {
                zzeur zzeurVarZzd = zzeusVar.zzd();
                zzeurVarZzd.getClass();
                return zzhbi.zza(zzeurVarZzd);
            }
        }
        if (zzgtn.zzc((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcc)) || (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue() && (this.zzd.zzb() || !this.zzc.zze()))) {
            return zzhbi.zza(new zzeur(new Bundle()));
        }
        this.zzd.zza(true);
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzeup
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 1;
    }

    final /* synthetic */ zzeur zzc() {
        List<String> listAsList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcc)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : listAsList) {
            try {
                zzflk zzflkVarZza = this.zzb.zza(str, new JSONObject());
                zzflkVarZza.zzn();
                boolean zZze = this.zzc.zze();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zznb)).booleanValue() || zZze) {
                    try {
                        zzbxe zzbxeVarZzC = zzflkVarZza.zzC();
                        if (zzbxeVarZzC != null) {
                            bundle2.putString("sdk_version", zzbxeVarZzC.toString());
                        }
                    } catch (zzfkt unused) {
                    }
                }
                try {
                    zzbxe zzbxeVarZzB = zzflkVarZza.zzB();
                    if (zzbxeVarZzB != null) {
                        bundle2.putString("adapter_version", zzbxeVarZzB.toString());
                    }
                } catch (zzfkt unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfkt unused3) {
            }
        }
        zzeur zzeurVar = new zzeur(bundle);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zznb)).booleanValue()) {
            this.zzd.zzc(zzeurVar);
        }
        return zzeurVar;
    }
}

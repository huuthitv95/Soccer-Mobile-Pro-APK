package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeqi implements zzelg {
    private final zzeli zza;
    private final zzelm zzb;
    private final zzfoy zzc;
    private final zzhbs zzd;

    public zzeqi(zzfoy zzfoyVar, zzhbs zzhbsVar, zzeli zzeliVar, zzelm zzelmVar) {
        this.zzc = zzfoyVar;
        this.zzd = zzhbsVar;
        this.zzb = zzelmVar;
        this.zza = zzeliVar;
    }

    static final String zze(String str, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(i).length());
        sb.append("Error from: ");
        sb.append(str);
        sb.append(", code: ");
        sb.append(i);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final boolean zza(zzfke zzfkeVar, zzfjt zzfjtVar) {
        return !zzfjtVar.zzt.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final ListenableFuture zzb(final zzfke zzfkeVar, final zzfjt zzfjtVar) {
        final zzelj zzeljVarZza;
        Iterator it = zzfjtVar.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzeljVarZza = null;
                break;
            }
            try {
                zzeljVarZza = this.zza.zza((String) it.next(), zzfjtVar.zzv);
                break;
            } catch (zzfkt unused) {
            }
        }
        if (zzeljVarZza == null) {
            return zzhbi.zzc(new zzenz("Unable to instantiate mediation adapter class."));
        }
        zzcfk zzcfkVar = new zzcfk();
        zzeljVarZza.zzc.zza(new zzeqf(this, zzeljVarZza, zzcfkVar));
        if (zzfjtVar.zzM) {
            Bundle bundle = zzfkeVar.zza.zza.zzd.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfoy zzfoyVar = this.zzc;
        zzfos zzfosVar = zzfos.ADAPTER_LOAD_AD_SYN;
        Objects.requireNonNull(zzfoyVar);
        return zzfoj.zzd(new zzfoe() { // from class: com.google.android.gms.internal.ads.zzeqh
            @Override // com.google.android.gms.internal.ads.zzfoe
            public final /* synthetic */ void zza() throws zzfkt {
                this.zza.zzc(zzfkeVar, zzfjtVar, zzeljVarZza);
            }
        }, this.zzd, zzfosVar, zzfoyVar).zzj(zzfos.ADAPTER_LOAD_AD_ACK).zze(zzcfkVar).zzj(zzfos.ADAPTER_WRAP_ADAPTER).zzb(new zzfny() { // from class: com.google.android.gms.internal.ads.zzeqg
            @Override // com.google.android.gms.internal.ads.zzfny
            public final /* synthetic */ Object zza(Object obj) {
                return this.zza.zzd(zzfkeVar, zzfjtVar, zzeljVarZza, (Void) obj);
            }
        }).zzi();
    }

    final /* synthetic */ void zzc(zzfke zzfkeVar, zzfjt zzfjtVar, zzelj zzeljVar) throws zzfkt {
        this.zzb.zza(zzfkeVar, zzfjtVar, zzeljVar);
    }

    final /* synthetic */ Object zzd(zzfke zzfkeVar, zzfjt zzfjtVar, zzelj zzeljVar, Void r4) {
        return this.zzb.zzb(zzfkeVar, zzfjtVar, zzeljVar);
    }
}

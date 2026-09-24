package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import com.ironsource.C12148d8;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdtb {
    private final Executor zza;
    private final zzcue zzb;
    private final zzdkg zzc;
    private final zzcsx zzd;
    private final zzdbb zze;

    zzdtb(Executor executor, zzcue zzcueVar, zzdkg zzdkgVar, zzcsx zzcsxVar, zzdbb zzdbbVar) {
        this.zza = executor;
        this.zzc = zzdkgVar;
        this.zzb = zzcueVar;
        this.zzd = zzcsxVar;
        this.zze = zzdbbVar;
    }

    public final void zza(final zzcki zzckiVar) {
        if (zzckiVar == null) {
            return;
        }
        zzdkg zzdkgVar = this.zzc;
        zzdkgVar.zza(zzckiVar.zzE());
        zzbee zzbeeVar = new zzbee() { // from class: com.google.android.gms.internal.ads.zzdta
            @Override // com.google.android.gms.internal.ads.zzbee
            public final /* synthetic */ void zzdj(zzbed zzbedVar) {
                Rect rect = zzbedVar.zzd;
                zzckiVar.zzP().zza(rect.left, rect.top, false);
            }
        };
        Executor executor = this.zza;
        zzdkgVar.zzq(zzbeeVar, executor);
        zzdkgVar.zzq(new zzbee() { // from class: com.google.android.gms.internal.ads.zzdsx
            @Override // com.google.android.gms.internal.ads.zzbee
            public final /* synthetic */ void zzdj(zzbed zzbedVar) {
                HashMap map = new HashMap();
                map.put(C12148d8.f30227k, true != zzbedVar.zzj ? "0" : "1");
                zzckiVar.zze("onAdVisibilityChanged", map);
            }
        }, executor);
        zzcue zzcueVar = this.zzb;
        zzdkgVar.zzq(zzcueVar, executor);
        zzcueVar.zza(zzckiVar);
        zzcmg zzcmgVarZzP = zzckiVar.zzP();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlz)).booleanValue() && zzcmgVarZzP != null) {
            zzcsx zzcsxVar = this.zzd;
            zzcmgVarZzP.zzc(zzcsxVar);
            zzcmgVarZzP.zze(zzcsxVar, null, null);
        }
        zzckiVar.zzab("/trackActiveViewUnit", new zzbpe() { // from class: com.google.android.gms.internal.ads.zzdsy
            @Override // com.google.android.gms.internal.ads.zzbpe
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzb((zzcki) obj, map);
            }
        });
        zzckiVar.zzab("/untrackActiveViewUnit", new zzbpe() { // from class: com.google.android.gms.internal.ads.zzdsz
            @Override // com.google.android.gms.internal.ads.zzbpe
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzc((zzcki) obj, map);
            }
        });
        zzckiVar.zzP().zzJ(this.zze);
    }

    final /* synthetic */ void zzb(zzcki zzckiVar, Map map) {
        this.zzb.zzd();
    }

    final /* synthetic */ void zzc(zzcki zzckiVar, Map map) {
        this.zzb.zzb();
    }
}

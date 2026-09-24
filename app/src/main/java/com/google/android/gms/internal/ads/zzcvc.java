package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcvc extends zzcuz {
    private final Context zzc;
    private final View zzd;
    private final zzcki zze;
    private final zzfju zzf;
    private final zzcxf zzg;
    private final zzdpr zzh;
    private final zzdko zzi;
    private final zzimc zzj;
    private final Executor zzk;
    private com.google.android.gms.ads.internal.client.zzr zzl;

    zzcvc(zzcxg zzcxgVar, Context context, zzfju zzfjuVar, View view, zzcki zzckiVar, zzcxf zzcxfVar, zzdpr zzdprVar, zzdko zzdkoVar, zzimc zzimcVar, Executor executor) {
        super(zzcxgVar);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzckiVar;
        this.zzf = zzfjuVar;
        this.zzg = zzcxfVar;
        this.zzh = zzdprVar;
        this.zzi = zzdkoVar;
        this.zzj = zzimcVar;
        this.zzk = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    public final View zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    public final void zzb(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzcki zzckiVar;
        if (viewGroup == null || (zzckiVar = this.zze) == null) {
            return;
        }
        zzckiVar.zzaf(zzcms.zza(zzrVar));
        viewGroup.setMinimumHeight(zzrVar.zzc);
        viewGroup.setMinimumWidth(zzrVar.zzf);
        this.zzl = zzrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    public final com.google.android.gms.ads.internal.client.zzea zzc() {
        try {
            return this.zzg.zza();
        } catch (zzfkt unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    public final zzfju zze() {
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.zzl;
        if (zzrVar != null) {
            return zzfks.zzb(zzrVar);
        }
        zzfjt zzfjtVar = this.zzb;
        if (zzfjtVar.zzac) {
            for (String str : zzfjtVar.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.zzd;
            return new zzfju(view.getWidth(), view.getHeight(), false);
        }
        return (zzfju) zzfjtVar.zzr.get(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    public final zzfju zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    public final int zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziZ)).booleanValue() && this.zzb.zzag) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzja)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    public final int zzh() {
        return this.zza.zzb.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    public final void zzi() {
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzj() {
        this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcvb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzk();
            }
        });
        super.zzj();
    }

    final /* synthetic */ void zzk() {
        zzbna zzbnaVarZzd = this.zzh.zzd();
        if (zzbnaVarZzd == null) {
            return;
        }
        try {
            zzbnaVarZzd.zze((com.google.android.gms.ads.internal.client.zzbu) this.zzj.zzb(), ObjectWrapper.wrap(this.zzc));
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("RemoteException when notifyAdLoad is called", e);
        }
    }
}

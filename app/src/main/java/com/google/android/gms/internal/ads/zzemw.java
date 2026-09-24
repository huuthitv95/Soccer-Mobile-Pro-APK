package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzemw extends zzcbn implements zzddp {
    private zzcbo zza;
    private zzddo zzb;
    private zzdkx zzc;

    @Override // com.google.android.gms.internal.ads.zzddp
    public final synchronized void zza(zzddo zzddoVar) {
        this.zzb = zzddoVar;
    }

    public final synchronized void zzc(zzcbo zzcboVar) {
        this.zza = zzcboVar;
    }

    public final synchronized void zzd(zzdkx zzdkxVar) {
        this.zzc = zzdkxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final synchronized void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzdkx zzdkxVar = this.zzc;
        if (zzdkxVar != null) {
            final zzelj zzeljVar = ((zzepw) zzdkxVar).zzc;
            final zzfjt zzfjtVar = ((zzepw) zzdkxVar).zzb;
            final zzfke zzfkeVar = ((zzepw) zzdkxVar).zza;
            final zzepw zzepwVar = (zzepw) zzdkxVar;
            ((zzepw) zzdkxVar).zzd.zzc().execute(new Runnable(zzepwVar, zzfkeVar, zzfjtVar, zzeljVar) { // from class: com.google.android.gms.internal.ads.zzepv
                private final /* synthetic */ zzfke zza;
                private final /* synthetic */ zzfjt zzb;
                private final /* synthetic */ zzelj zzc;

                {
                    this.zza = zzfkeVar;
                    this.zzb = zzfjtVar;
                    this.zzc = zzeljVar;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzepz.zze(this.zza, this.zzb, this.zzc);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final synchronized void zzf(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzdkx zzdkxVar = this.zzc;
        if (zzdkxVar != null) {
            String str = ((zzepw) zzdkxVar).zzc.zza;
            String.valueOf(str);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Fail to initialize adapter ".concat(String.valueOf(str)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final synchronized void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzddo zzddoVar = this.zzb;
        if (zzddoVar != null) {
            zzddoVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final synchronized void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcbo zzcboVar = this.zza;
        if (zzcboVar != null) {
            ((zzepy) zzcboVar).zza.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcbo zzcboVar = this.zza;
        if (zzcboVar != null) {
            ((zzepy) zzcboVar).zzd.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcbo zzcboVar = this.zza;
        if (zzcboVar != null) {
            zzcboVar.zzj(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final synchronized void zzk(IObjectWrapper iObjectWrapper, zzcbp zzcbpVar) throws RemoteException {
        zzcbo zzcboVar = this.zza;
        if (zzcboVar != null) {
            ((zzepy) zzcboVar).zzd.zzb(zzcbpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final synchronized void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcbo zzcboVar = this.zza;
        if (zzcboVar != null) {
            ((zzepy) zzcboVar).zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final synchronized void zzm(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzddo zzddoVar = this.zzb;
        if (zzddoVar != null) {
            zzddoVar.zzb(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final synchronized void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcbo zzcboVar = this.zza;
        if (zzcboVar != null) {
            ((zzepy) zzcboVar).zzc.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final synchronized void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcbo zzcboVar = this.zza;
        if (zzcboVar != null) {
            ((zzepy) zzcboVar).zzc.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final synchronized void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcbo zzcboVar = this.zza;
        if (zzcboVar != null) {
            ((zzepy) zzcboVar).zzd.zzb(null);
        }
    }
}

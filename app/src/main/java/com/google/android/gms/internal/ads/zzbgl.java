package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbgl {
    private ScheduledFuture zza = null;
    private final Runnable zzb = new zzbgh(this);
    private final Object zzc = new Object();
    private zzbgo zzd;
    private Context zze;
    private zzbgr zzf;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final void zzf() {
        synchronized (this.zzc) {
            if (this.zze != null && this.zzd == null) {
                zzbgo zzbgoVarZze = zze(new zzbgj(this), new zzbgk(this));
                this.zzd = zzbgoVarZze;
                zzbgoVarZze.checkAvailabilityAndConnect();
            }
        }
    }

    public final void zza(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.zzc) {
            if (this.zze != null) {
                return;
            }
            this.zze = context.getApplicationContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfg)).booleanValue()) {
                zzf();
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzff)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzg().zzb(new zzbgi(this));
                }
            }
        }
    }

    public final void zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfh)).booleanValue()) {
            synchronized (this.zzc) {
                zzf();
                ScheduledFuture scheduledFuture = this.zza;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.zza = zzcff.zzd.schedule(this.zzb, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfi)).longValue(), TimeUnit.MILLISECONDS);
            }
        }
    }

    public final zzbgm zzc(zzbgp zzbgpVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return new zzbgm();
            }
            try {
                if (this.zzd.zzp()) {
                    return this.zzf.zzf(zzbgpVar);
                }
                return this.zzf.zze(zzbgpVar);
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to call into cache service.", e);
                return new zzbgm();
            }
        }
    }

    public final long zzd(zzbgp zzbgpVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return -2L;
            }
            if (this.zzd.zzp()) {
                try {
                    return this.zzf.zzg(zzbgpVar);
                } catch (RemoteException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to call into cache service.", e);
                }
            }
            return -2L;
        }
    }

    protected final synchronized zzbgo zze(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzbgo(this.zze, com.google.android.gms.ads.internal.zzt.zzs().zza(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    final /* synthetic */ void zzg() {
        synchronized (this.zzc) {
            zzbgo zzbgoVar = this.zzd;
            if (zzbgoVar == null) {
                return;
            }
            if (zzbgoVar.isConnected() || this.zzd.isConnecting()) {
                this.zzd.disconnect();
            }
            this.zzd = null;
            this.zzf = null;
            Binder.flushPendingCommands();
        }
    }

    final /* synthetic */ Object zzh() {
        return this.zzc;
    }

    final /* synthetic */ zzbgo zzi() {
        return this.zzd;
    }

    final /* synthetic */ void zzj(zzbgo zzbgoVar) {
        this.zzd = null;
    }

    final /* synthetic */ void zzk(zzbgr zzbgrVar) {
        this.zzf = zzbgrVar;
    }
}

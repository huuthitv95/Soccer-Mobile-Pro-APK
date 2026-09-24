package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzefs extends zzefq {
    private final Context zzg;
    private final Executor zzh;

    zzefs(Context context, Executor executor) {
        this.zzg = context;
        this.zzh = executor;
        this.zzf = new zzbzt(context, com.google.android.gms.ads.internal.zzt.zzs().zza(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zzf(this.zze, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzot)).booleanValue() ? new zzefp(this.zza, this.zze) : new zzefo(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zzd(new zzegf(1));
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "RemoteSignalsClientTask.onConnected");
                    this.zza.zzd(new zzegf(1));
                }
            }
        }
    }

    public final ListenableFuture zza(zzcar zzcarVar) {
        synchronized (this.zzb) {
            if (this.zzc) {
                return this.zza;
            }
            this.zzc = true;
            this.zze = zzcarVar;
            this.zzf.checkAvailabilityAndConnect();
            zzcfk zzcfkVar = this.zza;
            zzcfkVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefr
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb();
                }
            }, zzcff.zzh);
            zzc(this.zzg, zzcfkVar, this.zzh);
            return zzcfkVar;
        }
    }
}

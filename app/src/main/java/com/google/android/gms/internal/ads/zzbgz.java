package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbgz {
    private zzbgo zza;
    private boolean zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    zzbgz(Context context) {
        this.zzc = context;
    }

    final Future zza(zzbgp zzbgpVar) {
        zzbgt zzbgtVar = new zzbgt(this);
        zzbgx zzbgxVar = new zzbgx(this, zzbgpVar, zzbgtVar);
        zzbgy zzbgyVar = new zzbgy(this, zzbgtVar);
        synchronized (this.zzd) {
            zzbgo zzbgoVar = new zzbgo(this.zzc, com.google.android.gms.ads.internal.zzt.zzs().zza(), zzbgxVar, zzbgyVar);
            this.zza = zzbgoVar;
            zzbgoVar.checkAvailabilityAndConnect();
        }
        return zzbgtVar;
    }

    final /* synthetic */ zzbgo zzc() {
        return this.zza;
    }

    final /* synthetic */ boolean zzd() {
        return this.zzb;
    }

    final /* synthetic */ void zze(boolean z) {
        this.zzb = true;
    }

    final /* synthetic */ Object zzf() {
        return this.zzd;
    }

    final /* synthetic */ void zzb() {
        synchronized (this.zzd) {
            zzbgo zzbgoVar = this.zza;
            if (zzbgoVar == null) {
                return;
            }
            zzbgoVar.disconnect();
            this.zza = null;
            Binder.flushPendingCommands();
        }
    }
}

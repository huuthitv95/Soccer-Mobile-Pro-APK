package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbgj implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzbgl zza;

    zzbgj(zzbgl zzbglVar) {
        Objects.requireNonNull(zzbglVar);
        this.zza = zzbglVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbgl zzbglVar = this.zza;
        synchronized (zzbglVar.zzh()) {
            try {
                if (zzbglVar.zzi() != null) {
                    zzbglVar.zzk(zzbglVar.zzi().zzq());
                }
            } catch (DeadObjectException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to obtain a cache service instance.", e);
                this.zza.zzg();
            }
            this.zza.zzh().notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        zzbgl zzbglVar = this.zza;
        synchronized (zzbglVar.zzh()) {
            zzbglVar.zzk(null);
            zzbglVar.zzh().notifyAll();
        }
    }
}

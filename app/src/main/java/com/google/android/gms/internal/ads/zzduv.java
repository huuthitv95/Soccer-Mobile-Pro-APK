package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzduv extends VideoController.VideoLifecycleCallbacks {
    private final zzdph zza;

    public zzduv(zzdph zzdphVar) {
        this.zza = zzdphVar;
    }

    private static com.google.android.gms.ads.internal.client.zzed zza(zzdph zzdphVar) {
        com.google.android.gms.ads.internal.client.zzea zzeaVarZzy = zzdphVar.zzy();
        if (zzeaVarZzy == null) {
            return null;
        }
        try {
            return zzeaVarZzy.zzo();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoEnd() {
        com.google.android.gms.ads.internal.client.zzed zzedVarZza = zza(this.zza);
        if (zzedVarZza == null) {
            return;
        }
        try {
            zzedVarZza.zzh();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoPause() {
        com.google.android.gms.ads.internal.client.zzed zzedVarZza = zza(this.zza);
        if (zzedVarZza == null) {
            return;
        }
        try {
            zzedVarZza.zzg();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoStart() {
        com.google.android.gms.ads.internal.client.zzed zzedVarZza = zza(this.zza);
        if (zzedVarZza == null) {
            return;
        }
        try {
            zzedVarZza.zze();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to call onVideoEnd()", e);
        }
    }
}

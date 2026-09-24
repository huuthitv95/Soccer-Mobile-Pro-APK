package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbgk implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzbgl zza;

    zzbgk(zzbgl zzbglVar) {
        Objects.requireNonNull(zzbglVar);
        this.zza = zzbglVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zzbgl zzbglVar = this.zza;
        synchronized (zzbglVar.zzh()) {
            zzbglVar.zzk(null);
            if (zzbglVar.zzi() != null) {
                zzbglVar.zzj(null);
            }
            zzbglVar.zzh().notifyAll();
        }
    }
}

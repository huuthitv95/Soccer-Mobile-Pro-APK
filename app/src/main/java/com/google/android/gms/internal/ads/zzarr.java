package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzarr implements ServiceConnection {
    final /* synthetic */ zzars zza;
    private final zzart zzb;

    /* synthetic */ zzarr(zzars zzarsVar, zzart zzartVar, byte[] bArr) {
        Objects.requireNonNull(zzarsVar);
        this.zza = zzarsVar;
        this.zzb = zzartVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzarv.zza("InstallReferrerClient", "Install Referrer service connected.");
        zzars zzarsVar = this.zza;
        zzarsVar.zzf(zzbdw.zzb(iBinder));
        zzarsVar.zze(2);
        this.zzb.zza(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzarv.zzb("InstallReferrerClient", "Install Referrer service disconnected.");
        zzars zzarsVar = this.zza;
        zzarsVar.zzf(null);
        zzarsVar.zze(0);
    }
}

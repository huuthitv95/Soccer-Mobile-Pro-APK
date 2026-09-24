package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbgx implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzbgp zza;
    final /* synthetic */ zzcfk zzb;
    final /* synthetic */ zzbgz zzc;

    zzbgx(zzbgz zzbgzVar, zzbgp zzbgpVar, zzcfk zzcfkVar) {
        this.zza = zzbgpVar;
        this.zzb = zzcfkVar;
        Objects.requireNonNull(zzbgzVar);
        this.zzc = zzbgzVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbgz zzbgzVar = this.zzc;
        synchronized (zzbgzVar.zzf()) {
            if (zzbgzVar.zzd()) {
                return;
            }
            zzbgzVar.zze(true);
            final zzbgo zzbgoVarZzc = zzbgzVar.zzc();
            if (zzbgoVarZzc == null) {
                return;
            }
            zzhbs zzhbsVar = zzcff.zza;
            final zzbgp zzbgpVar = this.zza;
            final zzcfk zzcfkVar = this.zzb;
            final ListenableFuture listenableFutureZza = zzhbsVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbgw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcfk zzcfkVar2 = zzcfkVar;
                    zzbgo zzbgoVar = zzbgoVarZzc;
                    zzbgx zzbgxVar = this.zza;
                    try {
                        zzbgr zzbgrVarZzq = zzbgoVar.zzq();
                        boolean zZzp = zzbgoVar.zzp();
                        zzbgp zzbgpVar2 = zzbgpVar;
                        zzbgm zzbgmVarZzf = zZzp ? zzbgrVarZzq.zzf(zzbgpVar2) : zzbgrVarZzq.zze(zzbgpVar2);
                        if (!zzbgmVarZzf.zza()) {
                            zzcfkVar2.zzd(new RuntimeException("No entry contents."));
                            zzbgxVar.zzc.zzb();
                            return;
                        }
                        zzbgu zzbguVar = new zzbgu(zzbgxVar, zzbgmVarZzf.zzb(), 1);
                        int i = zzbguVar.read();
                        if (i == -1) {
                            throw new IOException("Unable to read from cache.");
                        }
                        zzbguVar.unread(i);
                        zzcfkVar2.zzc(zzbhb.zza(zzbguVar, zzbgmVarZzf.zzd(), zzbgmVarZzf.zzg(), zzbgmVarZzf.zzf(), zzbgmVarZzf.zze()));
                    } catch (RemoteException | IOException e) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to obtain a cache service instance.", e);
                        zzcfkVar2.zzd(e);
                        zzbgxVar.zzc.zzb();
                    }
                }
            });
            zzcfkVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbgv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i = zzbgx.zzd;
                    if (zzcfkVar.isCancelled()) {
                        listenableFutureZza.cancel(true);
                    }
                }
            }, zzcff.zzh);
        }
    }
}

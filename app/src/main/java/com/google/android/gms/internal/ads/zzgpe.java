package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgpe implements zzgor, zzgem {
    private final Context zza;
    private final ExecutorService zzb;
    private NetworkCapabilities zzc = null;

    zzgpe(Context context, ExecutorService executorService) {
        this.zza = context;
        this.zzb = executorService;
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final ListenableFuture zza() {
        return Build.VERSION.SDK_INT < 24 ? zzhbi.zzb() : zzhbi.zze(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgpd
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze();
            }
        }, this.zzb);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0033 A[Catch: all -> 0x0040, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000a, B:9:0x000e, B:11:0x0015, B:13:0x0019, B:15:0x0022, B:17:0x0026, B:19:0x002f, B:21:0x0033), top: B:31:0x000a }] */
    @Override // com.google.android.gms.internal.ads.zzgor
    public final void zzb(Map map) {
        NetworkCapabilities networkCapabilities;
        long j;
        synchronized (this) {
            networkCapabilities = this.zzc;
        }
        map.put("ntc", networkCapabilities);
        synchronized (this) {
            NetworkCapabilities networkCapabilities2 = this.zzc;
            if (networkCapabilities2 != null) {
                if (networkCapabilities2.hasTransport(4)) {
                    j = 2;
                } else if (this.zzc.hasTransport(1)) {
                    j = 1;
                } else {
                    j = this.zzc.hasTransport(0) ? 0L : -1L;
                }
            }
        }
        map.put("nt", Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzgor
    public final void zzc(Map map, Context context, View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzgor
    public final void zzd(Map map) {
    }

    final /* synthetic */ void zze() {
        if (Build.VERSION.SDK_INT < 24) {
            return;
        }
        zzgpc zzgpcVar = new zzgpc(this);
        try {
            Object systemService = this.zza.getSystemService("connectivity");
            if (systemService == null) {
                throw null;
            }
            ((ConnectivityManager) systemService).registerDefaultNetworkCallback(zzgpcVar);
        } catch (Throwable unused) {
        }
    }

    final /* synthetic */ void zzf(NetworkCapabilities networkCapabilities) {
        this.zzc = networkCapabilities;
    }
}

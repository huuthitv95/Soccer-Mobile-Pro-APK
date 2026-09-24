package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgpa implements zzgor, zzgem {
    private final Context zza;
    private final zzgpu zzb;
    private final zzhbs zzc;
    private final zzgco zzd;
    private final AtomicBoolean zze = new AtomicBoolean(false);
    private ListenableFuture zzf = zzhbi.zza(null);

    zzgpa(Context context, zzgpu zzgpuVar, zzhbs zzhbsVar, zzgco zzgcoVar) {
        this.zza = context;
        this.zzb = zzgpuVar;
        this.zzc = zzhbsVar;
        this.zzd = zzgcoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final ListenableFuture zza() {
        return (this.zze.getAndSet(true) || !this.zzd.zze()) ? zzhbi.zzb() : this.zzc.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgoz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgor
    public final void zzb(Map map) {
        map.put("gs", this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzgor
    public final void zzc(Map map, Context context, View view) {
        map.put("gs", this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzgor
    public final void zzd(Map map) {
        map.put("gs", this.zzf);
    }

    final /* synthetic */ void zze() {
        ListenableFuture listenableFutureZzc = this.zzc.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzgoy
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzf();
            }
        });
        this.zzb.zze(53, listenableFutureZzc);
        this.zzf = listenableFutureZzc;
    }

    final /* synthetic */ zzayf zzf() {
        Context context = this.zza;
        try {
            return zzfwx.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
        } catch (Throwable unused) {
            return null;
        }
    }
}

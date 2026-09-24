package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.os.Bundle;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzezq implements Callable {
    static final /* synthetic */ zzezq zza = new zzezq();

    private /* synthetic */ zzezq() {
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        Bundle bundle = new Bundle();
        Runtime runtime = Runtime.getRuntime();
        bundle.putLong("runtime_free", runtime.freeMemory());
        bundle.putLong("runtime_max", runtime.maxMemory());
        bundle.putLong("runtime_total", runtime.totalMemory());
        bundle.putInt("web_view_count", com.google.android.gms.ads.internal.zzt.zzh().zzl());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpN)).booleanValue()) {
            ActivityManager.MemoryInfo memoryInfoZzw = com.google.android.gms.ads.internal.zzt.zzh().zzw();
            if (memoryInfoZzw != null) {
                if (PlatformVersion.isAtLeastU()) {
                    bundle.putLong("a_ad_mem", memoryInfoZzw.advertisedMem);
                }
                bundle.putLong("a_total", memoryInfoZzw.totalMem);
                bundle.putLong("a_avai", memoryInfoZzw.availMem);
                bundle.putLong("a_threshold", memoryInfoZzw.threshold);
                bundle.putBoolean("a_is_low_mem", memoryInfoZzw.lowMemory);
            }
            bundle.putLong("runtime_avai_processors", runtime.availableProcessors());
        }
        return new zzezs(bundle);
    }
}

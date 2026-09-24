package com.google.android.gms.internal.ads;

import androidx.webkit.Profile;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcff {
    public static final zzhbs zza;
    public static final zzhbs zzb;
    public static final zzhbs zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzhbt zze;
    public static final zzhbs zzf;
    public static final ExecutorService zzg;
    public static final zzhbs zzh;

    /* JADX WARN: Code duplicated, block: B:14:0x009b  */
    static {
        ExecutorService threadPoolExecutor;
        ExecutorService executorServiceZza;
        ExecutorService executorServiceZzc;
        if (ClientLibraryUtils.isPackageSide()) {
            zzfzv.zza();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzcfc(Profile.DEFAULT_PROFILE_NAME)));
        } else {
            if (com.google.android.gms.ads.internal.client.zzba.zzc().zze(zzbie.zzmG) != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zze(zzbie.zzmG)).booleanValue()) {
                    if (com.google.android.gms.ads.internal.client.zzba.zzc().zze(zzbie.zzmH) != null) {
                        if (com.google.android.gms.ads.internal.client.zzba.zzc().zze(zzbie.zzmI) != null) {
                            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zze(zzbie.zzmH)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zze(zzbie.zzmH)).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcfc(Profile.DEFAULT_PROFILE_NAME));
                            threadPoolExecutor2.allowCoreThreadTimeOut(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zze(zzbie.zzmI)).booleanValue());
                            threadPoolExecutor = threadPoolExecutor2;
                        } else {
                            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzcfc(Profile.DEFAULT_PROFILE_NAME));
                        }
                    } else {
                        threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzcfc(Profile.DEFAULT_PROFILE_NAME));
                    }
                } else {
                    threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzcfc(Profile.DEFAULT_PROFILE_NAME));
                }
            } else {
                threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzcfc(Profile.DEFAULT_PROFILE_NAME));
            }
        }
        zza = new zzcfe(threadPoolExecutor, null);
        if (ClientLibraryUtils.isPackageSide()) {
            executorServiceZza = zzfzv.zza().zza(5, new zzcfc("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcfc("Loader"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executorServiceZza = threadPoolExecutor3;
        }
        zzb = new zzcfe(executorServiceZza, null);
        if (ClientLibraryUtils.isPackageSide()) {
            executorServiceZzc = zzfzv.zza().zzc(new zzcfc("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcfc("Activeview"));
            threadPoolExecutor4.allowCoreThreadTimeOut(true);
            executorServiceZzc = threadPoolExecutor4;
        }
        zzc = new zzcfe(executorServiceZzc, null);
        zzcfb zzcfbVar = new zzcfb(3, new zzcfc(AppEventsConstants.EVENT_NAME_SCHEDULE));
        zzd = zzcfbVar;
        zze = zzhbz.zzc(zzcfbVar);
        zzf = new zzcfe(new zzcfd(), null);
        zzg = Executors.newSingleThreadExecutor(new zzcfc("AdQualityMetrics"));
        zzh = new zzcfe(zzhbz.zza(), null);
    }
}

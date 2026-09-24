package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfcs implements zzfby {
    private final com.google.android.gms.ads.internal.util.zzg zza;
    private final Context zzb;
    private final zzhbs zzc;
    private final ScheduledExecutorService zzd;
    private final zzele zze;
    private final zzfkm zzf;
    private final VersionInfoParcel zzg;

    zzfcs(com.google.android.gms.ads.internal.util.zzg zzgVar, Context context, zzhbs zzhbsVar, ScheduledExecutorService scheduledExecutorService, zzele zzeleVar, zzfkm zzfkmVar, VersionInfoParcel versionInfoParcel) {
        this.zza = zzgVar;
        this.zzb = context;
        this.zzc = zzhbsVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzeleVar;
        this.zzf = zzfkmVar;
        this.zzg = versionInfoParcel;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0050  */
    /* JADX WARN: Code duplicated, block: B:14:0x0064  */
    /* JADX WARN: Code duplicated, block: B:17:0x0077  */
    /* JADX WARN: Code duplicated, block: B:20:0x008a  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        if (java.util.Arrays.asList(r0.split(",")).contains(r5.zzb.getPackageName()) != false) goto L30;
     */
    @Override // com.google.android.gms.internal.ads.zzfby
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfcs.zza():com.google.common.util.concurrent.ListenableFuture");
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 56;
    }

    final /* synthetic */ ListenableFuture zzc(final Throwable th) {
        zzfct zzfctVar;
        this.zzc.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfcq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlO)).booleanValue();
                Throwable th2 = th;
                if (zBooleanValue) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzi(th2, "TopicsSignalUnsampled.fetchTopicsSignal");
                } else {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, "TopicsSignal.fetchTopicsSignal");
                }
            }
        });
        if (th instanceof SecurityException) {
            zzfctVar = new zzfct("", 2, null);
        } else if (th instanceof IllegalStateException) {
            zzfctVar = new zzfct("", 3, null);
        } else if (th instanceof IllegalArgumentException) {
            zzfctVar = new zzfct("", 4, null);
        } else {
            zzfctVar = th instanceof TimeoutException ? new zzfct("", 5, null) : new zzfct("", 0, null);
        }
        return zzhbi.zza(zzfctVar);
    }
}

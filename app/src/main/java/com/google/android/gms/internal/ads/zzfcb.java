package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfcb {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfps zzd;

    public zzfcb(Context context, Executor executor, Set set, zzfps zzfpsVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfpsVar;
    }

    public final ListenableFuture zza(final Object obj, final Bundle bundle) {
        zzfpi zzfpiVarZzn = zzfpi.CC.zzn(this.zza, 8);
        zzfpiVarZzn.zza();
        Set<zzfby> set = this.zzb;
        final ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        zzbhv zzbhvVar = zzbie.zzng;
        if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).split(","));
        }
        final Bundle bundle2 = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcN)).booleanValue() && bundle != null) {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            if (obj instanceof Bundle) {
                bundle.putLong(zzdyi.CLIENT_SIGNALS_START.zza(), jCurrentTimeMillis);
            } else {
                bundle.putLong(zzdyi.GMS_SIGNALS_START.zza(), jCurrentTimeMillis);
            }
        }
        for (final zzfby zzfbyVar : set) {
            if (!arrayList2.contains(String.valueOf(zzfbyVar.zzb()))) {
                final long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                ListenableFuture listenableFutureZza = zzfbyVar.zza();
                listenableFutureZza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbz
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                        boolean zBooleanValue = ((Boolean) zzbkg.zza.zze()).booleanValue();
                        Bundle bundle3 = bundle2;
                        zzfby zzfbyVar2 = zzfbyVar;
                        if (zBooleanValue) {
                            String strZza = zzgtn.zza(zzfbyVar2.getClass().getCanonicalName());
                            StringBuilder sb = new StringBuilder(strZza.length() + 25 + String.valueOf(jElapsedRealtime2).length());
                            sb.append("Signal runtime (ms) : ");
                            sb.append(strZza);
                            sb.append(" = ");
                            sb.append(jElapsedRealtime2);
                            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcN)).booleanValue()) {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcT)).booleanValue()) {
                                synchronized (this.zza) {
                                    int iZzb = zzfbyVar2.zzb();
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzb).length() + 3);
                                    sb2.append("sig");
                                    sb2.append(iZzb);
                                    bundle3.putLong(sb2.toString(), jElapsedRealtime2);
                                }
                            }
                        }
                    }
                }, zzcff.zzh);
                arrayList.add(listenableFutureZza);
            }
        }
        ListenableFuture listenableFutureZza2 = zzhbi.zzp(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfca
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                Object obj2;
                Bundle bundle3;
                Iterator it = arrayList.iterator();
                while (true) {
                    obj2 = obj;
                    if (!it.hasNext()) {
                        break;
                    }
                    zzfbw zzfbwVar = (zzfbw) ((ListenableFuture) it.next()).get();
                    if (zzfbwVar != null) {
                        zzfbwVar.zza(obj2);
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcN)).booleanValue() && (bundle3 = bundle) != null) {
                    Bundle bundle4 = bundle2;
                    long jCurrentTimeMillis2 = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
                    if (obj2 instanceof Bundle) {
                        bundle3.putLong(zzdyi.CLIENT_SIGNALS_END.zza(), jCurrentTimeMillis2);
                        bundle3.putBundle("client_sig_latency_key", bundle4);
                        return obj2;
                    }
                    bundle3.putLong(zzdyi.GMS_SIGNALS_END.zza(), jCurrentTimeMillis2);
                    bundle3.putBundle("gms_sig_latency_key", bundle4);
                }
                return obj2;
            }
        }, this.zzc);
        if (zzfpv.zza()) {
            zzfpr.zzd(listenableFutureZza2, this.zzd, zzfpiVarZzn);
        }
        return listenableFutureZza2;
    }
}

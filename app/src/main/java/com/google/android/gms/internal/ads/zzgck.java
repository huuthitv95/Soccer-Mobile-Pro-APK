package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgck {
    private static final Object zza = new Object();
    private static zzgck zzb;
    private final zzgci zzc;

    private zzgck(Context context, ExecutorService executorService, zzgco zzgcoVar) {
        zzgcv zzgcvVar = new zzgcv(null);
        zzgcvVar.zzc(context);
        zzgcvVar.zzb(executorService);
        zzgcvVar.zzd(zzgcoVar);
        this.zzc = (zzgci) ((zzgcu) zzgcvVar.zza()).zzI.zzb();
    }

    public static zzgck zza(Context context, ExecutorService executorService, zzgco zzgcoVar) {
        zzgck zzgckVar;
        synchronized (zza) {
            if (zzb == null) {
                zzb = new zzgck(context, executorService, zzgcoVar);
            }
            zzgckVar = zzb;
        }
        return zzgckVar;
    }

    public final ListenableFuture zzb() {
        return this.zzc.zza();
    }

    public final String zzc(Context context) {
        return this.zzc.zzb(context);
    }

    public final String zzd(Context context, String str, View view, Activity activity) {
        return this.zzc.zzc(context, null, view, activity);
    }

    public final String zze(Context context, String str, View view, Activity activity) {
        return this.zzc.zzd(context, str, view, null);
    }

    public final void zzf(List list) {
        this.zzc.zze(list);
    }

    public final void zzg(InputEvent inputEvent) {
        this.zzc.zzf(inputEvent);
    }

    public final int zzh() {
        return this.zzc.zzj();
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgkc extends zzfwq {
    private final zzgeq zzb;

    zzgkc(Context context, Executor executor, zzgeq zzgeqVar) {
        super(context, executor, new TaskCompletionSource().getTask(), false);
        this.zzb = zzgeqVar;
    }

    private static Task zzh() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(true);
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.internal.ads.zzfwq
    public final Task zzb(int i, long j) {
        this.zzb.zzb(i, j, null, null);
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzfwq
    public final Task zzc(int i, long j, Exception exc) {
        this.zzb.zzb(i, j, exc, null);
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzfwq
    public final Task zze(int i, String str) {
        this.zzb.zzb(i, -1L, null, str);
        return zzh();
    }
}

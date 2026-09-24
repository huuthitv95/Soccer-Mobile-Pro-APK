package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgcc {
    public static ListenableFuture zza(Task task, CancellationTokenSource cancellationTokenSource) {
        final zzgca zzgcaVar = new zzgca(task, null);
        task.addOnCompleteListener(zzhbz.zza(), new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzgcb
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task2) {
                zzgca zzgcaVar2 = zzgcaVar;
                if (task2.isCanceled()) {
                    zzgcaVar2.cancel(false);
                    return;
                }
                if (task2.isSuccessful()) {
                    zzgcaVar2.zza(task2.getResult());
                    return;
                }
                Exception exception = task2.getException();
                if (exception == null) {
                    throw new IllegalStateException();
                }
                zzgcaVar2.zzb(exception);
            }
        });
        return zzgcaVar;
    }
}

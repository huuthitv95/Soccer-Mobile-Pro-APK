package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzedv implements zzhaq {
    static final /* synthetic */ zzedv zza = new zzedv();

    private /* synthetic */ zzedv() {
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        ExecutionException executionException = (ExecutionException) obj;
        Throwable cause = executionException.getCause();
        ExecutionException cause2 = executionException;
        if (cause != null) {
            cause2 = executionException.getCause();
        }
        return zzhbi.zzc(cause2);
    }
}

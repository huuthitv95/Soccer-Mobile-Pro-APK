package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcej {
    public final ListenableFuture zza(Context context, int i) {
        zzcfk zzcfkVar = new zzcfk();
        com.google.android.gms.ads.internal.client.zzay.zza();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzA(context)) {
            zzcff.zza.execute(new zzcei(this, context, zzcfkVar));
        }
        return zzcfkVar;
    }
}

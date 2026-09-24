package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzeuc implements zzhaq {
    static final /* synthetic */ zzeuc zza = new zzeuc();

    private /* synthetic */ zzeuc() {
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        return ((Throwable) obj) instanceof TimeoutException ? zzhbi.zza(new zzeuf(Integer.toString(17))) : zzhbi.zza(new zzeuf(null));
    }
}

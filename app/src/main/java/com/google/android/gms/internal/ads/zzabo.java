package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzabo implements zzds {
    static final /* synthetic */ zzabo zza = new zzabo();

    private /* synthetic */ zzabo() {
    }

    @Override // com.google.android.gms.internal.ads.zzds
    public final /* synthetic */ void zza(Object obj) {
        ((ExecutorService) obj).shutdown();
    }
}

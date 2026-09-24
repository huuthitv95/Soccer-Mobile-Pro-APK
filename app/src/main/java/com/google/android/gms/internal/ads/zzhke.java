package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzhke implements zzhkg {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    zzhke(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzhkg
    public final boolean zza() {
        return this.zza.get();
    }
}

package com.google.android.gms.internal.ads;

import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgrz {
    private final Mutex zza = MutexKt.Mutex$default(false, 1, null);

    public final Mutex zza() {
        return this.zza;
    }
}

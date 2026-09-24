package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbks {
    public static final zzbjo zza;

    static {
        zzbjo.zzb("gads:ad_loader:timeout_ms", 60000L);
        zza = zzbjo.zzb("gads:rendering:timeout_ms", 60000L);
        zzbjo.zzb("gads:resolve_future:default_timeout_ms", WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
    }
}

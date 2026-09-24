package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdh {
    private static Executor zza;

    public static synchronized Executor zza() {
        if (zza == null) {
            zza = zzfk.zzg("ExoPlayer:BackgroundExecutor");
        }
        return zza;
    }
}

package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzpz {
    public static final zzpz zza;
    public final String zzb;
    private final zzpy zzc;

    static {
        new zzpz("");
        zza = new zzpz("preload");
    }

    public zzpz(String str) {
        this.zzb = str;
        this.zzc = Build.VERSION.SDK_INT >= 31 ? new zzpy() : null;
    }

    public final synchronized LogSessionId zza() {
        zzpy zzpyVar;
        zzpyVar = this.zzc;
        if (zzpyVar == null) {
            throw null;
        }
        return zzpyVar.zza;
    }

    public final synchronized void zzb(LogSessionId logSessionId) {
        zzpy zzpyVar = this.zzc;
        if (zzpyVar == null) {
            throw null;
        }
        zzgsw.zzi(zzpyVar.zza.equals(LogSessionId.LOG_SESSION_ID_NONE));
        zzpyVar.zza = logSessionId;
    }
}

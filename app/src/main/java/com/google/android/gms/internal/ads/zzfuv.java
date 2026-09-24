package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfuv {
    private final zzfwj zza;
    private final String zzb;
    private final zzfub zzc;
    private final String zzd = "Ad overlay";

    public zzfuv(View view, zzfub zzfubVar, String str) {
        this.zza = new zzfwj(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = zzfubVar;
    }

    public final zzfwj zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final zzfub zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }
}

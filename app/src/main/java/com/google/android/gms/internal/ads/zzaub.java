package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzaub implements zzats {
    final /* synthetic */ Context zza;
    private File zzb = null;

    zzaub(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzats
    public final File zza() {
        if (this.zzb == null) {
            this.zzb = new File(this.zza.getCacheDir(), "volley");
        }
        return this.zzb;
    }
}

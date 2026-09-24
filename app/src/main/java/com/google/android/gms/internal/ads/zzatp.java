package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzatp implements zzats {
    final /* synthetic */ File zza;

    zzatp(zzatt zzattVar, File file) {
        this.zza = file;
        Objects.requireNonNull(zzattVar);
    }

    @Override // com.google.android.gms.internal.ads.zzats
    public final File zza() {
        return this.zza;
    }
}

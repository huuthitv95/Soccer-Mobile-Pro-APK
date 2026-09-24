package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgel {
    private final ExecutorService zza;

    public zzgel(ExecutorService executorService) {
        this.zza = executorService;
    }

    public final zzgec zza(File file, zzifc zzifcVar, zzgsn zzgsnVar) {
        return new zzgek(file, this.zza, new zzgei(zzifcVar), zzgsnVar);
    }

    public final zzgec zzb(File file, byte[] bArr, zzgsn zzgsnVar) {
        return new zzgek(file, this.zza, new zzgee(bArr), zzgsnVar);
    }
}

package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzarl {
    public final int zza;
    public final long zzb;

    private zzarl(int i, long j) {
        this.zza = i;
        this.zzb = j;
    }

    public static zzarl zza(zzafq zzafqVar, zzes zzesVar) throws IOException {
        zzafqVar.zzi(zzesVar.zzi(), 0, 8);
        zzesVar.zzh(0);
        return new zzarl(zzesVar.zzB(), zzesVar.zzA());
    }
}

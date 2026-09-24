package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgnj implements zzimi {
    private final zzimr zza;

    private zzgnj(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzgnj zza(zzimr zzimrVar) {
        return new zzgnj(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File(new File((File) this.zza.zzb(), "drgd"), "v"), "pcam.jar");
    }
}

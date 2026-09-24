package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgmy implements zzimi {
    private final zzimr zza;

    private zzgmy(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzgmy zza(zzimr zzimrVar) {
        return new zzgmy(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File((File) this.zza.zzb(), "drgd"), "pmtd.d");
    }
}

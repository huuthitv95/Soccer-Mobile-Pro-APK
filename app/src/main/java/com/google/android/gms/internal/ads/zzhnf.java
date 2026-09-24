package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhnf implements zzhnj {
    private final zziam zza;
    private final zzhsi zzb;

    private zzhnf(zzhsi zzhsiVar, zziam zziamVar) {
        this.zzb = zzhsiVar;
        this.zza = zziamVar;
    }

    public static zzhnf zza(zzhsi zzhsiVar) {
        return new zzhnf(zzhsiVar, zzhnq.zza(zzhsiVar.zza()));
    }

    public static zzhnf zzb(zzhsi zzhsiVar) throws GeneralSecurityException {
        return new zzhnf(zzhsiVar, zzhnq.zzb(zzhsiVar.zza()));
    }

    public final zzhsi zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhnj
    public final zziam zzf() {
        return this.zza;
    }
}

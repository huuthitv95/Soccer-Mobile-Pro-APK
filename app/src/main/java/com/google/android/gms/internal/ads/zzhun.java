package com.google.android.gms.internal.ads;

import java.security.spec.ECPoint;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhun extends zzhxd {
    private final zzhuj zza;
    private final ECPoint zzb;
    private final zziam zzc;

    @Nullable
    private final Integer zzd;

    /* synthetic */ zzhun(zzhuj zzhujVar, ECPoint eCPoint, zziam zziamVar, Integer num, byte[] bArr) {
        this.zza = zzhujVar;
        this.zzb = eCPoint;
        this.zzc = zziamVar;
        this.zzd = num;
    }

    public static zzhum zzc() {
        return new zzhum(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhxd, com.google.android.gms.internal.ads.zzhdc
    public final /* synthetic */ zzhdt zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    @Nullable
    public final Integer zzb() {
        return this.zzd;
    }

    public final ECPoint zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhxd
    public final zziam zze() {
        return this.zzc;
    }

    public final zzhuj zzf() {
        return this.zza;
    }
}

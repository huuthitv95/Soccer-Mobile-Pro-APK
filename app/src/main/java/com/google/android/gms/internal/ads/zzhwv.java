package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhwv extends zzhxd {
    private final zzhwr zza;
    private final BigInteger zzb;
    private final zziam zzc;

    @Nullable
    private final Integer zzd;

    /* synthetic */ zzhwv(zzhwr zzhwrVar, BigInteger bigInteger, zziam zziamVar, Integer num, byte[] bArr) {
        this.zza = zzhwrVar;
        this.zzb = bigInteger;
        this.zzc = zziamVar;
        this.zzd = num;
    }

    public static zzhwu zzc() {
        return new zzhwu(null);
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

    public final BigInteger zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhxd
    public final zziam zze() {
        return this.zzc;
    }

    public final zzhwr zzf() {
        return this.zza;
    }
}

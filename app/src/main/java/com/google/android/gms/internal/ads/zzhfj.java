package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhfj extends zzhek {
    private final zzhfq zza;
    private final zziao zzb;
    private final zziam zzc;

    @Nullable
    private final Integer zzd;

    /* synthetic */ zzhfj(zzhfq zzhfqVar, zziao zziaoVar, zziam zziamVar, Integer num, byte[] bArr) {
        this.zza = zzhfqVar;
        this.zzb = zziaoVar;
        this.zzc = zziamVar;
        this.zzd = num;
    }

    public static zzhfi zzd() {
        return new zzhfi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhek, com.google.android.gms.internal.ads.zzhdc
    public final /* synthetic */ zzhdt zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    @Nullable
    public final Integer zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhek
    public final zziam zzc() {
        return this.zzc;
    }

    public final zziao zze() {
        return this.zzb;
    }

    public final zzhfq zzf() {
        return this.zza;
    }
}

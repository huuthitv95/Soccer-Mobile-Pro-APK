package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhfs extends zzhek {
    private final zzhfz zza;
    private final zziao zzb;
    private final zziam zzc;

    @Nullable
    private final Integer zzd;

    /* synthetic */ zzhfs(zzhfz zzhfzVar, zziao zziaoVar, zziam zziamVar, Integer num, byte[] bArr) {
        this.zza = zzhfzVar;
        this.zzb = zziaoVar;
        this.zzc = zziamVar;
        this.zzd = num;
    }

    public static zzhfr zzd() {
        return new zzhfr(null);
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

    public final zzhfz zzf() {
        return this.zza;
    }
}

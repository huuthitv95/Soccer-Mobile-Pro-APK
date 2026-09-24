package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhns extends zzhop {
    private final zzhnz zza;
    private final zziao zzb;
    private final zziam zzc;

    @Nullable
    private final Integer zzd;

    /* synthetic */ zzhns(zzhnz zzhnzVar, zziao zziaoVar, zziam zziamVar, Integer num, byte[] bArr) {
        this.zza = zzhnzVar;
        this.zzb = zziaoVar;
        this.zzc = zziamVar;
        this.zzd = num;
    }

    public static zzhnr zzc() {
        return new zzhnr(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhop, com.google.android.gms.internal.ads.zzhdc
    public final /* synthetic */ zzhdt zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    @Nullable
    public final Integer zzb() {
        return this.zzd;
    }

    public final zziao zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhop
    public final zziam zze() {
        return this.zzc;
    }

    public final zzhnz zzf() {
        return this.zza;
    }
}

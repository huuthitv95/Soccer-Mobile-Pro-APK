package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzher extends zzhek {
    private final zzhez zza;
    private final zziao zzb;
    private final zziao zzc;
    private final zziam zzd;

    @Nullable
    private final Integer zze;

    /* synthetic */ zzher(zzhez zzhezVar, zziao zziaoVar, zziao zziaoVar2, zziam zziamVar, Integer num, byte[] bArr) {
        this.zza = zzhezVar;
        this.zzb = zziaoVar;
        this.zzc = zziaoVar2;
        this.zzd = zziamVar;
        this.zze = num;
    }

    public static zzheq zzd() {
        return new zzheq(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhek, com.google.android.gms.internal.ads.zzhdc
    public final /* synthetic */ zzhdt zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    @Nullable
    public final Integer zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhek
    public final zziam zzc() {
        return this.zzd;
    }

    public final zziao zze() {
        return this.zzb;
    }

    public final zziao zzf() {
        return this.zzc;
    }

    public final zzhez zzg() {
        return this.zza;
    }
}

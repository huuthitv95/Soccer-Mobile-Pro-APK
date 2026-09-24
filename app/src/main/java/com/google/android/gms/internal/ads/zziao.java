package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zziao {
    private final zziam zza;

    private zziao(zziam zziamVar) {
        this.zza = zziamVar;
    }

    public static zziao zza(byte[] bArr, zzhdx zzhdxVar) {
        return new zziao(zziam.zza(bArr));
    }

    public static zziao zzb(int i) {
        return new zziao(zziam.zza(zzhnh.zza(i)));
    }

    public final byte[] zzc(zzhdx zzhdxVar) {
        return this.zza.zzc();
    }

    public final int zzd() {
        return this.zza.zzd();
    }
}

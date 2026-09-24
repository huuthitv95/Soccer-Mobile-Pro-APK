package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzimj implements zzimi, zzimc {
    private static final zzimj zza = new zzimj(null);
    private final Object zzb;

    private zzimj(Object obj) {
        this.zzb = obj;
    }

    public static zzimi zza(Object obj) {
        zzimq.zza(obj, "instance cannot be null");
        return new zzimj(obj);
    }

    public static zzimi zzc(Object obj) {
        return obj == null ? zza : new zzimj(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final Object zzb() {
        return this.zzb;
    }
}

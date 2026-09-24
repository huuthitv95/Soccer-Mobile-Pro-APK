package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaar {
    public final zzbg zza;
    public final int[] zzb;

    public zzaar(zzbg zzbgVar, int[] iArr, int i) {
        if (iArr.length == 0) {
            zzef.zzf("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzbgVar;
        this.zzb = iArr;
    }
}

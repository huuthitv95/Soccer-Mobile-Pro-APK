package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzimg implements zzimi {
    private zzimr zza;

    public static void zza(zzimr zzimrVar, zzimr zzimrVar2) {
        zzimg zzimgVar = (zzimg) zzimrVar;
        if (zzimgVar.zza != null) {
            throw new IllegalStateException();
        }
        zzimgVar.zza = zzimrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final Object zzb() {
        zzimr zzimrVar = this.zza;
        if (zzimrVar != null) {
            return zzimrVar.zzb();
        }
        throw new IllegalStateException();
    }
}

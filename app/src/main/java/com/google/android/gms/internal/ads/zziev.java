package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zziev {
    private final zzieu zza;

    private zziev(zzigu zziguVar, Object obj, zzigu zziguVar2, Object obj2) {
        this.zza = new zzieu(zziguVar, "", zziguVar2, obj2);
    }

    public static zziev zza(zzigu zziguVar, Object obj, zzigu zziguVar2, Object obj2) {
        return new zziev(zziguVar, "", zziguVar2, obj2);
    }

    static void zzb(zzicw zzicwVar, zzieu zzieuVar, Object obj, Object obj2) throws IOException {
        zzidg.zzf(zzicwVar, zzieuVar.zza, 1, obj);
        zzidg.zzf(zzicwVar, zzieuVar.zzc, 2, obj2);
    }

    static int zzc(zzieu zzieuVar, Object obj, Object obj2) {
        return zzidg.zzh(zzieuVar.zza, 1, obj) + zzidg.zzh(zzieuVar.zzc, 2, obj2);
    }

    public final int zzd(int i, Object obj, Object obj2) {
        zzieu zzieuVar = this.zza;
        int iZzF = zzicw.zzF(i << 3);
        int iZzc = zzc(zzieuVar, obj, obj2);
        return iZzF + zzicw.zzF(iZzc) + iZzc;
    }

    final zzieu zze() {
        return this.zza;
    }
}

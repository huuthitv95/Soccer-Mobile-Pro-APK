package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzamy {
    public static void zza(zzamz zzamzVar, zzand zzandVar, zzds zzdsVar) {
        for (int i = 0; i < zzamzVar.zza(); i++) {
            long jZzb = zzamzVar.zzb(i);
            List listZzc = zzamzVar.zzc(jZzb);
            if (!listZzc.isEmpty()) {
                if (i == zzamzVar.zza() - 1) {
                    throw new IllegalStateException();
                }
                long jZzb2 = zzamzVar.zzb(i + 1) - zzamzVar.zzb(i);
                if (jZzb2 > 0) {
                    zzdsVar.zza(new zzamw(listZzc, jZzb, jZzb2));
                }
            }
        }
    }
}

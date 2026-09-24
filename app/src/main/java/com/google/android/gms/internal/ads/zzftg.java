package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzftg implements Runnable {
    final /* synthetic */ zzftl zza;

    zzftg(zzftl zzftlVar) {
        Objects.requireNonNull(zzftlVar);
        this.zza = zzftlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzftl zzftlVar = this.zza;
        if (zzftlVar.zzI() != null) {
            zzfsp zzfspVarZzI = zzftlVar.zzI();
            Clock clockZzJ = zzftlVar.zzJ();
            zzfspVarZzI.zzj(clockZzJ.currentTimeMillis(), zzftlVar.zzK(), zzftlVar.zze.zzd, zzftlVar.zzH());
        }
    }
}

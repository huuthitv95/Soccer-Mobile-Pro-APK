package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Strings;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzewh implements zzfby {
    private final zzfgs zza;

    zzewh(zzfgs zzfgsVar) {
        this.zza = zzfgsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        zzfgs zzfgsVar = this.zza;
        if (zzfgsVar == null) {
            return zzhbi.zza(new zzewg(null));
        }
        String strZza = zzfgsVar.zza();
        return Strings.isEmptyOrWhitespace(strZza) ? zzhbi.zza(new zzewg(null)) : zzhbi.zza(new zzewg(strZza));
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 15;
    }
}

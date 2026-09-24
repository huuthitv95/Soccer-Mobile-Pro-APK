package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgxm extends zzgxl {
    final /* synthetic */ zzgxn zza;

    zzgxm(zzgxn zzgxnVar, int i) {
        Objects.requireNonNull(zzgxnVar);
        this.zza = zzgxnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final zzgwu zza() {
        return new zzgxp(this.zza.zza(), new zzgxk(2));
    }
}

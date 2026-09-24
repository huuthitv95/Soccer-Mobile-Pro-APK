package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.connection.Connections;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbe extends zzep {
    private final BaseImplementation.ResultHolder<Connections.StartAdvertisingResult> zza;

    zzbe(BaseImplementation.ResultHolder<Connections.StartAdvertisingResult> resultHolder) {
        this.zza = (BaseImplementation.ResultHolder) Preconditions.checkNotNull(resultHolder);
    }

    @Override // com.google.android.gms.internal.nearby.zzeq
    public final void zzb(zzfq zzfqVar) {
        Status statusZzG = zzbf.zzG(zzfqVar.zza());
        if (statusZzG.isSuccess()) {
            this.zza.setResult(new zzbd(statusZzG, zzfqVar.zzb()));
        } else {
            this.zza.setFailedResult(statusZzG);
        }
    }
}

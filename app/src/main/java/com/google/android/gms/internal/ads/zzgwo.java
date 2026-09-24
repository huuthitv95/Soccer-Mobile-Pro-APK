package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgwo extends zzgtx {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzgsx zzb;

    zzgwo(Iterator it, zzgsx zzgsxVar) {
        this.zza = it;
        this.zzb = zzgsxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgtx
    protected final Object zza() {
        zzgsx zzgsxVar;
        Object next;
        do {
            Iterator it = this.zza;
            if (!it.hasNext()) {
                zzb();
                return null;
            }
            zzgsxVar = this.zzb;
            next = it.next();
        } while (!zzgsxVar.zza(next));
        return next;
    }
}

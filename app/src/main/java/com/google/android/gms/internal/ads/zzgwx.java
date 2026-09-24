package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgwx extends zzgym {
    final /* synthetic */ zzgwy zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgwx(zzgwy zzgwyVar, ListIterator listIterator) {
        super(listIterator);
        Objects.requireNonNull(zzgwyVar);
        this.zza = zzgwyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}

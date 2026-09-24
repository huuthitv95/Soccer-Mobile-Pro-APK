package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgwv extends zzgym {
    final /* synthetic */ zzgww zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgwv(zzgww zzgwwVar, ListIterator listIterator) {
        super(listIterator);
        Objects.requireNonNull(zzgwwVar);
        this.zza = zzgwwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}

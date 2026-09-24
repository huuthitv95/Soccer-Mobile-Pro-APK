package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgwe extends zzgyn {
    final Iterator zza;
    Iterator zzb;
    final /* synthetic */ zzgwh zzc;

    zzgwe(zzgwh zzgwhVar) {
        Objects.requireNonNull(zzgwhVar);
        this.zzc = zzgwhVar;
        this.zza = ((zzgvz) zzgwhVar.map.values()).listIterator(0);
        this.zzb = zzgwp.zza;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext() || this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.zzb.hasNext()) {
            this.zzb = ((zzgvv) this.zza.next()).iterator();
        }
        return this.zzb.next();
    }
}

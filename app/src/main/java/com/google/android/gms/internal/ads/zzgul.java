package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
class zzgul implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzgum zzc;

    zzgul(zzgum zzgumVar) {
        Objects.requireNonNull(zzgumVar);
        this.zzc = zzgumVar;
        this.zzb = zzgumVar.zzb;
        Collection collection = zzgumVar.zzb;
        this.zza = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
        zzgum zzgumVar = this.zzc;
        zzgup zzgupVar = zzgumVar.zze;
        zzgupVar.zzq(zzgupVar.zzp() - 1);
        zzgumVar.zzb();
    }

    final void zza() {
        zzgum zzgumVar = this.zzc;
        zzgumVar.zza();
        if (zzgumVar.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    zzgul(zzgum zzgumVar, Iterator it) {
        Objects.requireNonNull(zzgumVar);
        this.zzc = zzgumVar;
        this.zzb = zzgumVar.zzb;
        this.zza = it;
    }
}

package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
class zzguf extends zzgxd {
    final /* synthetic */ zzgup zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzguf(zzgup zzgupVar, Map map) {
        super(map);
        Objects.requireNonNull(zzgupVar);
        this.zza = zzgupVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxd, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        zzgws.zzb(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.zzd.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.zzd.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zzd.keySet().hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzgxd, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzgue(this, this.zzd.entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.ads.zzgxd, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.zzd.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        zzgup zzgupVar = this.zza;
        zzgupVar.zzq(zzgupVar.zzp() - size);
        return size > 0;
    }
}

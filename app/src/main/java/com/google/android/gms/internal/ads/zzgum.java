package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
class zzgum extends AbstractCollection {
    final Object zza;
    Collection zzb;
    final zzgum zzc;
    final Collection zzd;
    final /* synthetic */ zzgup zze;

    zzgum(zzgup zzgupVar, Object obj, Collection collection, zzgum zzgumVar) {
        Objects.requireNonNull(zzgupVar);
        this.zze = zzgupVar;
        this.zza = obj;
        this.zzb = collection;
        this.zzc = zzgumVar;
        this.zzd = zzgumVar == null ? null : zzgumVar.zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zza();
        boolean zIsEmpty = this.zzb.isEmpty();
        boolean zAdd = this.zzb.add(obj);
        if (zAdd) {
            zzgup zzgupVar = this.zze;
            zzgupVar.zzq(zzgupVar.zzp() + 1);
            if (zIsEmpty) {
                zzc();
                return true;
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.zzb.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.zzb.size();
        zzgup zzgupVar = this.zze;
        zzgupVar.zzq(zzgupVar.zzp() + (size2 - size));
        if (size != 0) {
            return zAddAll;
        }
        zzc();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.zzb.clear();
        zzgup zzgupVar = this.zze;
        zzgupVar.zzq(zzgupVar.zzp() - size);
        zzb();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zza();
        return this.zzb.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zza();
        return this.zzb.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zza();
        return this.zzb.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zza();
        return this.zzb.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zza();
        return new zzgul(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        zza();
        boolean zRemove = this.zzb.remove(obj);
        if (zRemove) {
            zzgup zzgupVar = this.zze;
            zzgupVar.zzq(zzgupVar.zzp() - 1);
            zzb();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.zzb.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.zzb.size();
            zzgup zzgupVar = this.zze;
            zzgupVar.zzq(zzgupVar.zzp() + (size2 - size));
            zzb();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zza();
        return this.zzb.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zza();
        return this.zzb.toString();
    }

    final void zza() {
        zzgum zzgumVar = this.zzc;
        if (zzgumVar != null) {
            zzgumVar.zza();
            if (zzgumVar.zzb != this.zzd) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.zzb.isEmpty()) {
            zzgup zzgupVar = this.zze;
            Collection collection = (Collection) zzgupVar.zzo().get(this.zza);
            if (collection != null) {
                this.zzb = collection;
            }
        }
    }

    final void zzb() {
        zzgum zzgumVar = this.zzc;
        if (zzgumVar != null) {
            zzgumVar.zzb();
        } else if (this.zzb.isEmpty()) {
            zzgup zzgupVar = this.zze;
            zzgupVar.zzo().remove(this.zza);
        }
    }

    final void zzc() {
        zzgum zzgumVar = this.zzc;
        if (zzgumVar != null) {
            zzgumVar.zzc();
            return;
        }
        zzgup zzgupVar = this.zze;
        zzgupVar.zzo().put(this.zza, this.zzb);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.zzb.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.zzb.size();
            zzgup zzgupVar = this.zze;
            zzgupVar.zzq(zzgupVar.zzp() + (size2 - size));
            zzb();
        }
        return zRetainAll;
    }
}

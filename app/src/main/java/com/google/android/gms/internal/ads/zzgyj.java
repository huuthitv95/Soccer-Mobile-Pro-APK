package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgyj {
    public static zzgyi zza(Set set, Set set2) {
        zzgsw.zzk(set, "set1");
        zzgsw.zzk(set2, "set2");
        return new zzgye(set, set2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Set zzb(Set set, zzgsx zzgsxVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof zzgyf)) {
                set.getClass();
                return new zzgyf(set, zzgsxVar);
            }
            zzgyf zzgyfVar = (zzgyf) set;
            return new zzgyf((Set) zzgyfVar.zza, zzgta.zzb(zzgyfVar.zzb, zzgsxVar));
        }
        SortedSet sortedSet = (SortedSet) set;
        if (!(sortedSet instanceof zzgyf)) {
            sortedSet.getClass();
            return new zzgyg(sortedSet, zzgsxVar);
        }
        zzgyf zzgyfVar2 = (zzgyf) sortedSet;
        return new zzgyg((SortedSet) zzgyfVar2.zza, zzgta.zzb(zzgyfVar2.zzb, zzgsxVar));
    }

    static int zzc(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    static boolean zzd(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    static boolean zze(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    static boolean zzf(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof zzgxq) {
            collection = ((zzgxq) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return zze(set, collection.iterator());
        }
        Iterator it = set.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}

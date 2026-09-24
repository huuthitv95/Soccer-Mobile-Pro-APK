package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzgvz extends zzgvv implements List, RandomAccess {
    private static final zzgyo zza = new zzgvx(zzgxu.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    zzgvz() {
    }

    public static zzgvz zzi() {
        return zzgxu.zza;
    }

    public static zzgvz zzj(Object obj) {
        Object[] objArr = {obj};
        zzgxs.zza(objArr, 1);
        return zzt(objArr, 1);
    }

    public static zzgvz zzk(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzgxs.zza(objArr, 2);
        return zzt(objArr, 2);
    }

    public static zzgvz zzl(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        zzgxs.zza(objArr, 3);
        return zzt(objArr, 3);
    }

    public static zzgvz zzm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzgxs.zza(objArr, 5);
        return zzt(objArr, 5);
    }

    public static zzgvz zzn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6};
        zzgxs.zza(objArr, 6);
        return zzt(objArr, 6);
    }

    @SafeVarargs
    public static zzgvz zzo(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        int i = length + 12;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        zzgxs.zza(objArr2, i);
        return zzt(objArr2, i);
    }

    public static zzgvz zzq(Collection collection) {
        if (!(collection instanceof zzgvv)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzgxs.zza(array, length);
            return zzt(array, length);
        }
        zzgvz zzgvzVarZze = ((zzgvv) collection).zze();
        if (!zzgvzVarZze.zzf()) {
            return zzgvzVarZze;
        }
        Object[] array2 = zzgvzVarZze.toArray();
        return zzt(array2, array2.length);
    }

    public static zzgvz zzr(Object[] objArr) {
        if (objArr.length == 0) {
            return zzgxu.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzgxs.zza(objArr2, length);
        return zzt(objArr2, length);
    }

    public static zzgvz zzs(Comparator comparator, Iterable iterable) {
        Object[] array = (iterable instanceof Collection ? (Collection) iterable : zzgwz.zza(((zzgvz) iterable).listIterator(0))).toArray();
        int length = array.length;
        zzgxs.zza(array, length);
        Arrays.sort(array, comparator);
        return zzt(array, length);
    }

    static zzgvz zzt(Object[] objArr, int i) {
        return i == 0 ? zzgxu.zza : new zzgxu(objArr, i);
    }

    public static zzgvw zzv(int i) {
        zzguv.zzb(i, "expectedSize");
        return new zzgvw(i);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i = 0; i < size; i++) {
                if (!Objects.equals(get(i), list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !Objects.equals(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzgvv
    /* JADX INFO: renamed from: zza */
    public final zzgyn iterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgvv
    @Deprecated
    public final zzgvz zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv
    int zzg(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public zzgvz subList(int i, int i2) {
        zzgsw.zzo(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? zzgxu.zza : new zzgvy(this, i, i3);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public final zzgyo listIterator(int i) {
        zzgsw.zzn(i, size(), "index");
        return isEmpty() ? zza : new zzgvx(this, i);
    }

    public static zzgvz zzp(Iterable iterable) {
        iterable.getClass();
        return zzq((Collection) iterable);
    }
}

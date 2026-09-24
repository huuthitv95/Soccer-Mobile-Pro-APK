package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzgwj<E> extends zzgvv<E> implements Set<E> {
    private transient zzgvz zza;

    zzgwj() {
    }

    public static zzgwj zzh() {
        return zzgya.zza;
    }

    public static zzgwj zzi(Object obj) {
        return new zzgyk(obj);
    }

    public static zzgwj zzj(Object obj, Object obj2) {
        return zzw(2, obj, obj2);
    }

    public static zzgwj zzk(Object obj, Object obj2, Object obj3) {
        return zzw(3, obj, obj2, obj3);
    }

    public static zzgwj zzl(Object obj, Object obj2, Object obj3, Object obj4) {
        return zzw(4, obj, obj2, obj3, obj4);
    }

    public static zzgwj zzm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzw(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static zzgwj zzn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length;
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return zzw(i, objArr2);
    }

    static int zzo(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            zzgsw.zzb(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static zzgwj zzp(Collection collection) {
        if ((collection instanceof zzgwj) && !(collection instanceof SortedSet)) {
            zzgwj zzgwjVar = (zzgwj) collection;
            if (!zzgwjVar.zzf()) {
                return zzgwjVar;
            }
        }
        Object[] array = collection.toArray();
        return zzw(array.length, array);
    }

    public static zzgwj zzq(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? zzw(length, (Object[]) objArr.clone()) : new zzgyk(objArr[0]);
        }
        return zzgya.zza;
    }

    public static zzgwi zzt(int i) {
        zzguv.zzb(i, "expectedSize");
        return new zzgwi(i, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzx(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzgwj) && zzr() && ((zzgwj) obj).zzr() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzgyj.zzd(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzgyj.zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public abstract zzgyn iterator();

    @Override // com.google.android.gms.internal.ads.zzgvv
    public zzgvz zze() {
        zzgvz zzgvzVar = this.zza;
        if (zzgvzVar != null) {
            return zzgvzVar;
        }
        zzgvz zzgvzVarZzs = zzs();
        this.zza = zzgvzVarZzs;
        return zzgvzVarZzs;
    }

    boolean zzr() {
        return false;
    }

    zzgvz zzs() {
        Object[] array = toArray();
        int i = zzgvz.zzd;
        return zzgvz.zzt(array, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzgwj zzw(int i, Object... objArr) {
        if (i == 0) {
            return zzgya.zza;
        }
        if (i == 1) {
            return new zzgyk(Objects.requireNonNull(objArr[0]));
        }
        int iZzo = zzo(i);
        Object[] objArr2 = new Object[iZzo];
        int i2 = iZzo - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj = objArr[i5];
            zzgxs.zzb(obj, i5);
            int iHashCode = obj.hashCode();
            int iZza = zzgvs.zza(iHashCode);
            while (true) {
                int i6 = iZza & i2;
                Object obj2 = objArr2[i6];
                if (obj2 == null) {
                    objArr[i4] = obj;
                    objArr2[i6] = obj;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj2.equals(obj)) {
                    break;
                }
                iZza++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            return new zzgyk(Objects.requireNonNull(objArr[0]));
        }
        if (zzo(i4) < iZzo / 2) {
            return zzw(i4, objArr);
        }
        if (zzx(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new zzgya(objArr, i3, objArr2, i2, i4);
    }
}

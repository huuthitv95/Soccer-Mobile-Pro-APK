package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgwn {
    public static boolean zza(Iterable iterable, zzgsx zzgsxVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            zzgsxVar.getClass();
            return zzc((List) iterable, zzgsxVar);
        }
        Iterator it = iterable.iterator();
        zzgsxVar.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (zzgsxVar.zza(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static Object zzb(Iterable iterable, Object obj) {
        zzgyn it = ((zzgye) iterable).iterator();
        return it.hasNext() ? it.next() : obj;
    }

    private static boolean zzc(List list, zzgsx zzgsxVar) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!zzgsxVar.zza(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (IllegalArgumentException unused) {
                        zzd(list, zzgsxVar, i2, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        zzd(list, zzgsxVar, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }

    private static void zzd(List list, zzgsx zzgsxVar, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (zzgsxVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            } else {
                list.remove(i2);
            }
        }
    }
}

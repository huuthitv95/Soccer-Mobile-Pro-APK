package com.google.android.gms.common.data;

import com.ironsource.sdk.controller.FeaturesManager;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class FreezableUtils {
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> arrayList) {
        FeaturesManager.C12486a c12486a = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c12486a.add(arrayList.get(i).freeze());
        }
        return c12486a;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] eArr) {
        FeaturesManager.C12486a c12486a = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e : eArr) {
            c12486a.add(e.freeze());
        }
        return c12486a;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> iterable) {
        FeaturesManager.C12486a c12486a = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            c12486a.add(it.next().freeze());
        }
        return c12486a;
    }
}

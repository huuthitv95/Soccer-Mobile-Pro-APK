package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: com.ironsource.L */
/* JADX INFO: loaded from: classes6.dex */
public final class C11533L {

    /* JADX INFO: renamed from: a */
    private final int f24876a;

    /* JADX INFO: renamed from: b */
    private final List<C11497J> f24877b = new CopyOnWriteArrayList();

    public C11533L(int i) {
        this.f24876a = i;
    }

    /* JADX INFO: renamed from: b */
    private final boolean m26314b() {
        return this.f24876a == 0;
    }

    /* JADX INFO: renamed from: c */
    private final boolean m26315c() {
        return this.f24876a != -1;
    }

    /* JADX INFO: renamed from: a */
    public final void m26316a(C11497J c11497j) {
        if (m26314b()) {
            return;
        }
        if (m26313a()) {
            CollectionsKt.removeFirstOrNull(this.f24877b);
        }
        if (c11497j == null) {
            c11497j = new C11497J(C12450r0.a.NotPartOfWaterfall);
        }
        this.f24877b.add(c11497j);
    }

    /* JADX INFO: renamed from: d */
    public final String m26317d() {
        List<C11497J> list = this.f24877b;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((C11497J) it.next()).m26150b().ordinal()));
        }
        return CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: renamed from: a */
    private final boolean m26313a() {
        return m26315c() && this.f24877b.size() >= this.f24876a;
    }
}

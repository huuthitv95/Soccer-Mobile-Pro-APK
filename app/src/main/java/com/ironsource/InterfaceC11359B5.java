package com.ironsource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.ironsource.B5 */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC11359B5<T> {

    /* JADX INFO: renamed from: com.ironsource.B5$a */
    public static final class a<T> implements InterfaceC11359B5<T> {

        /* JADX INFO: renamed from: a */
        private final ArrayList<T> f23905a;

        /* JADX INFO: renamed from: b */
        private final ArrayList<T> f23906b;

        public a(ArrayList<T> a2, ArrayList<T> b) {
            Intrinsics.checkNotNullParameter(a2, "a");
            Intrinsics.checkNotNullParameter(b, "b");
            this.f23905a = a2;
            this.f23906b = b;
        }

        @Override // com.ironsource.InterfaceC11359B5
        public boolean contains(T t) {
            return this.f23905a.contains(t) || this.f23906b.contains(t);
        }

        @Override // com.ironsource.InterfaceC11359B5
        public int size() {
            return this.f23905a.size() + this.f23906b.size();
        }

        @Override // com.ironsource.InterfaceC11359B5
        public List<T> value() {
            return CollectionsKt.plus((Collection) this.f23905a, (Iterable) this.f23906b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.B5$b */
    public static final class b<T> implements InterfaceC11359B5<T> {

        /* JADX INFO: renamed from: a */
        private final InterfaceC11359B5<T> f23907a;

        /* JADX INFO: renamed from: b */
        private final Comparator<T> f23908b;

        public b(InterfaceC11359B5<T> collection, Comparator<T> comparator) {
            Intrinsics.checkNotNullParameter(collection, "collection");
            Intrinsics.checkNotNullParameter(comparator, "comparator");
            this.f23907a = collection;
            this.f23908b = comparator;
        }

        @Override // com.ironsource.InterfaceC11359B5
        public boolean contains(T t) {
            return this.f23907a.contains(t);
        }

        @Override // com.ironsource.InterfaceC11359B5
        public int size() {
            return this.f23907a.size();
        }

        @Override // com.ironsource.InterfaceC11359B5
        public List<T> value() {
            return CollectionsKt.sortedWith(this.f23907a.value(), this.f23908b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.B5$c */
    public static final class c<T> implements InterfaceC11359B5<T> {

        /* JADX INFO: renamed from: a */
        private final int f23909a;

        /* JADX INFO: renamed from: b */
        private final List<T> f23910b;

        public c(InterfaceC11359B5<T> collection, int i) {
            Intrinsics.checkNotNullParameter(collection, "collection");
            this.f23909a = i;
            this.f23910b = collection.value();
        }

        /* JADX INFO: renamed from: a */
        public final List<T> m25406a() {
            int size = this.f23910b.size();
            int i = this.f23909a;
            if (size <= i) {
                return CollectionsKt.emptyList();
            }
            List<T> list = this.f23910b;
            return list.subList(i, list.size());
        }

        /* JADX INFO: renamed from: b */
        public final List<T> m25407b() {
            List<T> list = this.f23910b;
            return list.subList(0, RangesKt.coerceAtMost(list.size(), this.f23909a));
        }

        @Override // com.ironsource.InterfaceC11359B5
        public boolean contains(T t) {
            return this.f23910b.contains(t);
        }

        @Override // com.ironsource.InterfaceC11359B5
        public int size() {
            return this.f23910b.size();
        }

        @Override // com.ironsource.InterfaceC11359B5
        public List<T> value() {
            return this.f23910b;
        }
    }

    boolean contains(T t);

    int size();

    List<T> value();
}

package com.ironsource;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.ironsource.b7 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12111b7 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.ironsource.b7$a */
    public static final class a<T> implements ReadWriteProperty<Object, T> {

        /* JADX INFO: renamed from: a */
        private WeakReference<T> f30090a;

        a(T t) {
            this.f30090a = new WeakReference<>(t);
        }

        /* JADX INFO: renamed from: a */
        public final WeakReference<T> m31147a() {
            return this.f30090a;
        }

        @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
        public T getValue(Object thisRef, KProperty<?> property) {
            Intrinsics.checkNotNullParameter(thisRef, "thisRef");
            Intrinsics.checkNotNullParameter(property, "property");
            return this.f30090a.get();
        }

        @Override // kotlin.properties.ReadWriteProperty
        public void setValue(Object thisRef, KProperty<?> property, T t) {
            Intrinsics.checkNotNullParameter(thisRef, "thisRef");
            Intrinsics.checkNotNullParameter(property, "property");
            this.f30090a = new WeakReference<>(t);
        }

        /* JADX INFO: renamed from: a */
        public final void m31148a(WeakReference<T> weakReference) {
            Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
            this.f30090a = weakReference;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ReadWriteProperty m31146a(Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return m31145a(obj);
    }

    /* JADX INFO: renamed from: a */
    public static final <T> ReadWriteProperty<Object, T> m31145a(T t) {
        return new a(t);
    }
}

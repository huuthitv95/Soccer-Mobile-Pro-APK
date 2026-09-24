package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.kb */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC12285kb<T> {

    /* JADX INFO: renamed from: com.ironsource.kb$a */
    public static final class a<T> implements InterfaceC12285kb<T> {

        /* JADX INFO: renamed from: a */
        private final IronSourceError f30740a;

        public a(IronSourceError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f30740a = error;
        }

        /* JADX INFO: renamed from: a */
        public final IronSourceError m31943a() {
            return this.f30740a;
        }

        /* JADX INFO: renamed from: b */
        public final IronSourceError m31944b() {
            return this.f30740a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f30740a, ((a) obj).f30740a);
        }

        public int hashCode() {
            return this.f30740a.hashCode();
        }

        public String toString() {
            return "Failure(error=" + this.f30740a + ")";
        }

        /* JADX INFO: renamed from: a */
        public final a<T> m31942a(IronSourceError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new a<>(error);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ a m31941a(a aVar, IronSourceError ironSourceError, int i, Object obj) {
            if ((i & 1) != 0) {
                ironSourceError = aVar.f30740a;
            }
            return aVar.m31942a(ironSourceError);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.kb$b */
    public static final class b<T> implements InterfaceC12285kb<T> {

        /* JADX INFO: renamed from: a */
        private final T f30741a;

        public b(T t) {
            this.f30741a = t;
        }

        /* JADX INFO: renamed from: a */
        public final T m31947a() {
            return this.f30741a;
        }

        /* JADX INFO: renamed from: b */
        public final T m31948b() {
            return this.f30741a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f30741a, ((b) obj).f30741a);
        }

        public int hashCode() {
            T t = this.f30741a;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public String toString() {
            return "Success(value=" + this.f30741a + ")";
        }

        /* JADX INFO: renamed from: a */
        public final b<T> m31946a(T t) {
            return new b<>(t);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ b m31945a(b bVar, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = bVar.f30741a;
            }
            return bVar.m31946a(obj);
        }
    }
}

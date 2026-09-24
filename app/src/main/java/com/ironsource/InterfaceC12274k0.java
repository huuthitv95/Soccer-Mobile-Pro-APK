package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.k0 */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC12274k0 {

    /* JADX INFO: renamed from: com.ironsource.k0$a */
    public static final class a implements InterfaceC12274k0 {

        /* JADX INFO: renamed from: c */
        public static final C15540a f30714c = new C15540a(null);

        /* JADX INFO: renamed from: a */
        private final String f30715a;

        /* JADX INFO: renamed from: b */
        private final boolean f30716b;

        /* JADX INFO: renamed from: com.ironsource.k0$a$a, reason: collision with other inner class name */
        public static final class C15540a {
            public /* synthetic */ C15540a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final a m31921a(String str) {
                return new a(str);
            }

            private C15540a() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX INFO: renamed from: a */
        public final a m31918a(String str) {
            return new a(str);
        }

        /* JADX INFO: renamed from: b */
        public final String m31919b() {
            return this.f30715a;
        }

        /* JADX INFO: renamed from: c */
        public final String m31920c() {
            return this.f30715a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f30715a, ((a) obj).f30715a);
        }

        public int hashCode() {
            String str = this.f30715a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "NotReady(reason=" + this.f30715a + ")";
        }

        public a(String str) {
            this.f30715a = str;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ a m31917a(a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f30715a;
            }
            return aVar.m31918a(str);
        }

        public /* synthetic */ a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        @Override // com.ironsource.InterfaceC12274k0
        /* JADX INFO: renamed from: a */
        public boolean mo31916a() {
            return this.f30716b;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.k0$b */
    public static final class b implements InterfaceC12274k0 {

        /* JADX INFO: renamed from: a */
        public static final b f30717a = new b();

        /* JADX INFO: renamed from: b */
        private static final boolean f30718b = true;

        private b() {
        }

        @Override // com.ironsource.InterfaceC12274k0
        /* JADX INFO: renamed from: a */
        public boolean mo31916a() {
            return f30718b;
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo31916a();
}

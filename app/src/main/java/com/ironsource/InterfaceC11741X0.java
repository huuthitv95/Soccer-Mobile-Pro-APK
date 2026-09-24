package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.X0 */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC11741X0 {

    /* JADX INFO: renamed from: com.ironsource.X0$a */
    public static final class a implements InterfaceC11741X0 {

        /* JADX INFO: renamed from: a */
        private final String f26116a;

        public a(String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.f26116a = reason;
        }

        /* JADX INFO: renamed from: a */
        public final String m27853a() {
            return this.f26116a;
        }

        /* JADX INFO: renamed from: b */
        public final String m27854b() {
            return this.f26116a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f26116a, ((a) obj).f26116a);
        }

        public int hashCode() {
            return this.f26116a.hashCode();
        }

        public String toString() {
            return "Invalid(reason=" + this.f26116a + ")";
        }

        /* JADX INFO: renamed from: a */
        public final a m27852a(String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new a(reason);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ a m27851a(a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f26116a;
            }
            return aVar.m27852a(str);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.X0$b */
    public static final class b implements InterfaceC11741X0 {

        /* JADX INFO: renamed from: a */
        public static final b f26117a = new b();

        private b() {
        }
    }
}

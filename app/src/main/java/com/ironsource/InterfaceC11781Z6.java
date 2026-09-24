package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Z6 */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC11781Z6 {

    /* JADX INFO: renamed from: com.ironsource.Z6$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    /* JADX INFO: renamed from: com.ironsource.Z6$a */
    public static final class a implements InterfaceC11781Z6 {

        /* JADX INFO: renamed from: a */
        private final InterfaceC11730W6 f26691a;

        public a(InterfaceC11730W6 failure) {
            Intrinsics.checkNotNullParameter(failure, "failure");
            this.f26691a = failure;
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC11730W6 m28062a() {
            return this.f26691a;
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC11730W6 m28064b() {
            return this.f26691a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f26691a, ((a) obj).f26691a);
        }

        public int hashCode() {
            return this.f26691a.hashCode();
        }

        public String toString() {
            return "Failure(failure=" + this.f26691a + ")";
        }

        /* JADX INFO: renamed from: a */
        public final a m28063a(InterfaceC11730W6 failure) {
            Intrinsics.checkNotNullParameter(failure, "failure");
            return new a(failure);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ a m28061a(a aVar, InterfaceC11730W6 interfaceC11730W6, int i, Object obj) {
            if ((i & 1) != 0) {
                interfaceC11730W6 = aVar.f26691a;
            }
            return aVar.m28063a(interfaceC11730W6);
        }

        @Override // com.ironsource.InterfaceC11781Z6
        /* JADX INFO: renamed from: a */
        public void mo28060a(InterfaceC11799a7 handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            handler.mo28114a(this.f26691a);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo28060a(InterfaceC11799a7 interfaceC11799a7);
}

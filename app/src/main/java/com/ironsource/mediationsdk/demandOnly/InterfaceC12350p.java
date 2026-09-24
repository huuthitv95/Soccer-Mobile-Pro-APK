package com.ironsource.mediationsdk.demandOnly;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.p */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC12350p {

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.p$a */
    public static class a implements InterfaceC12350p {

        /* JADX INFO: renamed from: a */
        private final String f31212a;

        public a(String plumbus) {
            Intrinsics.checkNotNullParameter(plumbus, "plumbus");
            this.f31212a = plumbus;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC12350p
        public String value() {
            return this.f31212a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.p$b */
    public static final class b extends a {
        public b() {
            super("");
        }
    }

    String value();
}

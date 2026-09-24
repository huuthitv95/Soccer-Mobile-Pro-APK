package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.sc */
/* JADX INFO: loaded from: classes6.dex */
public final class C12480sc implements InterfaceC12463rd {

    /* JADX INFO: renamed from: a */
    private final String f31907a;

    /* JADX INFO: renamed from: com.ironsource.sc$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f31908a = new a();

        /* JADX INFO: renamed from: b */
        public static final String f31909b = "IronSource";

        private a() {
        }
    }

    public C12480sc(String networkInstanceId) {
        Intrinsics.checkNotNullParameter(networkInstanceId, "networkInstanceId");
        this.f31907a = networkInstanceId;
    }

    @Override // com.ironsource.InterfaceC12463rd
    public String value() {
        if (this.f31907a.length() == 0) {
            return "";
        }
        if (Intrinsics.areEqual(this.f31907a, "0") || Intrinsics.areEqual(this.f31907a, "IronSource")) {
            return "IronSource";
        }
        return "IronSource_" + this.f31907a;
    }
}

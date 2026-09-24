package com.ironsource;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.re */
/* JADX INFO: loaded from: classes6.dex */
public final class C12464re {

    /* JADX INFO: renamed from: b */
    private static Boolean f31843b;

    /* JADX INFO: renamed from: a */
    public static final C12464re f31842a = new C12464re();

    /* JADX INFO: renamed from: c */
    private static EnumC12446qe f31844c = EnumC12446qe.NOT_INIT;

    private C12464re() {
    }

    /* JADX INFO: renamed from: a */
    public final synchronized EnumC12446qe m33248a() {
        return f31844c;
    }

    /* JADX INFO: renamed from: b */
    public final EnumC12446qe m33251b() {
        Boolean bool = f31843b;
        if (bool == null ? true : Intrinsics.areEqual(bool, Boolean.FALSE)) {
            return EnumC12446qe.NOT_INIT;
        }
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            return f31844c;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m33249a(EnumC12446qe enumC12446qe) {
        Intrinsics.checkNotNullParameter(enumC12446qe, "<set-?>");
        f31844c = enumC12446qe;
    }

    /* JADX INFO: renamed from: a */
    public final void m33250a(boolean z) {
        f31843b = Boolean.valueOf(z);
    }
}

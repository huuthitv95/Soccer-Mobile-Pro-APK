package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Ze */
/* JADX INFO: loaded from: classes6.dex */
public final class C11789Ze implements InterfaceC11437Fb<AbstractC11687Te, C12574w> {
    @Override // com.ironsource.InterfaceC11437Fb
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C12574w mo25577a(AbstractC11687Te input) {
        String strM26793h;
        String strM26794i;
        String strM26792g;
        EnumC11630Q7 enumC11630Q7M26790e;
        String strM26788c;
        Intrinsics.checkNotNullParameter(input, "input");
        EnumC12101af enumC12101afMo27536b = input.mo27536b();
        C11605P c11605pM27534a = input.m27534a();
        if (c11605pM27534a == null || (strM26793h = c11605pM27534a.m26793h()) == null) {
            strM26793h = "0";
        }
        C11605P c11605pM27534a2 = input.m27534a();
        if (c11605pM27534a2 == null || (strM26794i = c11605pM27534a2.m26794i()) == null) {
            strM26794i = "0";
        }
        C11605P c11605pM27534a3 = input.m27534a();
        if (c11605pM27534a3 == null || (strM26792g = c11605pM27534a3.m26792g()) == null) {
            strM26792g = "0";
        }
        C11605P c11605pM27534a4 = input.m27534a();
        if (c11605pM27534a4 == null || (enumC11630Q7M26790e = c11605pM27534a4.m26790e()) == null) {
            enumC11630Q7M26790e = EnumC11630Q7.UnknownProvider;
        }
        C11605P c11605pM27534a5 = input.m27534a();
        return new C12574w(enumC12101afMo27536b, strM26793h, strM26794i, strM26792g, enumC11630Q7M26790e, (c11605pM27534a5 == null || (strM26788c = c11605pM27534a5.m26788c()) == null) ? "0" : strM26788c);
    }
}

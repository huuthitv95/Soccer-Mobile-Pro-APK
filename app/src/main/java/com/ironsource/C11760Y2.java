package com.ironsource;

import com.ironsource.mediationsdk.ISBannerSize;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Y2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11760Y2 extends C12269jd {

    /* JADX INFO: renamed from: b */
    private final C12414p0 f26568b;

    /* JADX INFO: renamed from: c */
    private final ISBannerSize f26569c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11760Y2(C12414p0 adTools, ISBannerSize size, String placement) {
        super(placement);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.f26568b = adTools;
        this.f26569c = size;
    }

    @Override // com.ironsource.C12269jd, com.ironsource.InterfaceC11408E0
    /* JADX INFO: renamed from: a */
    public Map<String, Object> mo25594a(EnumC11372C0 enumC11372C0) {
        Map<String, Object> mutableMap = MapsKt.toMutableMap(super.mo25594a(enumC11372C0));
        this.f26568b.m33038a(mutableMap, this.f26569c);
        return mutableMap;
    }
}

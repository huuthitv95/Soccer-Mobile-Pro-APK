package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Xb */
/* JADX INFO: loaded from: classes6.dex */
public final class C11752Xb extends C12220h0 {
    public /* synthetic */ C11752Xb(UUID uuid, String str, C12135cd c12135cd, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, (i & 4) != 0 ? null : c12135cd);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11752Xb(UUID adId, String adUnitId, C12135cd c12135cd) {
        super(IronSource.EnumC12328a.NATIVE_AD, adId, adUnitId, c12135cd, null, null, 48, null);
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
    }

    public C11752Xb() {
        this(C12546u7.f32555a.m33891a(), "", null, 4, null);
    }
}

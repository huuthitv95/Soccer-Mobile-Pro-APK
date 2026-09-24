package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C12377n extends AbstractC11395D5 {

    /* JADX INFO: renamed from: a */
    private final IronSource.EnumC12328a f31511a;

    /* JADX INFO: renamed from: b */
    private final UUID f31512b;

    /* JADX INFO: renamed from: c */
    private final String f31513c;

    public C12377n(IronSource.EnumC12328a adFormat, UUID adId, String adUnitId) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.f31511a = adFormat;
        this.f31512b = adId;
        this.f31513c = adUnitId;
    }

    @Override // com.ironsource.InterfaceC11408E0
    /* JADX INFO: renamed from: a */
    public Map<String, Object> mo25594a(EnumC11372C0 enumC11372C0) {
        return m25605a(new C12220h0(this.f31511a, this.f31512b, this.f31513c, null, null, null, 56, null));
    }
}

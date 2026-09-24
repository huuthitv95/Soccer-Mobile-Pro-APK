package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.ironsource.I */
/* JADX INFO: loaded from: classes6.dex */
public final class C11479I {

    /* JADX INFO: renamed from: a */
    private final AbstractC12593x0 f24448a;

    /* JADX INFO: renamed from: b */
    private final NetworkSettings f24449b;

    /* JADX INFO: renamed from: c */
    private final Lazy f24450c;

    /* JADX INFO: renamed from: com.ironsource.I$a */
    static final class a extends Lambda implements Function0<BaseAdAdapter<?, ?>> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C11707V0 f24451a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C11479I f24452b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C11707V0 c11707v0, C11479I c11479i) {
            super(0);
            this.f24451a = c11707v0;
            this.f24452b = c11479i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseAdAdapter<?, ?> invoke() {
            return this.f24451a.m27633a(this.f24452b.m26044e(), this.f24452b.m26040a(), this.f24452b.m26043d());
        }
    }

    public C11479I(C11707V0 adTools, AbstractC12593x0 adUnitData, NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        this.f24448a = adUnitData;
        this.f24449b = providerSettings;
        this.f24450c = LazyKt.lazy(new a(adTools, this));
    }

    /* JADX INFO: renamed from: a */
    public final IronSource.EnumC12328a m26040a() {
        return this.f24448a.mo26467b().m31567a();
    }

    /* JADX INFO: renamed from: b */
    public final BaseAdAdapter<?, ?> m26041b() {
        return (BaseAdAdapter) this.f24450c.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final String m26042c() {
        String providerName = this.f24449b.getProviderName();
        Intrinsics.checkNotNullExpressionValue(providerName, "providerSettings.providerName");
        return providerName;
    }

    /* JADX INFO: renamed from: d */
    public final UUID m26043d() {
        return this.f24448a.mo26467b().m31569b();
    }

    /* JADX INFO: renamed from: e */
    public final NetworkSettings m26044e() {
        return this.f24449b;
    }
}

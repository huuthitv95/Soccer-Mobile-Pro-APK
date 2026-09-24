package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ua */
/* JADX INFO: loaded from: classes3.dex */
public final class C4091ua extends AbstractC3738ei {

    /* JADX INFO: renamed from: m */
    public static final a f16481m = new a(null);

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ua$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4091ua(InterfaceC3807hi name, String message, String adType, String location, Mediation mediation, C4076th trackAd) {
        super(name, message, adType, location, mediation, AbstractC3738ei.b.INFO, trackAd, false, false, 0L, 0.0f, AbstractC3738ei.a.LOW, 1920, null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(trackAd, "trackAd");
        if (m19579n()) {
            m17572a(AbstractC3738ei.a.HIGH);
            m17574a(true);
        }
    }

    public /* synthetic */ C4091ua(InterfaceC3807hi interfaceC3807hi, String str, String str2, String str3, Mediation mediation, C4076th c4076th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC3807hi, str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : mediation, (i & 32) != 0 ? new C4076th(null, null, null, null, null, null, null, null, 255, null) : c4076th);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m19579n() {
        InterfaceC3807hi interfaceC3807hiM17580f = m17580f();
        return interfaceC3807hiM17580f == InterfaceC3807hi.a.FINISH_SUCCESS || interfaceC3807hiM17580f == InterfaceC3807hi.a.FINISH_FAILURE || interfaceC3807hiM17580f == InterfaceC3807hi.i.FINISH_SUCCESS || interfaceC3807hiM17580f == InterfaceC3807hi.i.FINISH_FAILURE;
    }
}

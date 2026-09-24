package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.o5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3954o5 extends AbstractC3738ei {

    /* JADX INFO: renamed from: m */
    public static final a f15633m = new a(null);

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.o5$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C3954o5 m18876a(InterfaceC3807hi name, String message) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(message, "message");
            return new C3954o5(name, message, null, null, null, null, 60, null);
        }

        /* JADX INFO: renamed from: a */
        public final C3954o5 m18877a(InterfaceC3807hi name, String message, String adType, String location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(adType, "adType");
            Intrinsics.checkNotNullParameter(location, "location");
            return new C3954o5(name, message, adType, location, null, null, 48, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3954o5(InterfaceC3807hi name, String message, String adType, String location, Mediation mediation, C4076th trackAd) {
        super(name, message, adType, location, mediation, AbstractC3738ei.b.CRITICAL, trackAd, false, false, 0L, 0.0f, AbstractC3738ei.a.HIGH, 1920, null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(trackAd, "trackAd");
    }

    public /* synthetic */ C3954o5(InterfaceC3807hi interfaceC3807hi, String str, String str2, String str3, Mediation mediation, C4076th c4076th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC3807hi, str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : mediation, (i & 32) != 0 ? new C4076th(null, null, null, null, null, null, null, null, 255, null) : c4076th);
    }

    /* JADX INFO: renamed from: a */
    public static final C3954o5 m18874a(InterfaceC3807hi interfaceC3807hi, String str) {
        return f15633m.m18876a(interfaceC3807hi, str);
    }

    /* JADX INFO: renamed from: a */
    public static final C3954o5 m18875a(InterfaceC3807hi interfaceC3807hi, String str, String str2, String str3) {
        return f15633m.m18877a(interfaceC3807hi, str, str2, str3);
    }
}

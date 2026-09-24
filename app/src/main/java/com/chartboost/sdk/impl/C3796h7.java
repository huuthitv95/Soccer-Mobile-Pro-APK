package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.h7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3796h7 extends AbstractC3738ei {

    /* JADX INFO: renamed from: m */
    public static final a f14386m = new a(null);

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.h7$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C3796h7 m17869a(InterfaceC3807hi name, String message) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(message, "message");
            return new C3796h7(name, message, null, null, null, 28, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3796h7(InterfaceC3807hi name, String message, String adType, String location, Mediation mediation) {
        super(name, message, adType, location, mediation, AbstractC3738ei.b.ERROR, null, false, false, 0L, 0.0f, AbstractC3738ei.a.HIGH, 1984, null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(location, "location");
    }

    public /* synthetic */ C3796h7(InterfaceC3807hi interfaceC3807hi, String str, String str2, String str3, Mediation mediation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC3807hi, str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : mediation);
    }

    /* JADX INFO: renamed from: a */
    public static final C3796h7 m17868a(InterfaceC3807hi interfaceC3807hi, String str) {
        return f14386m.m17869a(interfaceC3807hi, str);
    }
}

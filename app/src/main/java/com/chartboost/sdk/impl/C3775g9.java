package com.chartboost.sdk.impl;

import android.content.Context;
import android.os.Build;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.g9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3775g9 {

    /* JADX INFO: renamed from: a */
    public final C4155x8 f14299a;

    /* JADX INFO: renamed from: b */
    public final C3790h1 f14300b;

    /* JADX INFO: renamed from: c */
    public final String f14301c;

    public C3775g9(C4155x8 googleAdvertisingId, C3790h1 amazonAdvertisingId, String manufacturer) {
        Intrinsics.checkNotNullParameter(googleAdvertisingId, "googleAdvertisingId");
        Intrinsics.checkNotNullParameter(amazonAdvertisingId, "amazonAdvertisingId");
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        this.f14299a = googleAdvertisingId;
        this.f14300b = amazonAdvertisingId;
        this.f14301c = manufacturer;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C3775g9(C4155x8 c4155x8, C3790h1 c3790h1, String MANUFACTURER, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            MANUFACTURER = Build.MANUFACTURER;
            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        }
        this(c4155x8, c3790h1, MANUFACTURER);
    }

    /* JADX INFO: renamed from: a */
    public final C3744f1 m17791a() {
        try {
            return m17793b() ? this.f14300b.m17827b() : this.f14299a.m19931b();
        } catch (Exception e) {
            C4048sb.m19410b("getAdvertisingId error", e);
            return new C3744f1(EnumC3922mi.TRACKING_UNKNOWN, "");
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m17792a(Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        String strM18489a = AbstractC3887l6.m18489a(context, z);
        Intrinsics.checkNotNullExpressionValue(strM18489a, "getUniqueId(...)");
        return strM18489a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m17793b() {
        return StringsKt.equals("Amazon", this.f14301c, true);
    }
}

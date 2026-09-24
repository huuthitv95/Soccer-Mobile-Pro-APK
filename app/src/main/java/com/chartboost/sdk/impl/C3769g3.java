package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.g3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3769g3 {

    /* JADX INFO: renamed from: a */
    public final Context f14260a;

    public C3769g3(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f14260a = context;
    }

    /* JADX INFO: renamed from: a */
    public final int m17753a() {
        return AbstractC3771g5.m17767f(this.f14260a);
    }

    /* JADX INFO: renamed from: b */
    public final String m17754b() {
        return AbstractC3771g5.m17768g(this.f14260a).m19427b();
    }

    /* JADX INFO: renamed from: c */
    public final EnumC3748f5 m17755c() {
        EnumC3748f5 enumC3748f5;
        Context context = this.f14260a;
        if (!AbstractC3771g5.m17765d(context)) {
            enumC3748f5 = EnumC3748f5.CONNECTION_ERROR;
        } else if (AbstractC3771g5.m17766e(context)) {
            enumC3748f5 = EnumC3748f5.CONNECTION_WIFI;
        } else {
            enumC3748f5 = AbstractC3771g5.m17764c(context) ? EnumC3748f5.CONNECTION_MOBILE : EnumC3748f5.CONNECTION_UNKNOWN;
        }
        C4048sb.m19408a("NETWORK TYPE: " + enumC3748f5, (Throwable) null, 2, (Object) null);
        return enumC3748f5;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m17756d() {
        return m17755c() == EnumC3748f5.CONNECTION_MOBILE;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m17757e() {
        return AbstractC3771g5.m17765d(this.f14260a);
    }

    /* JADX INFO: renamed from: f */
    public final EnumC4050sd m17758f() {
        return AbstractC3771g5.m17768g(this.f14260a);
    }
}

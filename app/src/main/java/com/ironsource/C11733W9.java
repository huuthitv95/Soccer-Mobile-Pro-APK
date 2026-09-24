package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.W9 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11733W9 {

    /* JADX INFO: renamed from: a */
    public static final C11733W9 f26101a = new C11733W9();

    private C11733W9() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final <T> T m27831a(T t, T t2) {
        return t == null ? t2 : t;
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final boolean m27832a(Object obj) {
        return m27835a(obj, null, false, 6, null);
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final boolean m27833a(Object obj, String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return m27835a(obj, errorMessage, false, 4, null);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m27835a(Object obj, String str, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = "reference is null";
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return m27834a(obj, str, z);
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final boolean m27834a(Object obj, String errorMessage, boolean z) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        if (obj != null) {
            return true;
        }
        if (z) {
            throw new NullPointerException(errorMessage);
        }
        if (!z) {
            IronLog.API.error(errorMessage);
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}

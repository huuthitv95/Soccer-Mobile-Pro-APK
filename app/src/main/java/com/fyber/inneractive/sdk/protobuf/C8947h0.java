package com.fyber.inneractive.sdk.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.h0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8947h0 {

    /* JADX INFO: renamed from: b */
    public static volatile C8947h0 f21026b;

    /* JADX INFO: renamed from: c */
    public static final C8947h0 f21027c = new C8947h0();

    /* JADX INFO: renamed from: a */
    public final Map f21028a = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: a */
    public static C8947h0 m21617a() {
        C8947h0 c8947h0;
        C8947h0 c8947h1 = f21026b;
        if (c8947h1 != null) {
            return c8947h1;
        }
        synchronized (C8947h0.class) {
            c8947h0 = f21026b;
            if (c8947h0 == null) {
                Class cls = AbstractC8935f0.f21016a;
                C8947h0 c8947h2 = null;
                if (cls != null) {
                    try {
                        c8947h2 = (C8947h0) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                    } catch (Exception unused) {
                    }
                }
                c8947h0 = c8947h2 != null ? c8947h2 : f21027c;
                f21026b = c8947h0;
            }
        }
        return c8947h0;
    }

    /* JADX INFO: renamed from: a */
    public final C9037x0 m21618a(int i, InterfaceC8925d2 interfaceC8925d2) {
        return (C9037x0) this.f21028a.get(new C8941g0(i, interfaceC8925d2));
    }
}

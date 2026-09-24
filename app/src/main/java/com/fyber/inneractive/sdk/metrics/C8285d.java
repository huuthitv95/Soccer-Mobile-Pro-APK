package com.fyber.inneractive.sdk.metrics;

import java.util.HashMap;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.metrics.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C8285d {

    /* JADX INFO: renamed from: d */
    public static final C8285d f18476d = new C8285d();

    /* JADX INFO: renamed from: a */
    public final HashMap f18477a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f18478b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final C8287f f18479c = new C8287f();

    /* JADX INFO: renamed from: a */
    public final InterfaceC8288g m20685a(String str) {
        try {
            if (str == null) {
                return this.f18479c;
            }
            InterfaceC8288g interfaceC8288g = (InterfaceC8288g) this.f18477a.get(str);
            if (interfaceC8288g != null) {
                return interfaceC8288g;
            }
            C8286e c8286e = new C8286e();
            this.f18477a.put(str, c8286e);
            return c8286e;
        } catch (Exception unused) {
            return this.f18479c;
        }
    }

    /* JADX INFO: renamed from: b */
    public final C8290i m20686b(String str) {
        C8290i c8290i = (C8290i) this.f18478b.get(str);
        if (c8290i == null) {
            c8290i = new C8290i();
        }
        this.f18478b.put(str, c8290i);
        return c8290i;
    }
}

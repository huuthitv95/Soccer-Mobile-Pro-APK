package com.facebook.ads.redexgen.core;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.RY */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5970RY implements InvocationHandler {
    public final /* synthetic */ ClassLoader A00;

    public C5970RY(ClassLoader classLoader) {
        this.A00 = classLoader;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        return C5971RZ.A00(this.A00, method);
    }
}

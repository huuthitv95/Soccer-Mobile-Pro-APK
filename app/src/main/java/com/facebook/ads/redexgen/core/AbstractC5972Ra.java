package com.facebook.ads.redexgen.core;

import java.lang.reflect.Proxy;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ra */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC5972Ra {
    public static <T> T A00(T impl, Class<T> clazz) {
        ClassLoader classLoader = impl.getClass().getClassLoader();
        return clazz.cast(Proxy.newProxyInstance(classLoader, new Class[]{clazz}, new C5971RZ(impl, classLoader)));
    }
}

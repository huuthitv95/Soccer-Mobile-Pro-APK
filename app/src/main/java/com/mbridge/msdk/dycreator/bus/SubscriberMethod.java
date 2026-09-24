package com.mbridge.msdk.dycreator.bus;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes5.dex */
final class SubscriberMethod {

    /* JADX INFO: renamed from: a */
    final Method f35265a;

    /* JADX INFO: renamed from: b */
    final ThreadMode f35266b;

    /* JADX INFO: renamed from: c */
    final Class<?> f35267c;

    /* JADX INFO: renamed from: d */
    String f35268d;

    SubscriberMethod(Method method, ThreadMode threadMode, Class<?> cls) {
        this.f35265a = method;
        this.f35266b = threadMode;
        this.f35267c = cls;
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m36345a() {
        if (this.f35268d == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f35265a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f35265a.getName());
            sb.append('(');
            sb.append(this.f35267c.getName());
            this.f35268d = sb.toString();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SubscriberMethod)) {
            return false;
        }
        m36345a();
        return this.f35268d.equals(((SubscriberMethod) obj).f35268d);
    }

    public int hashCode() {
        return this.f35265a.hashCode();
    }
}

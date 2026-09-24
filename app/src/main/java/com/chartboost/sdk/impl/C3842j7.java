package com.chartboost.sdk.impl;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.j7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3842j7 {

    /* JADX INFO: renamed from: a */
    public int f14878a;

    /* JADX INFO: renamed from: b */
    public int f14879b;

    /* JADX INFO: renamed from: c */
    public final Map f14880c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    public final Map f14881d = new LinkedHashMap();

    /* JADX INFO: renamed from: e */
    public final Set f14882e = new LinkedHashSet();

    public C3842j7(int i, int i2) {
        this.f14878a = i;
        this.f14879b = i2;
    }

    /* JADX INFO: renamed from: a */
    public final long m18192a(AbstractC3738ei abstractC3738ei) {
        Long l = (Long) this.f14880c.get(abstractC3738ei.m17580f());
        return l != null ? l.longValue() : abstractC3738ei.m17583i();
    }

    /* JADX INFO: renamed from: b */
    public final long m18193b(AbstractC3738ei abstractC3738ei) {
        return (abstractC3738ei.m17583i() - m18192a(abstractC3738ei)) / ((long) 1000);
    }

    /* JADX INFO: renamed from: c */
    public final int m18194c(AbstractC3738ei abstractC3738ei) {
        Integer num = (Integer) this.f14881d.get(abstractC3738ei.m17580f());
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m18195d(AbstractC3738ei abstractC3738ei) {
        if (this.f14880c.containsKey(abstractC3738ei.m17580f())) {
            return;
        }
        this.f14880c.put(abstractC3738ei.m17580f(), Long.valueOf(abstractC3738ei.m17583i()));
    }

    /* JADX INFO: renamed from: e */
    public final synchronized AbstractC3738ei m18196e(AbstractC3738ei abstractC3738ei) {
        if (abstractC3738ei == null) {
            return null;
        }
        m18195d(abstractC3738ei);
        if (m18193b(abstractC3738ei) > this.f14879b) {
            m18198g(abstractC3738ei);
        }
        if (this.f14882e.contains(abstractC3738ei.m17580f())) {
            return null;
        }
        if (m18200i(abstractC3738ei) <= this.f14878a) {
            return abstractC3738ei;
        }
        return m18197f(abstractC3738ei);
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC3738ei m18197f(AbstractC3738ei abstractC3738ei) {
        C4091ua c4091ua = new C4091ua(InterfaceC3807hi.f.TOO_MANY_EVENTS, abstractC3738ei.m17580f().getValue(), null, null, null, null, 60, null);
        this.f14882e.add(abstractC3738ei.m17580f());
        return c4091ua;
    }

    /* JADX INFO: renamed from: g */
    public final void m18198g(AbstractC3738ei abstractC3738ei) {
        m18199h(abstractC3738ei);
        this.f14881d.remove(abstractC3738ei.m17580f());
    }

    /* JADX INFO: renamed from: h */
    public final void m18199h(AbstractC3738ei abstractC3738ei) {
        this.f14880c.put(abstractC3738ei.m17580f(), Long.valueOf(abstractC3738ei.m17583i()));
    }

    /* JADX INFO: renamed from: i */
    public final int m18200i(AbstractC3738ei abstractC3738ei) {
        int iM18194c = m18194c(abstractC3738ei) + 1;
        this.f14881d.put(abstractC3738ei.m17580f(), Integer.valueOf(iM18194c));
        return iM18194c;
    }
}

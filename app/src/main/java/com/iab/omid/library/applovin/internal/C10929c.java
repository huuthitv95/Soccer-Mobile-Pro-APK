package com.iab.omid.library.applovin.internal;

import com.iab.omid.library.applovin.adsession.C10919a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: renamed from: com.iab.omid.library.applovin.internal.c */
/* JADX INFO: loaded from: classes6.dex */
public class C10929c {

    /* JADX INFO: renamed from: c */
    private static C10929c f22706c = new C10929c();

    /* JADX INFO: renamed from: a */
    private final ArrayList<C10919a> f22707a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    private final ArrayList<C10919a> f22708b = new ArrayList<>();

    private C10929c() {
    }

    /* JADX INFO: renamed from: c */
    public static C10929c m23224c() {
        return f22706c;
    }

    /* JADX INFO: renamed from: a */
    public Collection<C10919a> m23225a() {
        return Collections.unmodifiableCollection(this.f22708b);
    }

    /* JADX INFO: renamed from: a */
    public void m23226a(C10919a c10919a) {
        this.f22707a.add(c10919a);
    }

    /* JADX INFO: renamed from: b */
    public Collection<C10919a> m23227b() {
        return Collections.unmodifiableCollection(this.f22707a);
    }

    /* JADX INFO: renamed from: b */
    public void m23228b(C10919a c10919a) {
        boolean zM23230d = m23230d();
        this.f22707a.remove(c10919a);
        this.f22708b.remove(c10919a);
        if (!zM23230d || m23230d()) {
            return;
        }
        C10935i.m23272c().m23276e();
    }

    /* JADX INFO: renamed from: c */
    public void m23229c(C10919a c10919a) {
        boolean zM23230d = m23230d();
        this.f22708b.add(c10919a);
        if (zM23230d) {
            return;
        }
        C10935i.m23272c().m23275d();
    }

    /* JADX INFO: renamed from: d */
    public boolean m23230d() {
        return this.f22708b.size() > 0;
    }
}

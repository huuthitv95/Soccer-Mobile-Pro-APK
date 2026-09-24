package com.iab.omid.library.vungle.internal;

import com.iab.omid.library.vungle.adsession.C11271a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.internal.c */
/* JADX INFO: loaded from: classes6.dex */
public class C11292c {

    /* JADX INFO: renamed from: c */
    private static C11292c f23669c = new C11292c();

    /* JADX INFO: renamed from: a */
    private final ArrayList<C11271a> f23670a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    private final ArrayList<C11271a> f23671b = new ArrayList<>();

    private C11292c() {
    }

    /* JADX INFO: renamed from: c */
    public static C11292c m25003c() {
        return f23669c;
    }

    /* JADX INFO: renamed from: a */
    public Collection<C11271a> m25004a() {
        return Collections.unmodifiableCollection(this.f23671b);
    }

    /* JADX INFO: renamed from: a */
    public void m25005a(C11271a c11271a) {
        this.f23670a.add(c11271a);
    }

    /* JADX INFO: renamed from: b */
    public Collection<C11271a> m25006b() {
        return Collections.unmodifiableCollection(this.f23670a);
    }

    /* JADX INFO: renamed from: b */
    public void m25007b(C11271a c11271a) {
        boolean zM25009d = m25009d();
        this.f23670a.remove(c11271a);
        this.f23671b.remove(c11271a);
        if (!zM25009d || m25009d()) {
            return;
        }
        C11298i.m25052c().m25056e();
    }

    /* JADX INFO: renamed from: c */
    public void m25008c(C11271a c11271a) {
        boolean zM25009d = m25009d();
        this.f23671b.add(c11271a);
        if (zM25009d) {
            return;
        }
        C11298i.m25052c().m25055d();
    }

    /* JADX INFO: renamed from: d */
    public boolean m25009d() {
        return this.f23671b.size() > 0;
    }
}

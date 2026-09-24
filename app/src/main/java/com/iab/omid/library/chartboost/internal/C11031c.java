package com.iab.omid.library.chartboost.internal;

import com.iab.omid.library.chartboost.adsession.C11021a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: renamed from: com.iab.omid.library.chartboost.internal.c */
/* JADX INFO: loaded from: classes6.dex */
public class C11031c {

    /* JADX INFO: renamed from: c */
    private static C11031c f22976c = new C11031c();

    /* JADX INFO: renamed from: a */
    private final ArrayList<C11021a> f22977a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    private final ArrayList<C11021a> f22978b = new ArrayList<>();

    private C11031c() {
    }

    /* JADX INFO: renamed from: c */
    public static C11031c m23724c() {
        return f22976c;
    }

    /* JADX INFO: renamed from: a */
    public Collection<C11021a> m23725a() {
        return Collections.unmodifiableCollection(this.f22978b);
    }

    /* JADX INFO: renamed from: a */
    public void m23726a(C11021a c11021a) {
        this.f22977a.add(c11021a);
    }

    /* JADX INFO: renamed from: b */
    public Collection<C11021a> m23727b() {
        return Collections.unmodifiableCollection(this.f22977a);
    }

    /* JADX INFO: renamed from: b */
    public void m23728b(C11021a c11021a) {
        boolean zM23730d = m23730d();
        this.f22977a.remove(c11021a);
        this.f22978b.remove(c11021a);
        if (!zM23730d || m23730d()) {
            return;
        }
        C11037i.m23772c().m23776e();
    }

    /* JADX INFO: renamed from: c */
    public void m23729c(C11021a c11021a) {
        boolean zM23730d = m23730d();
        this.f22978b.add(c11021a);
        if (zM23730d) {
            return;
        }
        C11037i.m23772c().m23775d();
    }

    /* JADX INFO: renamed from: d */
    public boolean m23730d() {
        return this.f22978b.size() > 0;
    }
}

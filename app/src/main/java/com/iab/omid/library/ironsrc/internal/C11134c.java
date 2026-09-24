package com.iab.omid.library.ironsrc.internal;

import com.iab.omid.library.ironsrc.adsession.C11124a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: renamed from: com.iab.omid.library.ironsrc.internal.c */
/* JADX INFO: loaded from: classes6.dex */
public class C11134c {

    /* JADX INFO: renamed from: c */
    private static C11134c f23246c = new C11134c();

    /* JADX INFO: renamed from: a */
    private final ArrayList<C11124a> f23247a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    private final ArrayList<C11124a> f23248b = new ArrayList<>();

    private C11134c() {
    }

    /* JADX INFO: renamed from: c */
    public static C11134c m24234c() {
        return f23246c;
    }

    /* JADX INFO: renamed from: a */
    public Collection<C11124a> m24235a() {
        return Collections.unmodifiableCollection(this.f23248b);
    }

    /* JADX INFO: renamed from: a */
    public void m24236a(C11124a c11124a) {
        this.f23247a.add(c11124a);
    }

    /* JADX INFO: renamed from: b */
    public Collection<C11124a> m24237b() {
        return Collections.unmodifiableCollection(this.f23247a);
    }

    /* JADX INFO: renamed from: b */
    public void m24238b(C11124a c11124a) {
        boolean zM24240d = m24240d();
        this.f23247a.remove(c11124a);
        this.f23248b.remove(c11124a);
        if (!zM24240d || m24240d()) {
            return;
        }
        C11140i.m24282c().m24286e();
    }

    /* JADX INFO: renamed from: c */
    public void m24239c(C11124a c11124a) {
        boolean zM24240d = m24240d();
        this.f23248b.add(c11124a);
        if (zM24240d) {
            return;
        }
        C11140i.m24282c().m24285d();
    }

    /* JADX INFO: renamed from: d */
    public boolean m24240d() {
        return this.f23248b.size() > 0;
    }
}

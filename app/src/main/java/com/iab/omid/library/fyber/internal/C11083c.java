package com.iab.omid.library.fyber.internal;

import com.iab.omid.library.fyber.adsession.C11073a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: renamed from: com.iab.omid.library.fyber.internal.c */
/* JADX INFO: loaded from: classes6.dex */
public class C11083c {

    /* JADX INFO: renamed from: c */
    private static C11083c f23111c = new C11083c();

    /* JADX INFO: renamed from: a */
    private final ArrayList<C11073a> f23112a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    private final ArrayList<C11073a> f23113b = new ArrayList<>();

    private C11083c() {
    }

    /* JADX INFO: renamed from: c */
    public static C11083c m23981c() {
        return f23111c;
    }

    /* JADX INFO: renamed from: a */
    public Collection<C11073a> m23982a() {
        return Collections.unmodifiableCollection(this.f23113b);
    }

    /* JADX INFO: renamed from: a */
    public void m23983a(C11073a c11073a) {
        this.f23112a.add(c11073a);
    }

    /* JADX INFO: renamed from: b */
    public Collection<C11073a> m23984b() {
        return Collections.unmodifiableCollection(this.f23112a);
    }

    /* JADX INFO: renamed from: b */
    public void m23985b(C11073a c11073a) {
        boolean zM23987d = m23987d();
        this.f23112a.remove(c11073a);
        this.f23113b.remove(c11073a);
        if (!zM23987d || m23987d()) {
            return;
        }
        C11089i.m24029c().m24033e();
    }

    /* JADX INFO: renamed from: c */
    public void m23986c(C11073a c11073a) {
        boolean zM23987d = m23987d();
        this.f23113b.add(c11073a);
        if (zM23987d) {
            return;
        }
        C11089i.m24029c().m24032d();
    }

    /* JADX INFO: renamed from: d */
    public boolean m23987d() {
        return this.f23113b.size() > 0;
    }
}

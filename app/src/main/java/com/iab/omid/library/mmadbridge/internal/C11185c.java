package com.iab.omid.library.mmadbridge.internal;

import com.iab.omid.library.mmadbridge.adsession.C11175a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.internal.c */
/* JADX INFO: loaded from: classes6.dex */
public class C11185c {

    /* JADX INFO: renamed from: c */
    private static C11185c f23381c = new C11185c();

    /* JADX INFO: renamed from: a */
    private final ArrayList<C11175a> f23382a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    private final ArrayList<C11175a> f23383b = new ArrayList<>();

    private C11185c() {
    }

    /* JADX INFO: renamed from: c */
    public static C11185c m24487c() {
        return f23381c;
    }

    /* JADX INFO: renamed from: a */
    public Collection<C11175a> m24488a() {
        return Collections.unmodifiableCollection(this.f23383b);
    }

    /* JADX INFO: renamed from: a */
    public void m24489a(C11175a c11175a) {
        this.f23382a.add(c11175a);
    }

    /* JADX INFO: renamed from: b */
    public Collection<C11175a> m24490b() {
        return Collections.unmodifiableCollection(this.f23382a);
    }

    /* JADX INFO: renamed from: b */
    public void m24491b(C11175a c11175a) {
        boolean zM24493d = m24493d();
        this.f23382a.remove(c11175a);
        this.f23383b.remove(c11175a);
        if (!zM24493d || m24493d()) {
            return;
        }
        C11191i.m24535c().m24539e();
    }

    /* JADX INFO: renamed from: c */
    public void m24492c(C11175a c11175a) {
        boolean zM24493d = m24493d();
        this.f23383b.add(c11175a);
        if (zM24493d) {
            return;
        }
        C11191i.m24535c().m24538d();
    }

    /* JADX INFO: renamed from: d */
    public boolean m24493d() {
        return this.f23383b.size() > 0;
    }
}

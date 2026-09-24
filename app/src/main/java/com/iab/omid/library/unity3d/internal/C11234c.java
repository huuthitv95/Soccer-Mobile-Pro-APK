package com.iab.omid.library.unity3d.internal;

import com.iab.omid.library.unity3d.adsession.C11224a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: renamed from: com.iab.omid.library.unity3d.internal.c */
/* JADX INFO: loaded from: classes6.dex */
public class C11234c {

    /* JADX INFO: renamed from: c */
    private static C11234c f23517c = new C11234c();

    /* JADX INFO: renamed from: a */
    private final ArrayList<C11224a> f23518a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    private final ArrayList<C11224a> f23519b = new ArrayList<>();

    private C11234c() {
    }

    /* JADX INFO: renamed from: c */
    public static C11234c m24743c() {
        return f23517c;
    }

    /* JADX INFO: renamed from: a */
    public Collection<C11224a> m24744a() {
        return Collections.unmodifiableCollection(this.f23519b);
    }

    /* JADX INFO: renamed from: a */
    public void m24745a(C11224a c11224a) {
        this.f23518a.add(c11224a);
    }

    /* JADX INFO: renamed from: b */
    public Collection<C11224a> m24746b() {
        return Collections.unmodifiableCollection(this.f23518a);
    }

    /* JADX INFO: renamed from: b */
    public void m24747b(C11224a c11224a) {
        boolean zM24749d = m24749d();
        this.f23518a.remove(c11224a);
        this.f23519b.remove(c11224a);
        if (!zM24749d || m24749d()) {
            return;
        }
        C11239h.m24783c().m24787e();
    }

    /* JADX INFO: renamed from: c */
    public void m24748c(C11224a c11224a) {
        boolean zM24749d = m24749d();
        this.f23519b.add(c11224a);
        if (zM24749d) {
            return;
        }
        C11239h.m24783c().m24786d();
    }

    /* JADX INFO: renamed from: d */
    public boolean m24749d() {
        return this.f23519b.size() > 0;
    }
}

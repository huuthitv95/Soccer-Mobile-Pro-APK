package com.iab.omid.library.bytedance2.internal;

import com.iab.omid.library.bytedance2.adsession.C10970a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: renamed from: com.iab.omid.library.bytedance2.internal.c */
/* JADX INFO: loaded from: classes6.dex */
public class C10980c {

    /* JADX INFO: renamed from: c */
    private static C10980c f22841c = new C10980c();

    /* JADX INFO: renamed from: a */
    private final ArrayList<C10970a> f22842a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    private final ArrayList<C10970a> f22843b = new ArrayList<>();

    private C10980c() {
    }

    /* JADX INFO: renamed from: c */
    public static C10980c m23477c() {
        return f22841c;
    }

    /* JADX INFO: renamed from: a */
    public Collection<C10970a> m23478a() {
        return Collections.unmodifiableCollection(this.f22843b);
    }

    /* JADX INFO: renamed from: a */
    public void m23479a(C10970a c10970a) {
        this.f22842a.add(c10970a);
    }

    /* JADX INFO: renamed from: b */
    public Collection<C10970a> m23480b() {
        return Collections.unmodifiableCollection(this.f22842a);
    }

    /* JADX INFO: renamed from: b */
    public void m23481b(C10970a c10970a) {
        boolean zM23483d = m23483d();
        this.f22842a.remove(c10970a);
        this.f22843b.remove(c10970a);
        if (!zM23483d || m23483d()) {
            return;
        }
        C10986i.m23524c().m23528e();
    }

    /* JADX INFO: renamed from: c */
    public void m23482c(C10970a c10970a) {
        boolean zM23483d = m23483d();
        this.f22843b.add(c10970a);
        if (zM23483d) {
            return;
        }
        C10986i.m23524c().m23527d();
    }

    /* JADX INFO: renamed from: d */
    public boolean m23483d() {
        return this.f22843b.size() > 0;
    }
}

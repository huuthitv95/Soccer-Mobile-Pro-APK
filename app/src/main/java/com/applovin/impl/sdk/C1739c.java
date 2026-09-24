package com.applovin.impl.sdk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.applovin.impl.sdk.c */
/* JADX INFO: loaded from: classes3.dex */
public class C1739c implements C1744h.d {

    /* JADX INFO: renamed from: a */
    private final C1748l f2932a;

    /* JADX INFO: renamed from: b */
    private final Map f2933b = new HashMap();

    /* JADX INFO: renamed from: c */
    private final Object f2934c = new Object();

    /* JADX INFO: renamed from: d */
    private final List f2935d = new ArrayList();

    /* JADX INFO: renamed from: e */
    private final Object f2936e = new Object();

    /* JADX INFO: renamed from: f */
    private final Set f2937f = new HashSet();

    /* JADX INFO: renamed from: g */
    private final Set f2938g;

    /* JADX INFO: renamed from: h */
    private boolean f2939h;

    /* JADX INFO: renamed from: com.applovin.impl.sdk.c$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo4416a(List list);
    }

    public C1739c(C1748l c1748l) {
        HashSet hashSet = new HashSet();
        this.f2938g = hashSet;
        this.f2939h = false;
        this.f2932a = c1748l;
        hashSet.add(C1744h.c.LOADING);
        hashSet.add(C1744h.c.LOAD);
        hashSet.add(C1744h.c.SHOW);
        hashSet.add(C1744h.c.CLICK);
        hashSet.add(C1744h.c.SHOW_ERROR);
        hashSet.add(C1744h.c.DESTROY);
    }

    /* JADX INFO: renamed from: b */
    private List m4586b() {
        ArrayList arrayList;
        synchronized (this.f2936e) {
            arrayList = new ArrayList(this.f2935d);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    private void m4587b(C1744h.b bVar) {
        synchronized (this.f2934c) {
            try {
                if (bVar == null) {
                    return;
                }
                String strM4672b = bVar.m4672b();
                if (bVar.m4673c() == C1744h.c.DESTROY) {
                    this.f2933b.remove(strM4672b);
                } else {
                    if (this.f2933b.containsKey(strM4672b)) {
                        return;
                    }
                    this.f2933b.put(strM4672b, bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m4588c() {
        return this.f2937f.isEmpty() && this.f2935d.isEmpty();
    }

    /* JADX INFO: renamed from: d */
    private void m4589d() {
        List listM4590a = m4590a();
        Iterator it = m4586b().iterator();
        while (it.hasNext()) {
            ((a) it.next()).mo4416a(listM4590a);
        }
    }

    /* JADX INFO: renamed from: a */
    public List m4590a() {
        ArrayList arrayList;
        synchronized (this.f2934c) {
            arrayList = new ArrayList(this.f2933b.size());
            Iterator it = this.f2933b.values().iterator();
            while (it.hasNext()) {
                arrayList.add(((C1744h.b) it.next()).m4671a());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public void m4591a(a aVar) {
        synchronized (this.f2936e) {
            if (aVar != null) {
                if (!this.f2935d.contains(aVar)) {
                    this.f2935d.add(aVar);
                    if (!this.f2939h) {
                        this.f2932a.m4842m().m4667a(this, this.f2938g);
                        this.f2939h = true;
                    }
                }
            }
        }
    }

    @Override // com.applovin.impl.sdk.C1744h.d
    /* JADX INFO: renamed from: a */
    public void mo4592a(C1744h.b bVar) {
        m4587b(bVar);
        m4589d();
    }

    /* JADX INFO: renamed from: a */
    public void m4593a(Object obj) {
        synchronized (this.f2936e) {
            this.f2937f.add(obj);
            if (!this.f2939h) {
                this.f2932a.m4842m().m4667a(this, this.f2938g);
                this.f2939h = true;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m4594b(a aVar) {
        synchronized (this.f2936e) {
            this.f2935d.remove(aVar);
            if (this.f2939h && m4588c()) {
                this.f2932a.m4842m().m4666a(this);
                this.f2939h = false;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m4595b(Object obj) {
        synchronized (this.f2936e) {
            this.f2937f.remove(obj);
            if (this.f2939h && m4588c()) {
                this.f2932a.m4842m().m4666a(this);
                this.f2939h = false;
            }
        }
    }
}

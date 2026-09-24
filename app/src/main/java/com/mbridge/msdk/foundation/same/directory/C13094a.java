package com.mbridge.msdk.foundation.same.directory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.directory.a */
/* JADX INFO: compiled from: Directory.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13094a {

    /* JADX INFO: renamed from: a */
    private List<C13094a> f35905a;

    /* JADX INFO: renamed from: b */
    private String f35906b;

    /* JADX INFO: renamed from: c */
    private C13094a f35907c;

    /* JADX INFO: renamed from: d */
    private EnumC13096c f35908d;

    /* JADX INFO: renamed from: a */
    public void m37134a(EnumC13096c enumC13096c, String str) {
        C13094a c13094a = new C13094a();
        c13094a.m37133a(enumC13096c);
        c13094a.m37135a(str);
        m37132a(c13094a);
    }

    /* JADX INFO: renamed from: b */
    public String m37137b() {
        return this.f35906b;
    }

    /* JADX INFO: renamed from: c */
    public C13094a m37139c() {
        return this.f35907c;
    }

    /* JADX INFO: renamed from: d */
    public EnumC13096c m37140d() {
        return this.f35908d;
    }

    /* JADX INFO: renamed from: b */
    public void m37138b(C13094a c13094a) {
        this.f35907c = c13094a;
    }

    /* JADX INFO: renamed from: a */
    public void m37132a(C13094a c13094a) {
        if (this.f35905a == null) {
            this.f35905a = new ArrayList();
        }
        c13094a.m37138b(this);
        this.f35905a.add(c13094a);
    }

    /* JADX INFO: renamed from: a */
    public void m37136a(List<C13094a> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<C13094a> it = list.iterator();
        while (it.hasNext()) {
            m37132a(it.next());
        }
    }

    /* JADX INFO: renamed from: a */
    public List<C13094a> m37131a() {
        return this.f35905a;
    }

    /* JADX INFO: renamed from: a */
    public void m37135a(String str) {
        this.f35906b = str;
    }

    /* JADX INFO: renamed from: a */
    public void m37133a(EnumC13096c enumC13096c) {
        this.f35908d = enumC13096c;
    }
}

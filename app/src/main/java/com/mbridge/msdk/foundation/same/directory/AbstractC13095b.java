package com.mbridge.msdk.foundation.same.directory;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.directory.b */
/* JADX INFO: compiled from: DirectoryContext.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC13095b {

    /* JADX INFO: renamed from: a */
    protected C13094a f35909a;

    public AbstractC13095b(String str) {
        C13094a c13094a = new C13094a();
        c13094a.m37135a(str);
        c13094a.m37133a(EnumC13096c.AD_ROOT);
        List<C13094a> listMo37143b = mo37143b();
        if (listMo37143b != null && listMo37143b.size() > 0) {
            c13094a.m37136a(listMo37143b);
        }
        this.f35909a = c13094a;
    }

    /* JADX INFO: renamed from: a */
    protected C13094a m37142a(ArrayList<C13094a> arrayList, EnumC13096c enumC13096c, String str) {
        C13094a c13094a = new C13094a();
        c13094a.m37133a(enumC13096c);
        c13094a.m37135a(str);
        arrayList.add(c13094a);
        return c13094a;
    }

    /* JADX INFO: renamed from: b */
    protected abstract List<C13094a> mo37143b();

    /* JADX INFO: renamed from: a */
    public C13094a m37141a() {
        return this.f35909a;
    }
}

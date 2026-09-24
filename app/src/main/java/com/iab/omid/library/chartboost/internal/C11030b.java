package com.iab.omid.library.chartboost.internal;

import android.view.View;
import com.iab.omid.library.chartboost.adsession.C11021a;
import java.util.Iterator;

/* JADX INFO: renamed from: com.iab.omid.library.chartboost.internal.b */
/* JADX INFO: loaded from: classes6.dex */
public class C11030b extends C11032d {

    /* JADX INFO: renamed from: d */
    private static C11030b f22975d = new C11030b();

    private C11030b() {
    }

    /* JADX INFO: renamed from: g */
    public static C11030b m23721g() {
        return f22975d;
    }

    @Override // com.iab.omid.library.chartboost.internal.C11032d
    /* JADX INFO: renamed from: b */
    public void mo23722b(boolean z) {
        Iterator<C11021a> it = C11031c.m23724c().m23727b().iterator();
        while (it.hasNext()) {
            it.next().m23678d().m23805a(z);
        }
    }

    @Override // com.iab.omid.library.chartboost.internal.C11032d
    /* JADX INFO: renamed from: d */
    public boolean mo23723d() {
        Iterator<C11021a> it = C11031c.m23724c().m23725a().iterator();
        while (it.hasNext()) {
            View viewM23679e = it.next().m23679e();
            if (viewM23679e != null && viewM23679e.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}

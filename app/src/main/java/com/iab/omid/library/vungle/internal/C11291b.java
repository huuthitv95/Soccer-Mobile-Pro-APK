package com.iab.omid.library.vungle.internal;

import android.view.View;
import com.iab.omid.library.vungle.adsession.C11271a;
import java.util.Iterator;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.internal.b */
/* JADX INFO: loaded from: classes6.dex */
public class C11291b extends C11293d {

    /* JADX INFO: renamed from: d */
    private static C11291b f23668d = new C11291b();

    private C11291b() {
    }

    /* JADX INFO: renamed from: g */
    public static C11291b m25000g() {
        return f23668d;
    }

    @Override // com.iab.omid.library.vungle.internal.C11293d
    /* JADX INFO: renamed from: b */
    public void mo25001b(boolean z) {
        Iterator<C11271a> it = C11292c.m25003c().m25006b().iterator();
        while (it.hasNext()) {
            it.next().m24934d().m25095a(z);
        }
    }

    @Override // com.iab.omid.library.vungle.internal.C11293d
    /* JADX INFO: renamed from: d */
    public boolean mo25002d() {
        Iterator<C11271a> it = C11292c.m25003c().m25004a().iterator();
        while (it.hasNext()) {
            View viewM24935e = it.next().m24935e();
            if (viewM24935e != null && viewM24935e.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}

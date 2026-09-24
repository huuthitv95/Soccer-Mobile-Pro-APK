package com.iab.omid.library.mmadbridge.internal;

import android.view.View;
import com.iab.omid.library.mmadbridge.adsession.C11175a;
import java.util.Iterator;

/* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.internal.b */
/* JADX INFO: loaded from: classes6.dex */
public class C11184b extends C11186d {

    /* JADX INFO: renamed from: d */
    private static C11184b f23380d = new C11184b();

    private C11184b() {
    }

    /* JADX INFO: renamed from: g */
    public static C11184b m24484g() {
        return f23380d;
    }

    @Override // com.iab.omid.library.mmadbridge.internal.C11186d
    /* JADX INFO: renamed from: b */
    public void mo24485b(boolean z) {
        Iterator<C11175a> it = C11185c.m24487c().m24490b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().m24568a(z);
        }
    }

    @Override // com.iab.omid.library.mmadbridge.internal.C11186d
    /* JADX INFO: renamed from: d */
    public boolean mo24486d() {
        Iterator<C11175a> it = C11185c.m24487c().m24488a().iterator();
        while (it.hasNext()) {
            View viewM24446c = it.next().m24446c();
            if (viewM24446c != null && viewM24446c.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}

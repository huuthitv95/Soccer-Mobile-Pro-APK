package com.iab.omid.library.ironsrc.internal;

import android.view.View;
import com.iab.omid.library.ironsrc.adsession.C11124a;
import java.util.Iterator;

/* JADX INFO: renamed from: com.iab.omid.library.ironsrc.internal.b */
/* JADX INFO: loaded from: classes6.dex */
public class C11133b extends C11135d {

    /* JADX INFO: renamed from: d */
    private static C11133b f23245d = new C11133b();

    private C11133b() {
    }

    /* JADX INFO: renamed from: g */
    public static C11133b m24231g() {
        return f23245d;
    }

    @Override // com.iab.omid.library.ironsrc.internal.C11135d
    /* JADX INFO: renamed from: b */
    public void mo24232b(boolean z) {
        Iterator<C11124a> it = C11134c.m24234c().m24237b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().m24315a(z);
        }
    }

    @Override // com.iab.omid.library.ironsrc.internal.C11135d
    /* JADX INFO: renamed from: d */
    public boolean mo24233d() {
        Iterator<C11124a> it = C11134c.m24234c().m24235a().iterator();
        while (it.hasNext()) {
            View viewM24193c = it.next().m24193c();
            if (viewM24193c != null && viewM24193c.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}

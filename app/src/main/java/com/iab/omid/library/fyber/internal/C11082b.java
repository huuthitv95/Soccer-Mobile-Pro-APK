package com.iab.omid.library.fyber.internal;

import android.view.View;
import com.iab.omid.library.fyber.adsession.C11073a;
import java.util.Iterator;

/* JADX INFO: renamed from: com.iab.omid.library.fyber.internal.b */
/* JADX INFO: loaded from: classes6.dex */
public class C11082b extends C11084d {

    /* JADX INFO: renamed from: d */
    private static C11082b f23110d = new C11082b();

    private C11082b() {
    }

    /* JADX INFO: renamed from: g */
    public static C11082b m23978g() {
        return f23110d;
    }

    @Override // com.iab.omid.library.fyber.internal.C11084d
    /* JADX INFO: renamed from: b */
    public void mo23979b(boolean z) {
        Iterator<C11073a> it = C11083c.m23981c().m23984b().iterator();
        while (it.hasNext()) {
            it.next().m23939d().m24062a(z);
        }
    }

    @Override // com.iab.omid.library.fyber.internal.C11084d
    /* JADX INFO: renamed from: d */
    public boolean mo23980d() {
        Iterator<C11073a> it = C11083c.m23981c().m23982a().iterator();
        while (it.hasNext()) {
            View viewM23940e = it.next().m23940e();
            if (viewM23940e != null && viewM23940e.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}

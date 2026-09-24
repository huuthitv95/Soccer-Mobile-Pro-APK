package com.iab.omid.library.unity3d.internal;

import android.view.View;
import com.iab.omid.library.unity3d.adsession.C11224a;
import java.util.Iterator;

/* JADX INFO: renamed from: com.iab.omid.library.unity3d.internal.b */
/* JADX INFO: loaded from: classes6.dex */
public class C11233b extends C11235d {

    /* JADX INFO: renamed from: d */
    private static C11233b f23516d = new C11233b();

    private C11233b() {
    }

    /* JADX INFO: renamed from: g */
    public static C11233b m24740g() {
        return f23516d;
    }

    @Override // com.iab.omid.library.unity3d.internal.C11235d
    /* JADX INFO: renamed from: b */
    public void mo24741b(boolean z) {
        Iterator<C11224a> it = C11234c.m24743c().m24746b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().m24810a(z);
        }
    }

    @Override // com.iab.omid.library.unity3d.internal.C11235d
    /* JADX INFO: renamed from: d */
    public boolean mo24742d() {
        Iterator<C11224a> it = C11234c.m24743c().m24744a().iterator();
        while (it.hasNext()) {
            View viewM24702c = it.next().m24702c();
            if (viewM24702c != null && viewM24702c.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}

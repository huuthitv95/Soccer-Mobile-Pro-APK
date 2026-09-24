package com.iab.omid.library.bytedance2.internal;

import android.view.View;
import com.iab.omid.library.bytedance2.adsession.C10970a;
import java.util.Iterator;

/* JADX INFO: renamed from: com.iab.omid.library.bytedance2.internal.b */
/* JADX INFO: loaded from: classes6.dex */
public class C10979b extends C10981d {

    /* JADX INFO: renamed from: d */
    private static C10979b f22840d = new C10979b();

    private C10979b() {
    }

    /* JADX INFO: renamed from: g */
    public static C10979b m23474g() {
        return f22840d;
    }

    @Override // com.iab.omid.library.bytedance2.internal.C10981d
    /* JADX INFO: renamed from: b */
    public void mo23475b(boolean z) {
        Iterator<C10970a> it = C10980c.m23477c().m23480b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().m23551a(z);
        }
    }

    @Override // com.iab.omid.library.bytedance2.internal.C10981d
    /* JADX INFO: renamed from: d */
    public boolean mo23476d() {
        Iterator<C10970a> it = C10980c.m23477c().m23478a().iterator();
        while (it.hasNext()) {
            View viewM23436c = it.next().m23436c();
            if (viewM23436c != null && viewM23436c.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}

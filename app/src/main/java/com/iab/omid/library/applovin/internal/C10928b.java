package com.iab.omid.library.applovin.internal;

import android.view.View;
import com.iab.omid.library.applovin.adsession.C10919a;
import java.util.Iterator;

/* JADX INFO: renamed from: com.iab.omid.library.applovin.internal.b */
/* JADX INFO: loaded from: classes6.dex */
public class C10928b extends C10930d {

    /* JADX INFO: renamed from: d */
    private static C10928b f22705d = new C10928b();

    private C10928b() {
    }

    /* JADX INFO: renamed from: g */
    public static C10928b m23221g() {
        return f22705d;
    }

    @Override // com.iab.omid.library.applovin.internal.C10930d
    /* JADX INFO: renamed from: b */
    public void mo23222b(boolean z) {
        Iterator<C10919a> it = C10929c.m23224c().m23227b().iterator();
        while (it.hasNext()) {
            it.next().m23182d().m23305a(z);
        }
    }

    @Override // com.iab.omid.library.applovin.internal.C10930d
    /* JADX INFO: renamed from: d */
    public boolean mo23223d() {
        Iterator<C10919a> it = C10929c.m23224c().m23225a().iterator();
        while (it.hasNext()) {
            View viewM23183e = it.next().m23183e();
            if (viewM23183e != null && viewM23183e.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}

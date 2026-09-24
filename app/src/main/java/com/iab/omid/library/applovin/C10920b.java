package com.iab.omid.library.applovin;

import android.content.Context;
import com.iab.omid.library.applovin.internal.C10927a;
import com.iab.omid.library.applovin.internal.C10928b;
import com.iab.omid.library.applovin.internal.C10933g;
import com.iab.omid.library.applovin.internal.C10935i;
import com.iab.omid.library.applovin.internal.C10936j;
import com.iab.omid.library.applovin.utils.C10944a;
import com.iab.omid.library.applovin.utils.C10946c;
import com.iab.omid.library.applovin.utils.C10948e;
import com.iab.omid.library.applovin.utils.C10950g;

/* JADX INFO: renamed from: com.iab.omid.library.applovin.b */
/* JADX INFO: loaded from: classes6.dex */
public class C10920b {

    /* JADX INFO: renamed from: a */
    private boolean f22686a;

    /* JADX INFO: renamed from: b */
    private void m23194b(Context context) {
        C10950g.m23357a(context, "Application Context cannot be null");
    }

    /* JADX INFO: renamed from: a */
    String m23195a() {
        return "1.5.3-Applovin";
    }

    /* JADX INFO: renamed from: a */
    void m23196a(Context context) {
        m23194b(context);
        if (m23198b()) {
            return;
        }
        m23197a(true);
        C10935i.m23272c().m23273a(context);
        C10928b.m23221g().m23233a(context);
        C10944a.m23319a(context);
        C10946c.m23327a(context);
        C10948e.m23351a(context);
        C10933g.m23250b().m23252a(context);
        C10927a.m23215a().m23217a(context);
        C10936j.m23279b().m23281a(context);
    }

    /* JADX INFO: renamed from: a */
    void m23197a(boolean z) {
        this.f22686a = z;
    }

    /* JADX INFO: renamed from: b */
    boolean m23198b() {
        return this.f22686a;
    }

    /* JADX INFO: renamed from: c */
    void m23199c() {
        C10950g.m23354a();
        C10927a.m23215a().m23220d();
    }
}

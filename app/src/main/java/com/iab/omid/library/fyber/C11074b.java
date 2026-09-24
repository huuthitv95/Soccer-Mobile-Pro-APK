package com.iab.omid.library.fyber;

import android.content.Context;
import com.iab.omid.library.fyber.internal.C11081a;
import com.iab.omid.library.fyber.internal.C11082b;
import com.iab.omid.library.fyber.internal.C11087g;
import com.iab.omid.library.fyber.internal.C11089i;
import com.iab.omid.library.fyber.internal.C11090j;
import com.iab.omid.library.fyber.utils.C11098a;
import com.iab.omid.library.fyber.utils.C11100c;
import com.iab.omid.library.fyber.utils.C11102e;
import com.iab.omid.library.fyber.utils.C11104g;

/* JADX INFO: renamed from: com.iab.omid.library.fyber.b */
/* JADX INFO: loaded from: classes6.dex */
public class C11074b {

    /* JADX INFO: renamed from: a */
    private boolean f23091a;

    /* JADX INFO: renamed from: b */
    private void m23951b(Context context) {
        C11104g.m24114a(context, "Application Context cannot be null");
    }

    /* JADX INFO: renamed from: a */
    String m23952a() {
        return "1.5.4-Fyber";
    }

    /* JADX INFO: renamed from: a */
    void m23953a(Context context) {
        m23951b(context);
        if (m23955b()) {
            return;
        }
        m23954a(true);
        C11089i.m24029c().m24030a(context);
        C11082b.m23978g().m23990a(context);
        C11098a.m24076a(context);
        C11100c.m24084a(context);
        C11102e.m24108a(context);
        C11087g.m24007b().m24009a(context);
        C11081a.m23972a().m23974a(context);
        C11090j.m24036b().m24038a(context);
    }

    /* JADX INFO: renamed from: a */
    void m23954a(boolean z) {
        this.f23091a = z;
    }

    /* JADX INFO: renamed from: b */
    boolean m23955b() {
        return this.f23091a;
    }

    /* JADX INFO: renamed from: c */
    void m23956c() {
        C11104g.m24111a();
        C11081a.m23972a().m23977d();
    }
}

package com.iab.omid.library.mmadbridge;

import android.content.Context;
import com.iab.omid.library.mmadbridge.internal.C11183a;
import com.iab.omid.library.mmadbridge.internal.C11184b;
import com.iab.omid.library.mmadbridge.internal.C11189g;
import com.iab.omid.library.mmadbridge.internal.C11191i;
import com.iab.omid.library.mmadbridge.internal.C11192j;
import com.iab.omid.library.mmadbridge.utils.C11200a;
import com.iab.omid.library.mmadbridge.utils.C11202c;
import com.iab.omid.library.mmadbridge.utils.C11204e;
import com.iab.omid.library.mmadbridge.utils.C11206g;

/* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.b */
/* JADX INFO: loaded from: classes6.dex */
public class C11176b {

    /* JADX INFO: renamed from: a */
    private boolean f23361a;

    /* JADX INFO: renamed from: b */
    private void m24457b(Context context) {
        C11206g.m24620a(context, "Application Context cannot be null");
    }

    /* JADX INFO: renamed from: a */
    String m24458a() {
        return "1.4.13-Mmadbridge";
    }

    /* JADX INFO: renamed from: a */
    void m24459a(Context context) {
        m24457b(context);
        if (m24461b()) {
            return;
        }
        m24460a(true);
        C11191i.m24535c().m24536a(context);
        C11184b.m24484g().m24496a(context);
        C11200a.m24582a(context);
        C11202c.m24590a(context);
        C11204e.m24614a(context);
        C11189g.m24513b().m24515a(context);
        C11183a.m24478a().m24480a(context);
        C11192j.m24542b().m24544a(context);
    }

    /* JADX INFO: renamed from: a */
    void m24460a(boolean z) {
        this.f23361a = z;
    }

    /* JADX INFO: renamed from: b */
    boolean m24461b() {
        return this.f23361a;
    }

    /* JADX INFO: renamed from: c */
    void m24462c() {
        C11206g.m24617a();
        C11183a.m24478a().m24483d();
    }
}

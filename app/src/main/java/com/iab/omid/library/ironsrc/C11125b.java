package com.iab.omid.library.ironsrc;

import android.content.Context;
import com.iab.omid.library.ironsrc.internal.C11132a;
import com.iab.omid.library.ironsrc.internal.C11133b;
import com.iab.omid.library.ironsrc.internal.C11138g;
import com.iab.omid.library.ironsrc.internal.C11140i;
import com.iab.omid.library.ironsrc.internal.C11141j;
import com.iab.omid.library.ironsrc.utils.C11149a;
import com.iab.omid.library.ironsrc.utils.C11151c;
import com.iab.omid.library.ironsrc.utils.C11153e;
import com.iab.omid.library.ironsrc.utils.C11155g;

/* JADX INFO: renamed from: com.iab.omid.library.ironsrc.b */
/* JADX INFO: loaded from: classes6.dex */
public class C11125b {

    /* JADX INFO: renamed from: a */
    private boolean f23226a;

    /* JADX INFO: renamed from: b */
    private void m24204b(Context context) {
        C11155g.m24367a(context, "Application Context cannot be null");
    }

    /* JADX INFO: renamed from: a */
    String m24205a() {
        return "1.5.2-Ironsrc";
    }

    /* JADX INFO: renamed from: a */
    void m24206a(Context context) {
        m24204b(context);
        if (m24208b()) {
            return;
        }
        m24207a(true);
        C11140i.m24282c().m24283a(context);
        C11133b.m24231g().m24243a(context);
        C11149a.m24329a(context);
        C11151c.m24337a(context);
        C11153e.m24361a(context);
        C11138g.m24260b().m24262a(context);
        C11132a.m24225a().m24227a(context);
        C11141j.m24289b().m24291a(context);
    }

    /* JADX INFO: renamed from: a */
    void m24207a(boolean z) {
        this.f23226a = z;
    }

    /* JADX INFO: renamed from: b */
    boolean m24208b() {
        return this.f23226a;
    }

    /* JADX INFO: renamed from: c */
    void m24209c() {
        C11155g.m24364a();
        C11132a.m24225a().m24230d();
    }
}

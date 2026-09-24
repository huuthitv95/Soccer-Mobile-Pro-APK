package com.iab.omid.library.unity3d;

import android.content.Context;
import com.iab.omid.library.unity3d.internal.C11232a;
import com.iab.omid.library.unity3d.internal.C11233b;
import com.iab.omid.library.unity3d.internal.C11237f;
import com.iab.omid.library.unity3d.internal.C11239h;
import com.iab.omid.library.unity3d.utils.C11247a;
import com.iab.omid.library.unity3d.utils.C11249c;
import com.iab.omid.library.unity3d.utils.C11251e;
import com.iab.omid.library.unity3d.utils.C11253g;

/* JADX INFO: renamed from: com.iab.omid.library.unity3d.b */
/* JADX INFO: loaded from: classes6.dex */
public class C11225b {

    /* JADX INFO: renamed from: a */
    private boolean f23497a;

    /* JADX INFO: renamed from: b */
    private void m24713b(Context context) {
        C11253g.m24859a(context, "Application Context cannot be null");
    }

    /* JADX INFO: renamed from: a */
    String m24714a() {
        return "1.4.9-Unity3d";
    }

    /* JADX INFO: renamed from: a */
    void m24715a(Context context) {
        m24713b(context);
        if (m24717b()) {
            return;
        }
        m24716a(true);
        C11239h.m24783c().m24784a(context);
        C11233b.m24740g().m24752a(context);
        C11247a.m24823a(context);
        C11249c.m24831a(context);
        C11251e.m24853a(context);
        C11237f.m24762b().m24764a(context);
        C11232a.m24734a().m24736a(context);
    }

    /* JADX INFO: renamed from: a */
    void m24716a(boolean z) {
        this.f23497a = z;
    }

    /* JADX INFO: renamed from: b */
    boolean m24717b() {
        return this.f23497a;
    }

    /* JADX INFO: renamed from: c */
    void m24718c() {
        C11253g.m24856a();
        C11232a.m24734a().m24739d();
    }
}

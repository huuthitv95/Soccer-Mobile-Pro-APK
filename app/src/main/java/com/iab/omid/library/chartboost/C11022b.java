package com.iab.omid.library.chartboost;

import android.content.Context;
import com.iab.omid.library.chartboost.internal.C11029a;
import com.iab.omid.library.chartboost.internal.C11030b;
import com.iab.omid.library.chartboost.internal.C11035g;
import com.iab.omid.library.chartboost.internal.C11037i;
import com.iab.omid.library.chartboost.internal.C11038j;
import com.iab.omid.library.chartboost.utils.C11046a;
import com.iab.omid.library.chartboost.utils.C11048c;
import com.iab.omid.library.chartboost.utils.C11050e;
import com.iab.omid.library.chartboost.utils.C11052g;

/* JADX INFO: renamed from: com.iab.omid.library.chartboost.b */
/* JADX INFO: loaded from: classes6.dex */
public class C11022b {

    /* JADX INFO: renamed from: a */
    private boolean f22950a;

    /* JADX INFO: renamed from: b */
    private void m23690b(Context context) {
        C11052g.m23858a(context, "Application Context cannot be null");
    }

    /* JADX INFO: renamed from: a */
    String m23691a() {
        return "1.5.7-Chartboost";
    }

    /* JADX INFO: renamed from: a */
    void m23692a(Context context) {
        m23690b(context);
        if (m23694b()) {
            return;
        }
        m23693a(true);
        C11037i.m23772c().m23773a(context);
        C11030b.m23721g().m23733a(context);
        C11046a.m23820a(context);
        C11048c.m23828a(context);
        C11050e.m23852a(context);
        C11035g.m23750b().m23752a(context);
        C11029a.m23715a().m23717a(context);
        C11038j.m23779b().m23781a(context);
    }

    /* JADX INFO: renamed from: a */
    void m23693a(boolean z) {
        this.f22950a = z;
    }

    /* JADX INFO: renamed from: b */
    boolean m23694b() {
        return this.f22950a;
    }

    /* JADX INFO: renamed from: c */
    void m23695c() {
        C11052g.m23855a();
        C11029a.m23715a().m23720d();
    }
}

package com.iab.omid.library.vungle;

import android.content.Context;
import android.webkit.WebSettings;
import com.iab.omid.library.vungle.internal.C11290a;
import com.iab.omid.library.vungle.internal.C11291b;
import com.iab.omid.library.vungle.internal.C11296g;
import com.iab.omid.library.vungle.internal.C11298i;
import com.iab.omid.library.vungle.internal.C11300k;
import com.iab.omid.library.vungle.utils.C11310a;
import com.iab.omid.library.vungle.utils.C11312c;
import com.iab.omid.library.vungle.utils.C11313d;
import com.iab.omid.library.vungle.utils.C11314e;
import com.iab.omid.library.vungle.utils.C11316g;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.b */
/* JADX INFO: loaded from: classes6.dex */
public class C11283b {

    /* JADX INFO: renamed from: a */
    private boolean f23642a;

    /* JADX INFO: renamed from: com.iab.omid.library.vungle.b$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f23643a;

        a(C11283b c11283b, Context context) {
            this.f23643a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                WebSettings.getDefaultUserAgent(this.f23643a);
            } catch (Throwable unused) {
                C11313d.m25146a("Ignoring failure while retrieving default WebView user agent");
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m24968b(Context context) {
        C11316g.m25159a(context, "Application Context cannot be null");
    }

    /* JADX INFO: renamed from: c */
    private void m24969c(Context context) {
        Executors.newSingleThreadExecutor().execute(new a(this, context));
    }

    /* JADX INFO: renamed from: a */
    String m24970a() {
        return "1.6.2-Vungle";
    }

    /* JADX INFO: renamed from: a */
    void m24971a(Context context) {
        m24968b(context);
        if (m24973b()) {
            return;
        }
        m24972a(true);
        C11298i.m25052c().m25053a(context);
        C11291b.m25000g().m25012a(context);
        C11310a.m25118a(context);
        C11312c.m25126a(context);
        C11314e.m25153a(context);
        C11296g.m25029b().m25031a(context);
        C11290a.m24994a().m24996a(context);
        C11300k.m25062b().m25064a(context);
        m24969c(context);
    }

    /* JADX INFO: renamed from: a */
    void m24972a(boolean z) {
        this.f23642a = z;
    }

    /* JADX INFO: renamed from: b */
    boolean m24973b() {
        return this.f23642a;
    }

    /* JADX INFO: renamed from: c */
    void m24974c() {
        C11316g.m25156a();
        C11290a.m24994a().m24999d();
    }
}

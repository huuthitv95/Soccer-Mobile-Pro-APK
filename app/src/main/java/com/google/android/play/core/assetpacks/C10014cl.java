package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.C10097aq;
import com.google.android.play.core.assetpacks.internal.C10116o;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.cl */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C10014cl {

    /* JADX INFO: renamed from: a */
    private static final C10116o f22180a = new C10116o("ExtractorLooper");

    /* JADX INFO: renamed from: b */
    private final C10034de f22181b;

    /* JADX INFO: renamed from: c */
    private final C10008cf f22182c;

    /* JADX INFO: renamed from: d */
    private final C10073eq f22183d;

    /* JADX INFO: renamed from: e */
    private final C10050du f22184e;

    /* JADX INFO: renamed from: f */
    private final C10054dy f22185f;

    /* JADX INFO: renamed from: g */
    private final C10062ef f22186g;

    /* JADX INFO: renamed from: h */
    private final C10066ej f22187h;

    /* JADX INFO: renamed from: i */
    private final C10037dh f22188i;

    /* JADX INFO: renamed from: j */
    private final AtomicBoolean f22189j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k */
    private final C10097aq f22190k;

    C10014cl(C10034de c10034de, C10097aq c10097aq, C10008cf c10008cf, C10073eq c10073eq, C10050du c10050du, C10054dy c10054dy, C10062ef c10062ef, C10066ej c10066ej, C10037dh c10037dh) {
        this.f22181b = c10034de;
        this.f22190k = c10097aq;
        this.f22182c = c10008cf;
        this.f22183d = c10073eq;
        this.f22184e = c10050du;
        this.f22185f = c10054dy;
        this.f22186g = c10062ef;
        this.f22187h = c10066ej;
        this.f22188i = c10037dh;
    }

    /* JADX INFO: renamed from: b */
    private final void m22621b(int i, Exception exc) {
        try {
            this.f22181b.m22646m(i, 5);
            this.f22181b.m22647n(i);
        } catch (C10013ck unused) {
            f22180a.m22750b("Error during error handling: %s", exc.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    final void m22622a() {
        C10036dg c10036dgM22652a;
        C10116o c10116o = f22180a;
        c10116o.m22749a("Run extractor loop", new Object[0]);
        if (!this.f22189j.compareAndSet(false, true)) {
            c10116o.m22753e("runLoop already looping; return", new Object[0]);
            return;
        }
        while (true) {
            try {
                c10036dgM22652a = this.f22188i.m22652a();
            } catch (C10013ck e) {
                f22180a.m22750b("Error while getting next extraction task: %s", e.getMessage());
                if (e.f22179a >= 0) {
                    ((InterfaceC10145y) this.f22190k.mo22526a()).mo22524i(e.f22179a);
                    m22621b(e.f22179a, e);
                }
                c10036dgM22652a = null;
            }
            if (c10036dgM22652a == null) {
                this.f22189j.set(false);
                return;
            }
            try {
                if (c10036dgM22652a instanceof C10007ce) {
                    this.f22182c.m22616a((C10007ce) c10036dgM22652a);
                } else if (c10036dgM22652a instanceof C10072ep) {
                    this.f22183d.m22697a((C10072ep) c10036dgM22652a);
                } else if (c10036dgM22652a instanceof C10049dt) {
                    this.f22184e.m22670a((C10049dt) c10036dgM22652a);
                } else if (c10036dgM22652a instanceof C10052dw) {
                    this.f22185f.m22671a((C10052dw) c10036dgM22652a);
                } else if (c10036dgM22652a instanceof C10061ee) {
                    this.f22186g.m22676a((C10061ee) c10036dgM22652a);
                } else if (c10036dgM22652a instanceof C10064eh) {
                    this.f22187h.m22677a((C10064eh) c10036dgM22652a);
                } else {
                    f22180a.m22750b("Unknown task type: %s", c10036dgM22652a.getClass().getName());
                }
            } catch (Exception e2) {
                f22180a.m22750b("Error during extraction task: %s", e2.getMessage());
                ((InterfaceC10145y) this.f22190k.mo22526a()).mo22524i(c10036dgM22652a.f22255k);
                m22621b(c10036dgM22652a.f22255k, e2);
            }
        }
    }
}

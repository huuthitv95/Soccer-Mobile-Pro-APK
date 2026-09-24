package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.cache.session.enums.EnumC7917a;
import com.fyber.inneractive.sdk.cache.session.enums.EnumC7919c;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.cache.session.d */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC7915d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ EnumC7917a f17592a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EnumC7919c f17593b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C7916e f17594c;

    public RunnableC7915d(C7916e c7916e, EnumC7917a enumC7917a, EnumC7919c enumC7919c) {
        this.f17594c = c7916e;
        this.f17592a = enumC7917a;
        this.f17593b = enumC7919c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f17594c.f17597c) {
            EnumC7917a enumC7917a = this.f17592a;
            if (enumC7917a != EnumC7917a.NEW_SESSION) {
                C7921g c7921g = (C7921g) this.f17594c.f17595a.f17605a.get(this.f17593b);
                if (c7921g != null) {
                    int i = AbstractC7920f.f17600a[enumC7917a.ordinal()];
                    if (i == 1) {
                        c7921g.f17602b++;
                    } else if (i == 2) {
                        c7921g.f17603c++;
                    } else if (i == 3) {
                        c7921g.f17601a++;
                    }
                }
            } else {
                this.f17594c.f17595a = new C7923i();
            }
            try {
                AbstractC9174o.m21993a(AbstractC9174o.f21470a, C7916e.m20356a(this.f17594c).toString().getBytes("UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
            this.f17594c.getClass();
        }
    }
}

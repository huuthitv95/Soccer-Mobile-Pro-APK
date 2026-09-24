package com.iab.omid.library.ironsrc.internal;

import android.content.Context;
import com.iab.omid.library.ironsrc.adsession.C11124a;
import com.iab.omid.library.ironsrc.utils.C11154f;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: renamed from: com.iab.omid.library.ironsrc.internal.a */
/* JADX INFO: loaded from: classes6.dex */
public class C11132a implements C11135d.a {

    /* JADX INFO: renamed from: f */
    private static C11132a f23239f = new C11132a(new C11135d());

    /* JADX INFO: renamed from: a */
    protected C11154f f23240a = new C11154f();

    /* JADX INFO: renamed from: b */
    private Date f23241b;

    /* JADX INFO: renamed from: c */
    private boolean f23242c;

    /* JADX INFO: renamed from: d */
    private C11135d f23243d;

    /* JADX INFO: renamed from: e */
    private boolean f23244e;

    private C11132a(C11135d c11135d) {
        this.f23243d = c11135d;
    }

    /* JADX INFO: renamed from: a */
    public static C11132a m24225a() {
        return f23239f;
    }

    /* JADX INFO: renamed from: c */
    private void m24226c() {
        if (!this.f23242c || this.f23241b == null) {
            return;
        }
        Iterator<C11124a> it = C11134c.m24234c().m24235a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().m24313a(m24229b());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m24227a(Context context) {
        if (this.f23242c) {
            return;
        }
        this.f23243d.m24243a(context);
        this.f23243d.m24244a(this);
        this.f23243d.m24247e();
        this.f23244e = this.f23243d.m24246c();
        this.f23242c = true;
    }

    @Override // com.iab.omid.library.ironsrc.internal.C11135d.a
    /* JADX INFO: renamed from: a */
    public void mo24228a(boolean z) {
        if (!this.f23244e && z) {
            m24230d();
        }
        this.f23244e = z;
    }

    /* JADX INFO: renamed from: b */
    public Date m24229b() {
        Date date = this.f23241b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m24230d() {
        Date dateM24363a = this.f23240a.m24363a();
        Date date = this.f23241b;
        if (date == null || dateM24363a.after(date)) {
            this.f23241b = dateM24363a;
            m24226c();
        }
    }
}

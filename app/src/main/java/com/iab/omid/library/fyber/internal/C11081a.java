package com.iab.omid.library.fyber.internal;

import android.content.Context;
import com.iab.omid.library.fyber.adsession.C11073a;
import com.iab.omid.library.fyber.utils.C11103f;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: renamed from: com.iab.omid.library.fyber.internal.a */
/* JADX INFO: loaded from: classes6.dex */
public class C11081a implements C11084d.a {

    /* JADX INFO: renamed from: f */
    private static C11081a f23104f = new C11081a(new C11084d());

    /* JADX INFO: renamed from: a */
    protected C11103f f23105a = new C11103f();

    /* JADX INFO: renamed from: b */
    private Date f23106b;

    /* JADX INFO: renamed from: c */
    private boolean f23107c;

    /* JADX INFO: renamed from: d */
    private C11084d f23108d;

    /* JADX INFO: renamed from: e */
    private boolean f23109e;

    private C11081a(C11084d c11084d) {
        this.f23108d = c11084d;
    }

    /* JADX INFO: renamed from: a */
    public static C11081a m23972a() {
        return f23104f;
    }

    /* JADX INFO: renamed from: c */
    private void m23973c() {
        if (!this.f23107c || this.f23106b == null) {
            return;
        }
        Iterator<C11073a> it = C11083c.m23981c().m23982a().iterator();
        while (it.hasNext()) {
            it.next().m23939d().m24060a(m23976b());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m23974a(Context context) {
        if (this.f23107c) {
            return;
        }
        this.f23108d.m23990a(context);
        this.f23108d.m23991a(this);
        this.f23108d.m23994e();
        this.f23109e = this.f23108d.m23993c();
        this.f23107c = true;
    }

    @Override // com.iab.omid.library.fyber.internal.C11084d.a
    /* JADX INFO: renamed from: a */
    public void mo23975a(boolean z) {
        if (!this.f23109e && z) {
            m23977d();
        }
        this.f23109e = z;
    }

    /* JADX INFO: renamed from: b */
    public Date m23976b() {
        Date date = this.f23106b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m23977d() {
        Date dateM24110a = this.f23105a.m24110a();
        Date date = this.f23106b;
        if (date == null || dateM24110a.after(date)) {
            this.f23106b = dateM24110a;
            m23973c();
        }
    }
}

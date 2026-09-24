package com.iab.omid.library.unity3d.internal;

import android.content.Context;
import com.iab.omid.library.unity3d.adsession.C11224a;
import com.iab.omid.library.unity3d.utils.C11252f;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: renamed from: com.iab.omid.library.unity3d.internal.a */
/* JADX INFO: loaded from: classes6.dex */
public class C11232a implements C11235d.a {

    /* JADX INFO: renamed from: f */
    private static C11232a f23510f = new C11232a(new C11235d());

    /* JADX INFO: renamed from: a */
    protected C11252f f23511a = new C11252f();

    /* JADX INFO: renamed from: b */
    private Date f23512b;

    /* JADX INFO: renamed from: c */
    private boolean f23513c;

    /* JADX INFO: renamed from: d */
    private C11235d f23514d;

    /* JADX INFO: renamed from: e */
    private boolean f23515e;

    private C11232a(C11235d c11235d) {
        this.f23514d = c11235d;
    }

    /* JADX INFO: renamed from: a */
    public static C11232a m24734a() {
        return f23510f;
    }

    /* JADX INFO: renamed from: c */
    private void m24735c() {
        if (!this.f23513c || this.f23512b == null) {
            return;
        }
        Iterator<C11224a> it = C11234c.m24743c().m24744a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().m24808a(m24738b());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m24736a(Context context) {
        if (this.f23513c) {
            return;
        }
        this.f23514d.m24752a(context);
        this.f23514d.m24753a(this);
        this.f23514d.m24756e();
        this.f23515e = this.f23514d.m24755c();
        this.f23513c = true;
    }

    @Override // com.iab.omid.library.unity3d.internal.C11235d.a
    /* JADX INFO: renamed from: a */
    public void mo24737a(boolean z) {
        if (!this.f23515e && z) {
            m24739d();
        }
        this.f23515e = z;
    }

    /* JADX INFO: renamed from: b */
    public Date m24738b() {
        Date date = this.f23512b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m24739d() {
        Date dateM24855a = this.f23511a.m24855a();
        Date date = this.f23512b;
        if (date == null || dateM24855a.after(date)) {
            this.f23512b = dateM24855a;
            m24735c();
        }
    }
}

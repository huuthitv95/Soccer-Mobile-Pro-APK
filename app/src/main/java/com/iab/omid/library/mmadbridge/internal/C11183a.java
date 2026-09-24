package com.iab.omid.library.mmadbridge.internal;

import android.content.Context;
import com.iab.omid.library.mmadbridge.adsession.C11175a;
import com.iab.omid.library.mmadbridge.utils.C11205f;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.internal.a */
/* JADX INFO: loaded from: classes6.dex */
public class C11183a implements C11186d.a {

    /* JADX INFO: renamed from: f */
    private static C11183a f23374f = new C11183a(new C11186d());

    /* JADX INFO: renamed from: a */
    protected C11205f f23375a = new C11205f();

    /* JADX INFO: renamed from: b */
    private Date f23376b;

    /* JADX INFO: renamed from: c */
    private boolean f23377c;

    /* JADX INFO: renamed from: d */
    private C11186d f23378d;

    /* JADX INFO: renamed from: e */
    private boolean f23379e;

    private C11183a(C11186d c11186d) {
        this.f23378d = c11186d;
    }

    /* JADX INFO: renamed from: a */
    public static C11183a m24478a() {
        return f23374f;
    }

    /* JADX INFO: renamed from: c */
    private void m24479c() {
        if (!this.f23377c || this.f23376b == null) {
            return;
        }
        Iterator<C11175a> it = C11185c.m24487c().m24488a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().m24566a(m24482b());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m24480a(Context context) {
        if (this.f23377c) {
            return;
        }
        this.f23378d.m24496a(context);
        this.f23378d.m24497a(this);
        this.f23378d.m24500e();
        this.f23379e = this.f23378d.m24499c();
        this.f23377c = true;
    }

    @Override // com.iab.omid.library.mmadbridge.internal.C11186d.a
    /* JADX INFO: renamed from: a */
    public void mo24481a(boolean z) {
        if (!this.f23379e && z) {
            m24483d();
        }
        this.f23379e = z;
    }

    /* JADX INFO: renamed from: b */
    public Date m24482b() {
        Date date = this.f23376b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m24483d() {
        Date dateM24616a = this.f23375a.m24616a();
        Date date = this.f23376b;
        if (date == null || dateM24616a.after(date)) {
            this.f23376b = dateM24616a;
            m24479c();
        }
    }
}

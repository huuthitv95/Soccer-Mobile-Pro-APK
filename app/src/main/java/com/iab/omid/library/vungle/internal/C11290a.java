package com.iab.omid.library.vungle.internal;

import android.content.Context;
import com.iab.omid.library.vungle.adsession.C11271a;
import com.iab.omid.library.vungle.utils.C11315f;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.internal.a */
/* JADX INFO: loaded from: classes6.dex */
public class C11290a implements C11293d.a {

    /* JADX INFO: renamed from: f */
    private static C11290a f23662f = new C11290a(new C11293d());

    /* JADX INFO: renamed from: a */
    protected C11315f f23663a = new C11315f();

    /* JADX INFO: renamed from: b */
    private Date f23664b;

    /* JADX INFO: renamed from: c */
    private boolean f23665c;

    /* JADX INFO: renamed from: d */
    private C11293d f23666d;

    /* JADX INFO: renamed from: e */
    private boolean f23667e;

    private C11290a(C11293d c11293d) {
        this.f23666d = c11293d;
    }

    /* JADX INFO: renamed from: a */
    public static C11290a m24994a() {
        return f23662f;
    }

    /* JADX INFO: renamed from: c */
    private void m24995c() {
        if (!this.f23665c || this.f23664b == null) {
            return;
        }
        Iterator<C11271a> it = C11292c.m25003c().m25004a().iterator();
        while (it.hasNext()) {
            it.next().m24934d().m25094a(m24998b());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m24996a(Context context) {
        if (this.f23665c) {
            return;
        }
        this.f23666d.m25012a(context);
        this.f23666d.m25013a(this);
        this.f23666d.m25016e();
        this.f23667e = this.f23666d.m25015c();
        this.f23665c = true;
    }

    @Override // com.iab.omid.library.vungle.internal.C11293d.a
    /* JADX INFO: renamed from: a */
    public void mo24997a(boolean z) {
        if (!this.f23667e && z) {
            m24999d();
        }
        this.f23667e = z;
    }

    /* JADX INFO: renamed from: b */
    public Date m24998b() {
        Date date = this.f23664b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m24999d() {
        Date dateM25155a = this.f23663a.m25155a();
        Date date = this.f23664b;
        if (date == null || dateM25155a.after(date)) {
            this.f23664b = dateM25155a;
            m24995c();
        }
    }
}

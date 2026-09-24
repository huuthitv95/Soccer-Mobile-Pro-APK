package com.iab.omid.library.applovin.internal;

import android.content.Context;
import com.iab.omid.library.applovin.adsession.C10919a;
import com.iab.omid.library.applovin.utils.C10949f;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: renamed from: com.iab.omid.library.applovin.internal.a */
/* JADX INFO: loaded from: classes6.dex */
public class C10927a implements C10930d.a {

    /* JADX INFO: renamed from: f */
    private static C10927a f22699f = new C10927a(new C10930d());

    /* JADX INFO: renamed from: a */
    protected C10949f f22700a = new C10949f();

    /* JADX INFO: renamed from: b */
    private Date f22701b;

    /* JADX INFO: renamed from: c */
    private boolean f22702c;

    /* JADX INFO: renamed from: d */
    private C10930d f22703d;

    /* JADX INFO: renamed from: e */
    private boolean f22704e;

    private C10927a(C10930d c10930d) {
        this.f22703d = c10930d;
    }

    /* JADX INFO: renamed from: a */
    public static C10927a m23215a() {
        return f22699f;
    }

    /* JADX INFO: renamed from: c */
    private void m23216c() {
        if (!this.f22702c || this.f22701b == null) {
            return;
        }
        Iterator<C10919a> it = C10929c.m23224c().m23225a().iterator();
        while (it.hasNext()) {
            it.next().m23182d().m23303a(m23219b());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m23217a(Context context) {
        if (this.f22702c) {
            return;
        }
        this.f22703d.m23233a(context);
        this.f22703d.m23234a(this);
        this.f22703d.m23237e();
        this.f22704e = this.f22703d.m23236c();
        this.f22702c = true;
    }

    @Override // com.iab.omid.library.applovin.internal.C10930d.a
    /* JADX INFO: renamed from: a */
    public void mo23218a(boolean z) {
        if (!this.f22704e && z) {
            m23220d();
        }
        this.f22704e = z;
    }

    /* JADX INFO: renamed from: b */
    public Date m23219b() {
        Date date = this.f22701b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m23220d() {
        Date dateM23353a = this.f22700a.m23353a();
        Date date = this.f22701b;
        if (date == null || dateM23353a.after(date)) {
            this.f22701b = dateM23353a;
            m23216c();
        }
    }
}

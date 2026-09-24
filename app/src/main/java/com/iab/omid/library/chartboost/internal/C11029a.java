package com.iab.omid.library.chartboost.internal;

import android.content.Context;
import com.iab.omid.library.chartboost.adsession.C11021a;
import com.iab.omid.library.chartboost.utils.C11051f;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: renamed from: com.iab.omid.library.chartboost.internal.a */
/* JADX INFO: loaded from: classes6.dex */
public class C11029a implements C11032d.a {

    /* JADX INFO: renamed from: f */
    private static C11029a f22969f = new C11029a(new C11032d());

    /* JADX INFO: renamed from: a */
    protected C11051f f22970a = new C11051f();

    /* JADX INFO: renamed from: b */
    private Date f22971b;

    /* JADX INFO: renamed from: c */
    private boolean f22972c;

    /* JADX INFO: renamed from: d */
    private C11032d f22973d;

    /* JADX INFO: renamed from: e */
    private boolean f22974e;

    private C11029a(C11032d c11032d) {
        this.f22973d = c11032d;
    }

    /* JADX INFO: renamed from: a */
    public static C11029a m23715a() {
        return f22969f;
    }

    /* JADX INFO: renamed from: c */
    private void m23716c() {
        if (!this.f22972c || this.f22971b == null) {
            return;
        }
        Iterator<C11021a> it = C11031c.m23724c().m23725a().iterator();
        while (it.hasNext()) {
            it.next().m23678d().m23803a(m23719b());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m23717a(Context context) {
        if (this.f22972c) {
            return;
        }
        this.f22973d.m23733a(context);
        this.f22973d.m23734a(this);
        this.f22973d.m23737e();
        this.f22974e = this.f22973d.m23736c();
        this.f22972c = true;
    }

    @Override // com.iab.omid.library.chartboost.internal.C11032d.a
    /* JADX INFO: renamed from: a */
    public void mo23718a(boolean z) {
        if (!this.f22974e && z) {
            m23720d();
        }
        this.f22974e = z;
    }

    /* JADX INFO: renamed from: b */
    public Date m23719b() {
        Date date = this.f22971b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m23720d() {
        Date dateM23854a = this.f22970a.m23854a();
        Date date = this.f22971b;
        if (date == null || dateM23854a.after(date)) {
            this.f22971b = dateM23854a;
            m23716c();
        }
    }
}

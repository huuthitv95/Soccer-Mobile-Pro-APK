package com.iab.omid.library.bytedance2.internal;

import android.content.Context;
import com.iab.omid.library.bytedance2.adsession.C10970a;
import com.iab.omid.library.bytedance2.utils.C10999f;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: renamed from: com.iab.omid.library.bytedance2.internal.a */
/* JADX INFO: loaded from: classes6.dex */
public class C10978a implements C10981d.a {

    /* JADX INFO: renamed from: f */
    private static C10978a f22834f = new C10978a(new C10981d());

    /* JADX INFO: renamed from: a */
    protected C10999f f22835a = new C10999f();

    /* JADX INFO: renamed from: b */
    private Date f22836b;

    /* JADX INFO: renamed from: c */
    private boolean f22837c;

    /* JADX INFO: renamed from: d */
    private C10981d f22838d;

    /* JADX INFO: renamed from: e */
    private boolean f22839e;

    private C10978a(C10981d c10981d) {
        this.f22838d = c10981d;
    }

    /* JADX INFO: renamed from: a */
    public static C10978a m23468a() {
        return f22834f;
    }

    /* JADX INFO: renamed from: c */
    private void m23469c() {
        if (!this.f22837c || this.f22836b == null) {
            return;
        }
        Iterator<C10970a> it = C10980c.m23477c().m23478a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().m23549a(m23472b());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m23470a(Context context) {
        if (this.f22837c) {
            return;
        }
        this.f22838d.m23486a(context);
        this.f22838d.m23487a(this);
        this.f22838d.m23490e();
        this.f22839e = this.f22838d.m23489c();
        this.f22837c = true;
    }

    @Override // com.iab.omid.library.bytedance2.internal.C10981d.a
    /* JADX INFO: renamed from: a */
    public void mo23471a(boolean z) {
        if (!this.f22839e && z) {
            m23473d();
        }
        this.f22839e = z;
    }

    /* JADX INFO: renamed from: b */
    public Date m23472b() {
        Date date = this.f22836b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m23473d() {
        Date dateM23597a = this.f22835a.m23597a();
        Date date = this.f22836b;
        if (date == null || dateM23597a.after(date)) {
            this.f22836b = dateM23597a;
            m23469c();
        }
    }
}

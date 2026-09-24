package com.iab.omid.library.mmadbridge.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.mmadbridge.adsession.C11175a;
import com.iab.omid.library.mmadbridge.devicevolume.C11179b;
import com.iab.omid.library.mmadbridge.devicevolume.C11181d;
import com.iab.omid.library.mmadbridge.devicevolume.C11182e;
import com.iab.omid.library.mmadbridge.devicevolume.InterfaceC11180c;
import com.iab.omid.library.mmadbridge.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.internal.i */
/* JADX INFO: loaded from: classes6.dex */
public class C11191i implements C11186d.a, InterfaceC11180c {

    /* JADX INFO: renamed from: f */
    private static C11191i f23399f;

    /* JADX INFO: renamed from: a */
    private float f23400a = 0.0f;

    /* JADX INFO: renamed from: b */
    private final C11182e f23401b;

    /* JADX INFO: renamed from: c */
    private final C11179b f23402c;

    /* JADX INFO: renamed from: d */
    private C11181d f23403d;

    /* JADX INFO: renamed from: e */
    private C11185c f23404e;

    public C11191i(C11182e c11182e, C11179b c11179b) {
        this.f23401b = c11182e;
        this.f23402c = c11179b;
    }

    /* JADX INFO: renamed from: a */
    private C11185c m24534a() {
        if (this.f23404e == null) {
            this.f23404e = C11185c.m24487c();
        }
        return this.f23404e;
    }

    /* JADX INFO: renamed from: c */
    public static C11191i m24535c() {
        if (f23399f == null) {
            f23399f = new C11191i(new C11182e(), new C11179b());
        }
        return f23399f;
    }

    @Override // com.iab.omid.library.mmadbridge.devicevolume.InterfaceC11180c
    /* JADX INFO: renamed from: a */
    public void mo24471a(float f) {
        this.f23400a = f;
        Iterator<C11175a> it = m24534a().m24488a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().m24555a(f);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m24536a(Context context) {
        this.f23403d = this.f23401b.m24477a(new Handler(), context, this.f23402c.m24470a(), this);
    }

    @Override // com.iab.omid.library.mmadbridge.internal.C11186d.a
    /* JADX INFO: renamed from: a */
    public void mo24481a(boolean z) {
        if (z) {
            TreeWalker.getInstance().m24656h();
        } else {
            TreeWalker.getInstance().m24655g();
        }
    }

    /* JADX INFO: renamed from: b */
    public float m24537b() {
        return this.f23400a;
    }

    /* JADX INFO: renamed from: d */
    public void m24538d() {
        C11184b.m24484g().m24497a(this);
        C11184b.m24484g().m24500e();
        TreeWalker.getInstance().m24656h();
        this.f23403d.m24475c();
    }

    /* JADX INFO: renamed from: e */
    public void m24539e() {
        TreeWalker.getInstance().m24657j();
        C11184b.m24484g().m24501f();
        this.f23403d.m24476d();
    }
}

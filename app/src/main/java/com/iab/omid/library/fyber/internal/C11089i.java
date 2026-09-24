package com.iab.omid.library.fyber.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.fyber.adsession.C11073a;
import com.iab.omid.library.fyber.devicevolume.C11077b;
import com.iab.omid.library.fyber.devicevolume.C11079d;
import com.iab.omid.library.fyber.devicevolume.C11080e;
import com.iab.omid.library.fyber.devicevolume.InterfaceC11078c;
import com.iab.omid.library.fyber.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: renamed from: com.iab.omid.library.fyber.internal.i */
/* JADX INFO: loaded from: classes6.dex */
public class C11089i implements C11084d.a, InterfaceC11078c {

    /* JADX INFO: renamed from: f */
    private static C11089i f23129f;

    /* JADX INFO: renamed from: a */
    private float f23130a = 0.0f;

    /* JADX INFO: renamed from: b */
    private final C11080e f23131b;

    /* JADX INFO: renamed from: c */
    private final C11077b f23132c;

    /* JADX INFO: renamed from: d */
    private C11079d f23133d;

    /* JADX INFO: renamed from: e */
    private C11083c f23134e;

    public C11089i(C11080e c11080e, C11077b c11077b) {
        this.f23131b = c11080e;
        this.f23132c = c11077b;
    }

    /* JADX INFO: renamed from: a */
    private C11083c m24028a() {
        if (this.f23134e == null) {
            this.f23134e = C11083c.m23981c();
        }
        return this.f23134e;
    }

    /* JADX INFO: renamed from: c */
    public static C11089i m24029c() {
        if (f23129f == null) {
            f23129f = new C11089i(new C11080e(), new C11077b());
        }
        return f23129f;
    }

    @Override // com.iab.omid.library.fyber.devicevolume.InterfaceC11078c
    /* JADX INFO: renamed from: a */
    public void mo23965a(float f) {
        this.f23130a = f;
        Iterator<C11073a> it = m24028a().m23982a().iterator();
        while (it.hasNext()) {
            it.next().m23939d().m24049a(f);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m24030a(Context context) {
        this.f23133d = this.f23131b.m23971a(new Handler(), context, this.f23132c.m23964a(), this);
    }

    @Override // com.iab.omid.library.fyber.internal.C11084d.a
    /* JADX INFO: renamed from: a */
    public void mo23975a(boolean z) {
        if (z) {
            TreeWalker.getInstance().m24150h();
        } else {
            TreeWalker.getInstance().m24149g();
        }
    }

    /* JADX INFO: renamed from: b */
    public float m24031b() {
        return this.f23130a;
    }

    /* JADX INFO: renamed from: d */
    public void m24032d() {
        C11082b.m23978g().m23991a(this);
        C11082b.m23978g().m23994e();
        TreeWalker.getInstance().m24150h();
        this.f23133d.m23969c();
    }

    /* JADX INFO: renamed from: e */
    public void m24033e() {
        TreeWalker.getInstance().m24151j();
        C11082b.m23978g().m23995f();
        this.f23133d.m23970d();
    }
}

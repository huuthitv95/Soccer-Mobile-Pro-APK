package com.iab.omid.library.vungle.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.vungle.adsession.C11271a;
import com.iab.omid.library.vungle.devicevolume.C11286b;
import com.iab.omid.library.vungle.devicevolume.C11288d;
import com.iab.omid.library.vungle.devicevolume.C11289e;
import com.iab.omid.library.vungle.devicevolume.InterfaceC11287c;
import com.iab.omid.library.vungle.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.internal.i */
/* JADX INFO: loaded from: classes6.dex */
public class C11298i implements C11293d.a, InterfaceC11287c {

    /* JADX INFO: renamed from: f */
    private static C11298i f23687f;

    /* JADX INFO: renamed from: a */
    private float f23688a = 0.0f;

    /* JADX INFO: renamed from: b */
    private final C11289e f23689b;

    /* JADX INFO: renamed from: c */
    private final C11286b f23690c;

    /* JADX INFO: renamed from: d */
    private C11288d f23691d;

    /* JADX INFO: renamed from: e */
    private C11292c f23692e;

    public C11298i(C11289e c11289e, C11286b c11286b) {
        this.f23689b = c11289e;
        this.f23690c = c11286b;
    }

    /* JADX INFO: renamed from: a */
    private C11292c m25051a() {
        if (this.f23692e == null) {
            this.f23692e = C11292c.m25003c();
        }
        return this.f23692e;
    }

    /* JADX INFO: renamed from: c */
    public static C11298i m25052c() {
        if (f23687f == null) {
            f23687f = new C11298i(new C11289e(), new C11286b());
        }
        return f23687f;
    }

    @Override // com.iab.omid.library.vungle.devicevolume.InterfaceC11287c
    /* JADX INFO: renamed from: a */
    public void mo24983a(float f) {
        this.f23688a = f;
        Iterator<C11271a> it = m25051a().m25004a().iterator();
        while (it.hasNext()) {
            it.next().m24934d().m25083a(f);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m25053a(Context context) {
        this.f23691d = this.f23689b.m24993a(new Handler(), context, this.f23690c.m24982a(), this);
    }

    @Override // com.iab.omid.library.vungle.internal.C11293d.a
    /* JADX INFO: renamed from: a */
    public void mo24997a(boolean z) {
        if (z) {
            TreeWalker.getInstance().m25195h();
        } else {
            TreeWalker.getInstance().m25194g();
        }
    }

    /* JADX INFO: renamed from: b */
    public float m25054b() {
        return this.f23688a;
    }

    /* JADX INFO: renamed from: d */
    public void m25055d() {
        C11291b.m25000g().m25013a(this);
        C11291b.m25000g().m25016e();
        TreeWalker.getInstance().m25195h();
        this.f23691d.m24991b();
    }

    /* JADX INFO: renamed from: e */
    public void m25056e() {
        TreeWalker.getInstance().m25196j();
        C11291b.m25000g().m25017f();
        this.f23691d.m24992c();
    }
}

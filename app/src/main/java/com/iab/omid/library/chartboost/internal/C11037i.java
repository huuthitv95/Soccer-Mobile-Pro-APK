package com.iab.omid.library.chartboost.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.chartboost.adsession.C11021a;
import com.iab.omid.library.chartboost.devicevolume.C11025b;
import com.iab.omid.library.chartboost.devicevolume.C11027d;
import com.iab.omid.library.chartboost.devicevolume.C11028e;
import com.iab.omid.library.chartboost.devicevolume.InterfaceC11026c;
import com.iab.omid.library.chartboost.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: renamed from: com.iab.omid.library.chartboost.internal.i */
/* JADX INFO: loaded from: classes6.dex */
public class C11037i implements C11032d.a, InterfaceC11026c {

    /* JADX INFO: renamed from: f */
    private static C11037i f22994f;

    /* JADX INFO: renamed from: a */
    private float f22995a = 0.0f;

    /* JADX INFO: renamed from: b */
    private final C11028e f22996b;

    /* JADX INFO: renamed from: c */
    private final C11025b f22997c;

    /* JADX INFO: renamed from: d */
    private C11027d f22998d;

    /* JADX INFO: renamed from: e */
    private C11031c f22999e;

    public C11037i(C11028e c11028e, C11025b c11025b) {
        this.f22996b = c11028e;
        this.f22997c = c11025b;
    }

    /* JADX INFO: renamed from: a */
    private C11031c m23771a() {
        if (this.f22999e == null) {
            this.f22999e = C11031c.m23724c();
        }
        return this.f22999e;
    }

    /* JADX INFO: renamed from: c */
    public static C11037i m23772c() {
        if (f22994f == null) {
            f22994f = new C11037i(new C11028e(), new C11025b());
        }
        return f22994f;
    }

    @Override // com.iab.omid.library.chartboost.devicevolume.InterfaceC11026c
    /* JADX INFO: renamed from: a */
    public void mo23704a(float f) {
        this.f22995a = f;
        Iterator<C11021a> it = m23771a().m23725a().iterator();
        while (it.hasNext()) {
            it.next().m23678d().m23792a(f);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m23773a(Context context) {
        this.f22998d = this.f22996b.m23714a(new Handler(), context, this.f22997c.m23703a(), this);
    }

    @Override // com.iab.omid.library.chartboost.internal.C11032d.a
    /* JADX INFO: renamed from: a */
    public void mo23718a(boolean z) {
        if (z) {
            TreeWalker.getInstance().m23894h();
        } else {
            TreeWalker.getInstance().m23893g();
        }
    }

    /* JADX INFO: renamed from: b */
    public float m23774b() {
        return this.f22995a;
    }

    /* JADX INFO: renamed from: d */
    public void m23775d() {
        C11030b.m23721g().m23734a(this);
        C11030b.m23721g().m23737e();
        TreeWalker.getInstance().m23894h();
        this.f22998d.m23712b();
    }

    /* JADX INFO: renamed from: e */
    public void m23776e() {
        TreeWalker.getInstance().m23895j();
        C11030b.m23721g().m23738f();
        this.f22998d.m23713c();
    }
}

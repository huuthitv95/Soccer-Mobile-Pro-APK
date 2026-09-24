package com.iab.omid.library.ironsrc.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.ironsrc.adsession.C11124a;
import com.iab.omid.library.ironsrc.devicevolume.C11128b;
import com.iab.omid.library.ironsrc.devicevolume.C11130d;
import com.iab.omid.library.ironsrc.devicevolume.C11131e;
import com.iab.omid.library.ironsrc.devicevolume.InterfaceC11129c;
import com.iab.omid.library.ironsrc.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: renamed from: com.iab.omid.library.ironsrc.internal.i */
/* JADX INFO: loaded from: classes6.dex */
public class C11140i implements C11135d.a, InterfaceC11129c {

    /* JADX INFO: renamed from: f */
    private static C11140i f23264f;

    /* JADX INFO: renamed from: a */
    private float f23265a = 0.0f;

    /* JADX INFO: renamed from: b */
    private final C11131e f23266b;

    /* JADX INFO: renamed from: c */
    private final C11128b f23267c;

    /* JADX INFO: renamed from: d */
    private C11130d f23268d;

    /* JADX INFO: renamed from: e */
    private C11134c f23269e;

    public C11140i(C11131e c11131e, C11128b c11128b) {
        this.f23266b = c11131e;
        this.f23267c = c11128b;
    }

    /* JADX INFO: renamed from: a */
    private C11134c m24281a() {
        if (this.f23269e == null) {
            this.f23269e = C11134c.m24234c();
        }
        return this.f23269e;
    }

    /* JADX INFO: renamed from: c */
    public static C11140i m24282c() {
        if (f23264f == null) {
            f23264f = new C11140i(new C11131e(), new C11128b());
        }
        return f23264f;
    }

    @Override // com.iab.omid.library.ironsrc.devicevolume.InterfaceC11129c
    /* JADX INFO: renamed from: a */
    public void mo24218a(float f) {
        this.f23265a = f;
        Iterator<C11124a> it = m24281a().m24235a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().m24302a(f);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m24283a(Context context) {
        this.f23268d = this.f23266b.m24224a(new Handler(), context, this.f23267c.m24217a(), this);
    }

    @Override // com.iab.omid.library.ironsrc.internal.C11135d.a
    /* JADX INFO: renamed from: a */
    public void mo24228a(boolean z) {
        if (z) {
            TreeWalker.getInstance().m24403h();
        } else {
            TreeWalker.getInstance().m24402g();
        }
    }

    /* JADX INFO: renamed from: b */
    public float m24284b() {
        return this.f23265a;
    }

    /* JADX INFO: renamed from: d */
    public void m24285d() {
        C11133b.m24231g().m24244a(this);
        C11133b.m24231g().m24247e();
        TreeWalker.getInstance().m24403h();
        this.f23268d.m24222c();
    }

    /* JADX INFO: renamed from: e */
    public void m24286e() {
        TreeWalker.getInstance().m24404j();
        C11133b.m24231g().m24248f();
        this.f23268d.m24223d();
    }
}

package com.iab.omid.library.applovin.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.applovin.adsession.C10919a;
import com.iab.omid.library.applovin.devicevolume.C10923b;
import com.iab.omid.library.applovin.devicevolume.C10925d;
import com.iab.omid.library.applovin.devicevolume.C10926e;
import com.iab.omid.library.applovin.devicevolume.InterfaceC10924c;
import com.iab.omid.library.applovin.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: renamed from: com.iab.omid.library.applovin.internal.i */
/* JADX INFO: loaded from: classes6.dex */
public class C10935i implements C10930d.a, InterfaceC10924c {

    /* JADX INFO: renamed from: f */
    private static C10935i f22724f;

    /* JADX INFO: renamed from: a */
    private float f22725a = 0.0f;

    /* JADX INFO: renamed from: b */
    private final C10926e f22726b;

    /* JADX INFO: renamed from: c */
    private final C10923b f22727c;

    /* JADX INFO: renamed from: d */
    private C10925d f22728d;

    /* JADX INFO: renamed from: e */
    private C10929c f22729e;

    public C10935i(C10926e c10926e, C10923b c10923b) {
        this.f22726b = c10926e;
        this.f22727c = c10923b;
    }

    /* JADX INFO: renamed from: a */
    private C10929c m23271a() {
        if (this.f22729e == null) {
            this.f22729e = C10929c.m23224c();
        }
        return this.f22729e;
    }

    /* JADX INFO: renamed from: c */
    public static C10935i m23272c() {
        if (f22724f == null) {
            f22724f = new C10935i(new C10926e(), new C10923b());
        }
        return f22724f;
    }

    @Override // com.iab.omid.library.applovin.devicevolume.InterfaceC10924c
    /* JADX INFO: renamed from: a */
    public void mo23208a(float f) {
        this.f22725a = f;
        Iterator<C10919a> it = m23271a().m23225a().iterator();
        while (it.hasNext()) {
            it.next().m23182d().m23292a(f);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m23273a(Context context) {
        this.f22728d = this.f22726b.m23214a(new Handler(), context, this.f22727c.m23207a(), this);
    }

    @Override // com.iab.omid.library.applovin.internal.C10930d.a
    /* JADX INFO: renamed from: a */
    public void mo23218a(boolean z) {
        if (z) {
            TreeWalker.getInstance().m23393h();
        } else {
            TreeWalker.getInstance().m23392g();
        }
    }

    /* JADX INFO: renamed from: b */
    public float m23274b() {
        return this.f22725a;
    }

    /* JADX INFO: renamed from: d */
    public void m23275d() {
        C10928b.m23221g().m23234a(this);
        C10928b.m23221g().m23237e();
        TreeWalker.getInstance().m23393h();
        this.f22728d.m23212c();
    }

    /* JADX INFO: renamed from: e */
    public void m23276e() {
        TreeWalker.getInstance().m23394j();
        C10928b.m23221g().m23238f();
        this.f22728d.m23213d();
    }
}

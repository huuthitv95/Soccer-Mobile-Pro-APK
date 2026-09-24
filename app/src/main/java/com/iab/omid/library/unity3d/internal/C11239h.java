package com.iab.omid.library.unity3d.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.unity3d.adsession.C11224a;
import com.iab.omid.library.unity3d.devicevolume.C11228b;
import com.iab.omid.library.unity3d.devicevolume.C11230d;
import com.iab.omid.library.unity3d.devicevolume.C11231e;
import com.iab.omid.library.unity3d.devicevolume.InterfaceC11229c;
import com.iab.omid.library.unity3d.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: renamed from: com.iab.omid.library.unity3d.internal.h */
/* JADX INFO: loaded from: classes6.dex */
public class C11239h implements C11235d.a, InterfaceC11229c {

    /* JADX INFO: renamed from: f */
    private static C11239h f23533f;

    /* JADX INFO: renamed from: a */
    private float f23534a = 0.0f;

    /* JADX INFO: renamed from: b */
    private final C11231e f23535b;

    /* JADX INFO: renamed from: c */
    private final C11228b f23536c;

    /* JADX INFO: renamed from: d */
    private C11230d f23537d;

    /* JADX INFO: renamed from: e */
    private C11234c f23538e;

    public C11239h(C11231e c11231e, C11228b c11228b) {
        this.f23535b = c11231e;
        this.f23536c = c11228b;
    }

    /* JADX INFO: renamed from: a */
    private C11234c m24782a() {
        if (this.f23538e == null) {
            this.f23538e = C11234c.m24743c();
        }
        return this.f23538e;
    }

    /* JADX INFO: renamed from: c */
    public static C11239h m24783c() {
        if (f23533f == null) {
            f23533f = new C11239h(new C11231e(), new C11228b());
        }
        return f23533f;
    }

    @Override // com.iab.omid.library.unity3d.devicevolume.InterfaceC11229c
    /* JADX INFO: renamed from: a */
    public void mo24727a(float f) {
        this.f23534a = f;
        Iterator<C11224a> it = m24782a().m24744a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().m24797a(f);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m24784a(Context context) {
        this.f23537d = this.f23535b.m24733a(new Handler(), context, this.f23536c.m24726a(), this);
    }

    @Override // com.iab.omid.library.unity3d.internal.C11235d.a
    /* JADX INFO: renamed from: a */
    public void mo24737a(boolean z) {
        if (z) {
            TreeWalker.getInstance().m24891h();
        } else {
            TreeWalker.getInstance().m24890g();
        }
    }

    /* JADX INFO: renamed from: b */
    public float m24785b() {
        return this.f23534a;
    }

    /* JADX INFO: renamed from: d */
    public void m24786d() {
        C11233b.m24740g().m24753a(this);
        C11233b.m24740g().m24756e();
        TreeWalker.getInstance().m24891h();
        this.f23537d.m24731c();
    }

    /* JADX INFO: renamed from: e */
    public void m24787e() {
        TreeWalker.getInstance().m24892j();
        C11233b.m24740g().m24757f();
        this.f23537d.m24732d();
    }
}

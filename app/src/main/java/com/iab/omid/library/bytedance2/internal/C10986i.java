package com.iab.omid.library.bytedance2.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.bytedance2.adsession.C10970a;
import com.iab.omid.library.bytedance2.devicevolume.C10974b;
import com.iab.omid.library.bytedance2.devicevolume.C10976d;
import com.iab.omid.library.bytedance2.devicevolume.C10977e;
import com.iab.omid.library.bytedance2.devicevolume.InterfaceC10975c;
import com.iab.omid.library.bytedance2.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: renamed from: com.iab.omid.library.bytedance2.internal.i */
/* JADX INFO: loaded from: classes6.dex */
public class C10986i implements InterfaceC10975c, C10981d.a {

    /* JADX INFO: renamed from: f */
    private static C10986i f22859f;

    /* JADX INFO: renamed from: a */
    private float f22860a = 0.0f;

    /* JADX INFO: renamed from: b */
    private final C10977e f22861b;

    /* JADX INFO: renamed from: c */
    private final C10974b f22862c;

    /* JADX INFO: renamed from: d */
    private C10976d f22863d;

    /* JADX INFO: renamed from: e */
    private C10980c f22864e;

    public C10986i(C10977e c10977e, C10974b c10974b) {
        this.f22861b = c10977e;
        this.f22862c = c10974b;
    }

    /* JADX INFO: renamed from: a */
    private C10980c m23523a() {
        if (this.f22864e == null) {
            this.f22864e = C10980c.m23477c();
        }
        return this.f22864e;
    }

    /* JADX INFO: renamed from: c */
    public static C10986i m23524c() {
        if (f22859f == null) {
            f22859f = new C10986i(new C10977e(), new C10974b());
        }
        return f22859f;
    }

    @Override // com.iab.omid.library.bytedance2.devicevolume.InterfaceC10975c
    /* JADX INFO: renamed from: a */
    public void mo23461a(float f) {
        this.f22860a = f;
        Iterator<C10970a> it = m23523a().m23478a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().m23538a(f);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m23525a(Context context) {
        this.f22863d = this.f22861b.m23467a(new Handler(), context, this.f22862c.m23460a(), this);
    }

    @Override // com.iab.omid.library.bytedance2.internal.C10981d.a
    /* JADX INFO: renamed from: a */
    public void mo23471a(boolean z) {
        if (z) {
            TreeWalker.getInstance().m23635h();
        } else {
            TreeWalker.getInstance().m23634g();
        }
    }

    /* JADX INFO: renamed from: b */
    public float m23526b() {
        return this.f22860a;
    }

    /* JADX INFO: renamed from: d */
    public void m23527d() {
        C10979b.m23474g().m23487a(this);
        C10979b.m23474g().m23490e();
        TreeWalker.getInstance().m23635h();
        this.f22863d.m23465c();
    }

    /* JADX INFO: renamed from: e */
    public void m23528e() {
        TreeWalker.getInstance().m23636j();
        C10979b.m23474g().m23491f();
        this.f22863d.m23466d();
    }
}

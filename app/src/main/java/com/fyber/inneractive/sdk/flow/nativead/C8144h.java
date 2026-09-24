package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.cache.C7902d;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.C8425u0;
import com.fyber.inneractive.sdk.response.nativead.C9097c;
import com.fyber.inneractive.sdk.response.nativead.C9100f;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.nativead.h */
/* JADX INFO: loaded from: classes4.dex */
public final class C8144h implements InterfaceC8139c, InterfaceC8161s {

    /* JADX INFO: renamed from: a */
    public CountDownLatch f18128a;

    /* JADX INFO: renamed from: b */
    public final C8141e f18129b;

    /* JADX INFO: renamed from: d */
    public final List f18131d;

    /* JADX INFO: renamed from: c */
    public ArrayList f18130c = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final ArrayList f18132e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final ArrayList f18133f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public EnumC8138b f18134g = EnumC8138b.UNINITIALIZED;

    public C8144h(ArrayList arrayList, C8141e c8141e) {
        this.f18131d = arrayList;
        this.f18129b = c8141e;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.InterfaceC8161s
    /* JADX INFO: renamed from: a */
    public final void mo20566a(C8143g c8143g, Exception exc, C9100f c9100f) throws Throwable {
        if (c8143g != null) {
            this.f18133f.add(c8143g);
        } else {
            this.f18132e.add(c9100f);
        }
        CountDownLatch countDownLatch = this.f18128a;
        if (countDownLatch == null) {
            return;
        }
        countDownLatch.countDown();
        if (this.f18128a.getCount() == 0) {
            this.f18134g = EnumC8138b.LOADED;
            m20567c();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.InterfaceC8139c
    /* JADX INFO: renamed from: a */
    public final boolean mo20562a() {
        return this.f18134g == EnumC8138b.LOADING;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.InterfaceC8139c
    /* JADX INFO: renamed from: b */
    public final void mo20563b() throws Throwable {
        C9097c c9097c;
        String str;
        if (this.f18131d.isEmpty()) {
            this.f18134g = EnumC8138b.FAILED;
            m20567c();
            return;
        }
        for (C9100f c9100f : this.f18131d) {
            if (c9100f != null && (c9097c = c9100f.f21345d) != null && (str = c9097c.f21339a) != null && !str.trim().isEmpty()) {
                ArrayList arrayList = this.f18130c;
                if (arrayList == null) {
                    break;
                }
                arrayList.add(new C8425u0(new C8162t(c9100f, this), IAConfigManager.f17654M.f17689u.f17785a, new C7902d(c9100f.f21345d.f21339a)));
                break;
            }
            IAlog.m21950f("%sImage asset not downloadable. imageAssetId: %s, imageObject: %s", IAlog.m21943a(this), Integer.valueOf(c9100f.f21342a), c9100f.f21345d);
            this.f18132e.add(c9100f);
        }
        ArrayList arrayList2 = this.f18130c;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            this.f18134g = EnumC8138b.FAILED;
            m20567c();
            return;
        }
        this.f18134g = EnumC8138b.LOADING;
        this.f18128a = new CountDownLatch(this.f18130c.size());
        Iterator it = this.f18130c.iterator();
        while (it.hasNext()) {
            IAConfigManager.f17654M.f17686r.m20768a((C8425u0) it.next());
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m20567c() throws Throwable {
        C8141e c8141e = this.f18129b;
        if (c8141e != null) {
            ArrayList arrayList = this.f18133f;
            ArrayList<C9100f> arrayList2 = this.f18132e;
            if (!arrayList.isEmpty()) {
                c8141e.f18111a.f18117d.addAll(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                for (C9100f c9100f : arrayList2) {
                    IAlog.m21950f("%sFailed to load image asset. id: %s, imageObj: %s", C8142f.f18112m, Integer.valueOf(c9100f.f21342a), c9100f.f21345d);
                }
            }
            c8141e.f18111a.m20564a();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.InterfaceC8139c
    public final void destroy() {
        ArrayList arrayList = this.f18130c;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = this.f18130c.iterator();
            while (it.hasNext()) {
                ((C8425u0) it.next()).f18711a = true;
            }
            this.f18130c.clear();
        }
        this.f18130c = null;
        this.f18134g = EnumC8138b.DESTROYED;
    }
}

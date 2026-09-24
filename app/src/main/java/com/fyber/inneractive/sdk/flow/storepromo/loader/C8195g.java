package com.fyber.inneractive.sdk.flow.storepromo.loader;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.flow.storepromo.C8178b;
import com.fyber.inneractive.sdk.flow.storepromo.controller.C8180b;
import com.fyber.inneractive.sdk.flow.storepromo.controller.C8181c;
import com.fyber.inneractive.sdk.flow.storepromo.events.EnumC8188a;
import com.fyber.inneractive.sdk.flow.storepromo.model.C8210c;
import com.fyber.inneractive.sdk.model.vast.C8313v;
import com.fyber.inneractive.sdk.network.AbstractC8416t0;
import com.fyber.inneractive.sdk.network.C8392l0;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.storepromo.loader.g */
/* JADX INFO: loaded from: classes4.dex */
public final class C8195g {

    /* JADX INFO: renamed from: a */
    public final C8313v f18253a;

    /* JADX INFO: renamed from: b */
    public CountDownLatch f18254b;

    /* JADX INFO: renamed from: c */
    public final C8178b f18255c;

    /* JADX INFO: renamed from: d */
    public final C8210c f18256d;

    /* JADX INFO: renamed from: f */
    public final int f18258f;

    /* JADX INFO: renamed from: e */
    public final ArrayList f18257e = new ArrayList();

    /* JADX INFO: renamed from: g */
    public int f18259g = 0;

    /* JADX INFO: renamed from: h */
    public boolean f18260h = false;

    /* JADX INFO: renamed from: i */
    public boolean f18261i = false;

    public C8195g(C8313v c8313v, C8178b c8178b) {
        this.f18253a = c8313v;
        this.f18258f = c8313v.f18578f.size();
        this.f18255c = c8178b;
        this.f18256d = new C8210c(c8313v);
    }

    /* JADX INFO: renamed from: a */
    public final void m20615a() {
        for (AbstractC8416t0 abstractC8416t0 : this.f18257e) {
            C8392l0 c8392l0 = IAConfigManager.f17654M.f17686r;
            String str = abstractC8416t0.f18717g;
            c8392l0.getClass();
            abstractC8416t0.mo20790c();
        }
        this.f18257e.clear();
    }

    /* JADX INFO: renamed from: a */
    public final void m20616a(EnumC8188a enumC8188a, boolean z, String str, String str2) {
        C8194f c8194f;
        this.f18254b.countDown();
        if (this.f18261i) {
            return;
        }
        if (z) {
            this.f18261i = true;
            this.f18260h = true;
            m20615a();
            if (TextUtils.isEmpty(str)) {
                str = "Something went wrong during promo's resources download";
            }
            C8178b c8178b = this.f18255c;
            if (c8178b != null) {
                if (enumC8188a == null) {
                    enumC8188a = EnumC8188a.DOWNLOAD_RESOURCE_ERROR;
                }
                c8178b.m20604a(enumC8188a.name(), str, str2);
                return;
            }
            return;
        }
        if (this.f18254b.getCount() != 0 || this.f18260h) {
            return;
        }
        this.f18261i = true;
        Collections.sort(this.f18256d.f18295a);
        this.f18257e.clear();
        C8178b c8178b2 = this.f18255c;
        if (c8178b2 != null) {
            C8210c c8210c = this.f18256d;
            IAlog.m21945a("StorePromoManager : onPromoLoadSucceed", new Object[0]);
            C8180b c8180b = new C8180b(c8210c, c8178b2, c8178b2, c8178b2, c8178b2.f18212b, c8178b2.f18213c);
            c8178b2.f18214d = c8180b;
            c8178b2.f18217g = c8210c.f18303i;
            C8181c c8181c = c8180b.f18223c;
            if (c8181c == null || (c8194f = c8181c.f18233d) == null) {
                return;
            }
            AbstractC9183r.f21477a.execute(new RunnableC8193e(c8194f, new C8192d(c8194f)));
        }
    }
}

package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.C10097aq;
import java.io.File;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.ej */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C10066ej {

    /* JADX INFO: renamed from: a */
    private final C9983bh f22356a;

    /* JADX INFO: renamed from: b */
    private final C10034de f22357b;

    /* JADX INFO: renamed from: c */
    private final C10017co f22358c;

    /* JADX INFO: renamed from: d */
    private final C10097aq f22359d;

    /* JADX INFO: renamed from: e */
    private final C10097aq f22360e;

    C10066ej(C9983bh c9983bh, C10097aq c10097aq, C10034de c10034de, C10097aq c10097aq2, C10017co c10017co) {
        this.f22356a = c9983bh;
        this.f22359d = c10097aq;
        this.f22357b = c10034de;
        this.f22360e = c10097aq2;
        this.f22358c = c10017co;
    }

    /* JADX INFO: renamed from: a */
    public final void m22677a(final C10064eh c10064eh) {
        File fileM22564h = this.f22356a.m22564h(c10064eh.f22256l, c10064eh.f22351a, c10064eh.f22353c);
        if (!fileM22564h.exists()) {
            throw new C10013ck(String.format("Cannot find pack files to promote for pack %s at %s", c10064eh.f22256l, fileM22564h.getAbsolutePath()), c10064eh.f22255k);
        }
        File fileM22564h2 = this.f22356a.m22564h(c10064eh.f22256l, c10064eh.f22352b, c10064eh.f22353c);
        fileM22564h2.mkdirs();
        if (!fileM22564h.renameTo(fileM22564h2)) {
            throw new C10013ck(String.format("Cannot promote pack %s from %s to %s", c10064eh.f22256l, fileM22564h.getAbsolutePath(), fileM22564h2.getAbsolutePath()), c10064eh.f22255k);
        }
        ((Executor) this.f22360e.mo22526a()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.ei
            @Override // java.lang.Runnable
            public final void run() {
                this.f22354a.m22678b(c10064eh);
            }
        });
        this.f22357b.m22644k(c10064eh.f22256l, c10064eh.f22352b, c10064eh.f22353c);
        this.f22358c.m22625c(c10064eh.f22256l);
        ((InterfaceC10145y) this.f22359d.mo22526a()).mo22523h(c10064eh.f22255k, c10064eh.f22256l);
    }

    /* JADX INFO: renamed from: b */
    final /* synthetic */ void m22678b(C10064eh c10064eh) {
        this.f22356a.m22551B(c10064eh.f22256l, c10064eh.f22352b, c10064eh.f22353c);
    }
}

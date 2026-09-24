package com.google.android.play.core.assetpacks.internal;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.internal.v */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C10123v extends AbstractRunnableC10117p {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ IBinder f22422a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ServiceConnectionC10126y f22423b;

    C10123v(ServiceConnectionC10126y serviceConnectionC10126y, IBinder iBinder) {
        this.f22422a = iBinder;
        this.f22423b = serviceConnectionC10126y;
    }

    @Override // com.google.android.play.core.assetpacks.internal.AbstractRunnableC10117p
    /* JADX INFO: renamed from: a */
    public final void mo22482a() {
        this.f22423b.f22425a.f22439n = AbstractBinderC10106e.m22737b(this.f22422a);
        C10127z.m22771q(this.f22423b.f22425a);
        this.f22423b.f22425a.f22433h = false;
        Iterator it = this.f22423b.f22425a.f22430e.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f22423b.f22425a.f22430e.clear();
    }
}

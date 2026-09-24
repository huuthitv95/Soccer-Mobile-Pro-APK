package com.google.android.play.core.assetpacks.internal;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.internal.t */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C10121t extends AbstractRunnableC10117p {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C10127z f22421a;

    C10121t(C10127z c10127z) {
        this.f22421a = c10127z;
    }

    @Override // com.google.android.play.core.assetpacks.internal.AbstractRunnableC10117p
    /* JADX INFO: renamed from: a */
    public final void mo22482a() {
        synchronized (this.f22421a.f22432g) {
            if (this.f22421a.f22437l.get() > 0 && this.f22421a.f22437l.decrementAndGet() > 0) {
                this.f22421a.f22428c.m22752d("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            C10127z c10127z = this.f22421a;
            if (c10127z.f22439n != null) {
                c10127z.f22428c.m22752d("Unbind from service.", new Object[0]);
                C10127z c10127z2 = this.f22421a;
                c10127z2.f22427b.unbindService(c10127z2.f22438m);
                this.f22421a.f22433h = false;
                this.f22421a.f22439n = null;
                this.f22421a.f22438m = null;
            }
            this.f22421a.m22774w();
        }
    }
}

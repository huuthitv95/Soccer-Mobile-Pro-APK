package com.google.android.play.core.assetpacks.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.internal.s */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C10120s extends AbstractRunnableC10117p {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ TaskCompletionSource f22418a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ AbstractRunnableC10117p f22419b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C10127z f22420c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10120s(C10127z c10127z, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, AbstractRunnableC10117p abstractRunnableC10117p) {
        super(taskCompletionSource);
        this.f22418a = taskCompletionSource2;
        this.f22419b = abstractRunnableC10117p;
        this.f22420c = c10127z;
    }

    @Override // com.google.android.play.core.assetpacks.internal.AbstractRunnableC10117p
    /* JADX INFO: renamed from: a */
    public final void mo22482a() {
        synchronized (this.f22420c.f22432g) {
            C10127z.m22768n(this.f22420c, this.f22418a);
            if (this.f22420c.f22437l.getAndIncrement() > 0) {
                this.f22420c.f22428c.m22752d("Already connected to the service.", new Object[0]);
            }
            C10127z.m22770p(this.f22420c, this.f22419b);
        }
    }
}

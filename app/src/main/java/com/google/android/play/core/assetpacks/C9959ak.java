package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.internal.AbstractRunnableC10117p;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.ak */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C9959ak extends AbstractRunnableC10117p {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ TaskCompletionSource f22006a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C9971aw f22007b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9959ak(C9971aw c9971aw, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f22006a = taskCompletionSource2;
        this.f22007b = c9971aw;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.play.core.assetpacks.internal.f] */
    @Override // com.google.android.play.core.assetpacks.internal.AbstractRunnableC10117p
    /* JADX INFO: renamed from: a */
    protected final void mo22482a() {
        try {
            this.f22007b.f22027g.m22776e().mo22730f(this.f22007b.f22023c, C9971aw.m22496A(), new BinderC9964ap(this.f22007b, this.f22006a));
        } catch (RemoteException e) {
            C9971aw.f22021a.m22751c(e, "keepAlive", new Object[0]);
        }
    }
}

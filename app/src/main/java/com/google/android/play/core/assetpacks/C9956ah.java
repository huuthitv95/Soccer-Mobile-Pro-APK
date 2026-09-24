package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.internal.AbstractRunnableC10117p;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.ah */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C9956ah extends AbstractRunnableC10117p {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f21992a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f21993b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ TaskCompletionSource f21994c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ int f21995d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C9971aw f21996e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9956ah(C9971aw c9971aw, TaskCompletionSource taskCompletionSource, int i, String str, TaskCompletionSource taskCompletionSource2, int i2) {
        super(taskCompletionSource);
        this.f21992a = i;
        this.f21993b = str;
        this.f21994c = taskCompletionSource2;
        this.f21995d = i2;
        this.f21996e = c9971aw;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.play.core.assetpacks.internal.f] */
    @Override // com.google.android.play.core.assetpacks.internal.AbstractRunnableC10117p
    /* JADX INFO: renamed from: a */
    protected final void mo22482a() {
        try {
            this.f21996e.f22026f.m22776e().mo22732h(this.f21996e.f22023c, C9971aw.m22515z(this.f21992a, this.f21993b), C9971aw.m22496A(), new BinderC9966ar(this.f21996e, this.f21994c, this.f21992a, this.f21993b, this.f21995d));
        } catch (RemoteException e) {
            C9971aw.f22021a.m22751c(e, "notifyModuleCompleted", new Object[0]);
        }
    }
}

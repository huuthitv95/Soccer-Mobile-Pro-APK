package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.internal.AbstractRunnableC10117p;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.ai */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C9957ai extends AbstractRunnableC10117p {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f21997a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ TaskCompletionSource f21998b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C9971aw f21999c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9957ai(C9971aw c9971aw, TaskCompletionSource taskCompletionSource, int i, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f21997a = i;
        this.f21998b = taskCompletionSource2;
        this.f21999c = c9971aw;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.play.core.assetpacks.internal.f] */
    @Override // com.google.android.play.core.assetpacks.internal.AbstractRunnableC10117p
    /* JADX INFO: renamed from: a */
    protected final void mo22482a() {
        try {
            this.f21999c.f22026f.m22776e().mo22733i(this.f21999c.f22023c, C9971aw.m22497B(this.f21997a), C9971aw.m22496A(), new BinderC9967as(this.f21999c, this.f21998b));
        } catch (RemoteException e) {
            C9971aw.f22021a.m22751c(e, "notifySessionFailed", new Object[0]);
        }
    }
}

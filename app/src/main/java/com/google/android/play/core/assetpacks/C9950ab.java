package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.internal.AbstractRunnableC10117p;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.ab */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C9950ab extends AbstractRunnableC10117p {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f21968a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ TaskCompletionSource f21969b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C9971aw f21970c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9950ab(C9971aw c9971aw, TaskCompletionSource taskCompletionSource, String str, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f21968a = str;
        this.f21969b = taskCompletionSource2;
        this.f21970c = c9971aw;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [android.os.IInterface, com.google.android.play.core.assetpacks.internal.f] */
    @Override // com.google.android.play.core.assetpacks.internal.AbstractRunnableC10117p
    /* JADX INFO: renamed from: a */
    protected final void mo22482a() {
        try {
            this.f21970c.f22026f.m22776e().mo22734j(this.f21970c.f22023c, C9971aw.m22515z(0, this.f21968a), C9971aw.m22496A(), new BinderC9968at(this.f21970c, this.f21969b));
        } catch (RemoteException e) {
            C9971aw.f22021a.m22751c(e, "removePack(%s)", this.f21968a);
        }
    }
}

package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.internal.AbstractRunnableC10117p;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.ae */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C9953ae extends AbstractRunnableC10117p {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Map f21978a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ TaskCompletionSource f21979b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C9971aw f21980c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9953ae(C9971aw c9971aw, TaskCompletionSource taskCompletionSource, Map map, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f21978a = map;
        this.f21979b = taskCompletionSource2;
        this.f21980c = c9971aw;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.play.core.assetpacks.internal.f] */
    @Override // com.google.android.play.core.assetpacks.internal.AbstractRunnableC10117p
    /* JADX INFO: renamed from: a */
    protected final void mo22482a() {
        try {
            this.f21980c.f22026f.m22776e().mo22729e(this.f21980c.f22023c, C9971aw.m22503n(this.f21978a), new BinderC9963ao(this.f21980c, this.f21979b));
        } catch (RemoteException e) {
            C9971aw.f22021a.m22751c(e, "syncPacks", new Object[0]);
            this.f21979b.trySetException(new RuntimeException(e));
        }
    }
}

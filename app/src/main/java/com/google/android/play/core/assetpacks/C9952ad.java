package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.internal.AbstractRunnableC10117p;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.ad */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C9952ad extends AbstractRunnableC10117p {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ List f21975a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ TaskCompletionSource f21976b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C9971aw f21977c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9952ad(C9971aw c9971aw, TaskCompletionSource taskCompletionSource, List list, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f21975a = list;
        this.f21976b = taskCompletionSource2;
        this.f21977c = c9971aw;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [android.os.IInterface, com.google.android.play.core.assetpacks.internal.f] */
    @Override // com.google.android.play.core.assetpacks.internal.AbstractRunnableC10117p
    /* JADX INFO: renamed from: a */
    protected final void mo22482a() {
        try {
            this.f21977c.f22026f.m22776e().mo22727c(this.f21977c.f22023c, C9971aw.m22511v(this.f21975a), C9971aw.m22496A(), new BinderC9961am(this.f21977c, this.f21976b));
        } catch (RemoteException e) {
            C9971aw.f22021a.m22751c(e, "cancelDownloads(%s)", this.f21975a);
        }
    }
}

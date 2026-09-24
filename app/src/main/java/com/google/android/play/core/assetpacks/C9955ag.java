package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.internal.AbstractRunnableC10117p;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.ag */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C9955ag extends AbstractRunnableC10117p {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f21986a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f21987b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f21988c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ int f21989d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ TaskCompletionSource f21990e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ C9971aw f21991f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9955ag(C9971aw c9971aw, TaskCompletionSource taskCompletionSource, int i, String str, String str2, int i2, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f21986a = i;
        this.f21987b = str;
        this.f21988c = str2;
        this.f21989d = i2;
        this.f21990e = taskCompletionSource2;
        this.f21991f = c9971aw;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.play.core.assetpacks.internal.f] */
    @Override // com.google.android.play.core.assetpacks.internal.AbstractRunnableC10117p
    /* JADX INFO: renamed from: a */
    protected final void mo22482a() {
        try {
            this.f21991f.f22026f.m22776e().mo22731g(this.f21991f.f22023c, C9971aw.m22500k(this.f21986a, this.f21987b, this.f21988c, this.f21989d), C9971aw.m22496A(), new BinderC9965aq(this.f21991f, this.f21990e));
        } catch (RemoteException e) {
            C9971aw.f22021a.m22751c(e, "notifyChunkTransferred", new Object[0]);
        }
    }
}

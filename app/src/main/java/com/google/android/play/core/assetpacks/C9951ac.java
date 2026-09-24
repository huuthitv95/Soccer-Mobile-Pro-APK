package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.internal.AbstractRunnableC10117p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.ac */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C9951ac extends AbstractRunnableC10117p {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ List f21971a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Map f21972b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ TaskCompletionSource f21973c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C9971aw f21974d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9951ac(C9971aw c9971aw, TaskCompletionSource taskCompletionSource, List list, Map map, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f21971a = list;
        this.f21972b = map;
        this.f21973c = taskCompletionSource2;
        this.f21974d = c9971aw;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [android.os.IInterface, com.google.android.play.core.assetpacks.internal.f] */
    @Override // com.google.android.play.core.assetpacks.internal.AbstractRunnableC10117p
    /* JADX INFO: renamed from: a */
    protected final void mo22482a() {
        ArrayList arrayListM22511v = C9971aw.m22511v(this.f21971a);
        try {
            ?? M22776e = this.f21974d.f22026f.m22776e();
            String str = this.f21974d.f22023c;
            Bundle bundleM22503n = C9971aw.m22503n(this.f21972b);
            C9971aw c9971aw = this.f21974d;
            M22776e.mo22736l(str, arrayListM22511v, bundleM22503n, new BinderC9970av(c9971aw, this.f21973c, c9971aw.f22024d, c9971aw.f22025e));
        } catch (RemoteException e) {
            C9971aw.f22021a.m22751c(e, "startDownload(%s)", this.f21971a);
            this.f21973c.trySetException(new RuntimeException(e));
        }
    }
}

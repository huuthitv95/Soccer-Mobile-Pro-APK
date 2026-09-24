package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.internal.AbstractRunnableC10117p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.af */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C9954af extends AbstractRunnableC10117p {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ List f21981a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Map f21982b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ TaskCompletionSource f21983c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ InterfaceC9980be f21984d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C9971aw f21985e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9954af(C9971aw c9971aw, TaskCompletionSource taskCompletionSource, List list, Map map, TaskCompletionSource taskCompletionSource2, InterfaceC9980be interfaceC9980be) {
        super(taskCompletionSource);
        this.f21981a = list;
        this.f21982b = map;
        this.f21983c = taskCompletionSource2;
        this.f21984d = interfaceC9980be;
        this.f21985e = c9971aw;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [android.os.IInterface, com.google.android.play.core.assetpacks.internal.f] */
    @Override // com.google.android.play.core.assetpacks.internal.AbstractRunnableC10117p
    /* JADX INFO: renamed from: a */
    protected final void mo22482a() {
        ArrayList arrayListM22511v = C9971aw.m22511v(this.f21981a);
        try {
            ?? M22776e = this.f21985e.f22026f.m22776e();
            String str = this.f21985e.f22023c;
            Bundle bundleM22503n = C9971aw.m22503n(this.f21982b);
            C9971aw c9971aw = this.f21985e;
            M22776e.mo22735k(str, arrayListM22511v, bundleM22503n, new BinderC9969au(c9971aw, this.f21983c, c9971aw.f22024d, c9971aw.f22025e, this.f21984d));
        } catch (RemoteException e) {
            C9971aw.f22021a.m22751c(e, "getPackStates(%s)", this.f21981a);
            this.f21983c.trySetException(new RuntimeException(e));
        }
    }
}

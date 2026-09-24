package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.internal.AbstractRunnableC10117p;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.aj */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C9958aj extends AbstractRunnableC10117p {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f22000a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f22001b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f22002c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ int f22003d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ TaskCompletionSource f22004e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ C9971aw f22005f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9958aj(C9971aw c9971aw, TaskCompletionSource taskCompletionSource, int i, String str, String str2, int i2, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f22000a = i;
        this.f22001b = str;
        this.f22002c = str2;
        this.f22003d = i2;
        this.f22004e = taskCompletionSource2;
        this.f22005f = c9971aw;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.play.core.assetpacks.internal.f] */
    @Override // com.google.android.play.core.assetpacks.internal.AbstractRunnableC10117p
    /* JADX INFO: renamed from: a */
    protected final void mo22482a() {
        try {
            this.f22005f.f22026f.m22776e().mo22728d(this.f22005f.f22023c, C9971aw.m22500k(this.f22000a, this.f22001b, this.f22002c, this.f22003d), C9971aw.m22496A(), new BinderC9962an(this.f22005f, this.f22004e));
        } catch (RemoteException e) {
            C9971aw.f22021a.m22750b("getChunkFileDescriptor(%s, %s, %d, session=%d)", this.f22001b, this.f22002c, Integer.valueOf(this.f22003d), Integer.valueOf(this.f22000a));
            this.f22004e.trySetException(new RuntimeException(e));
        }
    }
}

package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.k */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class ResultReceiverC10129k extends ResultReceiver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ TaskCompletionSource f22442a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C10130l f22443b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ResultReceiverC10129k(C10130l c10130l, Handler handler, TaskCompletionSource taskCompletionSource) {
        super(handler);
        this.f22442a = taskCompletionSource;
        this.f22443b = c10130l;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (i == 1) {
            this.f22442a.trySetResult(-1);
            this.f22443b.f22450g.m22610b(null);
        } else if (i != 2) {
            this.f22442a.trySetException(new AssetPackException(-100));
        } else {
            this.f22442a.trySetResult(0);
        }
    }
}

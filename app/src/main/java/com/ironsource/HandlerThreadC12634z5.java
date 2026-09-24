package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.z5 */
/* JADX INFO: loaded from: classes6.dex */
final class HandlerThreadC12634z5 extends HandlerThread {

    /* JADX INFO: renamed from: a */
    private Handler f33243a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerThreadC12634z5(String name) {
        super(name);
        Intrinsics.checkNotNullParameter(name, "name");
    }

    /* JADX INFO: renamed from: a */
    public final void m34256a(Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        Handler handler = this.f33243a;
        if (handler != null) {
            handler.post(task);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m34255a() {
        this.f33243a = new Handler(getLooper());
    }
}

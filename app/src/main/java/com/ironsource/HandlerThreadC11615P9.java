package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.P9 */
/* JADX INFO: loaded from: classes6.dex */
public final class HandlerThreadC11615P9 extends HandlerThread {

    /* JADX INFO: renamed from: a */
    private Handler f25529a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerThreadC11615P9(String name) {
        super(name);
        Intrinsics.checkNotNullParameter(name, "name");
    }

    /* JADX INFO: renamed from: a */
    public final void m27241a(Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        m27239a(this, task, 0L, 2, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m27243b(Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        Handler handler = this.f25529a;
        if (handler != null) {
            handler.removeCallbacks(task);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m27239a(HandlerThreadC11615P9 handlerThreadC11615P9, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        handlerThreadC11615P9.m27242a(runnable, j);
    }

    /* JADX INFO: renamed from: a */
    public final void m27242a(Runnable task, long j) {
        Intrinsics.checkNotNullParameter(task, "task");
        Handler handler = this.f25529a;
        if (handler != null) {
            handler.postDelayed(task, j);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m27240a() {
        this.f25529a = new Handler(getLooper());
    }
}

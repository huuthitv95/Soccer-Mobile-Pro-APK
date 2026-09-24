package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.y */
/* JADX INFO: loaded from: classes4.dex */
public final class ThreadFactoryC8826y implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f20670a;

    public ThreadFactoryC8826y(String str) {
        this.f20670a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f20670a);
    }
}

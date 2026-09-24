package com.mbridge.msdk.config.component.load.downloader.core;

import com.mbridge.msdk.config.component.load.downloader.EnumC12789c;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.core.c */
/* JADX INFO: compiled from: DownloadFutureTask.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12792c extends FutureTask<RunnableC12797h> implements Comparable<C12792c> {

    /* JADX INFO: renamed from: a */
    private final RunnableC12797h f34096a;

    C12792c(RunnableC12797h runnableC12797h) {
        super(runnableC12797h, null);
        this.f34096a = runnableC12797h;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C12792c c12792c) {
        RunnableC12797h runnableC12797h = this.f34096a;
        EnumC12789c enumC12789c = runnableC12797h.f34152a;
        RunnableC12797h runnableC12797h2 = c12792c.f34096a;
        EnumC12789c enumC12789c2 = runnableC12797h2.f34152a;
        return enumC12789c == enumC12789c2 ? runnableC12797h.f34153b - runnableC12797h2.f34153b : enumC12789c2.ordinal() - enumC12789c.ordinal();
    }
}

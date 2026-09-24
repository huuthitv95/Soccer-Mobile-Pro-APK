package com.mbridge.msdk.config.component.load.downloader.core;

import com.mbridge.msdk.config.component.load.downloader.C12788b;
import com.mbridge.msdk.config.component.load.downloader.C12806d;
import com.mbridge.msdk.config.component.load.downloader.EnumC12789c;
import com.mbridge.msdk.config.component.load.downloader.EnumC12811e;
import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.mbridge.msdk.foundation.tools.C13219q0;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.core.h */
/* JADX INFO: compiled from: Downloader.java */
/* JADX INFO: loaded from: classes5.dex */
public class RunnableC12797h implements Runnable {

    /* JADX INFO: renamed from: a */
    public final EnumC12789c f34152a;

    /* JADX INFO: renamed from: b */
    public final int f34153b;

    /* JADX INFO: renamed from: c */
    public volatile C12793d f34154c;

    /* JADX INFO: renamed from: d */
    private volatile C12788b f34155d;

    RunnableC12797h(C12793d<?> c12793d) {
        this.f34154c = c12793d;
        this.f34152a = c12793d.m35384e();
        this.f34153b = c12793d.m35389i();
    }

    @Override // java.lang.Runnable
    public void run() {
        C13219q0.m37813a(IDownloadTask.TAG, "开始下载任务");
        if (this.f34154c.m35390j() != EnumC12811e.RETRY) {
            this.f34154c.m35383d(this.f34154c.m35382d());
        }
        this.f34154c.m35375a(EnumC12811e.RUNNING);
        this.f34155d = this.f34154c.m35382d();
        C13219q0.m37813a(IDownloadTask.TAG, "filePath ： " + this.f34155d.m35355e());
        C12806d c12806dRun = C12796g.m35409a(this.f34154c, this.f34155d, C12801l.m35424c().m35428b()).run();
        if (c12806dRun.m35443c()) {
            this.f34154c.m35385e(this.f34155d);
        } else if (c12806dRun.m35437a() != null) {
            this.f34154c.m35374a(this.f34155d, c12806dRun.m35437a());
        } else if (c12806dRun.m35442b()) {
            this.f34154c.m35379b(this.f34155d);
        }
    }
}

package com.mbridge.msdk.config.component.load.downloader.core;

import com.mbridge.msdk.config.component.load.downloader.C12788b;
import com.mbridge.msdk.config.component.load.downloader.C12806d;
import com.mbridge.msdk.config.component.load.downloader.database.C12808b;
import com.mbridge.msdk.config.component.load.downloader.database.InterfaceC12809c;
import com.mbridge.msdk.config.component.load.downloader.resource.C12815a;
import com.mbridge.msdk.config.component.load.downloader.utils.C12818a;
import com.mbridge.msdk.config.component.load.downloader.utils.C12819b;
import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.io.File;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.core.k */
/* JADX INFO: compiled from: FindFileFromCache.java */
/* JADX INFO: loaded from: classes5.dex */
class C12800k implements InterfaceC12802m {

    /* JADX INFO: renamed from: a */
    private final InterfaceC12809c f34158a;

    /* JADX INFO: renamed from: b */
    private final String f34159b;

    /* JADX INFO: renamed from: c */
    private final C12808b f34160c;

    /* JADX INFO: renamed from: d */
    private final C12793d<?> f34161d;

    /* JADX INFO: renamed from: e */
    private C12788b<?> f34162e;

    private C12800k(C12793d<?> c12793d, C12808b c12808b, InterfaceC12809c interfaceC12809c, String str, C12788b<?> c12788b) {
        this.f34161d = c12793d;
        this.f34160c = c12808b;
        this.f34158a = interfaceC12809c;
        this.f34159b = str;
        this.f34162e = c12788b;
    }

    /* JADX INFO: renamed from: a */
    static InterfaceC12802m m35419a(C12793d<?> c12793d, C12808b c12808b, InterfaceC12809c interfaceC12809c, String str, C12788b<?> c12788b) {
        return new C12800k(c12793d, c12808b, interfaceC12809c, str, c12788b);
    }

    /* JADX INFO: renamed from: b */
    private void m35423b(C12806d c12806d, File file) {
        long length = file.length();
        long jLastModified = file.lastModified();
        this.f34161d.m35378b(this.f34160c.m35470g());
        this.f34161d.m35371a(file.length());
        C12801l.m35424c().m35428b().mo35449a(C12808b.m35454a(this.f34160c.m35462c(), file.getAbsolutePath(), this.f34160c.m35459b(), this.f34160c.m35472i(), jLastModified, this.f34160c.m35470g(), this.f34160c.m35455a(), this.f34160c.m35469f(), this.f34160c.m35465d()), this.f34162e.m35355e());
        c12806d.m35441b(m35422a(length));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.InterfaceC12802m
    public C12806d run() {
        if (C12818a.m35509b(this.f34160c)) {
            return null;
        }
        C12806d c12806d = new C12806d();
        File file = new File(this.f34162e.m35355e());
        if (!C12818a.m35508b(file)) {
            this.f34161d.m35371a(0L);
            this.f34158a.remove(this.f34159b);
            c12806d.m35441b(false);
            return c12806d;
        }
        long jM35501c = C12815a.m35497a().m35501c(file);
        if (jM35501c == this.f34160c.m35470g()) {
            this.f34161d.m35378b(this.f34160c.m35470g());
            this.f34161d.m35371a(jM35501c);
            c12806d.m35441b(m35422a(jM35501c));
            return c12806d;
        }
        boolean zM35421a = m35421a();
        C13219q0.m37813a(IDownloadTask.TAG, "数据库记录和文件大小不一致，是否以文件大小为基准进行断点续传： " + zM35421a);
        if (zM35421a) {
            m35423b(c12806d, file);
            return c12806d;
        }
        m35420a(c12806d, file);
        return c12806d;
    }

    /* JADX INFO: renamed from: a */
    private boolean m35421a() {
        try {
            return Boolean.parseBoolean(this.f34161d.m35369a("do_us_fi_re", Boolean.toString(true)));
        } catch (Exception unused) {
            C13219q0.m37813a(IDownloadTask.TAG, "类型转换错误： do_us_fi_re");
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m35420a(C12806d c12806d, File file) {
        this.f34161d.m35371a(0L);
        this.f34161d.m35378b(0L);
        this.f34158a.remove(this.f34159b);
        C12815a.m35497a().m35499a(file);
        c12806d.m35441b(false);
    }

    /* JADX INFO: renamed from: a */
    private boolean m35422a(long j) {
        return C12819b.m35510a(this.f34160c.m35470g(), j) >= this.f34162e.m35353c();
    }
}

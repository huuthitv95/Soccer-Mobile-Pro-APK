package com.bykv.p028vk.openvk.preload.geckox.p045e;

import com.bykv.p028vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.p028vk.openvk.preload.geckox.p033a.C1909c;
import com.bykv.p028vk.openvk.preload.geckox.p045e.p046a.AbstractC1949a;
import com.bykv.p028vk.openvk.preload.geckox.p045e.p046a.C1950b;
import com.bykv.p028vk.openvk.preload.geckox.p045e.p046a.C1951c;
import com.bykv.p028vk.openvk.preload.geckox.p047f.C1954b;
import com.bykv.p028vk.openvk.preload.geckox.p047f.C1955c;
import com.bykv.p028vk.openvk.preload.geckox.utils.C1970g;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.e.a */
/* JADX INFO: compiled from: ChannelVerLoader.java */
/* JADX INFO: loaded from: classes3.dex */
final class C1948a {

    /* JADX INFO: renamed from: a */
    private String f4406a;

    /* JADX INFO: renamed from: b */
    private String f4407b;

    /* JADX INFO: renamed from: c */
    private volatile File f4408c;

    /* JADX INFO: renamed from: d */
    private volatile Long f4409d;

    /* JADX INFO: renamed from: e */
    private volatile AbstractC1949a f4410e;

    /* JADX INFO: renamed from: f */
    private AtomicBoolean f4411f = new AtomicBoolean(false);

    C1948a(String str, String str2) {
        this.f4406a = str;
        this.f4407b = str2;
    }

    /* JADX INFO: renamed from: a */
    private static String m6004a(String str, String str2) {
        return str2.substring(str.length() + 1);
    }

    /* JADX INFO: renamed from: d */
    private synchronized AbstractC1949a m6005d(String str) throws Exception {
        if (this.f4410e != null) {
            return this.f4410e;
        }
        File fileM6006e = m6006e(str);
        if (fileM6006e == null) {
            throw new FileNotFoundException("channel no exist，channel:".concat(String.valueOf(str)));
        }
        File file = new File(fileM6006e, "res.macv");
        File file2 = new File(fileM6006e, "res");
        if (file2.exists() && file2.isDirectory()) {
            this.f4410e = new C1951c(fileM6006e);
        } else {
            if (!file.exists() || !file.isFile()) {
                throw new RuntimeException("can not find res, dir:" + fileM6006e.getAbsolutePath());
            }
            this.f4410e = new C1950b(fileM6006e);
        }
        return this.f4410e;
    }

    /* JADX INFO: renamed from: e */
    private synchronized File m6006e(String str) throws Exception {
        if (this.f4408c != null) {
            return this.f4408c;
        }
        if (this.f4409d != null && this.f4409d.longValue() == -1) {
            return null;
        }
        C1954b c1954bM6026a = C1954b.m6026a(this.f4406a + File.separator + str + File.separator + "select.lock");
        try {
            if (this.f4409d == null) {
                this.f4409d = C1970g.m6084a(new File(this.f4406a, str));
            }
            if (this.f4409d == null) {
                this.f4409d = -1L;
                c1954bM6026a.m6027a();
                return null;
            }
            File file = new File(this.f4406a, File.separator + str + File.separator + this.f4409d + File.separator + "using.lock");
            this.f4408c = file.getParentFile();
            C1955c.m6028a(file.getAbsolutePath());
            File file2 = this.f4408c;
            c1954bM6026a.m6027a();
            return file2;
        } catch (Throwable th) {
            c1954bM6026a.m6027a();
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    final InputStream m6007a(String str) throws Exception {
        return m6005d(this.f4407b).m6014a(m6004a(this.f4407b, str));
    }

    /* JADX INFO: renamed from: a */
    final Long m6008a() {
        return this.f4409d;
    }

    /* JADX INFO: renamed from: b */
    final String m6009b() {
        return this.f4407b;
    }

    /* JADX INFO: renamed from: b */
    final boolean m6010b(String str) throws Exception {
        return m6005d(this.f4407b).m6016b(m6004a(this.f4407b, str));
    }

    /* JADX INFO: renamed from: c */
    public final int m6011c(String str) {
        int length;
        try {
            File file = new File(m6006e(str), "res");
            if (file.exists() && file.isDirectory() && (length = file.listFiles().length) > 0) {
                return length - 1;
            }
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    final void m6012c() throws Exception {
        if (this.f4411f.getAndSet(true)) {
            return;
        }
        C1954b c1954bM6026a = C1954b.m6026a(this.f4406a + File.separator + this.f4407b + File.separator + "select.lock");
        GeckoLogger.m6040d("gecko-file-lock", "channel version loader clean");
        try {
            if (this.f4408c == null) {
                c1954bM6026a.m6027a();
                return;
            }
            C1955c.m6029b(this.f4408c.getAbsolutePath() + File.separator + "using.lock");
            c1954bM6026a.m6027a();
            C1909c.m5915a(this.f4406a + File.separator + this.f4407b);
        } catch (Throwable th) {
            c1954bM6026a.m6027a();
            throw th;
        }
    }
}

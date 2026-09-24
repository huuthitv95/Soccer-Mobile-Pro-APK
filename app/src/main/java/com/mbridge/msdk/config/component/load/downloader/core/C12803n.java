package com.mbridge.msdk.config.component.load.downloader.core;

import com.google.common.net.HttpHeaders;
import com.mbridge.msdk.config.component.common.file.C12752a;
import com.mbridge.msdk.config.component.load.downloader.C12788b;
import com.mbridge.msdk.config.component.load.downloader.C12806d;
import com.mbridge.msdk.config.component.load.downloader.DownloadProgress;
import com.mbridge.msdk.config.component.load.downloader.EnumC12811e;
import com.mbridge.msdk.config.component.load.downloader.database.C12808b;
import com.mbridge.msdk.config.component.load.downloader.database.InterfaceC12809c;
import com.mbridge.msdk.config.component.load.downloader.resource.C12815a;
import com.mbridge.msdk.config.component.load.downloader.resource.stream.InterfaceC12816a;
import com.mbridge.msdk.config.component.load.downloader.utils.C12818a;
import com.mbridge.msdk.config.component.load.downloader.utils.C12819b;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13223s0;
import com.mbridge.msdk.thrid.okhttp.AbstractC13711b0;
import com.mbridge.msdk.thrid.okhttp.C13709a0;
import com.mbridge.msdk.thrid.okhttp.C13712c;
import com.mbridge.msdk.thrid.okhttp.C13786v;
import com.mbridge.msdk.thrid.okhttp.C13789y;
import com.mbridge.msdk.thrid.okhttp.InterfaceC13714d;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.core.n */
/* JADX INFO: compiled from: OkHTTPFileDownloadTask.java */
/* JADX INFO: loaded from: classes5.dex */
class C12803n implements InterfaceC12802m {

    /* JADX INFO: renamed from: a */
    private final InterfaceC12809c f34169a;

    /* JADX INFO: renamed from: b */
    private final C12793d f34170b;

    /* JADX INFO: renamed from: c */
    private volatile C12788b f34171c;

    /* JADX INFO: renamed from: d */
    private C12808b f34172d;

    /* JADX INFO: renamed from: e */
    private C12806d f34173e;

    /* JADX INFO: renamed from: f */
    private InputStream f34174f;

    /* JADX INFO: renamed from: g */
    private InterfaceC12816a f34175g;

    /* JADX INFO: renamed from: h */
    private AbstractC13711b0 f34176h;

    /* JADX INFO: renamed from: i */
    private String f34177i;

    /* JADX INFO: renamed from: j */
    private long f34178j;

    private C12803n(C12793d c12793d, C12808b c12808b, InterfaceC12809c interfaceC12809c, C12788b c12788b) {
        this.f34170b = c12793d;
        this.f34172d = c12808b;
        this.f34169a = interfaceC12809c;
        this.f34171c = c12788b;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC12802m m35430a(C12793d c12793d, C12808b c12808b, InterfaceC12809c interfaceC12809c, C12788b c12788b) {
        return new C12803n(c12793d, c12808b, interfaceC12809c, c12788b);
    }

    /* JADX INFO: renamed from: a */
    private boolean m35435a(int i, C12808b c12808b) {
        return i == 206;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x01a9  */
    @Override // com.mbridge.msdk.config.component.load.downloader.core.InterfaceC12802m
    public C12806d run() {
        this.f34173e = new C12806d();
        if (this.f34170b.m35390j() == EnumC12811e.CANCELLED) {
            this.f34173e.m35440a(true);
            return this.f34173e;
        }
        long jM35392l = this.f34170b.m35392l();
        long jM35387g = this.f34170b.m35387g();
        C12819b.m35510a(jM35392l, jM35387g);
        if (jM35392l != 0 && jM35387g != 0 && jM35392l == jM35387g) {
            this.f34173e.m35441b(true);
            return this.f34173e;
        }
        String strM35355e = this.f34171c.m35355e();
        String strM35354d = this.f34171c.m35354d();
        long jM35391k = this.f34170b.m35391k();
        long jM35380c = this.f34170b.m35380c();
        long jM35388h = this.f34170b.m35388h();
        long jM35393m = this.f34170b.m35393m();
        String str = String.format(Locale.ENGLISH, "bytes=%d-", Long.valueOf(jM35387g));
        try {
            C13786v.b bVarM40790s = C12801l.m35424c().m35429d().m40790s();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            InterfaceC13714d interfaceC13714dM40774a = bVarM40790s.m40807b(jM35380c, timeUnit).m40804a(new MBridgeHostnameVerifier(strM35354d)).m40810d(jM35388h, timeUnit).m40811e(jM35393m, timeUnit).m40798a(Math.max(0L, jM35391k), timeUnit).m40808b(true).m40806a().m40774a(new C13789y.a().m40842b(strM35354d).m40832a(new C13712c.a().m40218b().m40217a()).m40838a(HttpHeaders.CONNECTION, "close").m40838a("Range", str).m40836a("User-Agent").m40838a("User-Agent", Command.DEFAULT_USER_AGENT).m40839a());
            try {
                try {
                    C13709a0 c13709a0Mo40225d = interfaceC13714dM40774a.mo40225d();
                    if (!C12818a.m35509b(c13709a0Mo40225d) && !C12818a.m35509b(c13709a0Mo40225d.m40167d())) {
                        int iM40169k = c13709a0Mo40225d.m40169k();
                        if (c13709a0Mo40225d.m40172n()) {
                            this.f34173e = m35432a(strM35355e, strM35354d, c13709a0Mo40225d, iM40169k);
                            C12818a.m35505a(this.f34174f);
                            C12818a.m35502a(this.f34175g);
                            C12818a.m35503a(c13709a0Mo40225d);
                            C12818a.m35504a(this.f34176h);
                            if (!interfaceC13714dM40774a.mo40226h()) {
                                interfaceC13714dM40774a.cancel();
                            }
                            return this.f34173e;
                        }
                        this.f34173e.m35439a(new IOException("responseCode " + iM40169k));
                        C12806d c12806d = this.f34173e;
                        C12818a.m35505a(this.f34174f);
                        C12818a.m35502a(this.f34175g);
                        C12818a.m35503a(c13709a0Mo40225d);
                        C12818a.m35504a(this.f34176h);
                        if (!interfaceC13714dM40774a.mo40226h()) {
                            interfaceC13714dM40774a.cancel();
                        }
                        return c12806d;
                    }
                    this.f34173e.m35439a(new IOException("response is null"));
                    C12806d c12806d2 = this.f34173e;
                    C12818a.m35505a(this.f34174f);
                    C12818a.m35502a(this.f34175g);
                    C12818a.m35503a(c13709a0Mo40225d);
                    C12818a.m35504a(this.f34176h);
                    if (!interfaceC13714dM40774a.mo40226h()) {
                        interfaceC13714dM40774a.cancel();
                    }
                    return c12806d2;
                } catch (Exception e) {
                    m35434a(strM35355e, strM35354d, e);
                    C12818a.m35505a(this.f34174f);
                    C12818a.m35502a(this.f34175g);
                    C12818a.m35503a((C13709a0) null);
                    C12818a.m35504a(this.f34176h);
                    if (!interfaceC13714dM40774a.mo40226h()) {
                        interfaceC13714dM40774a.cancel();
                    }
                }
            } catch (Throwable th) {
                C12818a.m35505a(this.f34174f);
                C12818a.m35502a(this.f34175g);
                C12818a.m35503a((C13709a0) null);
                C12818a.m35504a(this.f34176h);
                if (!interfaceC13714dM40774a.mo40226h()) {
                    interfaceC13714dM40774a.cancel();
                }
                throw th;
            }
        } catch (Exception e2) {
            m35434a(strM35355e, strM35354d, e2);
            this.f34173e.m35441b(false);
            return this.f34173e;
        }
    }

    /* JADX INFO: renamed from: a */
    private C12806d m35432a(String str, String str2, C13709a0 c13709a0, int i) throws IllegalAccessException, IOException {
        C12806d c12806d = new C12806d();
        boolean zM35435a = m35435a(i, this.f34172d);
        boolean z = (c13709a0 == null || this.f34170b == null || i != 206 || c13709a0.m40167d() == null || this.f34170b.m35392l() <= 0 || c13709a0.m40167d().mo40201k() == this.f34170b.m35392l() - this.f34170b.m35387g()) ? false : true;
        if (!zM35435a && z) {
            this.f34170b.m35371a(0L);
            this.f34170b.m35378b(0L);
            if (C12818a.m35507a(this.f34169a)) {
                this.f34169a.remove(str2, str);
            }
            this.f34172d = null;
            C12815a.m35497a().m35499a(new File(this.f34171c.m35355e()));
        }
        AbstractC13711b0 abstractC13711b0M40167d = c13709a0.m40167d();
        this.f34176h = abstractC13711b0M40167d;
        if (C12818a.m35509b(abstractC13711b0M40167d)) {
            c12806d.m35439a(new IOException("response body is null"));
            this.f34170b.m35378b(0L);
            this.f34170b.m35371a(0L);
            return c12806d;
        }
        long jMo40201k = this.f34176h.mo40201k();
        String strM40165a = c13709a0.m40165a("Content-Type", "");
        this.f34177i = strM40165a;
        this.f34170b.m35376a(strM40165a);
        if (jMo40201k <= 0) {
            c12806d.m35439a(new IOException("response content length is null"));
            return c12806d;
        }
        if (this.f34170b.m35392l() == 0) {
            this.f34170b.m35378b(jMo40201k);
        }
        InputStream inputStreamM40200d = this.f34176h.m40200d();
        this.f34174f = inputStreamM40200d;
        if (C12818a.m35509b(inputStreamM40200d)) {
            c12806d.m35439a(new IOException("response inputStream is null"));
            return c12806d;
        }
        this.f34171c.m35348a(this.f34170b.m35392l());
        this.f34170b.m35381c(this.f34171c);
        return m35431a(str, str2);
    }

    /* JADX INFO: renamed from: a */
    private void m35434a(String str, String str2, Exception exc) {
        try {
            if (C12818a.m35507a(this.f34169a) && C12818a.m35507a(this.f34170b)) {
                if (!C13223s0.m37831a().m37842a("r_f_s_d_e", true)) {
                    this.f34169a.remove(str2, str);
                    C12815a.m35497a().m35499a(new File(str));
                }
                this.f34170b.m35371a(0L);
                this.f34170b.m35378b(0L);
            }
        } catch (Exception e) {
            C13219q0.m37817b(IDownloadTask.TAG, e.getMessage(), e);
        }
        this.f34173e.m35439a(exc);
    }

    /* JADX INFO: renamed from: a */
    private C12806d m35431a(String str, String str2) throws IllegalAccessException, IOException {
        String str3;
        C12806d c12806d = new C12806d();
        this.f34178j = System.currentTimeMillis();
        if (C12818a.m35509b(this.f34172d)) {
            C12808b c12808bM35454a = C12808b.m35454a(this.f34171c.m35354d(), str, this.f34178j, 0L, System.currentTimeMillis(), this.f34170b.m35392l(), this.f34177i, 0, "");
            str3 = str;
            this.f34172d = c12808bM35454a;
            this.f34169a.mo35448a(c12808bM35454a);
        } else {
            str3 = str;
            C12808b c12808bM35454a2 = C12808b.m35454a(this.f34172d.m35462c(), this.f34172d.m35468e(), this.f34172d.m35459b(), this.f34172d.m35472i(), this.f34172d.m35471h(), this.f34172d.m35470g(), this.f34177i, 0, this.f34172d.m35465d());
            this.f34172d = c12808bM35454a2;
            this.f34169a.mo35449a(c12808bM35454a2, str3);
        }
        InterfaceC12816a interfaceC12816aM35500b = C12815a.m35497a().m35500b(new File(str3));
        this.f34175g = interfaceC12816aM35500b;
        interfaceC12816aM35500b.seek(this.f34170b.m35387g());
        byte[] bArr = new byte[C12801l.m35424c().m35426a()];
        while (true) {
            int i = this.f34174f.read(bArr);
            if (i == -1) {
                break;
            }
            this.f34175g.write(bArr, 0, i);
            C12793d c12793d = this.f34170b;
            c12793d.m35371a(c12793d.m35387g() + ((long) i));
            this.f34175g.flushAndSync();
            int iM35510a = C12819b.m35510a(this.f34170b.m35392l(), this.f34170b.m35387g());
            m35433a(this.f34170b, this.f34171c, this.f34170b.m35387g(), this.f34170b.m35392l(), iM35510a);
            if (this.f34171c.m35353c() != 100 && iM35510a >= this.f34171c.m35353c()) {
                break;
            }
            if (this.f34170b.m35390j() == EnumC12811e.CANCELLED) {
                c12806d.m35440a(true);
                break;
            }
        }
        C12801l.m35424c().m35428b().mo35450a(str2, str3, C12808b.m35454a(this.f34171c.m35354d(), this.f34171c.m35355e(), this.f34178j, System.currentTimeMillis(), 0L, this.f34170b.m35392l(), this.f34177i, 0, ""));
        try {
            if (this.f34170b.m35390j() != EnumC12811e.CANCELLED && this.f34170b.m35392l() == this.f34170b.m35387g()) {
                String strM35054c = C12752a.m35054c(this.f34171c.m35355e());
                this.f34171c.m35349a(strM35054c);
                this.f34169a.mo35449a(C12808b.m35454a(this.f34171c.m35354d(), this.f34171c.m35355e(), this.f34178j, System.currentTimeMillis(), System.currentTimeMillis(), this.f34170b.m35392l(), this.f34177i, 1, strM35054c), this.f34171c.m35355e());
            }
        } catch (Throwable th) {
            C13219q0.m37817b(IDownloadTask.TAG, th.getMessage(), th);
        }
        if (!c12806d.m35442b()) {
            c12806d.m35441b(true);
        }
        return c12806d;
    }

    /* JADX INFO: renamed from: a */
    private void m35433a(C12793d c12793d, C12788b c12788b, long j, long j2, int i) {
        if (c12793d.m35390j() != EnumC12811e.CANCELLED) {
            if (c12788b != null) {
                c12788b.m35347a(i);
                c12788b.m35348a(j2);
            }
            c12793d.m35373a(c12788b, new DownloadProgress(j, j2, i));
        }
    }
}

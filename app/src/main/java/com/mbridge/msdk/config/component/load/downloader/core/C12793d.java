package com.mbridge.msdk.config.component.load.downloader.core;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.load.downloader.C12787a;
import com.mbridge.msdk.config.component.load.downloader.C12788b;
import com.mbridge.msdk.config.component.load.downloader.DownloadProgress;
import com.mbridge.msdk.config.component.load.downloader.EnumC12789c;
import com.mbridge.msdk.config.component.load.downloader.EnumC12811e;
import com.mbridge.msdk.config.component.load.downloader.InterfaceC12814h;
import com.mbridge.msdk.config.component.load.downloader.utils.C12818a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.core.d */
/* JADX INFO: compiled from: DownloadRequest.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12793d<T> {

    /* JADX INFO: renamed from: a */
    private long f34097a;

    /* JADX INFO: renamed from: b */
    private C12788b<T> f34098b;

    /* JADX INFO: renamed from: c */
    private EnumC12789c f34099c;

    /* JADX INFO: renamed from: d */
    private long f34100d;

    /* JADX INFO: renamed from: e */
    private Map<String, String> f34101e;

    /* JADX INFO: renamed from: f */
    private Future f34102f;

    /* JADX INFO: renamed from: g */
    private HashMap<String, List<String>> f34103g;

    /* JADX INFO: renamed from: h */
    private volatile InterfaceC12814h f34104h;

    /* JADX INFO: renamed from: i */
    private long f34105i;

    /* JADX INFO: renamed from: j */
    private int f34106j;

    /* JADX INFO: renamed from: l */
    private int f34108l;

    /* JADX INFO: renamed from: m */
    private EnumC12811e f34109m;

    /* JADX INFO: renamed from: n */
    private long f34110n;

    /* JADX INFO: renamed from: p */
    private String f34112p;

    /* JADX INFO: renamed from: q */
    private String f34113q;

    /* JADX INFO: renamed from: r */
    private long f34114r;

    /* JADX INFO: renamed from: k */
    private volatile int f34107k = 0;

    /* JADX INFO: renamed from: o */
    private long f34111o = 0;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.core.d$a */
    /* JADX INFO: compiled from: DownloadRequest.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C12788b f34115a;

        a(C12788b c12788b) {
            this.f34115a = c12788b;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (C12793d.this.f34104h != null) {
                    C12793d.this.f34104h.mo35337a(this.f34115a);
                }
                C12793d.this.m35364b();
            } catch (Exception e) {
                C13219q0.m37816b("DownloadRequest", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.core.d$b */
    /* JADX INFO: compiled from: DownloadRequest.java */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C12788b f34117a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C12787a f34118b;

        b(C12788b c12788b, C12787a c12787a) {
            this.f34117a = c12788b;
            this.f34118b = c12787a;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (C12793d.this.f34107k >= C12793d.this.f34106j) {
                    C12793d.this.m35375a(EnumC12811e.FAILED);
                    if (C12793d.this.f34104h != null) {
                        C12793d.this.f34104h.mo35339a(this.f34117a, this.f34118b);
                    }
                    C12793d.this.m35364b();
                    return;
                }
                C12793d.this.m35375a(EnumC12811e.RETRY);
                C12793d.this.f34107k++;
                C12793d.this.m35371a(0L);
                C12793d.this.m35378b(0L);
                C12795f.m35401a().m35406b(C12793d.this);
                C12795f.m35401a().m35404a(C12793d.this);
            } catch (Exception e) {
                C13219q0.m37816b("DownloadRequest", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.core.d$c */
    /* JADX INFO: compiled from: DownloadRequest.java */
    class c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C12788b f34120a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ DownloadProgress f34121b;

        c(C12788b c12788b, DownloadProgress downloadProgress) {
            this.f34120a = c12788b;
            this.f34121b = downloadProgress;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (C12793d.this.f34104h != null) {
                    C12793d.this.f34104h.mo35338a(this.f34120a, this.f34121b);
                }
            } catch (Exception e) {
                C13219q0.m37816b("DownloadRequest", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.core.d$d */
    /* JADX INFO: compiled from: DownloadRequest.java */
    class d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C12788b f34123a;

        d(C12788b c12788b) {
            this.f34123a = c12788b;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (C12793d.this.f34104h != null) {
                    C12793d.this.f34104h.mo35341c(this.f34123a);
                }
            } catch (Exception e) {
                C13219q0.m37816b("DownloadRequest", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.core.d$e */
    /* JADX INFO: compiled from: DownloadRequest.java */
    class e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C12788b f34125a;

        e(C12788b c12788b) {
            this.f34125a = c12788b;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (C12793d.this.f34104h != null) {
                    C12793d.this.f34104h.mo35340b(this.f34125a);
                }
            } catch (Exception e) {
                C13219q0.m37816b("DownloadRequest", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.core.d$f */
    /* JADX INFO: compiled from: DownloadRequest.java */
    class f implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C12788b f34127a;

        f(C12788b c12788b) {
            this.f34127a = c12788b;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (C12793d.this.f34101e != null && !C12793d.this.f34101e.isEmpty()) {
                    String str = (String) C12793d.this.f34101e.get("responseHeaders");
                    if (!TextUtils.isEmpty(str)) {
                        this.f34127a.m35350a("responseHeaders", str);
                    }
                }
                if (C12793d.this.f34104h != null) {
                    C12793d.this.f34104h.mo35342d(this.f34127a);
                }
                C12793d.this.m35364b();
            } catch (Exception e) {
                C13219q0.m37816b("DownloadRequest", e.getMessage());
            }
        }
    }

    C12793d(C12794e<T> c12794e) {
        this.f34103g = c12794e.f34134f;
        this.f34099c = c12794e.f34131c;
        this.f34105i = c12794e.f34135g;
        this.f34097a = c12794e.f34129a;
        this.f34112p = c12794e.f34138j;
        this.f34098b = c12794e.f34130b;
        this.f34114r = c12794e.f34139k;
        this.f34104h = c12794e.f34132d;
        this.f34106j = c12794e.f34136h;
        this.f34110n = c12794e.f34137i;
        this.f34101e = c12794e.f34133e;
    }

    /* JADX INFO: renamed from: f */
    public String m35386f() {
        C12788b<T> c12788b = this.f34098b;
        if (c12788b != null) {
            return c12788b.m35354d();
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public long m35387g() {
        return this.f34100d;
    }

    /* JADX INFO: renamed from: h */
    public long m35388h() {
        return this.f34105i;
    }

    /* JADX INFO: renamed from: i */
    public int m35389i() {
        return this.f34108l;
    }

    /* JADX INFO: renamed from: j */
    public EnumC12811e m35390j() {
        return this.f34109m;
    }

    /* JADX INFO: renamed from: k */
    public long m35391k() {
        return this.f34110n;
    }

    /* JADX INFO: renamed from: l */
    public long m35392l() {
        return this.f34111o;
    }

    /* JADX INFO: renamed from: m */
    public long m35393m() {
        return this.f34114r;
    }

    /* JADX INFO: renamed from: n */
    public void m35394n() {
        C12795f.m35401a().m35404a(this);
    }

    /* JADX INFO: renamed from: b */
    public void m35378b(long j) {
        this.f34111o = j;
    }

    /* JADX INFO: renamed from: c */
    public long m35380c() {
        return this.f34097a;
    }

    /* JADX INFO: renamed from: d */
    public C12788b<T> m35382d() {
        return this.f34098b;
    }

    /* JADX INFO: renamed from: e */
    public EnumC12789c m35384e() {
        return this.f34099c;
    }

    /* JADX INFO: renamed from: a */
    public static C12793d m35361a(C12794e c12794e) {
        return new C12793d(c12794e);
    }

    /* JADX INFO: renamed from: b */
    public void m35379b(C12788b<T> c12788b) {
        C12798i.m35415b().m35416a().getDownloadResultTasks().execute(new a(c12788b));
    }

    /* JADX INFO: renamed from: c */
    public void m35381c(C12788b<T> c12788b) {
        if (this.f34109m != EnumC12811e.CANCELLED) {
            C12798i.m35415b().m35416a().getDownloadResultTasks().execute(new e(c12788b));
        }
    }

    /* JADX INFO: renamed from: d */
    public void m35383d(C12788b<T> c12788b) {
        if (this.f34109m != EnumC12811e.CANCELLED) {
            C12798i.m35415b().m35416a().getDownloadResultTasks().execute(new d(c12788b));
        }
    }

    /* JADX INFO: renamed from: e */
    public void m35385e(C12788b<T> c12788b) {
        if (this.f34109m != EnumC12811e.CANCELLED) {
            m35375a(EnumC12811e.COMPLETED);
            C12798i.m35415b().m35416a().getDownloadResultTasks().execute(new f(c12788b));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m35364b() {
        m35363a();
        C12795f.m35401a().m35406b(this);
    }

    /* JADX INFO: renamed from: a */
    public void m35372a(C12788b<T> c12788b) {
        this.f34109m = EnumC12811e.CANCELLED;
        Future future = this.f34102f;
        if (future != null) {
            future.cancel(false);
        }
    }

    /* JADX INFO: renamed from: a */
    public String m35369a(String str, String str2) {
        if (!C12818a.m35509b(this.f34101e) && this.f34101e.containsKey(str) && !TextUtils.isEmpty(str)) {
            String str3 = this.f34101e.get(str);
            if (!TextUtils.isEmpty(str3)) {
                return str3;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: a */
    public void m35371a(long j) {
        this.f34100d = j;
    }

    /* JADX INFO: renamed from: a */
    public void m35370a(int i) {
        this.f34108l = i;
    }

    /* JADX INFO: renamed from: a */
    public void m35375a(EnumC12811e enumC12811e) {
        this.f34109m = enumC12811e;
    }

    /* JADX INFO: renamed from: a */
    public void m35376a(String str) {
        this.f34113q = str;
    }

    /* JADX INFO: renamed from: a */
    private void m35363a() {
        this.f34104h = null;
    }

    /* JADX INFO: renamed from: a */
    public void m35374a(C12788b<T> c12788b, C12787a c12787a) {
        if (this.f34109m != EnumC12811e.CANCELLED) {
            m35375a(EnumC12811e.FAILED);
            C12798i.m35415b().m35416a().getDownloadResultTasks().execute(new b(c12788b, c12787a));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m35373a(C12788b<T> c12788b, DownloadProgress downloadProgress) {
        if (this.f34109m != EnumC12811e.CANCELLED) {
            C12798i.m35415b().m35416a().getDownloadResultTasks().execute(new c(c12788b, downloadProgress));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m35377a(Future future) {
        this.f34102f = future;
    }
}

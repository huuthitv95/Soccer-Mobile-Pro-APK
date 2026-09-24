package com.mbridge.msdk.tracker;

import android.util.Log;
import com.mbridge.msdk.tracker.network.AbstractC13831b0;
import com.mbridge.msdk.tracker.network.AbstractC13850t;
import com.mbridge.msdk.tracker.network.C13836f;
import com.mbridge.msdk.tracker.network.C13866u;
import com.mbridge.msdk.tracker.network.C13867v;
import com.mbridge.msdk.tracker.network.toolbox.C13852b;
import com.mbridge.msdk.tracker.network.toolbox.C13865o;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.o */
/* JADX INFO: compiled from: Network.java */
/* JADX INFO: loaded from: classes7.dex */
class C13872o {

    /* JADX INFO: renamed from: a */
    private InterfaceC13875r f39594a;

    /* JADX INFO: renamed from: b */
    private final int f39595b;

    /* JADX INFO: renamed from: c */
    private final C13873p f39596c;

    /* JADX INFO: renamed from: d */
    private final AbstractC13880w f39597d;

    /* JADX INFO: renamed from: e */
    private final int f39598e;

    /* JADX INFO: renamed from: f */
    private C13866u f39599f;

    /* JADX INFO: renamed from: g */
    private final Executor f39600g;

    /* JADX INFO: renamed from: com.mbridge.msdk.tracker.o$a */
    /* JADX INFO: compiled from: Network.java */
    class a implements ThreadFactory {
        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "MBridgeReportResponseThread");
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.tracker.o$b */
    /* JADX INFO: compiled from: Network.java */
    private static final class b implements C13867v.a {

        /* JADX INFO: renamed from: a */
        private final InterfaceC13875r f39602a;

        /* JADX INFO: renamed from: b */
        private final C13877t f39603b;

        public b(InterfaceC13875r interfaceC13875r, C13877t c13877t) {
            this.f39602a = interfaceC13875r;
            this.f39603b = c13877t;
        }

        @Override // com.mbridge.msdk.tracker.network.C13867v.a
        /* JADX INFO: renamed from: a */
        public void mo41117a(AbstractC13831b0 abstractC13831b0) {
            int iMo41087d;
            int iM41091g;
            String message;
            if (C13882y.m41414a(this.f39602a)) {
                if (abstractC13831b0 != null) {
                    try {
                        iMo41087d = abstractC13831b0.mo41087d();
                        iM41091g = abstractC13831b0.m41091g();
                        message = abstractC13831b0.getMessage();
                    } catch (Exception e) {
                        if (C13814a.f39370a) {
                            Log.e("TrackManager", "onErrorResponse error", e);
                            return;
                        }
                        return;
                    }
                } else {
                    message = "";
                    iMo41087d = 0;
                    iM41091g = 0;
                }
                this.f39602a.mo41346a(this.f39603b, 0, String.format("volleyError:%s,responseCode:%s,errorMessage:%s", Integer.valueOf(iMo41087d), Integer.valueOf(iM41091g), message));
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.tracker.o$c */
    /* JADX INFO: compiled from: Network.java */
    private static final class c implements C13867v.b {

        /* JADX INFO: renamed from: a */
        private final InterfaceC13875r f39604a;

        /* JADX INFO: renamed from: b */
        private final C13877t f39605b;

        public c(InterfaceC13875r interfaceC13875r, C13877t c13877t) {
            this.f39604a = interfaceC13875r;
            this.f39605b = c13877t;
        }

        @Override // com.mbridge.msdk.tracker.network.C13867v.b
        /* JADX INFO: renamed from: a */
        public void mo41337a(Object obj) {
            if (C13882y.m41414a(this.f39604a)) {
                try {
                    this.f39604a.mo41345a(this.f39605b);
                } catch (Exception e) {
                    if (C13814a.f39370a) {
                        Log.e("TrackManager", "onResponse error", e);
                    }
                }
            }
        }
    }

    public C13872o(int i, C13873p c13873p, AbstractC13880w abstractC13880w, int i2) {
        this.f39595b = i;
        this.f39596c = c13873p;
        this.f39597d = abstractC13880w;
        this.f39598e = i2;
        this.f39600g = new ThreadPoolExecutor(i, i, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
    }

    /* JADX INFO: renamed from: a */
    private C13879v<Object> m41338a(C13877t c13877t, Map<String, String> map, boolean z) {
        C13879v<Object> c13879v = this.f39598e == 1 ? new C13879v<>(this.f39596c.m41344c(), 1, this.f39596c.m41342a()) : new C13879v<>(this.f39596c.m41344c(), 1);
        c13879v.m41390a(map);
        c13879v.m41219a(false);
        c13879v.m41231c(true);
        c13879v.m41227b(true);
        c13879v.m41389a(this.f39597d);
        c13879v.m41387a(z ? AbstractC13850t.a.HIGH : AbstractC13850t.a.NORMAL);
        c13879v.m41388a((C13867v.b<Object>) new c(this.f39594a, c13877t));
        c13879v.m41222a((C13867v.a) new b(this.f39594a, c13877t));
        return c13879v;
    }

    /* JADX INFO: renamed from: a */
    private void m41339a() {
        if (C13882y.m41414a(this.f39599f)) {
            return;
        }
        C13866u c13866uM41319a = C13865o.m41319a(new C13852b(this.f39596c.m41343b()), new C13836f(this.f39600g), this.f39595b, null);
        this.f39599f = c13866uM41319a;
        c13866uM41319a.m41329b();
    }

    /* JADX INFO: renamed from: a */
    public void m41340a(InterfaceC13875r interfaceC13875r) {
        this.f39594a = interfaceC13875r;
    }

    /* JADX INFO: renamed from: b */
    public void m41341b(C13877t c13877t, Map<String, String> map, boolean z) {
        if (C13882y.m41417b(map)) {
            InterfaceC13875r interfaceC13875r = this.f39594a;
            if (interfaceC13875r != null) {
                try {
                    interfaceC13875r.mo41346a(c13877t, 0, "params is null");
                    return;
                } catch (Exception e) {
                    if (C13814a.f39370a) {
                        Log.e("TrackManager", "send error", e);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        try {
            m41339a();
            this.f39599f.m41327a(m41338a(c13877t, map, z));
        } catch (Exception e2) {
            if (C13814a.f39370a) {
                Log.e("TrackManager", "send error", e2);
            }
            if (C13882y.m41414a(this.f39594a)) {
                this.f39594a.mo41346a(c13877t, 0, e2.getMessage());
            }
        }
    }
}

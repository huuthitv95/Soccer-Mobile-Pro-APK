package com.fyber.inneractive.sdk.network;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.features.C7984l;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.IAlog;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.l0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8392l0 {

    /* JADX INFO: renamed from: g */
    public static final ThreadFactoryC8380h0 f18672g = new ThreadFactoryC8380h0();

    /* JADX INFO: renamed from: a */
    public final PriorityBlockingQueue f18673a = new PriorityBlockingQueue(100, new C8389k0());

    /* JADX INFO: renamed from: b */
    public volatile boolean f18674b = false;

    /* JADX INFO: renamed from: c */
    public final Handler f18675c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d */
    public final ThreadPoolExecutor f18676d = new ThreadPoolExecutor(6, 6, 1000, TimeUnit.SECONDS, new LinkedBlockingQueue(100), f18672g);

    /* JADX INFO: renamed from: e */
    public final RunnableC8383i0 f18677e = new RunnableC8383i0(this);

    /* JADX INFO: renamed from: f */
    public final C8387j1 f18678f = new C8387j1();

    /* JADX INFO: renamed from: a */
    public static void m20763a() throws C8359b {
        Boolean boolMo20420c = ((C7984l) IAConfigManager.f17654M.f17667K.m20432a(C7984l.class)).mo20420c("should_use_is_network_connected");
        boolean z = false;
        if (boolMo20420c != null ? boolMo20420c.booleanValue() : false) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) AbstractC9174o.f21470a.getSystemService("connectivity");
                NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
                if (AbstractC9174o.m21996a("android.permission.ACCESS_NETWORK_STATE") && activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
                    z = true;
                }
            } catch (Throwable unused) {
                IAlog.m21946b("Error retrieved when trying to get the network state - Perhaps you forgot to declare android.permission.ACCESS_NETWORK_STATE in your Android manifest file.", new Object[0]);
            }
            if (!z) {
                throw new C8359b("No network connection");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m20764a(AbstractC8416t0 abstractC8416t0, C8391l c8391l, C8401o0 c8401o0) {
        try {
            if (abstractC8416t0.f18711a || abstractC8416t0.mo20792h() == null || c8401o0 == null || c8391l == null || c8391l.f18666a != 200) {
                return;
            }
            abstractC8416t0.mo20788a(c8401o0, abstractC8416t0.mo20792h(), c8391l.f18670e);
        } catch (Exception e) {
            IAlog.m21945a("Failed cache network response data for url: %s msg: %s", abstractC8416t0.mo20732r(), e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m20765a(AbstractC8416t0 abstractC8416t0, C8401o0 c8401o0) {
        try {
            if (abstractC8416t0.f18711a || c8401o0 == null) {
                return;
            }
            abstractC8416t0.m20789a(c8401o0.f18690a, (Exception) null, false);
        } catch (Exception e) {
            IAlog.m21945a("failed notifying the listener request complete for url: %s msg: %s", abstractC8416t0.mo20732r(), e.getMessage());
            if (abstractC8416t0.f18711a) {
                return;
            }
            abstractC8416t0.m20789a((Object) null, e, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0049  */
    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    /* JADX INFO: renamed from: a */
    public final C8391l m20766a(AbstractC8416t0 abstractC8416t0, C8356a c8356a) throws Exception {
        try {
            if (abstractC8416t0.f18711a) {
                return null;
            }
            String str = c8356a != null ? c8356a.f18619a : "";
            m20763a();
            return abstractC8416t0.mo20744a(str);
        } catch (C8359b e) {
            e = e;
            IAlog.m21945a("failed sending network request for url: %s msg: %s", abstractC8416t0.mo20732r(), e.getMessage());
            if (m20770c(abstractC8416t0)) {
                throw new C8417t1(e);
            }
            throw new C8414s1(e);
        } catch (C8417t1 e2) {
            IAlog.m21945a("failed sending network request but will retry url: %s msg: %s", abstractC8416t0.mo20732r(), e2.getMessage());
            if (m20770c(abstractC8416t0)) {
                throw e2;
            }
            throw new C8414s1(e2);
        } catch (SocketTimeoutException e3) {
            e = e3;
            IAlog.m21945a("failed sending network request for url: %s msg: %s", abstractC8416t0.mo20732r(), e.getMessage());
            if (m20770c(abstractC8416t0)) {
                throw new C8417t1(e);
            }
            throw new C8414s1(e);
        } catch (UnknownHostException e4) {
            e = e4;
            IAlog.m21945a("failed sending network request for url: %s msg: %s", abstractC8416t0.mo20732r(), e.getMessage());
            if (m20770c(abstractC8416t0)) {
                throw new C8417t1(e);
            }
            throw new C8414s1(e);
        } catch (Exception e5) {
            IAlog.m21945a("failed sending network request for url: %s msg: %s", abstractC8416t0.mo20732r(), e5.getMessage());
            throw e5;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C8401o0 m20767a(AbstractC8416t0 abstractC8416t0, C8391l c8391l) throws Exception {
        if (c8391l != null) {
            try {
                if (!abstractC8416t0.f18711a) {
                    int i = c8391l.f18666a;
                    if (i != 200 && (i < 300 || i >= 304)) {
                        if (i == 304) {
                            abstractC8416t0.m20789a((Object) null, (Exception) new C8376g(), false);
                            return null;
                        }
                        abstractC8416t0.m20789a((Object) null, (Exception) new C8390k1(c8391l.f18667b, c8391l.f18666a), false);
                        return null;
                    }
                    return abstractC8416t0.mo20620a(c8391l, c8391l.f18669d, i);
                }
            } catch (C8417t1 e) {
                IAlog.m21945a("failed parsing network request but will retry url: %s msg: %s", abstractC8416t0.mo20732r(), e.getMessage());
                if (m20770c(abstractC8416t0)) {
                    throw e;
                }
                throw new C8414s1(e);
            } catch (Exception e2) {
                IAlog.m21945a("failed parsing network request url: %s msg: %s", abstractC8416t0.mo20732r(), e2.getMessage());
                throw e2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m20768a(AbstractC8416t0 abstractC8416t0) {
        InterfaceC8404p0 interfaceC8404p0;
        if (!this.f18673a.offer(abstractC8416t0)) {
            IAlog.m21945a("Request queue is full! current request is dropped! %s", abstractC8416t0.mo20732r());
            return;
        }
        EnumC8384i1 enumC8384i1 = EnumC8384i1.QUEUED;
        abstractC8416t0.f18716f = enumC8384i1;
        if (enumC8384i1 != EnumC8384i1.QUEUED_FOR_RETRY || (interfaceC8404p0 = abstractC8416t0.f18714d) == null) {
            return;
        }
        interfaceC8404p0.mo20332a("sdkRequestEndedButWillBeRetried");
    }

    /* JADX INFO: renamed from: b */
    public final void m20769b(AbstractC8416t0 abstractC8416t0) {
        C8387j1 c8387j1 = this.f18678f;
        c8387j1.getClass();
        String str = abstractC8416t0.f18717g;
        IAlog.m21945a("%s : NetworkRequestWatchdog : finalize request: %s", IAlog.m21943a(c8387j1), str);
        C8399n1 c8399n1 = (C8399n1) c8387j1.f18664a.get(str);
        if (c8399n1 != null) {
            AbstractC9183r.f21478b.removeCallbacks(c8399n1.f18689d);
        }
        c8387j1.f18664a.remove(str);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m20770c(AbstractC8416t0 abstractC8416t0) {
        if (!abstractC8416t0.mo20733u()) {
            return false;
        }
        abstractC8416t0.f18716f = EnumC8384i1.QUEUED_FOR_RETRY;
        InterfaceC8404p0 interfaceC8404p0 = abstractC8416t0.f18714d;
        if (interfaceC8404p0 != null) {
            interfaceC8404p0.mo20332a("sdkRequestEndedButWillBeRetried");
        }
        long jMo20728g = abstractC8416t0.mo20728g();
        IAlog.m21949e("retryNetworkRequest queue up in main thread - %s with delay of %d", abstractC8416t0.getClass().getName(), Long.valueOf(jMo20728g));
        this.f18675c.postDelayed(new RunnableC8386j0(this, abstractC8416t0), jMo20728g);
        return true;
    }
}

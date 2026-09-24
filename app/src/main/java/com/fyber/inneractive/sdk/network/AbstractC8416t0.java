package com.fyber.inneractive.sdk.network;

import android.util.Log;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.config.global.features.C7984l;
import com.fyber.inneractive.sdk.factories.AbstractC8065d;
import com.fyber.inneractive.sdk.factories.C8067f;
import com.fyber.inneractive.sdk.factories.InterfaceC8066e;
import com.fyber.inneractive.sdk.response.AbstractC9084b;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.response.C9093k;
import com.fyber.inneractive.sdk.response.EnumC9083a;
import com.fyber.inneractive.sdk.response.InterfaceC9092j;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.common.net.HttpHeaders;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.t0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8416t0 {

    /* JADX INFO: renamed from: a */
    public volatile boolean f18711a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8374f0 f18712b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8379h f18713c;

    /* JADX INFO: renamed from: d */
    public InterfaceC8404p0 f18714d;

    /* JADX INFO: renamed from: e */
    public C8391l f18715e;

    /* JADX INFO: renamed from: f */
    public volatile EnumC8384i1 f18716f;

    /* JADX INFO: renamed from: g */
    public final String f18717g;

    /* JADX INFO: renamed from: h */
    public final C8006r f18718h;

    /* JADX INFO: renamed from: i */
    public long f18719i;

    /* JADX INFO: renamed from: j */
    public long f18720j;

    /* JADX INFO: renamed from: k */
    public int f18721k;

    /* JADX INFO: renamed from: l */
    public boolean f18722l;

    /* JADX INFO: renamed from: m */
    public boolean f18723m;

    /* JADX INFO: renamed from: n */
    public final Object f18724n;

    /* JADX INFO: renamed from: o */
    public boolean f18725o;

    public AbstractC8416t0(InterfaceC8374f0 interfaceC8374f0, InterfaceC8379h interfaceC8379h, C8006r c8006r) {
        this.f18711a = false;
        this.f18716f = EnumC8384i1.INITIAL;
        this.f18719i = 0L;
        this.f18720j = 0L;
        this.f18721k = 0;
        this.f18722l = false;
        this.f18723m = false;
        this.f18724n = new Object();
        this.f18725o = false;
        this.f18712b = interfaceC8374f0;
        this.f18713c = interfaceC8379h;
        this.f18717g = UUID.randomUUID().toString();
        this.f18718h = c8006r;
    }

    public AbstractC8416t0(AbstractC8416t0 abstractC8416t0) {
        this.f18711a = false;
        this.f18716f = EnumC8384i1.INITIAL;
        this.f18719i = 0L;
        this.f18720j = 0L;
        this.f18721k = 0;
        this.f18722l = false;
        this.f18723m = false;
        this.f18724n = new Object();
        this.f18725o = false;
        this.f18712b = abstractC8416t0.f18712b;
        this.f18713c = abstractC8416t0.f18713c;
        this.f18717g = UUID.randomUUID().toString();
        this.f18718h = abstractC8416t0.f18718h;
        this.f18721k = abstractC8416t0.f18721k;
        this.f18719i = abstractC8416t0.f18719i;
        this.f18720j = abstractC8416t0.f18720j;
    }

    /* JADX INFO: renamed from: a */
    public static int m20786a(Map map) {
        List list = map != null ? (List) map.get(HttpHeaders.CONTENT_LENGTH) : null;
        if (list != null) {
            return AbstractC9195v.m22022a((String) list.get(0), -1);
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public C8391l mo20744a(String str) throws Exception {
        try {
            InterfaceC8404p0 interfaceC8404p0 = this.f18714d;
            if (interfaceC8404p0 != null) {
                interfaceC8404p0.mo20332a("sdkInitNetworkRequest");
            }
            this.f18715e = this.f18713c.mo20756a(this, AbstractC9174o.m22007h(), str);
            InterfaceC8404p0 interfaceC8404p1 = this.f18714d;
            if (interfaceC8404p1 != null) {
                interfaceC8404p1.mo20332a("sdkGotServerResponse");
            }
            return this.f18715e;
        } catch (C8359b e) {
            IAlog.m21945a("failed start network request for url: %s msg: %s", mo20732r(), e.getMessage());
            throw e;
        } catch (C8408q1 e2) {
            IAlog.m21945a("failed read network response for url: %s msg: %s", mo20732r(), e2.getMessage());
            throw e2;
        } catch (Exception e3) {
            IAlog.m21945a("failed start network request for url: %s msg: %s", mo20732r(), e3.getMessage());
            throw e3;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract C8401o0 mo20620a(C8391l c8391l, Map map, int i);

    /* JADX INFO: renamed from: a */
    public final AbstractC9087e m20787a(int i, InterfaceC8400o interfaceC8400o, InterfaceC9092j interfaceC9092j) throws C8398n0 {
        try {
            EnumC9083a enumC9083aM21884a = EnumC9083a.m21884a(i);
            if (enumC9083aM21884a == null) {
                enumC9083aM21884a = EnumC9083a.RETURNED_ADTYPE_MRAID;
            }
            C8067f c8067f = AbstractC8065d.f17949a;
            InterfaceC8066e interfaceC8066e = (InterfaceC8066e) c8067f.f17950a.get(enumC9083aM21884a);
            AbstractC9084b abstractC9084bMo20466b = interfaceC8066e != null ? interfaceC8066e.mo20466b() : null;
            if (abstractC9084bMo20466b == null) {
                IAlog.m21950f("Received ad type %s does not have an appropriate parser!", Integer.valueOf(i));
                if (c8067f.f17950a.size() == 0) {
                    Log.e("Inneractive_error", "Critical error raised while fetching an ad - please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project");
                }
                throw new C8398n0("Could not find parser for ad type " + i);
            }
            IAlog.m21945a("Received ad type %s - Got parser! %s", Integer.valueOf(i), abstractC9084bMo20466b);
            if (interfaceC9092j != null) {
                abstractC9084bMo20466b.f21282c = interfaceC9092j;
            }
            abstractC9084bMo20466b.f21280a = abstractC9084bMo20466b.mo21885a();
            if (interfaceC8400o != null) {
                abstractC9084bMo20466b.f21282c = new C9093k(interfaceC8400o);
            }
            AbstractC9087e abstractC9087eM21886a = abstractC9084bMo20466b.m21886a(null);
            abstractC9087eM21886a.f21298H = mo20750j();
            InterfaceC8404p0 interfaceC8404p0 = this.f18714d;
            if (interfaceC8404p0 != null) {
                interfaceC8404p0.mo20332a("sdkParsedResponse");
            }
            return abstractC9087eM21886a;
        } catch (Exception e) {
            IAlog.m21945a("failed parse ad network request url: %s msg: %s", mo20732r(), e.getMessage());
            throw new C8398n0(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo20745a(long j) {
        synchronized (this.f18724n) {
            if (this.f18722l) {
                this.f18721k = (int) ((j - this.f18720j) + ((long) this.f18721k));
                this.f18722l = false;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo20788a(C8401o0 c8401o0, String str, String str2) {
    }

    /* JADX INFO: renamed from: a */
    public final void m20789a(Object obj, Exception exc, boolean z) {
        InterfaceC8404p0 interfaceC8404p0;
        if (!z) {
            EnumC8384i1 enumC8384i1 = EnumC8384i1.RESOLVED;
            this.f18716f = enumC8384i1;
            if (enumC8384i1 == EnumC8384i1.QUEUED_FOR_RETRY && (interfaceC8404p0 = this.f18714d) != null) {
                interfaceC8404p0.mo20332a("sdkRequestEndedButWillBeRetried");
            }
        }
        AbstractC9183r.f21478b.post(new RunnableC8413s0(this, obj, exc, z));
    }

    /* JADX INFO: renamed from: b */
    public void mo20746b(long j) {
        synchronized (this.f18724n) {
            if (this.f18723m) {
                this.f18721k = (int) ((j - this.f18719i) + ((long) this.f18721k));
                this.f18723m = false;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo20790c() {
        this.f18711a = true;
    }

    /* JADX INFO: renamed from: c */
    public void mo20747c(long j) {
        synchronized (this.f18724n) {
            if (!this.f18722l) {
                this.f18722l = true;
                this.f18720j = j;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo20748d() {
        boolean z;
        synchronized (this.f18724n) {
            z = this.f18722l;
        }
        if (z) {
            mo20745a(System.currentTimeMillis());
        } else if (m20794t()) {
            mo20746b(System.currentTimeMillis());
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo20749d(long j) {
        synchronized (this.f18724n) {
            if (!this.f18723m) {
                this.f18723m = true;
                this.f18719i = j;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m20791e() {
        try {
            C8391l c8391l = this.f18715e;
            if (c8391l != null) {
                c8391l.mo20759a();
            }
            this.f18713c.getClass();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public byte[] mo20727f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public abstract int mo20728g();

    /* JADX INFO: renamed from: h */
    public String mo20792h() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public C8356a mo20793i() {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public int mo20750j() {
        return this.f18721k;
    }

    /* JADX INFO: renamed from: k */
    public C8006r mo20751k() {
        return this.f18718h;
    }

    /* JADX INFO: renamed from: l */
    public Map mo20782l() {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public abstract EnumC8395m0 mo20729m();

    /* JADX INFO: renamed from: n */
    public String mo20730n() {
        return "application/json; charset=utf-8";
    }

    /* JADX INFO: renamed from: o */
    public abstract EnumC8378g1 mo20731o();

    /* JADX INFO: renamed from: p */
    public C8393l1 mo20752p() {
        IAConfigManager iAConfigManager = IAConfigManager.f17654M;
        return new C8393l1(iAConfigManager.f17688t.f17862b.m20443a("connect_timeout", 5000, 1), iAConfigManager.f17688t.f17862b.m20443a("read_timeout", 5000, 1));
    }

    /* JADX INFO: renamed from: q */
    public int mo20753q() {
        int i;
        synchronized (this.f18724n) {
            i = this.f18721k;
        }
        return i;
    }

    /* JADX INFO: renamed from: r */
    public abstract String mo20732r();

    /* JADX INFO: renamed from: s */
    public int mo20754s() {
        Integer numMo20416a;
        C8006r c8006r = this.f18718h;
        if (c8006r == null || (numMo20416a = ((C7984l) c8006r.m20432a(C7984l.class)).mo20416a("watchdog_buffer_time_ms")) == null) {
            return 500;
        }
        return numMo20416a.intValue();
    }

    /* JADX INFO: renamed from: t */
    public final boolean m20794t() {
        boolean z;
        synchronized (this.f18724n) {
            z = this.f18723m;
        }
        return z;
    }

    /* JADX INFO: renamed from: u */
    public abstract boolean mo20733u();

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX INFO: renamed from: v */
    public final boolean m20795v() {
        boolean z;
        if (this.f18725o) {
            C7984l c7984l = (C7984l) IAConfigManager.f17654M.f17667K.m20432a(C7984l.class);
            Boolean boolMo20420c = c7984l.mo20420c("should_add_request_watchdog");
            if (boolMo20420c != null ? boolMo20420c.booleanValue() : false) {
                z = true;
            } else {
                Boolean boolMo20420c2 = c7984l.mo20420c("should_report_request_watchdog");
                if (boolMo20420c2 != null ? boolMo20420c2.booleanValue() : false) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}

package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.network.C1762a;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.applovin.impl.o6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1673o6 extends AbstractRunnableC1601k5 implements C1704r0.e {

    /* JADX INFO: renamed from: g */
    private final C1762a f2470g;

    /* JADX INFO: renamed from: h */
    private final C1704r0.e f2471h;

    /* JADX INFO: renamed from: i */
    private C1552f6.b f2472i;

    /* JADX INFO: renamed from: j */
    private C1831z4 f2473j;

    /* JADX INFO: renamed from: k */
    private C1831z4 f2474k;

    /* JADX INFO: renamed from: l */
    private String f2475l;

    /* JADX INFO: renamed from: m */
    protected C1704r0.b f2476m;

    /* JADX INFO: renamed from: com.applovin.impl.o6$a */
    /* JADX INFO: loaded from: classes9.dex */
    class a implements C1704r0.e {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C1748l f2477a;

        a(C1748l c1748l) {
            this.f2477a = c1748l;
        }

        @Override // com.applovin.impl.C1704r0.e
        /* JADX INFO: renamed from: a */
        public void mo3137a(String str, int i, String str2, Object obj) {
            long millis;
            boolean z = false;
            boolean z2 = i < 200 || i >= 500;
            boolean z3 = i == 429;
            boolean z4 = i != -1009 || AbstractC1673o6.this.f2470g.m5034q();
            boolean z5 = (i == -900 || i == -1000) ? false : true;
            if (!z4 || !z5 || (!z2 && !z3 && !AbstractC1673o6.this.f2470g.m5033p())) {
                AbstractC1673o6 abstractC1673o6 = AbstractC1673o6.this;
                abstractC1673o6.mo3137a(abstractC1673o6.f2470g.m5023f(), i, str2, obj);
                return;
            }
            String strM5014a = AbstractC1673o6.this.f2470g.m5014a();
            if (AbstractC1673o6.this.f2470g.m5027j() <= 0) {
                if (strM5014a == null || !strM5014a.equals(AbstractC1673o6.this.f2470g.m5023f())) {
                    AbstractC1673o6 abstractC1673o7 = AbstractC1673o6.this;
                    abstractC1673o7.m3759a(abstractC1673o7.f2473j);
                } else {
                    AbstractC1673o6 abstractC1673o8 = AbstractC1673o6.this;
                    abstractC1673o8.m3759a(abstractC1673o8.f2474k);
                }
                AbstractC1673o6 abstractC1673o9 = AbstractC1673o6.this;
                abstractC1673o9.mo3137a(abstractC1673o9.f2470g.m5023f(), i, str2, obj);
                return;
            }
            C1768p c1768p = AbstractC1673o6.this.f1971c;
            if (C1768p.m5160a()) {
                AbstractC1673o6 abstractC1673o10 = AbstractC1673o6.this;
                abstractC1673o10.f1971c.m5178k(abstractC1673o10.f1970b, "Unable to send request due to server failure (code " + i + "). " + AbstractC1673o6.this.f2470g.m5027j() + " attempts left, retrying in " + TimeUnit.MILLISECONDS.toSeconds(AbstractC1673o6.this.f2470g.m5028k()) + " seconds...");
            }
            int iM5027j = AbstractC1673o6.this.f2470g.m5027j() - 1;
            AbstractC1673o6.this.f2470g.m5015a(iM5027j);
            if (iM5027j == 0) {
                AbstractC1673o6 abstractC1673o11 = AbstractC1673o6.this;
                abstractC1673o11.m3759a(abstractC1673o11.f2473j);
                if (StringUtils.isValidString(strM5014a) && strM5014a.length() >= 4) {
                    C1768p c1768p2 = AbstractC1673o6.this.f1971c;
                    if (C1768p.m5160a()) {
                        AbstractC1673o6 abstractC1673o12 = AbstractC1673o6.this;
                        abstractC1673o12.f1971c.m5175d(abstractC1673o12.f1970b, "Switching to backup endpoint " + strM5014a);
                    }
                    AbstractC1673o6 abstractC1673o13 = AbstractC1673o6.this;
                    abstractC1673o13.f2475l = abstractC1673o13.f2470g.m5023f();
                    AbstractC1673o6.this.f2470g.m5018b(strM5014a);
                    z = true;
                }
            }
            if (((Boolean) this.f2477a.m4801a(C1831z4.f3961j3)).booleanValue() && z) {
                millis = 0;
            } else {
                millis = AbstractC1673o6.this.f2470g.m5031n() ? TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, AbstractC1673o6.this.f2470g.m5019c())) : AbstractC1673o6.this.f2470g.m5028k();
            }
            C1552f6 c1552f6M4853s0 = this.f2477a.m4853s0();
            AbstractC1673o6 abstractC1673o14 = AbstractC1673o6.this;
            c1552f6M4853s0.m2605a(abstractC1673o14, abstractC1673o14.f2472i, millis);
        }

        @Override // com.applovin.impl.C1704r0.e
        /* JADX INFO: renamed from: a */
        public void mo3139a(String str, Object obj, int i) {
            AbstractC1673o6.this.m3084b().m4862x().m4144b(AbstractC1673o6.this.f2475l);
            AbstractC1673o6.this.f2470g.m5015a(0);
            AbstractC1673o6.this.mo3139a(str, obj, i);
        }
    }

    public AbstractC1673o6(C1762a c1762a, C1748l c1748l) {
        this(c1762a, c1748l, false);
    }

    public AbstractC1673o6(C1762a c1762a, C1748l c1748l, boolean z) {
        super("TaskRepeatRequest", c1748l, z);
        this.f2472i = C1552f6.b.OTHER;
        if (c1762a == null) {
            throw new IllegalArgumentException("No request specified");
        }
        m3081a(c1762a.m5023f());
        this.f2470g = c1762a;
        this.f2476m = new C1704r0.b();
        this.f2471h = new a(c1748l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m3759a(C1831z4 c1831z4) {
        if (c1831z4 != null) {
            m3084b().m4849q0().m1876a(c1831z4, c1831z4.m5750a());
        }
    }

    /* JADX INFO: renamed from: e */
    private void m3764e() {
        if (((Boolean) this.f1969a.m4801a(C1831z4.f4078x3)).booleanValue() && m3084b().m4862x().m4143a(StringUtils.getHostAndPath(this.f2470g.m5023f()))) {
            if (C1768p.m5160a()) {
                this.f1971c.m5175d(this.f1970b, "Swapping primary endpoint with backup endpoint " + this.f2470g.m5014a());
            }
            String strM5023f = this.f2470g.m5023f();
            C1762a c1762a = this.f2470g;
            c1762a.m5018b(c1762a.m5014a());
            this.f2470g.m5016a(strM5023f);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3765a(C1552f6.b bVar) {
        this.f2472i = bVar;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo3137a(String str, int i, String str2, Object obj);

    /* JADX INFO: renamed from: a */
    public abstract void mo3139a(String str, Object obj, int i);

    /* JADX INFO: renamed from: b */
    public void m3766b(C1831z4 c1831z4) {
        this.f2474k = c1831z4;
    }

    /* JADX INFO: renamed from: c */
    public void m3767c(C1831z4 c1831z4) {
        this.f2473j = c1831z4;
    }

    @Override // java.lang.Runnable
    public void run() {
        C1704r0 c1704r0M4862x = m3084b().m4862x();
        if (!m3084b().m4769G0() && !m3084b().m4763D0()) {
            C1768p.m5167h("AppLovinSdk", "AppLovin SDK is disabled");
            mo3137a(this.f2470g.m5023f(), -22, null, null);
            return;
        }
        m3764e();
        if (!StringUtils.isValidString(this.f2470g.m5023f()) || this.f2470g.m5023f().length() < 4) {
            if (C1768p.m5160a()) {
                this.f1971c.m5174b(this.f1970b, "Task has an invalid or null request endpoint.");
            }
            mo3137a(this.f2470g.m5023f(), AppLovinErrorCodes.INVALID_URL, null, null);
        } else {
            if (TextUtils.isEmpty(this.f2470g.m5025h())) {
                this.f2470g.m5020c(this.f2470g.m5017b() != null ? "POST" : "GET");
            }
            c1704r0M4862x.m4142a(this.f2470g, this.f2476m, this.f2471h);
        }
    }
}

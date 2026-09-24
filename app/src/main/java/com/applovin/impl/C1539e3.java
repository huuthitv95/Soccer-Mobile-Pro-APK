package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import com.applovin.impl.mediation.C1655h;
import com.applovin.impl.sdk.C1748l;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.e3 */
/* JADX INFO: loaded from: classes3.dex */
public class C1539e3 extends AbstractC1482a3 implements InterfaceC1783u1 {

    /* JADX INFO: renamed from: A */
    private final Bundle f1409A;

    /* JADX INFO: renamed from: B */
    private final AtomicReference f1410B;

    /* JADX INFO: renamed from: C */
    private final AtomicBoolean f1411C;

    /* JADX INFO: renamed from: D */
    private final AtomicBoolean f1412D;

    /* JADX INFO: renamed from: E */
    private final AtomicBoolean f1413E;

    /* JADX INFO: renamed from: F */
    private boolean f1414F;

    /* JADX INFO: renamed from: G */
    private String f1415G;

    /* JADX INFO: renamed from: H */
    private boolean f1416H;

    public C1539e3(C1519c3 c1519c3, JSONObject jSONObject, JSONObject jSONObject2, C1748l c1748l) {
        super(c1519c3, jSONObject, jSONObject2, null, c1748l);
        this.f1409A = new Bundle();
        this.f1412D = new AtomicBoolean();
        this.f1413E = new AtomicBoolean();
        this.f1410B = new AtomicReference();
        this.f1411C = new AtomicBoolean();
    }

    private C1539e3(C1539e3 c1539e3, C1655h c1655h) {
        super(c1539e3.m1830Q(), c1539e3.m3189a(), c1539e3.m3211g(), c1655h, c1539e3.f2055a);
        this.f1409A = new Bundle();
        this.f1412D = new AtomicBoolean();
        this.f1413E = new AtomicBoolean();
        this.f1410B = c1539e3.f1410B;
        this.f1411C = c1539e3.f1411C;
        this.f1416H = c1539e3.f1416H;
    }

    /* JADX INFO: renamed from: n0 */
    private long m2465n0() {
        long jM3184a = m3184a("ad_expiration_ms", -1L);
        return jM3184a < 0 ? m3194b("ad_expiration_ms", ((Long) this.f2055a.m4801a(AbstractC1776t3.f3338T7)).longValue()) : jM3184a;
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m2466A0() {
        return this.f1411C.get();
    }

    /* JADX INFO: renamed from: B0 */
    public boolean m2467B0() {
        if (m3185a("schedule_ad_hidden_on_ad_dismiss", Boolean.FALSE).booleanValue()) {
            return true;
        }
        return m3195b("schedule_ad_hidden_on_ad_dismiss", (Boolean) this.f2055a.m4801a(AbstractC1776t3.f3344Z7)).booleanValue();
    }

    /* JADX INFO: renamed from: C0 */
    public boolean m2468C0() {
        if (m3185a("schedule_ad_hidden_on_single_task_app_relaunch", Boolean.FALSE).booleanValue()) {
            return true;
        }
        return m3195b("schedule_ad_hidden_on_single_task_app_relaunch", (Boolean) this.f2055a.m4801a(AbstractC1776t3.f3345a8)).booleanValue();
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m2469D0() {
        return m3185a("suaaode", (Boolean) this.f2055a.m4801a(AbstractC1776t3.f3324G8)).booleanValue();
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m2470E0() {
        return m3185a("susaode", (Boolean) this.f2055a.m4801a(AbstractC1776t3.f3331M7)).booleanValue();
    }

    @Override // com.applovin.impl.AbstractC1482a3
    /* JADX INFO: renamed from: a */
    public AbstractC1482a3 mo1840a(C1655h c1655h) {
        return new C1539e3(this, c1655h);
    }

    @Override // com.applovin.impl.AbstractC1482a3
    /* JADX INFO: renamed from: a */
    public void mo1842a(Bundle bundle) {
        Bundle bundle2;
        super.mo1842a(bundle);
        if (bundle == null || (bundle2 = bundle.getBundle("applovin_ad_view_info")) == null) {
            return;
        }
        this.f1409A.putBundle("applovin_ad_view_info", bundle2);
    }

    /* JADX INFO: renamed from: a */
    public void m2471a(C1698q4 c1698q4) {
        this.f1410B.set(c1698q4);
    }

    /* JADX INFO: renamed from: a */
    public void m2472a(boolean z) {
        this.f1416H = z;
    }

    @Override // com.applovin.impl.InterfaceC1783u1
    public long getTimeToLiveMillis() {
        return m2465n0() - (SystemClock.elapsedRealtime() - m1826L());
    }

    /* JADX INFO: renamed from: j */
    public void m2473j(String str) {
        this.f1415G = str;
    }

    /* JADX INFO: renamed from: m0 */
    public void m2474m0() {
        this.f1411C.set(true);
    }

    /* JADX INFO: renamed from: o0 */
    public long m2475o0() {
        return m3184a("ahdm", ((Long) this.f2055a.m4801a(AbstractC1776t3.f3332N7)).longValue());
    }

    /* JADX INFO: renamed from: p0 */
    public long m2476p0() {
        long jM3184a = m3184a("ad_hidden_on_ad_dismiss_callback_delay_ms", -1L);
        return jM3184a >= 0 ? jM3184a : m3194b("ad_hidden_on_ad_dismiss_callback_delay_ms", ((Long) this.f2055a.m4801a(AbstractC1776t3.f3346b8)).longValue());
    }

    /* JADX INFO: renamed from: q0 */
    public long m2477q0() {
        long jM3184a = m3184a("ad_hidden_timeout_ms", -1L);
        return jM3184a >= 0 ? jM3184a : m3194b("ad_hidden_timeout_ms", ((Long) this.f2055a.m4801a(AbstractC1776t3.f3343Y7)).longValue());
    }

    /* JADX INFO: renamed from: r0 */
    public C1698q4 m2478r0() {
        return (C1698q4) this.f1410B.getAndSet(null);
    }

    /* JADX INFO: renamed from: s0 */
    public long m2479s0() {
        if (m1826L() > 0) {
            return SystemClock.elapsedRealtime() - m1826L();
        }
        return -1L;
    }

    @Override // com.applovin.impl.InterfaceC1783u1
    public void setExpired() {
        this.f1414F = true;
    }

    /* JADX INFO: renamed from: t0 */
    public Bundle m2480t0() {
        return this.f1409A;
    }

    /* JADX INFO: renamed from: u0 */
    public long m2481u0() {
        long jM3184a = m3184a("fullscreen_display_delay_ms", -1L);
        return jM3184a >= 0 ? jM3184a : ((Long) this.f2055a.m4801a(AbstractC1776t3.f3330L7)).longValue();
    }

    /* JADX INFO: renamed from: v0 */
    public String m2482v0() {
        return m3197b("mcode", "");
    }

    /* JADX INFO: renamed from: w0 */
    public AtomicBoolean m2483w0() {
        return this.f1412D;
    }

    /* JADX INFO: renamed from: x0 */
    public String m2484x0() {
        return this.f1415G;
    }

    /* JADX INFO: renamed from: y0 */
    public AtomicBoolean m2485y0() {
        return this.f1413E;
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m2486z0() {
        return this.f1416H;
    }
}

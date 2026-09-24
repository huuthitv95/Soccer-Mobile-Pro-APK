package com.applovin.impl;

import android.os.SystemClock;
import android.view.ViewGroup;
import com.applovin.impl.mediation.C1655h;
import com.applovin.impl.sdk.C1748l;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.f3 */
/* JADX INFO: loaded from: classes3.dex */
public class C1549f3 extends AbstractC1589j3 implements InterfaceC1783u1 {

    /* JADX INFO: renamed from: A */
    private final AtomicBoolean f1586A;

    /* JADX INFO: renamed from: B */
    private final AtomicBoolean f1587B;

    public C1549f3(C1519c3 c1519c3, JSONObject jSONObject, JSONObject jSONObject2, C1748l c1748l) {
        super(c1519c3, jSONObject, jSONObject2, null, c1748l);
        this.f1586A = new AtomicBoolean();
        this.f1587B = new AtomicBoolean();
    }

    private C1549f3(C1549f3 c1549f3, C1655h c1655h) {
        super(c1549f3.m1830Q(), c1549f3.m3189a(), c1549f3.m3211g(), c1655h, c1549f3.f2055a);
        this.f1586A = new AtomicBoolean();
        this.f1587B = new AtomicBoolean();
    }

    /* JADX INFO: renamed from: u0 */
    private long m2572u0() {
        long jM3184a = m3184a("ad_expiration_ms", -1L);
        return jM3184a < 0 ? m3194b("ad_expiration_ms", ((Long) this.f2055a.m4801a(AbstractC1776t3.f3339U7)).longValue()) : jM3184a;
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m2573A0() {
        return this.f995o == null;
    }

    @Override // com.applovin.impl.AbstractC1482a3
    /* JADX INFO: renamed from: a */
    public AbstractC1482a3 mo1840a(C1655h c1655h) {
        return new C1549f3(this, c1655h);
    }

    /* JADX INFO: renamed from: a */
    public void m2574a(ViewGroup viewGroup) {
        this.f995o.m3560a(viewGroup);
    }

    /* JADX INFO: renamed from: a */
    public void m2575a(MaxNativeAdView maxNativeAdView) {
        this.f995o.m3564a(maxNativeAdView);
    }

    @Override // com.applovin.impl.InterfaceC1783u1
    public long getTimeToLiveMillis() {
        return m2572u0() - (SystemClock.elapsedRealtime() - m1826L());
    }

    @Override // com.applovin.impl.InterfaceC1783u1
    public void setExpired() {
        MaxNativeAd nativeAd = getNativeAd();
        if (nativeAd != null) {
            nativeAd.setExpired();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public MaxNativeAdView m2576v0() {
        return this.f995o.m3572f();
    }

    /* JADX INFO: renamed from: w0 */
    public ViewGroup m2577w0() {
        return this.f995o.m3574h();
    }

    /* JADX INFO: renamed from: x0 */
    public AtomicBoolean m2578x0() {
        return this.f1586A;
    }

    /* JADX INFO: renamed from: y0 */
    public AtomicBoolean m2579y0() {
        return this.f1587B;
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m2580z0() {
        return m3185a("inacc", (Boolean) this.f2055a.m4801a(AbstractC1776t3.f3360o8)).booleanValue();
    }
}

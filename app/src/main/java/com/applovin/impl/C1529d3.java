package com.applovin.impl;

import com.applovin.impl.mediation.C1655h;
import com.applovin.impl.sdk.C1748l;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.d3 */
/* JADX INFO: loaded from: classes3.dex */
public class C1529d3 extends AbstractC1589j3 {
    public C1529d3(C1519c3 c1519c3, JSONObject jSONObject, JSONObject jSONObject2, C1748l c1748l) {
        super(c1519c3, jSONObject, jSONObject2, null, c1748l);
    }

    private C1529d3(C1529d3 c1529d3, C1655h c1655h) {
        super(c1529d3.m1830Q(), c1529d3.m3189a(), c1529d3.m3211g(), c1655h, c1529d3.f2055a);
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m2348A0() {
        return m3185a("proe", (Boolean) this.f2055a.m4801a(AbstractC1776t3.f3347c8)).booleanValue();
    }

    @Override // com.applovin.impl.AbstractC1482a3
    /* JADX INFO: renamed from: a */
    public AbstractC1482a3 mo1840a(C1655h c1655h) {
        return new C1529d3(this, c1655h);
    }

    /* JADX INFO: renamed from: u0 */
    public long m2349u0() {
        long jM3184a = m3184a("ad_refresh_ms", -1L);
        return jM3184a >= 0 ? jM3184a : m3194b("ad_refresh_ms", ((Long) this.f2055a.m4801a(AbstractC1776t3.f3311A7)).longValue());
    }

    /* JADX INFO: renamed from: v0 */
    public long m2350v0() {
        return AbstractC1701q7.m4100e(m3187a("bg_color", (String) null));
    }

    /* JADX INFO: renamed from: w0 */
    public int m2351w0() {
        int iM3183a = m3183a("ad_view_height", -2);
        if (iM3183a != -2) {
            return iM3183a;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getHeight();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    /* JADX INFO: renamed from: x0 */
    public long m2352x0() {
        return m3184a("viewability_imp_delay_ms", ((Long) this.f2055a.m4801a(C1831z4.f4012p1)).longValue());
    }

    /* JADX INFO: renamed from: y0 */
    public int m2353y0() {
        int iM3183a = m3183a("ad_view_width", -2);
        if (iM3183a != -2) {
            return iM3183a;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getWidth();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m2354z0() {
        return m2349u0() >= 0;
    }
}

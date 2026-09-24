package com.applovin.impl;

import com.applovin.impl.mediation.C1655h;
import com.applovin.impl.sdk.C1748l;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.j3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1589j3 extends AbstractC1482a3 {
    protected AbstractC1589j3(C1519c3 c1519c3, JSONObject jSONObject, JSONObject jSONObject2, C1655h c1655h, C1748l c1748l) {
        super(c1519c3, jSONObject, jSONObject2, c1655h, c1748l);
    }

    /* JADX INFO: renamed from: m0 */
    public float m2979m0() {
        return m3192b("viewability_min_alpha", ((Float) this.f2055a.m4801a(C1831z4.f4084y1)).floatValue() / 100.0f);
    }

    /* JADX INFO: renamed from: n0 */
    public int m2980n0() {
        return m3183a("viewability_min_pixels", -1);
    }

    /* JADX INFO: renamed from: o0 */
    public int m2981o0() {
        C1831z4 c1831z4;
        MaxAdFormat format = getFormat();
        if (format == MaxAdFormat.BANNER) {
            c1831z4 = C1831z4.f4028r1;
        } else if (format == MaxAdFormat.MREC) {
            c1831z4 = C1831z4.f4044t1;
        } else if (format == MaxAdFormat.LEADER) {
            c1831z4 = C1831z4.f4060v1;
        } else {
            c1831z4 = format == MaxAdFormat.NATIVE ? C1831z4.f4076x1 : null;
        }
        if (c1831z4 != null) {
            return m3183a("viewability_min_height", ((Integer) this.f2055a.m4801a(c1831z4)).intValue());
        }
        return 0;
    }

    /* JADX INFO: renamed from: p0 */
    public float m2982p0() {
        return m3192b("viewability_min_percentage_dp", -1.0f);
    }

    /* JADX INFO: renamed from: q0 */
    public float m2983q0() {
        return m3192b("viewability_min_percentage_pixels", -1.0f);
    }

    /* JADX INFO: renamed from: r0 */
    public long m2984r0() {
        return m3184a("viewability_timer_min_visible_ms", ((Long) this.f2055a.m4801a(C1831z4.f4092z1)).longValue());
    }

    /* JADX INFO: renamed from: s0 */
    public int m2985s0() {
        C1831z4 c1831z4;
        MaxAdFormat format = getFormat();
        if (format == MaxAdFormat.BANNER) {
            c1831z4 = C1831z4.f4020q1;
        } else if (format == MaxAdFormat.MREC) {
            c1831z4 = C1831z4.f4036s1;
        } else if (format == MaxAdFormat.LEADER) {
            c1831z4 = C1831z4.f4052u1;
        } else {
            c1831z4 = format == MaxAdFormat.NATIVE ? C1831z4.f4068w1 : null;
        }
        if (c1831z4 != null) {
            return m3183a("viewability_min_width", ((Integer) this.f2055a.m4801a(c1831z4)).intValue());
        }
        return 0;
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m2986t0() {
        return m2980n0() >= 0 || m2982p0() >= 0.0f || m2983q0() >= 0.0f;
    }
}

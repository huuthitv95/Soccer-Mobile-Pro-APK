package com.fyber.inneractive.sdk.metrics;

import java.util.HashMap;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.metrics.e */
/* JADX INFO: loaded from: classes4.dex */
public final class C8286e implements InterfaceC8288g {

    /* JADX INFO: renamed from: a */
    public Long f18480a = null;

    /* JADX INFO: renamed from: b */
    public Long f18481b = null;

    /* JADX INFO: renamed from: c */
    public Long f18482c = null;

    /* JADX INFO: renamed from: d */
    public Long f18483d = null;

    /* JADX INFO: renamed from: e */
    public Long f18484e = null;

    /* JADX INFO: renamed from: f */
    public Long f18485f = null;

    /* JADX INFO: renamed from: g */
    public Long f18486g = null;

    /* JADX INFO: renamed from: h */
    public Long f18487h = null;

    @Override // com.fyber.inneractive.sdk.metrics.InterfaceC8288g
    /* JADX INFO: renamed from: a */
    public final boolean mo20687a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.metrics.InterfaceC8288g
    /* JADX INFO: renamed from: b */
    public final Long mo20688b() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f18486g = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.InterfaceC8288g
    /* JADX INFO: renamed from: c */
    public final Long mo20689c() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f18480a = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.InterfaceC8288g
    /* JADX INFO: renamed from: d */
    public final Long mo20690d() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f18483d = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.InterfaceC8288g
    /* JADX INFO: renamed from: e */
    public final Long mo20691e() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f18485f = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.InterfaceC8288g
    /* JADX INFO: renamed from: f */
    public final Long mo20692f() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f18481b = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.InterfaceC8288g
    /* JADX INFO: renamed from: g */
    public final Long mo20693g() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f18482c = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.InterfaceC8288g
    /* JADX INFO: renamed from: h */
    public final Long mo20694h() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f18487h = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.InterfaceC8288g
    /* JADX INFO: renamed from: i */
    public final Long mo20695i() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f18484e = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.InterfaceC8288g
    /* JADX INFO: renamed from: j */
    public final HashMap mo20696j() {
        HashMap map = new HashMap();
        Long l = this.f18481b;
        if (l != null && this.f18480a != null) {
            map.put("sdk_init_network_req", Long.valueOf(l.longValue() - this.f18480a.longValue()));
        }
        Long l2 = this.f18487h;
        if (l2 != null && this.f18481b != null) {
            map.put("sdk_got_response_from_markup_url", Long.valueOf(l2.longValue() - this.f18481b.longValue()));
        }
        Long l3 = this.f18483d;
        if (l3 != null && this.f18487h != null) {
            map.put("sdk_parsed_res", Long.valueOf(l3.longValue() - this.f18487h.longValue()));
        }
        Long l4 = this.f18482c;
        if (l4 != null && this.f18481b != null) {
            map.put("sdk_got_server_res", Long.valueOf(l4.longValue() - this.f18481b.longValue()));
        }
        Long l5 = this.f18483d;
        if (l5 != null && this.f18482c != null) {
            map.put("sdk_parsed_res", Long.valueOf(l5.longValue() - this.f18482c.longValue()));
        }
        Long l6 = this.f18484e;
        if (l6 != null && this.f18483d != null) {
            map.put("ad_loaded_result", Long.valueOf(l6.longValue() - this.f18483d.longValue()));
        }
        Long l7 = this.f18485f;
        if (l7 != null && this.f18484e != null) {
            map.put("publisher_notified", Long.valueOf(l7.longValue() - this.f18484e.longValue()));
        }
        Long l8 = this.f18486g;
        if (l8 != null && this.f18480a != null) {
            map.put("roundtrip", Long.valueOf(l8.longValue() - this.f18480a.longValue()));
        }
        return map;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MetricsCollectorData{");
        if (this.f18480a != null && this.f18481b != null) {
            sb.append(" sdk_init_network_req=");
            sb.append(this.f18481b.longValue() - this.f18480a.longValue());
        }
        if (this.f18487h != null && this.f18481b != null) {
            sb.append(", sdk_got_response_from_markup_url=");
            sb.append(this.f18487h.longValue() - this.f18481b.longValue());
        }
        if (this.f18482c != null && this.f18481b != null) {
            sb.append(", sdk_got_server_res=");
            sb.append(this.f18482c.longValue() - this.f18481b.longValue());
        }
        if (this.f18483d != null && this.f18482c != null) {
            sb.append(", sdk_parsed_res=");
            sb.append(this.f18483d.longValue() - this.f18482c.longValue());
        }
        if (this.f18484e != null && this.f18483d != null) {
            sb.append(", ad_loaded_result=");
            sb.append(this.f18484e.longValue() - this.f18483d.longValue());
        }
        if (this.f18485f != null && this.f18484e != null) {
            sb.append(", publisher_notified=");
            sb.append(this.f18485f.longValue() - this.f18484e.longValue());
        }
        if (this.f18486g != null && this.f18480a != null) {
            sb.append(", roundtrip=");
            sb.append(this.f18486g.longValue() - this.f18480a.longValue());
        }
        sb.append(" }");
        return sb.toString();
    }
}

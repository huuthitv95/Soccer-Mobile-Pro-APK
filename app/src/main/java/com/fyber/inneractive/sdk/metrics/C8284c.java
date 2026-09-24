package com.fyber.inneractive.sdk.metrics;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.metrics.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C8284c extends AbstractC8282a {

    /* JADX INFO: renamed from: g */
    public static final String f18467g = String.valueOf(24);

    /* JADX INFO: renamed from: h */
    public static final String f18468h = String.valueOf(3);

    /* JADX INFO: renamed from: i */
    public static final String f18469i = String.valueOf(24);

    /* JADX INFO: renamed from: j */
    public static final String f18470j = String.valueOf(3);

    /* JADX INFO: renamed from: b */
    public final String f18471b;

    /* JADX INFO: renamed from: c */
    public final UnitDisplayType f18472c;

    /* JADX INFO: renamed from: d */
    public final AbstractC9087e f18473d;

    /* JADX INFO: renamed from: e */
    public final InneractiveAdRequest f18474e;

    /* JADX INFO: renamed from: f */
    public final JSONArray f18475f;

    public C8284c(AbstractC9087e abstractC9087e, InneractiveAdRequest inneractiveAdRequest, String str, UnitDisplayType unitDisplayType, JSONArray jSONArray) {
        super("send_metric_report");
        this.f18473d = abstractC9087e;
        this.f18474e = inneractiveAdRequest;
        this.f18471b = str;
        this.f18472c = unitDisplayType;
        this.f18475f = jSONArray;
    }

    /* JADX INFO: renamed from: a */
    public final void m20684a() {
        C8285d c8285d = C8285d.f18476d;
        InterfaceC8288g interfaceC8288gM20685a = c8285d.m20685a(this.f18471b);
        HashMap mapMo20696j = interfaceC8288gM20685a.mo20696j();
        if (!interfaceC8288gM20685a.mo20687a()) {
            IAlog.m21945a("MetricCreativeReporter: Metric data not valid, data: %s", c8285d.m20685a(this.f18471b).toString());
        } else {
            c8285d.f18477a.remove(this.f18471b);
            AbstractC9183r.f21477a.execute(new RunnableC8283b(this, interfaceC8288gM20685a, mapMo20696j));
        }
    }
}

package com.mbridge.msdk.config.component.common.metrics;

import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.same.net.utils.C13121d;
import com.mbridge.msdk.foundation.same.report.C13142d;
import com.mbridge.msdk.foundation.same.report.C13159n;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.tracker.C13818e;
import com.mbridge.msdk.tracker.C13826m;
import com.mbridge.msdk.tracker.C13873p;
import com.mbridge.msdk.tracker.C13881x;
import com.mbridge.msdk.tracker.InterfaceC13819f;
import com.mbridge.msdk.tracker.network.toolbox.C13858h;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.metrics.a */
/* JADX INFO: compiled from: ComponentMetrics.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12755a {

    /* JADX INFO: renamed from: a */
    C13826m f33927a;

    /* JADX INFO: renamed from: b */
    C13881x f33928b;

    /* JADX INFO: renamed from: c */
    JSONObject f33929c;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.metrics.a$b */
    /* JADX INFO: compiled from: ComponentMetrics.java */
    private static final class b {

        /* JADX INFO: renamed from: a */
        static final C12755a f33930a = new C12755a();
    }

    /* JADX INFO: renamed from: a */
    public static C12755a m35087a() {
        return b.f33930a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m35088a(C13818e c13818e) throws Exception {
        return true;
    }

    /* JADX INFO: renamed from: c */
    private C13826m m35090c() {
        try {
            C13826m c13826m = this.f33927a;
            if (c13826m == null) {
                C13826m c13826mM41070b = C13826m.m41070b("metrics_component", C13008c.m36588n().m36542d(), m35089b());
                this.f33927a = c13826mM41070b;
                if (c13826mM41070b != null) {
                    JSONObject jSONObject = this.f33929c;
                    if (jSONObject != null) {
                        c13826mM41070b.m41075a(jSONObject);
                    }
                    this.f33927a.m41085h();
                }
            } else {
                JSONObject jSONObject2 = this.f33929c;
                if (jSONObject2 != null) {
                    c13826m.m41075a(jSONObject2);
                }
            }
        } catch (Exception e) {
            C13219q0.m37816b("ComponentMetrics", e.getMessage());
        }
        return this.f33927a;
    }

    /* JADX INFO: renamed from: b */
    public void m35093b(Map<String, Object> map) {
        if (map != null) {
            try {
                this.f33929c = new JSONObject(map);
            } catch (Exception e) {
                C13219q0.m37816b("ComponentMetrics", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m35094d() {
        if (this.f33927a == null) {
            this.f33927a = m35090c();
        }
        this.f33927a.m41073a();
    }

    private C12755a() {
    }

    /* JADX INFO: renamed from: a */
    public void m35092a(Map<String, Object> map) {
        if (map != null) {
            try {
                String strValueOf = String.valueOf(map.get(C12770c.m35209b("key")));
                JSONObject jSONObject = new JSONObject(map);
                if (jSONObject.length() > 0) {
                    C13818e c13818e = new C13818e(strValueOf);
                    c13818e.m41006a(jSONObject);
                    c13818e.m41008b(0);
                    c13818e.m41002a(0);
                    m35090c().m41081d(c13818e);
                }
            } catch (Throwable th) {
                C13219q0.m37817b("ComponentMetrics", th.getMessage(), th);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private C13881x m35089b() {
        if (this.f33928b == null) {
            this.f33928b = new C13881x.b().m41401a(604800000).m41407b(50).m41409d(50).m41408c(15000).m41410e(2).m41403a(new C13142d()).m41404a(new InterfaceC13819f() { // from class: com.mbridge.msdk.config.component.common.metrics.a$$ExternalSyntheticLambda0
                @Override // com.mbridge.msdk.tracker.InterfaceC13819f
                /* JADX INFO: renamed from: a */
                public final boolean mo35095a(C13818e c13818e) {
                    return C12755a.m35088a(c13818e);
                }
            }).m41405a(new C13159n()).m41402a(0, new C13873p(new C13858h(), C13121d.m37226h().f36024d, 0)).m41406a();
        }
        return this.f33928b;
    }

    /* JADX INFO: renamed from: a */
    public void m35091a(C13881x c13881x) {
        if (c13881x != null) {
            this.f33928b = c13881x;
            C13826m c13826m = this.f33927a;
            if (c13826m != null) {
                c13826m.m41074a("metrics_component", C13008c.m36588n().m36542d(), c13881x);
            }
        }
    }
}

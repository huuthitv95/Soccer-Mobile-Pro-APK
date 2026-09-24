package com.mbridge.msdk.config.component.nori;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.config.component.base.C12709a;
import com.mbridge.msdk.config.component.common.network.C12759c;
import com.mbridge.msdk.config.component.common.network.InterfaceC12757a;
import com.mbridge.msdk.config.component.common.network.result.C12764a;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.component.nori.model.C12831a;
import com.mbridge.msdk.config.component.nori.monitor.C12832a;
import com.mbridge.msdk.config.component.nori.monitor.C12833b;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class NoriCpt extends C12709a {

    /* JADX INFO: renamed from: h */
    private C12831a f34312h;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.nori.NoriCpt$a */
    class C12830a implements InterfaceC12757a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f34313a;

        C12830a(String str) {
            this.f34313a = str;
        }

        @Override // com.mbridge.msdk.config.component.common.network.InterfaceC12757a
        /* JADX INFO: renamed from: a */
        public void mo35101a(C12764a c12764a) {
            C13219q0.m37813a("NoriCpt", "Request started: " + this.f34313a);
        }

        @Override // com.mbridge.msdk.config.component.common.network.InterfaceC12757a
        /* JADX INFO: renamed from: b */
        public void mo35102b(C12764a c12764a) {
            NoriCpt.this.m35612c(c12764a);
        }

        @Override // com.mbridge.msdk.config.component.common.network.InterfaceC12757a
        /* JADX INFO: renamed from: c */
        public void mo35103c(C12764a c12764a) {
            NoriCpt.this.m35608a(c12764a);
        }

        @Override // com.mbridge.msdk.config.component.common.network.InterfaceC12757a
        /* JADX INFO: renamed from: d */
        public void mo35104d(C12764a c12764a) {
            NoriCpt.this.m35610b(c12764a);
        }
    }

    /* JADX INFO: renamed from: e */
    private boolean m35616e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("<htm") || str.contains("<body") || str.contains("<div");
    }

    /* JADX INFO: renamed from: f */
    private void m35617f(String str) {
        if (m35615d(str)) {
            m35618g(str);
        } else {
            m35614c(str);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m35618g(String str) {
        HashMap map = new HashMap();
        map.put(C12770c.m35209b("500"), "1");
        map.put(C12770c.m35209b("state_code"), "200");
        map.put(C12770c.m35209b("545"), str);
        map.put(C12770c.m35209b("is_html"), m35616e(str) ? "1" : "2");
        map.put(C12770c.m35209b("request_type"), this.f34312h.m35637f());
        m34829a(m34827a("906002", map));
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: d */
    public void mo34836d() {
        super.mo34836d();
        C12831a c12831a = this.f34312h;
        if (c12831a == null || c12831a.m35643l() == null || this.f34312h.m35643l().isEmpty()) {
            HashMap map = new HashMap();
            map.put(C12770c.m35209b(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), "500001");
            map.put(C12770c.m35209b("reason"), "Network request model or URLs is null/empty");
            m34829a(m34827a("906002", map));
            return;
        }
        for (String str : this.f34312h.m35643l()) {
            if (!TextUtils.isEmpty(str)) {
                m35617f(C12770c.m35200a(str, this.f34312h.m35634d()));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private void m35614c(String str) {
        C12832a c12832a = new C12832a();
        C12764a c12764a = new C12764a();
        c12764a.m35153a(c12832a);
        C12830a c12830a = new C12830a(str);
        C12833b c12833b = new C12833b(this.f34312h.m35642k());
        c12764a.m35154a(c12833b);
        c12833b.m35678a(c12764a);
        c12833b.m35676a(c12830a);
        c12833b.m35681d();
        C12759c c12759c = new C12759c(this.f34312h, c12764a);
        c12759c.m35110a(str, c12830a);
        c12759c.m35111b();
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: a */
    public void mo34828a() {
        super.mo34828a();
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: b */
    protected void mo34834b(Map<String, Object> map) {
        this.f33808f = "906001";
        this.f34312h = new C12831a(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m35608a(C12764a c12764a) {
        HashMap map = new HashMap();
        if (c12764a != null) {
            if (c12764a.m35151a() != null) {
                c12764a.m35151a().m35680b();
            }
            if (c12764a.m35166h()) {
                return;
            }
            c12764a.m35156a(true);
            map.put(C12770c.m35209b("500"), c12764a.m35163e() + "");
            map.put(C12770c.m35209b("state_code"), c12764a.m35165g() + "");
            map.put(C12770c.m35209b("545"), c12764a.m35164f());
            map.put(C12770c.m35209b("is_html"), m35616e(c12764a.m35164f()) ? "1" : "2");
        }
        map.put(C12770c.m35209b("request_type"), this.f34312h.m35637f());
        m34829a(m34827a("906002", map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m35610b(C12764a c12764a) {
        HashMap map = new HashMap();
        map.put(C12770c.m35209b("500"), "2");
        if (c12764a != null) {
            if (c12764a.m35151a() != null) {
                c12764a.m35151a().m35680b();
            }
            if (c12764a.m35166h()) {
                return;
            }
            c12764a.m35156a(true);
            map.put(C12770c.m35209b("state_code"), c12764a.m35165g() + "");
            map.put(C12770c.m35209b("reason"), c12764a.m35162d());
            map.put(C12770c.m35209b(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), Integer.valueOf(c12764a.m35160c()));
        }
        map.put(C12770c.m35209b("request_type"), this.f34312h.m35637f());
        m34829a(m34827a("906002", map));
    }

    /* JADX INFO: renamed from: d */
    private boolean m35615d(String str) {
        if (!TextUtils.isEmpty(str) && this.f34312h.m35630c() != null) {
            try {
                return this.f34312h.m35630c().contains(Uri.parse(str).getHost());
            } catch (Exception e) {
                C13219q0.m37816b("NoriCpt", "Error checking host: " + e.getMessage());
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m35612c(C12764a c12764a) {
        String strM35164f = c12764a.m35164f();
        if (TextUtils.isEmpty(strM35164f)) {
            return;
        }
        if (m35615d(strM35164f)) {
            m35618g(strM35164f);
        } else {
            m35614c(strM35164f);
        }
    }
}

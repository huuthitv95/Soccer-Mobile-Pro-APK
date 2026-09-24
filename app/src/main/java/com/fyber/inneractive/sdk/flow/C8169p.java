package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.C8021o;
import com.fyber.inneractive.sdk.config.C8040s;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.metrics.C8285d;
import com.fyber.inneractive.sdk.metrics.C8289h;
import com.fyber.inneractive.sdk.metrics.C8290i;
import com.fyber.inneractive.sdk.network.AbstractC8394m;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8424u;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.p */
/* JADX INFO: loaded from: classes4.dex */
public final class C8169p extends AbstractC8167o implements IAConfigManager.OnConfigurationReadyAndValidListener {

    /* JADX INFO: renamed from: g */
    public AbstractC9087e f18191g;

    public C8169p(String str) {
        super(str);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8261b
    /* JADX INFO: renamed from: a */
    public final void mo20549a() {
        C8290i c8290iM20686b = C8285d.f18476d.m20686b(this.f18188e);
        c8290iM20686b.f18491b.put(new C8289h("dyn_timeout"), Long.valueOf(System.currentTimeMillis() - c8290iM20686b.f18493d));
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8167o, com.fyber.inneractive.sdk.interfaces.InterfaceC8260a
    /* JADX INFO: renamed from: a */
    public final void mo20578a(InneractiveAdRequest inneractiveAdRequest) {
        C8290i c8290iM20686b = C8285d.f18476d.m20686b(this.f18188e);
        c8290iM20686b.f18491b.put(new C8289h("success"), Long.valueOf(System.currentTimeMillis() - c8290iM20686b.f18493d));
        super.mo20578a(inneractiveAdRequest);
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8167o
    /* JADX INFO: renamed from: a */
    public final void mo20579a(InneractiveAdRequest inneractiveAdRequest, AbstractC9087e abstractC9087e) {
        String str;
        if (abstractC9087e == null || (str = abstractC9087e.f21325y) == null) {
            return;
        }
        C8290i c8290iM20686b = C8285d.f18476d.m20686b(str);
        C8006r c8006rM20431a = this.f18186c;
        if (c8006rM20431a == null) {
            c8006rM20431a = C8006r.m20431a();
        }
        C8040s c8040s = IAConfigManager.f17654M.f17688t;
        C8021o c8021o = c8040s != null ? c8040s.f17862b : null;
        if (!(c8021o == null ? false : c8021o.m20446a(false, "e_699"))) {
            IAlog.m21945a("%sEvent 699 is disabled", IAlog.m21943a(c8290iM20686b));
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArrayM20697a = C8290i.m20697a(c8290iM20686b.f18491b);
        try {
            jSONObject.put("adl", jSONArrayM20697a);
        } catch (Exception unused) {
            IAlog.m21950f("Got exception adding param to json object: %s, %s", "adl", jSONArrayM20697a);
        }
        JSONArray jSONArrayM20697a2 = C8290i.m20697a(c8290iM20686b.f18490a);
        try {
            jSONObject.put("adml", jSONArrayM20697a2);
        } catch (Exception unused2) {
            IAlog.m21950f("Got exception adding param to json object: %s, %s", "adml", jSONArrayM20697a2);
        }
        if (!TextUtils.isEmpty(null)) {
            try {
                jSONObject.put("dns_failed", (Object) null);
            } catch (Exception unused3) {
                IAlog.m21950f("Got exception adding param to json object: %s, %s", "dns_failed", null);
            }
        }
        EnumC8424u enumC8424u = EnumC8424u.SDK_BIDDING_METRICS;
        JSONArray jSONArrayM20435b = c8006rM20431a.m20435b();
        C8428w c8428w = new C8428w(abstractC9087e);
        c8428w.f18755c = enumC8424u;
        c8428w.f18753a = inneractiveAdRequest;
        c8428w.f18756d = jSONArrayM20435b;
        c8428w.f18758f.put(jSONObject);
        c8428w.m20808a((String) null);
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8167o
    /* JADX INFO: renamed from: a */
    public final void mo20582a(boolean z) {
        AbstractC8394m abstractC8394m = this.f18187d;
        if (abstractC8394m != null) {
            abstractC8394m.mo20771a();
        }
        super.mo20582a(true);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8261b
    /* JADX INFO: renamed from: b */
    public final void mo20551b() {
        C8290i c8290iM20686b = C8285d.f18476d.m20686b(this.f18188e);
        c8290iM20686b.f18491b.put(new C8289h("retrying"), Long.valueOf(System.currentTimeMillis() - c8290iM20686b.f18493d));
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8167o
    /* JADX INFO: renamed from: b */
    public final void mo20583b(InneractiveAdRequest inneractiveAdRequest) {
        mo20579a(inneractiveAdRequest, this.f18191g);
    }

    @Override // com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener
    public final void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc) {
        IAConfigManager.removeListener(this);
        if (z) {
            return;
        }
        m20580a(null, m20584c(), new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, EnumC8125i.NO_APP_CONFIG_AVAILABLE, exc));
    }
}

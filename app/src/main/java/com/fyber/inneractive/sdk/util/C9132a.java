package com.fyber.inneractive.sdk.util;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.flow.AbstractC8236x;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8424u;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C9132a {

    /* JADX INFO: renamed from: a */
    public InneractiveAdSpot f21429a;

    /* JADX INFO: renamed from: c */
    public boolean f21431c;

    /* JADX INFO: renamed from: b */
    public boolean f21430b = false;

    /* JADX INFO: renamed from: d */
    public long f21432d = 0;

    /* JADX INFO: renamed from: e */
    public long f21433e = 0;

    /* JADX INFO: renamed from: f */
    public long f21434f = 0;

    /* JADX INFO: renamed from: a */
    public final void m21951a() {
        if (!this.f21430b || this.f21433e <= 0) {
            return;
        }
        this.f21434f += System.currentTimeMillis() - this.f21433e;
        this.f21433e = 0L;
    }

    /* JADX INFO: renamed from: a */
    public final void m21952a(String str) {
        C8006r c8006r;
        if (!this.f21430b || this.f21431c) {
            return;
        }
        String strM21958a = AbstractC9139c0.m21958a(System.currentTimeMillis(), this.f21432d, this.f21434f);
        InneractiveAdSpot inneractiveAdSpot = this.f21429a;
        AbstractC8236x adContent = inneractiveAdSpot != null ? inneractiveAdSpot.getAdContent() : null;
        EnumC8424u enumC8424u = EnumC8424u.USER_CLOSE_ACTION_LATENCY;
        InneractiveAdRequest inneractiveAdRequest = adContent != null ? adContent.f18373a : null;
        AbstractC9087e abstractC9087e = adContent != null ? adContent.f18374b : null;
        JSONArray jSONArrayM20435b = (adContent == null || (c8006r = adContent.f18375c) == null) ? null : c8006r.m20435b();
        C8428w c8428w = new C8428w(abstractC9087e);
        c8428w.f18755c = enumC8424u;
        c8428w.f18753a = inneractiveAdRequest;
        c8428w.f18756d = jSONArrayM20435b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("close_action_latency", strM21958a);
        } catch (Exception unused) {
            IAlog.m21950f("Got exception adding param to json object: %s, %s", "close_action_latency", strM21958a);
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject.put("origin", str);
            } catch (Exception unused2) {
                IAlog.m21950f("Got exception adding param to json object: %s, %s", "origin", str);
            }
        }
        c8428w.f18758f.put(jSONObject);
        c8428w.m20808a((String) null);
        this.f21432d = 0L;
        this.f21433e = 0L;
        this.f21434f = 0L;
        this.f21430b = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m21953a(boolean z) {
        this.f21431c = z;
        if (this.f21430b) {
            IAlog.m21945a("%s%s timer could not start. Timer is in action!", "AdExperienceLatency: ", z ? "skip" : "close");
            return;
        }
        IAlog.m21945a("%s%s timer started", "AdExperienceLatency: ", z ? "skip" : "close");
        this.f21432d = System.currentTimeMillis();
        this.f21430b = true;
    }
}

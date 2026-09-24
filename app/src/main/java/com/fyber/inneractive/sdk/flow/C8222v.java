package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.ignite.EnumC8253m;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8415t;
import com.fyber.inneractive.sdk.network.EnumC8424u;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.v */
/* JADX INFO: loaded from: classes4.dex */
public final class C8222v {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC8234w f18326a;

    public C8222v(AbstractC8234w abstractC8234w) {
        this.f18326a = abstractC8234w;
    }

    /* JADX INFO: renamed from: a */
    public final void m20626a(EnumC8415t enumC8415t, String str, String str2, EnumC8253m enumC8253m) {
        AbstractC8234w abstractC8234w = this.f18326a;
        InneractiveAdRequest inneractiveAdRequest = abstractC8234w.f18373a;
        AbstractC9087e abstractC9087e = abstractC8234w.f18374b;
        C8006r c8006r = abstractC8234w.f18375c;
        JSONArray jSONArrayM20435b = c8006r != null ? c8006r.m20435b() : null;
        C8428w c8428w = new C8428w(abstractC9087e);
        c8428w.f18754b = enumC8415t;
        c8428w.f18753a = inneractiveAdRequest;
        c8428w.f18756d = jSONArrayM20435b;
        JSONObject jSONObject = new JSONObject();
        if (enumC8253m != null) {
            String strM20654a = enumC8253m.m20654a();
            try {
                jSONObject.put("ignitem", strM20654a);
            } catch (Exception unused) {
                IAlog.m21950f("Got exception adding param to json object: %s, %s", "ignitem", strM20654a);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject.put("message", str);
            } catch (Exception unused2) {
                IAlog.m21950f("Got exception adding param to json object: %s, %s", "message", str);
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject.put("error_code", str2);
            } catch (Exception unused3) {
                IAlog.m21950f("Got exception adding param to json object: %s, %s", "error_code", str2);
            }
        }
        c8428w.f18758f.put(jSONObject);
        c8428w.m20808a((String) null);
    }

    /* JADX INFO: renamed from: a */
    public final void m20627a(EnumC8424u enumC8424u, EnumC8253m enumC8253m) {
        AbstractC8234w abstractC8234w = this.f18326a;
        InneractiveAdRequest inneractiveAdRequest = abstractC8234w.f18373a;
        AbstractC9087e abstractC9087e = abstractC8234w.f18374b;
        C8006r c8006r = abstractC8234w.f18375c;
        JSONArray jSONArrayM20435b = c8006r != null ? c8006r.m20435b() : null;
        C8428w c8428w = new C8428w(abstractC9087e);
        c8428w.f18755c = enumC8424u;
        c8428w.f18753a = inneractiveAdRequest;
        c8428w.f18756d = jSONArrayM20435b;
        JSONObject jSONObject = new JSONObject();
        String strM20654a = enumC8253m.m20654a();
        try {
            jSONObject.put("ignitem", strM20654a);
        } catch (Exception unused) {
            IAlog.m21950f("Got exception adding param to json object: %s, %s", "ignitem", strM20654a);
        }
        c8428w.f18758f.put(jSONObject);
        c8428w.m20808a((String) null);
    }
}

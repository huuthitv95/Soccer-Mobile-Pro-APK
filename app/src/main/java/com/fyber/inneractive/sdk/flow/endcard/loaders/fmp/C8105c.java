package com.fyber.inneractive.sdk.flow.endcard.loaders.fmp;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.C8237x0;
import com.fyber.inneractive.sdk.flow.endcard.C8109o;
import com.fyber.inneractive.sdk.flow.endcard.C8110p;
import com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.InterfaceC8106a;
import com.fyber.inneractive.sdk.network.C8376g;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8415t;
import com.fyber.inneractive.sdk.network.InterfaceC8374f0;
import com.fyber.inneractive.sdk.response.C9089g;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.endcard.loaders.fmp.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C8105c implements InterfaceC8374f0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8106a f18034a;

    /* JADX INFO: renamed from: b */
    public final C8109o f18035b;

    public C8105c(C8109o c8109o, InterfaceC8106a interfaceC8106a) {
        this.f18035b = c8109o;
        this.f18034a = interfaceC8106a;
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC8374f0
    /* JADX INFO: renamed from: a */
    public final void mo20331a(Object obj, Exception exc, boolean z) {
        String str = (String) obj;
        if (str != null && exc == null) {
            ((C8110p) this.f18035b.m20510f()).f18054e = str.concat("<style>body {margin: 0px; background-color: rgba(0, 0, 0, 0.0);}</style>");
            ((C8110p) this.f18035b.m20510f()).f18044l = z;
            ((C8110p) this.f18035b.m20510f()).m20535b(this.f18034a);
            return;
        }
        if (exc == null || (exc instanceof C8376g) || z) {
            return;
        }
        C8109o c8109o = this.f18035b;
        IAlog.m21945a("%s sending FMP_COMPANION_FAILED_LOADING event", "TemplateCallback");
        JSONObject jSONObject = new JSONObject();
        String strM22025a = AbstractC9195v.m22025a(exc);
        if (!TextUtils.isEmpty(strM22025a)) {
            try {
                jSONObject.put("error", strM22025a);
            } catch (Exception unused) {
                IAlog.m21950f("Got exception adding param to json object: %s, %s", "error", strM22025a);
            }
        }
        String strM20534n = c8109o.m20534n();
        if (!TextUtils.isEmpty(strM20534n)) {
            try {
                jSONObject.put("version", strM20534n);
            } catch (Exception unused2) {
                IAlog.m21950f("Got exception adding param to json object: %s, %s", "version", strM20534n);
            }
        }
        Boolean bool = Boolean.FALSE;
        try {
            jSONObject.put("loaded_from_cache", bool);
        } catch (Exception unused3) {
            IAlog.m21950f("Got exception adding param to json object: %s, %s", "loaded_from_cache", bool);
        }
        C8237x0 c8237x0 = c8109o.f17984c;
        EnumC8415t enumC8415t = EnumC8415t.FMP_COMPANION_FAILED_LOADING;
        InneractiveAdRequest inneractiveAdRequest = c8237x0.f18381c;
        C9089g c9089g = c8237x0.f18382d;
        JSONArray jSONArray = c8237x0.f18384f;
        C8428w c8428w = new C8428w(c9089g);
        c8428w.f18754b = enumC8415t;
        c8428w.f18753a = inneractiveAdRequest;
        c8428w.f18756d = jSONArray;
        c8428w.f18758f.put(jSONObject);
        c8428w.m20808a((String) null);
    }
}

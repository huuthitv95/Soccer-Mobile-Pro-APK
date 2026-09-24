package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C11720Vd;
import com.ironsource.C11722Vf;
import com.ironsource.C12268jc;
import com.ironsource.C12317m4;
import com.ironsource.InterfaceC12284ka;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.sdk.controller.u */
/* JADX INFO: loaded from: classes6.dex */
public class C12512u {

    /* JADX INFO: renamed from: d */
    private static final String f32213d = "u";

    /* JADX INFO: renamed from: e */
    private static final String f32214e = "updateToken";

    /* JADX INFO: renamed from: f */
    private static final String f32215f = "getToken";

    /* JADX INFO: renamed from: g */
    private static final String f32216g = "functionName";

    /* JADX INFO: renamed from: h */
    private static final String f32217h = "functionParams";

    /* JADX INFO: renamed from: i */
    private static final String f32218i = "success";

    /* JADX INFO: renamed from: j */
    private static final String f32219j = "fail";

    /* JADX INFO: renamed from: b */
    private Context f32221b;

    /* JADX INFO: renamed from: a */
    private C12268jc f32220a = new C12268jc();

    /* JADX INFO: renamed from: c */
    private C11722Vf f32222c = new C11722Vf();

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.u$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        String f32223a;

        /* JADX INFO: renamed from: b */
        JSONObject f32224b;

        /* JADX INFO: renamed from: c */
        String f32225c;

        /* JADX INFO: renamed from: d */
        String f32226d;

        private a() {
        }
    }

    public C12512u(Context context) {
        this.f32221b = context;
    }

    /* JADX INFO: renamed from: a */
    private a m33491a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        a aVar = new a();
        aVar.f32223a = jSONObject.optString("functionName");
        aVar.f32224b = jSONObject.optJSONObject("functionParams");
        aVar.f32225c = jSONObject.optString("success");
        aVar.f32226d = jSONObject.optString("fail");
        return aVar;
    }

    /* JADX INFO: renamed from: a */
    void m33493a(String str, InterfaceC12284ka interfaceC12284ka) throws Exception {
        a aVarM33491a = m33491a(str);
        if (f32214e.equals(aVarM33491a.f32223a)) {
            m33494a(aVarM33491a.f32224b, aVarM33491a, interfaceC12284ka);
            return;
        }
        if (f32215f.equals(aVarM33491a.f32223a)) {
            m33492a(aVarM33491a, interfaceC12284ka);
            return;
        }
        Logger.m33642i(f32213d, "unhandled API request " + str);
    }

    /* JADX INFO: renamed from: a */
    public void m33494a(JSONObject jSONObject, a aVar, InterfaceC12284ka interfaceC12284ka) {
        C11720Vd c11720Vd = new C11720Vd();
        try {
            this.f32220a.m31888a(jSONObject);
            interfaceC12284ka.mo31938a(true, aVar.f32225c, c11720Vd);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            Logger.m33642i(f32213d, "updateToken exception " + e.getMessage());
            interfaceC12284ka.mo31938a(false, aVar.f32226d, c11720Vd);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m33492a(a aVar, InterfaceC12284ka interfaceC12284ka) {
        try {
            JSONObject jSONObjectM27762a = this.f32222c.m27762a();
            Iterator<String> itKeys = jSONObjectM27762a.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObjectM27762a.get(next);
                if (obj instanceof String) {
                    jSONObjectM27762a.put(next, StringUtils.encodeURI((String) obj));
                }
            }
            interfaceC12284ka.mo31940a(true, aVar.f32225c, jSONObjectM27762a);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            interfaceC12284ka.mo31939a(false, aVar.f32226d, e.getMessage());
        }
    }
}

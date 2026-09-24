package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C11409E1;
import com.ironsource.C11720Vd;
import com.ironsource.C12317m4;
import com.ironsource.InterfaceC12284ka;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.sdk.controller.q */
/* JADX INFO: loaded from: classes6.dex */
public class C12508q {

    /* JADX INFO: renamed from: b */
    private static final String f32191b = "q";

    /* JADX INFO: renamed from: c */
    private static final String f32192c = "getPermissions";

    /* JADX INFO: renamed from: d */
    private static final String f32193d = "isPermissionGranted";

    /* JADX INFO: renamed from: e */
    private static final String f32194e = "permissions";

    /* JADX INFO: renamed from: f */
    private static final String f32195f = "permission";

    /* JADX INFO: renamed from: g */
    private static final String f32196g = "status";

    /* JADX INFO: renamed from: h */
    private static final String f32197h = "functionName";

    /* JADX INFO: renamed from: i */
    private static final String f32198i = "functionParams";

    /* JADX INFO: renamed from: j */
    private static final String f32199j = "success";

    /* JADX INFO: renamed from: k */
    private static final String f32200k = "fail";

    /* JADX INFO: renamed from: l */
    private static final String f32201l = "unhandledPermission";

    /* JADX INFO: renamed from: a */
    private Context f32202a;

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.q$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        String f32203a;

        /* JADX INFO: renamed from: b */
        JSONObject f32204b;

        /* JADX INFO: renamed from: c */
        String f32205c;

        /* JADX INFO: renamed from: d */
        String f32206d;

        private a() {
        }
    }

    public C12508q(Context context) {
        this.f32202a = context;
    }

    /* JADX INFO: renamed from: a */
    private a m33477a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        a aVar = new a();
        aVar.f32203a = jSONObject.optString("functionName");
        aVar.f32204b = jSONObject.optJSONObject("functionParams");
        aVar.f32205c = jSONObject.optString("success");
        aVar.f32206d = jSONObject.optString("fail");
        return aVar;
    }

    /* JADX INFO: renamed from: b */
    public void m33480b(JSONObject jSONObject, a aVar, InterfaceC12284ka interfaceC12284ka) {
        C11720Vd c11720Vd = new C11720Vd();
        try {
            String string = jSONObject.getString(f32195f);
            c11720Vd.m27757b(f32195f, string);
            if (C11409E1.m25652d(this.f32202a, string)) {
                c11720Vd.m27757b("status", String.valueOf(C11409E1.m25650c(this.f32202a, string)));
                interfaceC12284ka.mo31938a(true, aVar.f32205c, c11720Vd);
            } else {
                c11720Vd.m27757b("status", f32201l);
                interfaceC12284ka.mo31938a(false, aVar.f32206d, c11720Vd);
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            c11720Vd.m27757b("errMsg", e.getMessage());
            interfaceC12284ka.mo31938a(false, aVar.f32206d, c11720Vd);
        }
    }

    /* JADX INFO: renamed from: a */
    void m33478a(String str, InterfaceC12284ka interfaceC12284ka) throws Exception {
        a aVarM33477a = m33477a(str);
        if (f32192c.equals(aVarM33477a.f32203a)) {
            m33479a(aVarM33477a.f32204b, aVarM33477a, interfaceC12284ka);
            return;
        }
        if (f32193d.equals(aVarM33477a.f32203a)) {
            m33480b(aVarM33477a.f32204b, aVarM33477a, interfaceC12284ka);
            return;
        }
        Logger.m33642i(f32191b, "PermissionsJSAdapter unhandled API request " + str);
    }

    /* JADX INFO: renamed from: a */
    public void m33479a(JSONObject jSONObject, a aVar, InterfaceC12284ka interfaceC12284ka) {
        C11720Vd c11720Vd = new C11720Vd();
        try {
            c11720Vd.m27754a("permissions", C11409E1.m25645a(this.f32202a, jSONObject.getJSONArray("permissions")));
            interfaceC12284ka.mo31938a(true, aVar.f32205c, c11720Vd);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            Logger.m33642i(f32191b, "PermissionsJSAdapter getPermissions JSON Exception when getting permissions parameter " + e.getMessage());
            c11720Vd.m27757b("errMsg", e.getMessage());
            interfaceC12284ka.mo31938a(false, aVar.f32206d, c11720Vd);
        }
    }
}

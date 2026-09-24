package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C11455Gb;
import com.ironsource.C11720Vd;
import com.ironsource.C11744X3;
import com.ironsource.InterfaceC12284ka;
import com.ironsource.InterfaceC12582w7;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.sdk.controller.i */
/* JADX INFO: loaded from: classes6.dex */
public class C12500i {

    /* JADX INFO: renamed from: c */
    private static final String f32109c = "i";

    /* JADX INFO: renamed from: d */
    private static final String f32110d = "getDeviceData";

    /* JADX INFO: renamed from: e */
    private static final String f32111e = "deviceDataFunction";

    /* JADX INFO: renamed from: f */
    private static final String f32112f = "deviceDataParams";

    /* JADX INFO: renamed from: g */
    private static final String f32113g = "success";

    /* JADX INFO: renamed from: h */
    private static final String f32114h = "fail";

    /* JADX INFO: renamed from: a */
    private Context f32115a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC12582w7 f32116b = C11455Gb.m25891U().mo25842a();

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.i$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        String f32117a;

        /* JADX INFO: renamed from: b */
        JSONObject f32118b;

        /* JADX INFO: renamed from: c */
        String f32119c;

        /* JADX INFO: renamed from: d */
        String f32120d;

        private a() {
        }
    }

    public C12500i(Context context) {
        this.f32115a = context;
    }

    /* JADX INFO: renamed from: a */
    void m33459a(String str, InterfaceC12284ka interfaceC12284ka) throws Exception {
        a aVarM33458a = m33458a(str);
        if (f32110d.equals(aVarM33458a.f32117a)) {
            interfaceC12284ka.mo31938a(true, aVarM33458a.f32119c, m33457a());
            return;
        }
        Logger.m33642i(f32109c, "unhandled API request " + str);
    }

    /* JADX INFO: renamed from: a */
    private C11720Vd m33457a() {
        C11720Vd c11720Vd = new C11720Vd();
        c11720Vd.m27757b(SDKUtils.encodeString(C11744X3.j.f26449i0), SDKUtils.encodeString(String.valueOf(this.f32116b.mo27908j())));
        c11720Vd.m27757b(SDKUtils.encodeString(C11744X3.j.f26451j0), SDKUtils.encodeString(String.valueOf(this.f32116b.mo27924r(this.f32115a))));
        c11720Vd.m27757b(SDKUtils.encodeString(C11744X3.j.f26453k0), SDKUtils.encodeString(String.valueOf(this.f32116b.mo27872D(this.f32115a))));
        c11720Vd.m27757b(SDKUtils.encodeString(C11744X3.j.f26455l0), SDKUtils.encodeString(String.valueOf(this.f32116b.mo27873E(this.f32115a))));
        c11720Vd.m27757b(SDKUtils.encodeString(C11744X3.j.f26457m0), SDKUtils.encodeString(String.valueOf(this.f32116b.mo27900f(this.f32115a))));
        c11720Vd.m27757b(SDKUtils.encodeString(C11744X3.j.f26459n0), SDKUtils.encodeString(String.valueOf(this.f32116b.mo27906i(this.f32115a))));
        return c11720Vd;
    }

    /* JADX INFO: renamed from: a */
    private a m33458a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        a aVar = new a();
        aVar.f32117a = jSONObject.optString(f32111e);
        aVar.f32118b = jSONObject.optJSONObject(f32112f);
        aVar.f32119c = jSONObject.optString("success");
        aVar.f32120d = jSONObject.optString("fail");
        return aVar;
    }
}

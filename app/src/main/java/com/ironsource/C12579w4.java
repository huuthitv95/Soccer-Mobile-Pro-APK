package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.w4 */
/* JADX INFO: loaded from: classes6.dex */
public class C12579w4 {

    /* JADX INFO: renamed from: c */
    private static final String f32675c = "w4";

    /* JADX INFO: renamed from: d */
    private static final String f32676d = "setSharedSignal";

    /* JADX INFO: renamed from: e */
    private static final String f32677e = "getSharedSignal";

    /* JADX INFO: renamed from: f */
    private static final String f32678f = "functionName";

    /* JADX INFO: renamed from: g */
    private static final String f32679g = "functionParams";

    /* JADX INFO: renamed from: h */
    private static final String f32680h = "success";

    /* JADX INFO: renamed from: i */
    private static final String f32681i = "fail";

    /* JADX INFO: renamed from: a */
    private final Context f32682a;

    /* JADX INFO: renamed from: b */
    C12561v4 f32683b;

    /* JADX INFO: renamed from: com.ironsource.w4$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        String f32684a;

        /* JADX INFO: renamed from: b */
        JSONObject f32685b;

        /* JADX INFO: renamed from: c */
        String f32686c;

        /* JADX INFO: renamed from: d */
        String f32687d;

        private a() {
        }

        /* JADX INFO: renamed from: a */
        public static a m34040a(JSONObject jSONObject) {
            a aVar = new a();
            aVar.f32684a = jSONObject.optString("functionName");
            aVar.f32685b = jSONObject.optJSONObject("functionParams");
            aVar.f32686c = jSONObject.optString("success");
            aVar.f32687d = jSONObject.optString("fail");
            return aVar;
        }
    }

    public C12579w4(Context context, C12561v4 c12561v4) {
        this.f32682a = context;
        this.f32683b = c12561v4;
    }

    /* JADX INFO: renamed from: a */
    private a m34035a(String str) throws JSONException {
        return a.m34040a(new JSONObject(str));
    }

    /* JADX INFO: renamed from: b */
    private void m34038b(Context context, a aVar, InterfaceC12284ka interfaceC12284ka) {
        C11720Vd c11720Vd = new C11720Vd();
        JSONObject jSONObject = aVar.f32685b;
        this.f32683b.mo26499a(context, EnumC12543u4.m33880a(jSONObject.optString("source")), jSONObject.optString("key"), jSONObject.optString("data"));
        interfaceC12284ka.mo31938a(true, aVar.f32686c, c11720Vd);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    /* JADX INFO: renamed from: a */
    public void m34039a(String str, InterfaceC12284ka interfaceC12284ka) throws Exception {
        byte b;
        a aVarM34035a = m34035a(str);
        try {
            String str2 = aVarM34035a.f32684a;
            int iHashCode = str2.hashCode();
            if (iHashCode != 576059875) {
                if (iHashCode == 1486812399 && str2.equals(f32676d)) {
                    b = 0;
                } else {
                    b = -1;
                }
            } else if (str2.equals(f32677e)) {
                b = 1;
            } else {
                b = -1;
            }
            if (b == 0) {
                m34038b(this.f32682a, aVarM34035a, interfaceC12284ka);
            } else if (b == 1) {
                m34036a(this.f32682a, aVarM34035a, interfaceC12284ka);
            } else {
                throw new UnsupportedOperationException("unsupported API: " + str);
            }
        } catch (Exception e) {
            m34037a(aVarM34035a, interfaceC12284ka, e);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m34036a(Context context, a aVar, InterfaceC12284ka interfaceC12284ka) {
        C11720Vd c11720Vd = new C11720Vd();
        JSONObject jSONObject = aVar.f32685b;
        c11720Vd.m27757b("data", this.f32683b.mo26663a(context, EnumC12543u4.m33880a(jSONObject.optString("source")), jSONObject.optString("key")));
        interfaceC12284ka.mo31938a(true, aVar.f32686c, c11720Vd);
    }

    /* JADX INFO: renamed from: a */
    private void m34037a(a aVar, InterfaceC12284ka interfaceC12284ka, Exception exc) {
        C12317m4.m32153d().m32155a(exc);
        String message = exc.getMessage();
        Logger.m33642i(f32675c, aVar.f32684a + " exception " + message);
        C11720Vd c11720Vd = new C11720Vd();
        if (TextUtils.isEmpty(message)) {
            message = "Unknown error";
        }
        c11720Vd.m27757b("error", message);
        interfaceC12284ka.mo31938a(false, aVar.f32687d, c11720Vd);
    }
}

package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C11720Vd;
import com.ironsource.C12282k8;
import com.ironsource.C12317m4;
import com.ironsource.C12448qg;
import com.ironsource.InterfaceC11586Ng;
import com.ironsource.InterfaceC12192f8;
import com.ironsource.InterfaceC12284ka;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.sdk.controller.a */
/* JADX INFO: loaded from: classes6.dex */
public class C12492a implements InterfaceC12192f8 {

    /* JADX INFO: renamed from: d */
    private static final String f31973d = "loadWithUrl";

    /* JADX INFO: renamed from: e */
    private static final String f31974e = "sendMessage";

    /* JADX INFO: renamed from: f */
    public static final String f31975f = "removeAdView";

    /* JADX INFO: renamed from: g */
    public static final String f31976g = "webviewAction";

    /* JADX INFO: renamed from: h */
    public static final String f31977h = "handleGetViewVisibility";

    /* JADX INFO: renamed from: i */
    private static final String f31978i = "functionName";

    /* JADX INFO: renamed from: j */
    private static final String f31979j = "functionParams";

    /* JADX INFO: renamed from: k */
    private static final String f31980k = "success";

    /* JADX INFO: renamed from: l */
    private static final String f31981l = "fail";

    /* JADX INFO: renamed from: m */
    public static final String f31982m = "errMsg";

    /* JADX INFO: renamed from: n */
    private static final String f31983n = "%s | unsupported AdViews API";

    /* JADX INFO: renamed from: a */
    private InterfaceC11586Ng f31984a;

    /* JADX INFO: renamed from: b */
    private C12282k8 f31985b = C12282k8.m31929a();

    /* JADX INFO: renamed from: c */
    private Context f31986c;

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.a$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        String f31987a;

        /* JADX INFO: renamed from: b */
        JSONObject f31988b;

        /* JADX INFO: renamed from: c */
        String f31989c;

        /* JADX INFO: renamed from: d */
        String f31990d;

        private a() {
        }
    }

    public C12492a(Context context) {
        this.f31986c = context;
    }

    /* JADX INFO: renamed from: a */
    public void m33355a(InterfaceC11586Ng interfaceC11586Ng) {
        this.f31984a = interfaceC11586Ng;
    }

    @Override // com.ironsource.InterfaceC12192f8
    /* JADX INFO: renamed from: a */
    public void mo31468a(String str, JSONObject jSONObject) {
        if (this.f31984a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f31984a.mo26685a(str, jSONObject);
    }

    @Override // com.ironsource.InterfaceC12192f8
    /* JADX INFO: renamed from: a */
    public void mo31467a(String str, String str2, String str3) {
        mo31468a(str, C12448qg.m33206a(str2, str3));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    void m33356a(String str, InterfaceC12284ka interfaceC12284ka) throws Exception {
        C12492a c12492a;
        byte b;
        a aVarM33354a = m33354a(str);
        C11720Vd c11720Vd = new C11720Vd();
        try {
            String str2 = aVarM33354a.f31987a;
            switch (str2.hashCode()) {
                case -1384357108:
                    if (!str2.equals(f31975f)) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 691453791:
                    if (!str2.equals("sendMessage")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case 842351363:
                    if (!str2.equals("loadWithUrl")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case 1182065477:
                    if (!str2.equals("handleGetViewVisibility")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case 1491535759:
                    if (!str2.equals(f31976g)) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                c12492a = this;
                try {
                    this.f31985b.m31932a(c12492a, aVarM33354a.f31988b, this.f31986c, aVarM33354a.f31989c, aVarM33354a.f31990d);
                    return;
                } catch (Exception e) {
                    e = e;
                    C12317m4.m32153d().m32155a(e);
                    c11720Vd.m27757b("errMsg", e.getMessage());
                    String strM31935c = c12492a.f31985b.m31935c(aVarM33354a.f31988b);
                    if (!TextUtils.isEmpty(strM31935c)) {
                        c11720Vd.m27757b("adViewId", strM31935c);
                    }
                    interfaceC12284ka.mo31938a(false, aVarM33354a.f31990d, c11720Vd);
                    return;
                }
            }
            if (b == 1) {
                this.f31985b.m31937d(aVarM33354a.f31988b, aVarM33354a.f31989c, aVarM33354a.f31990d);
                return;
            }
            if (b == 2) {
                this.f31985b.m31936c(aVarM33354a.f31988b, aVarM33354a.f31989c, aVarM33354a.f31990d);
            } else if (b != 3) {
                if (b != 4) {
                    throw new IllegalArgumentException(String.format(f31983n, aVarM33354a.f31987a));
                }
                this.f31985b.m31934b(aVarM33354a.f31988b, aVarM33354a.f31989c, aVarM33354a.f31990d);
            } else {
                this.f31985b.m31933a(aVarM33354a.f31988b, aVarM33354a.f31989c, aVarM33354a.f31990d);
            }
        } catch (Exception e2) {
            e = e2;
            c12492a = this;
        }
    }

    /* JADX INFO: renamed from: a */
    private a m33354a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        a aVar = new a();
        aVar.f31987a = jSONObject.optString("functionName");
        aVar.f31988b = jSONObject.optJSONObject("functionParams");
        aVar.f31989c = jSONObject.optString("success");
        aVar.f31990d = jSONObject.optString("fail");
        return aVar;
    }
}

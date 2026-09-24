package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C11366Bc;
import com.ironsource.C11720Vd;
import com.ironsource.C12317m4;
import com.ironsource.InterfaceC12284ka;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.sdk.controller.o */
/* JADX INFO: loaded from: classes6.dex */
public class C12506o {

    /* JADX INFO: renamed from: c */
    private static final String f32164c = "o";

    /* JADX INFO: renamed from: d */
    private static final String f32165d = "activate";

    /* JADX INFO: renamed from: e */
    private static final String f32166e = "startSession";

    /* JADX INFO: renamed from: f */
    private static final String f32167f = "finishSession";

    /* JADX INFO: renamed from: g */
    private static final String f32168g = "impressionOccurred";

    /* JADX INFO: renamed from: h */
    private static final String f32169h = "getOmidData";

    /* JADX INFO: renamed from: i */
    private static final String f32170i = "omidFunction";

    /* JADX INFO: renamed from: j */
    private static final String f32171j = "omidParams";

    /* JADX INFO: renamed from: k */
    private static final String f32172k = "success";

    /* JADX INFO: renamed from: l */
    private static final String f32173l = "fail";

    /* JADX INFO: renamed from: m */
    private static final String f32174m = "%s | unsupported OMID API";

    /* JADX INFO: renamed from: a */
    private final Context f32175a;

    /* JADX INFO: renamed from: b */
    private final C11366Bc f32176b = new C11366Bc();

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.o$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        String f32177a;

        /* JADX INFO: renamed from: b */
        JSONObject f32178b;

        /* JADX INFO: renamed from: c */
        String f32179c;

        /* JADX INFO: renamed from: d */
        String f32180d;

        private a() {
        }
    }

    public C12506o(Context context) {
        this.f32175a = context;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005f  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    void m33470a(String str, InterfaceC12284ka interfaceC12284ka) throws Exception {
        byte b;
        a aVarM33469a = m33469a(str);
        C11720Vd c11720Vd = new C11720Vd();
        JSONObject jSONObject = aVarM33469a.f32178b;
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("adViewId", "");
            if (!TextUtils.isEmpty(strOptString)) {
                c11720Vd.m27757b("adViewId", strOptString);
            }
        }
        try {
            String str2 = aVarM33469a.f32177a;
            switch (str2.hashCode()) {
                case -1655974669:
                    if (!str2.equals("activate")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case -984459207:
                    if (!str2.equals(f32169h)) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case 70701699:
                    if (!str2.equals(f32167f)) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 1208109646:
                    if (!str2.equals(f32168g)) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case 1850541012:
                    if (!str2.equals(f32166e)) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                this.f32176b.m25489a(this.f32175a);
                c11720Vd = this.f32176b.m25488a();
            } else if (b == 1) {
                this.f32176b.m25493d(aVarM33469a.f32178b);
            } else if (b == 2) {
                this.f32176b.m25491b(aVarM33469a.f32178b);
            } else if (b == 3) {
                this.f32176b.m25492c(aVarM33469a.f32178b);
            } else {
                if (b != 4) {
                    throw new IllegalArgumentException(String.format(f32174m, aVarM33469a.f32177a));
                }
                c11720Vd = this.f32176b.m25488a();
            }
            interfaceC12284ka.mo31938a(true, aVarM33469a.f32179c, c11720Vd);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            c11720Vd.m27757b("errMsg", e.getMessage());
            Logger.m33642i(f32164c, "OMIDJSAdapter " + aVarM33469a.f32177a + " Exception: " + e.getMessage());
            interfaceC12284ka.mo31938a(false, aVarM33469a.f32180d, c11720Vd);
        }
    }

    /* JADX INFO: renamed from: a */
    private a m33469a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        a aVar = new a();
        aVar.f32177a = jSONObject.optString(f32170i);
        aVar.f32178b = jSONObject.optJSONObject(f32171j);
        aVar.f32179c = jSONObject.optString("success");
        aVar.f32180d = jSONObject.optString("fail");
        return aVar;
    }
}

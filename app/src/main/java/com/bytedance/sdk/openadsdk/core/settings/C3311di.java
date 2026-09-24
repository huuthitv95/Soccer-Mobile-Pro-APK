package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.settings.di */
/* JADX INFO: loaded from: classes3.dex */
public class C3311di {

    /* JADX INFO: renamed from: di */
    public boolean f11562di;

    /* JADX INFO: renamed from: fi */
    public boolean f11563fi;

    /* JADX INFO: renamed from: ik */
    public String f11564ik;

    /* JADX INFO: renamed from: ka */
    public boolean f11565ka;

    /* JADX INFO: renamed from: ri */
    public static final C3311di f11561ri = new C3311di(null);

    /* JADX INFO: renamed from: lr */
    public static String f11560lr = "";

    public C3311di(String str) {
        this.f11564ik = "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/3p_monitor.9db44671.js";
        this.f11565ka = true;
        this.f11563fi = true;
        this.f11562di = true;
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("performance_js");
            String strOptString = jSONObjectOptJSONObject.optString("url", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/3p_monitor.9db44671.js");
            if (!TextUtils.isEmpty(strOptString)) {
                this.f11564ik = strOptString;
            }
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("execute_time");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(jSONArrayOptJSONArray.optString(i));
            }
            this.f11565ka = arrayList.contains("load_finish");
            this.f11562di = arrayList.contains("load_fail");
            this.f11563fi = arrayList.contains("load");
        } catch (Exception unused) {
        }
    }
}

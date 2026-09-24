package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.l1 */
/* JADX INFO: loaded from: classes3.dex */
public class C1607l1 {

    /* JADX INFO: renamed from: a */
    private final String f2005a;

    /* JADX INFO: renamed from: b */
    private final String f2006b;

    /* JADX INFO: renamed from: c */
    private final boolean f2007c;

    C1607l1(JSONObject jSONObject, C1748l c1748l) {
        this.f2005a = JsonUtils.getString(jSONObject, "name", "");
        this.f2006b = JsonUtils.getString(jSONObject, "description", "");
        List list = JsonUtils.getList(jSONObject, "existence_classes", null);
        if (list != null) {
            this.f2007c = AbstractC1701q7.m4069a(list);
        } else {
            this.f2007c = AbstractC1701q7.m4066a(JsonUtils.getString(jSONObject, "existence_class", ""));
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3113a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (str2 == null || AbstractC1701q7.m4018a(str2, str) != 1) {
            return str3 == null || AbstractC1701q7.m4018a(str3, str) != -1;
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public String m3114a() {
        return this.f2006b;
    }

    /* JADX INFO: renamed from: b */
    public String m3115b() {
        return this.f2005a;
    }

    /* JADX INFO: renamed from: c */
    public boolean m3116c() {
        return this.f2007c;
    }
}

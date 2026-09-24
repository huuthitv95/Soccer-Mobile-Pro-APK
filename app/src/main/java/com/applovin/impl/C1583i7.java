package com.applovin.impl;

import com.applovin.impl.sdk.C1747k;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1749m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.i7 */
/* JADX INFO: loaded from: classes3.dex */
public class C1583i7 {

    /* JADX INFO: renamed from: a */
    private final C1748l f1842a;

    /* JADX INFO: renamed from: b */
    private boolean f1843b;

    /* JADX INFO: renamed from: c */
    private List f1844c;

    public C1583i7(C1748l c1748l) {
        this.f1842a = c1748l;
        C1511b5 c1511b5 = C1511b5.f1151I;
        this.f1843b = ((Boolean) c1748l.m4800a(c1511b5, Boolean.FALSE)).booleanValue() || C1817y.m5604a(C1748l.m4756p()).m5606a("applovin.sdk.is_test_environment") || AppLovinSdkUtils.isEmulator() || c1748l.m4759B().m4939T();
        c1748l.m4823c(c1511b5);
    }

    /* JADX INFO: renamed from: e */
    private void m2922e() {
        C1747k c1747kM4856u = this.f1842a.m4856u();
        if (this.f1843b) {
            c1747kM4856u.m4714b(this.f1844c);
        } else {
            c1747kM4856u.m4708a(this.f1844c);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2923a() {
        this.f1842a.m4818b(C1511b5.f1151I, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: a */
    public void m2924a(String str) {
        if (StringUtils.isValidString(str)) {
            m2925a(Collections.singletonList(str));
        } else {
            m2925a((List) null);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2925a(List list) {
        if (list == null && this.f1844c == null) {
            return;
        }
        if (list == null || !list.equals(this.f1844c)) {
            this.f1844c = list;
            m2922e();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2926a(JSONObject jSONObject) {
        if (this.f1843b) {
            return;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "test_mode_idfas", new JSONArray());
        C1749m c1749mM4759B = this.f1842a.m4759B();
        boolean zM4939T = c1749mM4759B.m4939T();
        String strM5323a = c1749mM4759B.m4945f().m5323a();
        C1749m.b bVarM4934H = c1749mM4759B.m4934H();
        this.f1843b = zM4939T || JsonUtils.containsCaseInsensitiveString(strM5323a, jSONArray) || JsonUtils.containsCaseInsensitiveString(bVarM4934H != null ? bVarM4934H.f3111a : null, jSONArray);
    }

    /* JADX INFO: renamed from: b */
    public List m2927b() {
        return this.f1844c;
    }

    /* JADX INFO: renamed from: c */
    public boolean m2928c() {
        return this.f1843b;
    }

    /* JADX INFO: renamed from: d */
    public boolean m2929d() {
        List list = this.f1844c;
        return (list == null || list.isEmpty()) ? false : true;
    }
}

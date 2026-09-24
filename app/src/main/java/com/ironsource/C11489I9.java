package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.I9 */
/* JADX INFO: loaded from: classes6.dex */
public class C11489I9 {

    /* JADX INFO: renamed from: a */
    private String f24487a;

    /* JADX INFO: renamed from: e */
    private String f24491e;

    /* JADX INFO: renamed from: f */
    private Map<String, String> f24492f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC11384Cc f24493g;

    /* JADX INFO: renamed from: h */
    private boolean f24494h;

    /* JADX INFO: renamed from: b */
    private boolean f24488b = false;

    /* JADX INFO: renamed from: c */
    private boolean f24489c = false;

    /* JADX INFO: renamed from: d */
    private C12130c8 f24490d = null;

    /* JADX INFO: renamed from: i */
    protected boolean f24495i = false;

    /* JADX INFO: renamed from: j */
    protected String f24496j = null;

    public C11489I9(String str, InterfaceC11384Cc interfaceC11384Cc) throws NullPointerException {
        this.f24487a = SDKUtils.requireNonEmptyOrNull(str, "Instance name can't be null");
        this.f24493g = (InterfaceC11384Cc) SDKUtils.requireNonNull(interfaceC11384Cc, "AdListener name can't be null");
    }

    /* JADX INFO: renamed from: a */
    public C11489I9 m26085a(boolean z) {
        this.f24489c = z;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C11489I9 m26087b(boolean z) {
        this.f24495i = z;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public C11489I9 m26089c() {
        this.f24488b = true;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C11489I9 m26082a(C12130c8 c12130c8) {
        this.f24490d = c12130c8;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C11489I9 m26086b(String str) {
        this.f24496j = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public C11489I9 m26090c(boolean z) {
        this.f24494h = z;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C11489I9 m26083a(String str) {
        this.f24491e = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public String m26088b() {
        String str = this.f24491e;
        if (str != null) {
            return str;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.f24487a);
            jSONObject.put("rewarded", this.f24488b);
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return (this.f24489c || this.f24494h) ? C11682T9.m27523a() : C11682T9.m27525a(jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public C11489I9 m26084a(Map<String, String> map) {
        this.f24492f = map;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C11471H9 m26081a() {
        return new C11471H9(m26088b(), this.f24487a, this.f24488b, this.f24489c, this.f24494h, this.f24495i, this.f24496j, this.f24492f, this.f24493g, this.f24490d);
    }
}

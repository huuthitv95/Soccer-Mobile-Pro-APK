package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.H9 */
/* JADX INFO: loaded from: classes6.dex */
public class C11471H9 {

    /* JADX INFO: renamed from: a */
    private final boolean f24432a;

    /* JADX INFO: renamed from: b */
    private String f24433b;

    /* JADX INFO: renamed from: c */
    private String f24434c;

    /* JADX INFO: renamed from: d */
    private boolean f24435d;

    /* JADX INFO: renamed from: e */
    private C12130c8 f24436e;

    /* JADX INFO: renamed from: f */
    private Map<String, String> f24437f;

    /* JADX INFO: renamed from: g */
    private InterfaceC11384Cc f24438g;

    /* JADX INFO: renamed from: h */
    private String f24439h;

    /* JADX INFO: renamed from: i */
    private boolean f24440i;

    /* JADX INFO: renamed from: j */
    private boolean f24441j;

    C11471H9(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, String str3, Map<String, String> map, InterfaceC11384Cc interfaceC11384Cc, C12130c8 c12130c8) {
        this.f24433b = str;
        this.f24434c = str2;
        this.f24432a = z;
        this.f24435d = z2;
        this.f24437f = map;
        this.f24438g = interfaceC11384Cc;
        this.f24436e = c12130c8;
        this.f24440i = z3;
        this.f24441j = z4;
        this.f24439h = str3;
    }

    /* JADX INFO: renamed from: a */
    public Map<String, String> m25989a() {
        HashMap map = new HashMap();
        map.put("instanceId", this.f24433b);
        map.put("instanceName", this.f24434c);
        map.put("rewarded", Boolean.toString(this.f24432a));
        map.put("inAppBidding", Boolean.toString(this.f24435d));
        map.put("isOneFlow", Boolean.toString(this.f24440i));
        map.put(C11744X3.f26157s, String.valueOf(2));
        C12130c8 c12130c8 = this.f24436e;
        map.put("width", c12130c8 != null ? Integer.toString(c12130c8.m31264c()) : "0");
        C12130c8 c12130c9 = this.f24436e;
        map.put("height", c12130c9 != null ? Integer.toString(c12130c9.m31262a()) : "0");
        C12130c8 c12130c10 = this.f24436e;
        map.put("label", c12130c10 != null ? c12130c10.m31263b() : "");
        map.put(C11744X3.f26161w, Boolean.toString(m25999i()));
        if (this.f24441j) {
            map.put("isMultipleAdObjects", "true");
        }
        String str = this.f24439h;
        if (str != null) {
            map.put("adUnitId", str);
        }
        Map<String, String> map2 = this.f24437f;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC11384Cc m25992b() {
        return this.f24438g;
    }

    /* JADX INFO: renamed from: c */
    public String m25993c() {
        return this.f24439h;
    }

    /* JADX INFO: renamed from: d */
    public Map<String, String> m25994d() {
        return this.f24437f;
    }

    /* JADX INFO: renamed from: e */
    public String m25995e() {
        return this.f24433b;
    }

    /* JADX INFO: renamed from: f */
    public String m25996f() {
        return this.f24434c.replaceAll("IronSource_", "");
    }

    /* JADX INFO: renamed from: g */
    public String m25997g() {
        return this.f24434c;
    }

    /* JADX INFO: renamed from: h */
    public C12130c8 m25998h() {
        return this.f24436e;
    }

    /* JADX INFO: renamed from: i */
    public boolean m25999i() {
        return m25998h() != null && m25998h().m31265d();
    }

    /* JADX INFO: renamed from: j */
    public boolean m26000j() {
        return this.f24435d;
    }

    /* JADX INFO: renamed from: k */
    public boolean m26001k() {
        return m26000j() || m26003m();
    }

    /* JADX INFO: renamed from: l */
    public boolean m26002l() {
        return this.f24441j;
    }

    /* JADX INFO: renamed from: m */
    public boolean m26003m() {
        return this.f24440i;
    }

    /* JADX INFO: renamed from: n */
    public boolean m26004n() {
        return this.f24432a;
    }

    /* JADX INFO: renamed from: a */
    public void m25990a(InterfaceC11384Cc interfaceC11384Cc) {
        this.f24438g = interfaceC11384Cc;
    }

    /* JADX INFO: renamed from: a */
    public void m25991a(String str) {
        this.f24439h = str;
    }
}

package com.mbridge.msdk.config.component.nori.model;

import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.nori.model.a */
/* JADX INFO: compiled from: NetworkRequestModel.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12831a {

    /* JADX INFO: renamed from: a */
    private List<String> f34315a;

    /* JADX INFO: renamed from: b */
    private List<String> f34316b;

    /* JADX INFO: renamed from: d */
    private Map<String, String> f34318d;

    /* JADX INFO: renamed from: e */
    private Map<String, Object> f34319e;

    /* JADX INFO: renamed from: h */
    private Map<String, Object> f34322h;

    /* JADX INFO: renamed from: l */
    private String f34326l;

    /* JADX INFO: renamed from: c */
    private String f34317c = "HTTP";

    /* JADX INFO: renamed from: f */
    private int f34320f = 3;

    /* JADX INFO: renamed from: g */
    private int f34321g = 10;

    /* JADX INFO: renamed from: i */
    private String f34323i = "GET";

    /* JADX INFO: renamed from: j */
    private long f34324j = 15;

    /* JADX INFO: renamed from: k */
    private int f34325k = 9377;

    public C12831a(Map<String, Object> map) {
        m35624a(map);
    }

    /* JADX INFO: renamed from: a */
    public void m35624a(Map<String, Object> map) {
        if (map != null) {
            try {
                Object obj = map.get(C12770c.m35209b("165"));
                if (obj instanceof List) {
                    m35628b((List<String>) obj);
                } else if (obj instanceof String) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(obj.toString());
                    m35628b(arrayList);
                }
                Object obj2 = map.get(C12770c.m35209b("151"));
                if (obj2 != null) {
                    m35632c(String.valueOf(obj2));
                }
                Object obj3 = map.get(C12770c.m35209b("170"));
                if (obj3 != null) {
                    m35622a(String.valueOf(obj3));
                }
                Object obj4 = map.get(C12770c.m35209b("168"));
                if (obj4 instanceof Map) {
                    m35629b((Map<String, Object>) obj4);
                }
                Object obj5 = map.get(C12770c.m35209b("172"));
                if (obj5 != null) {
                    m35631c(Integer.parseInt(String.valueOf(obj5)));
                }
                Object obj6 = map.get(C12770c.m35209b("171"));
                if (obj6 instanceof Map) {
                    m35635d((Map) obj6);
                }
                Object obj7 = map.get(C12770c.m35209b("174"));
                if (obj7 != null) {
                    try {
                        m35620a(Integer.parseInt(String.valueOf(obj7)));
                    } catch (Exception e) {
                        C13219q0.m37816b("NetworkRequestModel", e.getMessage());
                    }
                }
                Object obj8 = map.get(C12770c.m35209b("175"));
                if (obj8 != null) {
                    try {
                        m35626b(Integer.parseInt(String.valueOf(obj8)));
                    } catch (Exception e2) {
                        C13219q0.m37816b("NetworkRequestModel", e2.getMessage());
                    }
                }
                Object obj9 = map.get(C12770c.m35209b("162"));
                if (obj9 != null) {
                    try {
                        m35621a(Long.parseLong(String.valueOf(obj9)));
                    } catch (Exception e3) {
                        C13219q0.m37816b("NetworkRequestModel", e3.getMessage());
                    }
                }
                Object obj10 = map.get(C12770c.m35209b("169"));
                if (obj10 instanceof Map) {
                    m35633c((Map<String, Object>) obj10);
                }
                Object obj11 = map.get(C12770c.m35209b("173"));
                if (obj11 instanceof List) {
                    m35623a((List<String>) obj11);
                } else if (obj11 instanceof String) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(obj11.toString());
                    m35623a(arrayList2);
                }
                Object obj12 = map.get(C12770c.m35209b("request_type"));
                if (obj12 != null) {
                    m35627b(String.valueOf(obj12));
                }
            } catch (Exception e4) {
                C13219q0.m37817b("NetworkRequestModel", e4.getMessage(), e4);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m35628b(List<String> list) {
        this.f34316b = list;
    }

    /* JADX INFO: renamed from: c */
    public void m35632c(String str) {
        this.f34317c = str;
    }

    /* JADX INFO: renamed from: d */
    public Map<String, String> m35634d() {
        return this.f34318d;
    }

    /* JADX INFO: renamed from: e */
    public String m35636e() {
        return this.f34323i;
    }

    /* JADX INFO: renamed from: f */
    public String m35637f() {
        return this.f34326l;
    }

    /* JADX INFO: renamed from: g */
    public int m35638g() {
        return this.f34320f;
    }

    /* JADX INFO: renamed from: h */
    public int m35639h() {
        return this.f34321g;
    }

    /* JADX INFO: renamed from: i */
    public String m35640i() {
        return this.f34317c;
    }

    /* JADX INFO: renamed from: j */
    public int m35641j() {
        return this.f34325k;
    }

    /* JADX INFO: renamed from: k */
    public long m35642k() {
        return this.f34324j;
    }

    /* JADX INFO: renamed from: l */
    public List<String> m35643l() {
        return this.f34316b;
    }

    /* JADX INFO: renamed from: b */
    public Map<String, Object> m35625b() {
        return this.f34319e;
    }

    /* JADX INFO: renamed from: c */
    public void m35633c(Map<String, Object> map) {
        this.f34319e = map;
    }

    /* JADX INFO: renamed from: d */
    public void m35635d(Map<String, String> map) {
        this.f34318d = map;
    }

    /* JADX INFO: renamed from: b */
    public void m35629b(Map<String, Object> map) {
        this.f34322h = map;
    }

    /* JADX INFO: renamed from: c */
    public void m35631c(int i) {
        this.f34325k = i;
    }

    /* JADX INFO: renamed from: b */
    public void m35626b(int i) {
        this.f34321g = i;
    }

    /* JADX INFO: renamed from: c */
    public List<String> m35630c() {
        return this.f34315a;
    }

    /* JADX INFO: renamed from: b */
    public void m35627b(String str) {
        this.f34326l = str;
    }

    /* JADX INFO: renamed from: a */
    public void m35620a(int i) {
        this.f34320f = i;
    }

    /* JADX INFO: renamed from: a */
    public Map<String, Object> m35619a() {
        return this.f34322h;
    }

    /* JADX INFO: renamed from: a */
    public void m35622a(String str) {
        this.f34323i = str;
    }

    /* JADX INFO: renamed from: a */
    public void m35621a(long j) {
        this.f34324j = j;
    }

    /* JADX INFO: renamed from: a */
    public void m35623a(List<String> list) {
        this.f34315a = list;
    }
}

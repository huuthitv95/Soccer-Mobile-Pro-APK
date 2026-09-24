package com.mbridge.msdk.config.component.info.model;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.component.info.provider.C12777a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.info.model.a */
/* JADX INFO: compiled from: DeviceModel.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12776a {

    /* JADX INFO: renamed from: a */
    private String f34019a;

    /* JADX INFO: renamed from: b */
    private List<String> f34020b;

    /* JADX INFO: renamed from: c */
    private List<String> f34021c;

    /* JADX INFO: renamed from: d */
    private List<String> f34022d;

    /* JADX INFO: renamed from: e */
    private List<String> f34023e;

    /* JADX INFO: renamed from: f */
    private int f34024f = 1;

    /* JADX INFO: renamed from: g */
    private int f34025g = 1;

    /* JADX INFO: renamed from: h */
    private int f34026h = 1;

    /* JADX INFO: renamed from: i */
    private C12777a f34027i;

    public C12776a(Map<String, Object> map) {
        m35237a(map);
        m35235g();
    }

    /* JADX INFO: renamed from: g */
    private void m35235g() {
        C12777a c12777a = new C12777a(this.f34024f, this.f34025g, this.f34026h);
        this.f34027i = c12777a;
        c12777a.m35251e();
        this.f34027i.m35249c();
        this.f34027i.m35250d();
    }

    /* JADX INFO: renamed from: a */
    public List<String> m35236a() {
        return this.f34023e;
    }

    /* JADX INFO: renamed from: b */
    public List<String> m35239b() {
        return this.f34022d;
    }

    /* JADX INFO: renamed from: c */
    public Map<String, Object> m35240c() {
        Map<String, Object> mapM35249c = this.f34027i.m35249c();
        Map<String, Object> mapM35250d = this.f34027i.m35250d();
        HashMap map = new HashMap();
        map.putAll(mapM35249c);
        map.putAll(mapM35250d);
        return map;
    }

    /* JADX INFO: renamed from: d */
    public List<String> m35241d() {
        return this.f34020b;
    }

    /* JADX INFO: renamed from: e */
    public List<String> m35242e() {
        return this.f34021c;
    }

    /* JADX INFO: renamed from: f */
    public String m35243f() {
        return this.f34019a;
    }

    /* JADX INFO: renamed from: a */
    public void m35237a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(C12770c.m35209b("138"));
            if (obj != null) {
                this.f34019a = String.valueOf(obj);
            }
            Object obj2 = map.get(C12770c.m35209b("199"));
            if (obj instanceof List) {
                this.f34020b = (List) obj2;
            }
            Object obj3 = map.get(C12770c.m35209b("140"));
            if (obj3 instanceof List) {
                this.f34021c = (List) obj3;
            }
            Object obj4 = map.get(C12770c.m35209b("196"));
            if (obj4 instanceof List) {
                this.f34022d = (List) obj4;
            }
            Object obj5 = map.get(C12770c.m35209b("197"));
            if (obj5 instanceof List) {
                this.f34023e = (List) obj5;
            }
            Object obj6 = map.get(C12770c.m35209b("139"));
            if (obj6 != null) {
                this.f34024f = Integer.parseInt(String.valueOf(obj6));
            }
            Object obj7 = map.get(C12770c.m35209b("194"));
            if (obj7 != null) {
                this.f34025g = Integer.parseInt(String.valueOf(obj7));
            }
            Object obj8 = map.get(C12770c.m35209b("195"));
            if (obj8 != null) {
                this.f34026h = Integer.parseInt(String.valueOf(obj8));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public Object m35238b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return m35234a(str);
    }

    /* JADX INFO: renamed from: a */
    private String m35234a(String str) {
        return this.f34027i.m35248a(str);
    }
}

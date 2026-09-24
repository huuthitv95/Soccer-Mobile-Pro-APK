package com.mbridge.msdk.config.component.eac.model;

import com.mbridge.msdk.config.component.common.util.C12770c;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.eac.model.a */
/* JADX INFO: compiled from: ForEachModel.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12775a {

    /* JADX INFO: renamed from: a */
    private Object f34015a;

    /* JADX INFO: renamed from: b */
    private String f34016b;

    /* JADX INFO: renamed from: c */
    private String f34017c;

    public C12775a(Map<String, Object> map) {
        m35228a(map);
    }

    /* JADX INFO: renamed from: a */
    public void m35228a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(C12770c.m35209b("135"));
            if (obj != null) {
                m35226a(obj);
            }
            Object obj2 = map.get(C12770c.m35209b("136"));
            if (obj2 != null) {
                m35230b(String.valueOf(obj2));
            }
            Object obj3 = map.get(C12770c.m35209b("137"));
            if (obj3 != null) {
                m35227a(String.valueOf(obj3));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public String m35229b() {
        return this.f34016b;
    }

    /* JADX INFO: renamed from: c */
    public Object m35231c() {
        return this.f34015a;
    }

    /* JADX INFO: renamed from: b */
    public void m35230b(String str) {
        this.f34016b = str;
    }

    /* JADX INFO: renamed from: a */
    public void m35226a(Object obj) {
        this.f34015a = obj;
    }

    /* JADX INFO: renamed from: a */
    public String m35225a() {
        return this.f34017c;
    }

    /* JADX INFO: renamed from: a */
    public void m35227a(String str) {
        this.f34017c = str;
    }
}

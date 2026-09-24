package com.mbridge.msdk.config.component.url.model;

import android.content.Context;
import com.mbridge.msdk.config.component.common.util.C12770c;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.url.model.a */
/* JADX INFO: compiled from: OpenAppModel.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12849a {

    /* JADX INFO: renamed from: a */
    private Context f34450a;

    /* JADX INFO: renamed from: b */
    private String f34451b;

    /* JADX INFO: renamed from: c */
    private String f34452c;

    /* JADX INFO: renamed from: d */
    private Map<Object, Object> f34453d;

    public C12849a(Map<String, Object> map) {
        m35805a(map);
    }

    /* JADX INFO: renamed from: a */
    public void m35805a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(C12770c.m35209b("160"));
            if (obj != null) {
                m35804a(String.valueOf(obj));
            }
            Object obj2 = map.get(C12770c.m35209b("151"));
            if (obj2 != null) {
                m35807b(String.valueOf(obj2));
            }
            Object obj3 = map.get(C12770c.m35209b("109"));
            if (obj3 instanceof Map) {
                m35808b((Map<Object, Object>) obj3);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m35807b(String str) {
        this.f34452c = str;
    }

    /* JADX INFO: renamed from: c */
    public String m35809c() {
        return this.f34451b;
    }

    /* JADX INFO: renamed from: d */
    public String m35810d() {
        return this.f34452c;
    }

    /* JADX INFO: renamed from: b */
    public Map<Object, Object> m35806b() {
        return this.f34453d;
    }

    /* JADX INFO: renamed from: b */
    public void m35808b(Map<Object, Object> map) {
        this.f34453d = map;
    }

    /* JADX INFO: renamed from: a */
    public Context m35802a() {
        return this.f34450a;
    }

    /* JADX INFO: renamed from: a */
    public void m35803a(Context context) {
        this.f34450a = context;
    }

    /* JADX INFO: renamed from: a */
    public void m35804a(String str) {
        this.f34451b = str;
    }
}

package com.mbridge.msdk.config.component.inner.model;

import android.content.Context;
import com.bykv.p028vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.config.component.common.util.C12770c;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.inner.model.a */
/* JADX INFO: compiled from: InnerStoreModel.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12784a {

    /* JADX INFO: renamed from: a */
    Context f34061a;

    /* JADX INFO: renamed from: b */
    String f34062b;

    /* JADX INFO: renamed from: c */
    String f34063c;

    /* JADX INFO: renamed from: d */
    String f34064d;

    /* JADX INFO: renamed from: e */
    String f34065e;

    /* JADX INFO: renamed from: f */
    Map<String, Object> f34066f;

    public C12784a(Map<String, Object> map) {
        m35323a(map);
    }

    /* JADX INFO: renamed from: a */
    public void m35323a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(C12770c.m35209b("117"));
            if (obj != null) {
                m35330d(String.valueOf(obj));
            }
            Object obj2 = map.get(C12770c.m35209b("116"));
            if (obj2 != null) {
                m35325b(String.valueOf(obj2));
            }
            Object obj3 = map.get(C12770c.m35209b("159"));
            if (obj3 instanceof Map) {
                Map<String, Object> map2 = (Map) obj3;
                m35326b(map2);
                if (map2 != null && !map2.isEmpty()) {
                    m35328c(String.valueOf(map2.get(C12770c.m35209b("160"))));
                }
            }
            Object obj4 = map.get(C12770c.m35209b(StatisticData.ERROR_CODE_NOT_FOUND));
            if (obj4 != null) {
                m35322a(String.valueOf(obj4));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m35325b(String str) {
        this.f34063c = str;
    }

    /* JADX INFO: renamed from: c */
    public void m35328c(String str) {
        this.f34064d = str;
    }

    /* JADX INFO: renamed from: d */
    public void m35330d(String str) {
        this.f34062b = str;
    }

    /* JADX INFO: renamed from: e */
    public String m35331e() {
        return this.f34064d;
    }

    /* JADX INFO: renamed from: f */
    public String m35332f() {
        return this.f34062b;
    }

    /* JADX INFO: renamed from: b */
    public Map<String, Object> m35324b() {
        return this.f34066f;
    }

    /* JADX INFO: renamed from: c */
    public String m35327c() {
        return this.f34065e;
    }

    /* JADX INFO: renamed from: d */
    public String m35329d() {
        return this.f34063c;
    }

    /* JADX INFO: renamed from: b */
    public void m35326b(Map<String, Object> map) {
        this.f34066f = map;
    }

    /* JADX INFO: renamed from: a */
    public Context m35320a() {
        return this.f34061a;
    }

    /* JADX INFO: renamed from: a */
    public void m35321a(Context context) {
        this.f34061a = context;
    }

    /* JADX INFO: renamed from: a */
    public void m35322a(String str) {
        this.f34065e = str;
    }
}

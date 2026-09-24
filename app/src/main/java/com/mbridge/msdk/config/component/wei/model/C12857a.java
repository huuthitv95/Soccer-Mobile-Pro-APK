package com.mbridge.msdk.config.component.wei.model;

import com.bykv.p028vk.openvk.preload.falconx.statistic.StatisticData;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.config.component.common.file.C12752a;
import com.mbridge.msdk.config.component.common.file.C12753b;
import com.mbridge.msdk.config.component.common.util.C12770c;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.wei.model.a */
/* JADX INFO: compiled from: WebViewModel.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12857a {

    /* JADX INFO: renamed from: a */
    private String f34484a;

    /* JADX INFO: renamed from: b */
    private String f34485b;

    /* JADX INFO: renamed from: c */
    private String f34486c;

    /* JADX INFO: renamed from: d */
    private String f34487d;

    /* JADX INFO: renamed from: e */
    private String f34488e;

    /* JADX INFO: renamed from: f */
    private AdSession f34489f;

    /* JADX INFO: renamed from: g */
    private boolean f34490g;

    /* JADX INFO: renamed from: h */
    private String f34491h;

    /* JADX INFO: renamed from: i */
    private List<Map<String, Object>> f34492i;

    public C12857a(Map<String, Object> map) {
        m35853a(map);
    }

    /* JADX INFO: renamed from: a */
    public void m35851a(String str) {
        this.f34487d = str;
    }

    /* JADX INFO: renamed from: b */
    public void m35855b(String str) {
        this.f34486c = str;
    }

    /* JADX INFO: renamed from: c */
    public String m35856c() {
        return this.f34491h;
    }

    /* JADX INFO: renamed from: d */
    public void m35859d(String str) {
        this.f34484a = str;
    }

    /* JADX INFO: renamed from: e */
    public void m35861e(String str) {
        this.f34488e = str;
    }

    /* JADX INFO: renamed from: f */
    public String m35862f() {
        return this.f34485b;
    }

    /* JADX INFO: renamed from: g */
    public String m35863g() {
        return this.f34484a;
    }

    /* JADX INFO: renamed from: h */
    public String m35864h() {
        return this.f34488e;
    }

    /* JADX INFO: renamed from: i */
    public boolean m35865i() {
        return this.f34490g;
    }

    /* JADX INFO: renamed from: a */
    public AdSession m35850a() {
        return this.f34489f;
    }

    /* JADX INFO: renamed from: b */
    public String m35854b() {
        return this.f34487d;
    }

    /* JADX INFO: renamed from: c */
    public void m35857c(String str) {
        this.f34485b = str;
    }

    /* JADX INFO: renamed from: d */
    public String m35858d() {
        return this.f34486c;
    }

    /* JADX INFO: renamed from: e */
    public List<Map<String, Object>> m35860e() {
        return this.f34492i;
    }

    /* JADX INFO: renamed from: a */
    public void m35852a(List<Map<String, Object>> list) {
        this.f34492i = list;
    }

    /* JADX INFO: renamed from: a */
    public void m35853a(Map<String, Object> map) {
        C12753b c12753bM35047a;
        if (map != null) {
            Object obj = map.get(C12770c.m35209b("116"));
            if (obj != null) {
                String strValueOf = String.valueOf(obj);
                if (strValueOf.contains(".zip") && (c12753bM35047a = C12752a.m35047a(strValueOf, 1, null)) != null && c12753bM35047a.m35073e()) {
                    m35857c(C12752a.m35049a(strValueOf, c12753bM35047a.m35070d()));
                }
                m35859d(strValueOf);
            }
            Object obj2 = map.get(C12770c.m35209b("125"));
            if (obj2 != null) {
                m35855b(String.valueOf(obj2));
            }
            Object obj3 = map.get(C12770c.m35209b(StatisticData.ERROR_CODE_NOT_FOUND));
            if (obj3 != null) {
                m35851a(String.valueOf(obj3));
            }
            Object obj4 = map.get(C12770c.m35209b("123"));
            if (obj4 != null) {
                m35861e(String.valueOf(obj4));
            }
            Object obj5 = map.get(C12770c.m35209b("127"));
            if (obj5 instanceof List) {
                m35852a((List<Map<String, Object>>) obj5);
            }
        }
    }
}

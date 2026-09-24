package com.mbridge.msdk.config.component.style.model;

import com.bykv.p028vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.style.model.b */
/* JADX INFO: compiled from: XMLViewModel.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12846b {

    /* JADX INFO: renamed from: a */
    private String f34432a;

    /* JADX INFO: renamed from: b */
    private String f34433b;

    /* JADX INFO: renamed from: c */
    private String f34434c;

    /* JADX INFO: renamed from: d */
    private List<C12845a> f34435d;

    public C12846b(Map<String, Object> map) {
        m35790a(map);
    }

    /* JADX INFO: renamed from: b */
    private C12845a m35786b(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        C12845a c12845a = new C12845a();
        Object obj = map.get(C12770c.m35209b("130"));
        if (obj != null) {
            c12845a.m35775a(String.valueOf(obj));
        }
        Object obj2 = map.get(C12770c.m35209b("123"));
        if (obj2 != null) {
            c12845a.m35779c(String.valueOf(obj2));
        }
        Object obj3 = map.get(C12770c.m35209b("131"));
        if (obj3 != null) {
            c12845a.m35774a(obj3);
        }
        Object obj4 = map.get(C12770c.m35209b("134"));
        if (obj4 != null) {
            c12845a.m35777b(String.valueOf(obj4));
        }
        Object obj5 = map.get(C12770c.m35209b("132"));
        if (obj5 != null) {
            c12845a.m35783e(String.valueOf(obj5));
        }
        Object obj6 = map.get(C12770c.m35209b("133"));
        if (obj6 != null) {
            c12845a.m35781d(String.valueOf(obj6));
        }
        return c12845a;
    }

    /* JADX INFO: renamed from: a */
    public void m35790a(Map<String, Object> map) {
        if (map != null) {
            try {
                Object obj = map.get(C12770c.m35209b("116"));
                if (obj != null) {
                    m35794c(String.valueOf(obj));
                }
                Object obj2 = map.get(C12770c.m35209b(StatisticData.ERROR_CODE_NOT_FOUND));
                if (obj2 != null) {
                    m35788a(String.valueOf(obj2));
                }
                Object obj3 = map.get(C12770c.m35209b("129"));
                if (obj3 != null) {
                    m35785a(obj3);
                }
                Object obj4 = map.get(C12770c.m35209b("156"));
                if (obj4 != null) {
                    m35792b(String.valueOf(obj4));
                } else {
                    m35792b(String.valueOf(C13211m0.m37728G(C13008c.m36588n().m36542d())));
                }
            } catch (Exception e) {
                C13219q0.m37816b("XMLViewModel", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public String m35793c() {
        return this.f34432a;
    }

    /* JADX INFO: renamed from: d */
    public List<C12845a> m35795d() {
        return this.f34435d;
    }

    /* JADX INFO: renamed from: c */
    public void m35794c(String str) {
        this.f34432a = str;
    }

    /* JADX INFO: renamed from: a */
    private void m35785a(Object obj) {
        C12845a c12845aM35786b;
        C12845a c12845aM35786b2;
        if (obj == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                if ((obj2 instanceof Map) && (c12845aM35786b2 = m35786b((Map<String, Object>) obj2)) != null) {
                    arrayList.add(c12845aM35786b2);
                }
            }
        } else if ((obj instanceof Map) && (c12845aM35786b = m35786b((Map<String, Object>) obj)) != null) {
            arrayList.add(c12845aM35786b);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        m35789a((List<C12845a>) arrayList);
    }

    /* JADX INFO: renamed from: b */
    public String m35791b() {
        return this.f34434c;
    }

    /* JADX INFO: renamed from: b */
    public void m35792b(String str) {
        this.f34434c = str;
    }

    /* JADX INFO: renamed from: a */
    public String m35787a() {
        return this.f34433b;
    }

    /* JADX INFO: renamed from: a */
    public void m35788a(String str) {
        this.f34433b = str;
    }

    /* JADX INFO: renamed from: a */
    public void m35789a(List<C12845a> list) {
        this.f34435d = list;
    }
}

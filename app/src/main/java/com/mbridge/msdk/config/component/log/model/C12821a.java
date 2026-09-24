package com.mbridge.msdk.config.component.log.model;

import com.mbridge.msdk.config.component.common.util.C12770c;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.log.model.a */
/* JADX INFO: compiled from: LogSenderModel.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12821a {

    /* JADX INFO: renamed from: a */
    private int f34254a = 0;

    /* JADX INFO: renamed from: b */
    private int f34255b = 0;

    /* JADX INFO: renamed from: c */
    private int f34256c = 0;

    /* JADX INFO: renamed from: d */
    private int f34257d = 0;

    /* JADX INFO: renamed from: e */
    private int f34258e = 0;

    /* JADX INFO: renamed from: f */
    private int f34259f = 0;

    /* JADX INFO: renamed from: g */
    private int f34260g = 0;

    /* JADX INFO: renamed from: h */
    private Map<String, Object> f34261h;

    /* JADX INFO: renamed from: i */
    private Map<String, Object> f34262i;

    /* JADX INFO: renamed from: j */
    private Map<String, Object> f34263j;

    /* JADX INFO: renamed from: k */
    private int f34264k;

    /* JADX INFO: renamed from: a */
    public void m35521a(Map<String, Object> map) {
        if (map != null) {
            if (map.containsKey(C12770c.m35209b("181"))) {
                this.f34254a = ((Integer) map.get(C12770c.m35209b("181"))).intValue();
            }
            if (map.containsKey(C12770c.m35209b("162"))) {
                this.f34255b = ((Integer) map.get(C12770c.m35209b("162"))).intValue();
            }
            if (map.containsKey(C12770c.m35209b("182"))) {
                this.f34256c = ((Integer) map.get(C12770c.m35209b("182"))).intValue();
            }
            if (map.containsKey(C12770c.m35209b("183"))) {
                this.f34257d = ((Integer) map.get(C12770c.m35209b("183"))).intValue();
            }
            if (map.containsKey(C12770c.m35209b("174"))) {
                this.f34258e = ((Integer) map.get(C12770c.m35209b("174"))).intValue();
            }
            if (map.containsKey(C12770c.m35209b("184"))) {
                this.f34259f = ((Integer) map.get(C12770c.m35209b("184"))).intValue();
            }
            if (map.containsKey(C12770c.m35209b("185"))) {
                this.f34260g = ((Integer) map.get(C12770c.m35209b("185"))).intValue();
            }
            if (map.containsKey(C12770c.m35209b("180"))) {
                this.f34261h = (Map) map.get(C12770c.m35209b("180"));
            }
            if (map.containsKey(C12770c.m35209b("179"))) {
                this.f34262i = (Map) map.get(C12770c.m35209b("179"));
            }
            if (map.containsKey(C12770c.m35209b("186"))) {
                this.f34263j = (Map) map.get(C12770c.m35209b("186"));
            }
            this.f34264k = map.containsKey(C12770c.m35209b("178")) ? ((Integer) map.get(C12770c.m35209b("178"))).intValue() : 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public int m35522b() {
        return this.f34255b;
    }

    /* JADX INFO: renamed from: c */
    public String m35523c() {
        Map<String, Object> map = this.f34261h;
        return (map == null || !map.containsKey(C12770c.m35209b("116"))) ? "" : (String) this.f34261h.get(C12770c.m35209b("116"));
    }

    /* JADX INFO: renamed from: d */
    public int m35524d() {
        return this.f34259f;
    }

    /* JADX INFO: renamed from: e */
    public int m35525e() {
        return this.f34264k;
    }

    /* JADX INFO: renamed from: f */
    public int m35526f() {
        Map<String, Object> map = this.f34261h;
        return (map == null || map.isEmpty()) ? 1 : 0;
    }

    /* JADX INFO: renamed from: g */
    public int m35527g() {
        return this.f34258e;
    }

    /* JADX INFO: renamed from: h */
    public Map<String, Object> m35528h() {
        return this.f34263j;
    }

    /* JADX INFO: renamed from: i */
    public String m35529i() {
        Map<String, Object> map = this.f34262i;
        return (map == null || !map.containsKey(C12770c.m35209b("114"))) ? "" : (String) this.f34262i.get(C12770c.m35209b("114"));
    }

    /* JADX INFO: renamed from: j */
    public int m35530j() {
        Map<String, Object> map = this.f34262i;
        if (map == null || !map.containsKey(C12770c.m35209b("172"))) {
            return 0;
        }
        return ((Integer) this.f34262i.get(C12770c.m35209b("172"))).intValue();
    }

    /* JADX INFO: renamed from: k */
    public int m35531k() {
        return this.f34260g;
    }

    /* JADX INFO: renamed from: a */
    public int m35520a() {
        return this.f34254a;
    }
}

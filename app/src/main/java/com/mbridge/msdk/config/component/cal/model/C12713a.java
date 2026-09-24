package com.mbridge.msdk.config.component.cal.model;

import com.bykv.p028vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.config.component.common.util.C12770c;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.cal.model.a */
/* JADX INFO: compiled from: CallBackModel.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12713a {

    /* JADX INFO: renamed from: a */
    private String f33824a;

    /* JADX INFO: renamed from: b */
    private String f33825b;

    /* JADX INFO: renamed from: c */
    private Map<String, Object> f33826c;

    /* JADX INFO: renamed from: d */
    private String f33827d;

    /* JADX INFO: renamed from: e */
    private String f33828e;

    /* JADX INFO: renamed from: f */
    private int f33829f;

    /* JADX INFO: renamed from: g */
    private String f33830g;

    /* JADX INFO: renamed from: h */
    private int f33831h;

    public C12713a(Map<String, Object> map) {
        m34867a(map);
    }

    /* JADX INFO: renamed from: a */
    public void m34867a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(C12770c.m35209b(StatisticData.ERROR_CODE_NOT_FOUND));
            if (obj != null) {
                this.f33824a = String.valueOf(obj);
            }
            Object obj2 = map.get(C12770c.m35209b("106"));
            if (obj2 != null) {
                this.f33825b = String.valueOf(obj2);
            }
            Object obj3 = map.get(C12770c.m35209b("103"));
            if (obj3 instanceof Map) {
                this.f33826c = (Map) obj3;
            }
            Object obj4 = map.get(C12770c.m35209b(StatisticData.ERROR_CODE_IO_ERROR));
            if (obj4 != null) {
                this.f33827d = String.valueOf(obj4);
            }
            Object obj5 = map.get(C12770c.m35209b("102"));
            if (obj5 != null) {
                this.f33828e = String.valueOf(obj5);
            }
            Object obj6 = map.get(C12770c.m35209b("104"));
            if (obj6 instanceof String) {
                this.f33829f = Integer.parseInt(String.valueOf(obj6));
            }
            if (obj6 instanceof Integer) {
                this.f33829f = ((Integer) obj6).intValue();
            }
            Object obj7 = map.get(C12770c.m35209b("115"));
            if (obj7 instanceof String) {
                this.f33830g = String.valueOf(obj7);
            }
            String strValueOf = String.valueOf(map.get(C12770c.m35209b("init_status")));
            if (strValueOf.equalsIgnoreCase(AbstractJsonLexerKt.NULL)) {
                m34866a(1);
            } else {
                m34866a(Integer.parseInt(strValueOf));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public String m34868b() {
        return this.f33824a;
    }

    /* JADX INFO: renamed from: c */
    public String m34869c() {
        return this.f33828e;
    }

    /* JADX INFO: renamed from: d */
    public int m34870d() {
        return this.f33831h;
    }

    /* JADX INFO: renamed from: e */
    public int m34871e() {
        return this.f33829f;
    }

    /* JADX INFO: renamed from: f */
    public Map<String, Object> m34872f() {
        return this.f33826c;
    }

    /* JADX INFO: renamed from: g */
    public String m34873g() {
        return this.f33825b;
    }

    /* JADX INFO: renamed from: a */
    public String m34865a() {
        return this.f33830g;
    }

    /* JADX INFO: renamed from: a */
    public void m34866a(int i) {
        this.f33831h = i;
    }
}

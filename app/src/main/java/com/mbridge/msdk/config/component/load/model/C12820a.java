package com.mbridge.msdk.config.component.load.model;

import com.bykv.p028vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.config.component.common.util.C12770c;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.model.a */
/* JADX INFO: compiled from: DownloadModel.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12820a {

    /* JADX INFO: renamed from: a */
    private String f34246a;

    /* JADX INFO: renamed from: c */
    private String f34248c;

    /* JADX INFO: renamed from: f */
    private int f34251f;

    /* JADX INFO: renamed from: b */
    private float f34247b = 1.0f;

    /* JADX INFO: renamed from: d */
    private int f34249d = 30;

    /* JADX INFO: renamed from: e */
    private int f34250e = 0;

    public C12820a(Map<String, Object> map) {
        m35512a(map);
    }

    /* JADX INFO: renamed from: a */
    public void m35512a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(C12770c.m35209b("116"));
            if (obj != null) {
                this.f34246a = String.valueOf(obj);
            }
            Object obj2 = map.get(C12770c.m35209b("191"));
            if (obj2 != null) {
                float f = Float.parseFloat(String.valueOf(obj2));
                if (f <= 0.0f || f > 1.0f) {
                    f = 1.0f;
                }
                this.f34247b = f;
            }
            Object obj3 = map.get(C12770c.m35209b(StatisticData.ERROR_CODE_NOT_FOUND));
            if (obj3 != null) {
                this.f34248c = String.valueOf(obj3);
            }
            Object obj4 = map.get(C12770c.m35209b("162"));
            if (obj4 != null) {
                int i = Integer.parseInt(String.valueOf(obj4));
                if (i == 0) {
                    i = 30;
                }
                this.f34249d = i;
            }
            Object obj5 = map.get(C12770c.m35209b("174"));
            if (obj5 != null) {
                this.f34250e = Integer.parseInt(String.valueOf(obj5));
            }
            Object obj6 = map.get(C12770c.m35209b("192"));
            if (obj6 != null) {
                this.f34251f = Integer.parseInt(String.valueOf(obj6));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public float m35513b() {
        return this.f34247b;
    }

    /* JADX INFO: renamed from: c */
    public int m35514c() {
        return this.f34251f;
    }

    /* JADX INFO: renamed from: d */
    public String m35515d() {
        return this.f34246a;
    }

    /* JADX INFO: renamed from: e */
    public int m35516e() {
        return this.f34250e;
    }

    /* JADX INFO: renamed from: f */
    public int m35517f() {
        return this.f34249d * 1000;
    }

    /* JADX INFO: renamed from: a */
    public String m35511a() {
        return this.f34248c;
    }
}

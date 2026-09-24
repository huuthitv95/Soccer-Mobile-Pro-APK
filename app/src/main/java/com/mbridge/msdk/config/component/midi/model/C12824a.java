package com.mbridge.msdk.config.component.midi.model;

import android.text.TextUtils;
import com.bykv.p028vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.dynamic.baseview.cusview.CusPlayerView;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.midi.model.a */
/* JADX INFO: compiled from: PlayerModel.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12824a {

    /* JADX INFO: renamed from: a */
    private String f34280a;

    /* JADX INFO: renamed from: b */
    private String f34281b;

    /* JADX INFO: renamed from: d */
    private int f34283d;

    /* JADX INFO: renamed from: e */
    private int f34284e;

    /* JADX INFO: renamed from: g */
    private String f34286g;

    /* JADX INFO: renamed from: h */
    private String f34287h;

    /* JADX INFO: renamed from: i */
    private CusPlayerView f34288i;

    /* JADX INFO: renamed from: c */
    private String f34282c = "0";

    /* JADX INFO: renamed from: f */
    private int f34285f = 5000;

    public C12824a(Map<String, Object> map) {
        m35572a(map);
    }

    /* JADX INFO: renamed from: a */
    public void m35572a(Map<String, Object> map) {
        if (map != null) {
            try {
                Object obj = map.get(C12770c.m35209b("116"));
                if (obj != null) {
                    String strValueOf = String.valueOf(obj);
                    if (!TextUtils.isEmpty(strValueOf)) {
                        m35582e(strValueOf);
                    }
                }
                Object obj2 = map.get(C12770c.m35209b(StatisticData.ERROR_CODE_NOT_FOUND));
                if (obj2 != null) {
                    String strValueOf2 = String.valueOf(obj2);
                    if (!TextUtils.isEmpty(strValueOf2)) {
                        m35571a(strValueOf2);
                    }
                }
                Object obj3 = map.get(C12770c.m35209b("122"));
                if (obj3 != null) {
                    String strValueOf3 = String.valueOf(obj3);
                    if (!TextUtils.isEmpty(strValueOf3)) {
                        m35578c(strValueOf3);
                    }
                }
                Object obj4 = map.get(C12770c.m35209b("123"));
                if (obj4 != null) {
                    String strValueOf4 = String.valueOf(obj4);
                    if (!TextUtils.isEmpty(strValueOf4)) {
                        m35580d(strValueOf4);
                    }
                }
                Object obj5 = map.get(C12770c.m35209b("124"));
                if (obj5 != null) {
                    m35575b(String.valueOf(obj5));
                }
            } catch (Exception e) {
                C13219q0.m37817b("PlayerModel", e.getMessage(), e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m35576b(Map<String, Object> map) {
        if (map != null) {
            try {
                if (map.containsKey(C12770c.m35209b("162"))) {
                    Object obj = map.get(C12770c.m35209b("162"));
                    if (obj instanceof Map) {
                        Map map2 = (Map) obj;
                        Object obj2 = map2.get("playTimeout");
                        if (obj2 instanceof String) {
                            m35574b(Integer.valueOf(obj2.toString()).intValue() * 1000);
                        } else if (obj2 instanceof Integer) {
                            m35574b(((Integer) obj2).intValue() * 1000);
                        }
                        Object obj3 = map2.get("bufferTimeout");
                        if (obj3 instanceof String) {
                            m35569a(Integer.valueOf(obj3.toString()).intValue() * 1000);
                        } else if (obj3 instanceof Integer) {
                            m35569a(((Integer) obj3).intValue() * 1000);
                        }
                    }
                }
            } catch (Exception e) {
                C13219q0.m37817b("PlayerModel", e.getMessage(), e);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m35578c(String str) {
        this.f34282c = str;
    }

    /* JADX INFO: renamed from: d */
    public CusPlayerView m35579d() {
        return this.f34288i;
    }

    /* JADX INFO: renamed from: e */
    public void m35582e(String str) {
        this.f34280a = str;
    }

    /* JADX INFO: renamed from: f */
    public String m35583f() {
        return this.f34282c;
    }

    /* JADX INFO: renamed from: g */
    public int m35584g() {
        return this.f34285f;
    }

    /* JADX INFO: renamed from: h */
    public String m35585h() {
        return this.f34286g;
    }

    /* JADX INFO: renamed from: i */
    public String m35586i() {
        return this.f34280a;
    }

    /* JADX INFO: renamed from: c */
    public int m35577c() {
        return this.f34283d;
    }

    /* JADX INFO: renamed from: d */
    public void m35580d(String str) {
        this.f34286g = str;
    }

    /* JADX INFO: renamed from: e */
    public String m35581e() {
        return this.f34287h;
    }

    /* JADX INFO: renamed from: b */
    public String m35573b() {
        return this.f34281b;
    }

    /* JADX INFO: renamed from: b */
    public void m35575b(String str) {
        this.f34287h = str;
    }

    /* JADX INFO: renamed from: b */
    public void m35574b(int i) {
        this.f34285f = i;
    }

    /* JADX INFO: renamed from: a */
    public void m35570a(CusPlayerView cusPlayerView) {
        this.f34288i = cusPlayerView;
    }

    /* JADX INFO: renamed from: a */
    public void m35571a(String str) {
        this.f34281b = str;
    }

    /* JADX INFO: renamed from: a */
    public int m35568a() {
        return this.f34284e;
    }

    /* JADX INFO: renamed from: a */
    public void m35569a(int i) {
        this.f34284e = i;
    }
}

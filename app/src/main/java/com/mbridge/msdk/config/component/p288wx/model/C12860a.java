package com.mbridge.msdk.config.component.p288wx.model;

import android.content.Context;
import com.mbridge.msdk.config.component.common.util.C12770c;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.wx.model.a */
/* JADX INFO: compiled from: WXMiniAppModel.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12860a {

    /* JADX INFO: renamed from: a */
    private Context f34499a;

    /* JADX INFO: renamed from: b */
    private String f34500b;

    /* JADX INFO: renamed from: c */
    private String f34501c;

    /* JADX INFO: renamed from: d */
    private String f34502d;

    /* JADX INFO: renamed from: e */
    private String f34503e;

    /* JADX INFO: renamed from: f */
    private String f34504f;

    public C12860a(Map<String, Object> map) {
        m35876a(map);
    }

    /* JADX INFO: renamed from: a */
    public void m35876a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(C12770c.m35209b("145"));
            if (obj != null) {
                m35884e(String.valueOf(obj));
            }
            Object obj2 = map.get(C12770c.m35209b("147"));
            if (obj2 != null) {
                m35880c(String.valueOf(obj2));
            }
            Object obj3 = map.get(C12770c.m35209b("148"));
            if (obj3 != null) {
                m35882d(String.valueOf(obj3));
            }
            Object obj4 = map.get(C12770c.m35209b("193"));
            if (obj4 != null) {
                m35875a(String.valueOf(obj4));
            }
            Object obj5 = map.get(C12770c.m35209b("146"));
            if (obj5 != null) {
                m35878b(String.valueOf(obj5));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public Context m35877b() {
        return this.f34499a;
    }

    /* JADX INFO: renamed from: c */
    public String m35879c() {
        return this.f34501c;
    }

    /* JADX INFO: renamed from: d */
    public String m35881d() {
        return this.f34502d;
    }

    /* JADX INFO: renamed from: e */
    public String m35883e() {
        return this.f34500b;
    }

    /* JADX INFO: renamed from: b */
    public void m35878b(String str) {
        this.f34504f = str;
    }

    /* JADX INFO: renamed from: c */
    public void m35880c(String str) {
        this.f34501c = str;
    }

    /* JADX INFO: renamed from: d */
    public void m35882d(String str) {
        this.f34502d = str;
    }

    /* JADX INFO: renamed from: e */
    public void m35884e(String str) {
        this.f34500b = str;
    }

    /* JADX INFO: renamed from: a */
    public void m35874a(Context context) {
        this.f34499a = context;
    }

    /* JADX INFO: renamed from: a */
    public String m35873a() {
        return this.f34503e;
    }

    /* JADX INFO: renamed from: a */
    public void m35875a(String str) {
        this.f34503e = str;
    }
}

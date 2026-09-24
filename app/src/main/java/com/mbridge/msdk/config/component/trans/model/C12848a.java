package com.mbridge.msdk.config.component.trans.model;

import com.mbridge.msdk.config.component.common.util.C12770c;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.trans.model.a */
/* JADX INFO: compiled from: TransformModel.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12848a {

    /* JADX INFO: renamed from: a */
    private String f34447a;

    public C12848a(Map<String, Object> map) {
        m35798a(map);
    }

    /* JADX INFO: renamed from: a */
    public void m35798a(Map<String, Object> map) {
        Object obj;
        if (map == null || (obj = map.get(C12770c.m35209b("118"))) == null) {
            return;
        }
        m35797a(String.valueOf(obj).replace("'", ""));
    }

    /* JADX INFO: renamed from: a */
    public String m35796a() {
        return this.f34447a;
    }

    /* JADX INFO: renamed from: a */
    public void m35797a(String str) {
        this.f34447a = str;
    }
}

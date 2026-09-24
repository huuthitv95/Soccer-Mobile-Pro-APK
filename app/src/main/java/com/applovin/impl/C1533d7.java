package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.d7 */
/* JADX INFO: loaded from: classes3.dex */
public class C1533d7 {

    /* JADX INFO: renamed from: a */
    private final a f1378a;

    /* JADX INFO: renamed from: b */
    private final Integer f1379b;

    /* JADX INFO: renamed from: c */
    private final String f1380c;

    /* JADX INFO: renamed from: d */
    private final String f1381d;

    /* JADX INFO: renamed from: e */
    private Boolean f1382e;

    /* JADX INFO: renamed from: com.applovin.impl.d7$a */
    public enum a {
        TCF_VENDOR,
        ATP_NETWORK,
        OTHER;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static a m2428b(int i) {
            if (i != 0) {
                return i != 1 ? OTHER : ATP_NETWORK;
            }
            return TCF_VENDOR;
        }
    }

    public C1533d7(JSONObject jSONObject, String str) {
        this.f1381d = str;
        this.f1378a = a.m2428b(JsonUtils.getInt(jSONObject, "type", a.OTHER.ordinal()));
        this.f1379b = JsonUtils.getInteger(jSONObject, "id", null);
        this.f1380c = JsonUtils.getString(jSONObject, "name", null);
    }

    /* JADX INFO: renamed from: a */
    public Boolean m2419a() {
        return this.f1382e;
    }

    /* JADX INFO: renamed from: a */
    public void m2420a(Boolean bool) {
        this.f1382e = bool;
    }

    /* JADX INFO: renamed from: b */
    public String m2421b() {
        return this.f1381d;
    }

    /* JADX INFO: renamed from: c */
    public String m2422c() {
        return this.f1380c;
    }

    /* JADX INFO: renamed from: d */
    public Integer m2423d() {
        return this.f1379b;
    }

    /* JADX INFO: renamed from: e */
    public String m2424e() {
        Boolean bool = this.f1382e;
        return "\n" + this.f1381d + " - " + (bool != null ? String.valueOf(bool) : AbstractC1694q0.m3953b().m3958a(C1748l.m4756p()));
    }

    /* JADX INFO: renamed from: f */
    public a m2425f() {
        return this.f1378a;
    }
}

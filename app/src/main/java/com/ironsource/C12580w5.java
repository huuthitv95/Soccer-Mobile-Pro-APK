package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.UUID;
import kotlin.UByte$$ExternalSyntheticBackport0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.w5 */
/* JADX INFO: loaded from: classes6.dex */
public class C12580w5 {

    /* JADX INFO: renamed from: e */
    static final String f32688e = "euid";

    /* JADX INFO: renamed from: f */
    static final String f32689f = "esat";

    /* JADX INFO: renamed from: g */
    static final String f32690g = "esfr";

    /* JADX INFO: renamed from: h */
    static final int f32691h = 1;

    /* JADX INFO: renamed from: a */
    private int f32692a;

    /* JADX INFO: renamed from: b */
    private long f32693b;

    /* JADX INFO: renamed from: c */
    private int f32694c;

    /* JADX INFO: renamed from: d */
    private final JSONObject f32695d;

    public C12580w5(EnumC12598x5 enumC12598x5, JSONObject jSONObject) {
        this(enumC12598x5.m34138b(), jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public String m34041a() {
        return this.f32695d.toString();
    }

    /* JADX INFO: renamed from: b */
    public JSONObject m34045b() {
        return this.f32695d;
    }

    /* JADX INFO: renamed from: c */
    public int m34046c() {
        return this.f32692a;
    }

    /* JADX INFO: renamed from: d */
    public long m34047d() {
        return this.f32693b;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C12580w5 c12580w5 = (C12580w5) obj;
        return this.f32692a == c12580w5.f32692a && this.f32693b == c12580w5.f32693b && this.f32694c == c12580w5.f32694c && C12442qa.m33165a(this.f32695d, c12580w5.f32695d);
    }

    public int hashCode() {
        return (((((this.f32692a * 31) + UByte$$ExternalSyntheticBackport0.m43485m(this.f32693b)) * 31) + this.f32695d.toString().hashCode()) * 31) + this.f32694c;
    }

    public String toString() {
        return ("{\"eventId\":" + m34046c() + ",\"timestamp\":" + m34047d() + "," + m34041a().substring(1) + "}").replace(",", "\n");
    }

    public C12580w5(int i, JSONObject jSONObject) {
        this(i, new InterfaceC12400o4.a().mo32926a(), jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public void m34042a(int i) {
        this.f32692a = i;
    }

    public C12580w5(int i, long j, String str) throws JSONException {
        this(i, j, new JSONObject(str));
    }

    /* JADX INFO: renamed from: a */
    public void m34044a(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            this.f32695d.put(str, obj);
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public C12580w5(EnumC12598x5 enumC12598x5, long j, JSONObject jSONObject) {
        this(enumC12598x5.m34138b(), j, jSONObject);
    }

    public C12580w5(int i, long j, JSONObject jSONObject) {
        this.f32694c = 1;
        this.f32692a = i;
        this.f32693b = j;
        jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
        this.f32695d = jSONObject;
        if (!jSONObject.has(f32688e)) {
            m34044a(f32688e, UUID.randomUUID().toString());
        }
        if (!jSONObject.has(f32689f)) {
            m34044a(f32689f, Integer.valueOf(this.f32694c));
        } else {
            this.f32694c = jSONObject.optInt(f32689f, 1);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m34043a(String str) {
        m34044a(f32690g, str);
        int i = this.f32694c + 1;
        this.f32694c = i;
        m34044a(f32689f, Integer.valueOf(i));
    }
}

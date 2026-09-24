package com.mbridge.msdk.setting;

import com.mbridge.msdk.foundation.same.net.utils.C13121d;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.setting.d */
/* JADX INFO: compiled from: EventLibMonitorSetting.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13632d {

    /* JADX INFO: renamed from: f */
    private String f38088f;

    /* JADX INFO: renamed from: g */
    private String f38089g;

    /* JADX INFO: renamed from: h */
    private int f38090h;

    /* JADX INFO: renamed from: a */
    private int f38083a = 1;

    /* JADX INFO: renamed from: b */
    private int f38084b = 1;

    /* JADX INFO: renamed from: c */
    private int f38085c = 0;

    /* JADX INFO: renamed from: d */
    private int f38086d = 30;

    /* JADX INFO: renamed from: e */
    private int f38087e = 0;

    /* JADX INFO: renamed from: i */
    private int f38091i = 0;

    /* JADX INFO: renamed from: a */
    public static C13632d m39682a(String str) {
        Exception e;
        C13632d c13632d;
        try {
            JSONObject jSONObject = new JSONObject(str);
            c13632d = new C13632d();
            try {
                c13632d.m39687b(jSONObject.optString("h_d", C13121d.m37226h().f36028f));
                c13632d.m39690c(jSONObject.optString("t_d", C13121d.m37226h().f36034k));
                c13632d.m39689c(jSONObject.optInt("t_p", C13121d.m37226h().f36038o));
                c13632d.m39692d(jSONObject.optInt("type", 1));
                c13632d.m39686b(jSONObject.optInt("d_t", 30));
                c13632d.m39684a(jSONObject.optInt("d_a", 0));
                return c13632d;
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                return c13632d;
            }
        } catch (Exception e3) {
            e = e3;
            c13632d = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public int m39683a() {
        return this.f38085c;
    }

    /* JADX INFO: renamed from: a */
    public void m39684a(int i) {
        this.f38085c = i;
    }

    /* JADX INFO: renamed from: b */
    public int m39685b() {
        return this.f38086d;
    }

    /* JADX INFO: renamed from: b */
    public void m39686b(int i) {
        this.f38086d = i;
    }

    /* JADX INFO: renamed from: b */
    public void m39687b(String str) {
        this.f38088f = str;
    }

    /* JADX INFO: renamed from: c */
    public String m39688c() {
        return this.f38088f;
    }

    /* JADX INFO: renamed from: c */
    public void m39689c(int i) {
        this.f38090h = i;
    }

    /* JADX INFO: renamed from: c */
    public void m39690c(String str) {
        this.f38089g = str;
    }

    /* JADX INFO: renamed from: d */
    public String m39691d() {
        return this.f38089g;
    }

    /* JADX INFO: renamed from: d */
    public void m39692d(int i) {
        this.f38091i = i;
    }

    /* JADX INFO: renamed from: e */
    public int m39693e() {
        return this.f38090h;
    }
}

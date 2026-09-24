package com.mbridge.msdk.setting;

import com.mbridge.msdk.foundation.same.net.utils.C13121d;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.setting.a */
/* JADX INFO: compiled from: BCP.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13629a {

    /* JADX INFO: renamed from: e */
    private String f37917e;

    /* JADX INFO: renamed from: f */
    private String f37918f;

    /* JADX INFO: renamed from: g */
    private int f37919g;

    /* JADX INFO: renamed from: a */
    private int f37913a = 1;

    /* JADX INFO: renamed from: b */
    private int f37914b = 0;

    /* JADX INFO: renamed from: c */
    private int f37915c = 0;

    /* JADX INFO: renamed from: d */
    private int f37916d = 0;

    /* JADX INFO: renamed from: h */
    private int f37920h = 0;

    /* JADX INFO: renamed from: a */
    public static C13629a m39365a(String str) {
        Exception e;
        C13629a c13629a;
        try {
            JSONObject jSONObject = new JSONObject(str);
            c13629a = new C13629a();
            try {
                c13629a.m39370b(jSONObject.optString("http_domain", C13121d.m37226h().f36031h));
                c13629a.m39373c(jSONObject.optString("tcp_domain", C13121d.m37226h().f36035l));
                c13629a.m39377e(jSONObject.optInt("tcp_port", C13121d.m37226h().f36039p));
                c13629a.m39379f(jSONObject.optInt("type", 0));
                c13629a.m39367a(jSONObject.optInt("batch_size", 1));
                c13629a.m39372c(jSONObject.optInt("duration", 0));
                c13629a.m39369b(jSONObject.optInt("disable", 0));
                c13629a.m39375d(jSONObject.optInt("e_t_l", 0));
                return c13629a;
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                return c13629a;
            }
        } catch (Exception e3) {
            e = e3;
            c13629a = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public int m39366a() {
        return this.f37913a;
    }

    /* JADX INFO: renamed from: a */
    public void m39367a(int i) {
        if (i < 1) {
            i = 1;
        }
        this.f37913a = i;
    }

    /* JADX INFO: renamed from: b */
    public int m39368b() {
        return this.f37914b;
    }

    /* JADX INFO: renamed from: b */
    public void m39369b(int i) {
        this.f37914b = i;
    }

    /* JADX INFO: renamed from: b */
    public void m39370b(String str) {
        this.f37917e = str;
    }

    /* JADX INFO: renamed from: c */
    public int m39371c() {
        return this.f37915c;
    }

    /* JADX INFO: renamed from: c */
    public void m39372c(int i) {
        this.f37915c = i;
    }

    /* JADX INFO: renamed from: c */
    public void m39373c(String str) {
        this.f37918f = str;
    }

    /* JADX INFO: renamed from: d */
    public int m39374d() {
        return this.f37916d;
    }

    /* JADX INFO: renamed from: d */
    public void m39375d(int i) {
        this.f37916d = i;
    }

    /* JADX INFO: renamed from: e */
    public String m39376e() {
        return this.f37917e;
    }

    /* JADX INFO: renamed from: e */
    public void m39377e(int i) {
        this.f37919g = i;
    }

    /* JADX INFO: renamed from: f */
    public String m39378f() {
        return this.f37918f;
    }

    /* JADX INFO: renamed from: f */
    public void m39379f(int i) {
        this.f37920h = i;
    }

    /* JADX INFO: renamed from: g */
    public int m39380g() {
        return this.f37919g;
    }

    /* JADX INFO: renamed from: h */
    public int m39381h() {
        return this.f37920h;
    }
}

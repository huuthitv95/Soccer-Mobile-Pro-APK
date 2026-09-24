package com.mbridge.msdk.tracker;

import java.io.Serializable;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.e */
/* JADX INFO: compiled from: Event.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13818e implements Serializable {

    /* JADX INFO: renamed from: a */
    private String f39375a;

    /* JADX INFO: renamed from: d */
    private JSONObject f39378d;

    /* JADX INFO: renamed from: i */
    private InterfaceC13821h f39383i;

    /* JADX INFO: renamed from: b */
    private int f39376b = 0;

    /* JADX INFO: renamed from: c */
    private int f39377c = 0;

    /* JADX INFO: renamed from: g */
    private long f39381g = 0;

    /* JADX INFO: renamed from: h */
    private long f39382h = 604800000;

    /* JADX INFO: renamed from: j */
    private boolean f39384j = false;

    /* JADX INFO: renamed from: k */
    private boolean f39385k = false;

    /* JADX INFO: renamed from: f */
    private long f39380f = System.currentTimeMillis();

    /* JADX INFO: renamed from: e */
    private String f39379e = UUID.randomUUID().toString();

    public C13818e(String str) {
        this.f39375a = str;
    }

    /* JADX INFO: renamed from: a */
    public void m41002a(int i) {
        this.f39377c = i;
    }

    /* JADX INFO: renamed from: a */
    public void m41003a(long j) {
        this.f39381g = j;
    }

    /* JADX INFO: renamed from: a */
    public void m41004a(InterfaceC13821h interfaceC13821h) {
        this.f39383i = interfaceC13821h;
    }

    /* JADX INFO: renamed from: a */
    void m41005a(String str) {
        this.f39379e = str;
    }

    /* JADX INFO: renamed from: a */
    public void m41006a(JSONObject jSONObject) {
        this.f39378d = jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public void m41007a(boolean z) {
        this.f39385k = z;
    }

    /* JADX INFO: renamed from: b */
    public void m41008b(int i) {
        this.f39376b = i;
    }

    /* JADX INFO: renamed from: b */
    void m41009b(long j) {
        this.f39382h = j;
    }

    /* JADX INFO: renamed from: c */
    public void m41010c(long j) {
        this.f39380f = j;
    }

    /* JADX INFO: renamed from: d */
    public long m41011d() {
        return this.f39381g;
    }

    /* JADX INFO: renamed from: g */
    public String m41012g() {
        return this.f39375a;
    }

    /* JADX INFO: renamed from: h */
    public int m41013h() {
        return this.f39377c;
    }

    /* JADX INFO: renamed from: i */
    public JSONObject m41014i() {
        JSONObject jSONObject = this.f39378d;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        this.f39378d = jSONObject2;
        return jSONObject2;
    }

    /* JADX INFO: renamed from: j */
    public InterfaceC13821h m41015j() {
        return this.f39383i;
    }

    /* JADX INFO: renamed from: k */
    public long m41016k() {
        return this.f39382h;
    }

    /* JADX INFO: renamed from: l */
    public long m41017l() {
        return this.f39380f;
    }

    /* JADX INFO: renamed from: m */
    public int m41018m() {
        return this.f39376b;
    }

    /* JADX INFO: renamed from: n */
    public String m41019n() {
        return this.f39379e;
    }

    /* JADX INFO: renamed from: o */
    public boolean m41020o() {
        return this.f39385k;
    }

    /* JADX INFO: renamed from: p */
    public boolean m41021p() {
        return this.f39384j;
    }
}

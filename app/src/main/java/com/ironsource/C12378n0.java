package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.n0 */
/* JADX INFO: loaded from: classes6.dex */
public class C12378n0 {

    /* JADX INFO: renamed from: a */
    private IronSource.EnumC12328a f31514a;

    /* JADX INFO: renamed from: b */
    private String f31515b;

    /* JADX INFO: renamed from: c */
    private NetworkSettings f31516c;

    /* JADX INFO: renamed from: d */
    private int f31517d;

    /* JADX INFO: renamed from: e */
    private int f31518e;

    /* JADX INFO: renamed from: f */
    private JSONObject f31519f;

    /* JADX INFO: renamed from: g */
    private String f31520g;

    /* JADX INFO: renamed from: h */
    private int f31521h;

    /* JADX INFO: renamed from: i */
    private String f31522i;

    public C12378n0(IronSource.EnumC12328a enumC12328a, String str, int i, JSONObject jSONObject, String str2, int i2, String str3, NetworkSettings networkSettings, int i3) {
        this.f31514a = enumC12328a;
        this.f31515b = str;
        this.f31518e = i;
        this.f31519f = jSONObject;
        this.f31520g = str2;
        this.f31521h = i2;
        this.f31522i = str3;
        this.f31516c = networkSettings;
        this.f31517d = i3;
    }

    /* JADX INFO: renamed from: a */
    public IronSource.EnumC12328a m32790a() {
        return this.f31514a;
    }

    /* JADX INFO: renamed from: b */
    public String m32791b() {
        return this.f31522i;
    }

    /* JADX INFO: renamed from: c */
    public String m32792c() {
        return this.f31520g;
    }

    /* JADX INFO: renamed from: d */
    public int m32793d() {
        return this.f31521h;
    }

    /* JADX INFO: renamed from: e */
    public JSONObject m32794e() {
        return this.f31519f;
    }

    /* JADX INFO: renamed from: f */
    public int m32795f() {
        return this.f31517d;
    }

    /* JADX INFO: renamed from: g */
    public NetworkSettings m32796g() {
        return this.f31516c;
    }

    /* JADX INFO: renamed from: h */
    public int m32797h() {
        return this.f31518e;
    }

    /* JADX INFO: renamed from: i */
    public String m32798i() {
        return this.f31515b;
    }
}

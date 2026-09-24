package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.e1 */
/* JADX INFO: loaded from: classes6.dex */
public class C12159e1 {

    /* JADX INFO: renamed from: a */
    private NetworkSettings f30273a;

    /* JADX INFO: renamed from: b */
    private JSONObject f30274b;

    /* JADX INFO: renamed from: c */
    private IronSource.EnumC12328a f30275c;

    /* JADX INFO: renamed from: d */
    private boolean f30276d;

    /* JADX INFO: renamed from: e */
    private boolean f30277e;

    /* JADX INFO: renamed from: f */
    private int f30278f;

    /* JADX INFO: renamed from: g */
    private int f30279g;

    public C12159e1(NetworkSettings networkSettings, JSONObject jSONObject, IronSource.EnumC12328a enumC12328a) {
        this.f30273a = networkSettings;
        this.f30274b = jSONObject;
        int iOptInt = jSONObject.optInt("instanceType");
        this.f30278f = iOptInt;
        this.f30276d = iOptInt == 2;
        this.f30277e = jSONObject.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
        this.f30279g = jSONObject.optInt("maxAdsPerSession", 99);
        this.f30275c = enumC12328a;
    }

    /* JADX INFO: renamed from: a */
    public String m31335a() {
        return this.f30273a.getAdSourceNameForEvents();
    }

    /* JADX INFO: renamed from: b */
    public IronSource.EnumC12328a m31336b() {
        return this.f30275c;
    }

    /* JADX INFO: renamed from: c */
    public JSONObject m31337c() {
        return this.f30274b;
    }

    /* JADX INFO: renamed from: d */
    public int m31338d() {
        return this.f30278f;
    }

    /* JADX INFO: renamed from: e */
    public int m31339e() {
        return this.f30279g;
    }

    /* JADX INFO: renamed from: f */
    public String m31340f() {
        return this.f30273a.getProviderName();
    }

    /* JADX INFO: renamed from: g */
    public String m31341g() {
        return this.f30273a.getProviderTypeForReflection();
    }

    /* JADX INFO: renamed from: h */
    public NetworkSettings m31342h() {
        return this.f30273a;
    }

    /* JADX INFO: renamed from: i */
    public String m31343i() {
        return this.f30273a.getSubProviderId();
    }

    /* JADX INFO: renamed from: j */
    public boolean m31344j() {
        return this.f30276d;
    }

    /* JADX INFO: renamed from: k */
    public boolean m31345k() {
        return this.f30277e;
    }
}

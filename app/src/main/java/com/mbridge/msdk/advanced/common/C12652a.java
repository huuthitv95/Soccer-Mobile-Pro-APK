package com.mbridge.msdk.advanced.common;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ironsource.C11744X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.controller.authoritycontroller.AbstractC13005b;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C13006c;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.tools.C13198g;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.advanced.common.a */
/* JADX INFO: compiled from: BaseDeviceInfo.java */
/* JADX INFO: loaded from: classes4.dex */
public class C12652a {

    /* JADX INFO: renamed from: e */
    public String f33386e;

    /* JADX INFO: renamed from: f */
    public String f33387f;

    /* JADX INFO: renamed from: g */
    public String f33388g;

    /* JADX INFO: renamed from: h */
    public String f33389h;

    /* JADX INFO: renamed from: i */
    public String f33390i;

    /* JADX INFO: renamed from: j */
    public String f33391j;

    /* JADX INFO: renamed from: k */
    public String f33392k;

    /* JADX INFO: renamed from: l */
    public String f33393l;

    /* JADX INFO: renamed from: m */
    public String f33394m;

    /* JADX INFO: renamed from: n */
    public String f33395n;

    /* JADX INFO: renamed from: o */
    public String f33396o;

    /* JADX INFO: renamed from: p */
    public int f33397p;

    /* JADX INFO: renamed from: q */
    public int f33398q;

    /* JADX INFO: renamed from: c */
    public String f33384c = "android";

    /* JADX INFO: renamed from: a */
    public String f33382a = C13211m0.m37774u();

    /* JADX INFO: renamed from: b */
    public String f33383b = C13211m0.m37767r();

    /* JADX INFO: renamed from: d */
    public String f33385d = C13198g.m37689d();

    public C12652a(Context context) {
        int iM37770s = C13211m0.m37770s(context);
        this.f33386e = String.valueOf(iM37770s);
        this.f33387f = C13211m0.m37732a(context, iM37770s);
        this.f33388g = C13211m0.m37755l(context);
        this.f33389h = C13008c.m36588n().m36538c();
        this.f33390i = C13008c.m36588n().m36533b();
        this.f33391j = String.valueOf(C13229v0.m37930g(context));
        this.f33392k = String.valueOf(C13229v0.m37927f(context));
        this.f33394m = String.valueOf(C13229v0.m37918d(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f33393l = C11744X3.i.f26320C;
        } else {
            this.f33393l = C11744X3.i.f26322D;
        }
        this.f33395n = C13211m0.m37777w();
        this.f33396o = C13198g.m37690e();
        this.f33397p = C13198g.m37679a();
        this.f33398q = AbstractC13005b.m36563j() ? 1 : 0;
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m34377a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put(C11744X3.i.f26328G, this.f33382a);
                jSONObject.put("system_version", this.f33383b);
                jSONObject.put("network_type", this.f33386e);
                jSONObject.put("network_type_str", this.f33387f);
                jSONObject.put("device_ua", this.f33388g);
                jSONObject.put("has_wx", C13211m0.m37724E(C13008c.m36588n().m36542d()));
                jSONObject.put("integrated_wx", C13211m0.m37727G());
                jSONObject.put("opensdk_ver", C13211m0.m37721D() + "");
                jSONObject.put("wx_api_ver", C13211m0.m37741e(C13008c.m36588n().m36551j()) + "");
                jSONObject.put("mnc", C13211m0.m37768r(C13008c.m36588n().m36542d()));
                jSONObject.put("mcc", C13211m0.m37766q(C13008c.m36588n().m36542d()));
                jSONObject.put("adid_limit", this.f33397p);
                jSONObject.put("adid_limit_dev", this.f33398q);
            }
            jSONObject.put("plantform", this.f33384c);
            if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f33385d);
                jSONObject.put("az_aid_info", this.f33396o);
            }
            jSONObject.put("appkey", this.f33389h);
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_ID, this.f33390i);
            jSONObject.put("screen_width", this.f33391j);
            jSONObject.put("screen_height", this.f33392k);
            jSONObject.put("orientation", this.f33393l);
            jSONObject.put("scale", this.f33394m);
            if (C13211m0.m37715A() != 0) {
                jSONObject.put("tun", C13211m0.m37715A());
            }
            jSONObject.put(InneractiveMediationDefs.GENDER_FEMALE, this.f33395n);
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
                return jSONObject;
            }
        } catch (JSONException e) {
            C13219q0.m37816b("BaseDeviceInfo", e.getMessage());
        }
        return jSONObject;
    }
}

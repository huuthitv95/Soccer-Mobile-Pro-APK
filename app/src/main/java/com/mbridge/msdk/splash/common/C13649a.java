package com.mbridge.msdk.splash.common;

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

/* JADX INFO: renamed from: com.mbridge.msdk.splash.common.a */
/* JADX INFO: compiled from: BaseDeviceInfo.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13649a {

    /* JADX INFO: renamed from: e */
    public String f38149e;

    /* JADX INFO: renamed from: f */
    public String f38150f;

    /* JADX INFO: renamed from: g */
    public String f38151g;

    /* JADX INFO: renamed from: h */
    public String f38152h;

    /* JADX INFO: renamed from: i */
    public String f38153i;

    /* JADX INFO: renamed from: j */
    public String f38154j;

    /* JADX INFO: renamed from: k */
    public String f38155k;

    /* JADX INFO: renamed from: l */
    public String f38156l;

    /* JADX INFO: renamed from: m */
    public String f38157m;

    /* JADX INFO: renamed from: n */
    public String f38158n;

    /* JADX INFO: renamed from: o */
    public String f38159o;

    /* JADX INFO: renamed from: p */
    public int f38160p;

    /* JADX INFO: renamed from: q */
    public int f38161q;

    /* JADX INFO: renamed from: c */
    public String f38147c = "android";

    /* JADX INFO: renamed from: a */
    public String f38145a = C13211m0.m37774u();

    /* JADX INFO: renamed from: b */
    public String f38146b = C13211m0.m37767r();

    /* JADX INFO: renamed from: d */
    public String f38148d = C13198g.m37689d();

    public C13649a(Context context) {
        int iM37770s = C13211m0.m37770s(context);
        this.f38149e = String.valueOf(iM37770s);
        this.f38150f = C13211m0.m37732a(context, iM37770s);
        this.f38151g = C13211m0.m37755l(context);
        this.f38152h = C13008c.m36588n().m36538c();
        this.f38153i = C13008c.m36588n().m36533b();
        this.f38154j = String.valueOf(C13229v0.m37930g(context));
        this.f38155k = String.valueOf(C13229v0.m37927f(context));
        this.f38157m = String.valueOf(C13229v0.m37918d(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f38156l = C11744X3.i.f26320C;
        } else {
            this.f38156l = C11744X3.i.f26322D;
        }
        this.f38158n = C13211m0.m37777w();
        this.f38159o = C13198g.m37690e();
        this.f38160p = C13198g.m37679a();
        this.f38161q = AbstractC13005b.m36563j() ? 1 : 0;
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m39781a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put(C11744X3.i.f26328G, this.f38145a);
                jSONObject.put("system_version", this.f38146b);
                jSONObject.put("network_type", this.f38149e);
                jSONObject.put("network_type_str", this.f38150f);
                jSONObject.put("device_ua", this.f38151g);
                jSONObject.put("has_wx", C13211m0.m37724E(C13008c.m36588n().m36542d()));
                jSONObject.put("integrated_wx", C13211m0.m37727G());
                jSONObject.put("mnc", C13211m0.m37768r(C13008c.m36588n().m36542d()));
                jSONObject.put("mcc", C13211m0.m37766q(C13008c.m36588n().m36542d()));
                jSONObject.put("adid_limit", this.f38160p);
                jSONObject.put("adid_limit_dev", this.f38161q);
            }
            jSONObject.put("plantform", this.f38147c);
            if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f38148d);
                jSONObject.put("az_aid_info", this.f38159o);
            }
            jSONObject.put("appkey", this.f38152h);
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_ID, this.f38153i);
            jSONObject.put("screen_width", this.f38154j);
            jSONObject.put("screen_height", this.f38155k);
            jSONObject.put("orientation", this.f38156l);
            jSONObject.put("scale", this.f38157m);
            if (C13211m0.m37715A() != 0) {
                jSONObject.put("tun", C13211m0.m37715A());
            }
            jSONObject.put(InneractiveMediationDefs.GENDER_FEMALE, this.f38158n);
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

package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ironsource.C11744X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.controller.authoritycontroller.AbstractC13005b;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C13006c;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.net.wrapper.C13126e;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.e */
/* JADX INFO: compiled from: BaseDomainDeviceInfo.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13192e {

    /* JADX INFO: renamed from: a */
    public int f36263a;

    /* JADX INFO: renamed from: b */
    public int f36264b;

    /* JADX INFO: renamed from: c */
    public String f36265c;

    /* JADX INFO: renamed from: d */
    public String f36266d;

    /* JADX INFO: renamed from: e */
    public String f36267e;

    /* JADX INFO: renamed from: f */
    public String f36268f;

    /* JADX INFO: renamed from: g */
    public String f36269g;

    /* JADX INFO: renamed from: h */
    public String f36270h;

    /* JADX INFO: renamed from: j */
    public String f36272j;

    /* JADX INFO: renamed from: k */
    public String f36273k;

    /* JADX INFO: renamed from: m */
    public int f36275m;

    /* JADX INFO: renamed from: n */
    public String f36276n;

    /* JADX INFO: renamed from: o */
    public String f36277o;

    /* JADX INFO: renamed from: p */
    public String f36278p;

    /* JADX INFO: renamed from: r */
    public String f36280r;

    /* JADX INFO: renamed from: s */
    public String f36281s;

    /* JADX INFO: renamed from: t */
    public String f36282t;

    /* JADX INFO: renamed from: v */
    public String f36284v;

    /* JADX INFO: renamed from: q */
    public String f36279q = "android";

    /* JADX INFO: renamed from: i */
    public String f36271i = C13211m0.m37774u();

    /* JADX INFO: renamed from: u */
    public String f36283u = C13211m0.m37767r();

    /* JADX INFO: renamed from: l */
    public String f36274l = C13198g.m37689d();

    public C13192e(Context context) {
        int iM37770s = C13211m0.m37770s(context);
        this.f36276n = String.valueOf(iM37770s);
        this.f36277o = C13211m0.m37732a(context, iM37770s);
        this.f36272j = C13211m0.m37755l(context);
        this.f36267e = C13008c.m36588n().m36538c();
        this.f36266d = C13008c.m36588n().m36533b();
        this.f36282t = String.valueOf(C13229v0.m37930g(context));
        this.f36281s = String.valueOf(C13229v0.m37927f(context));
        this.f36280r = String.valueOf(C13229v0.m37918d(context));
        this.f36284v = C13008c.m36588n().m36552k().toString();
        this.f36269g = C13211m0.m37771t();
        this.f36275m = C13229v0.m37874a();
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f36278p = C11744X3.i.f26320C;
        } else {
            this.f36278p = C11744X3.i.f26322D;
        }
        this.f36268f = C13088a.f35856V;
        this.f36270h = C13088a.f35865g;
        this.f36273k = C13211m0.m37777w();
        this.f36265c = C13198g.m37690e();
        this.f36263a = C13198g.m37679a();
        this.f36264b = AbstractC13005b.m36563j() ? 1 : 0;
    }

    /* JADX INFO: renamed from: a */
    public JSONObject mo37664a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put(C11744X3.i.f26328G, this.f36271i);
                jSONObject.put("system_version", this.f36283u);
                jSONObject.put("network_type", this.f36276n);
                jSONObject.put("network_type_str", this.f36277o);
                jSONObject.put("device_ua", this.f36272j);
                jSONObject.put("has_wx", C13211m0.m37724E(C13008c.m36588n().m36542d()));
                jSONObject.put("integrated_wx", C13211m0.m37727G());
                jSONObject.put("opensdk_ver", C13211m0.m37721D() + "");
                jSONObject.put("wx_api_ver", C13211m0.m37741e(C13008c.m36588n().m36551j()) + "");
                jSONObject.put("brand", this.f36269g);
                jSONObject.put("mnc", C13211m0.m37768r(C13008c.m36588n().m36542d()));
                jSONObject.put("mcc", C13211m0.m37766q(C13008c.m36588n().m36542d()));
                jSONObject.put("adid_limit", this.f36263a);
                jSONObject.put("adid_limit_dev", this.f36264b);
            }
            jSONObject.put("plantform", this.f36279q);
            if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f36274l);
                jSONObject.put("az_aid_info", this.f36265c);
            }
            jSONObject.put("appkey", this.f36267e);
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_ID, this.f36266d);
            jSONObject.put("screen_width", this.f36282t);
            jSONObject.put("screen_height", this.f36281s);
            jSONObject.put("orientation", this.f36278p);
            jSONObject.put("scale", this.f36280r);
            jSONObject.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, this.f36268f);
            jSONObject.put("c", this.f36270h);
            jSONObject.put("web_env", this.f36284v);
            jSONObject.put(InneractiveMediationDefs.GENDER_FEMALE, this.f36273k);
            jSONObject.put("misk_spt", this.f36275m);
            if (C13211m0.m37715A() != 0) {
                jSONObject.put("tun", C13211m0.m37715A());
            }
            jSONObject.put(C13126e.f36055f, C13006c.m36583m().m36573c() + "");
            if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("adid_limit", this.f36263a);
                jSONObject2.put("adid_limit_dev", this.f36264b);
                jSONObject.put("dvi", C13207k0.m37713b(jSONObject2.toString()));
            }
            if (!AbstractC13005b.m36562i()) {
                jSONObject.put("dev_source", "2");
            }
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
                return jSONObject;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}

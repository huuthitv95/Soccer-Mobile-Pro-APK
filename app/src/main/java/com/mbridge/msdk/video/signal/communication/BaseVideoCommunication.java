package com.mbridge.msdk.video.signal.communication;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.C11744X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C12684c;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.controller.C13009d;
import com.mbridge.msdk.foundation.entity.AbstractC13068b;
import com.mbridge.msdk.foundation.entity.C13070d;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.buffer.C13091b;
import com.mbridge.msdk.foundation.same.directory.C13098e;
import com.mbridge.msdk.foundation.same.directory.EnumC13096c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.mbsignalcommon.communication.C13374d;
import com.mbridge.msdk.mbsignalcommon.listener.C13376a;
import com.mbridge.msdk.mbsignalcommon.windvane.AbsFeedBackForH5;
import com.mbridge.msdk.mbsignalcommon.windvane.C13387a;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.video.p291bt.component.C13892c;
import com.mbridge.msdk.video.p291bt.component.C13893d;
import com.mbridge.msdk.video.signal.InterfaceC14173d;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.mbridge.msdk.video.signal.impl.C14190j;
import com.mbridge.msdk.video.signal.impl.C14191k;
import com.mbridge.msdk.videocommon.setting.C14222b;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class BaseVideoCommunication extends AbsFeedBackForH5 implements IVideoCommunication {

    /* JADX INFO: renamed from: g */
    protected IJSFactory f40595g;

    /* JADX INFO: renamed from: h */
    private FastKV f40596h = null;

    /* JADX INFO: renamed from: a */
    private String m42240a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, i);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            C13219q0.m37816b("JS-Video-Brigde", "code to string is error");
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    private void m42241a(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                jSONObject.put("message", "params is null");
                C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Exception e) {
            C13219q0.m37813a("JS-Video-Brigde", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    private String m42242b(int i) {
        switch (i) {
            case 1:
                return "sdk_info";
            case 2:
                return MBridgeConstans.PROPERTIES_UNIT_ID;
            case 3:
                return "appSetting";
            case 4:
                return "unitSetting";
            case 5:
                return C11744X3.i.f26328G;
            case 6:
                return "sdkSetting";
            default:
                return "";
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void appendSubView(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41460a(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "appendSubView error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void appendViewTo(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41468b(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "appendViewTo error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void bringViewToFront(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41473c(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "bringViewToFront error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void broadcast(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41476d(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "broadcast error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void cai(Object obj, String str) {
        C13219q0.m37813a("JS-Video-Brigde", "cai:" + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            try {
                String strOptString = new JSONObject(str).optString("packageName");
                if (TextUtils.isEmpty(strOptString)) {
                    C13374d.m38666a(obj, "packageName is empty");
                }
                int i = C13229v0.m37915c(C13008c.m36588n().m36542d(), strOptString) ? 1 : 2;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, C13374d.f37111b);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", i);
                    jSONObject.put("data", jSONObject2);
                    C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    C13374d.m38666a(obj, e.getMessage());
                    C13219q0.m37813a("JS-Video-Brigde", e.getMessage());
                }
            } catch (Throwable th) {
                C13374d.m38666a(obj, "exception: " + th.getLocalizedMessage());
                C13219q0.m37817b("JS-Video-Brigde", "cai", th);
            }
        } catch (JSONException e2) {
            C13374d.m38666a(obj, "exception: " + e2.getLocalizedMessage());
            C13219q0.m37817b("JS-Video-Brigde", "cai", e2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void clearAllCache(Object obj, String str) {
        if (C13009d.m36589a().m36605e() && this.f40596h == null) {
            try {
                this.f40596h = new FastKV.Builder(C13098e.m37149b(EnumC13096c.MBRIDGE_700_CONFIG), "MBridgeH5CacheSP").build();
            } catch (Exception unused) {
                this.f40596h = null;
            }
        }
        FastKV fastKV = this.f40596h;
        if (fastKV != null) {
            try {
                try {
                    fastKV.clear();
                } catch (Exception unused2) {
                }
                if (obj != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 0);
                    jSONObject.put("message", "Success");
                    C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    return;
                }
                return;
            } catch (Throwable th) {
                C13219q0.m37816b("JS-Video-Brigde", "getAllCache error " + th);
                return;
            }
        }
        try {
            C13008c.m36588n().m36542d().getSharedPreferences("MBridgeH5CacheSP", 0).edit().clear().apply();
            if (obj != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 0);
                jSONObject2.put("message", "Success");
                C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            }
        } catch (Throwable th2) {
            C13219q0.m37816b("JS-Video-Brigde", "getAllCache error " + th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void click(Object obj, String str) {
        String strOptString;
        int iOptInt;
        C14191k c14191k;
        C13219q0.m37818c("JS-Video-Brigde", "click");
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                iOptInt = jSONObject.optInt("type");
                strOptString = jSONObject.optString("pt");
            } catch (JSONException e) {
                strOptString = "";
                e.printStackTrace();
                iOptInt = 1;
            }
            IJSFactory iJSFactory = this.f40595g;
            if (iJSFactory != null) {
                iJSFactory.getJSCommon().click(iOptInt, strOptString);
                return;
            }
            if (obj != null) {
                C13387a c13387a = (C13387a) obj;
                if (!(c13387a.f37156b.getObject() instanceof C14191k) || (c14191k = (C14191k) c13387a.f37156b.getObject()) == null) {
                    return;
                }
                c14191k.click(iOptInt, strOptString);
            }
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Video-Brigde", "click error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void closeAd(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41479e(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "closeAd error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void closeVideoOperte(Object obj, String str) {
        try {
            if (this.f40595g == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("close");
            int iOptInt2 = jSONObject.optInt("view_visible");
            C13219q0.m37818c("JS-Video-Brigde", "closeVideoOperte,close:" + iOptInt + ",viewVisible:" + iOptInt2);
            this.f40595g.getJSVideoModule().closeVideoOperate(iOptInt, iOptInt2);
            C13392f.m38726a().m38731b(obj, m42240a(0));
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Video-Brigde", "closeOperte error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void closeWeb(Object obj, String str) {
        C13219q0.m37816b("JS-Video-Brigde", "type" + str);
        try {
            if (TextUtils.isEmpty(str) || this.f40595g == null || TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("status");
            this.f40595g.getJSContainerModule().hideAlertWebview();
            this.f40595g.getJSVideoModule().hideAlertView(iOptInt);
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Video-Brigde", "closeWeb", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createNativeEC(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41481f(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "createNativeEC error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createPlayerView(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41483g(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "createPlayerView error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createSubPlayTemplateView(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41484h(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "createSubPlayTemplateView error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createView(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41486i(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "createView error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createWebview(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41487j(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "createWebview error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void destroyComponent(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41488k(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "destroyComponent error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getAllCache(Object obj, String str) {
        String str2;
        JSONObject jSONObject;
        Throwable th;
        JSONObject jSONObject2 = null;
        Map<String, Object> all = null;
        jSONObject2 = null;
        if (C13009d.m36589a().m36605e() && this.f40596h == null) {
            try {
                this.f40596h = new FastKV.Builder(C13098e.m37149b(EnumC13096c.MBRIDGE_700_CONFIG), "MBridgeH5CacheSP").build();
            } catch (Exception unused) {
                this.f40596h = null;
            }
        }
        if (this.f40596h != null) {
            try {
                jSONObject = new JSONObject();
                try {
                    try {
                        all = this.f40596h.getAll();
                    } catch (Exception unused2) {
                    }
                    if (all != null) {
                        for (Map.Entry<String, Object> entry : all.entrySet()) {
                            jSONObject.put(entry.getKey(), entry.getValue());
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    jSONObject2 = jSONObject;
                    C13219q0.m37816b("JS-Video-Brigde", "getAllCache error " + th);
                    str2 = "getAllCache Error, reason is : " + th.getMessage();
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            try {
                SharedPreferences sharedPreferences = C13008c.m36588n().m36542d().getSharedPreferences("MBridgeH5CacheSP", 0);
                JSONObject jSONObject3 = new JSONObject();
                try {
                    for (Map.Entry<String, ?> entry2 : sharedPreferences.getAll().entrySet()) {
                        jSONObject3.put(entry2.getKey(), entry2.getValue());
                    }
                    jSONObject = jSONObject3;
                } catch (Throwable th4) {
                    th = th4;
                    jSONObject2 = jSONObject3;
                    C13219q0.m37816b("JS-Video-Brigde", "getAllCache error " + th);
                    str2 = "getAllCache Error, reason is : " + th.getMessage();
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        jSONObject2 = jSONObject;
        str2 = "getAllCache Success";
        try {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 0);
            jSONObject4.put("message", str2);
            if (jSONObject2 != null) {
                jSONObject4.put("data", jSONObject2);
            } else {
                jSONObject4.put("data", JsonUtils.EMPTY_JSON);
            }
            if (obj != null) {
                C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject4.toString().getBytes(), 2));
            }
        } catch (Throwable th6) {
            C13219q0.m37816b("JS-Video-Brigde", "getAllCache error " + th6);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getAppSetting(Object obj, String str) {
        JSONObject jSONObject;
        try {
            String strOptString = new JSONObject(str).optString("appid", "");
            JSONObject jSONObject2 = new JSONObject();
            if (TextUtils.isEmpty(strOptString)) {
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                jSONObject2.put("message", "Get App Setting error, because must give a appId.");
            } else {
                String strM39721e = C13636h.m39706b().m39721e(strOptString);
                if (TextUtils.isEmpty(strM39721e)) {
                    jSONObject = new JSONObject(C13636h.m39706b().m39708a().m39704P0());
                } else {
                    jSONObject = new JSONObject(strM39721e);
                    jSONObject.put("isDefault", 0);
                }
                if (obj != null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 0);
                    jSONObject2.put("message", "Success");
                    jSONObject2.put("data", jSONObject);
                } else {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                    jSONObject2.put("message", "Get App Setting error, plz try again later.");
                }
            }
            C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "getAppSetting error : " + th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getComponentOptions(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41489l(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "getComponentOptions error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getCurrentProgress(Object obj, String str) {
        try {
            IJSFactory iJSFactory = this.f40595g;
            if (iJSFactory != null) {
                String currentProgress = iJSFactory.getJSVideoModule().getCurrentProgress();
                C13219q0.m37818c("JS-Video-Brigde", "getCurrentProgress:" + currentProgress);
                if (!TextUtils.isEmpty(currentProgress)) {
                    currentProgress = Base64.encodeToString(currentProgress.getBytes(), 2);
                }
                C13392f.m38726a().m38731b(obj, currentProgress);
            }
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Video-Brigde", "getCurrentProgress error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getCutout(Object obj, String str) {
        try {
            String strMo42220e = this.f40595g.getJSCommon().mo42220e();
            C13219q0.m37816b("JS-Video-Brigde", strMo42220e);
            if (obj != null && !TextUtils.isEmpty(strMo42220e)) {
                C13392f.m38726a().m38731b(obj, Base64.encodeToString(strMo42220e.getBytes(), 2));
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
            jSONObject.put("message", "No notch data, plz try again later.");
            C13392f.m38726a().m38729a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "getCutout error : " + th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getEncryptPrice(Object obj, String str) {
        String str2;
        try {
            String str3 = "not replaced";
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            int i = 1;
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject3 = new JSONObject(str);
                String strOptString = jSONObject3.optString("unitid", "");
                String strOptString2 = jSONObject3.optString("requestId", "");
                if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
                    str2 = "params parsing exception";
                } else {
                    C13070d c13070dM37108b = C13091b.m37108b(strOptString, strOptString2);
                    if (c13070dM37108b != null && c13070dM37108b.m36807c() == 1) {
                        str3 = "success";
                        jSONObject2.put("encrypt_p", c13070dM37108b.m36804b());
                        jSONObject2.put(AbstractC13068b.KEY_IRLFA, 1);
                        i = 0;
                    }
                }
                jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, i);
                jSONObject.put("message", str3);
                jSONObject.put("data", jSONObject2);
                C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
            str2 = "params is null";
            str3 = str2;
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, i);
            jSONObject.put("message", str3);
            jSONObject.put("data", jSONObject2);
            C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "getEncryptPrice error : " + th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getFileInfo(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41490m(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Video-Brigde", "getFileInfo error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getMuteStatus(Object obj, String str) {
        C13219q0.m37818c("JS-Video-Brigde", "getMuteStatus");
        IJSFactory iJSFactory = this.f40595g;
        if (iJSFactory != null) {
            String strMo42224g = iJSFactory.getJSCommon().mo42224g();
            if (!TextUtils.isEmpty(strMo42224g)) {
                strMo42224g = Base64.encodeToString(strMo42224g.getBytes(), 2);
            }
            C13392f.m38726a().m38731b(obj, strMo42224g);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getRewardSetting(Object obj, String str) {
        try {
            JSONObject jSONObjectM42655k = C14222b.m42658b().m42670c().m42655k();
            JSONObject jSONObject = new JSONObject();
            if (obj == null || jSONObjectM42655k == null) {
                jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                jSONObject.put("message", "Get Reward Setting error, plz try again later.");
            } else {
                jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 0);
                jSONObject.put("message", "Success");
                jSONObject.put("data", jSONObjectM42655k);
            }
            C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "getRewardSetting error : " + th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getRewardUnitSetting(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("appid", "");
            String strOptString2 = jSONObject.optString("unitid", "");
            JSONObject jSONObject2 = new JSONObject();
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                jSONObject2.put("message", "Get reward unit Setting error, because must give appId and unitId.");
            } else {
                JSONObject jSONObjectM42696H = C14222b.m42658b().m42671c(strOptString, strOptString2).m42696H();
                if (obj == null || jSONObjectM42696H == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                    jSONObject2.put("message", "Get Reward Unit Setting error, plz try again later.");
                } else {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 0);
                    jSONObject2.put("message", "Success");
                    jSONObject2.put("data", jSONObjectM42696H);
                }
            }
            C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "getRewardUnitSetting error : " + th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getSDKInfo(Object obj, String str) {
        C13219q0.m37818c("JS-Video-Brigde", "getSDKInfo");
        try {
            if (TextUtils.isEmpty(str)) {
                C13392f.m38726a().m38729a(obj, "params is null");
                return;
            }
            JSONArray jSONArray = new JSONObject(str).getJSONArray("type");
            JSONObject jSONObject = new JSONObject();
            int i = 0;
            if (this.f40595g != null) {
                while (i < jSONArray.length()) {
                    int i2 = jSONArray.getInt(i);
                    jSONObject.put(m42242b(i2), this.f40595g.getJSCommon().mo42222f(i2));
                    i++;
                }
            } else if (obj != null) {
                while (i < jSONArray.length()) {
                    int i3 = jSONArray.getInt(i);
                    C13387a c13387a = (C13387a) obj;
                    if (c13387a.f37156b.getObject() instanceof C14191k) {
                        jSONObject.put(m42242b(i3), ((C14191k) c13387a.f37156b.getObject()).mo42222f(i3));
                    }
                    i++;
                }
            }
            C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Video-Brigde", "getSDKInfo error", th);
            C13392f.m38726a().m38729a(obj, "exception");
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getUnitSetting(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
            jSONObject.put("message", "Get Unit Setting error, RV/IV can not support this method.");
            C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "getUnitSetting error : " + th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void handleNativeObject(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13892c.m41509a().m41511a(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "handleNativeObject error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void handlerH5Exception(Object obj, String str) {
        try {
            if (this.f40595g == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            C13219q0.m37818c("JS-Video-Brigde", "handlerH5Exception,params:" + str);
            this.f40595g.getJSCommon().handlerH5Exception(jSONObject.optInt(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -999), jSONObject.optString("message", "h5 error"));
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Video-Brigde", "handlerH5Exception", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void hideView(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41491n(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "hideView error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void increaseOfferFrequence(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41492o(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "increaseOfferFrequence error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void init(Object obj, String str) {
        C13219q0.m37818c("JS-Video-Brigde", "init");
        try {
            IJSFactory iJSFactory = this.f40595g;
            int i = 1;
            if (iJSFactory != null) {
                String strMo42216c = iJSFactory.getJSCommon().mo42216c();
                if (!TextUtils.isEmpty(strMo42216c)) {
                    strMo42216c = Base64.encodeToString(strMo42216c.getBytes(), 2);
                }
                C13392f.m38726a().m38731b(obj, strMo42216c);
                this.f40595g.getJSCommon().mo42215b(true);
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(str);
                int iOptInt = jSONObject.optInt("showTransparent");
                int iOptInt2 = jSONObject.optInt(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                int iOptInt3 = jSONObject.optInt("closeType");
                int iOptInt4 = jSONObject.optInt("orientationType");
                int iOptInt5 = jSONObject.optInt("webfront");
                int iOptInt6 = jSONObject.optInt("showAlertRole");
                this.f40595g.getJSCommon().mo42211a(iOptInt == 1);
                this.f40595g.getJSCommon().mo42221e(iOptInt2);
                this.f40595g.getJSCommon().mo42214b(iOptInt3);
                this.f40595g.getJSCommon().mo42217c(iOptInt4);
                this.f40595g.getJSCommon().setWebViewFront(iOptInt5);
                InterfaceC14173d jSCommon = this.f40595g.getJSCommon();
                if (iOptInt6 != 0) {
                    i = iOptInt6;
                }
                jSCommon.mo42219d(i);
                return;
            }
            if (obj != null) {
                C13387a c13387a = (C13387a) obj;
                if (c13387a.f37156b.getObject() instanceof C14191k) {
                    C14191k c14191k = (C14191k) c13387a.f37156b.getObject();
                    String strMo42216c2 = c14191k.mo42216c();
                    if (!TextUtils.isEmpty(str)) {
                        JSONObject jSONObject2 = new JSONObject(str);
                        int iOptInt7 = jSONObject2.optInt("showTransparent");
                        int iOptInt8 = jSONObject2.optInt(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                        int iOptInt9 = jSONObject2.optInt("closeType");
                        int iOptInt10 = jSONObject2.optInt("orientationType");
                        int iOptInt11 = jSONObject2.optInt("webfront");
                        int iOptInt12 = jSONObject2.optInt("showAlertRole");
                        c14191k.mo42211a(iOptInt7 == 1);
                        c14191k.mo42221e(iOptInt8);
                        c14191k.mo42214b(iOptInt9);
                        c14191k.mo42217c(iOptInt10);
                        c14191k.setWebViewFront(iOptInt11);
                        if (iOptInt12 != 0) {
                            i = iOptInt12;
                        }
                        c14191k.mo42219d(i);
                        C13219q0.m37818c("JS-Video-Brigde", "init jsCommon.setIsShowingTransparent = " + iOptInt7);
                    }
                    C13392f.m38726a().m38731b(obj, Base64.encodeToString(strMo42216c2.getBytes(), 2));
                }
            }
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Video-Brigde", "init error", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.AbstractC13393g
    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        super.initialize(obj, windVaneWebView);
        if (obj instanceof IJSFactory) {
            this.f40595g = (IJSFactory) obj;
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void insertViewAbove(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41461a(obj, new JSONObject(str), true);
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "insertViewAbove error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void insertViewBelow(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41469b(obj, new JSONObject(str), true);
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "insertViewBelow error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void isSystemResume(Object obj, String str) {
        try {
            if (this.f40595g != null) {
                C13219q0.m37818c("JS-Video-Brigde", "isSystemResume,params:" + str);
                C13392f.m38726a().m38731b(obj, m42240a(this.f40595g.getActivityProxy().mo42228a()));
            }
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Video-Brigde", "isSystemResume", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void ivRewardAdsWithoutVideo(Object obj, String str) {
        C13219q0.m37816b("JS-Video-Brigde", "ivRewardAdsWithoutVideo ： params" + str);
        try {
            if (TextUtils.isEmpty(str) || this.f40595g == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f40595g.getJSContainerModule().ivRewardAdsWithoutVideo(str);
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Video-Brigde", "ivRewardAdsWithoutVideo", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void loadads(Object obj, String str) {
        String str2;
        String str3;
        int i;
        int iOptInt;
        C13219q0.m37818c("JS-Video-Brigde", "loadads");
        try {
            if (TextUtils.isEmpty(str)) {
                str2 = "";
                str3 = str2;
                i = 1;
                iOptInt = 1;
            } else {
                JSONObject jSONObject = new JSONObject(str);
                String strOptString = jSONObject.optString(MBridgeConstans.PLACEMENT_ID);
                String strOptString2 = jSONObject.optString("unitId");
                int iOptInt2 = jSONObject.optInt("type", 1);
                if (iOptInt2 > 2) {
                    iOptInt2 = 1;
                }
                str2 = strOptString;
                iOptInt = jSONObject.optInt("adtype", 1);
                str3 = strOptString2;
                i = iOptInt2;
            }
            if (TextUtils.isEmpty(str3)) {
                C13392f.m38726a().m38731b(obj, m42240a(1));
                return;
            }
            if (obj != null) {
                WindVaneWebView windVaneWebView = ((C13387a) obj).f37156b;
                if ((windVaneWebView instanceof WindVaneWebView) && windVaneWebView.getWebViewListener() != null) {
                    ((C13376a) windVaneWebView.getWebViewListener()).mo38671a(windVaneWebView, str2, str3, i, iOptInt);
                }
            }
            C13392f.m38726a().m38731b(obj, m42240a(0));
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Video-Brigde", "loadads error", th);
            C13392f.m38726a().m38731b(obj, m42240a(1));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void loadingResourceStatus(Object obj, String str) {
        m42241a(obj, str);
        if (obj != null) {
            try {
                int iOptInt = new JSONObject(str).optInt("isReady", 1);
                WindVaneWebView windVaneWebView = ((C13387a) obj).f37156b;
                if (windVaneWebView == null || windVaneWebView.getWebViewListener() == null) {
                    return;
                }
                windVaneWebView.getWebViewListener().mo38121b(windVaneWebView, iOptInt);
            } catch (Throwable th) {
                C13219q0.m37816b("JS-Video-Brigde", "loadingResourceStatus error " + th);
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.f40595g == null || TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("state");
            C13219q0.m37818c("JS-Video-Brigde", "notifyCloseBtn,result:" + iOptInt);
            this.f40595g.getJSVideoModule().notifyCloseBtn(iOptInt);
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Video-Brigde", "notifyCloseBtn", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyAppendSubView(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41493p(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "appendSubView error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyAppendViewTo(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41494q(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "appendViewTo error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyInsertViewAbove(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41495r(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "insertViewAbove error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyInsertViewBelow(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41469b(obj, new JSONObject(str), false);
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "insertViewBelow error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void openURL(Object obj, String str) {
        C13219q0.m37816b("JS-Video-Brigde", "openURL:" + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url");
            int iOptInt = jSONObject.optInt("type");
            if (iOptInt == 1) {
                C12684c.m34659c(this.f37179a, strOptString);
            } else if (iOptInt == 2) {
                C12684c.m34661e(this.f37179a, strOptString);
            }
        } catch (JSONException e) {
            C13219q0.m37816b("JS-Video-Brigde", e.getMessage());
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playVideoFinishOperate(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str) || this.f40595g == null || TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("type");
            C13219q0.m37818c("JS-Video-Brigde", "playVideoFinishOperate,type: " + iOptInt);
            this.f40595g.getJSCommon().mo42207a(iOptInt);
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Video-Brigde", "playVideoFinishOperate error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerGetMuteState(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41496s(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "playerGetMuteState error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerMute(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41497t(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "playerMute error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerPause(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41498u(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "playerPause error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerPlay(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41499v(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "playerPlay error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerResume(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41500w(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "playerResume error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerSetRenderType(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41501x(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "playerSetRenderType error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerSetSource(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41502y(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "playerSetSource error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerStop(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41503z(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "playerStop error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerUnmute(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41439A(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "playerUnmute error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerUpdateFrame(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41440B(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "playerUpdateFrame error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void preloadSubPlayTemplateView(Object obj, String str) {
        m42241a(obj, str);
        try {
            if (this.f40595g != null) {
                C13893d.m41513c().m41441C(obj, new JSONObject(str));
                return;
            }
            WindVaneWebView windVaneWebView = ((C13387a) obj).f37156b;
            if (windVaneWebView instanceof WindVaneWebView) {
                if (windVaneWebView.getWebViewListener() == null) {
                    C13219q0.m37813a("JS-Video-Brigde", "preloadSubPlayTemplateView: failed");
                } else {
                    ((C13376a) windVaneWebView.getWebViewListener()).mo38673a(obj, str);
                    C13219q0.m37813a("JS-Video-Brigde", "preloadSubPlayTemplateView: RVWebViewListener");
                }
            }
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "preloadSubPlayTemplateView error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void progressBarOperate(Object obj, String str) {
        try {
            if (this.f40595g == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f40595g.getJSVideoModule().progressBarOperate(new JSONObject(str).optInt("view_visible"));
            C13392f.m38726a().m38731b(obj, m42240a(0));
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Video-Brigde", "progressOperate error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void progressOperate(Object obj, String str) {
        try {
            if (this.f40595g == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("progress");
            int iOptInt2 = jSONObject.optInt("view_visible");
            C13219q0.m37818c("JS-Video-Brigde", "progressOperate,progress:" + iOptInt + ",viewVisible:" + iOptInt2);
            this.f40595g.getJSVideoModule().progressOperate(iOptInt, iOptInt2);
            C13392f.m38726a().m38731b(obj, m42240a(0));
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Video-Brigde", "progressOperate error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void reactDeveloper(Object obj, String str) {
        C13219q0.m37813a("JS-Video-Brigde", "reactDeveloper");
        try {
            if (this.f40595g == null || TextUtils.isEmpty(str)) {
                C13392f.m38726a().m38729a(obj, m42240a(1));
            } else {
                this.f40595g.getJSBTModule().reactDeveloper(obj, str);
            }
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "reactDeveloper error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void readyStatus(Object obj, String str) {
        if (obj != null) {
            try {
                C13387a c13387a = (C13387a) obj;
                int iOptInt = new JSONObject(str).optInt("isReady", 1);
                if (c13387a.f37156b.getObject() instanceof C14191k) {
                    ((C14191k) c13387a.f37156b.getObject()).m42382h(iOptInt);
                }
                WindVaneWebView windVaneWebView = c13387a.f37156b;
                if (windVaneWebView == null || windVaneWebView.getWebViewListener() == null) {
                    return;
                }
                windVaneWebView.getWebViewListener().mo34467a(windVaneWebView, iOptInt);
            } catch (Throwable th) {
                C13219q0.m37817b("JS-Video-Brigde", "readyStatus", th);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009e  */
    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void removeCacheItem(Object obj, String str) {
        String str2;
        if (C13009d.m36589a().m36605e() && this.f40596h == null) {
            try {
                this.f40596h = new FastKV.Builder(C13098e.m37149b(EnumC13096c.MBRIDGE_700_CONFIG), "MBridgeH5CacheSP").build();
            } catch (Exception unused) {
                this.f40596h = null;
            }
        }
        int i = 0;
        if (this.f40596h != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    str2 = "";
                } else {
                    String string = new JSONObject(str).getString("key");
                    if (!TextUtils.isEmpty(string)) {
                        try {
                            this.f40596h.remove(string);
                        } catch (Exception unused2) {
                        }
                    }
                    str2 = "Delete Success";
                    i = 1;
                }
            } catch (Throwable th) {
                C13219q0.m37816b("JS-Video-Brigde", "removeCacheItem error " + th);
                str2 = "Delete Error, reason is : " + th.getMessage();
            }
        } else {
            try {
                SharedPreferences sharedPreferences = C13008c.m36588n().m36542d().getSharedPreferences("MBridgeH5CacheSP", 0);
                if (TextUtils.isEmpty(str)) {
                    str2 = "";
                } else {
                    String string2 = new JSONObject(str).getString("key");
                    if (!TextUtils.isEmpty(string2)) {
                        sharedPreferences.edit().remove(string2).apply();
                    }
                    str2 = "Delete Success";
                    i = 1;
                }
            } catch (Throwable th2) {
                C13219q0.m37816b("JS-Video-Brigde", "removeCacheItem error " + th2);
                str2 = "Delete Error, reason is : " + th2.getMessage();
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, i ^ 1);
            jSONObject.put("message", str2);
            if (obj == null || i == 0) {
                C13392f.m38726a().m38729a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } else {
                C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Throwable unused3) {
            C13219q0.m37816b("JS-Video-Brigde", "removeCacheItem error ");
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void removeFromSuperView(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41442D(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "removeFromSuperView error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void reportData(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void reportUrls(Object obj, String str) {
        C13219q0.m37813a("JS-Video-Brigde", "reportUrls");
        try {
            if (TextUtils.isEmpty(str)) {
                C13392f.m38726a().m38729a(obj, m42240a(1));
                return;
            }
            IJSFactory iJSFactory = this.f40595g;
            if (iJSFactory == null || iJSFactory.getJSBTModule() == null) {
                C13893d.m41513c().m41472c(obj, str);
            } else if (this.f40595g.getJSBTModule() instanceof C14190j) {
                this.f40595g.getJSBTModule().reportUrls(obj, str);
            } else {
                C13893d.m41513c().m41472c(obj, str);
            }
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "reportUrls error " + th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b4  */
    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setCacheItem(Object obj, String str) {
        String str2;
        if (C13009d.m36589a().m36605e() && this.f40596h == null) {
            try {
                this.f40596h = new FastKV.Builder(C13098e.m37149b(EnumC13096c.MBRIDGE_700_CONFIG), "MBridgeH5CacheSP").build();
            } catch (Exception unused) {
                this.f40596h = null;
            }
        }
        int i = 0;
        if (this.f40596h != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    str2 = "";
                } else {
                    JSONObject jSONObject = new JSONObject(str);
                    String string = jSONObject.getString("key");
                    String string2 = jSONObject.getString("value");
                    if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                        try {
                            this.f40596h.putString(string, string2);
                        } catch (Exception unused2) {
                        }
                    }
                    str2 = "Save Success";
                    i = 1;
                }
            } catch (Throwable th) {
                C13219q0.m37816b("JS-Video-Brigde", "setCacheItem error " + th);
                str2 = "Save Error, reason is : " + th.getMessage();
            }
        } else {
            try {
                SharedPreferences sharedPreferences = C13008c.m36588n().m36542d().getSharedPreferences("MBridgeH5CacheSP", 0);
                if (TextUtils.isEmpty(str)) {
                    str2 = "";
                } else {
                    JSONObject jSONObject2 = new JSONObject(str);
                    String string3 = jSONObject2.getString("key");
                    String string4 = jSONObject2.getString("value");
                    if (!TextUtils.isEmpty(string3) && !TextUtils.isEmpty(string4)) {
                        sharedPreferences.edit().putString(string3, string4).apply();
                    }
                    str2 = "Save Success";
                    i = 1;
                }
            } catch (Throwable th2) {
                C13219q0.m37816b("JS-Video-Brigde", "setCacheItem error " + th2);
                str2 = "Save Error, reason is : " + th2.getMessage();
            }
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, i ^ 1);
            jSONObject3.put("message", str2);
            if (obj == null || i == 0) {
                C13392f.m38726a().m38729a(obj, Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
            } else {
                C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
            }
        } catch (Throwable unused3) {
            C13219q0.m37816b("JS-Video-Brigde", "setCacheItem error ");
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setScaleFitXY(Object obj, String str) {
        try {
            if (this.f40595g == null || TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("fitxy");
            C13219q0.m37818c("JS-Video-Brigde", "setScaleFitXY,type:" + iOptInt);
            this.f40595g.getJSVideoModule().setScaleFitXY(iOptInt);
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Video-Brigde", "showVideoClickView error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setSubPlayTemplateInfo(Object obj, String str) {
        C13219q0.m37816b("JS-Video-Brigde", "setSubPlayTemplateInfo : " + str);
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41443E(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "setSubPlayTemplateInfo error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewAlpha(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41444F(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "setViewAlpha error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewBgColor(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41445G(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "setViewBgColor error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewRect(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41446H(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "setViewRect error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewScale(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41447I(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "setViewScale error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showAlertView(Object obj, String str) {
        C13219q0.m37818c("JS-Video-Brigde", "showAlertView");
        try {
            if (this.f40595g == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f40595g.getJSVideoModule().showIVRewardAlertView(str);
            C13392f.m38726a().m38730a(obj, "showAlertView", "");
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Video-Brigde", "showAlertView", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showVideoClickView(Object obj, String str) {
        try {
            if (this.f40595g == null || TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("type");
            C13219q0.m37818c("JS-Video-Brigde", "showVideoClickView,type:" + iOptInt);
            this.f40595g.getJSContainerModule().showVideoClickView(iOptInt);
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Video-Brigde", "showVideoClickView error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showVideoLocation(Object obj, String str) {
        try {
            if (this.f40595g == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("margin_top", 0);
            int iOptInt2 = jSONObject.optInt("margin_left", 0);
            int iOptInt3 = jSONObject.optInt("view_width", 0);
            int iOptInt4 = jSONObject.optInt("view_height", 0);
            int iOptInt5 = jSONObject.optInt("radius", 0);
            int iOptInt6 = jSONObject.optInt("border_top", 0);
            int iOptInt7 = jSONObject.optInt("border_left", 0);
            int iOptInt8 = jSONObject.optInt("border_width", 0);
            int iOptInt9 = jSONObject.optInt("border_height", 0);
            C13219q0.m37818c("JS-Video-Brigde", "showVideoLocation,margin_top:" + iOptInt + ",marginLeft:" + iOptInt2 + ",viewWidth:" + iOptInt3 + ",viewHeight:" + iOptInt4 + ",radius:" + iOptInt5 + ",borderTop: " + iOptInt6 + ",borderLeft: " + iOptInt7 + ",borderWidth: " + iOptInt8 + ",borderHeight: " + iOptInt9);
            this.f40595g.getJSVideoModule().showVideoLocation(iOptInt, iOptInt2, iOptInt3, iOptInt4, iOptInt5, iOptInt6, iOptInt7, iOptInt8, iOptInt9);
            this.f40595g.getJSCommon().mo42226h();
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Video-Brigde", "showVideoLocation error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showView(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41448J(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "showView error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void soundOperate(Object obj, String str) {
        try {
            if (this.f40595g == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
            int iOptInt2 = jSONObject.optInt("view_visible");
            String strOptString = jSONObject.optString("pt", "");
            C13219q0.m37818c("JS-Video-Brigde", "soundOperate,mute:" + iOptInt + ",viewVisible:" + iOptInt2 + ",pt:" + strOptString);
            if (TextUtils.isEmpty(strOptString)) {
                this.f40595g.getJSVideoModule().soundOperate(iOptInt, iOptInt2);
            } else {
                this.f40595g.getJSVideoModule().soundOperate(iOptInt, iOptInt2, strOptString);
            }
            C13392f.m38726a().m38731b(obj, m42240a(0));
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Video-Brigde", "soundOperate error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void statistics(Object obj, String str) {
        C13219q0.m37818c("JS-Video-Brigde", "statistics,params:" + str);
        try {
            if (this.f40595g == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            this.f40595g.getJSCommon().mo42208a(jSONObject.optInt("type"), jSONObject.optString("data"));
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Video-Brigde", "statistics error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.f40595g == null || TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("state");
            C13219q0.m37818c("JS-Video-Brigde", "toggleCloseBtn,result:" + iOptInt);
            int i = 2;
            if (iOptInt != 1) {
                i = iOptInt == 2 ? 1 : 0;
            }
            this.f40595g.getJSVideoModule().closeVideoOperate(0, i);
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Video-Brigde", "toggleCloseBtn", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void triggerCloseBtn(Object obj, String str) {
        C13219q0.m37818c("JS-Video-Brigde", "triggerCloseBtn");
        try {
            if (this.f40595g == null || TextUtils.isEmpty(str) || !new JSONObject(str).optString("state").equals("click")) {
                return;
            }
            this.f40595g.getJSVideoModule().closeVideoOperate(1, -1);
            C13392f.m38726a().m38731b(obj, m42240a(0));
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Video-Brigde", "triggerCloseBtn error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void videoOperate(Object obj, String str) {
        try {
            if (this.f40595g == null || TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("pause_or_resume");
            C13219q0.m37818c("JS-Video-Brigde", "videoOperate,pauseOrResume:" + iOptInt);
            this.f40595g.getJSVideoModule().videoOperate(iOptInt);
            C13392f.m38726a().m38731b(obj, m42240a(0));
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Video-Brigde", "videoOperate error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewFireEvent(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41449K(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "setSubPlayTemplateInfo error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewGoBack(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41450L(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "webviewGoBack error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewGoForward(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41451M(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "webviewGoForward error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewLoad(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41452N(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "webviewLoad error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewReload(Object obj, String str) {
        m42241a(obj, str);
        try {
            C13893d.m41513c().m41453O(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Video-Brigde", "webviewReload error " + th);
        }
    }
}

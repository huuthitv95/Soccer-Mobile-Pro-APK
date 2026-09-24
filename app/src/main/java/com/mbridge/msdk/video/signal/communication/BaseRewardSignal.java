package com.mbridge.msdk.video.signal.communication;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C12684c;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.mbsignalcommon.communication.C13374d;
import com.mbridge.msdk.mbsignalcommon.listener.C13376a;
import com.mbridge.msdk.mbsignalcommon.windvane.C13387a;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.mbridge.msdk.video.signal.impl.C14191k;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class BaseRewardSignal extends BaseRewardSignalDiff {

    /* JADX INFO: renamed from: g */
    protected BaseIRewardCommunication f40593g;

    /* JADX INFO: renamed from: a */
    private String m42238a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, i);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            C13219q0.m37816b("JS-Reward-Brigde", "code to string is error");
            return "";
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void cai(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            C13374d.m38666a(obj, "params is null");
            return;
        }
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
                    C13219q0.m37813a("JS-Reward-Brigde", e.getMessage());
                }
            } catch (JSONException e2) {
                C13374d.m38666a(obj, "exception: " + e2.getLocalizedMessage());
                C13219q0.m37817b("JS-Reward-Brigde", "cai", e2);
            }
        } catch (Throwable th) {
            C13374d.m38666a(obj, "exception: " + th.getLocalizedMessage());
            C13219q0.m37817b("JS-Reward-Brigde", "cai", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void getEndScreenInfo(Object obj, String str) {
        try {
            BaseIRewardCommunication baseIRewardCommunication = this.f40593g;
            if (baseIRewardCommunication != null) {
                baseIRewardCommunication.getEndScreenInfo(obj, str);
                C13219q0.m37816b("JS-Reward-Brigde", "getEndScreenInfo factory is true");
                return;
            }
            C13219q0.m37816b("JS-Reward-Brigde", "getEndScreenInfo factory is null");
            if (obj != null) {
                WindVaneWebView windVaneWebView = ((C13387a) obj).f37156b;
                if (!(windVaneWebView instanceof WindVaneWebView) || windVaneWebView.getWebViewListener() == null) {
                    return;
                }
                ((C13376a) windVaneWebView.getWebViewListener()).mo38672a(obj);
            }
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Reward-Brigde", "getEndScreenInfo", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void handlerPlayableException(Object obj, String str) {
        try {
            if (this.f40593g == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f40593g.handlerPlayableException(obj, str);
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Reward-Brigde", "handlerPlayableException", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.AbstractC13393g
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        boolean zIsInstance;
        super.initialize(context, windVaneWebView);
        try {
            zIsInstance = IJSFactory.class.isInstance(context);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            zIsInstance = false;
        }
        try {
            if (zIsInstance) {
                this.f40593g = (BaseIRewardCommunication) BaseRewardSignalH5.class.newInstance();
                BaseRewardSignalH5.class.getMethod(MobileAdsBridgeBase.initializeMethodName, Context.class, WindVaneWebView.class).invoke(this.f40593g, context, windVaneWebView);
            } else if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof BaseIRewardCommunication)) {
                this.f40593g = (BaseIRewardCommunication) windVaneWebView.getObject();
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.AbstractC13393g
    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        boolean zIsInstance;
        super.initialize(obj, windVaneWebView);
        try {
            zIsInstance = IJSFactory.class.isInstance(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            zIsInstance = false;
        }
        try {
            if (zIsInstance) {
                this.f40593g = (BaseIRewardCommunication) BaseRewardSignalH5.class.newInstance();
                BaseRewardSignalH5.class.getMethod(MobileAdsBridgeBase.initializeMethodName, Object.class, WindVaneWebView.class).invoke(this.f40593g, obj, windVaneWebView);
            } else if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof BaseIRewardCommunication)) {
                this.f40593g = (BaseIRewardCommunication) windVaneWebView.getObject();
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void install(Object obj, String str) {
        try {
            BaseIRewardCommunication baseIRewardCommunication = this.f40593g;
            if (baseIRewardCommunication != null) {
                baseIRewardCommunication.install(obj, str);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (obj != null) {
                C13387a c13387a = (C13387a) obj;
                if (c13387a.f37156b.getObject() instanceof C14191k) {
                    ((C14191k) c13387a.f37156b.getObject()).click(1, str);
                    C13219q0.m37816b("JS-Reward-Brigde", "JSCommon install jump success");
                }
            }
            C13219q0.m37816b("JS-Reward-Brigde", "JSCommon install failed");
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Reward-Brigde", "install", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.f40593g == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f40593g.notifyCloseBtn(obj, str);
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Reward-Brigde", "notifyCloseBtn", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void openURL(Object obj, String str) {
        C13219q0.m37816b("JS-Reward-Brigde", "openURL:" + str);
        if (TextUtils.isEmpty(str)) {
            C13374d.m38666a(obj, "params is null");
            return;
        }
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
            C13219q0.m37816b("JS-Reward-Brigde", e.getMessage());
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Reward-Brigde", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void setOrientation(Object obj, String str) {
        try {
            if (this.f40593g == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f40593g.setOrientation(obj, str);
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Reward-Brigde", "setOrientation", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.f40593g == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f40593g.toggleCloseBtn(obj, str);
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Reward-Brigde", "toggleCloseBtn", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void triggerCloseBtn(Object obj, String str) {
        try {
            if (this.f40593g == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f40593g.triggerCloseBtn(obj, str);
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Reward-Brigde", "triggerCloseBtn", th);
            C13392f.m38726a().m38731b(obj, m42238a(-1));
        }
    }
}

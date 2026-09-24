package com.mbridge.msdk.video.signal.communication;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.click.C12684c;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.mbsignalcommon.communication.C13374d;
import com.mbridge.msdk.mbsignalcommon.windvane.C13387a;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class BaseRewardSignalH5 extends AbstractC14172a {

    /* JADX INFO: renamed from: a */
    protected IJSFactory f40594a;

    /* JADX INFO: renamed from: a */
    private String m42239a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, i);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            C13219q0.m37816b("JS-Reward-Communication", "code to string is error");
            return "";
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void cai(Object obj, String str) {
        C13219q0.m37813a("JS-Reward-Communication", "cai:" + str);
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
                    C13219q0.m37813a("JS-Reward-Communication", e.getMessage());
                }
            } catch (Throwable th) {
                C13374d.m38666a(obj, "exception: " + th.getLocalizedMessage());
                C13219q0.m37817b("JS-Reward-Communication", "cai", th);
            }
        } catch (JSONException e2) {
            C13374d.m38666a(obj, "exception: " + e2.getLocalizedMessage());
            C13219q0.m37817b("JS-Reward-Communication", "cai", e2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void getEndScreenInfo(Object obj, String str) {
        String strEncodeToString;
        try {
            IJSFactory iJSFactory = this.f40594a;
            if (iJSFactory != null) {
                String strMo42350b = iJSFactory.getIJSRewardVideoV1().mo42350b();
                if (TextUtils.isEmpty(strMo42350b)) {
                    strEncodeToString = "";
                    C13219q0.m37813a("JS-Reward-Communication", "getEndScreenInfo failed");
                } else {
                    strEncodeToString = Base64.encodeToString(strMo42350b.getBytes(), 2);
                    C13219q0.m37813a("JS-Reward-Communication", "getEndScreenInfo success");
                }
                C13392f.m38726a().m38731b(obj, strEncodeToString);
            }
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Reward-Communication", "getEndScreenInfo", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void handlerPlayableException(Object obj, String str) {
        try {
            if (this.f40594a == null || TextUtils.isEmpty(str)) {
                return;
            }
            String strOptString = new JSONObject(str).optString(NotificationCompat.CATEGORY_MESSAGE);
            C13219q0.m37813a("JS-Reward-Communication", "handlerPlayableException,msg:" + str);
            this.f40594a.getIJSRewardVideoV1().handlerPlayableException(strOptString);
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Reward-Communication", "setOrientation", th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        if (context instanceof IJSFactory) {
            this.f40594a = (IJSFactory) context;
        }
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        if (obj instanceof IJSFactory) {
            this.f40594a = (IJSFactory) obj;
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void install(Object obj, String str) {
        try {
            if (this.f40594a != null) {
                C13219q0.m37813a("JS-Reward-Communication", "install:" + str);
                if (this.f40594a.getJSContainerModule().endCardShowing()) {
                    this.f40594a.getJSCommon().click(3, str);
                } else {
                    this.f40594a.getJSCommon().click(1, str);
                }
            }
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Reward-Communication", "install", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.f40594a == null || TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("state");
            C13219q0.m37813a("JS-Reward-Communication", "notifyCloseBtn,state:" + str);
            this.f40594a.getIJSRewardVideoV1().notifyCloseBtn(iOptInt);
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Reward-Communication", "notifyCloseBtn", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void openURL(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        C13219q0.m37816b("JS-Reward-Communication", "openURL:" + str);
        Context contextM36542d = C13008c.m36588n().m36542d();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (contextM36542d == null) {
            try {
                if ((obj instanceof C13387a) && (windVaneWebView = ((C13387a) obj).f37156b) != null) {
                    contextM36542d = windVaneWebView.getContext();
                }
            } catch (Exception e) {
                C13219q0.m37816b("JS-Reward-Communication", e.getMessage());
            }
        }
        if (contextM36542d == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url");
            int iOptInt = jSONObject.optInt("type");
            if (iOptInt == 1) {
                C12684c.m34659c(contextM36542d, strOptString);
            } else if (iOptInt == 2) {
                C12684c.m34661e(contextM36542d, strOptString);
            }
        } catch (JSONException e2) {
            C13219q0.m37816b("JS-Reward-Communication", e2.getMessage());
        } catch (Throwable th) {
            C13219q0.m37816b("JS-Reward-Communication", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void setOrientation(Object obj, String str) {
        try {
            if (this.f40594a == null || TextUtils.isEmpty(str)) {
                return;
            }
            String strOptString = new JSONObject(str).optString("state");
            C13219q0.m37813a("JS-Reward-Communication", "setOrientation,state:" + str);
            this.f40594a.getIJSRewardVideoV1().mo42349a(strOptString);
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Reward-Communication", "setOrientation", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.f40594a == null || TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("state");
            C13219q0.m37813a("JS-Reward-Communication", "toggleCloseBtn,state:" + str);
            this.f40594a.getIJSRewardVideoV1().toggleCloseBtn(iOptInt);
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Reward-Communication", "toggleCloseBtn", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void triggerCloseBtn(Object obj, String str) {
        try {
            if (this.f40594a == null || TextUtils.isEmpty(str)) {
                return;
            }
            C13392f.m38726a().m38731b(obj, m42239a(0));
            this.f40594a.getIJSRewardVideoV1().triggerCloseBtn(new JSONObject(str).optString("state"));
            C13219q0.m37813a("JS-Reward-Communication", "triggerCloseBtn,state:" + str);
        } catch (Throwable th) {
            C13219q0.m37817b("JS-Reward-Communication", "triggerCloseBtn", th);
            C13392f.m38726a().m38731b(obj, m42239a(-1));
        }
    }
}

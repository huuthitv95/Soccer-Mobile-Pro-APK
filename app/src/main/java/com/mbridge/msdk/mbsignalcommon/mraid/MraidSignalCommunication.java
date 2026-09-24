package com.mbridge.msdk.mbsignalcommon.mraid;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C11744X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.utils.C12704a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.mbsignalcommon.windvane.C13387a;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class MraidSignalCommunication extends BaseMraidSignalCommunication {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f37118h = 0;

    /* JADX INFO: renamed from: g */
    private InterfaceC13381b f37119g;

    public void close(Object obj, String str) {
        if (obj instanceof C13387a) {
            C13380a.m38682a().m38692b(((C13387a) obj).f37156b, "close");
        }
        try {
            C13219q0.m37816b("MraidSignalCommunication", "MRAID close");
            InterfaceC13381b interfaceC13381b = this.f37119g;
            if (interfaceC13381b != null) {
                interfaceC13381b.close();
            }
        } catch (Throwable th) {
            C13219q0.m37817b("MraidSignalCommunication", "MRAID close", th);
        }
    }

    public void expand(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (obj instanceof C13387a) {
            C13387a c13387a = (C13387a) obj;
            windVaneWebView = c13387a.f37156b;
            C13380a.m38682a().m38692b(c13387a.f37156b, "expand");
        } else {
            windVaneWebView = null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url");
            String strOptString2 = jSONObject.optString("shouldUseCustomClose");
            C13219q0.m37816b("MraidSignalCommunication", "MRAID expand " + strOptString + " " + strOptString2);
            if ((windVaneWebView != null && System.currentTimeMillis() - windVaneWebView.lastTouchTime > C12704a.f33795d && C12704a.m34808a(this.f37119g.getMraidCampaign(), windVaneWebView.getUrl(), C12704a.f33794c)) || TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || this.f37119g == null) {
                return;
            }
            this.f37119g.expand(strOptString, strOptString2.toLowerCase().equals("true"));
        } catch (Throwable th) {
            C13219q0.m37817b("MraidSignalCommunication", "MRAID expand", th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mbridge.msdk.mbsignalcommon.windvane.AbstractC13393g
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (context instanceof InterfaceC13381b) {
                this.f37119g = (InterfaceC13381b) context;
                return;
            }
            if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof InterfaceC13381b)) {
                this.f37119g = (InterfaceC13381b) windVaneWebView.getObject();
            }
            if (windVaneWebView.getMraidObject() == null || !(windVaneWebView.getMraidObject() instanceof InterfaceC13381b)) {
                return;
            }
            this.f37119g = (InterfaceC13381b) windVaneWebView.getMraidObject();
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public void open(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (obj instanceof C13387a) {
            C13387a c13387a = (C13387a) obj;
            windVaneWebView = c13387a.f37156b;
            C13380a.m38682a().m38692b(c13387a.f37156b, "open");
        } else {
            windVaneWebView = null;
        }
        try {
            String strOptString = new JSONObject(str).optString("url");
            C13219q0.m37816b("MraidSignalCommunication", "MRAID Open " + strOptString);
            if (this.f37119g == null || TextUtils.isEmpty(strOptString)) {
                return;
            }
            if (windVaneWebView == null || System.currentTimeMillis() - windVaneWebView.lastTouchTime <= C12704a.f33795d || !C12704a.m34808a(this.f37119g.getMraidCampaign(), windVaneWebView.getUrl(), C12704a.f33792a)) {
                this.f37119g.open(strOptString);
            }
        } catch (Throwable th) {
            C13219q0.m37817b("MraidSignalCommunication", "MRAID Open", th);
        }
    }

    public void setOrientationProperties(Object obj, String str) {
        String str2;
        if (obj instanceof C13387a) {
            C13380a.m38682a().m38692b(((C13387a) obj).f37156b, MRAIDPresenter.SET_ORIENTATION_PROPERTIES);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("allowOrientationChange");
            String strOptString2 = jSONObject.optString("forceOrientation");
            C13219q0.m37816b("MraidSignalCommunication", "MRAID setOrientationProperties");
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || this.f37119g == null) {
                return;
            }
            strOptString.toLowerCase().equals("true");
            String lowerCase = strOptString2.toLowerCase();
            int iHashCode = lowerCase.hashCode();
            if (iHashCode == 729267099) {
                str2 = C11744X3.i.f26322D;
            } else if (iHashCode != 1430647483) {
                return;
            } else {
                str2 = C11744X3.i.f26320C;
            }
            lowerCase.equals(str2);
        } catch (Throwable th) {
            C13219q0.m37817b("MraidSignalCommunication", "MRAID setOrientationProperties", th);
        }
    }

    public void unload(Object obj, String str) {
        if (obj instanceof C13387a) {
            C13380a.m38682a().m38692b(((C13387a) obj).f37156b, "unload");
        }
        try {
            C13219q0.m37816b("MraidSignalCommunication", "MRAID unload");
            InterfaceC13381b interfaceC13381b = this.f37119g;
            if (interfaceC13381b != null) {
                interfaceC13381b.unload();
            }
        } catch (Throwable th) {
            C13219q0.m37817b("MraidSignalCommunication", "MRAID unload", th);
        }
    }

    public void useCustomClose(Object obj, String str) {
        if (obj instanceof C13387a) {
            C13380a.m38682a().m38692b(((C13387a) obj).f37156b, "useCustomClose");
        }
        try {
            String strOptString = new JSONObject(str).optString("shouldUseCustomClose");
            C13219q0.m37816b("MraidSignalCommunication", "MRAID useCustomClose " + strOptString);
            if (TextUtils.isEmpty(strOptString) || this.f37119g == null) {
                return;
            }
            this.f37119g.useCustomClose(strOptString.toLowerCase().equals("true"));
        } catch (Throwable th) {
            C13219q0.m37817b("MraidSignalCommunication", "MRAID useCustomClose", th);
        }
    }
}

package com.mbridge.msdk.splash.signal;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.mbsignalcommon.windvane.AbsFeedBackForH5;
import com.mbridge.msdk.mbsignalcommon.windvane.C13387a;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class SplashSignal extends AbsFeedBackForH5 {

    /* JADX INFO: renamed from: h */
    private static String f38388h = "SplashSignal";

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int f38389i = 0;

    /* JADX INFO: renamed from: g */
    private C13678b f38390g;

    public void getFileInfo(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            C13679c.m40081a(obj, new JSONObject(str));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void handlerH5Exception(Object obj, String str) {
        if (obj != null) {
            try {
                WindVaneWebView windVaneWebView = ((C13387a) obj).f37156b;
                if (windVaneWebView == null || windVaneWebView.getWebViewListener() == null) {
                    return;
                }
                windVaneWebView.getWebViewListener().onReceivedError(windVaneWebView, 0, str.toString(), windVaneWebView.getUrl());
            } catch (Throwable th) {
                C13219q0.m37817b(f38388h, "handlerH5Exception", th);
            }
        }
    }

    public void increaseOfferFrequence(Object obj, String str) {
        try {
            C13679c.m40084b(obj, new JSONObject(str));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void init(Object obj, String str) {
        C13219q0.m37816b(f38388h, MobileAdsBridgeBase.initializeMethodName + str);
        C13678b c13678b = this.f38390g;
        if (c13678b != null) {
            c13678b.init(obj, str);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.AbstractC13393g
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (windVaneWebView.getObject() == null || !(windVaneWebView.getObject() instanceof C13678b)) {
                return;
            }
            this.f38390g = (C13678b) windVaneWebView.getObject();
        } catch (Throwable th) {
            C13219q0.m37817b(f38388h, MobileAdsBridgeBase.initializeMethodName, th);
        }
    }

    public void install(Object obj, String str) {
        C13678b c13678b = this.f38390g;
        if (c13678b != null) {
            c13678b.install(obj, str);
        }
    }

    public void onSignalCommunication(Object obj, String str) {
        try {
            C13219q0.m37816b(f38388h, "onSignalCommunication");
            C13678b c13678b = this.f38390g;
            if (c13678b != null) {
                c13678b.m40071c(obj, str);
            }
        } catch (Throwable th) {
            C13219q0.m37817b(f38388h, "onSignalCommunication", th);
        }
    }

    public void openURL(Object obj, String str) {
        C13219q0.m37816b(f38388h, "openURL" + str);
        C13678b c13678b = this.f38390g;
        if (c13678b != null) {
            c13678b.openURL(obj, str);
        }
    }

    public void pauseCountDown(Object obj, String str) {
        try {
            C13219q0.m37816b(f38388h, "pauseCountDown");
            C13678b c13678b = this.f38390g;
            if (c13678b != null) {
                c13678b.m40073e(obj, str);
            }
        } catch (Throwable th) {
            C13219q0.m37817b(f38388h, "pauseCountDown", th);
        }
    }

    public void readyStatus(Object obj, String str) {
        if (obj != null) {
            try {
                int iOptInt = new JSONObject(str).optInt("isReady", 1);
                WindVaneWebView windVaneWebView = ((C13387a) obj).f37156b;
                if (windVaneWebView == null || windVaneWebView.getWebViewListener() == null) {
                    return;
                }
                windVaneWebView.getWebViewListener().mo34467a(windVaneWebView, iOptInt);
            } catch (Throwable th) {
                C13219q0.m37817b(f38388h, "readyStatus", th);
            }
        }
    }

    public void reportUrls(Object obj, String str) {
        try {
            C13219q0.m37816b(f38388h, "reportUrls");
            C13678b c13678b = this.f38390g;
            if (c13678b != null) {
                c13678b.reportUrls(obj, str);
            }
        } catch (Throwable th) {
            C13219q0.m37817b(f38388h, "reportUrls", th);
        }
    }

    public void resetCountdown(Object obj, String str) {
        C13219q0.m37816b(f38388h, "resetCountdown" + str);
        C13678b c13678b = this.f38390g;
        if (c13678b != null) {
            c13678b.m40066a(obj, str);
        }
    }

    public void resumeCountDown(Object obj, String str) {
        try {
            C13219q0.m37816b(f38388h, "resumeCountDown");
            C13678b c13678b = this.f38390g;
            if (c13678b != null) {
                c13678b.m40074f(obj, str);
            }
        } catch (Throwable th) {
            C13219q0.m37817b(f38388h, "resumeCountDown", th);
        }
    }

    public void sendImpressions(Object obj, String str) {
        try {
            C13219q0.m37816b(f38388h, "sendImpressions");
            C13678b c13678b = this.f38390g;
            if (c13678b != null) {
                c13678b.m40072d(obj, str);
            }
        } catch (Throwable th) {
            C13219q0.m37817b(f38388h, "sendImpressions", th);
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        C13219q0.m37816b(f38388h, "toggleCloseBtn" + str);
        C13678b c13678b = this.f38390g;
        if (c13678b != null) {
            c13678b.toggleCloseBtn(obj, str);
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        C13219q0.m37816b(f38388h, "triggerCloseBtn" + str);
        C13678b c13678b = this.f38390g;
        if (c13678b != null) {
            c13678b.triggerCloseBtn(obj, str);
        }
    }
}

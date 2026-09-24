package com.mbridge.msdk.splash.view;

import android.content.Context;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;

/* JADX INFO: loaded from: classes7.dex */
public class MBSplashWebview extends WindVaneWebView {

    /* JADX INFO: renamed from: r */
    private String f38522r;

    /* JADX INFO: renamed from: s */
    private AdSession f38523s;

    public MBSplashWebview(Context context) {
        super(context);
        setBackgroundColor(0);
    }

    public void finishAdSession() {
        try {
            AdSession adSession = this.f38523s;
            if (adSession != null) {
                adSession.finish();
                this.f38523s = null;
                C13219q0.m37813a("OMSDK", "finish adSession");
            }
        } catch (Exception e) {
            C13219q0.m37813a("OMSDK", e.getMessage());
        }
    }

    public AdSession getAdSession() {
        return this.f38523s;
    }

    public String getRequestId() {
        return this.f38522r;
    }

    public void setAdSession(AdSession adSession) {
        this.f38523s = adSession;
    }

    public void setRequestId(String str) {
        this.f38522r = str;
    }
}

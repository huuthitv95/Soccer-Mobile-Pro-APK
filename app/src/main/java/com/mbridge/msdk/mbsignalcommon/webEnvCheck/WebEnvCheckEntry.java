package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import android.content.Context;
import com.ironsource.C11341A5;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.setting.util.C13646b;

/* JADX INFO: loaded from: classes6.dex */
public class WebEnvCheckEntry {
    public void check(Context context) {
        new WindVaneWebView(context).loadDataWithBaseURL(null, "<html><script>" + C13646b.m39770c().m39773d() + "</script></html>", "text/html", C11341A5.f23802O, null);
    }
}

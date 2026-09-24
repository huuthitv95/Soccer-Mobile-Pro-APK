package com.mbridge.msdk.advanced.view;

import android.content.Context;
import android.content.IntentFilter;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.advanced.common.NetWorkStateReceiver;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;

/* JADX INFO: loaded from: classes4.dex */
public class MBNativeAdvancedWebview extends WindVaneWebView {

    /* JADX INFO: renamed from: t */
    private static final String f33601t = "MBNativeAdvancedWebview";

    /* JADX INFO: renamed from: r */
    private AdSession f33602r;

    /* JADX INFO: renamed from: s */
    private NetWorkStateReceiver f33603s;

    public MBNativeAdvancedWebview(Context context) {
        super(context);
        setBackgroundColor(0);
    }

    public void finishAdSession() {
        try {
            AdSession adSession = this.f33602r;
            if (adSession != null) {
                adSession.finish();
                this.f33602r = null;
                C13219q0.m37813a("OMSDK", "finish adSession");
            }
        } catch (Exception e) {
            C13219q0.m37813a("OMSDK", e.getMessage());
        }
    }

    public AdSession getAdSession() {
        return this.f33602r;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        registerNetWorkReceiver();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        unregisterNetWorkReceiver();
    }

    public void registerNetWorkReceiver() {
        try {
            if (this.f33603s == null) {
                this.f33603s = new NetWorkStateReceiver(this);
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            getContext().registerReceiver(this.f33603s, intentFilter);
        } catch (Throwable th) {
            C13219q0.m37813a(f33601t, th.getMessage());
        }
    }

    public void setAdSession(AdSession adSession) {
        this.f33602r = adSession;
    }

    public void unregisterNetWorkReceiver() {
        try {
            NetWorkStateReceiver netWorkStateReceiver = this.f33603s;
            if (netWorkStateReceiver != null) {
                netWorkStateReceiver.m34375a();
                getContext().unregisterReceiver(this.f33603s);
            }
        } catch (Throwable th) {
            C13219q0.m37813a(f33601t, th.getMessage());
        }
    }
}

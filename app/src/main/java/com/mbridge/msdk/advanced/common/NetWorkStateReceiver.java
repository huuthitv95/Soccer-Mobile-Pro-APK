package com.mbridge.msdk.advanced.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class NetWorkStateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: c */
    private static final String f33379c = "NetWorkStateReceiver";

    /* JADX INFO: renamed from: a */
    private WebView f33380a;

    /* JADX INFO: renamed from: b */
    private int f33381b;

    public NetWorkStateReceiver(WebView webView) {
        this.f33380a = webView;
    }

    /* JADX INFO: renamed from: a */
    public void m34375a() {
        this.f33380a = null;
    }

    /* JADX INFO: renamed from: a */
    public void m34376a(WebView webView, int i) {
        if (webView != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("netstat", i);
                C13392f.m38726a().m38728a(webView, "onNetstatChanged", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Throwable th) {
                C13219q0.m37813a(f33379c, th.getMessage());
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                m34376a(this.f33380a, 0);
                return;
            }
            if (!C13088a.f35884z) {
                m34376a(this.f33380a, 0);
                return;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                m34376a(this.f33380a, 0);
                return;
            }
            if (activeNetworkInfo.getState() != NetworkInfo.State.CONNECTING && activeNetworkInfo.getState() != NetworkInfo.State.DISCONNECTING) {
                if (activeNetworkInfo.getType() == 1) {
                    m34376a(this.f33380a, 9);
                    return;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager == null) {
                    m34376a(this.f33380a, 0);
                    return;
                }
                int networkType = telephonyManager.getNetworkType();
                this.f33381b = networkType;
                int iM37737c = C13211m0.m37737c(networkType);
                this.f33381b = iM37737c;
                m34376a(this.f33380a, iM37737c);
            }
        } catch (Throwable th) {
            C13219q0.m37813a(f33379c, th.getMessage());
        }
    }
}

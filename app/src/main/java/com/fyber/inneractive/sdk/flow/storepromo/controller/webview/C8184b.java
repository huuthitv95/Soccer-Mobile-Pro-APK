package com.fyber.inneractive.sdk.flow.storepromo.controller.webview;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.config.C8021o;
import com.fyber.inneractive.sdk.config.C8040s;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.flow.storepromo.controller.listener.InterfaceC8182a;
import com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.InterfaceC8186a;
import com.fyber.inneractive.sdk.network.events.EnumC8372b;
import com.fyber.inneractive.sdk.util.AbstractC9154h0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.storepromo.controller.webview.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C8184b extends WebViewClient {

    /* JADX INFO: renamed from: c */
    public static final String[] f18238c = {"https://fonts.googleapis.com", "https://fonts.googleapis.com"};

    /* JADX INFO: renamed from: a */
    public InterfaceC8186a f18239a;

    /* JADX INFO: renamed from: b */
    public InterfaceC8182a f18240b;

    public C8184b(InterfaceC8186a interfaceC8186a, InterfaceC8182a interfaceC8182a) {
        this.f18239a = interfaceC8186a;
        this.f18240b = interfaceC8182a;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m20612a(String str) {
        C8040s c8040s;
        if (str == null || (c8040s = IAConfigManager.f17654M.f17688t) == null) {
            return false;
        }
        C8021o c8021o = c8040s.f17862b;
        String[] strArr = f18238c;
        String strM20445a = c8021o.m20445a("font_urls", (String) null);
        if (strM20445a != null) {
            try {
                JSONArray jSONArray = new JSONArray(strM20445a);
                String[] strArr2 = new String[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    strArr2[i] = jSONArray.getString(i);
                }
                strArr = strArr2;
            } catch (JSONException unused) {
            }
        }
        for (String str2 : strArr) {
            if (str.contains(str2.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m20613a(String str, RenderProcessGoneDetail renderProcessGoneDetail) {
        String strValueOf = "unknown";
        if (Build.VERSION.SDK_INT >= 26) {
            strValueOf = renderProcessGoneDetail != null ? String.valueOf(renderProcessGoneDetail.didCrash()) : "unknown";
            IAlog.m21945a("%s: onRenderProcessGone: handled, webview crashed: %s view: %s", "StorePromoWebviewClient", strValueOf, str);
        } else {
            IAlog.m21945a("%s: onRenderProcessGone: handled, view: %s", "StorePromoWebviewClient", str);
        }
        String str2 = "Webview did crash: " + strValueOf + " on webview: " + str;
        EnumC8372b enumC8372b = EnumC8372b.WEB_VIEW_CRASH_ERROR;
        InterfaceC8182a interfaceC8182a = this.f18240b;
        if (interfaceC8182a != null) {
            interfaceC8182a.mo20602a(enumC8372b, str2, null);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        IAlog.m21945a("%s: onReceivedError: error: %s errorCode: %d, failing url: %s", "StorePromoWebviewClient", str, Integer.valueOf(i), str2);
        if (m20612a(str2)) {
            return;
        }
        String str3 = str + " errCode: " + i;
        EnumC8372b enumC8372b = EnumC8372b.TEMPLATE_CONTENT_ERROR;
        if (!AbstractC9154h0.m21969e(str2)) {
            str2 = null;
        }
        InterfaceC8182a interfaceC8182a = this.f18240b;
        if (interfaceC8182a != null) {
            interfaceC8182a.mo20602a(enumC8372b, str3, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        int errorCode;
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        String string = "";
        if (webResourceError != null) {
            string = webResourceError.getDescription() != null ? webResourceError.getDescription().toString() : "";
            errorCode = webResourceError.getErrorCode();
        } else {
            errorCode = -999;
        }
        String string2 = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? "unknown" : webResourceRequest.getUrl().toString();
        IAlog.m21945a("%s: onReceivedError: error: %s errorCode: %d, failing url: %s", "StorePromoWebviewClient", string, Integer.valueOf(errorCode), string2);
        if (m20612a(string2)) {
            return;
        }
        String str = string + " errCode: " + errorCode;
        EnumC8372b enumC8372b = EnumC8372b.TEMPLATE_CONTENT_ERROR;
        if (!AbstractC9154h0.m21969e(string2)) {
            string2 = null;
        }
        InterfaceC8182a interfaceC8182a = this.f18240b;
        if (interfaceC8182a != null) {
            interfaceC8182a.mo20602a(enumC8372b, str, string2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (webView == null) {
            m20613a("unknown", renderProcessGoneDetail);
            return true;
        }
        m20613a(webView.toString(), renderProcessGoneDetail);
        webView.destroy();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        IAlog.m21945a("%s: shouldOverrideUrlLoading: url: %s", "StorePromoWebviewClient", str);
        Uri uri = Uri.parse(str);
        if (uri != null && !TextUtils.isEmpty(uri.getScheme()) && !TextUtils.isEmpty(uri.getAuthority()) && !TextUtils.isEmpty(uri.getHost()) && "FyRemote://".toLowerCase().contains(uri.getScheme())) {
            HashMap mapM21964a = AbstractC9154h0.m21964a(uri);
            String host = uri.getHost();
            InterfaceC8186a interfaceC8186a = this.f18239a;
            if (interfaceC8186a != null) {
                interfaceC8186a.mo20609a(host, mapM21964a);
            }
        }
        return true;
    }
}

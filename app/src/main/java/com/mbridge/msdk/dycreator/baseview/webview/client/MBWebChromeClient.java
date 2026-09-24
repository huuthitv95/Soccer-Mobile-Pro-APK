package com.mbridge.msdk.dycreator.baseview.webview.client;

import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.mbridge.msdk.dycreator.baseview.webview.communicator.WebCommunicator;
import com.mbridge.msdk.dycreator.baseview.webview.listener.WebViewEventListener;
import com.mbridge.msdk.foundation.tools.C13219q0;

/* JADX INFO: loaded from: classes5.dex */
public class MBWebChromeClient extends WebChromeClient {

    /* JADX INFO: renamed from: a */
    private final String f35182a = "MBWebChromeClient";

    /* JADX INFO: renamed from: b */
    private WebViewEventListener f35183b;

    /* JADX INFO: renamed from: c */
    private WebCommunicator f35184c;

    /* JADX INFO: renamed from: a */
    private boolean m36294a(String str) {
        WebCommunicator webCommunicator;
        try {
            if (str.startsWith("mv:") || str.startsWith("mraid:")) {
                if (str.contains("wv_hybrid:")) {
                    str = str.substring(0, str.lastIndexOf(" ") + 1);
                }
                C13219q0.m37813a("MBWebChromeClient", "onConsoleMessage: message.length() = " + str.length() + " " + str);
                if (!TextUtils.isEmpty(str) && (webCommunicator = this.f35184c) != null) {
                    webCommunicator.onCommunication(str);
                }
                return true;
            }
        } catch (Throwable th) {
            C13219q0.m37816b("MBWebChromeClient", th.getMessage());
        }
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.LOG) {
            return super.onConsoleMessage(consoleMessage);
        }
        if (TextUtils.isEmpty(consoleMessage.message()) || !m36294a(consoleMessage.message())) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (TextUtils.isEmpty(str2) || !m36294a(str2)) {
            return false;
        }
        jsPromptResult.confirm("");
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        WebViewEventListener webViewEventListener = this.f35183b;
        if (webViewEventListener != null) {
            webViewEventListener.onProgressChanged(webView, i);
        }
    }

    public void setCommunicator(WebCommunicator webCommunicator) {
        this.f35184c = webCommunicator;
    }

    public void setWebViewEventListener(WebViewEventListener webViewEventListener) {
        this.f35183b = webViewEventListener;
    }
}

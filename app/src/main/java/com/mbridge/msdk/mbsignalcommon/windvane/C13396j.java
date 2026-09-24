package com.mbridge.msdk.mbsignalcommon.windvane;

import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.C13219q0;

/* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.windvane.j */
/* JADX INFO: compiled from: WindVaneWebViewChromeClient.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13396j extends WebChromeClient {

    /* JADX INFO: renamed from: a */
    WindVaneWebView f37194a;

    /* JADX INFO: renamed from: b */
    private InterfaceC13389c f37195b;

    public C13396j(WindVaneWebView windVaneWebView) {
        this.f37194a = windVaneWebView;
    }

    /* JADX INFO: renamed from: a */
    public void m38743a(InterfaceC13389c interfaceC13389c) {
        this.f37195b = interfaceC13389c;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.LOG) {
            return super.onConsoleMessage(consoleMessage);
        }
        InterfaceC13388b signalCommunication = this.f37194a.getSignalCommunication();
        if (signalCommunication != null) {
            String strMessage = consoleMessage.message();
            if (TextUtils.isEmpty(strMessage) || !strMessage.startsWith("mv://")) {
                return false;
            }
            C13219q0.m37813a("H5_ENTRY", "onConsoleMessage: message.length() = " + strMessage.length() + " " + strMessage);
            if (strMessage.contains("wv_hybrid:") && signalCommunication.mo38716b("wv_hybrid:")) {
                String strSubstring = strMessage.substring(0, strMessage.lastIndexOf(" ") + 1);
                C13219q0.m37813a("H5_ENTRY", "message = " + strSubstring);
                signalCommunication.mo38715a(strSubstring);
                return true;
            }
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        C13219q0.m37816b("H5_ENTRY", str2 + "");
        InterfaceC13388b signalCommunication = this.f37194a.getSignalCommunication();
        if (signalCommunication == null || str3 == null || !signalCommunication.mo38716b(str3)) {
            return false;
        }
        signalCommunication.mo38715a(str2);
        jsPromptResult.confirm("");
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        InterfaceC13389c interfaceC13389c = this.f37195b;
        if (interfaceC13389c != null) {
            interfaceC13389c.onProgressChanged(webView, i);
        }
    }
}

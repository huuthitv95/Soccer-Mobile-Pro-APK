package com.iab.omid.library.bytedance2.adsession;

import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.ProxyConfig;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.iab.omid.library.bytedance2.internal.C10982e;
import com.iab.omid.library.bytedance2.internal.C10983f;
import com.iab.omid.library.bytedance2.utils.C10997d;
import com.iab.omid.library.bytedance2.utils.C11000g;
import com.iab.omid.library.bytedance2.utils.C11002i;
import com.iab.omid.library.bytedance2.weakreference.C11015a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class JavaScriptSessionService {
    private static String JS_MESSAGE_DATA_AD_SESSION_ID = "adSessionId";
    private static String JS_MESSAGE_KEY_DATA = "data";
    private static String JS_MESSAGE_KEY_METHOD = "method";
    private static String JS_MESSAGE_LISTENER_JS_SESSION_SERVICE = "omidJsSessionService";
    private static String JS_MESSAGE_METHOD_FINISH_SESSION = "finishSession";
    private static String JS_MESSAGE_METHOD_START_SESSION = "startSession";
    private static C11002i webViewUtil = new C11002i();
    private final HashMap<String, AdSession> adSessions = new HashMap<>();
    private final C10983f friendlyObstructions = new C10983f();
    private final boolean isHtmlAdView;
    private final Partner partner;
    private C11015a weakAdView;
    private final WebView webView;

    public interface TearDownHandler {
        void onTearDown(boolean z);
    }

    private JavaScriptSessionService(Partner partner, WebView webView, boolean z) {
        C11000g.m23598a();
        C11000g.m23601a(partner, "Partner is null");
        C11000g.m23601a(webView, "WebView is null");
        this.partner = partner;
        this.webView = webView;
        this.isHtmlAdView = z;
        addWebViewListener();
    }

    private void addWebViewListener() {
        if (!WebViewFeature.isFeatureSupported("WEB_MESSAGE_LISTENER")) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        removeWebViewListener();
        webViewUtil.m23617a(this.webView, JS_MESSAGE_LISTENER_JS_SESSION_SERVICE, new HashSet(Arrays.asList(ProxyConfig.MATCH_ALL_SCHEMES)), new WebViewCompat.WebMessageListener() { // from class: com.iab.omid.library.bytedance2.adsession.JavaScriptSessionService.2
            @Override // androidx.webkit.WebViewCompat.WebMessageListener
            public void onPostMessage(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z, JavaScriptReplyProxy javaScriptReplyProxy) {
                try {
                    JSONObject jSONObject = new JSONObject(webMessageCompat.getData());
                    String string = jSONObject.getString(JavaScriptSessionService.JS_MESSAGE_KEY_METHOD);
                    String string2 = jSONObject.getJSONObject(JavaScriptSessionService.JS_MESSAGE_KEY_DATA).getString(JavaScriptSessionService.JS_MESSAGE_DATA_AD_SESSION_ID);
                    if (string.equals(JavaScriptSessionService.JS_MESSAGE_METHOD_START_SESSION)) {
                        JavaScriptSessionService.this.startSession(string2);
                    } else if (string.equals(JavaScriptSessionService.JS_MESSAGE_METHOD_FINISH_SESSION)) {
                        JavaScriptSessionService.this.finishSession(string2);
                    } else {
                        C10997d.m23592b("Unexpected method in JavaScriptSessionService: ".concat(String.valueOf(string)));
                    }
                } catch (JSONException e) {
                    C10997d.m23591a("Error parsing JS message in JavaScriptSessionService.", e);
                }
            }
        });
    }

    public static JavaScriptSessionService create(Partner partner, WebView webView, boolean z) {
        return new JavaScriptSessionService(partner, webView, z);
    }

    private AdSessionConfiguration createAdSessionConfiguration() {
        CreativeType creativeType = CreativeType.DEFINED_BY_JAVASCRIPT;
        ImpressionType impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
        Owner owner = Owner.JAVASCRIPT;
        return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
    }

    private AdSessionContext createAdSessionContext() {
        return this.isHtmlAdView ? AdSessionContext.createHtmlAdSessionContext(this.partner, this.webView, null, null) : AdSessionContext.createJavascriptAdSessionContext(this.partner, this.webView, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishSession(String str) {
        AdSession adSession = this.adSessions.get(str);
        if (adSession != null) {
            adSession.finish();
            this.adSessions.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeWebViewListener() {
        webViewUtil.m23616a(this.webView, JS_MESSAGE_LISTENER_JS_SESSION_SERVICE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSession(String str) {
        C10970a c10970a = new C10970a(createAdSessionConfiguration(), createAdSessionContext(), str);
        this.adSessions.put(str, c10970a);
        c10970a.registerAdView(this.isHtmlAdView ? this.webView : getAdView());
        for (C10982e c10982e : this.friendlyObstructions.m23499a()) {
            c10970a.addFriendlyObstruction(c10982e.m23494c().get(), c10982e.m23493b(), c10982e.m23492a());
        }
        c10970a.start();
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        Iterator<AdSession> it = this.adSessions.values().iterator();
        while (it.hasNext()) {
            it.next().addFriendlyObstruction(view, friendlyObstructionPurpose, str);
        }
        this.friendlyObstructions.m23500a(view, friendlyObstructionPurpose, str);
    }

    View getAdView() {
        C11015a c11015a = this.weakAdView;
        if (c11015a == null) {
            return null;
        }
        return c11015a.get();
    }

    public void removeAllFriendlyObstructions() {
        Iterator<AdSession> it = this.adSessions.values().iterator();
        while (it.hasNext()) {
            it.next().removeAllFriendlyObstructions();
        }
        this.friendlyObstructions.m23501b();
    }

    public void removeFriendlyObstruction(View view) {
        Iterator<AdSession> it = this.adSessions.values().iterator();
        while (it.hasNext()) {
            it.next().removeFriendlyObstruction(view);
        }
        this.friendlyObstructions.m23502c(view);
    }

    public void setAdView(View view) {
        if (this.isHtmlAdView) {
            if (view != this.webView) {
                throw new UnsupportedOperationException("For HTML-rendered ads, the ad view is automatically set to the web view and cannot be changed.");
            }
        } else {
            Iterator<AdSession> it = this.adSessions.values().iterator();
            while (it.hasNext()) {
                it.next().registerAdView(view);
            }
            this.weakAdView = new C11015a(view);
        }
    }

    public void tearDown(final TearDownHandler tearDownHandler) {
        Iterator<AdSession> it = this.adSessions.values().iterator();
        while (it.hasNext()) {
            it.next().finish();
        }
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() { // from class: com.iab.omid.library.bytedance2.adsession.JavaScriptSessionService.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                JavaScriptSessionService.this.removeWebViewListener();
                tearDownHandler.onTearDown(true);
                timer.cancel();
            }
        }, 1000L);
    }
}

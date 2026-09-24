package com.iab.omid.library.vungle.adsession;

import android.view.View;
import android.webkit.WebView;
import com.iab.omid.library.vungle.internal.C11294e;
import com.iab.omid.library.vungle.internal.C11295f;
import com.iab.omid.library.vungle.messagelistener.C11301a;
import com.iab.omid.library.vungle.messagelistener.InterfaceC11302b;
import com.iab.omid.library.vungle.utils.C11313d;
import com.iab.omid.library.vungle.utils.C11316g;
import com.iab.omid.library.vungle.weakreference.C11331a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class JavaScriptSessionService implements InterfaceC11302b {
    private static String JS_MESSAGE_DATA_AD_SESSION_ID = "adSessionId";
    private static String JS_MESSAGE_LISTENER_JS_SESSION_SERVICE = "omidJsSessionService";
    private static String JS_MESSAGE_METHOD_FINISH_SESSION = "finishSession";
    private static String JS_MESSAGE_METHOD_START_SESSION = "startSession";
    private final HashMap<String, AdSession> adSessions = new HashMap<>();
    private final C11295f friendlyObstructions = new C11295f();
    private final boolean isHtmlAdView;
    private final C11301a messageListener;
    private final Partner partner;
    private C11331a weakAdView;
    private final WebView webView;

    public interface TearDownHandler {
        void onTearDown(boolean z);
    }

    private JavaScriptSessionService(Partner partner, WebView webView, boolean z) {
        C11316g.m25156a();
        C11316g.m25159a(partner, "Partner is null");
        C11316g.m25159a(webView, "WebView is null");
        this.partner = partner;
        this.webView = webView;
        this.isHtmlAdView = z;
        if (z) {
            setAdView(webView);
        }
        C11301a c11301a = new C11301a(webView, this);
        this.messageListener = c11301a;
        c11301a.m25068a();
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

    private void finishSession(String str) {
        AdSession adSession = this.adSessions.get(str);
        if (adSession != null) {
            adSession.finish();
            this.adSessions.remove(str);
        }
    }

    private void startSession(String str) {
        C11271a c11271a = new C11271a(createAdSessionConfiguration(), createAdSessionContext(), str);
        this.adSessions.put(str, c11271a);
        c11271a.registerAdView(getAdView());
        for (C11294e c11294e : this.friendlyObstructions.m25025a()) {
            c11271a.addFriendlyObstruction(c11294e.m25020c().get(), c11294e.m25019b(), c11294e.m25018a());
        }
        c11271a.start();
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        Iterator<AdSession> it = this.adSessions.values().iterator();
        while (it.hasNext()) {
            it.next().addFriendlyObstruction(view, friendlyObstructionPurpose, str);
        }
        this.friendlyObstructions.m25026a(view, friendlyObstructionPurpose, str);
    }

    View getAdView() {
        C11331a c11331a = this.weakAdView;
        if (c11331a == null) {
            return null;
        }
        return c11331a.get();
    }

    @Override // com.iab.omid.library.vungle.messagelistener.InterfaceC11302b
    public String getListenerName() {
        return JS_MESSAGE_LISTENER_JS_SESSION_SERVICE;
    }

    @Override // com.iab.omid.library.vungle.messagelistener.InterfaceC11302b
    public void onMessageReceived(String str, JSONObject jSONObject) {
        try {
            String string = jSONObject.getString(JS_MESSAGE_DATA_AD_SESSION_ID);
            if (str.equals(JS_MESSAGE_METHOD_START_SESSION)) {
                startSession(string);
            } else {
                if (str.equals(JS_MESSAGE_METHOD_FINISH_SESSION)) {
                    finishSession(string);
                    return;
                }
                C11313d.m25150d("Unexpected method in JavaScriptSessionService: " + str);
            }
        } catch (JSONException e) {
            C11313d.m25147a("Error parsing JS message in JavaScriptSessionService.", e);
        }
    }

    @Override // com.iab.omid.library.vungle.messagelistener.InterfaceC11302b
    public void onWebMessageListenerUnsupported() {
        throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
    }

    public void removeAllFriendlyObstructions() {
        Iterator<AdSession> it = this.adSessions.values().iterator();
        while (it.hasNext()) {
            it.next().removeAllFriendlyObstructions();
        }
        this.friendlyObstructions.m25027b();
    }

    public void removeFriendlyObstruction(View view) {
        Iterator<AdSession> it = this.adSessions.values().iterator();
        while (it.hasNext()) {
            it.next().removeFriendlyObstruction(view);
        }
        this.friendlyObstructions.m25028c(view);
    }

    public void setAdView(View view) {
        if (getAdView() == view) {
            return;
        }
        Iterator<AdSession> it = this.adSessions.values().iterator();
        while (it.hasNext()) {
            it.next().registerAdView(view);
        }
        this.weakAdView = new C11331a(view);
    }

    public void tearDown(final TearDownHandler tearDownHandler) {
        Iterator<AdSession> it = this.adSessions.values().iterator();
        while (it.hasNext()) {
            it.next().finish();
        }
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() { // from class: com.iab.omid.library.vungle.adsession.JavaScriptSessionService.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                JavaScriptSessionService.this.messageListener.m25069b();
                tearDownHandler.onTearDown(true);
                timer.cancel();
            }
        }, 1000L);
    }
}

package com.applovin.communicator;

import android.content.Context;
import com.applovin.impl.C1571h5;
import com.applovin.impl.communicator.MessagingServiceImpl;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class AppLovinCommunicator {

    /* JADX INFO: renamed from: e */
    private static AppLovinCommunicator f937e;

    /* JADX INFO: renamed from: f */
    private static final Object f938f = new Object();

    /* JADX INFO: renamed from: a */
    private C1748l f939a;

    /* JADX INFO: renamed from: b */
    private C1768p f940b;

    /* JADX INFO: renamed from: c */
    private final C1571h5 f941c = new C1571h5();

    /* JADX INFO: renamed from: d */
    private final MessagingServiceImpl f942d = new MessagingServiceImpl();

    /* JADX INFO: renamed from: a */
    private void m1756a(String str) {
        if (this.f940b == null || !C1768p.m5160a()) {
            return;
        }
        this.f940b.m5171a("AppLovinCommunicator", str);
    }

    public static AppLovinCommunicator getInstance() {
        return getInstance(C1748l.m4756p());
    }

    @Deprecated
    public static AppLovinCommunicator getInstance(Context context) {
        synchronized (f938f) {
            if (f937e == null) {
                f937e = new AppLovinCommunicator();
            }
        }
        return f937e;
    }

    /* JADX INFO: renamed from: a */
    public void m1757a(C1748l c1748l) {
        this.f939a = c1748l;
        this.f940b = c1748l.m4782Q();
        m1756a("Attached SDK instance: " + c1748l + "...");
    }

    public AppLovinCommunicatorMessagingService getMessagingService() {
        return this.f942d;
    }

    public boolean hasSubscriber(String str) {
        return this.f941c.m2815a(str);
    }

    public boolean respondsToTopic(String str) {
        return this.f939a.m4856u().m4710a(str);
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        subscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            if (this.f941c.m2814a(appLovinCommunicatorSubscriber, str)) {
                this.f942d.maybeSendStickyMessages(str);
            } else {
                m1756a("Unable to subscribe " + appLovinCommunicatorSubscriber + " to topic: " + str);
            }
        }
    }

    public String toString() {
        return "AppLovinCommunicator{sdk=" + this.f939a + AbstractJsonLexerKt.END_OBJ;
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        unsubscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            m1756a("Unsubscribing " + appLovinCommunicatorSubscriber + " from topic: " + str);
            this.f941c.m2816b(appLovinCommunicatorSubscriber, str);
        }
    }
}

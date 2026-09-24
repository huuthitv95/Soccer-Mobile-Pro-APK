package com.applovin.impl;

import android.content.Intent;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1768p;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.applovin.impl.i5 */
/* JADX INFO: loaded from: classes3.dex */
public class C1581i5 implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: b */
    private final String f1819b;

    /* JADX INFO: renamed from: c */
    private final WeakReference f1820c;

    /* JADX INFO: renamed from: a */
    private boolean f1818a = true;

    /* JADX INFO: renamed from: d */
    private final Set f1821d = new LinkedHashSet();

    /* JADX INFO: renamed from: e */
    private final Object f1822e = new Object();

    C1581i5(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        this.f1819b = str;
        this.f1820c = new WeakReference(appLovinCommunicatorSubscriber);
    }

    /* JADX INFO: renamed from: a */
    public AppLovinCommunicatorSubscriber m2879a() {
        return (AppLovinCommunicatorSubscriber) this.f1820c.get();
    }

    /* JADX INFO: renamed from: a */
    public void m2880a(boolean z) {
        this.f1818a = z;
    }

    /* JADX INFO: renamed from: b */
    public String m2881b() {
        return this.f1819b;
    }

    /* JADX INFO: renamed from: c */
    public boolean m2882c() {
        return this.f1818a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1581i5)) {
            return false;
        }
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f1820c.get();
        C1581i5 c1581i5 = (C1581i5) obj;
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber2 = (AppLovinCommunicatorSubscriber) c1581i5.f1820c.get();
        return m2881b().equals(c1581i5.m2881b()) && (appLovinCommunicatorSubscriber == null ? appLovinCommunicatorSubscriber == appLovinCommunicatorSubscriber2 : appLovinCommunicatorSubscriber.equals(appLovinCommunicatorSubscriber2));
    }

    public int hashCode() {
        int iHashCode = this.f1819b.hashCode();
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f1820c.get();
        return (iHashCode * 31) + (appLovinCommunicatorSubscriber != null ? appLovinCommunicatorSubscriber.hashCode() : 0);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        boolean z;
        if (m2879a() == null) {
            C1768p.m5167h("AppLovinCommunicator", "Message received for GC'd subscriber");
            return;
        }
        CommunicatorMessageImpl communicatorMessageImpl = (CommunicatorMessageImpl) intent;
        synchronized (this.f1822e) {
            if (this.f1821d.contains(communicatorMessageImpl.getUniqueId())) {
                z = false;
            } else {
                this.f1821d.add(communicatorMessageImpl.getUniqueId());
                z = true;
            }
        }
        if (z) {
            m2879a().onMessageReceived((AppLovinCommunicatorMessage) communicatorMessageImpl);
        }
    }
}

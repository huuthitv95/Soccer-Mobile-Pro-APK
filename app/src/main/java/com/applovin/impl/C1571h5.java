package com.applovin.impl;

import android.content.IntentFilter;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.applovin.impl.h5 */
/* JADX INFO: loaded from: classes3.dex */
public class C1571h5 {

    /* JADX INFO: renamed from: a */
    private final Set f1759a = new HashSet(32);

    /* JADX INFO: renamed from: b */
    private final Object f1760b = new Object();

    /* JADX INFO: renamed from: a */
    private C1581i5 m2813a(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        for (C1581i5 c1581i5 : this.f1759a) {
            if (str.equals(c1581i5.m2881b()) && appLovinCommunicatorSubscriber.equals(c1581i5.m2879a())) {
                return c1581i5;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m2814a(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        if (appLovinCommunicatorSubscriber == null || !StringUtils.isValidString(str)) {
            C1768p.m5167h("AppLovinCommunicator", "Unable to subscribe - invalid subscriber (" + appLovinCommunicatorSubscriber + ") or topic (" + str + ")");
            return false;
        }
        synchronized (this.f1760b) {
            C1581i5 c1581i5M2813a = m2813a(str, appLovinCommunicatorSubscriber);
            if (c1581i5M2813a == null) {
                C1581i5 c1581i5 = new C1581i5(str, appLovinCommunicatorSubscriber);
                this.f1759a.add(c1581i5);
                AppLovinBroadcastManager.registerReceiver(c1581i5, new IntentFilter(str));
                return true;
            }
            C1768p.m5167h("AppLovinCommunicator", "Attempting to re-subscribe subscriber (" + appLovinCommunicatorSubscriber + ") to topic (" + str + ")");
            if (!c1581i5M2813a.m2882c()) {
                c1581i5M2813a.m2880a(true);
                AppLovinBroadcastManager.registerReceiver(c1581i5M2813a, new IntentFilter(str));
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m2815a(String str) {
        synchronized (this.f1760b) {
            Iterator it = this.f1759a.iterator();
            while (it.hasNext()) {
                if (str.equals(((C1581i5) it.next()).m2881b())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2816b(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        C1581i5 c1581i5M2813a;
        if (StringUtils.isValidString(str)) {
            synchronized (this.f1760b) {
                c1581i5M2813a = m2813a(str, appLovinCommunicatorSubscriber);
            }
            if (c1581i5M2813a != null) {
                c1581i5M2813a.m2880a(false);
                AppLovinBroadcastManager.unregisterReceiver(c1581i5M2813a);
            }
        }
    }
}

package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.InterfaceC1783u1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.applovin.impl.sdk.a */
/* JADX INFO: loaded from: classes3.dex */
public class C1734a implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: e */
    private static final long f2884e = TimeUnit.SECONDS.toMillis(2);

    /* JADX INFO: renamed from: a */
    private final C1748l f2885a;

    /* JADX INFO: renamed from: b */
    private final C1768p f2886b;

    /* JADX INFO: renamed from: c */
    private final HashSet f2887c = new HashSet();

    /* JADX INFO: renamed from: d */
    private final Object f2888d = new Object();

    /* JADX INFO: renamed from: com.applovin.impl.sdk.a$a */
    public interface a {
        void onAdExpired(InterfaceC1783u1 interfaceC1783u1);
    }

    public C1734a(C1748l c1748l) {
        this.f2885a = c1748l;
        this.f2886b = c1748l.m4782Q();
    }

    /* JADX INFO: renamed from: a */
    private void m4426a() {
        synchronized (this.f2888d) {
            Iterator it = this.f2887c.iterator();
            while (it.hasNext()) {
                ((C1738b) it.next()).m4582a();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private C1738b m4427b(InterfaceC1783u1 interfaceC1783u1) {
        synchronized (this.f2888d) {
            try {
                if (interfaceC1783u1 == null) {
                    return null;
                }
                for (C1738b c1738b : this.f2887c) {
                    if (interfaceC1783u1 == c1738b.m4584b()) {
                        return c1738b;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m4428b() {
        HashSet<C1738b> hashSet = new HashSet();
        synchronized (this.f2888d) {
            for (C1738b c1738b : this.f2887c) {
                InterfaceC1783u1 interfaceC1783u1M4584b = c1738b.m4584b();
                if (interfaceC1783u1M4584b == null) {
                    hashSet.add(c1738b);
                } else {
                    long timeToLiveMillis = interfaceC1783u1M4584b.getTimeToLiveMillis();
                    if (timeToLiveMillis <= 0) {
                        if (C1768p.m5160a()) {
                            this.f2886b.m5171a("AdExpirationManager", "Ad expired while app was paused. Preparing to notify listener for ad: " + interfaceC1783u1M4584b);
                        }
                        hashSet.add(c1738b);
                    } else {
                        if (C1768p.m5160a()) {
                            this.f2886b.m5171a("AdExpirationManager", "Rescheduling expiration with remaining " + TimeUnit.MILLISECONDS.toSeconds(timeToLiveMillis) + " seconds for ad: " + interfaceC1783u1M4584b);
                        }
                        c1738b.m4583a(timeToLiveMillis);
                    }
                }
            }
        }
        for (C1738b c1738b2 : hashSet) {
            m4429a(c1738b2);
            c1738b2.m4585d();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4429a(C1738b c1738b) {
        synchronized (this.f2888d) {
            this.f2887c.remove(c1738b);
            if (this.f2887c.isEmpty()) {
                AppLovinBroadcastManager.unregisterReceiver(this);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4430a(InterfaceC1783u1 interfaceC1783u1) {
        synchronized (this.f2888d) {
            C1738b c1738bM4427b = m4427b(interfaceC1783u1);
            if (c1738bM4427b != null) {
                if (C1768p.m5160a()) {
                    this.f2886b.m5171a("AdExpirationManager", "Cancelling expiration timer for ad: " + interfaceC1783u1);
                }
                c1738bM4427b.m4582a();
                m4429a(c1738bM4427b);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m4431a(InterfaceC1783u1 interfaceC1783u1, a aVar) {
        synchronized (this.f2888d) {
            if (m4427b(interfaceC1783u1) != null) {
                if (C1768p.m5160a()) {
                    this.f2886b.m5171a("AdExpirationManager", "Ad expiration already scheduled for ad: " + interfaceC1783u1);
                }
                return true;
            }
            if (interfaceC1783u1.getTimeToLiveMillis() <= f2884e) {
                if (C1768p.m5160a()) {
                    this.f2886b.m5171a("AdExpirationManager", "Ad has already expired: " + interfaceC1783u1);
                }
                interfaceC1783u1.setExpired();
                return false;
            }
            if (C1768p.m5160a()) {
                this.f2886b.m5171a("AdExpirationManager", "Scheduling ad expiration " + TimeUnit.MILLISECONDS.toSeconds(interfaceC1783u1.getTimeToLiveMillis()) + " seconds from now for " + interfaceC1783u1 + "...");
            }
            if (this.f2887c.isEmpty()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
            this.f2887c.add(C1738b.m4580a(interfaceC1783u1, aVar, this.f2885a));
            return true;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            m4426a();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            m4428b();
        }
    }
}

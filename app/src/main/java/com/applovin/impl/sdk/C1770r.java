package com.applovin.impl.sdk;

import com.applovin.impl.sdk.p025ad.AppLovinAdImpl;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: renamed from: com.applovin.impl.sdk.r */
/* JADX INFO: loaded from: classes3.dex */
class C1770r {

    /* JADX INFO: renamed from: a */
    private final Queue f3262a = new LinkedList();

    /* JADX INFO: renamed from: b */
    private final Object f3263b = new Object();

    C1770r() {
    }

    /* JADX INFO: renamed from: a */
    AppLovinAdImpl m5189a() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f3263b) {
            appLovinAdImpl = !m5193c() ? (AppLovinAdImpl) this.f3262a.poll() : null;
        }
        return appLovinAdImpl;
    }

    /* JADX INFO: renamed from: a */
    void m5190a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f3263b) {
            if (m5191b() <= 25) {
                this.f3262a.offer(appLovinAdImpl);
            } else {
                C1768p.m5167h("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
            }
        }
    }

    /* JADX INFO: renamed from: b */
    int m5191b() {
        int size;
        synchronized (this.f3263b) {
            size = this.f3262a.size();
        }
        return size;
    }

    /* JADX INFO: renamed from: b */
    void m5192b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f3263b) {
            this.f3262a.remove(appLovinAdImpl);
        }
    }

    /* JADX INFO: renamed from: c */
    boolean m5193c() {
        boolean z;
        synchronized (this.f3263b) {
            z = m5191b() == 0;
        }
        return z;
    }

    /* JADX INFO: renamed from: d */
    AppLovinAdImpl m5194d() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f3263b) {
            appLovinAdImpl = (AppLovinAdImpl) this.f3262a.peek();
        }
        return appLovinAdImpl;
    }
}

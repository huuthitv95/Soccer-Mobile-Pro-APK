package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.applovin.impl.c0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractCallableC1516c0 implements Callable {

    /* JADX INFO: renamed from: a */
    protected final C1748l f1226a;

    /* JADX INFO: renamed from: b */
    protected final String f1227b;

    /* JADX INFO: renamed from: c */
    protected final C1768p f1228c;

    /* JADX INFO: renamed from: e */
    protected final AtomicBoolean f1230e = new AtomicBoolean();

    /* JADX INFO: renamed from: d */
    private final Context f1229d = C1748l.m4756p();

    public AbstractCallableC1516c0(String str, C1748l c1748l) {
        this.f1227b = str;
        this.f1226a = c1748l;
        this.f1228c = c1748l.m4782Q();
    }

    /* JADX INFO: renamed from: a */
    public Context m2147a() {
        return this.f1229d;
    }

    /* JADX INFO: renamed from: a */
    public void m2148a(boolean z) {
        this.f1230e.set(z);
    }
}

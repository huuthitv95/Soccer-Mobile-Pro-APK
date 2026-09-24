package com.chartboost.sdk.impl;

import java.util.function.Supplier;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.xg */
/* JADX INFO: loaded from: classes3.dex */
public class C4163xg implements InterfaceC4000q7 {

    /* JADX INFO: renamed from: a */
    public final Supplier f16946a;

    /* JADX INFO: renamed from: b */
    public volatile InterfaceC3888l7 f16947b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f16948c;

    /* JADX INFO: renamed from: d */
    public final Object f16949d = new Object();

    public C4163xg(Supplier supplier) {
        if (supplier == null) {
            throw new NullPointerException("Supplier must not be null");
        }
        this.f16946a = supplier;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4000q7
    /* JADX INFO: renamed from: a */
    public InterfaceC3888l7 mo19132a() {
        if (!this.f16948c) {
            synchronized (this.f16949d) {
                if (!this.f16948c) {
                    try {
                        this.f16947b = (InterfaceC3888l7) this.f16946a.get();
                        if (this.f16947b == null) {
                            C4048sb.m19410b("EventTracker supplier returned null", null);
                        }
                        this.f16948c = true;
                    } catch (Exception e) {
                        C4048sb.m19410b("Failed to obtain EventTracker from supplier", e);
                        return null;
                    }
                }
            }
        }
        return this.f16947b;
    }
}

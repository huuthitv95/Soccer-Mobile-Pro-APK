package com.applovin.impl;

import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.facebook.internal.AnalyticsEvents;

/* JADX INFO: renamed from: com.applovin.impl.r1 */
/* JADX INFO: loaded from: classes3.dex */
public class C1705r1 {

    /* JADX INFO: renamed from: a */
    private final long f2699a;

    /* JADX INFO: renamed from: b */
    private String f2700b;

    /* JADX INFO: renamed from: c */
    private AbstractC1482a3 f2701c;

    /* JADX INFO: renamed from: d */
    private AbstractC1736b f2702d;

    public C1705r1(Object obj, long j) {
        this.f2699a = j;
        if (obj instanceof AbstractC1736b) {
            AbstractC1736b abstractC1736b = (AbstractC1736b) obj;
            this.f2702d = abstractC1736b;
            this.f2700b = abstractC1736b.getAdZone().m5263d() != null ? this.f2702d.getAdZone().m5263d().getLabel() : null;
        } else if (obj instanceof AbstractC1482a3) {
            AbstractC1482a3 abstractC1482a3 = (AbstractC1482a3) obj;
            this.f2701c = abstractC1482a3;
            this.f2700b = abstractC1482a3.getFormat().getLabel();
        }
    }

    /* JADX INFO: renamed from: a */
    public Object m4157a() {
        AbstractC1736b abstractC1736b = this.f2702d;
        return abstractC1736b != null ? abstractC1736b : this.f2701c;
    }

    /* JADX INFO: renamed from: a */
    public void m4158a(Object obj) {
        if (obj instanceof AbstractC1736b) {
            this.f2702d = (AbstractC1736b) obj;
        } else if (obj instanceof AbstractC1482a3) {
            this.f2701c = (AbstractC1482a3) obj;
        }
    }

    /* JADX INFO: renamed from: b */
    public long m4159b() {
        return this.f2699a;
    }

    /* JADX INFO: renamed from: c */
    public AbstractC1736b m4160c() {
        return this.f2702d;
    }

    /* JADX INFO: renamed from: d */
    public String m4161d() {
        String str = this.f2700b;
        return str != null ? str : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    /* JADX INFO: renamed from: e */
    public AbstractC1482a3 m4162e() {
        return this.f2701c;
    }

    /* JADX INFO: renamed from: f */
    public String m4163f() {
        if (this.f2702d != null) {
            return "AppLovin";
        }
        AbstractC1482a3 abstractC1482a3 = this.f2701c;
        return abstractC1482a3 != null ? abstractC1482a3.getNetworkName() : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }
}

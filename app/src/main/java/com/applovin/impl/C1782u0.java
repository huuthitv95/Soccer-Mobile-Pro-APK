package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;

/* JADX INFO: renamed from: com.applovin.impl.u0 */
/* JADX INFO: loaded from: classes3.dex */
public class C1782u0 {

    /* JADX INFO: renamed from: a */
    private final StringBuilder f3398a = new StringBuilder();

    /* JADX INFO: renamed from: a */
    private String m5268a(C1800w0 c1800w0) {
        C1800w0.b bVarM5498d = c1800w0.m5498d();
        if (bVarM5498d == C1800w0.b.EVENT) {
            return ((C1827z0) c1800w0).m5732g();
        }
        return bVarM5498d == C1800w0.b.DECISION ? StringUtils.emptyIfNull(c1800w0.m5495b()) : StringUtils.emptyIfNull(c1800w0.m5499e());
    }

    /* JADX INFO: renamed from: a */
    private void m5269a(String str) {
        StringBuilder sb = this.f3398a;
        sb.append(str);
        sb.append("\n");
    }

    /* JADX INFO: renamed from: a */
    private void m5270a(String str, long j) {
        m5269a(str + " after " + j + "ms");
    }

    /* JADX INFO: renamed from: a */
    public void m5271a() {
        this.f3398a.setLength(0);
    }

    /* JADX INFO: renamed from: a */
    public void m5272a(C1800w0 c1800w0, long j) {
        if (c1800w0.m5498d() == C1800w0.b.DECISION) {
            return;
        }
        m5270a(m5268a(c1800w0), j);
    }

    /* JADX INFO: renamed from: a */
    public void m5273a(C1800w0 c1800w0, boolean z, long j) {
        m5270a(m5268a(c1800w0) + ": " + z, j);
    }

    /* JADX INFO: renamed from: b */
    public void m5274b() {
        m5269a("Invalid Activity");
    }

    /* JADX INFO: renamed from: b */
    public void m5275b(String str) {
        m5269a("Invalid state: " + str);
    }

    public String toString() {
        return this.f3398a.toString();
    }
}

package com.apm.insight.runtime.p023a;

import android.content.Context;
import com.apm.insight.C1373a;
import com.apm.insight.CrashType;
import com.apm.insight.entity.C1395a;
import com.apm.insight.entity.Header;

/* JADX INFO: renamed from: com.apm.insight.runtime.a.i */
/* JADX INFO: compiled from: EnsureAssembly.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1456i extends AbstractC1450c {
    C1456i(Context context, C1449b c1449b, C1451d c1451d) {
        super(CrashType.ENSURE, context, c1449b, c1451d);
    }

    @Override // com.apm.insight.runtime.p023a.AbstractC1450c
    /* JADX INFO: renamed from: a */
    public final C1395a mo1545a(C1395a c1395a) {
        C1395a c1395aMo1545a = super.mo1545a(c1395a);
        C1373a.m859a(c1395aMo1545a, (Header) null, this.f824a);
        return c1395aMo1545a;
    }

    @Override // com.apm.insight.runtime.p023a.AbstractC1450c
    /* JADX INFO: renamed from: b */
    protected final boolean mo1603b() {
        return false;
    }

    @Override // com.apm.insight.runtime.p023a.AbstractC1450c
    /* JADX INFO: renamed from: c */
    protected final boolean mo1604c() {
        return false;
    }
}

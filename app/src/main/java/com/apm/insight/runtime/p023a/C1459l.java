package com.apm.insight.runtime.p023a;

import android.content.Context;
import com.apm.insight.C1373a;
import com.apm.insight.CrashType;
import com.apm.insight.entity.C1395a;
import com.apm.insight.entity.Header;
import com.apm.insight.nativecrash.NativeCrashCollector;

/* JADX INFO: renamed from: com.apm.insight.runtime.a.l */
/* JADX INFO: compiled from: NativeCrashAssembly.java */
/* JADX INFO: loaded from: classes3.dex */
final class C1459l extends AbstractC1450c {
    C1459l(Context context, C1449b c1449b, C1451d c1451d) {
        super(CrashType.NATIVE, context, c1449b, c1451d);
    }

    @Override // com.apm.insight.runtime.p023a.AbstractC1450c
    /* JADX INFO: renamed from: a */
    public final int mo1600a() {
        return NativeCrashCollector.m1443a();
    }

    @Override // com.apm.insight.runtime.p023a.AbstractC1450c
    /* JADX INFO: renamed from: a */
    public final C1395a mo1601a(int i, C1395a c1395a) {
        C1395a c1395aMo1601a = super.mo1601a(i, c1395a);
        if (i == 0) {
            Header headerM1061a = Header.m1061a(this.f825b);
            headerM1061a.m1073c();
            c1395aMo1601a.m1089a(headerM1061a);
            C1373a.m859a(c1395aMo1601a, headerM1061a, this.f824a);
            return c1395aMo1601a;
        }
        if (i != 1) {
            if (i != 2) {
                return c1395aMo1601a;
            }
            Header.m1062a(c1395aMo1601a.m1104d());
            return c1395aMo1601a;
        }
        Header headerM1104d = c1395aMo1601a.m1104d();
        headerM1104d.m1074d();
        headerM1104d.m1075e();
        return c1395aMo1601a;
    }

    @Override // com.apm.insight.runtime.p023a.AbstractC1450c
    /* JADX INFO: renamed from: c */
    protected final boolean mo1604c() {
        return false;
    }
}

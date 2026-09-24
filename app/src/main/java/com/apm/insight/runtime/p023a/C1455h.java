package com.apm.insight.runtime.p023a;

import android.content.Context;
import com.apm.insight.C1373a;
import com.apm.insight.CrashType;
import com.apm.insight.entity.C1395a;
import com.apm.insight.entity.Header;

/* JADX INFO: renamed from: com.apm.insight.runtime.a.h */
/* JADX INFO: compiled from: DartCrashAssembly.java */
/* JADX INFO: loaded from: classes3.dex */
final class C1455h extends AbstractC1450c {
    C1455h(Context context, C1449b c1449b, C1451d c1451d) {
        super(CrashType.DART, context, c1449b, c1451d);
    }

    @Override // com.apm.insight.runtime.p023a.AbstractC1450c
    /* JADX INFO: renamed from: a */
    public final C1395a mo1545a(C1395a c1395a) {
        C1395a c1395aMo1545a = super.mo1545a(c1395a);
        Header headerM1061a = Header.m1061a(this.f825b);
        Header.m1062a(headerM1061a);
        Header.m1065b(headerM1061a);
        headerM1061a.m1073c();
        headerM1061a.m1074d();
        headerM1061a.m1075e();
        c1395aMo1545a.m1089a(headerM1061a);
        C1373a.m859a(c1395aMo1545a, headerM1061a, this.f824a);
        return c1395aMo1545a;
    }
}

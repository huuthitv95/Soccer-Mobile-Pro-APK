package com.apm.insight.runtime.p023a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.C1395a;
import com.apm.insight.entity.Header;

/* JADX INFO: renamed from: com.apm.insight.runtime.a.g */
/* JADX INFO: compiled from: CustomJavaCrashAssembly.java */
/* JADX INFO: loaded from: classes9.dex */
@Deprecated
final class C1454g extends AbstractC1450c {
    C1454g(Context context, C1449b c1449b, C1451d c1451d) {
        super(CrashType.CUSTOM_JAVA, context, c1449b, c1451d);
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
        return c1395aMo1545a;
    }
}

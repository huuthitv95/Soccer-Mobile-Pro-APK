package com.apm.insight.runtime.p023a;

import android.content.Context;
import com.apm.insight.C1373a;
import com.apm.insight.CrashType;
import com.apm.insight.entity.C1395a;
import com.apm.insight.entity.Header;

/* JADX INFO: renamed from: com.apm.insight.runtime.a.j */
/* JADX INFO: compiled from: JavaCrashAssembly.java */
/* JADX INFO: loaded from: classes3.dex */
final class C1457j extends AbstractC1450c {
    C1457j(Context context, C1449b c1449b, C1451d c1451d) {
        super(CrashType.JAVA, context, c1449b, c1451d);
    }

    @Override // com.apm.insight.runtime.p023a.AbstractC1450c
    /* JADX INFO: renamed from: a */
    public final C1395a mo1601a(int i, C1395a c1395a) {
        C1395a c1395aMo1601a = super.mo1601a(i, c1395a);
        if (i == 0) {
            c1395aMo1601a.m1095a("app_count", (Object) 1);
            c1395aMo1601a.m1095a("magic_tag", "ss_app_log");
            Header headerM1061a = Header.m1061a(this.f825b);
            headerM1061a.m1073c();
            c1395aMo1601a.m1089a(headerM1061a);
            C1373a.m859a(c1395aMo1601a, headerM1061a, this.f824a);
            return c1395aMo1601a;
        }
        if (i == 1) {
            Header headerM1104d = c1395aMo1601a.m1104d();
            headerM1104d.m1074d();
            headerM1104d.m1075e();
            return c1395aMo1601a;
        }
        if (i == 2) {
            Header.m1062a(c1395aMo1601a.m1104d());
            return c1395aMo1601a;
        }
        if (i != 5) {
            return c1395aMo1601a;
        }
        Header.m1065b(c1395aMo1601a.m1104d());
        return c1395aMo1601a;
    }
}

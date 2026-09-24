package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.express.operator.parts.C12746a;
import com.mbridge.msdk.config.component.common.express.operator.parts.C12748c;
import com.mbridge.msdk.config.component.common.util.C12770c;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.express.operator.k */
/* JADX INFO: compiled from: OperatorLogical.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12740k {

    /* JADX INFO: renamed from: a */
    private final C12748c f33900a;

    public C12740k(C12748c c12748c) {
        this.f33900a = c12748c;
    }

    /* JADX INFO: renamed from: a */
    public C12746a m34973a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str) || !(str.contains(C12770c.m35209b("882")) || str.contains(C12770c.m35209b("883")))) {
            return C12746a.m35017c();
        }
        boolean z = false;
        boolean zM34972a = (list == null || list.isEmpty()) ? false : m34972a(list.get(0));
        boolean zM34972a2 = m34972a(obj);
        if (!str.equals(C12770c.m35209b("882"))) {
            if (str.equals(C12770c.m35209b("883"))) {
                return C12746a.m35016a(Boolean.valueOf(zM34972a2 || zM34972a));
            }
            return C12746a.m35017c();
        }
        if (zM34972a2 && zM34972a) {
            z = true;
        }
        return C12746a.m35016a(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: a */
    private boolean m34972a(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (!(obj instanceof String)) {
            return (obj instanceof Number) && ((Number) obj).intValue() == 1;
        }
        String str = (String) obj;
        return "1".equals(str) || "true".equalsIgnoreCase(str);
    }
}

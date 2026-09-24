package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.express.C12717d;
import com.mbridge.msdk.config.component.common.express.operator.parts.C12746a;
import com.mbridge.msdk.config.component.common.express.operator.parts.C12748c;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.express.operator.n */
/* JADX INFO: compiled from: OperatorObject.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12743n {

    /* JADX INFO: renamed from: a */
    private final C12748c f33904a;

    public C12743n(C12748c c12748c) {
        this.f33904a = c12748c;
    }

    /* JADX INFO: renamed from: a */
    private C12746a m34997a(String str, Object obj, List<Object> list, C12894a c12894a) {
        try {
            if (str.equals(C12770c.m35209b("880"))) {
                return m34995a(obj, list);
            }
            return str.equals(C12770c.m35209b("881")) ? m34996a(obj, list, c12894a) : C12746a.m35016a(null);
        } catch (Exception e) {
            C13219q0.m37817b("OperatorObject", "Error handling object operation: " + str + ", " + e.getMessage(), e);
            return C12746a.m35016a(null);
        }
    }

    /* JADX INFO: renamed from: b */
    public C12746a m34998b(String str, Object obj, List<Object> list, C12894a c12894a) {
        if (TextUtils.isEmpty(str)) {
            return C12746a.m35017c();
        }
        return (str.equals(C12770c.m35209b("880")) || str.equals(C12770c.m35209b("881"))) ? m34997a(str, obj, list, c12894a) : C12746a.m35017c();
    }

    /* JADX INFO: renamed from: a */
    private C12746a m34995a(Object obj, List<Object> list) {
        if (obj == null) {
            return C12746a.m35016a(0);
        }
        return C12746a.m35016a(1);
    }

    /* JADX INFO: renamed from: a */
    private synchronized C12746a m34996a(Object obj, List<Object> list, C12894a c12894a) {
        String strSubstring;
        if (list != null) {
            if (list.size() == 3) {
                try {
                    boolean z = ((Integer) list.get(0)).intValue() == 1;
                    if (z) {
                        strSubstring = (String) list.get(1);
                    } else {
                        strSubstring = (String) list.get(2);
                    }
                    if (strSubstring.startsWith("\"") && strSubstring.endsWith("\"") && strSubstring.replace("\\\"", "").split("\"").length == 2) {
                        strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                    }
                    if (!TextUtils.isEmpty(strSubstring)) {
                        new C12717d().m34892a(strSubstring, c12894a);
                    }
                    return C12746a.m35016a(Boolean.valueOf(z));
                } catch (Exception e) {
                    C13219q0.m37813a("OperatorObject", e.getMessage());
                    return C12746a.m35016a(Boolean.FALSE);
                }
            }
        }
        return C12746a.m35016a(Boolean.FALSE);
    }
}

package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.ironsource.C11744X3;
import com.mbridge.msdk.config.component.common.express.operator.parts.C12746a;
import com.mbridge.msdk.config.component.common.express.operator.parts.C12748c;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.express.operator.o */
/* JADX INFO: compiled from: OperatorSQL.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12744o {

    /* JADX INFO: renamed from: a */
    private final C12748c f33905a;

    public C12744o(C12748c c12748c) {
        this.f33905a = c12748c;
    }

    /* JADX INFO: renamed from: a */
    private Object m35000a(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return C12746a.m35016a(null);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(obj));
        sb.append(" and (");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                sb.append(" ");
                sb.append(String.valueOf(list.get(i)));
                if (i < list.size() - 1) {
                    sb.append(",");
                }
            }
        }
        sb.append(" )");
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    private Object m35002b() {
        return C12746a.m35016a(new String());
    }

    /* JADX INFO: renamed from: c */
    private Object m35005c(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return C12746a.m35016a(null);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(obj));
        sb.append(" group by");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                sb.append(" ");
                sb.append(String.valueOf(list.get(i)));
                if (i < list.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0030 A[PHI: r2
  0x0030: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v12 java.lang.String) binds: [B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: d */
    private Object m35006d(String str, Object obj, List<Object> list) {
        Map map;
        if (obj == null || list == null) {
            return C12746a.m35016a(null);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(obj));
        String strValueOf = "";
        if (list.size() != 2) {
            map = null;
        } else {
            Object obj2 = list.get(0);
            strValueOf = obj2 != null ? String.valueOf(obj2) : "";
            Object obj3 = list.get(1);
            if (obj3 instanceof Map) {
                map = (Map) obj3;
            } else {
                map = null;
            }
        }
        if (TextUtils.isEmpty(strValueOf) || map == null) {
            return C12746a.m35016a(null);
        }
        sb.append(" insert into " + strValueOf);
        StringBuilder sb2 = new StringBuilder(" (");
        StringBuilder sb3 = new StringBuilder(" VALUES (");
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            Object obj4 = map.get(str2);
            sb2.append(str2);
            if (obj4 == null) {
                sb3.append("NULL");
            } else if (obj4 instanceof Number) {
                sb3.append(obj4);
            } else {
                sb3.append("'");
                sb3.append(m35001a(obj4.toString()));
                sb3.append("'");
            }
            if (it.hasNext()) {
                sb2.append(",");
                sb3.append(",");
            } else {
                sb2.append(" )");
                sb3.append(" )");
            }
        }
        sb.append(sb2.toString());
        sb.append(sb3.toString());
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    private Object m35007e(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return C12746a.m35016a(null);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(obj));
        sb.append(" limit");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                sb.append(" ");
                sb.append(String.valueOf(list.get(i)));
                if (i < list.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    private Object m35008f(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return C12746a.m35016a(null);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(obj));
        sb.append(" or (");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                sb.append(" ");
                sb.append(String.valueOf(list.get(i)));
                if (i < list.size() - 1) {
                    sb.append(",");
                }
            }
        }
        sb.append(" )");
        return sb.toString();
    }

    /* JADX INFO: renamed from: g */
    private Object m35009g(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return C12746a.m35016a(null);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(obj));
        sb.append(" order by");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                sb.append(" ");
                sb.append(String.valueOf(list.get(i)));
                if (i < list.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    private C12746a m35010h(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return C12746a.m35017c();
        }
        try {
            if (str.equals(C12770c.m35209b("829"))) {
                return C12746a.m35016a(m35002b());
            }
            if (str.equals(C12770c.m35209b("830"))) {
                return C12746a.m35016a(m35011j(str, obj, list));
            }
            if (str.equals(C12770c.m35209b("831"))) {
                return C12746a.m35016a(m35003b(str, obj, list));
            }
            if (str.equals(C12770c.m35209b("832"))) {
                return C12746a.m35016a(m35013l(str, obj, list));
            }
            if (str.equals(C12770c.m35209b("833"))) {
                return C12746a.m35016a(m35000a(str, obj, list));
            }
            if (str.equals(C12770c.m35209b("834"))) {
                return C12746a.m35016a(m35008f(str, obj, list));
            }
            if (str.equals(C12770c.m35209b("835"))) {
                return C12746a.m35016a(m35009g(str, obj, list));
            }
            if (str.equals(C12770c.m35209b("836"))) {
                return C12746a.m35016a(m35005c(str, obj, list));
            }
            if (str.equals(C12770c.m35209b("837"))) {
                return C12746a.m35016a(m34999a());
            }
            if (str.equals(C12770c.m35209b("838"))) {
                return C12746a.m35016a(m35012k(str, obj, list));
            }
            if (str.equals(C12770c.m35209b("839"))) {
                return C12746a.m35016a(m35006d(str, obj, list));
            }
            return str.equals(C12770c.m35209b("840")) ? C12746a.m35016a(m35007e(str, obj, list)) : C12746a.m35016a(null);
        } catch (Exception e) {
            C13219q0.m37817b("SQLOperator", e.getMessage(), e);
            return C12746a.m35016a(null);
        }
    }

    /* JADX INFO: renamed from: j */
    private Object m35011j(String str, Object obj, List<Object> list) {
        if (list == null) {
            return C12746a.m35016a(null);
        }
        StringBuilder sb = new StringBuilder("select");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                sb.append(" ");
                sb.append(String.valueOf(list.get(i)));
                if (i < list.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0030 A[PHI: r2
  0x0030: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v3 java.lang.String) binds: [B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k */
    private Object m35012k(String str, Object obj, List<Object> list) {
        Map map;
        if (obj == null || list == null) {
            return C12746a.m35016a(null);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(obj));
        String strValueOf = "";
        if (list.size() != 2) {
            map = null;
        } else {
            Object obj2 = list.get(0);
            strValueOf = obj2 != null ? String.valueOf(obj2) : "";
            Object obj3 = list.get(1);
            if (obj3 instanceof Map) {
                map = (Map) obj3;
            } else {
                map = null;
            }
        }
        if (TextUtils.isEmpty(strValueOf) || map == null) {
            return C12746a.m35016a(null);
        }
        sb.append("update ");
        sb.append(strValueOf);
        sb.append(" set");
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            sb.append(" ");
            sb.append(str2);
            sb.append(C11744X3.j.f26434b);
            sb.append(map.get(str2));
            if (it.hasNext()) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: l */
    private Object m35013l(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return C12746a.m35016a(null);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(obj));
        sb.append(" where");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                sb.append(" ");
                sb.append(String.valueOf(list.get(i)));
                if (i < list.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public C12746a m35014i(String str, Object obj, List<Object> list) {
        return m35004b(str) ? m35010h(str, obj, list) : C12746a.m35017c();
    }

    /* JADX INFO: renamed from: b */
    private Object m35003b(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return C12746a.m35016a(null);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(obj));
        sb.append(" from");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                sb.append(" ");
                sb.append(String.valueOf(list.get(i)));
                if (i < list.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    private Object m34999a() {
        return new StringBuilder(" delete ");
    }

    /* JADX INFO: renamed from: b */
    private boolean m35004b(String str) {
        return str.equals(C12770c.m35209b("829")) || str.equals(C12770c.m35209b("830")) || str.equals(C12770c.m35209b("831")) || str.equals(C12770c.m35209b("832")) || str.equals(C12770c.m35209b("833")) || str.equals(C12770c.m35209b("834")) || str.equals(C12770c.m35209b("835")) || str.equals(C12770c.m35209b("836")) || str.equals(C12770c.m35209b("837")) || str.equals(C12770c.m35209b("838")) || str.equals(C12770c.m35209b("839")) || str.equals(C12770c.m35209b("840"));
    }

    /* JADX INFO: renamed from: a */
    private String m35001a(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("'", "''");
    }
}

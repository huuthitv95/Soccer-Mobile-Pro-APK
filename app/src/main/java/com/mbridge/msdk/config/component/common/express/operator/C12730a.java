package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.express.operator.parts.C12746a;
import com.mbridge.msdk.config.component.common.express.operator.parts.C12748c;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.express.operator.a */
/* JADX INFO: compiled from: OperatorArray.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12730a {

    /* JADX INFO: renamed from: a */
    private final C12748c f33882a;

    public C12730a(C12748c c12748c) {
        this.f33882a = c12748c;
    }

    /* JADX INFO: renamed from: b */
    private C12746a m34903b(String str, Object obj, List<Object> list) {
        List<Object> arrayList;
        if (obj instanceof List) {
            arrayList = (List) obj;
        } else {
            arrayList = (obj == null || !obj.getClass().isArray()) ? null : new ArrayList(Arrays.asList(obj));
        }
        Object obj2 = (list == null || list.isEmpty()) ? null : list.get(0);
        try {
            if (str.equals(C12770c.m35209b("860"))) {
                return m34899a();
            }
            if (str.equals(C12770c.m35209b("861"))) {
                return m34905b(arrayList, obj2);
            }
            if (str.equals(C12770c.m35209b("862"))) {
                return m34901a(arrayList, obj2);
            }
            if (str.equals(C12770c.m35209b("863"))) {
                return m34906c(arrayList, obj2);
            }
            if (str.equals(C12770c.m35209b("864"))) {
                return m34904b(arrayList);
            }
            if (str.equals(C12770c.m35209b("865"))) {
                return m34900a(arrayList);
            }
            if (str.equals(C12770c.m35209b("866"))) {
                return m34907d(arrayList, obj2);
            }
            if (str.equals(C12770c.m35209b("867"))) {
                return m34910g(arrayList, obj2);
            }
            if (str.equals(C12770c.m35209b("868"))) {
                return m34908e(arrayList, obj2);
            }
            return str.equals(C12770c.m35209b("869")) ? m34909f(arrayList, obj2) : C12746a.m35017c();
        } catch (Exception e) {
            C13219q0.m37817b("ArrayOperator", "Error handling array operation: " + str + ", " + e.getMessage(), e);
            return C12746a.m35016a(null);
        }
    }

    /* JADX INFO: renamed from: c */
    private C12746a m34906c(List<Object> list, Object obj) {
        if (list == null) {
            return C12746a.m35016a(null);
        }
        if (!(obj instanceof List)) {
            if (list.contains(obj)) {
                list.remove(obj);
            } else if (obj instanceof Integer) {
                int iIntValue = ((Integer) obj).intValue();
                int size = list.size();
                if (iIntValue >= 0 && iIntValue <= size - 1) {
                    list.remove(iIntValue);
                }
            }
            return C12746a.m35016a(list);
        }
        for (Object obj2 : (List) obj) {
            if (list.contains(obj2)) {
                list.remove(obj2);
            } else if (obj2 instanceof Integer) {
                int iIntValue2 = ((Integer) obj2).intValue();
                int size2 = list.size();
                if (iIntValue2 >= 0 && iIntValue2 <= size2 - 1) {
                    list.remove(iIntValue2);
                }
            }
        }
        return C12746a.m35016a(list);
    }

    /* JADX INFO: renamed from: d */
    private C12746a m34907d(List<Object> list, Object obj) {
        boolean z;
        if (list == null || obj == null) {
            return C12746a.m35016a(Boolean.FALSE);
        }
        if (!(obj instanceof List)) {
            return list.contains(obj) ? C12746a.m35016a(Boolean.TRUE) : C12746a.m35016a(Boolean.FALSE);
        }
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            if (!list.contains(it.next())) {
                z = false;
                return C12746a.m35016a(Boolean.valueOf(z));
            }
        }
        z = true;
        return C12746a.m35016a(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: e */
    private C12746a m34908e(List<Object> list, Object obj) {
        int iIntValue = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
        if (obj instanceof String) {
            iIntValue = Integer.parseInt((String) obj);
        }
        return (iIntValue < 0 || iIntValue > list.size() + (-1)) ? C12746a.m35016a(null) : C12746a.m35016a(list.subList(0, iIntValue));
    }

    /* JADX INFO: renamed from: f */
    private C12746a m34909f(List<Object> list, Object obj) {
        int iIntValue = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
        if (obj instanceof String) {
            iIntValue = Integer.parseInt((String) obj);
        }
        return (iIntValue < 0 || iIntValue > list.size() + (-1)) ? C12746a.m35016a(null) : C12746a.m35016a(list.subList(list.size() - iIntValue, list.size()));
    }

    /* JADX INFO: renamed from: g */
    private C12746a m34910g(List<Object> list, Object obj) {
        if (list == null) {
            return C12746a.m35016a("");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            Object obj2 = list.get(i);
            if (obj2 instanceof String) {
                sb.append(obj2);
            } else if (obj2 != null) {
                sb.append(obj2.toString());
            }
            if (i < list.size() - 1 && obj != null) {
                sb.append(obj);
            }
        }
        return C12746a.m35016a(sb.toString());
    }

    /* JADX INFO: renamed from: a */
    public C12746a m34911a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return C12746a.m35017c();
        }
        return m34902a(str) ? m34903b(str, obj, list) : C12746a.m35017c();
    }

    /* JADX INFO: renamed from: a */
    private C12746a m34899a() {
        return C12746a.m35016a(new ArrayList());
    }

    /* JADX INFO: renamed from: a */
    private C12746a m34901a(List<Object> list, Object obj) {
        if (list == null) {
            if (obj == null) {
                return C12746a.m35016a(null);
            }
            list = new ArrayList<>();
        }
        if (obj instanceof List) {
            list.addAll((List) obj);
            return C12746a.m35016a(list);
        }
        C13219q0.m37813a("ArrayOperator", "ArrayAddFromArray rightObj is not List");
        return C12746a.m35016a(list);
    }

    /* JADX INFO: renamed from: a */
    private C12746a m34900a(List<Object> list) {
        if (list == null) {
            return C12746a.m35016a(0);
        }
        return C12746a.m35016a(Integer.valueOf(list.size()));
    }

    /* JADX INFO: renamed from: a */
    private boolean m34902a(String str) {
        return str.equals(C12770c.m35209b("860")) || str.equals(C12770c.m35209b("861")) || str.equals(C12770c.m35209b("862")) || str.equals(C12770c.m35209b("863")) || str.equals(C12770c.m35209b("864")) || str.equals(C12770c.m35209b("865")) || str.equals(C12770c.m35209b("866")) || str.equals(C12770c.m35209b("867")) || str.equals(C12770c.m35209b("868")) || str.equals(C12770c.m35209b("869"));
    }

    /* JADX INFO: renamed from: b */
    private C12746a m34905b(List<Object> list, Object obj) {
        if (list == null) {
            if (obj == null) {
                return C12746a.m35016a(null);
            }
            list = new ArrayList<>();
        }
        list.add(obj);
        return C12746a.m35016a(list);
    }

    /* JADX INFO: renamed from: b */
    private C12746a m34904b(List<Object> list) {
        if (list != null) {
            list.clear();
        }
        return C12746a.m35016a(list);
    }
}

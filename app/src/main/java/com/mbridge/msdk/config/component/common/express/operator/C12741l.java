package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.ironsource.C11744X3;
import com.mbridge.msdk.config.component.common.express.operator.parts.C12746a;
import com.mbridge.msdk.config.component.common.express.operator.parts.C12748c;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;
import com.mbridge.msdk.config.dynamic.utils.C12903e;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.express.operator.l */
/* JADX INFO: compiled from: OperatorMap.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12741l {

    /* JADX INFO: renamed from: a */
    private final C12748c f33901a;

    public C12741l(C12748c c12748c) {
        this.f33901a = c12748c;
    }

    /* JADX INFO: renamed from: a */
    private C12746a m34977a(String str, Object obj, List<Object> list) {
        try {
            if (str.equals(C12770c.m35209b("849"))) {
                return m34974a();
            }
            if (str.equals(C12770c.m35209b("850"))) {
                return m34984d(obj, list);
            }
            if (str.equals(C12770c.m35209b("851"))) {
                return m34987f(obj, list);
            }
            if (str.equals(C12770c.m35209b("852"))) {
                return m34982c(obj, list);
            }
            if (str.equals(C12770c.m35209b("853"))) {
                return m34976a(obj, list);
            }
            if (str.equals(C12770c.m35209b("854"))) {
                return m34986e(obj, list);
            }
            if (str.equals(C12770c.m35209b("855"))) {
                return m34985e(obj);
            }
            if (str.equals(C12770c.m35209b("856"))) {
                return m34983d(obj);
            }
            if (str.equals(C12770c.m35209b("857"))) {
                return m34988g(obj, list);
            }
            if (str.equals(C12770c.m35209b("858"))) {
                return m34975a(obj);
            }
            if (str.equals(C12770c.m35209b("859"))) {
                return m34980b(obj, list);
            }
            if (str.equals(C12770c.m35209b("897"))) {
                return m34979b(obj);
            }
            return str.equals(C12770c.m35209b("898")) ? m34981c(obj) : C12746a.m35016a(null);
        } catch (Exception e) {
            C13219q0.m37817b("MapOperator", "Error handling map operation: " + str + ", " + e.getMessage(), e);
            return C12746a.m35016a(null);
        }
    }

    /* JADX INFO: renamed from: f */
    private C12746a m34987f(Object obj, List<Object> list) {
        if (list != null && list.size() == 2) {
            String strValueOf = String.valueOf(list.get(0));
            Object obj2 = list.get(1);
            if (!TextUtils.isEmpty(strValueOf)) {
                if (obj instanceof C12894a) {
                    C12894a c12894a = (C12894a) obj;
                    c12894a.m36045a(strValueOf.trim(), obj2);
                    return C12746a.m35016a(c12894a);
                }
                if (obj instanceof Map) {
                    Map map = (Map) obj;
                    map.put(strValueOf.trim(), obj2);
                    return C12746a.m35016a(map);
                }
            }
        }
        return C12746a.m35016a(null);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    /* JADX INFO: renamed from: g */
    private C12746a m34988g(Object obj, List<Object> list) {
        Map map;
        String str;
        boolean z = obj instanceof C12894a;
        if (!z && !(obj instanceof Map)) {
            return C12746a.m35016a(null);
        }
        if (z) {
            map = new HashMap();
            for (Map.Entry<String, Object> entry : ((C12894a) obj).m36047a()) {
                map.put(entry.getKey(), entry.getValue());
            }
        } else {
            map = (Map) obj;
        }
        if (list != null && !list.isEmpty()) {
            str = "or".equals(String.valueOf(list.get(0)).trim().toLowerCase()) ? "or" : "and";
        }
        StringBuilder sb = new StringBuilder();
        boolean z2 = true;
        for (Map.Entry entry2 : map.entrySet()) {
            if (!z2) {
                sb.append(" ");
                sb.append(str);
                sb.append(" ");
            }
            sb.append((String) entry2.getKey());
            sb.append(C11744X3.j.f26434b);
            sb.append(entry2.getValue());
            z2 = false;
        }
        return C12746a.m35016a(sb.toString());
    }

    /* JADX INFO: renamed from: b */
    public C12746a m34989b(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return C12746a.m35017c();
        }
        return m34978a(str) ? m34977a(str, obj, list) : C12746a.m35017c();
    }

    /* JADX INFO: renamed from: c */
    private C12746a m34982c(Object obj, List<Object> list) {
        String strValueOf = (list == null || list.isEmpty()) ? "" : String.valueOf(list.get(0));
        if (!TextUtils.isEmpty(strValueOf)) {
            if (obj instanceof C12894a) {
                return C12746a.m35016a(((C12894a) obj).m36051b(strValueOf));
            }
            if (obj instanceof Map) {
                return C12746a.m35016a(((Map) obj).get(strValueOf));
            }
        }
        return C12746a.m35016a(null);
    }

    /* JADX INFO: renamed from: d */
    private C12746a m34984d(Object obj, List<Object> list) {
        Map<String, Object> mapM36163a;
        String strValueOf = (list == null || list.isEmpty()) ? "" : String.valueOf(list.get(0));
        if (!TextUtils.isEmpty(strValueOf)) {
            try {
                mapM36163a = new C12903e().m36163a(new JSONObject(strValueOf));
            } catch (JSONException e) {
                C13219q0.m37816b("MapOperator", e.getMessage());
                mapM36163a = null;
            }
            if (mapM36163a != null) {
                return C12746a.m35016a(mapM36163a);
            }
        }
        return C12746a.m35016a(null);
    }

    /* JADX INFO: renamed from: e */
    private C12746a m34986e(Object obj, List<Object> list) {
        String strValueOf = (list == null || list.isEmpty()) ? "" : String.valueOf(list.get(0));
        if (!TextUtils.isEmpty(strValueOf)) {
            if (obj instanceof C12894a) {
                C12894a c12894a = (C12894a) obj;
                c12894a.m36055c(strValueOf);
                return C12746a.m35016a(c12894a);
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                map.remove(strValueOf);
                return C12746a.m35016a(map);
            }
        }
        return C12746a.m35016a(null);
    }

    /* JADX INFO: renamed from: b */
    private C12746a m34980b(Object obj, List<Object> list) {
        String strValueOf;
        if (list != null && !list.isEmpty()) {
            strValueOf = String.valueOf(list.get(0));
        } else {
            strValueOf = "";
        }
        if (!TextUtils.isEmpty(strValueOf)) {
            if (obj instanceof C12894a) {
                return C12746a.m35016a(Boolean.valueOf(((C12894a) obj).m36050a((Object) strValueOf)));
            }
            if (obj instanceof Map) {
                return C12746a.m35016a(Boolean.valueOf(((Map) obj).containsKey(strValueOf)));
            }
        }
        return C12746a.m35016a(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: c */
    private C12746a m34981c(Object obj) {
        ArrayList arrayList = new ArrayList();
        if (obj instanceof C12894a) {
            Collection<Object> collectionM36060g = ((C12894a) obj).m36060g();
            if (!collectionM36060g.isEmpty()) {
                arrayList.addAll(collectionM36060g);
            }
        }
        if (obj instanceof Map) {
            Collection collectionValues = ((Map) obj).values();
            if (!collectionValues.isEmpty()) {
                arrayList.addAll(collectionValues);
            }
        }
        return C12746a.m35016a(arrayList);
    }

    /* JADX INFO: renamed from: d */
    private C12746a m34983d(Object obj) {
        Map map;
        boolean z = obj instanceof C12894a;
        if (!z && !(obj instanceof Map)) {
            return C12746a.m35016a(null);
        }
        if (z) {
            map = new HashMap();
            for (Map.Entry<String, Object> entry : ((C12894a) obj).m36047a()) {
                map.put(entry.getKey(), entry.getValue());
            }
        } else {
            map = (Map) obj;
        }
        return C12746a.m35016a(new JSONObject(map).toString());
    }

    /* JADX INFO: renamed from: e */
    private C12746a m34985e(Object obj) {
        Map map;
        boolean z = obj instanceof C12894a;
        if (!z && !(obj instanceof Map)) {
            return C12746a.m35016a(null);
        }
        if (z) {
            map = new HashMap();
            for (Map.Entry<String, Object> entry : ((C12894a) obj).m36047a()) {
                map.put(entry.getKey(), entry.getValue());
            }
        } else {
            map = (Map) obj;
        }
        try {
            StringBuilder sb = new StringBuilder();
            boolean z2 = true;
            for (Map.Entry entry2 : map.entrySet()) {
                if (!z2) {
                    sb.append(C11744X3.j.f26436c);
                }
                sb.append(URLEncoder.encode((String) entry2.getKey(), "UTF-8"));
                sb.append(C11744X3.j.f26434b);
                sb.append(URLEncoder.encode(String.valueOf(entry2.getValue()), "UTF-8"));
                z2 = false;
            }
            return C12746a.m35016a(sb.toString());
        } catch (Throwable th) {
            C13219q0.m37817b("MapOperator", "Error encoding URL parameters: " + th.getMessage(), th);
            return C12746a.m35016a(null);
        }
    }

    /* JADX INFO: renamed from: b */
    private C12746a m34979b(Object obj) {
        ArrayList arrayList = new ArrayList();
        if (obj instanceof C12894a) {
            Set<String> setM36058e = ((C12894a) obj).m36058e();
            if (!setM36058e.isEmpty()) {
                arrayList.addAll(setM36058e);
            }
        }
        if (obj instanceof Map) {
            Set setKeySet = ((Map) obj).keySet();
            if (!setKeySet.isEmpty()) {
                arrayList.addAll(setKeySet);
            }
        }
        return C12746a.m35016a(arrayList);
    }

    /* JADX INFO: renamed from: a */
    private C12746a m34974a() {
        return C12746a.m35016a(new HashMap());
    }

    /* JADX INFO: renamed from: a */
    private C12746a m34976a(Object obj, List<Object> list) {
        Object obj2 = (list == null || list.isEmpty()) ? null : list.get(0);
        if (obj2 instanceof Map) {
            Map<? extends String, ?> map = (Map) obj2;
            if (obj instanceof C12894a) {
                ((C12894a) obj).m36049a(map);
            } else if (obj instanceof Map) {
                ((Map) obj).putAll(map);
            }
        }
        return C12746a.m35016a(obj);
    }

    /* JADX INFO: renamed from: a */
    private C12746a m34975a(Object obj) {
        if (obj instanceof C12894a) {
            return C12746a.m35016a(Integer.valueOf(((C12894a) obj).m36059f()));
        }
        if (obj instanceof Map) {
            return C12746a.m35016a(Integer.valueOf(((Map) obj).size()));
        }
        return C12746a.m35016a(0);
    }

    /* JADX INFO: renamed from: a */
    private boolean m34978a(String str) {
        return str.equals(C12770c.m35209b("849")) || str.equals(C12770c.m35209b("850")) || str.equals(C12770c.m35209b("851")) || str.equals(C12770c.m35209b("852")) || str.equals(C12770c.m35209b("853")) || str.equals(C12770c.m35209b("854")) || str.equals(C12770c.m35209b("855")) || str.equals(C12770c.m35209b("856")) || str.equals(C12770c.m35209b("857")) || str.equals(C12770c.m35209b("858")) || str.equals(C12770c.m35209b("859")) || str.equals(C12770c.m35209b("897")) || str.equals(C12770c.m35209b("898"));
    }
}

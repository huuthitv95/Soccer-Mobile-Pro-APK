package com.mbridge.msdk.config.component.common.express;

import android.text.TextUtils;
import com.ironsource.C11744X3;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.express.c */
/* JADX INFO: compiled from: ExpressionExecutor.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12716c {
    /* JADX INFO: renamed from: a */
    public static Object m34889a(String str, C12894a c12894a) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("$") && !str.startsWith(C11744X3.j.f26438d)) {
            return str;
        }
        if (!str.startsWith(C11744X3.j.f26438d)) {
            if (str.startsWith("$")) {
                return m34887a(c12894a, str);
            }
            return null;
        }
        String strReplaceAll = str.replaceAll("[\\[\\]]", "");
        if (strReplaceAll.split(",").length == 0) {
            return null;
        }
        return m34887a(c12894a, strReplaceAll);
    }

    /* JADX INFO: renamed from: a */
    private static Object m34887a(C12894a c12894a, String... strArr) {
        Object obj;
        Object objM34888a;
        if (strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            String[] strArrSplit = str.replace("$", "").split("\\.");
            if (strArrSplit.length != 0) {
                if (c12894a.m36050a((Object) strArrSplit[0])) {
                    obj = c12894a;
                } else {
                    HashMap map = new HashMap();
                    map.put(strArrSplit[0], c12894a);
                    obj = map;
                }
                int length = strArrSplit.length;
                int i = 0;
                Object obj2 = obj;
                while (i < length) {
                    String str2 = strArrSplit[i];
                    if (obj2 instanceof C12894a) {
                        objM34888a = m34886a((C12894a) obj2, str2);
                    } else {
                        objM34888a = m34888a(obj2, str2);
                    }
                    i++;
                    obj2 = objM34888a;
                }
                if (strArr.length == 1) {
                    return obj2;
                }
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private static Object m34886a(C12894a c12894a, String str) {
        try {
            if (c12894a.m36050a((Object) str)) {
                return c12894a.m36051b(str);
            }
            return null;
        } catch (Exception e) {
            C13219q0.m37817b("ExpressionExecutor", e.getMessage(), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static Object m34888a(Object obj, String str) {
        try {
            if (obj instanceof Map) {
                return ((Map) obj).get(str);
            }
            if (obj == null) {
                return null;
            }
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (Exception e) {
            C13219q0.m37817b("ExpressionExecutor", e.getMessage(), e);
            return null;
        }
    }
}

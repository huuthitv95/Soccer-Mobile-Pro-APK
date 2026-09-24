package com.ironsource.adqualitysdk.sdk.p286i;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cs */
/* JADX INFO: loaded from: classes6.dex */
public final class C11881cs extends C11886cx {
    /* JADX INFO: renamed from: ﻐ */
    public static Field m29787(List<Object> list) {
        return C12019hv.m30362().m30364().m30310((Class) m29851(list, 0, Class.class), (C12010hm) m29851(list, 1, C12010hm.class));
    }

    /* JADX INFO: renamed from: ﻛ */
    public static List<Field> m29789(List<Object> list) {
        if (list.get(0) instanceof Class) {
            if (list.size() > 1) {
                return C12019hv.m30362().m30364().m30309((Class) m29851(list, 0, Class.class), (C12010hm) m29851(list, 1, C12010hm.class));
            }
        } else {
            Object obj = m29851(list, 0, Object.class);
            boolean zBooleanValue = list.size() > 1 ? ((Boolean) m29851(list, 1, Boolean.class)).booleanValue() : false;
            C12019hv.m30362().m30364();
            Field[] fieldArrM30305 = C12014hq.m30305(obj.getClass(), zBooleanValue, -1, null);
            if (fieldArrM30305 != null) {
                return Arrays.asList(fieldArrM30305);
            }
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: ｋ */
    public static Field m29790(List<Object> list) {
        if (list.get(0) instanceof Class) {
            Class cls = (Class) m29851(list, 0, Class.class);
            if (list.get(1) instanceof Class) {
                return C12019hv.m30362().m30364().m30308(cls, (Class) m29851(list, 1, Class.class));
            }
            return C12019hv.m30362().m30364().m30310(cls, (C12010hm) m29851(list, 1, C12010hm.class));
        }
        Object obj = m29851(list, 0, Object.class);
        return C12019hv.m30362().m30364().m30308(obj.getClass(), (Class) m29851(list, 1, Class.class));
    }

    /* JADX INFO: renamed from: ﾒ */
    public static Field m29791(List<Object> list) {
        return C12019hv.m30362().m30364().m30311((Class) m29851(list, 0, Class.class), (String) m29851(list, 1, String.class));
    }

    /* JADX INFO: renamed from: ﻛ */
    public static C12010hm.c m29788() {
        C12019hv.m30362().m30364();
        return C12014hq.m30306();
    }
}

package com.ironsource.adqualitysdk.sdk.p286i;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.df */
/* JADX INFO: loaded from: classes6.dex */
public final class C11895df extends C11886cx {
    /* JADX INFO: renamed from: ﾒ */
    public static C11879cq.d m29890(List<Object> list) {
        return new C11879cq.d((List) m29851(list, 0, List.class), ((Integer) m29851(list, 1, Integer.class)).intValue());
    }

    /* JADX INFO: renamed from: ﻐ */
    public static Object m29887(List<Object> list) {
        Object obj;
        Class<?> cls;
        C12010hm c12010hm;
        Object obj2;
        Object obj3;
        Class<?> cls2;
        C12010hm c12010hm2;
        Object obj4;
        int size = list.size();
        Object obj5 = null;
        Class<?> cls3 = null;
        if (size == 2) {
            if (list.get(0) instanceof Class) {
                cls = (Class) m29851(list, 0, Class.class);
                obj = null;
            } else {
                Object obj6 = m29851(list, 0, Object.class);
                if (obj6 != null) {
                    obj = obj6;
                    cls = obj6.getClass();
                } else {
                    obj = obj6;
                    cls = null;
                }
            }
            c12010hm = (C12010hm) m29851(list, 1, C12010hm.class);
            cls3 = cls;
            obj2 = obj;
            obj3 = null;
        } else if (size == 3) {
            if (list.get(0) instanceof Class) {
                cls2 = (Class) m29851(list, 0, Class.class);
                if (list.get(1) instanceof C12010hm) {
                    c12010hm2 = (C12010hm) m29851(list, 1, C12010hm.class);
                    obj4 = m29851(list, 2, Object.class);
                } else {
                    Object obj7 = m29851(list, 1, Object.class);
                    c12010hm = (C12010hm) m29851(list, 2, C12010hm.class);
                    obj3 = null;
                    cls3 = cls2;
                    obj2 = obj7;
                }
            } else {
                obj5 = m29851(list, 0, Object.class);
                cls2 = obj5.getClass();
                c12010hm2 = (C12010hm) m29851(list, 1, C12010hm.class);
                obj4 = m29851(list, 2, Object.class);
            }
            Object obj8 = obj5;
            cls3 = cls2;
            obj2 = obj8;
            obj3 = obj4;
            c12010hm = c12010hm2;
        } else if (size != 4) {
            c12010hm = null;
            obj2 = null;
            obj3 = null;
        } else {
            cls3 = (Class) m29851(list, 0, Class.class);
            obj2 = m29851(list, 1, Object.class);
            C12010hm c12010hm3 = (C12010hm) m29851(list, 2, C12010hm.class);
            obj3 = m29851(list, 3, Object.class);
            c12010hm = c12010hm3;
        }
        C12019hv.m30362().m30363();
        return C12023hz.m30435(cls3, obj2, c12010hm, obj3);
    }

    /* JADX INFO: renamed from: ｋ */
    public static List<Object> m29889(List<Object> list) {
        Object obj;
        C12010hm c12010hm;
        Class<?> cls;
        int size = list.size();
        Class<?> cls2 = null;
        cls2 = null;
        Object obj2 = null;
        if (size == 2) {
            if (list.get(0) instanceof Class) {
                cls2 = (Class) m29851(list, 0, Class.class);
                obj = null;
            } else {
                obj = m29851(list, 0, Object.class);
                if (obj != null) {
                    cls2 = obj.getClass();
                }
            }
            c12010hm = (C12010hm) m29851(list, 1, C12010hm.class);
        } else if (size != 3) {
            c12010hm = null;
            obj = null;
        } else {
            if (list.get(0) instanceof Class) {
                cls = (Class) m29851(list, 0, Class.class);
                if (list.get(1) instanceof C12010hm) {
                    c12010hm = (C12010hm) m29851(list, 1, C12010hm.class);
                } else {
                    obj2 = m29851(list, 1, Object.class);
                    c12010hm = (C12010hm) m29851(list, 2, C12010hm.class);
                }
            } else {
                obj2 = m29851(list, 0, Object.class);
                cls = obj2.getClass();
                c12010hm = (C12010hm) m29851(list, 1, C12010hm.class);
            }
            Object obj3 = obj2;
            cls2 = cls;
            obj = obj3;
        }
        C12019hv.m30362().m30363();
        return C12023hz.m30442(cls2, obj, c12010hm);
    }

    /* JADX INFO: renamed from: ｋ */
    public final <T> InterfaceC12018hu<T> m29892(final C11907dr c11907dr, final C11877co c11877co, List<Object> list) {
        Object obj = m29851(list, 0, Object.class);
        final C11879cq c11879cq = (C11879cq) m29851(list, 1, C11879cq.class);
        final List<Object> list2 = m29854(list, 2);
        if (c11879cq == null) {
            return null;
        }
        return C12019hv.m30362().m30363().m30455(obj, c11879cq.m29751(new InterfaceC12021hx() { // from class: com.ironsource.adqualitysdk.sdk.i.df.2
            @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12021hx
            /* JADX INFO: renamed from: ﻐ */
            public final boolean mo29895(InterfaceC12018hu interfaceC12018hu) {
                return c11879cq.m29750().m29612(interfaceC12018hu, c11907dr, c11877co, list2);
            }
        }));
    }

    /* JADX INFO: renamed from: ﻛ */
    public final Object m29891(C11907dr c11907dr, C11877co c11877co, List<Object> list) {
        InterfaceC12018hu interfaceC12018huM29892 = m29892(c11907dr, c11877co, list);
        if (interfaceC12018huM29892 != null) {
            return interfaceC12018huM29892.mo30359();
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final List<InterfaceC12018hu> m29893(final C11907dr c11907dr, final C11877co c11877co, List<Object> list) {
        Object obj = m29851(list, 0, Object.class);
        final C11879cq c11879cq = (C11879cq) m29851(list, 1, C11879cq.class);
        final List<Object> list2 = m29854(list, 2);
        if (c11879cq == null) {
            return null;
        }
        return C12019hv.m30362().m30363().m30452(obj, c11879cq.m29751(new InterfaceC12021hx() { // from class: com.ironsource.adqualitysdk.sdk.i.df.5
            @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12021hx
            /* JADX INFO: renamed from: ﻐ */
            public final boolean mo29895(InterfaceC12018hu interfaceC12018hu) {
                return c11879cq.m29750().m29612(interfaceC12018hu, c11907dr, c11877co, list2);
            }
        }));
    }

    /* JADX INFO: renamed from: ﾒ */
    public final List<Object> m29894(C11907dr c11907dr, C11877co c11877co, List<Object> list) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC12018hu interfaceC12018hu : m29893(c11907dr, c11877co, list)) {
            if (interfaceC12018hu != null) {
                arrayList.add(interfaceC12018hu.mo30359());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻛ */
    public static String m29888(List<Object> list) {
        if (list.get(0) instanceof Class) {
            return C12019hv.m30362().m30363().m30451((Class) m29851(list, 0, Class.class), (String) m29851(list, 1, String.class));
        }
        Object obj = m29851(list, 0, Object.class);
        if (list.get(1) instanceof List) {
            return C12019hv.m30362().m30363().m30454(obj, new JSONArray((Collection) m29851(list, 1, List.class)));
        }
        if (list.get(1) instanceof JSONArray) {
            return C12019hv.m30362().m30363().m30454(obj, (JSONArray) m29851(list, 1, JSONArray.class));
        }
        return C12019hv.m30362().m30363().m30456(obj, (String) m29851(list, 1, String.class));
    }
}

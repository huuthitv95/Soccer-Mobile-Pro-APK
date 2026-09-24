package com.pgl.ssdk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.pgl.ssdk.at */
/* JADX INFO: loaded from: classes7.dex */
public class C14262at {

    /* JADX INFO: renamed from: a */
    private static final Map<Class<?>, Class<?>> f41275a;

    /* JADX INFO: renamed from: com.pgl.ssdk.at$a */
    public static class a<T> {

        /* JADX INFO: renamed from: a */
        public final Class<? extends T> f41276a;

        /* JADX INFO: renamed from: b */
        public final T f41277b;
    }

    static {
        HashMap map = new HashMap();
        f41275a = map;
        Class cls = Boolean.TYPE;
        map.put(Boolean.class, cls);
        map.put(Byte.class, Byte.TYPE);
        map.put(Character.class, Character.TYPE);
        map.put(Short.class, Short.TYPE);
        Class cls2 = Integer.TYPE;
        map.put(Integer.class, cls2);
        Class cls3 = Float.TYPE;
        map.put(Float.class, cls3);
        Class cls4 = Long.TYPE;
        map.put(Long.class, cls4);
        map.put(Double.class, Double.TYPE);
        map.put(cls, cls);
        Class cls5 = Byte.TYPE;
        map.put(cls5, cls5);
        Class cls6 = Character.TYPE;
        map.put(cls6, cls6);
        Class cls7 = Short.TYPE;
        map.put(cls7, cls7);
        map.put(cls2, cls2);
        map.put(cls3, cls3);
        map.put(cls4, cls4);
        Class cls8 = Double.TYPE;
        map.put(cls8, cls8);
    }

    /* JADX INFO: renamed from: a */
    private static Method m43000a(Class<?> cls, String str, Class... clsArr) throws NoSuchMethodException, SecurityException {
        Method methodM43001a = m43001a(cls.getDeclaredMethods(), str, (Class<?>[]) clsArr);
        if (methodM43001a != null) {
            methodM43001a.setAccessible(true);
            return methodM43001a;
        }
        if (cls.getSuperclass() != null) {
            return m43000a((Class<?>) cls.getSuperclass(), str, clsArr);
        }
        throw new NoSuchMethodException();
    }

    /* JADX INFO: renamed from: a */
    private static Method m43001a(Method[] methodArr, String str, Class<?>[] clsArr) {
        if (str == null) {
            throw new NullPointerException("Method name must not be null.");
        }
        for (Method method : methodArr) {
            if (method.getName().equals(str) && m43004a(method.getParameterTypes(), clsArr)) {
                return method;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static void m43002a(Class<?> cls, String str, Object... objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m43000a(cls, str, (Class[]) m43005a(objArr)).invoke(null, m43006b(objArr));
    }

    /* JADX INFO: renamed from: a */
    public static void m43003a(String str, String str2, Object... objArr) {
        try {
            m43002a(Class.forName(str), str2, objArr);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m43004a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr == null) {
            return clsArr2 == null || clsArr2.length == 0;
        }
        if (clsArr2 == null) {
            return clsArr.length == 0;
        }
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr.length; i++) {
            if (!clsArr[i].isAssignableFrom(clsArr2[i])) {
                Map<Class<?>, Class<?>> map = f41275a;
                if (!map.containsKey(clsArr[i]) || !map.get(clsArr[i]).equals(map.get(clsArr2[i]))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    private static Class<?>[] m43005a(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null || !(obj instanceof a)) {
                clsArr[i] = obj == null ? null : obj.getClass();
            } else {
                clsArr[i] = ((a) obj).f41276a;
            }
        }
        return clsArr;
    }

    /* JADX INFO: renamed from: b */
    private static Object[] m43006b(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null || !(obj instanceof a)) {
                objArr2[i] = obj;
            } else {
                objArr2[i] = ((a) obj).f41277b;
            }
        }
        return objArr2;
    }
}

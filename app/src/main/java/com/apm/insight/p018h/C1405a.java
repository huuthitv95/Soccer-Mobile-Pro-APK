package com.apm.insight.p018h;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.apm.insight.h.a */
/* JADX INFO: compiled from: JavaCalls.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1405a {

    /* JADX INFO: renamed from: a */
    private static final Map<Class<?>, Class<?>> f601a;

    /* JADX INFO: renamed from: com.apm.insight.h.a$a */
    /* JADX INFO: compiled from: JavaCalls.java */
    public static class a<T> {

        /* JADX INFO: renamed from: a */
        public final Class<? extends T> f602a;

        /* JADX INFO: renamed from: b */
        public final T f603b;
    }

    static {
        HashMap map = new HashMap();
        f601a = map;
        map.put(Boolean.class, Boolean.TYPE);
        map.put(Byte.class, Byte.TYPE);
        map.put(Character.class, Character.TYPE);
        map.put(Short.class, Short.TYPE);
        map.put(Integer.class, Integer.TYPE);
        map.put(Float.class, Float.TYPE);
        map.put(Long.class, Long.TYPE);
        map.put(Double.class, Double.TYPE);
        Class cls = Boolean.TYPE;
        map.put(cls, cls);
        Class cls2 = Byte.TYPE;
        map.put(cls2, cls2);
        Class cls3 = Character.TYPE;
        map.put(cls3, cls3);
        Class cls4 = Short.TYPE;
        map.put(cls4, cls4);
        Class cls5 = Integer.TYPE;
        map.put(cls5, cls5);
        Class cls6 = Float.TYPE;
        map.put(cls6, cls6);
        Class cls7 = Long.TYPE;
        map.put(cls7, cls7);
        Class cls8 = Double.TYPE;
        map.put(cls8, cls8);
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m1173a(String str, String str2, Object... objArr) {
        Method method;
        Class<?>[] parameterTypes;
        try {
            Class<?> cls = Class.forName(str);
            Class<?>[] clsArr = new Class[4];
            for (int i = 0; i < 4; i++) {
                Object obj = objArr[i];
                clsArr[i] = (obj == null || !(obj instanceof a)) ? obj == null ? null : obj.getClass() : ((a) obj).f602a;
            }
            while (true) {
                Method[] declaredMethods = cls.getDeclaredMethods();
                int length = declaredMethods.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        method = null;
                        break;
                    }
                    method = declaredMethods[i2];
                    if (method.getName().equals(str2) && (parameterTypes = method.getParameterTypes()) != null && parameterTypes.length == 4) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= parameterTypes.length) {
                                break;
                            }
                            if (!parameterTypes[i3].isAssignableFrom(clsArr[i3])) {
                                Map<Class<?>, Class<?>> map = f601a;
                                if (!map.containsKey(parameterTypes[i3]) || !map.get(parameterTypes[i3]).equals(map.get(clsArr[i3]))) {
                                    break;
                                    break;
                                }
                            }
                            i3++;
                        }
                    }
                    i2++;
                }
                if (method != null) {
                    method.setAccessible(true);
                    Object[] objArr2 = new Object[4];
                    for (int i4 = 0; i4 < 4; i4++) {
                        Object obj2 = objArr[i4];
                        if (obj2 == null || !(obj2 instanceof a)) {
                            objArr2[i4] = obj2;
                        } else {
                            objArr2[i4] = ((a) obj2).f603b;
                        }
                    }
                    return (T) method.invoke(null, objArr2);
                }
                if (cls.getSuperclass() == null) {
                    throw new NoSuchMethodException();
                }
                cls = cls.getSuperclass();
            }
        } catch (Exception e) {
            Log.w("JavaCalls", "Meet exception when call Method '" + str2 + "' in " + str, e);
            return null;
        }
    }
}

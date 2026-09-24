package com.pgl.ssdk;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.pgl.ssdk.av */
/* JADX INFO: loaded from: classes7.dex */
public final class C14264av {

    /* JADX INFO: renamed from: a */
    private static Method f41278a;

    /* JADX INFO: renamed from: b */
    private static Method f41279b;

    /* JADX INFO: renamed from: c */
    private static Method f41280c;

    static {
        try {
            f41278a = Class.class.getDeclaredMethod("forName", String.class);
            f41279b = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            f41280c = Class.class.getDeclaredMethod("getDeclaredField", String.class);
        } catch (NoSuchMethodException | NullPointerException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static Object m43009a(Object obj, Class cls, String str, Object obj2) {
        try {
            Field fieldM43011a = m43011a(cls, str);
            if (fieldM43011a != null) {
                fieldM43011a.setAccessible(true);
                return fieldM43011a.get(obj);
            }
        } catch (Throwable unused) {
        }
        return obj2;
    }

    /* JADX INFO: renamed from: a */
    public static Object m43010a(Object obj, Class cls, String str, Class[] clsArr, Object... objArr) {
        try {
            Method methodM43012a = m43012a(cls, str, clsArr);
            if (methodM43012a != null) {
                return methodM43012a.invoke(obj, objArr);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Field m43011a(Class cls, String str) {
        if (!m43013a()) {
            return null;
        }
        try {
            Field field = (Field) f41280c.invoke(cls, str);
            try {
                field.setAccessible(true);
                return field;
            } catch (Throwable unused) {
                return field;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Method m43012a(Class cls, String str, Class[] clsArr) {
        if (!m43013a()) {
            return null;
        }
        try {
            Method method = (Method) f41279b.invoke(cls, str, clsArr);
            try {
                method.setAccessible(true);
                return method;
            } catch (Throwable unused) {
                return method;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m43013a() {
        return (f41278a == null || f41279b == null || f41280c == null) ? false : true;
    }
}

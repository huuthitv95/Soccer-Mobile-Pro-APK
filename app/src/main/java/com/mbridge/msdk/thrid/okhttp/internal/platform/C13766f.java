package com.mbridge.msdk.thrid.okhttp.internal.platform;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.platform.f */
/* JADX INFO: compiled from: OptionalMethod.java */
/* JADX INFO: loaded from: classes7.dex */
class C13766f<T> {

    /* JADX INFO: renamed from: a */
    private final Class<?> f39114a;

    /* JADX INFO: renamed from: b */
    private final String f39115b;

    /* JADX INFO: renamed from: c */
    private final Class[] f39116c;

    C13766f(Class<?> cls, String str, Class... clsArr) {
        this.f39114a = cls;
        this.f39115b = str;
        this.f39116c = clsArr;
    }

    /* JADX INFO: renamed from: a */
    private Method m40623a(Class<?> cls) {
        Class<?> cls2;
        String str = this.f39115b;
        if (str == null) {
            return null;
        }
        Method methodM40624a = m40624a(cls, str, this.f39116c);
        if (methodM40624a == null || (cls2 = this.f39114a) == null || cls2.isAssignableFrom(methodM40624a.getReturnType())) {
            return methodM40624a;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static Method m40624a(Class<?> cls, String str, Class[] clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
                return method;
            } catch (NoSuchMethodException unused) {
                return method;
            }
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public Object m40625a(T t, Object... objArr) throws InvocationTargetException {
        Method methodM40623a = m40623a(t.getClass());
        if (methodM40623a == null) {
            throw new AssertionError("Method " + this.f39115b + " not supported for object " + t);
        }
        try {
            return methodM40623a.invoke(t, objArr);
        } catch (IllegalAccessException e) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + methodM40623a);
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m40626a(T t) {
        return m40623a(t.getClass()) != null;
    }

    /* JADX INFO: renamed from: b */
    public Object m40627b(T t, Object... objArr) throws InvocationTargetException {
        Method methodM40623a = m40623a(t.getClass());
        if (methodM40623a == null) {
            return null;
        }
        try {
            return methodM40623a.invoke(t, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public Object m40628c(T t, Object... objArr) {
        try {
            return m40627b(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* JADX INFO: renamed from: d */
    public Object m40629d(T t, Object... objArr) {
        try {
            return m40625a(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }
}

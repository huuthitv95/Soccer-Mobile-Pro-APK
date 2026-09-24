package com.mbridge.msdk.mbsignalcommon.mapping;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.mapping.b */
/* JADX INFO: compiled from: Mapping.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13379b {

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.mapping.b$a */
    /* JADX INFO: compiled from: Mapping.java */
    public static class a<C> {

        /* JADX INFO: renamed from: a */
        protected Class<C> f37116a;

        public a(Class<C> cls) {
            this.f37116a = cls;
        }

        /* JADX INFO: renamed from: a */
        public b m38679a(String str, Class<?>... clsArr) throws C13378a {
            return new b(this.f37116a, str, clsArr, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m38678b(C13378a c13378a) throws C13378a {
        throw c13378a;
    }

    /* JADX INFO: renamed from: a */
    public static <T> a<T> m38676a(ClassLoader classLoader, String str) throws C13378a {
        try {
            return new a<>(classLoader.loadClass(str));
        } catch (Exception e) {
            m38678b(new C13378a(e));
            return new a<>(null);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.mapping.b$b */
    /* JADX INFO: compiled from: Mapping.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        protected final Method f37117a;

        b(Class<?> cls, String str, Class<?>[] clsArr, int i) throws C13378a {
            Method declaredMethod = null;
            if (cls == null) {
                this.f37117a = null;
                return;
            }
            while (cls != Object.class && cls != null) {
                try {
                    declaredMethod = cls.getDeclaredMethod(str, clsArr);
                    break;
                } catch (NoSuchMethodException e) {
                    if (MBridgeConstans.DEBUG && cls.getSuperclass() == Object.class) {
                        e.printStackTrace();
                    }
                    cls = cls.getSuperclass();
                } catch (SecurityException e2) {
                    try {
                        try {
                            if (MBridgeConstans.DEBUG && cls.getSuperclass() == Object.class) {
                                e2.printStackTrace();
                            }
                            cls = cls.getSuperclass();
                        } catch (Exception e3) {
                            C13378a c13378a = new C13378a(e3);
                            c13378a.m38674a(cls);
                            c13378a.m38675a(str);
                            C13379b.m38678b(c13378a);
                            this.f37117a = declaredMethod;
                            return;
                        }
                    } catch (Throwable th) {
                        this.f37117a = declaredMethod;
                        throw th;
                    }
                }
            }
            if (declaredMethod != null) {
                if (i > 0 && (declaredMethod.getModifiers() & i) != i) {
                    C13379b.m38678b(new C13378a(declaredMethod + " does not match modifiers: " + i));
                }
                declaredMethod.setAccessible(true);
            }
            this.f37117a = declaredMethod;
        }

        /* JADX INFO: renamed from: a */
        public Object m38680a(Object obj, Object... objArr) throws IllegalArgumentException, InvocationTargetException {
            Method method = this.f37117a;
            if (method == null) {
                return null;
            }
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                C13219q0.m37813a("MappingedMethod", "invoke error:" + e.getMessage());
                return null;
            }
        }

        /* JADX INFO: renamed from: a */
        public Method m38681a() {
            return this.f37117a;
        }
    }
}

package bitter.jnibridge;

import com.applovin.impl.d$$ExternalSyntheticApiModelOutline0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes3.dex */
public class JNIBridge {

    /* JADX INFO: renamed from: bitter.jnibridge.JNIBridge$a */
    private static class C1234a implements InvocationHandler {

        /* JADX INFO: renamed from: a */
        private Object f198a = new Object[0];

        /* JADX INFO: renamed from: b */
        private long f199b;

        /* JADX INFO: renamed from: c */
        private Constructor f200c;

        public C1234a(long j) {
            this.f199b = j;
            try {
                Constructor declaredConstructor = d$$ExternalSyntheticApiModelOutline0.m2280m().getDeclaredConstructor(Class.class, Integer.TYPE);
                this.f200c = declaredConstructor;
                declaredConstructor.setAccessible(true);
            } catch (NoClassDefFoundError unused) {
                this.f200c = null;
            } catch (NoSuchMethodException unused2) {
                this.f200c = null;
            }
        }

        /* JADX INFO: renamed from: a */
        private Object m825a(Object obj, Method method, Object[] objArr) {
            if (objArr == null) {
                objArr = new Object[0];
            }
            Class<?> declaringClass = method.getDeclaringClass();
            return d$$ExternalSyntheticApiModelOutline0.m2292m(this.f200c.newInstance(declaringClass, 2)).in(declaringClass).unreflectSpecial(method, declaringClass).bindTo(obj).invokeWithArguments(objArr);
        }

        /* JADX INFO: renamed from: a */
        public final void m826a() {
            synchronized (this.f198a) {
                this.f199b = 0L;
            }
        }

        public final void finalize() {
            synchronized (this.f198a) {
                long j = this.f199b;
                if (j != 0) {
                    JNIBridge.delete(j);
                }
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            synchronized (this.f198a) {
                long j = this.f199b;
                if (j == 0) {
                    return null;
                }
                try {
                    return JNIBridge.invoke(j, method.getDeclaringClass(), method, objArr);
                } catch (NoSuchMethodError e) {
                    if (this.f200c == null) {
                        System.err.println("JNIBridge error: Java interface default methods are only supported since Android Oreo");
                        throw e;
                    }
                    if ((method.getModifiers() & 1024) == 0) {
                        return m825a(obj, method, objArr);
                    }
                    throw e;
                }
            }
        }
    }

    static native void delete(long j);

    static void disableInterfaceProxy(Object obj) {
        if (obj != null) {
            ((C1234a) Proxy.getInvocationHandler(obj)).m826a();
        }
    }

    static native Object invoke(long j, Class cls, Method method, Object[] objArr);

    static Object newInterfaceProxy(long j, Class[] clsArr) {
        return Proxy.newProxyInstance(JNIBridge.class.getClassLoader(), clsArr, new C1234a(j));
    }
}

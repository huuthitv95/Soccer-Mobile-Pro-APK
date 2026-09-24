package com.unity3d.player;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.adjust.sdk.Constants;
import com.applovin.impl.d$$ExternalSyntheticApiModelOutline0;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
final class ReflectionHelper {
    protected static boolean LOG;
    protected static final boolean LOGV = false;

    /* JADX INFO: renamed from: a */
    private static C14647a[] f41538a = new C14647a[4096];

    /* JADX INFO: renamed from: b */
    private static long f41539b = 0;

    /* JADX INFO: renamed from: c */
    private static long f41540c = 0;

    /* JADX INFO: renamed from: d */
    private static boolean f41541d = false;

    /* JADX INFO: renamed from: com.unity3d.player.ReflectionHelper$a */
    private static class C14647a {

        /* JADX INFO: renamed from: a */
        public volatile Member f41550a;

        /* JADX INFO: renamed from: b */
        private final Class f41551b;

        /* JADX INFO: renamed from: c */
        private final String f41552c;

        /* JADX INFO: renamed from: d */
        private final String f41553d;

        /* JADX INFO: renamed from: e */
        private final int f41554e;

        C14647a(Class cls, String str, String str2) {
            this.f41551b = cls;
            this.f41552c = str;
            this.f41553d = str2;
            this.f41554e = ((((cls.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + str.hashCode()) * 31) + str2.hashCode();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C14647a) {
                C14647a c14647a = (C14647a) obj;
                if (this.f41554e == c14647a.f41554e && this.f41553d.equals(c14647a.f41553d) && this.f41552c.equals(c14647a.f41552c) && this.f41551b.equals(c14647a.f41551b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f41554e;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.player.ReflectionHelper$b */
    private static class RunnableC14648b implements Runnable {

        /* JADX INFO: renamed from: a */
        final long f41555a;

        /* JADX INFO: renamed from: b */
        final long f41556b;

        public RunnableC14648b(long j, long j2) {
            this.f41555a = j;
            this.f41556b = j2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ReflectionHelper.beginProxyCall(this.f41555a)) {
                try {
                    ReflectionHelper.nativeProxyFinalize(this.f41556b);
                } finally {
                    ReflectionHelper.endProxyCall();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.unity3d.player.ReflectionHelper$c */
    protected interface InterfaceC14649c extends InvocationHandler {
        /* JADX INFO: renamed from: a */
        void mo43231a(long j, boolean z);
    }

    ReflectionHelper() {
    }

    /* JADX INFO: renamed from: a */
    private static float m43220a(Class cls, Class cls2) {
        if (cls.equals(cls2)) {
            return 1.0f;
        }
        if (cls.isPrimitive() || cls2.isPrimitive()) {
            return 0.0f;
        }
        try {
            if (cls.asSubclass(cls2) != null) {
                return 0.5f;
            }
        } catch (ClassCastException unused) {
        }
        try {
            return cls2.asSubclass(cls) != null ? 0.1f : 0.0f;
        } catch (ClassCastException unused2) {
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: a */
    private static float m43221a(Class cls, Class[] clsArr, Class[] clsArr2) {
        if (clsArr2.length == 0) {
            return 0.1f;
        }
        int i = 0;
        if ((clsArr == null ? 0 : clsArr.length) + 1 != clsArr2.length) {
            return 0.0f;
        }
        float f = 1.0f;
        if (clsArr != null) {
            int length = clsArr.length;
            float fM43220a = 1.0f;
            int i2 = 0;
            while (i < length) {
                fM43220a *= m43220a(clsArr[i], clsArr2[i2]);
                i++;
                i2++;
            }
            f = fM43220a;
        }
        return f * m43220a(cls, clsArr2[clsArr2.length - 1]);
    }

    /* JADX INFO: renamed from: a */
    private static Class m43223a(String str, int[] iArr) {
        while (iArr[0] < str.length()) {
            int i = iArr[0];
            iArr[0] = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != '(' && cCharAt != ')') {
                if (cCharAt == 'L') {
                    int iIndexOf = str.indexOf(59, iArr[0]);
                    if (iIndexOf == -1) {
                        return null;
                    }
                    String strSubstring = str.substring(iArr[0], iIndexOf);
                    iArr[0] = iIndexOf + 1;
                    try {
                        return Class.forName(strSubstring.replace('/', '.'));
                    } catch (ClassNotFoundException unused) {
                        return null;
                    }
                }
                if (cCharAt == 'Z') {
                    return Boolean.TYPE;
                }
                if (cCharAt == 'I') {
                    return Integer.TYPE;
                }
                if (cCharAt == 'F') {
                    return Float.TYPE;
                }
                if (cCharAt == 'V') {
                    return Void.TYPE;
                }
                if (cCharAt == 'B') {
                    return Byte.TYPE;
                }
                if (cCharAt == 'C') {
                    return Character.TYPE;
                }
                if (cCharAt == 'S') {
                    return Short.TYPE;
                }
                if (cCharAt == 'J') {
                    return Long.TYPE;
                }
                if (cCharAt == 'D') {
                    return Double.TYPE;
                }
                if (cCharAt == '[') {
                    return Array.newInstance((Class<?>) m43223a(str, iArr), 0).getClass();
                }
                C14685f.Log(5, "! parseType; " + cCharAt + " is not known!");
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static synchronized void m43226a(C14647a c14647a, Member member) {
        c14647a.f41550a = member;
        f41538a[c14647a.hashCode() & (f41538a.length - 1)] = c14647a;
    }

    /* JADX INFO: renamed from: a */
    private static synchronized boolean m43227a(C14647a c14647a) {
        C14647a c14647a2 = f41538a[c14647a.hashCode() & (f41538a.length - 1)];
        if (!c14647a.equals(c14647a2)) {
            return false;
        }
        c14647a.f41550a = c14647a2.f41550a;
        return true;
    }

    /* JADX INFO: renamed from: a */
    private static Class[] m43228a(String str) {
        Class clsM43223a;
        int i = 0;
        int[] iArr = {0};
        ArrayList arrayList = new ArrayList();
        while (iArr[0] < str.length() && (clsM43223a = m43223a(str, iArr)) != null) {
            arrayList.add(clsM43223a);
        }
        Class[] clsArr = new Class[arrayList.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            clsArr[i] = (Class) it.next();
            i++;
        }
        return clsArr;
    }

    protected static synchronized boolean beginProxyCall(long j) {
        if (j != f41539b) {
            return false;
        }
        f41540c++;
        return true;
    }

    protected static synchronized void endProxyCall() {
        long j = f41540c - 1;
        f41540c = j;
        if (0 == j && f41541d) {
            ReflectionHelper.class.notifyAll();
        }
    }

    protected static synchronized void endUnityLaunch() {
        try {
            f41539b++;
            f41541d = true;
            while (f41540c > 0) {
                ReflectionHelper.class.wait();
            }
        } catch (InterruptedException unused) {
            C14685f.Log(6, "Interrupted while waiting for all proxies to exit.");
        }
        f41541d = false;
    }

    protected static Constructor getConstructorID(Class cls, String str) {
        Constructor<?> constructor;
        C14647a c14647a = new C14647a(cls, "", str);
        if (m43227a(c14647a)) {
            constructor = (Constructor) c14647a.f41550a;
        } else {
            Class[] clsArrM43228a = m43228a(str);
            Constructor<?> constructor2 = null;
            float f = 0.0f;
            for (Constructor<?> constructor3 : cls.getConstructors()) {
                float fM43221a = m43221a(Void.TYPE, constructor3.getParameterTypes(), clsArrM43228a);
                if (fM43221a > f) {
                    if (fM43221a == 1.0f) {
                        constructor2 = constructor3;
                        break;
                    }
                    constructor2 = constructor3;
                    f = fM43221a;
                }
            }
            m43226a(c14647a, constructor2);
            constructor = constructor2;
        }
        if (constructor != null) {
            return constructor;
        }
        throw new NoSuchMethodError("<init>" + str + " in class " + cls.getName());
    }

    protected static Field getFieldID(Class cls, String str, String str2, boolean z) {
        Field field;
        Class superclass = cls;
        C14647a c14647a = new C14647a(superclass, str, str2);
        if (m43227a(c14647a)) {
            field = (Field) c14647a.f41550a;
        } else {
            Class[] clsArrM43228a = m43228a(str2);
            float f = 0.0f;
            Field field2 = null;
            while (superclass != null) {
                for (Field field3 : superclass.getDeclaredFields()) {
                    if (z == Modifier.isStatic(field3.getModifiers()) && field3.getName().compareTo(str) == 0) {
                        float fM43221a = m43221a(field3.getType(), (Class[]) null, clsArrM43228a);
                        if (fM43221a > f) {
                            field2 = field3;
                            if (fM43221a == 1.0f) {
                                f = fM43221a;
                                break;
                            }
                            f = fM43221a;
                        } else {
                            continue;
                        }
                    }
                }
                if (f == 1.0f || superclass.isPrimitive() || superclass.isInterface() || superclass.equals(Object.class) || superclass.equals(Void.TYPE)) {
                    break;
                }
                superclass = superclass.getSuperclass();
            }
            m43226a(c14647a, field2);
            field = field2;
        }
        if (field == null) {
            throw new NoSuchFieldError(String.format("no %s field with name='%s' signature='%s' in class L%s;", z ? "static" : "non-static", str, str2, superclass.getName()));
        }
        return field;
    }

    protected static String getFieldSignature(Field field) {
        Class<?> type = field.getType();
        if (!type.isPrimitive()) {
            if (type.isArray()) {
                return type.getName().replace('.', '/');
            }
            return "L" + type.getName().replace('.', '/') + ";";
        }
        String name = type.getName();
        if (TypedValues.Custom.S_BOOLEAN.equals(name)) {
            return "Z";
        }
        if ("byte".equals(name)) {
            return "B";
        }
        if ("char".equals(name)) {
            return "C";
        }
        if ("double".equals(name)) {
            return "D";
        }
        if (TypedValues.Custom.S_FLOAT.equals(name)) {
            return "F";
        }
        if ("int".equals(name)) {
            return "I";
        }
        if (Constants.LONG.equals(name)) {
            return "J";
        }
        return "short".equals(name) ? ExifInterface.LATITUDE_SOUTH : name;
    }

    protected static Method getMethodID(Class cls, String str, String str2, boolean z) {
        Method method;
        C14647a c14647a = new C14647a(cls, str, str2);
        if (m43227a(c14647a)) {
            method = (Method) c14647a.f41550a;
        } else {
            Class[] clsArrM43228a = m43228a(str2);
            Method method2 = null;
            float f = 0.0f;
            while (cls != null) {
                for (Method method3 : cls.getDeclaredMethods()) {
                    if (z == Modifier.isStatic(method3.getModifiers()) && method3.getName().compareTo(str) == 0) {
                        float fM43221a = m43221a(method3.getReturnType(), method3.getParameterTypes(), clsArrM43228a);
                        if (fM43221a > f) {
                            if (fM43221a == 1.0f) {
                                method2 = method3;
                                f = fM43221a;
                                break;
                            }
                            method2 = method3;
                            f = fM43221a;
                        } else {
                            continue;
                        }
                    }
                }
                if (f == 1.0f || cls.isPrimitive() || cls.isInterface() || cls.equals(Object.class) || cls.equals(Void.TYPE)) {
                    break;
                }
                cls = cls.getSuperclass();
            }
            m43226a(c14647a, method2);
            method = method2;
        }
        if (method == null) {
            throw new NoSuchMethodError(String.format("no %s method with name='%s' signature='%s' in class L%s;", z ? "static" : "non-static", str, str2, cls.getName()));
        }
        return method;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeProxyFinalize(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native Object nativeProxyInvoke(long j, String str, Object[] objArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeProxyLogJNIInvokeException(long j);

    protected static Object newProxyInstance(UnityPlayer unityPlayer, long j, Class cls) {
        return newProxyInstance(unityPlayer, j, new Class[]{cls});
    }

    protected static Object newProxyInstance(UnityPlayer unityPlayer, long j, Class[] clsArr) {
        return Proxy.newProxyInstance(ReflectionHelper.class.getClassLoader(), clsArr, new InterfaceC14649c(j, unityPlayer, clsArr) { // from class: com.unity3d.player.ReflectionHelper.1

            /* JADX INFO: renamed from: a */
            final /* synthetic */ long f41542a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ UnityPlayer f41543b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ Class[] f41544c;

            /* JADX INFO: renamed from: d */
            private Runnable f41545d;

            /* JADX INFO: renamed from: e */
            private UnityPlayer f41546e;

            /* JADX INFO: renamed from: f */
            private long f41547f = ReflectionHelper.f41539b;

            /* JADX INFO: renamed from: g */
            private long f41548g;

            /* JADX INFO: renamed from: h */
            private boolean f41549h;

            {
                this.f41542a = j;
                this.f41543b = unityPlayer;
                this.f41544c = clsArr;
                this.f41545d = new RunnableC14648b(ReflectionHelper.f41539b, j);
                this.f41546e = unityPlayer;
            }

            /* JADX INFO: renamed from: a */
            private Object m43230a(Object obj, Method method, Object[] objArr) throws NoSuchMethodException {
                if (objArr == null) {
                    try {
                        objArr = new Object[0];
                    } catch (NoClassDefFoundError unused) {
                        C14685f.Log(6, String.format("Java interface default methods are only supported since Android Oreo", new Object[0]));
                        ReflectionHelper.nativeProxyLogJNIInvokeException(this.f41548g);
                        return null;
                    }
                }
                Class<?> declaringClass = method.getDeclaringClass();
                Constructor declaredConstructor = d$$ExternalSyntheticApiModelOutline0.m2280m().getDeclaredConstructor(Class.class, Integer.TYPE);
                declaredConstructor.setAccessible(true);
                return d$$ExternalSyntheticApiModelOutline0.m2292m(declaredConstructor.newInstance(declaringClass, 2)).in(declaringClass).unreflectSpecial(method, declaringClass).bindTo(obj).invokeWithArguments(objArr);
            }

            @Override // com.unity3d.player.ReflectionHelper.InterfaceC14649c
            /* JADX INFO: renamed from: a */
            public final void mo43231a(long j2, boolean z) {
                this.f41548g = j2;
                this.f41549h = z;
            }

            protected final void finalize() throws Throwable {
                this.f41546e.queueGLThreadEvent(this.f41545d);
                super.finalize();
            }

            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                long j2;
                if (!ReflectionHelper.beginProxyCall(this.f41547f)) {
                    C14685f.Log(6, "Scripting proxy object was destroyed, because Unity player was unloaded.");
                    return null;
                }
                try {
                    this.f41548g = 0L;
                    this.f41549h = false;
                    Object objNativeProxyInvoke = ReflectionHelper.nativeProxyInvoke(this.f41542a, method.getName(), objArr);
                    if (!this.f41549h) {
                        j2 = this.f41548g;
                        if (j2 != 0) {
                        }
                        return objNativeProxyInvoke;
                    }
                    if ((method.getModifiers() & 1024) == 0) {
                        return m43230a(obj, method, objArr);
                    }
                    j2 = this.f41548g;
                    ReflectionHelper.nativeProxyLogJNIInvokeException(j2);
                    return objNativeProxyInvoke;
                } finally {
                    ReflectionHelper.endProxyCall();
                }
            }
        });
    }

    protected static void setNativeExceptionOnProxy(Object obj, long j, boolean z) {
        ((InterfaceC14649c) Proxy.getInvocationHandler(obj)).mo43231a(j, z);
    }
}

package com.mbridge.msdk.thrid.okhttp.internal.platform;

import com.mbridge.msdk.thrid.okhttp.EnumC13787w;
import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.platform.e */
/* JADX INFO: compiled from: JdkWithJettyBootPlatform.java */
/* JADX INFO: loaded from: classes7.dex */
class C13765e extends C13767g {

    /* JADX INFO: renamed from: c */
    private final Method f39106c;

    /* JADX INFO: renamed from: d */
    private final Method f39107d;

    /* JADX INFO: renamed from: e */
    private final Method f39108e;

    /* JADX INFO: renamed from: f */
    private final Class<?> f39109f;

    /* JADX INFO: renamed from: g */
    private final Class<?> f39110g;

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.platform.e$a */
    /* JADX INFO: compiled from: JdkWithJettyBootPlatform.java */
    private static class a implements InvocationHandler {

        /* JADX INFO: renamed from: a */
        private final List<String> f39111a;

        /* JADX INFO: renamed from: b */
        boolean f39112b;

        /* JADX INFO: renamed from: c */
        String f39113c;

        a(List<String> list) {
            this.f39111a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C13723c.f38772b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f39112b = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.f39111a;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f39111a.contains(list.get(i))) {
                            String str = (String) list.get(i);
                            this.f39113c = str;
                            return str;
                        }
                    }
                    String str2 = this.f39111a.get(0);
                    this.f39113c = str2;
                    return str2;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.f39113c = (String) objArr[0];
            return null;
        }
    }

    C13765e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f39106c = method;
        this.f39107d = method2;
        this.f39108e = method3;
        this.f39109f = cls;
        this.f39110g = cls2;
    }

    /* JADX INFO: renamed from: h */
    public static C13767g m40621h() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
            return new C13765e(cls.getMethod("put", SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.C13767g
    /* JADX INFO: renamed from: a */
    public void mo40622a(SSLSocket sSLSocket) {
        try {
            this.f39108e.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C13723c.m40269a("unable to remove alpn", (Exception) e);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.C13767g
    /* JADX INFO: renamed from: a */
    public void mo40597a(SSLSocket sSLSocket, String str, List<EnumC13787w> list) {
        try {
            this.f39106c.invoke(null, sSLSocket, Proxy.newProxyInstance(C13767g.class.getClassLoader(), new Class[]{this.f39109f, this.f39110g}, new a(C13767g.m40631a(list))));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C13723c.m40269a("unable to set alpn", (Exception) e);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.C13767g
    @Nullable
    /* JADX INFO: renamed from: b */
    public String mo40598b(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.f39107d.invoke(null, sSLSocket));
            boolean z = aVar.f39112b;
            if (!z && aVar.f39113c == null) {
                C13767g.m40635d().mo40606a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            }
            if (z) {
                return null;
            }
            return aVar.f39113c;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C13723c.m40269a("unable to get selected protocol", (Exception) e);
        }
    }
}

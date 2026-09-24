package com.mbridge.msdk.thrid.okhttp.internal.platform;

import android.os.Build;
import android.util.Log;
import com.mbridge.msdk.thrid.okhttp.EnumC13787w;
import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import com.mbridge.msdk.thrid.okhttp.internal.tls.AbstractC13771c;
import com.mbridge.msdk.thrid.okhttp.internal.tls.InterfaceC13773e;
import com.unity3d.services.core.fid.Constants;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.platform.b */
/* JADX INFO: compiled from: AndroidPlatform.java */
/* JADX INFO: loaded from: classes7.dex */
class C13762b extends C13767g {

    /* JADX INFO: renamed from: c */
    private final Class<?> f39091c;

    /* JADX INFO: renamed from: d */
    private final C13766f<Socket> f39092d;

    /* JADX INFO: renamed from: e */
    private final C13766f<Socket> f39093e;

    /* JADX INFO: renamed from: f */
    private final C13766f<Socket> f39094f;

    /* JADX INFO: renamed from: g */
    private final C13766f<Socket> f39095g;

    /* JADX INFO: renamed from: h */
    private final c f39096h = c.m40614a();

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.platform.b$a */
    /* JADX INFO: compiled from: AndroidPlatform.java */
    static final class a extends AbstractC13771c {

        /* JADX INFO: renamed from: a */
        private final Object f39097a;

        /* JADX INFO: renamed from: b */
        private final Method f39098b;

        a(Object obj, Method method) {
            this.f39097a = obj;
            this.f39098b = method;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.tls.AbstractC13771c
        /* JADX INFO: renamed from: a */
        public List<Certificate> mo40612a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.f39098b.invoke(this.f39097a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
                sSLPeerUnverifiedException.initCause(e2);
                throw sSLPeerUnverifiedException;
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.platform.b$b */
    /* JADX INFO: compiled from: AndroidPlatform.java */
    static final class b implements InterfaceC13773e {

        /* JADX INFO: renamed from: a */
        private final X509TrustManager f39099a;

        /* JADX INFO: renamed from: b */
        private final Method f39100b;

        b(X509TrustManager x509TrustManager, Method method) {
            this.f39100b = method;
            this.f39099a = x509TrustManager;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.tls.InterfaceC13773e
        /* JADX INFO: renamed from: a */
        public X509Certificate mo40613a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f39100b.invoke(this.f39099a, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
            } catch (IllegalAccessException e) {
                throw C13723c.m40269a("unable to get issues and signature", (Exception) e);
            } catch (InvocationTargetException unused) {
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f39099a.equals(bVar.f39099a) && this.f39100b.equals(bVar.f39100b);
        }

        public int hashCode() {
            return this.f39099a.hashCode() + (this.f39100b.hashCode() * 31);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.platform.b$c */
    /* JADX INFO: compiled from: AndroidPlatform.java */
    static final class c {

        /* JADX INFO: renamed from: a */
        private final Method f39101a;

        /* JADX INFO: renamed from: b */
        private final Method f39102b;

        /* JADX INFO: renamed from: c */
        private final Method f39103c;

        c(Method method, Method method2, Method method3) {
            this.f39101a = method;
            this.f39102b = method2;
            this.f39103c = method3;
        }

        /* JADX INFO: renamed from: a */
        static c m40614a() throws NoSuchMethodException {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", null);
                method2 = cls.getMethod("open", String.class);
                method = cls.getMethod("warnIfOpen", null);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new c(method3, method2, method);
        }

        /* JADX INFO: renamed from: a */
        Object m40615a(String str) {
            Method method = this.f39101a;
            if (method != null) {
                try {
                    Object objInvoke = method.invoke(null, null);
                    this.f39102b.invoke(objInvoke, str);
                    return objInvoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: a */
        boolean m40616a(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.f39103c.invoke(obj, null);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    C13762b(Class<?> cls, C13766f<Socket> c13766f, C13766f<Socket> c13766f2, C13766f<Socket> c13766f3, C13766f<Socket> c13766f4) {
        this.f39091c = cls;
        this.f39092d = c13766f;
        this.f39093e = c13766f2;
        this.f39094f = c13766f3;
        this.f39095g = c13766f4;
    }

    /* JADX INFO: renamed from: a */
    private boolean m40599a(String str, Class<?> cls, Object obj) throws IllegalAccessException, InvocationTargetException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", null).invoke(obj, null)).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.mo40610b(str);
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m40600b(String str, Class<?> cls, Object obj) throws IllegalAccessException, InvocationTargetException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            return m40599a(str, cls, obj);
        }
    }

    /* JADX INFO: renamed from: h */
    public static C13767g m40601h() {
        Class<?> cls;
        C13766f c13766f;
        C13766f c13766f2;
        if (!C13767g.m40636f()) {
            return null;
        }
        try {
            try {
                cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            } catch (ClassNotFoundException unused) {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            }
            Class<?> cls2 = cls;
            C13766f c13766f3 = new C13766f(null, "setUseSessionTickets", Boolean.TYPE);
            C13766f c13766f4 = new C13766f(null, "setHostname", String.class);
            if (m40603j()) {
                C13766f c13766f5 = new C13766f(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
                c13766f2 = new C13766f(null, "setAlpnProtocols", byte[].class);
                c13766f = c13766f5;
            } else {
                c13766f = null;
                c13766f2 = null;
            }
            return new C13762b(cls2, c13766f3, c13766f4, c13766f, c13766f2);
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    static int m40602i() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: j */
    private static boolean m40603j() {
        if (Security.getProvider("GMSCore_OpenSSL") != null) {
            return true;
        }
        try {
            Class.forName("android.net.Network");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.C13767g
    /* JADX INFO: renamed from: a */
    public AbstractC13771c mo40604a(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.mo40604a(x509TrustManager);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.C13767g
    /* JADX INFO: renamed from: a */
    public Object mo40605a(String str) {
        return this.f39096h.m40615a(str);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.C13767g
    /* JADX INFO: renamed from: a */
    public void mo40606a(int i, String str, @Nullable Throwable th) {
        int iMin;
        int i2 = i != 5 ? 3 : 5;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            int iIndexOf = str.indexOf(10, i3);
            if (iIndexOf == -1) {
                iIndexOf = length;
            }
            while (true) {
                iMin = Math.min(iIndexOf, i3 + 4000);
                Log.println(i2, "OkHttp", str.substring(i3, iMin));
                if (iMin >= iIndexOf) {
                    break;
                } else {
                    i3 = iMin;
                }
            }
            i3 = iMin + 1;
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.C13767g
    /* JADX INFO: renamed from: a */
    public void mo40607a(String str, Object obj) {
        if (this.f39096h.m40616a(obj)) {
            return;
        }
        mo40606a(5, str, (Throwable) null);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.C13767g
    /* JADX INFO: renamed from: a */
    public void mo40608a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (!C13723c.m40286a(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e2);
            throw iOException;
        } catch (SecurityException e3) {
            IOException iOException2 = new IOException("Exception in connect");
            iOException2.initCause(e3);
            throw iOException2;
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.C13767g
    /* JADX INFO: renamed from: a */
    public void mo40597a(SSLSocket sSLSocket, String str, List<EnumC13787w> list) throws IOException {
        if (str != null) {
            this.f39092d.m40628c(sSLSocket, Boolean.TRUE);
            this.f39093e.m40628c(sSLSocket, str);
        }
        C13766f<Socket> c13766f = this.f39095g;
        if (c13766f == null || !c13766f.m40626a(sSLSocket)) {
            return;
        }
        this.f39095g.m40629d(sSLSocket, C13767g.m40633b(list));
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.C13767g
    /* JADX INFO: renamed from: b */
    public InterfaceC13773e mo40609b(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo40609b(x509TrustManager);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.C13767g
    @Nullable
    /* JADX INFO: renamed from: b */
    public String mo40598b(SSLSocket sSLSocket) {
        byte[] bArr;
        C13766f<Socket> c13766f = this.f39094f;
        if (c13766f == null || !c13766f.m40626a(sSLSocket) || (bArr = (byte[]) this.f39094f.m40629d(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, C13723c.f38780j);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.C13767g
    /* JADX INFO: renamed from: b */
    public boolean mo40610b(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return m40600b(str, cls, cls.getMethod(Constants.GET_INSTANCE, null).invoke(null, null));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.mo40610b(str);
        } catch (IllegalAccessException e) {
            e = e;
            throw C13723c.m40269a("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw C13723c.m40269a("unable to determine cleartext support", e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw C13723c.m40269a("unable to determine cleartext support", e);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.C13767g
    /* JADX INFO: renamed from: e */
    public SSLContext mo40611e() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }
}

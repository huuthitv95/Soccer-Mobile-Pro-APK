package com.mbridge.msdk.thrid.okhttp.internal.platform;

import com.mbridge.msdk.thrid.okhttp.C13786v;
import com.mbridge.msdk.thrid.okhttp.EnumC13787w;
import com.mbridge.msdk.thrid.okhttp.internal.tls.AbstractC13771c;
import com.mbridge.msdk.thrid.okhttp.internal.tls.C13769a;
import com.mbridge.msdk.thrid.okhttp.internal.tls.C13770b;
import com.mbridge.msdk.thrid.okhttp.internal.tls.InterfaceC13773e;
import com.mbridge.msdk.thrid.okio.C13793c;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.platform.g */
/* JADX INFO: compiled from: Platform.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13767g {

    /* JADX INFO: renamed from: a */
    private static final C13767g f39117a = m40634c();

    /* JADX INFO: renamed from: b */
    private static final Logger f39118b = Logger.getLogger(C13786v.class.getName());

    /* JADX INFO: renamed from: a */
    private static C13767g m40630a() {
        C13767g c13767gM40596h = C13761a.m40596h();
        if (c13767gM40596h != null) {
            return c13767gM40596h;
        }
        C13767g c13767gM40601h = C13762b.m40601h();
        if (c13767gM40601h != null) {
            return c13767gM40601h;
        }
        throw new NullPointerException("No platform found on Android");
    }

    /* JADX INFO: renamed from: a */
    public static List<String> m40631a(List<EnumC13787w> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EnumC13787w enumC13787w = list.get(i);
            if (enumC13787w != EnumC13787w.HTTP_1_0) {
                arrayList.add(enumC13787w.toString());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    private static C13767g m40632b() {
        C13763c c13763cM40617h;
        if (m40637g() && (c13763cM40617h = C13763c.m40617h()) != null) {
            return c13763cM40617h;
        }
        C13764d c13764dM40620h = C13764d.m40620h();
        if (c13764dM40620h != null) {
            return c13764dM40620h;
        }
        C13767g c13767gM40621h = C13765e.m40621h();
        return c13767gM40621h != null ? c13767gM40621h : new C13767g();
    }

    /* JADX INFO: renamed from: b */
    static byte[] m40633b(List<EnumC13787w> list) {
        C13793c c13793c = new C13793c();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EnumC13787w enumC13787w = list.get(i);
            if (enumC13787w != EnumC13787w.HTTP_1_0) {
                c13793c.writeByte(enumC13787w.toString().length());
                c13793c.mo40873a(enumC13787w.toString());
            }
        }
        return c13793c.m40902n();
    }

    /* JADX INFO: renamed from: c */
    private static C13767g m40634c() {
        return m40636f() ? m40630a() : m40632b();
    }

    /* JADX INFO: renamed from: d */
    public static C13767g m40635d() {
        return f39117a;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m40636f() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m40637g() {
        if ("conscrypt".equals(System.getProperty("okhttp.platform"))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    /* JADX INFO: renamed from: a */
    public AbstractC13771c mo40604a(X509TrustManager x509TrustManager) {
        return new C13769a(mo40609b(x509TrustManager));
    }

    /* JADX INFO: renamed from: a */
    public Object mo40605a(String str) {
        if (f39118b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void mo40606a(int i, String str, @Nullable Throwable th) {
        f39118b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* JADX INFO: renamed from: a */
    public void mo40607a(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        mo40606a(5, str, (Throwable) obj);
    }

    /* JADX INFO: renamed from: a */
    public void mo40608a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    /* JADX INFO: renamed from: a */
    public void mo40622a(SSLSocket sSLSocket) {
    }

    /* JADX INFO: renamed from: a */
    public void mo40597a(SSLSocket sSLSocket, @Nullable String str, List<EnumC13787w> list) throws IOException {
    }

    /* JADX INFO: renamed from: a */
    public void mo40619a(SSLSocketFactory sSLSocketFactory) {
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC13773e mo40609b(X509TrustManager x509TrustManager) {
        return new C13770b(x509TrustManager.getAcceptedIssuers());
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public String mo40598b(SSLSocket sSLSocket) {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo40610b(String str) {
        return true;
    }

    /* JADX INFO: renamed from: e */
    public SSLContext mo40611e() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
